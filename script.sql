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
    if NOT EXISTS local (
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
        CONSTRAINT FOREIGN key (id_local) REFERENCES local (id)
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

/* estadistica */
CREATE TABLE
    if NOT EXISTS chart (
        id INT PRIMARY key NOT NULL auto_increment,
        title VARCHAR(50),
        x_name VARCHAR(30),
        y_name VARCHAR(30)
    ) Engine = InnoDB;

CREATE TABLE
    if NOT EXISTS data_chart_x (
        id INT PRIMARY key NOT NULL auto_increment,
        id_chart INT,
        dato DECIMAL(10, 2),
        CONSTRAINT FOREIGN key (id_chart) REFERENCES chart (id)
    ) Engine = InnoDB;

CREATE TABLE
    if NOT EXISTS data_chart_y (
        id INT PRIMARY key NOT NULL auto_increment,
        id_chart INT,
        dato DECIMAL(10, 2),
        CONSTRAINT FOREIGN key (id_chart) REFERENCES chart (id)
    ) Engine = InnoDB;

/* reporte */
CREATE TABLE
    if NOT EXISTS reporte (
        id INT PRIMARY key NOT NULL auto_increment,
        id_feria INT NOT NULL,
        id_chart INT NOT NULL,
        fecha DATE,
        CONSTRAINT FOREIGN key (id_feria) REFERENCES feria (id),
        CONSTRAINT FOREIGN key (id_chart) REFERENCES chart (id)
    ) Engine = InnoDB;

CREATE TABLE
    if NOT EXISTS gastos (
        id INT PRIMARY key NOT NULL auto_increment,
        id_reporte INT NOT NULL,
        detalle VARCHAR(50),
        amount DECIMAL(10, 2),
        CONSTRAINT FOREIGN key (id_reporte) REFERENCES reporte (id)
    ) Engine = Innodb;

CREATE TABLE
    if NOT EXISTS ingreso (
        id INT PRIMARY key NOT NULL auto_increment,
        id_reporte INT NOT NULL,
        detalle VARCHAR(50),
        amount DECIMAL(10, 2),
        CONSTRAINT FOREIGN key (id_reporte) REFERENCES reporte (id)
    ) Engine = Innodb;