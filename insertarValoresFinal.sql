use bluemoondefinitivo;

insert into RESTAURANTE VALUES(
	'RES-01', 'A101','Blue Moon',
	'Restaurante de comida mediterránea, especializado en comida italiana ubicado en el distrito de Lince.');

insert into SEDE values('RES-01', 'BM-01', 'Lince', 'Jr. Brigadier Mateo Pumacahua 2520, Lince, Lima', 4701631,'bluemoon@gmail.com');

use bluemoondefinitivo;
insert into ALMACEN VALUES('BM-01','BMA-01', 'Almacén de Lince');
--tabla cargo
use bluemoondefinitivo;
INSERT INTO cargo values('BMC-01', 'Gerente', 'Gestiona los procesos del restaurante.',null, null, 'Activo');
INSERT INTO cargo values('BMC-02', 'Jefe de Cocina', 'Se encarga de transmitir las órdenes y supervisar los platillos..',null, null, 'Activo');
INSERT INTO cargo values('BMC-03', 'Chef ejecutivo', 'Se encarga de crear y ajustar el menú y coordina el trabajo de la cocina.',null, null, 'Activo');
INSERT INTO cargo values('BMC-04', 'Pastelero', 'Se encarga de hacer recetas de postres y prepararlos.',null, null, 'Activo');
INSERT INTO cargo values('BMC-05', 'Ayudante de cocina', 'Sigue las ordenes de los chefs principales.',null, null, 'Activo');
INSERT INTO cargo values('BMC-06', 'Lavaplatos', 'Lavan platos y utensilios de cocina.',null, null, 'Activo');
INSERT INTO cargo values('BMC-07', 'Administrador', 'Administra el restaurante y contrata al personal.',null, null, 'Activo');
INSERT INTO cargo values('BMC-08', 'Barman', 'Prepara las bebidas y atiende la barra.',null, null, 'Activo');
INSERT INTO cargo values('BMC-09', 'Mozo', 'Atiende las mesas y cobra.',null, null, 'Activo');
INSERT INTO cargo values('BMC-10', 'Cajero', 'Atiende la caja.',null, null, 'Activo');
INSERT INTO cargo values('BMC-11', 'Chef Linea Fria', 'Prepara platos que no necesitan coccion.',null, null, 'Activo');
INSERT INTO cargo values('BMC-12', 'Jefe de Almacén', 'Coordina y dirige las actividades de almacén.',null, null, 'Activo');
INSERT INTO cargo values('BMC-13', 'Asistente de Almacén', 'Ayuda en las actividades de almacén.',null, null, 'Activo');

--tabla mesa
use bluemoondefinitivo;
INSERT INTO MESA VALUES('BMM-01', 2);
INSERT INTO MESA VALUES('BMM-02', 2);
INSERT INTO MESA VALUES('BMM-03', 2);
INSERT INTO MESA VALUES('BMM-04', 2);
INSERT INTO MESA VALUES('BMM-05', 2);
INSERT INTO MESA VALUES('BMM-06', 4);
INSERT INTO MESA VALUES('BMM-07', 4);
INSERT INTO MESA VALUES('BMM-08', 4);
INSERT INTO MESA VALUES('BMM-09', 4);
INSERT INTO MESA VALUES('BMM-10', 4);
INSERT INTO MESA VALUES('BMM-11', 4);
INSERT INTO MESA VALUES('BMM-12', 4);
INSERT INTO MESA VALUES('BMM-13', 6);
INSERT INTO MESA VALUES('BMM-14', 6);
INSERT INTO MESA VALUES('BMM-15', 6);
INSERT INTO MESA VALUES('BMM-16', 6);
INSERT INTO MESA VALUES('BMM-17', 6);
INSERT INTO MESA VALUES('BMM-18', 8);
INSERT INTO MESA VALUES('BMM-19', 8);
INSERT INTO MESA VALUES('BMM-20', 8);


