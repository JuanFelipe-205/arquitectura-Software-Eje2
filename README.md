# Arquitectura de Software - EJE 2

- **Universidad**: Areandina. 
- **Materia**: Arquitectura de software - EJE 2 
- **Integrantes**: Juan Felipe Vargas Cortes, Juan Jose Ruiz Garcia
- **Fecha**: 19/02/2026

*<><><><><><><><><><><><><><><><><><><><><><><><><>*
# Objetivos:
1. Construir una aplicación que implemente uno o varios patrones de diseño o estilos arquitectónicos, por ejemplo (MVC, DTO, DAO).
2. La aplicación debe tener una conexión a una base de datos.
3. Integrar en la aplicación la Programación Orientada a Objetos.
4. La aplicación debe permitir las operaciones básicas para el manejo de registros (CRUD).
5. La aplicación puede ser construida en cualquier lenguaje de programación (PHP, JAVA, PYTHON, NET, etc.).
6. Construir un documento en PDF, que describa los patrones utilizados y que se reflejan en el código, adicionalmente debe contener (portada, objetivo, el desarrollo de la actividad (es necesario incluir imágenes claras, diagramas), descripciones de los diagramas, conclusiones, referencias de libros o sitios confiables con normas APA).

*<><><><><><><><><><><><><><><><><><><><><><><><><>*
# Explicacion Tecnica:
El presente proyecto cuenta con una arquitectura en Capas lo que facilita la compresion del mismo, corresponeidnte a la estructura del proyecto se generaron 5 carpetas encargadas de:
- **CONTROLLER**: Define los puntos de entrada (Endpoints) y el contrato de la API. Separa la definición (Interfaz) de la implementación (IMPL).
- **DAO**: Gestiona la persistencia de datos mediante EntityManager, desacoplando el SQL nativo del código Java a través de externalización en archivos de configuración.
- **DTO**: Objetos de transferencia de datos que aseguran el desacoplamiento entre la base de datos y la respuesta al cliente, mejorando la seguridad y eficiencia.
- **SERVICE**: Contiene la lógica de negocio y actúa como mediador, realizando el mapeo (mapping) entre Entidades y DTOs.
- **EXECPTION**: Centraliza el manejo de errores mediante un GlobalExceptionHandler para garantizar respuestas estandarizadas y controladas.

*<><><><><><><><><><><><><><><><><><><><><><><><><>*
# Requisitos y compoentes:
- Entorno: JDK 17, Maven 3.6.3 +
- Base de Datos: Oracle (Instalacion Local).
- Herramientas: IntelliJ IDEA o otros, Postman, Git.
- Plugins: Loombok

*<><><><><><><><><><><><><><><><><><><><><><><><><>*
# Pruebas locales:
En caso de quere realizar la prueba de los servicio implementados, se adjunta un enlace de una carpeta drive la cual contiene las sentencias SQL para crear la Base de datos y la coleccion POSTMAN para ejecutra las peticionaes.
- Link: https://drive.google.com/file/d/1xOV51fM2cy57xsdR5dQymgSPmHtVoK6f/view?usp=drive_link

