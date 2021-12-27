CREATE TABLE USER (
	user_id BIGINT,
	username VARCHAR(50),
	password VARCHAR(100),
	nickname VARCHAR(50),
	activated BOOLEAN
);

CREATE TABLE AUTHORITY (
	authority_name VARCHAR(20)
);

CREATE TABLE USER_AUTHORITY (
	USER_ID BIGINT,
	authority_name VARCHAR(20)
);