--tabla cliente (PONER SECUENCIA)
use bluemoondefinitivo;
INSERT INTO CLIENTE VALUES('BMCLI-0'+Convert(varchar(20),next value for seq_cliente), '78596214','Carlos Marx','Huaman Gomez',987455622,'C123456', 'Jr Eleazar Blanco 260');
INSERT INTO CLIENTE VALUES('BMCLI-0'+Convert(varchar(20),next value for seq_cliente), '84596321','Ana María','Lopez Lopez',998457621, 'C784596', 'Jr Cristoval 260');
INSERT INTO CLIENTE VALUES('BMCLI-0'+Convert(varchar(20),next value for seq_cliente), '56328994','Juan Pablo','Sagasti Solange',999655368, 'C784215', 'Jr Combate de Angamos 480');
INSERT INTO CLIENTE VALUES('BMCLI-0'+Convert(varchar(20),next value for seq_cliente), '45589966','Inti Bryan','Quispe Ramirez',997855621, 'C365289', 'Jr Iquique 181');

use bluemoondefinitivo;
select * from cliente;

use bluemoondefinitivo;
insert into CATEGORIA_PLATO values('BMCAT-01','Buffet',null,'Activo');
insert into CATEGORIA_PLATO values('BMCAT-02','Carne',null,'Activo');
insert into CATEGORIA_PLATO values('BMCAT-03','Carne de caza',null,'Activo');
insert into CATEGORIA_PLATO values('BMCAT-04','Contornos',null ,'Activo');
insert into CATEGORIA_PLATO values('BMCAT-05','Entrada',null ,'Activo');
insert into CATEGORIA_PLATO values('BMCAT-06','Pescados y Mariscos',null ,'Activo');
insert into CATEGORIA_PLATO values('BMCAT-07','Pastas',null ,'Activo');
insert into CATEGORIA_PLATO values('BMCAT-08','Rissotos Italianos',null ,'Activo');
insert into CATEGORIA_PLATO values('BMCAT-09','Sandwich',null ,'Activo');
insert into CATEGORIA_PLATO values('BMCAT-10','Sopas',null ,'Activo');
insert into CATEGORIA_PLATO values('BMCAT-11','Varios',null ,'Activo');
insert into CATEGORIA_PLATO values('BMCAT-12','Postres',null ,'Activo');

use bluemoondefinitivo;
insert into CATEGORIA_BEBIDA values('BMCATB-01','Bebidas Frias','Activo',null);
insert into CATEGORIA_BEBIDA  values('BMCATB-02','Bebidas Calientes','Activo',null);
insert into CATEGORIA_BEBIDA values('BMCATB-03','Cocktail','Activo',null);
insert into CATEGORIA_BEBIDA values('BMCATB-04','Champán','Activo',null);
insert into CATEGORIA_BEBIDA values('BMCATB-05','Vino Nacional','Activo',null);
insert into CATEGORIA_BEBIDA values('BMCATB-06','Vino Internacional','Activo',null);
insert into CATEGORIA_BEBIDA values('BMCATB-07','Vino Siciliano','Activo',null);
insert into CATEGORIA_BEBIDA values('BMCATB-08','Cocktail peruano','Activo',null);

--tabla proveedor(poner secuencia)
use bluemoondefinitivo;
insert into PROVEEDOR values('BMPRO-0'+Convert(varchar(20),next value for seq_proveedor), 'P1001587975', 'Caryder','Av. Las Palmeras 980', 3263613);
insert into PROVEEDOR values('BMPRO-0'+Convert(varchar(20),next value for seq_proveedor), 'A1234567490', 'Zedina','Av. Universitaria 1055', 989357785);
insert into PROVEEDOR values('BMPRO-0'+Convert(varchar(20),next value for seq_proveedor), 'J78945867238', 'Panots','Calle Narciso de la Colina 320', 4859784);
insert into PROVEEDOR values('BMPRO-0'+Convert(varchar(20),next value for seq_proveedor), 'Y78965674121', 'Il Pastificio','Av. Roosevelt 5646', 978451236);

--- tabla plato(poner secuencia)
use bluemoondefinitivo;
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-01', 'Buffet Lun-Mar-Mie-Jue',75,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-01', 'Buffet Vie-Sab-Dom-Feriados',79,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-01', 'Buffet Medio Lun-Mar-Mie-Jue',35,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-01', 'Buffet Vie-Sab-Dom-Feriados',39.50,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-01', 'Buffet Especial',85,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-01', 'Buffet Especial Medio',42.50,null);

