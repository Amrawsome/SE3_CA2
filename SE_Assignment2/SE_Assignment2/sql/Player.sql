DROP TABLE player;
DROP TABLE SQUAD;
CREATE TABLE player (
  ID int(11)NOT NULL AUTO_INCREMENT,
  FIRST_NAME varchar(50)NOT NULL,
  LAST_NAME varchar(50)NOT NULL,
  DOB varchar(20)NOT NULL,
  EMAIL varchar(50)NOT NULL,
  ContactNO varchar(30)NOT NULL,
  player_squadID int,
  PRIMARY KEY(ID),
  FOREIGN KEY (player_squadID) REFERENCES SQUAD(squadid)
  );
  
select * from player;
 
CREATE TABLE SQUAD (
	squadID int NOT NULL AUTO_INCREMENT,
	squadName VARCHAR(50) NOT NULL,
	PRIMARY KEY(squadID)
	);
	
INSERT INTO SQUAD (squadID,squadName)VALUES(1,'HANGERS');
INSERT INTO SQUAD (squadID,squadName)VALUES(2,'MINMAX');
INSERT INTO SQUAD (squadID,squadName)VALUES(3,'JACKERS');
 
select * from SQUAD;

select * from USER;