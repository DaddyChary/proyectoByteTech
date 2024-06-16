CREATE DATABASE IF NOT EXISTS ByteTech;
USE ByteTech;
        
CREATE TABLE IF NOT EXISTS administradores (
    id_administrador INT AUTO_INCREMENT PRIMARY KEY,
    nombre_administrador VARCHAR(50),
    password VARCHAR(50),
    login_user VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS empleados (
    id_empleado INT AUTO_INCREMENT PRIMARY KEY,
    nombre_empleado VARCHAR(50),
    rut_empleado VARCHAR(15),
    cargo_empleado VARCHAR(30),
    nivel_acceso INT
);

CREATE TABLE IF NOT EXISTS proveedores (
    id_proveedor INT AUTO_INCREMENT PRIMARY KEY,
    nombre_proveedor VARCHAR(30),
    rut_proveedor VARCHAR(15),
    correo_proveedor VARCHAR(50),
    telefono_proveedor VARCHAR(15)
);

CREATE TABLE IF NOT EXISTS productos (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre_producto VARCHAR(50),
    cantidad_producto INT,
    precio_producto INT,
    descripcion_producto VARCHAR(150),
    id_proveedor_fk INT,
    FOREIGN KEY (id_proveedor_fk) REFERENCES proveedores(id_proveedor)
);

CREATE TABLE IF NOT EXISTS ventas (
    id_venta INT AUTO_INCREMENT PRIMARY KEY,
    fecha_venta DATE,
    id_empleado_fk int,
    FOREIGN KEY (id_empleado_fk) REFERENCES empleados(id_empleado)
);

CREATE TABLE IF NOT EXISTS boletas (
    id_venta_producto INT AUTO_INCREMENT PRIMARY KEY,
    id_producto_fk int,
    id_venta_fk int,
    FOREIGN KEY (id_producto_fk) REFERENCES productos(id_producto),
    FOREIGN KEY (id_venta_fk) REFERENCES ventas(id_venta)
);
