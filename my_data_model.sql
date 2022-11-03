create user 'usrjordan'@'localhost' identified by 'pswJordan';

grant all privileges on *.* to 'usrjordan'@'localhost';

create table usuario(
	id int not null auto_increment,
    nombre varchar(120) not null unique,
    correo varchar(255) default 'test@test.com',
    contraseña varchar(255) not null,
    primary key (id)
)engine = InnoDB;

create table publicador (
	id int not null auto_increment,
	nombre varchar(120) not null unique,
	fecha_inicio date not null,
    grupo int not null default 0,
    fecha_bautismo date,
	precursor_auxiliar bool default false,
    precursor_regular bool default false,
    ppoc_ bool default false,
	foreign key (nombre) references usuarios(nombre),
    primary key (id)
) engine = InnoDB;


create table precursor(
	id int not null auto_increment,
    nombre varchar(120) not null unique,
    fecha_inicio date not null,
    continuo bool default true,
    ultima_escuela varchar(5) default 0,
    foreign key (nombre) references usuarios(nombre),
    primary key(id)
) engine = InnoDB;

create table ministerial(
	id int not null auto_increment,
    nombre varchar(120) not null unique,
    fecha_inicio date not null,
    auxilar_grupo int default 0,
    foreign key (nombre) references usuarios (nombre),
    primary key (id)
) engine = InnoDB;

create table anciano(
	id int not null auto_increment,
    nombre varchar(120) not null unique,
    fecha_incio date not null,
    grupo int default 0,
    responsabilidad enum('escuela','secretario','predicacion','coordinacion','otros') default 'otros',
    foreign key (nombre) references usuarios(nombre), 
    primary key (id)
)engine = InnoDB;

create table escuela(
	id int not null auto_increment,
    nombre varchar(120) not null unique,
    lectura bool not null,
    conversacion bool not null,
    discurso bool not null,
    preferencia_conv bool not null,
    preferencia_baja bool not null,
    foreign key (nombre) references usuarios(nombre),
    primary key (id)
) engine = InnoDB;

insert into usuario (nombre, correo, contraseña) values ('Jordan Fernando Bailon Cercado','jordanbailonc@gmail.com','alumnedam');
insert into usuario (nombre, correo, contraseña) values ('Astrid Belen Bailon Cercado','','test');
insert into usuario (nombre, correo, contraseña) values ('Johnny Briones','','test');
insert into usuario (nombre, correo, contraseña) values ('Maritza Erazo de Briones','','test');
insert into usuario (nombre, correo, contraseña) values ('Bryan Briones Erazo', '','test');
insert into usuario (nombre, correo, contraseña) values ('Johnny Fernando Bailon Garcia', '','test');
insert into usuario (nombre, correo, contraseña) values ('Martha Leonor Cercado Molina de Bailon', '','test');
insert into usuario (nombre, correo, contraseña) values ('Lisbeth del Rocio Bailon Cercado', '','test');
insert into usuario (nombre, correo, contraseña) values ('Jesús Moya Magaña', '','test');
insert into usuario (nombre, correo, contraseña) values ('Veronica Agüero de Moya', '','test');
insert into usuario (nombre, correo, contraseña) values ('Gustavo Caguana Quinchiguango', '','test');
insert into usuario (nombre, correo, contraseña) values ('Erica Gimenez de Caguana', '','test');
insert into usuario (nombre, correo, contraseña) values ('Eric Caguana Gimenez', '','test');
insert into usuario (nombre, correo, contraseña) values ('Germán Fuente', '','test');
insert into usuario (nombre, correo, contraseña) values ('Pilar de Fuente', '','test');
insert into usuario (nombre, correo, contraseña) values ('Natanael Rodriguez Risueño', '','test');
insert into usuario (nombre, correo, contraseña) values ('Rosemary Ortega de Rodriguez', '','test');
insert into usuario (nombre, correo, contraseña) values ('Francisco Silvent', '','test');
insert into usuario (nombre, correo, contraseña) values ('Susana Alemany de Silvent', '','test');
insert into usuario (nombre, correo, contraseña) values ('Pepi Alemany', '','test');
insert into usuario (nombre, correo, contraseña) values ('Sergio Silvent Alemany', '','test');
insert into usuario (nombre, correo, contraseña) values ('Juan Muñoz Pineda', '','test');
insert into usuario (nombre, correo, contraseña) values ('Maria Dolores Gutierrez de Muñoz', '','test');
insert into usuario (nombre, correo, contraseña) values ('Sergio Rodriguez', '','test');
insert into usuario (nombre, correo, contraseña) values ('Roberto De Felice', '','test');
insert into usuario (nombre, correo, contraseña) values ('Noemi Alegre de De Felice', '','test');
insert into usuario (nombre, correo, contraseña) values ('Felisa Gomez', '','test');
insert into usuario (nombre, correo, contraseña) values ('Lorena Marzo', '','test');
insert into usuario (nombre, correo, contraseña) values ('Judith Toro Marzo', '','test');
insert into usuario (nombre, correo, contraseña) values ('Ferrán Caminal', '','test');
insert into usuario (nombre, correo, contraseña) values ('Sandra Sanchez de Caminal', '','test');
insert into usuario (nombre, correo, contraseña) values ('Melany Sanchez', '','test');
insert into usuario (nombre, correo, contraseña) values ('Jeremias Beldad Morales', '','test');
insert into usuario (nombre, correo, contraseña) values ('Monica Muñoz de Beldad', '','test');
insert into usuario (nombre, correo, contraseña) values ('Sofía Muñoz Beldad', '','test');
insert into usuario (nombre, correo, contraseña) values ('Helena Muñoz Beldad', '','test');
insert into usuario (nombre, correo, contraseña) values ('Fernando Teruel', '','test');
insert into usuario (nombre, correo, contraseña) values ('Esther Gonzalez de Teruel', '','test');
insert into usuario (nombre, correo, contraseña) values ('Keren Teruel Gonzalez de Caruso', '','test');
insert into usuario (nombre, correo, contraseña) values ('Michele Caruso', '','test');
insert into usuario (nombre, correo, contraseña) values ('Kilian Sanchez', '','test');
insert into usuario (nombre, correo, contraseña) values ('Sofia Ramirez', '','test');
insert into usuario (nombre, correo, contraseña) values ('Matias Ramirez', '','test');
insert into usuario (nombre, correo, contraseña) values ('Felisa Gomez', '','test');
insert into usuario (nombre, correo, contraseña) values ('Conchita Hernandez', '','test');
insert into usuario (nombre, correo, contraseña) values ('Margarita Fernandez', '','test');
insert into usuario (nombre, correo, contraseña) values ('Montse Fernandez', '','test');