--categoria carne
use bluemoondefinitivo;
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-02' , 'Asado de res a la olla con puré', 48,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-02' , 'Cabrito al pastor', 58,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-02' , 'Chateaubriand de ternera', 150,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-02' , 'Filet Mignon Garni', 58,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-02' , 'Gordon Blue de Lomo', 60,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-02' , 'Lechón al horno', 55,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-02' , 'Lomo a lo Blue Moon', 60,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-02' , 'Tournedos a la Rossini', 58,null);

--- categoria carne de caza

insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-03' , 'Alpaca a las 5 pimientas', 58,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-03' , 'Avestruz a las 5 pimientas', 60,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-03' , 'Cervo a la fruta', 62,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-03' , 'Cervo al Champagne', 58,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-03' , 'Cervo al vino', 58,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-03' , 'Codornices al Champagne', 45,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-03' , 'Conejo a la plancha', 40,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-03' , 'Conejo al Vino', 43,null);

--- categoria contornos
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-04', 'Ensalada Blue Moon', 38,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-04', 'Ensalada de palta', 23,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-04', 'Ensalada Mixta', 28,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-04', 'Ensalada Roquefort', 45,null);

--- categoria entrada
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-05', 'Antipasto a la Italiana',48,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-05', 'Antipasto Campesino',48,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-05', 'Antipasto Siciliano',68,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-05', 'Canapé de Champiñones',38,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-05', 'Carpaccio de Lomo con Rugula',55,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-05', 'Carpaccio de Pez Espada',40,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-05', 'Chicharrón de calamares',35,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-05', 'Cocktail Blue Moon',50,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-05', 'Cocktail de Langostinos',45,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-05', 'Frutto di mare a la italiana',52,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-05', 'Palta rellena con camarones',80,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-05', 'Prociutto di Parma',70,null);

--- categoria pescados y mariscos
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-06', 'Arroz con mariscos',48,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-06', 'Camarones a la Plancha',90,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-06', 'Camarones al Ajillo',90,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-06', 'Colita de Langosta',85,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-06', 'Corvina a la Bomfame',53,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-06', 'Corvina a la Florentina',49,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-06', 'Corvina a la Blue Moon',58,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-06', 'Langostinos al gusto',50,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-06', 'Parrilla de Mariscos',60,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-06', 'Salmón a la plancha',50,null);


--- categoria pastas
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Canelones a la Lupara',38,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Cappelletti al Ragu',38,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Cappelletti en Salsa de Nueces',40,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Fettuccine con Camarones',90,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Lasagna a la Florentina',30,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Lasagna Mafiosa',40,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Macarrones a los 4 quesos',44,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Ñoquis a la Parisian',38,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Ñoquis al Pomodoro',30,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Spaghetti a la Carbonara',35,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Spaghetti a la Marinera',55,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Spaghetti a la Matricciana',38,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Spaghetti a la Ragu',30,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Spaghetti Piccanti di Luna',33,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Spaghetti a la Putanesca',33,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-07', 'Timbal de Camarones',90,null);


-- categoria risottos italianos
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-08', 'Risoto a la Campesina',38,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-08', 'Risoto a la Marinera',55,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-08', 'Risoto a la Milanesa',38,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-08', 'Risotto ai Funghi Porcini Secchi',48,null);


--- categoria sandwich 
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-09', 'Asado',15,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-09', 'Lechón',15,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-09', 'Mortadela Italiana',18,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-09', 'Pavo',17,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-09', 'Prosciutto di Parma',22,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-09', 'Salame Italiano',18,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-09', 'Ternera',16,null);

--- categoria sopas
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-10', 'Chupe de Camarones',90,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-10', 'Chupe de Corvina',48,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-10', 'Chupe de Mariscos',45,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-10', 'Consomé de Pollo',25,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-10', 'Crema de Espárragos',25,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-10', 'Dieta de Pollo',28,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-10', 'Menestrón',46,null);


--- categoria postres
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-12', 'Almendras Acarameladas',35,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-12', 'Cannoli Siciliani (4und)',22,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-12', 'Chirimoya Alegre',30,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-12', 'Crema Volteada',22,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-12', 'Creppe Suchard',30,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-12', 'Fresas con Crema Chantilly',17,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-12', 'Frutas de la estación',22,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-12', 'Merengado de Chirimoya',26,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-12', 'Porción Chocolates',17,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-12', 'Porción de Pye',17,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-12', 'Tiramizú',22,null);

