CREATE TABLE employees(
   id BIGINT GENERATED ALWAYS AS IDENTITY,
   first_name VARCHAR(255),
   last_name VARCHAR(255),
   age INT,
   PRIMARY KEY(id)
);

CREATE TABLE phone_types(
   id BIGINT GENERATED ALWAYS AS IDENTITY,
   type VARCHAR(16),
   description VARCHAR(1024),
   PRIMARY KEY(id)
);

CREATE TABLE phones(
   id INT GENERATED ALWAYS AS IDENTITY,
   phone_number VARCHAR(32),
   employee_id BIGINT,
   type_id BIGINT,
   PRIMARY KEY(id),
   CONSTRAINT fk_employee
      FOREIGN KEY(employee_id)
	  REFERENCES employees(id),
   CONSTRAINT fk_type
      FOREIGN KEY(type_id)
      REFERENCES phone_types(id)
);