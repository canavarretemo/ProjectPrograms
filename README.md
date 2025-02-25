# 🖥️ ProjectPrograms

**Descripción breve:**  
Este programa comprende varios pequeños programas de lógica de programación. 

## 🚀 Tecnologías utilizadas  
- 🟢 Java SE/EE, Spring Boot  
- ⚙️ Maven  

## 📂 Estructura del Proyecto  
```bash
📦 mi-proyecto
 ┣ 📂 src
 ┃ ┣ 📂 main
 ┃ ┃ ┣ 📂 java
 ┃ ┃ ┃ ┗ 📂 com.miempresa.proyecto
 ┃ ┃ ┃ ┃ ┣ MainApplication.java
 ┃ ┃ ┃ ┃ ┗ ...
 ┃ ┃ ┣ 📂 resources
 ┃ ┃ ┃ ┣ application.yml
 ┃ ┃ ┃ ┗ ...
 ┣ 📂 test
 ┣ 📄 README.md
 ┗ 📄 pom.xml

✔️ API REST con Spring Boot

## 📜 Endpoints de la API  
Aquí están los principales endpoints de la API:  

| Método  | Endpoint          | Descripción                    |
|---------|------------------|--------------------------------|
| **GET**    | `/api/users`       | Obtiene todos los usuarios     |
| **GET**    | `/api/users/{id}`  | Obtiene un usuario por ID      |
| **POST**   | `/api/users`       | Crea un nuevo usuario         |
| **PUT**    | `/api/users/{id}`  | Actualiza un usuario por ID  |
| **DELETE** | `/api/users/{id}`  | Elimina un usuario por ID    |

### 🛠️ **Ejemplo de uso con `curl`**
#### 🔹 Obtener todos los usuarios
```bash
curl -X GET http://localhost:8080/api/users


