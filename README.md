# Proyecto de Concesionaria

Este proyecto es un sistema en **Java** que permite gestionar todos los modelos de autos disponibles, aplicando las operaciones **CRUD** (crear, leer, actualizar y eliminar) con **JPA** sobre la clase `Automóvil`.

## Descripción

El sistema permite:
- **Gestionar Automóviles**: Crear, leer, actualizar y eliminar registros de automóviles.
- **Catálogo Online**: Publicar los vehículos en una base de datos para que el administrador pueda verlos y modificarlos.

## Estructura del Proyecto

El proyecto sigue el **modelo de capas**, separando la lógica de negocio, la interfaz gráfica y la persistencia de datos.

### Clases Principales

- `Automóvil`: Clase que modela un automóvil con los atributos `id`, `modelo`, `marca`, `color` y `patente`.

## Tecnologías Utilizadas

- **Java**
- **JPA** (Java Persistence API)
- **Base de Datos**: Para almacenar y gestionar los datos de los automóviles.

## Instalación

1. Clona el repositorio:
    ```bash
    git clone https://github.com/Mateo-404/Consecionaria_JPA.git
    ```
2. Importa el proyecto en tu IDE de preferencia.
3. Configura la conexión a la base de datos en el archivo `persistence.xml`.
4. Ejecuta la aplicación.

## Uso

1. Inicia la aplicación.
2. Utiliza la interfaz gráfica para gestionar los automóviles.
3. Visualiza y modifica el catálogo online de vehículos.

## Licencia

Este proyecto no tiene una licencia específica.

---

© 2024 Mateo-404
