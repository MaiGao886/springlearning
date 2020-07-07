create table t_group
(
    id          int auto_increment comment '自增主键'
        primary key,
    group_name  varchar(50)  not null comment '组名',
    create_time datetime     not null comment '创建时间',
    description varchar(500) null comment '描述',
    constraint t_group_group_name_uindex
        unique (group_name)
)
    comment '组';

create table t_organization
(
    id          int auto_increment comment '自增主键'
        primary key,
    name        varchar(50)  not null comment '组织名称',
    parent_id   int          null comment '父组织',
    create_time datetime     not null comment '创建时间',
    description varchar(500) null comment '描述',
    constraint t_organization_name_uindex
        unique (name)
)
    comment '组织表';

create table t_permission
(
    id              int auto_increment comment '自增主键'
        primary key,
    permission_name varchar(50)  not null comment '权限名称',
    description     varchar(500) null comment '描述',
    constraint t_permission_permission_name_uindex
        unique (permission_name)
)
    comment '权限表';

create table t_group_permission
(
    id              int auto_increment comment '自增主键'
        primary key,
    group_id        int           not null comment '组id',
    permission_id   int           not null comment '权限id',
    permission_type int default 0 not null comment '权限类型',
    constraint t_group_permission_t_group_id_fk
        foreign key (group_id) references t_group (id),
    constraint t_group_permission_t_permission_id_fk
        foreign key (permission_id) references t_permission (id)
)
    comment '组权限关系表';

create table t_role
(
    id          int auto_increment comment '自增主键'
        primary key,
    parent_id   int          null comment '父角色',
    role_name   varchar(50)  not null comment '角色名称',
    create_time datetime     not null comment '创建时间',
    description varchar(500) null comment '描述',
    constraint t_role_role_name_uindex
        unique (role_name)
)
    comment '角色表';

create table t_group_role
(
    id       int auto_increment comment '自增主键'
        primary key,
    group_id int not null comment '组id',
    role_id  int not null comment '角色id',
    constraint t_group_role_t_group_id_fk
        foreign key (group_id) references t_group (id),
    constraint t_group_role_t_role_id_fk
        foreign key (role_id) references t_role (id)
)
    comment '组角色关系表';

create table t_role_permission
(
    id              int auto_increment comment '自增主键'
        primary key,
    role_id         int           not null comment '角色id',
    permission_id   int           not null comment '权限id',
    permission_type int default 0 not null comment '权限类型',
    constraint t_role_permission_t_permission_id_fk
        foreign key (permission_id) references t_permission (id),
    constraint t_role_permission_t_role_id_fk
        foreign key (role_id) references t_role (id)
)
    comment '角色权限关系表';

create table t_user
(
    id              int auto_increment comment '自增主键'
        primary key,
    username        varchar(50)   not null comment '用户名',
    password        varchar(50)   not null comment '密码',
    nickname        varchar(50)   null comment '昵称',
    mail            varchar(50)   null comment '邮箱',
    addr            varchar(255)  null comment '住址',
    age             int           null comment '年龄',
    sex             int default 0 not null comment '性别0未知1男2女',
    mobile          varchar(50)   null comment '手机号',
    create_time     datetime      null comment '创建时间',
    login_time      datetime      null comment '登录时间',
    last_login_time datetime      null comment '上次登录时间',
    login_count     int default 0 not null comment '登录次数',
    organization_id int           not null comment '所属组织'
)
    comment '用户表';

create table t_log
(
    id       int auto_increment
        primary key,
    log_type int          not null comment '操作类型',
    content  varchar(255) not null comment '操作内容
',
    time     datetime     not null comment '操作时间',
    user_id  int          not null,
    constraint t_log_t_user_id_fk
        foreign key (user_id) references t_user (id)
)
    comment '操作日志表';

create table t_user_group
(
    id       int auto_increment comment '自增主键'
        primary key,
    user_id  int not null comment '用户id',
    group_id int not null comment '组id',
    constraint t_user_group_t_group_id_fk
        foreign key (group_id) references t_group (id),
    constraint t_user_group_t_user_id_fk
        foreign key (user_id) references t_user (id)
)
    comment '用户组关系表';

create table t_user_permission
(
    id              int auto_increment comment '自增主键'
        primary key,
    user_id         int           not null comment '用户id',
    permission_id   int           not null comment '权限id',
    permission_type int default 0 not null comment '权限类型',
    constraint t_user_permission_t_permission_id_fk
        foreign key (permission_id) references t_permission (id),
    constraint t_user_permission_t_user_id_fk
        foreign key (user_id) references t_user (id)
)
    comment '用户权限关系表';

create table t_user_role
(
    id      int auto_increment comment '自增主键'
        primary key,
    user_id int not null comment '用户id',
    role_id int not null comment '角色id',
    constraint t_user_role_t_role_id_fk
        foreign key (role_id) references t_role (id),
    constraint t_user_role_t_user_id_fk
        foreign key (user_id) references t_user (id)
)
    comment '用户角色关系表';