--- categoria varios
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-11', 'Aperol Spritt 175ml',35,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-11', 'Arroz blanco',10,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-11', 'Porción de pan',8,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-11', 'Porción de papas a la francesa',18,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-11', 'Porción de papas fritas',10,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-11', 'Porción de aceitunas',17,null);
insert into PLATO values ('BMPLA-0'+Convert(varchar(20),next value for seq_plato),'BMCAT-11', 'Puré de papa',18,null);


--tabla personal(poner secuencia)
use bluemoondefinitivo; 
insert into PERSONAL values('BMC-09','BMPERSONAL-0'+Convert(varchar(20),next value for seq_personal),78455487,'Maximo','Diaz',996587455,'diazmozo@outlook.com','BM-01');
insert into PERSONAL values('BMC-09','BMPERSONAL-0'+Convert(varchar(20),next value for seq_personal),78881524,'Marino','Perez',997854321,'marinomozo@outlook.com','BM-01');
insert into PERSONAL values('BMC-09','BMPERSONAL-0'+Convert(varchar(20),next value for seq_personal),65263321,'Juan','Flores',984777326,'juanmozo@outlook.com','BM-01');
insert into PERSONAL values('BMC-09','BMPERSONAL-0'+Convert(varchar(20),next value for seq_personal),54886955,'Pablo','Ramirez',993588644,'pablomozo@outlook.com','BM-01');
insert into PERSONAL values('BMC-09','BMPERSONAL-0'+Convert(varchar(20),next value for seq_personal),84523621,'Miguel','Alfaro',949328654,'miguelmozo@outlook.com','BM-01');
insert into PERSONAL values('BMC-08','BMPERSONAL-0'+Convert(varchar(20),next value for seq_personal),88754966,'Neyder','Cordoba',988599688,'neyderbarman@gmail.com','BM-01');
insert into PERSONAL values('BMC-08','BMPERSONAL-0'+Convert(varchar(20),next value for seq_personal),78556599,'Edil','Cordoba',985654558,'edilbarman@gmail.com','BM-01');
insert into PERSONAL values('BMC-07','BMPERSONAL-0'+Convert(varchar(20),next value for seq_personal),77776666,'Jorge','Chavez',997422321,'jorgeadmin@gmail.com','BM-01');
insert into PERSONAL values('BMC-10','BMPERSONAL-0'+Convert(varchar(20),next value for seq_personal),77778455,'Isabel','Quispe',988566662,'isabelcaja@gmail.com','BM-01');
insert into PERSONAL values('BMC-10','BMPERSONAL-0'+Convert(varchar(20),next value for seq_personal),78889548,'Carmen','Sandiego',999988745,'carmencaja@gmail.com','BM-01');
insert into PERSONAL values('BMC-03','BMPERSONAL-0'+Convert(varchar(20),next value for seq_personal),58886544,'Remi','Cori',915168123,'remichefx@gmail.com','BM-01');
insert into PERSONAL values('BMC-01','BMPERSONAL-0'+Convert(varchar(20),next value for seq_personal),77779559,'Santino','Baletta',999784488,'santinoadmin@gmail.com','BM-01');
insert into PERSONAL values('BMC-12','BMPERSONAL-0'+Convert(varchar(20),next value for seq_personal),78459888,'Mario','Parma',999995865,'jefealmacen@gmail.com','BM-01');
insert into PERSONAL values('BMC-13','BMPERSONAL-0'+Convert(varchar(20),next value for seq_personal),45456869,'Luigi','Corleone',991443586,'asistalmacen@gmail.com','BM-01');

