DROP database feria;

CREATE DATABASE IF NOT EXISTS feria;

use feria;

CREATE TABLE
    if NOT EXISTS usuario (
        id INT PRIMARY key NOT NULL auto_increment,
        nombres VARCHAR(30) NOT NULL,
        dni VARCHAR(15),
        telefono VARCHAR(20),
        user_name VARCHAR(30) NOT NULL,
        passwd VARCHAR(255) NOT NULL,
        correo VARCHAR(100) NOT NULL,
        tipo_usuario VARCHAR(30),
        fecha_registro DATE,
        CONSTRAINT UNIQUE key (user_name)
    ) Engine = InnoDB;

CREATE TABLE
    if NOT EXISTS LOCAL (
        id INT NOT NULL auto_increment,
        nombre VARCHAR(30) NOT NULL,
        distrito VARCHAR(30),
        aforo INT,
        costo DECIMAL(10, 2),
        fecha DATE,
        CONSTRAINT PRIMARY key (id)
    ) Engine = InnoDB;

CREATE TABLE
    if NOT EXISTS feria (
        id INT PRIMARY key NOT NULL auto_increment,
        id_local INT NOT NULL,
        nombre VARCHAR(50),
        aforo INT,
        costo_entrada DECIMAL(10, 2),
        fecha DATE,
        seguridad VARCHAR(40),
        presupuesto DECIMAL(10, 2),
        CONSTRAINT FOREIGN key (id_local) REFERENCES LOCAL (id)
    ) Engine = InnoDB;

CREATE TABLE
    if NOT EXISTS entrada (
        id INT PRIMARY key NOT NULL auto_increment,
        id_feria INT NOT NULL,
        costo DECIMAL(10, 2) NOT NULL,
        descripcion VARCHAR(200),
        CONSTRAINT FOREIGN key (id_feria) REFERENCES feria (id)
    ) Engine = InnoDB;

CREATE TABLE
    if NOT EXISTS patrocinador (
        id INT PRIMARY key NOT NULL auto_increment,
        id_feria INT NOT NULL,
        nombre VARCHAR(30),
        descripcion VARCHAR(40),
        donacion DECIMAL(10, 2),
        CONSTRAINT FOREIGN key (id_feria) REFERENCES feria (id)
    ) Engine = InnoDB;

CREATE TABLE
    if NOT EXISTS proveedor (
        id INT PRIMARY key NOT NULL auto_increment,
        id_feria INT NOT NULL,
        nombre VARCHAR(30),
        descripcion VARCHAR(40),
        costo_proveedores DECIMAL(10, 2),
        CONSTRAINT FOREIGN key (id_feria) REFERENCES feria (id)
    ) Engine = InnoDB;

CREATE TABLE
    if NOT EXISTS finanza (
        id INT PRIMARY key NOT NULL auto_increment,
        id_feria INT NOT NULL,
        gastos DECIMAL(10, 2),
        ingresos DECIMAL(10, 2),
        CONSTRAINT FOREIGN key (id_feria) REFERENCES feria (id)
    ) Engine = Innodb;