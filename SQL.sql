SELECT * FROM Names;

/* INSERT */
INSERT INTO Names VALUES ('Shobha', 'Chaudhary', 18, 'shobha@gmail.com','BTECH', 98766789, 'Miss');

/* UPDATE */
UPDATE Names SET FirstName = 'Bhoomi' WHERE Email = 'radha@gmail.com';

/* ALTER */
ALTER TABLE Names ADD AddressDetails VARCHAR(40);

/* DELETE */
DELETE FROM Names WHERE FirstName = 'Hemant' AND SecondName = 'Kumar';

/* DROP */
DROP TABLE Names;


CREATE TABLE Names 
(

	ID INT IDENTITY(1,1),
	FirstName VARCHAR(30),
	SecondName VARCHAR(30),
	Age INT,
	Email VARCHAR(50),
	Degree VARCHAR(30),
	Phone INT,
	Salutation VARCHAR(30)

)

INSERT INTO Names VALUES ('Jatin', 'Yadav', 21, 'jatin@gmail.com', 'BTECH', 12346789, 'Mr');
INSERT INTO Names VALUES ('Neha', 'Chaudhary', 21, 'neha@gmail.com', 'BTECH', 98764321, 'Miss');
INSERT INTO Names VALUES ('Shobha', 'Chaudhary', 18, 'shobha@gmail.com', 'MSC', 12344321, 'Miss');
INSERT INTO Names VALUES ('Bhoomi', 'Chaudhary', 15, 'bhoomi@gmail.com', 'MTECH', 12346789, 'Miss');
INSERT INTO Names VALUES ('Hemant', 'Kumar', 23, 'hemant@gmail.com', 'BTECH', 98766789, 'Mr');
INSERT INTO Names VALUES ('Nishant', 'Kapoor', 22, 'nishant@gmail.com', 'BTECH', 65433456, 'Mr');
