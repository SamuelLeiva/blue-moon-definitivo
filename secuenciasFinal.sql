create database bluemoondefinitivo;
use bluemoondefinitivo;


create sequence seq_bebida
as int
start with 1 increment by 1
minValue 1
maxValue 5000;


create sequence seq_categoria_producto
as int
start with 1 increment by 1
minValue 1
maxValue 5000;

create sequence seq_categoria_bebida
as int
start with 1 increment by 1
minValue 1
maxValue 5000;

create sequence seq_categoria_plato
as int
start with 1 increment by 1
minValue 1
maxValue 5000;

create sequence seq_cliente
as int
start with 1 increment by 1
minValue 1
maxValue 5000;


create sequence seq_documento_venta
as int
start with 1 increment by 1
minValue 1
maxValue 5000;

create sequence seq_factura_compra
as int
start with 1 increment by 1
minValue 1
maxValue 5000;

create sequence seq_guia_entrada
as int
start with 1 increment by 1
minValue 1
maxValue 5000;

create sequence seq_pedido
as int
start with 1 increment by 1
minValue 1
maxValue 5000;

create sequence seq_personal
as int
start with 1 increment by 1
minValue 1
maxValue 5000;

create sequence seq_plato
as int
start with 1 increment by 1
minValue 1
maxValue 5000;

create sequence seq_producto
as int
start with 1 increment by 1
minValue 1
maxValue 5000;

create sequence seq_proveedor
as int
start with 1 increment by 1
minValue 1
maxValue 5000;


create sequence seq_usuario
as int
start with 1 increment by 1
minValue 1
maxValue 5000;

create sequence seq_guia_salida
as int
start with 1 increment by 1
minValue 1
maxValue 5000;


create sequence seq_pedido_compra
as int
start with 1 increment by 1
minValue 1
maxValue 5000;