--tabla usuario(poner secuencia)
use bluemoondefinitivo;
insert into USUARIO values('BMUSU-0'+Convert(varchar(20),next value for seq_usuario), 'mozo1','bluemoonmozo','diazmozo@outlook.com','mozo','BMPERSONAL-01');
insert into USUARIO values('BMUSU-0'+Convert(varchar(20),next value for seq_usuario), 'caja1','bluemooncaja','isabelcaja@gmail.com', 'cajero','BMPERSONAL-09');
insert into USUARIO values('BMUSU-0'+Convert(varchar(20),next value for seq_usuario), 'admin1','bluemoonadmin','jorgeadmin@gmail.com','admin','BMPERSONAL-08');
insert into USUARIO values('BMUSU-0'+Convert(varchar(20),next value for seq_usuario), 'mozo2','bluemoonmozo2','marinomozo@outlook.com','mozo','BMPERSONAL-02');
insert into USUARIO values('BMUSU-0'+Convert(varchar(20),next value for seq_usuario), 'mozo3','bluemoonmozo3','juanmozo@outlook.com','mozo','BMPERSONAL-03');
insert into USUARIO values('BMUSU-0'+Convert(varchar(20),next value for seq_usuario), 'mozo4','bluemoonmozo4','pablomozo@outlook.com','mozo','BMPERSONAL-04');
insert into USUARIO values('BMUSU-0'+Convert(varchar(20),next value for seq_usuario), 'mozo5','bluemoonmozo5','miguelmozo@outlook.com','mozo','BMPERSONAL-05');
insert into USUARIO values('BMUSU-0'+Convert(varchar(20),next value for seq_usuario), 'caja2','bluemooncaja2','carmencaja@gmail.com','cajero','BMPERSONAL-010');
insert into USUARIO values('BMUSU-0'+Convert(varchar(20),next value for seq_usuario), 'admin2','santinoadmin2','santinoadmin@gmail.com','admin','BMPERSONAL-012');
insert into USUARIO values('BMUSU-0'+Convert(varchar(20),next value for seq_usuario), 'almacen1','jefealmacen','jefealmacen@gmail.com', 'almacenero','BMPERSONAL-013');
insert into USUARIO values('BMUSU-0'+Convert(varchar(20),next value for seq_usuario), 'almacen2','asistalmacen','asistalmacen@gmail.com', 'almacenero','BMPERSONAL-014');

--tabla categoria insumo(poner secuencia)
use bluemoondefinitivo;
insert into CATEGORIA_PRODUCTO values('BMCATP-0'+Convert(varchar(20),next value for seq_categoria_producto), 'Vegetales',null);
insert into CATEGORIA_PRODUCTO values('BMCATP-0'+Convert(varchar(20),next value for seq_categoria_producto), 'Carnes',null);
insert into CATEGORIA_PRODUCTO values('BMCATP-0'+Convert(varchar(20),next value for seq_categoria_producto), 'Carnes de Caza',null);
insert into CATEGORIA_PRODUCTO values('BMCATP-0'+Convert(varchar(20),next value for seq_categoria_producto), 'Pescados y mariscos',null);
insert into CATEGORIA_PRODUCTO values('BMCATP-0'+Convert(varchar(20),next value for seq_categoria_producto), 'Pastas',null);
insert into CATEGORIA_PRODUCTO values('BMCATP-0'+Convert(varchar(20),next value for seq_categoria_producto), 'Bebidas',null);
insert into CATEGORIA_PRODUCTO values('BMCATP-0'+Convert(varchar(20),next value for seq_categoria_producto), 'Granos',null);
insert into CATEGORIA_PRODUCTO values('BMCATP-0'+Convert(varchar(20),next value for seq_categoria_producto), 'Quesos',null);
insert into CATEGORIA_PRODUCTO values('BMCATP-0'+Convert(varchar(20),next value for seq_categoria_producto), 'Embutidos',null);
insert into CATEGORIA_PRODUCTO values('BMCATP-0'+Convert(varchar(20),next value for seq_categoria_producto), 'Especias',null);
insert into CATEGORIA_PRODUCTO values('BMCATP-0'+Convert(varchar(20),next value for seq_categoria_producto), 'Frutas',null);

--- tabla bebida(poner secuencia)
use bluemoondefinitivo;
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Jarra de Chicha',null,32,'BMCATB-01');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Jarra de Cremolada',null,32,'BMCATB-01');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Jarra de Limonada',null,32,'BMCATB-01');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Jugo Fruta de la estación',null,12,'BMCATB-01');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Jugo de fruta con leche',null,17,'BMCATB-01');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Vaso de chicha',null,7,'BMCATB-01');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Vaso de cremolada',null,7,'BMCATB-01');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Vaso de limonada',null,7,'BMCATB-01');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Gaseosa',null,7,'BMCATB-01');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Botella de agua mineral',null,7,'BMCATB-01');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Cerveza',null,12,'BMCATB-01');


