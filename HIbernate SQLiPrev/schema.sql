CREATE TABLE login_info(
   id int(100) PRIMARY KEY,
   user_name varchar(20) not null UNIQUE KEY
   password varchar(20) not null
);