--liquibase formatted sql
--changeset holovetskyi:2

alter table product add image varchar(128) after currency;