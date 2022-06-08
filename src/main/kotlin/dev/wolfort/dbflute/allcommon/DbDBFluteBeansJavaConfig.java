package dev.wolfort.dbflute.allcommon;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.core.InvokerAssistant;

/**
 * The Java configuration of DBFlute beans for Spring Framework. <br>
 * You can inject them by importing this class in your auto configuration class.
 * @author DBFlute(AutoGenerator)
 */
@Configuration
@ComponentScan(value="dev.wolfort.dbflute.exbhv", lazyInit=true)
public class DbDBFluteBeansJavaConfig {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Autowired
    protected ApplicationContext _container;

    @Autowired
    @Qualifier("dataSource")
    protected DataSource _dataSource; // name basis here for multiple DB

    // ===================================================================================
    //                                                                   Runtime Component
    //                                                                   =================
    @Bean(name="dbIntroduction")
    public DbDBFluteInitializer createDBFluteInitializer() { // no lazy for initialize-only component
        return new dev.wolfort.dbflute.allcommon.DbDBFluteInitializer(_dataSource);
    }

    @Bean(name="dbInvokerAssistant")
    @Lazy
    public InvokerAssistant createImplementedInvokerAssistant() {
        DbImplementedInvokerAssistant assistant = newImplementedInvokerAssistant();
        assistant.setDataSource(_dataSource);
        return assistant;
    }

    protected DbImplementedInvokerAssistant newImplementedInvokerAssistant() {
        return new dev.wolfort.dbflute.allcommon.DbImplementedInvokerAssistant();
    }

    @Bean(name="dbBehaviorCommandInvoker")
    @Lazy
    public BehaviorCommandInvoker createBehaviorCommandInvoker() {
        BehaviorCommandInvoker invoker = newBehaviorCommandInvoker();
        invoker.setInvokerAssistant(createImplementedInvokerAssistant());
        return invoker;
    }

    protected BehaviorCommandInvoker newBehaviorCommandInvoker() {
        return new BehaviorCommandInvoker();
    }

    @Bean(name="dbBehaviorSelector")
    @Lazy
    public DbImplementedBehaviorSelector createImplementedBehaviorSelector() {
        DbImplementedBehaviorSelector selector = newImplementedBehaviorSelector();
        selector.setContainer(_container);
        return selector;
    }

    protected DbImplementedBehaviorSelector newImplementedBehaviorSelector() {
        return new DbImplementedBehaviorSelector();
    }

    @Bean(name="dbCommonColumnAutoSetupper")
    @Lazy
    public DbImplementedCommonColumnAutoSetupper createImplementedCommonColumnAutoSetupper() {
        return newImplementedCommonColumnAutoSetupper();
    }

    protected DbImplementedCommonColumnAutoSetupper newImplementedCommonColumnAutoSetupper() {
        return new DbImplementedCommonColumnAutoSetupper();
    }
}
