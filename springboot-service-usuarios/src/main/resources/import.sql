INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('carloss','12345',1,'Carlos','Marroquin','carlosmn@uanl.com')
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('mauriciooo','12345',1,'Mauricio','Marroquin','mauriciomn@uanl.com')

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES (1,1);
INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES (2,2);
INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES (2,1);