CREATE TABLE GOODS
(
    ID               BIGSERIAL      NOT NULL PRIMARY KEY,
    TITLE            VARCHAR(255)   NOT NULL,
    COST             DECIMAL(10, 2) NOT NULL,

    UNIQUE (TITLE)
);


