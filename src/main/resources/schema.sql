CREATE TABLE country (
                         id   INTEGER      NOT NULL AUTO_INCREMENT,
                         name VARCHAR(128) NOT NULL,
                         PRIMARY KEY (id)
);

CREATE TABLE  visits (
                          TravelerID   INTEGER      NOT NULL AUTO_INCREMENT,
                          VisitID VARCHAR(128) NOT NULL,
                          StartDate DATE,
                          EndDate DATE,
                          Country VARCHAR(128) NOT NULL,
                          Transport VARCHAR(128),
                         PRIMARY KEY (TravelerID)
);
