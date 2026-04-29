# 📚 Student Management System (Spring Boot CRUD)

A simple and efficient **Spring Boot CRUD application** for managing student records. This project demonstrates REST API development, database integration, and backend architecture using Java and Spring Boot.

---

## 📸 Screenshots

### 🔹 Application Output

<img width="1876" height="953" alt="image" src="https://github.com/user-attachments/assets/214d2426-952a-41b3-8454-a5c11bfd0fc0" />

### 🔹 API Testing (Postman / Browser)
<img width="1856" height="709" alt="image" src="https://github.com/user-attachments/assets/c1065ee5-53dc-416d-a80a-f619138ceb65" />


---

## 🚀 Features

- ➕ Add new student
- 📄 View all students
- 🔍 Get student by ID
- ✏️ Update student details
- ❌ Delete student
- 🌐 RESTful API design
- 🗄️ Database integration (MySQL / H2)

---

## 🛠️ Tech Stack

- **Backend:** Spring Boot  
- **Language:** Java  
- **Build Tool:** Maven  
- **Database:** MySQL / H2  
- **API Testing:** Postman  

---

## 📁 Project Structure


student-management/
│── src/
│ ├── main/
│ │ ├── java/com/example/student/
│ │ │ ├── controller/
│ │ │ ├── service/
│ │ │ ├── repository/
│ │ │ ├── model/
│ │ │ └── StudentApplication.java
│ │ └── resources/
│ │ ├── application.properties
│ │ └── data.sql (optional)
│── pom.xml


---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/student-management.git
cd student-management
2️⃣ Configure Database
👉 MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
👉 H2 (In-Memory Database)
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true
3️⃣ Build the Project
mvn clean install

⚠️ If mvn is not recognized, install Maven and add it to your system PATH.

4️⃣ Run the Application
mvn spring-boot:run
