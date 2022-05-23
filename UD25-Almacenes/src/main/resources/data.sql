
DROP TABLE IF EXISTS cajas;
DROP table IF EXISTS almacen;


CREATE TABLE almacen (
  id int NOT NULL AUTO_INCREMENT,
  lugar varchar(250) DEFAULT NULL,
  capacidad int(4) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE cajas (
  id int NOT NULL AUTO_INCREMENT,
  contenido varchar(250) DEFAULT NULL,
  valor int(4) DEFAULT NULL,
  id_almacen int DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT almacen_fk FOREIGN KEY (id_almacen) REFERENCES almacen (id)
);


insert into almacen (lugar, capacidad) values ('Barcelona',24);
insert into almacen (lugar, capacidad) values ('Málaga',10);
insert into almacen (lugar, capacidad) values ('Madrid',2);
insert into almacen (lugar, capacidad) values ('San Sebastian',7);
insert into almacen (lugar, capacidad) values ('Zaragoza',12);


insert into cajas (contenido, valor, id_almacen) values ('Vino',25,1);
insert into cajas (contenido, valor, id_almacen) values ('Carne',12,2);
insert into cajas (contenido, valor, id_almacen) values ('Harina',5,3);
insert into cajas (contenido, valor, id_almacen) values ('Legumbres',50,2);