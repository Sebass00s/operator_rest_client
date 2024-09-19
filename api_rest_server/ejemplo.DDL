CREATE DATABASE turnos;

USE turnos;

CREATE TABLE turnos (
    numero_turno BIGINT AUTO_INCREMENT PRIMARY KEY,
    creacion TIMESTAMP,
    fecha_hora_turno TIMESTAMP,
    cuil CHAR(32),
    nombre VARCHAR(100),
    apellido VARCHAR(100),
    puesto_atencion_asignado INT DEFAULT 0,
    pendiente INT,
    llamado INT
);

INSERT INTO turnos (creacion, fecha_hora_turno, cuil, nombre, apellido, puesto_atencion_asignado, pendiente, llamado)
VALUES (NOW(), '2024-09-13 10:00:00', '20-12345678-9', 'Juan', 'Pérez', 1, 1, 0);

INSERT INTO turnos (creacion, fecha_hora_turno, cuil, nombre, apellido, puesto_atencion_asignado, pendiente, llamado)
VALUES (NOW(), '2024-09-13 10:30:00', '20-87654321-0', 'Ana', 'García', 2, 1, 0);

INSERT INTO turnos (creacion, fecha_hora_turno, cuil, nombre, apellido, puesto_atencion_asignado, pendiente, llamado)
VALUES (NOW(), '2024-09-13 11:00:00', '23-45678912-3', 'Carlos', 'Rodríguez', 3, 1, 0);

INSERT INTO turnos (creacion, fecha_hora_turno, cuil, nombre, apellido, puesto_atencion_asignado, pendiente, llamado)
VALUES (NOW(), '2024-09-13 11:30:00', '24-32165498-7', 'Lucía', 'Fernández', 1, 1, 0);

INSERT INTO turnos (creacion, fecha_hora_turno, cuil, nombre, apellido, puesto_atencion_asignado, pendiente, llamado)
VALUES (NOW(), '2024-09-13 12:00:00', '21-65498732-1', 'Miguel', 'Martínez', 2, 1, 0);

INSERT INTO turnos (creacion, fecha_hora_turno, cuil, nombre, apellido, puesto_atencion_asignado, pendiente, llamado)
VALUES (NOW(), '2024-09-13 12:30:00', '20-95175364-8', 'Sofía', 'Gómez', 3, 1, 0);

INSERT INTO turnos (creacion, fecha_hora_turno, cuil, nombre, apellido, puesto_atencion_asignado, pendiente, llamado)
VALUES (NOW(), '2024-09-13 13:00:00', '27-74125896-4', 'Martín', 'Ruiz', 1, 1, 0);

INSERT INTO turnos (creacion, fecha_hora_turno, cuil, nombre, apellido, puesto_atencion_asignado, pendiente, llamado)
VALUES (NOW(), '2024-09-13 13:30:00', '26-85236974-5', 'Paula', 'Silva', 2, 1, 0);

INSERT INTO turnos (creacion, fecha_hora_turno, cuil, nombre, apellido, puesto_atencion_asignado, pendiente, llamado)
VALUES (NOW(), '2024-09-13 14:00:00', '25-96325874-6', 'Esteban', 'Romero', 3, 1, 0);

INSERT INTO turnos (creacion, fecha_hora_turno, cuil, nombre, apellido, puesto_atencion_asignado, pendiente, llamado)
VALUES (NOW(), '2024-09-13 14:30:00', '20-98765432-1', 'Laura', 'Castro', 1, 1, 0);
