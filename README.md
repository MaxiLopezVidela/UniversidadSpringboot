# Sistema de Administración de Proyectos de Grado

Proyecto desarrollado con Spring Boot + Kotlin + MySQL.

## Requisitos
- Java 26
- MySQL corriendo en localhost:3306
- IntelliJ IDEA

## Configuración
Antes de correr el proyecto, verificar que en `src/main/resources/application.properties` las credenciales de MySQL sean correctas:

```properties
spring.datasource.username=root
spring.datasource.password=TU_CONTRASEÑA
```

La base de datos `db_universidad` se crea automáticamente al iniciar el proyecto.

## Cómo correr
1. Abrir el proyecto en IntelliJ
2. Correr `UniversidadApplication.kt`
3. Abrir el navegador en `http://localhost:9001/index.html`

## Documentación
Se encuentra en la carpeta "docs"
