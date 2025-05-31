# Smart Canteen Management System

A Spring Boot application designed for the University of Vavuniya to manage canteen operations efficiently. The system supports multiple canteens, food cataloging, daily menus, employee and student management, and food ordering.

---

## 📋 Project Overview

The **Smart Canteen Management System** handles:

- 📍 Multiple canteen locations  
- 🍽️ Food item catalog (name, price, weight)  
- 📆 Daily menu scheduling per canteen  
- 👩‍💼 Employee management with canteen assignments  
- 🎓 Student profiles with academic details  
- 🧾 Food ordering system with order lines  
- 📅 Date-based tracking of all food orders  

---

## 🧩 Entity Relationship Model

### 🧑 `Person` *(Abstract Base Class)*
- Common attributes: `ID`, `name`, `age`, `gender`
- Extended by `Employee` and `Student`

### 👷 `Employee`
- Extends `Person`
- Additional: `job_position`
- Associated with multiple canteens (Many-to-Many)

### 🎓 `Student`
- Extends `Person`
- Additional: `academic_degree`
- Can place multiple food orders (One-to-Many)

### 🏢 `Canteen`
- Fields: `ID`, `name`, `location`
- Has daily menus (One-to-Many)
- Linked to multiple employees (Many-to-Many)

### 🍲 `Food`
- Fields: `ID`, `name`, `price`, `weight`
- Can be in multiple daily menus (Many-to-Many)

### 📅 `DailyMenu`
- Links food items to canteens on specific dates
- Relationships:
  - Many-to-One with `Canteen`
  - Many-to-Many with `Food`

### 🧾 `FoodOrder`
- Placed by students
- Fields: `order_date`
- One-to-Many with `OrderLine`

### 🧾 `OrderLine`
- Belongs to a `FoodOrder`
- Contains `food_item_id` and `quantity`
- Connected to the `DailyMenu`

---

## 🛠️ Technical Stack

- **Backend:** Spring Boot  
- **Database:** MySQL  
- **ORM:** Hibernate / JPA  
- **Java Version:** Java 17+  
- **Build Tool:** Maven  

---

## 🗃️ Database Schema

The system creates the following tables automatically:

- `employees`
- `students`
- `foods`
- `canteens`
- `daily_menus`
- `food_orders`
- `order_lines`
- `employee_canteen` *(Join Table)*

---

## ⚙️ Setup Instructions

### ✅ Prerequisites

- Java 17+
- Maven 3.6+
- MySQL 8.0+

### 🧾 Database Configuration

Update `application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/canteen_management
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
