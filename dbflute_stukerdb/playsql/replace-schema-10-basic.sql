

/* Create Tables */

create table user (
    user_id           int unsigned not null auto_increment,
    user_name         varchar(50) not null,
    uid               varchar(255) not null,
    authority         varchar(50) not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (user_id),
    unique (uid)
);

create table twitter_user (
	twitter_user_id   int unsigned not null auto_increment,
	user_id           int unsigned not null,
	twitter_id        varchar(255) not null,
	screen_name       varchar(255) not null,
	access_token      varchar(255) not null,
	token_secret      varchar(255) not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
	primary key (twitter_user_id),
	unique (user_id)
);

alter table twitter_user
    add constraint fk_twitter_user_user foreign key (user_id)
    references user (user_id)
    on update restrict
    on delete restrict
;

create table rule_book (
    rule_book_id      int unsigned not null auto_increment,
    rule_book_name    varchar(255) not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (rule_book_id)
);

create table rule_book_dictionary (
    rule_book_dictionary_id int unsigned not null auto_increment,
    rule_book_id            int unsigned,
    rule_book_name          varchar(255) not null,
    register_datetime       datetime not null,
    register_trace          varchar(64) not null,
    update_datetime         datetime not null,
    update_trace            varchar(64) not null,
    primary key (rule_book_dictionary_id)
);

alter table rule_book_dictionary
    add constraint fk_rule_book_dictionary_rule_book foreign key (rule_book_id)
    references rule_book (rule_book_id)
    on update restrict
    on delete restrict
;

create table scenario (
    scenario_id       int unsigned not null auto_increment,
    scenario_name     varchar(255) not null,
    scenario_type     varchar(50) not null,
    scenario_url      varchar(255),
    rule_book_id      int unsigned,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (scenario_id)
);

alter table scenario
    add constraint fk_scenario_rule_book foreign key (rule_book_id)
    references rule_book (rule_book_id)
    on update restrict
    on delete restrict
;

create table author (
	author_id         int unsigned not null auto_increment,
	author_name       varchar(100) not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (author_id)
);

create table scenario_author (
	scenario_author_id int unsigned not null auto_increment,
	scenario_id        int unsigned not null,
	author_id          int unsigned not null,
    register_datetime  datetime not null,
    register_trace     varchar(64) not null,
    update_datetime    datetime not null,
    update_trace       varchar(64) not null,
    primary key (scenario_author_id),
    unique (scenario_id, author_id)
);

alter table scenario_author
    add constraint fk_scenario_author_scenario foreign key (scenario_id)
    references scenario (scenario_id)
    on update restrict
    on delete restrict
;

alter table scenario_author
    add constraint fk_scenario_author_author foreign key (author_id)
    references author (author_id)
    on update restrict
    on delete restrict
;

create table scenario_dictionary (
    scenario_dictionary_id int unsigned not null auto_increment,
    scenario_id            int unsigned not null,
    scenario_name          varchar(255) not null,
    register_datetime      datetime not null,
    register_trace         varchar(64) not null,
    update_datetime        datetime not null,
    update_trace           varchar(64) not null,
    primary key (scenario_dictionary_id)
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
    disp_order        int unsigned not null,
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

create table participate_impression (
	participate_impression_id int unsigned not null auto_increment,
	participate_id            int unsigned not null,
	has_spoiler               boolean not null,
	disclosure_range          varchar(50) not null,
	impression                text not null,
	register_datetime         datetime not null,
	register_trace            varchar(64) not null,
	update_datetime           datetime not null,
	update_trace              varchar(64) not null,
	primary key (participate_impression_id),
	unique (participate_id)
);

alter table participate_impression
    add constraint fk_participate_impression_participate foreign key (participate_id)
    references participate (participate_id)
    on update restrict
    on delete restrict
;