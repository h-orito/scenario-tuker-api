import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.7.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
    id("com.google.cloud.tools.jib") version "2.6.0"
}

group = "dev.wolfort"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

apply(plugin = "kotlin")
apply(plugin = "io.spring.dependency-management")

repositories {
    mavenCentral()
}

sourceSets {
    getByName("main").java.srcDirs("src/main/kotlin")
    getByName("test").java.srcDirs("src/test")
    getByName("main").resources.srcDirs("src/main/resources")
    getByName("test").resources.srcDirs("src/test/resources")
}

dependencies {
    // kotlin
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    // spring
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-aop")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    // dbflute
    implementation("org.springframework.boot:spring-boot-starter-data-jpa") {
        exclude("com.zaxxer:HikariCP")
    }
    implementation("org.apache.tomcat:tomcat-jdbc:9.0.10")
    implementation("org.dbflute:dbflute-runtime:1.2.1")
    // mysql
    implementation("mysql:mysql-connector-java:8.0.25")
    // jwt
    implementation("io.jsonwebtoken:jjwt-api:0.10.7")
    implementation("io.jsonwebtoken:jjwt-impl:0.10.7")
    implementation("io.jsonwebtoken:jjwt-jackson:0.10.7")
    implementation("com.google.firebase:firebase-admin:6.8.1")
    // mockito
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.1.0")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Copy> {
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}

tasks.withType<Test> {
    useJUnitPlatform()
}

jib {
    from {
        image = "arm64v8/openjdk:8"
        platforms {
            platform {
                architecture = "arm64"
                os = "linux"
            }
        }
    }
    to {
        image = "ghcr.io/h-orito/scenario-tuker-api"
    }
    container {
        jvmFlags = listOf(
            "-server",
            "-Djava.awt.headless=true",
            "-Dspring.profiles.active=production"
        )
        creationTime = "USE_CURRENT_TIMESTAMP"
    }
}
