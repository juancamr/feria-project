CREATE DATABASE IF NOT EXISTS feria;

use feria;

CREATE TABLE
    if NOT EXISTS usuario (
        id_usuario INT NOT NULL auto_increment PRIMARY KEY,
        nombres VARCHAR(30) NOT NULL,
        dni VARCHAR(15),
        telefono VARCHAR(20),
        user_name VARCHAR(30) NOT NULL,
        passwd VARCHAR(255) NOT NULL,
        correo VARCHAR(100) NOT NULL,
        tipo_usuario VARCHAR(30),
        fecha_registro date,
        CONSTRAINT UNIQUE key (user_name)
    ) Engine = InnoDB;