BEGIN;

CREATE TABLE `Address` (
    `addressID`       int(11)     NOT NULL   auto_increment,
    `streetNumber`   varchar(50) NOT NULL   default '',
    `buildingName`   varchar(50)  NULL   default '',
    `streetNumberSuffix`   varchar(50)  NULL   default '',
    `streetName`   varchar(50) NOT NULL   default '',
    `streetType`   varchar(50)  NULL   default '',
    `streetDirection`   varchar(50)  NULL   default '',
    `addressType`   varchar(50)  NULL   default '',
    `addressTypeNumber`   varchar(50)  NULL   default '',
    `localMunicipality`   varchar(50)  NULL   default '',
    `city`   varchar(50) NOT NULL   default '',
    `district`   varchar(50) NOT NULL   default '',
    `postalArea`   varchar(50) NOT NULL   default '',
    `country`   varchar(50) NOT NULL   default '',
    PRIMARY KEY (`addressID`)
);

COMMIT;


