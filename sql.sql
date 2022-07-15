CREATE TABLE teachers(
    FirstName varchar(255),
    LastName varchar(255),
  	Sex varchar(255),
    Class int
);
create table pupils(
	FirstName varchar(255),
    LastName varchar(255),
  	Sex varchar(255),
    Class int
);

CREATE table teachersAndPupils(
	 TeachersFirstName varchar(255),
  	 PupilsFirstName varchar(255) 
);
SELECT  TeachersFirstName
from teachersAndPupils
where PupilsFirstName='Giorgi';
