# ICAE01-2025-05-02
# Smart Canteen Management System

## Project Overview
This Spring Boot application implements a Smart Canteen Management System for University Vavuniya. The system manages multiple canteens across the campus, food items, daily menus, employees, students, and food orders.

## Features
- Multiple canteen locations management
- Food item catalog with name, price, and weight
- Daily menu management for each canteen
- Employee management with canteen assignments
- Student profiles and academic information
- Food ordering system with detailed order lines
- Date-based tracking of all orders

## Entity Relationship Model
The system consists of the following entities and their relationships:

1. **Person** (Abstract Base Class)
   - Common attributes: ID, name, age, gender
   - Extended by Employee and Student

2. **Employee**
   - Extends Person
   - Additional attribute: job position
   - Can be associated with multiple canteens

3. **Student**
   - Extends Person
   - Additional attribute: academic degree
   - Can place multiple food orders

4. **Canteen**
   - Attributes: ID, name, location
   - Has daily menus
   - Associated with multiple employees

5. **Food**
   - Attributes: ID, name, price, weight
   - Can appear in multiple daily menus

6. **DailyMenu**
   - Links food items to canteens on specific dates

7. **FoodOrder**
   - Placed by students
   - Contains order date
   - Consists of multiple order lines

8. **OrderLine**
   - Part of a food order
   - References specific food item and quantity
   - Connected to the daily menu

## Database Schema
The application uses Hibernate ORM to generate the following database tables:
- employees
- students
- foods
- canteens
- daily_menus
- food_orders
- order_lines
- employee_canteen (join table)

## Technical Implementation
- **Backend:** Spring Boot
- **Database:** MySQL
- **ORM:** Hibernate/JPA
- **Relationships:** One-to-Many, Many-to-One, Many-to-Many, and SuperClass

## Setup Instructions

### Prerequisites
- Java 17+
- Maven 3.6+
- MySQL 8.0+

### Database Configuration
The application is configured to connect to a MySQL database. Update the `application.properties` file with your database credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/canteen_management
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Running the Application
1. Clone the repository
2. Navigate to the project directory
3. Run `mvn clean install`
4. Run `mvn spring-boot:run`

### Database Migration
The tables will be automatically created when you run the application with the `spring.jpa.hibernate.ddl-auto=update` property.

### Database Backup
To create a backup of the database:
```bash
mysqldump -u root -p canteen_management > backup.sql
```

## Project Structure
```
src
├── main
│   ├── java
│   │   └── com
│   │       └── university
│   │           └── canteen
│   │               ├── model
│   │               │   ├── Person.java
│   │               │   ├── Employee.java
│   │               │   ├── Student.java
│   │               │   ├── Food.java
│   │               │   ├── Canteen.java
│   │               │   ├── DailyMenu.java
│   │               │   ├── FoodOrder.java
│   │               │   └── OrderLine.java
│   │               └── CanteenApplication.java
│   └── resources
│       └── application.properties
```

## Output

![Screenshot (1110)](https://github.com/user-attachments/assets/b4f8ddd5-c289-4e25-875b-1e609ab58ee8)

![Screenshot (1111)](https://github.com/user-attachments/assets/960edc6a-1c69-4fe7-b5d1-737e59419b1b)

![Screenshot (1112)](https://github.com/user-attachments/assets/1c99ad64-162c-4cd0-8d06-4effd3a0699c)
