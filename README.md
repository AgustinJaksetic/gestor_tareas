Este proyecto es una aplicación de gestión de tareas construida en Java, en la cual he estado aplicando diversos conceptos de programación orientada a objetos y patrones de diseño.
El sistema permite crear, actualizar y gestionar tareas, junto con sus actividades asociadas, utilizando el patrón de diseño Builder.
Además, he implementado el uso de DAO (Data Access Object) y Service para estructurar el acceso a los datos y la lógica de negocio, lo que me ha permitido practicar y fortalecer mis conocimientos en estas áreas.

Características actuales:

- Gestión de Tareas: Se pueden crear tareas con título, descripción, estado (finalizada, pendiente, etc.) y prioridad (baja, media, alta).
- Gestión de Actividades: Cada tarea puede tener varias actividades asociadas, las cuales pueden ser agregadas dinámicamente durante la creación de la tarea.
- Uso del Patrón Builder: La creación de tareas y actividades es flexible gracias al patrón Builder, que permite añadir o modificar atributos fácilmente sin tener que manejar grandes constructores.
- DAO (Data Access Object): Actualmente, las tareas y actividades se almacenan en memoria. Se utiliza un DAO (Data Access Object) para simular la persistencia de datos.
- Service: He implementado una capa de Service para separar la lógica de negocio del acceso a los datos, promoviendo así una arquitectura más limpia y modular.
- Java: Lenguaje principal del proyecto.
- Patrón de diseño Builder: Utilizado para crear tareas y actividades de manera eficiente.
- Listas y Streams: Utilizados para manejar colecciones de tareas y actividades de manera eficiente.
  
Futuro del Proyecto:

Este proyecto tiene como objetivo integrarse con MySQL para la persistencia real de los datos, permitiendo un almacenamiento más robusto y escalable.
Además, tengo planeado el desarrollo de una interfaz gráfica (GUI) usando Swing.
Agregar más funcionalidades como la edición y eliminación de tareas, filtros avanzados para la gestión de tareas y actividades, y la posibilidad de añadir fechas de vencimiento.

¡Las contribuciones son bienvenidas! Si tienes alguna mejora, corrección o nueva funcionalidad que te gustaría agregar, por favor abre un pull request o issue.
