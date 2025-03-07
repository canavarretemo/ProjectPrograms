# 🖥️ ProjectPrograms

**Descripción breve:**  
Este programa comprende varios pequeños programas de lógica de programación. 

## 🚀 Tecnologías utilizadas  
- 🟢 Java SE/EE, Spring Boot  
- ⚙️ Maven
- 📜 Swagger/OpenAPI

## 📂 Estructura del Proyecto
```bash
├──  📂 src
│   ├──  📂 main
│   │   ├──  📂 java
│   │   │   └──  📂 com
│   │   │       └──  📂 project
│   │   │           └──  📂 exercisesproject
│   │   │               ├──  📂 controller
│   │   │               │   └──  📄 ExerciseController.java
│   │   │               ├──  📂 response
│   │   │               │   └──  📄 ApiResponse.java
│   │   │               ├──  📂 service
│   │   │               │   └──  📄 ExerciseService.java
│   │   │               ├──  📂 util
│   │   │               │   └──  📄 ResponseUtil.java
│   │   │               └──  📄 ExercisesProjectApplication.java
│   │   └──  📂 resources
│   │       ├──  📂 static
│   │       ├──  📂 templates
│   │       └──  📄 application.properties
│   └──  📂 test
│       └──  📂 java
│           └──  📂 com
│               └──  📂 project
│                   └──  📂 exercisesproject
│                       └──  📄 ExercisesProjectApplicationTests.java
├──  📄 .gitattributes
├──  📄 .gitignore
├──  📄 README.md
└──  📄 pom.xml
```

## ✅ Características
✔️ API REST con Spring Boot  
✔️ Documentación de API con Swagger

## 📜 Endpoints de la API  

| Método  | Endpoint      | Descripción               |
|---------|-------------|---------------------------|
| GET     | `/api/users` | Obtener todos los usuarios |
| POST    | `/api/users` | Crear un nuevo usuario    |