--- categoria bebida caliente
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Café Americano',null,7,'BMCATB-02');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Café Capuccino con crema',null,12,'BMCATB-02');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Café Cortado',null,12,'BMCATB-02');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Café Expresso',null,7,'BMCATB-02');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Café Ristretto',null,7,'BMCATB-02');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Infusiones calientes',null,7,'BMCATB-02');


--- categoria cocktail
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Al Capone',null,27,'BMCATB-03');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Alaska Verde',null,24,'BMCATB-03');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Amor en llamas',null,28,'BMCATB-03');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Biblia',null,26,'BMCATB-03');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Bloody Mary',null,25,'BMCATB-03');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Brigitte Bardot',null,25,'BMCATB-03');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Campari Bitter',null,25,'BMCATB-03');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Carpano Bianco',null,22,'BMCATB-03');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Chispitas de Amor',null,28,'BMCATB-03');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Caprichoso',null,30,'BMCATB-03');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Primavera',null,24,'BMCATB-03');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Santino',null,25,'BMCATB-03');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Sangria Jarra',null,55,'BMCATB-03');


--- categoria cocktail peruano
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Algarrobina',null,22,'BMCATB-08');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Chilcano de Guinda',null,23,'BMCATB-08');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Chilcano de Pisco',null,22,'BMCATB-08');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Cuba Libre',null,23,'BMCATB-08');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Mojito',null,22,'BMCATB-08');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Peru Libre',null,20,'BMCATB-08');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Pisco Sour Chico',null,13,'BMCATB-08');
insert into BEBIDA values ('BMCATB-0'+Convert(varchar(20),next value for seq_bebida),'Pisco Sour Grande',null,22,'BMCATB-08');


--productos(poner secuencia)
use bluemoondefinitivo;
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Tomate', 'kg', 'BMCATP-01', 3,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Lechuga', 'kg', 'BMCATP-01', 2,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Zanahoria', 'kg', 'BMCATP-01', 3,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Cebolla', 'kg', 'BMCATP-01', 4,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Pepinillo', 'kg', 'BMCATP-01', 3.5,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Papa', 'kg', 'BMCATP-01', 3,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Beterraga', 'kg', 'BMCATP-01', 3,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Vainita', 'kg', 'BMCATP-01', 4,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Esparragos', 'kg', 'BMCATP-01', 5,10);


insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Lechon', 'kg', 'BMCATP-02', 10,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Res', 'kg', 'BMCATP-02', 11,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Gallina', 'kg', 'BMCATP-02', 10,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Pollo', 'kg', 'BMCATP-02', 10,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Pavo', 'kg', 'BMCATP-02', 15,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Cabrito', 'kg', 'BMCATP-02', 10,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Ternera', 'kg', 'BMCATP-02', 10,10);

insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Alpaca', 'kg', 'BMCATP-03', 10, 10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Avestruz', 'kg', 'BMCATP-03', 11, 10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Codorniz', 'kg', 'BMCATP-03', 15, 10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Conejo', 'kg', 'BMCATP-03', 10,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Cerdo', 'kg', 'BMCATP-03', 16,10);


insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Langostino', 'kg', 'BMCATP-04', 10,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Camaron', 'kg', 'BMCATP-04', 11,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Calamar', 'kg', 'BMCATP-04', 15,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Pez espada', 'kg', 'BMCATP-04', 10,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Langosta', 'kg', 'BMCATP-04', 16,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Corvina', 'kg', 'BMCATP-04', 16,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Salmon', 'kg', 'BMCATP-04', 16,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Atun', 'kg', 'BMCATP-04', 18,10);


insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Spaghetti', 'kg', 'BMCATP-05', 10,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Canelones', 'kg', 'BMCATP-05', 11,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Noquis', 'kg', 'BMCATP-05', 15,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Cappelletti', 'kg', 'BMCATP-05', 10,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Ravioles', 'kg', 'BMCATP-05', 16,10);


insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Agua', 'ml', 'BMCATP-06', 10,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Gaseosa', 'ml', 'BMCATP-06', 11,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Vino', 'ml', 'BMCATP-06', 15,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Cerveza', 'ml', 'BMCATP-06', 10,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Champán', 'ml', 'BMCATP-06', 10,10);


insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Lentejas', 'kg', 'BMCATP-07', 3,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Frijoles', 'kg', 'BMCATP-07', 4,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Pallares', 'kg', 'BMCATP-07', 5,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Arroz', 'kg', 'BMCATP-07', 7,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Garbanzos', 'kg', 'BMCATP-07', 5,10);


insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Chirimoya', 'kg', 'BMCATP-08', 3,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Fresa', 'kg', 'BMCATP-08', 4,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Melón', 'kg', 'BMCATP-08', 3,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Sandía', 'kg', 'BMCATP-08', 4,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Uvas', 'kg', 'BMCATP-08', 4,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Pera', 'kg', 'BMCATP-08', 4,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Manzana', 'kg', 'BMCATP-08', 3,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Arándano', 'kg', 'BMCATP-08', 4,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Limón', 'kg', 'BMCATP-08', 5,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Naranja', 'kg', 'BMCATP-08', 3,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Aceituna', 'kg', 'BMCATP-08', 4,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Palta', 'kg', 'BMCATP-08', 6,10);


insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Oregano', 'kg', 'BMCATP-09', 3,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Romero', 'kg', 'BMCATP-09', 4,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Tomillo', 'kg', 'BMCATP-09', 3,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Hinojo', 'kg', 'BMCATP-09', 4,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Canela', 'kg', 'BMCATP-09', 4,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Laurel', 'kg', 'BMCATP-09', 4,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Pimienta', 'kg', 'BMCATP-09', 3,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Sal', 'kg', 'BMCATP-09', 4,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Ajo', 'kg', 'BMCATP-09', 5,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Albahaca', 'kg', 'BMCATP-09', 3,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Perejil', 'kg', 'BMCATP-09', 4,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Pimienta Negra', 'kg', 'BMCATP-09', 5,10);


insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Mozarrella', 'kg', 'BMCATP-010', 11,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Azul', 'kg', 'BMCATP-010', 14,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Fiore Sardo', 'kg', 'BMCATP-010', 13,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Parmigiano', 'kg', 'BMCATP-010', 15,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Taleggio', 'kg', 'BMCATP-010', 14,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Gorgonzola', 'kg', 'BMCATP-010', 16,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Mascarpone', 'kg', 'BMCATP-010', 13,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Mortadela', 'kg', 'BMCATP-010', 13,10);


insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Salame milano', 'kg', 'BMCATP-011', 11,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Salame napolitano', 'kg', 'BMCATP-011', 12,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Salame de oso', 'kg', 'BMCATP-011', 13,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Prosciuto', 'kg', 'BMCATP-011', 15,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Jamón serrano', 'kg', 'BMCATP-011', 15,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Mortadela', 'kg', 'BMCATP-011', 16,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Prosciutto di Parma', 'kg', 'BMCATP-011', 17,10);
insert into PRODUCTO values ('BMPROD-0'+Convert(varchar(20),next value for seq_producto), 'Mortadela', 'kg', 'BMCATP-011', 18,10);



--tabla inventario(poner secuencia)
use bluemoondefinitivo;
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-01');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-02');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-03');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-04');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-05');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-06');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-07');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-08');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-09');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-010');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-011');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-012');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-013');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-014');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-015');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-016');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-017');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-018');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-019');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-020');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-021');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-022');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-023');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-024');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-025');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-026');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-027');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-028');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-029');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-030');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-031');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-032');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-033');
insert into DET_INVENTARIO values (5, 'BMA-01', 'BMPROD-034');
insert into DET_INVENTARIO values (5, 'BMA-01', 'BMPROD-035');
insert into DET_INVENTARIO values (5, 'BMA-01', 'BMPROD-036');
insert into DET_INVENTARIO values (5, 'BMA-01', 'BMPROD-037');
insert into DET_INVENTARIO values (5, 'BMA-01', 'BMPROD-038');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-039');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-040');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-041');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-042');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-043');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-044');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-045');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-046');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-047');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-048');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-049');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-050');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-051');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-052');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-053');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-054');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-055');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-056');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-057');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-058');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-059');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-060');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-061');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-062');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-063');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-064');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-065');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-066');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-067');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-068');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-069');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-070');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-071');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-072');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-073');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-074');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-075');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-076');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-077');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-078');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-079');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-080');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-081');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-082');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-083');
insert into DET_INVENTARIO values (10, 'BMA-01', 'BMPROD-084');

