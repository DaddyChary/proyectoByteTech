CREATE DATABASE IF NOT EXISTS ByteTech;
USE ByteTech;
        
CREATE TABLE IF NOT EXISTS administrador (
    id_administrador INT AUTO_INCREMENT PRIMARY KEY,
    nombre_administrador VARCHAR(50),
    password VARCHAR(50),
    login_user VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS empleado (
    id_empleado INT AUTO_INCREMENT PRIMARY KEY,
    nombre_empleado VARCHAR(50),
    rut_empleado VARCHAR(15),
    cargo_empleado VARCHAR(30),
    nivel_acceso INT
);

CREATE TABLE IF NOT EXISTS proveedores (
    id_proveedores INT AUTO_INCREMENT PRIMARY KEY,
    nombre_proveedor VARCHAR(30),
    rut_proveedor VARCHAR(15),
    correo_proveedor VARCHAR(50),
    telefono_proveedor VARCHAR(15)
);

CREATE TABLE IF NOT EXISTS productos (
    id_productos INT AUTO_INCREMENT PRIMARY KEY,
    nombre_productos VARCHAR(50),
    cantidad_productos INT,
    precio_producto INT,
    descripcion_producto VARCHAR(150),
    id_proveedor INT,
    FOREIGN KEY (id_proveedor) REFERENCES proveedores(id_proveedores)
);

CREATE TABLE IF NOT EXISTS ventas (
    id_venta INT AUTO_INCREMENT PRIMARY KEY,
    fecha_venta DATE,
    cantidad_productos_vendidos INT,
    id_producto INT,
    FOREIGN KEY (id_producto) REFERENCES productos(id_productos)
);

INSERT INTO empleado(nombre_empleado, rut_empleado, cargo_empleado, nivel_acceso)
VALUES ('Gamaliel', '2144', 'Trabajador', 1);

INSERT INTO administrador(nombre_administrador, password, login_user)
VALUES ('Luis', '1234', 'lucho');

