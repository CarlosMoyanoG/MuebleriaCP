# 🪑 MuebleriaCP

Aplicación de escritorio desarrollada en Java (NetBeans) como parte del **Proyecto final del 4to ciclo** de la carrera universitaria.  
Fue realizada en colaboración por **Carlos Moyano Guevara** y su compañero de universidad **Pedro González**.

## 🧩 Descripción

**MueblesCP** es una aplicación de gestión para una mueblería, cuyo propósito es **automatizar procesos administrativos y operativos**.  
Permite a los encargados llevar un control eficiente de:

- Clientes
- Proveedores
- Productos
- Inventario
- Compras a proveedores
- Generación de facturas
- Control de permisos y autenticación de usuarios

Todo esto con su respectivo **CRUD**, a excepción de los permisos, los cuales fueron definidos a nivel de base de datos.

## 🛠️ Tecnologías usadas

- Java (NetBeans)
- Oracle SQL / SQL Developer (SGBD usado en el desarrollo)
- JDBC con driver: `ojdbc8-21.1.0.0.jar`
- Absolute Layout (`AbsoluteLayout.jar`)

## 📁 Estructura del proyecto

El código fuente se encuentra dentro del directorio `src/`, organizado en paquetes:

- `Main`: lógica principal y conexión a la base de datos
- `Vistas`: interfaz gráfica y funcionalidades
- `Imagenes`: recursos visuales como el logo

## ⚠️ Consideraciones

- Para compilar correctamente el proyecto, asegúrate de tener agregada la librería `ojdbc8-21.1.0.0.jar` en el apartado `Libraries`.
- La base de datos **no está incluida**, pero puede reconstruirse fácilmente siguiendo el flujo del código en `BD.java` y los formularios.
- Se requiere un SGBD compatible (Oracle, por ejemplo) y una base de datos con las tablas adecuadas.

## 📦 Instalación

1. Clona el repositorio:

   git clone git@github.com:TuUsuario/TuRepositorio.git

2. Abre el proyecto en NetBeans.
3. Agrega el archivo .jar del driver JDBC en Libraries (por ejemplo: ojdbc8-21.1.0.0.jar).
4. Configura la conexión a tu base de datos según corresponda.
5. Ejecuta el proyecto.

## 👀 Licencia y uso

Este proyecto es de uso público con fines de visualización del código y presentación.
No está autorizado su uso comercial ni reproducción sin permiso.
