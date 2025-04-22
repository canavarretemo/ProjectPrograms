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
├──  📄 pom.xml
└──  📄 update_readme.py
```

## ✅ Características
✔️ API REST con Spring Boot  
✔️ Documentación de API con Swagger

## 📌 Endpoints de la API
<!-- START ENDPOINTS -->
| Método | Endpoint | Descripción |
|--------|----------|-------------|
| `POST` | `/api/exercises/printNumbers` | Hello word program |
| `GET` | `/api/exercises/palindrome/{word}` | Check Palindrome word |
| `GET` | `/api/exercises/helloWorld` | Hello word program |
<!-- END ENDPOINTS -->