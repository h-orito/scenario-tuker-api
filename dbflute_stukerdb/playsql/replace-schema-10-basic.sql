

/* Create Tables */

create table user (
    user_id           int unsigned not null auto_increment,
    user_name         varchar(50) not null,
    twitter_user_name varchar(50),
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (user_id)
);

create table scenario (
    scenario_id       int unsigned not null auto_increment,
    scenario_name     varchar(255) not null,
    scenario_type     varchar(50) not null,
    scenario_link     varchar(255) not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (scenario_id)
);

create table scenario_dictionary (
    scenario_detail_id int unsigned not null auto_increment,
    scenario_id        int unsigned not null,
    scenario_name      varchar(255) not null,
    register_datetime  datetime not null,
    register_trace     varchar(64) not null,
    update_datetime    datetime not null,
    update_trace       varchar(64) not null,
    primary key (scenario_detail_id)
);

alter table scenario_dictionary
    add constraint fk_scenario_dictionary_scenario foreign key (scenario_id)
    references scenario (scenario_id)
    on update restrict
    on delete restrict
;

create table participate (
    participate_id    int unsigned not null auto_increment,
    scenario_id       int unsigned not null,
    user_id           int unsigned not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (participate_id),
    unique (scenario_id, user_id)
);

alter table participate
    add constraint fk_participate_scenario foreign key (scenario_id)
    references scenario (scenario_id)
    on update restrict
    on delete restrict
;

alter table participate
    add constraint fk_participate_user foreign key (user_id)
    references user (user_id)
    on update restrict
    on delete restrict
;

create table participate_role (
    participate_role_id   int unsigned not null auto_increment,
    participate_id        int unsigned not null,
    participate_role_type varchar(50) not null,
    register_datetime     datetime not null,
    register_trace        varchar(64) not null,
    update_datetime       datetime not null,
    update_trace          varchar(64) not null,
    primary key (participate_role_id)
);

alter table participate_role
    add constraint fk_participate_role_participate foreign key (participate_id)
    references participate (participate_id)
    on update restrict
    on delete restrict
;