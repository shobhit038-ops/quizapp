# 📝 Quiz App

A RESTful Quiz Application built with **Spring Boot** and **PostgreSQL**. It allows you to manage a question bank, create category-based quizzes with randomized questions, and automatically calculate scores upon submission.

---

## 🚀 Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 21 |
| Framework | Spring Boot 3.5.5 |
| ORM | Spring Data JPA / Hibernate |
| Database | PostgreSQL |
| Build Tool | Maven |
| Utilities | Lombok |

---

## 📁 Project Structure

```
quizapp/
├── src/main/java/com/example/quizapp/
│   ├── QuizappApplication.java         # Entry point
│   ├── QuizController.java             # Quiz endpoints
│   ├── controller/
│   │   └── QuestionController.java     # Question endpoints
│   ├── service/
│   │   ├── QuestionService.java        # Question business logic
│   │   └── QuizService.java            # Quiz business logic
│   ├── model/
│   │   ├── Question.java               # Question entity
│   │   ├── Quiz.java                   # Quiz entity
│   │   ├── QuestionWrapper.java        # DTO for serving quiz questions
│   │   └── Response.java               # DTO for user responses
│   └── Repo/
│       ├── repo.java                   # Question repository
│       └── QuizDao.java                # Quiz repository
└── src/main/resources/
    └── application.properties          # App configuration
```

---

## ⚙️ Prerequisites

- Java 21+
- Maven 3.6+
- PostgreSQL (running locally or via Docker)

---

## 🛠️ Setup & Installation

### 1. Clone the repository

```bash
git clone https://github.com/your-username/quizapp.git
cd quizapp
```

### 2. Configure the database

Create a PostgreSQL database named `demo`:

```sql
CREATE DATABASE demo;
```

Then update `src/main/resources/application.properties` with your credentials:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/demo
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 3. Run the application

```bash
./mvnw spring-boot:run
```

The server starts at `http://localhost:8080`.

---

## 📡 API Endpoints

### 🔹 Question Endpoints — `/question`

| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/question/allQuestions` | Fetch all questions |
| `GET` | `/question/category/{category}` | Fetch questions by category |
| `POST` | `/question/add` | Add a new question |

**Add Question — Request Body:**
```json
{
  "id": 1,
  "questionTitle": "What is the capital of France?",
  "option1": "Berlin",
  "option2": "Madrid",
  "option3": "Paris",
  "option4": "Rome",
  "category": "Geography",
  "rightAnswer": "Paris",
  "difficultyLevel": "Easy"
}
```

---

### 🔹 Quiz Endpoints — `/quiz`

| Method | Endpoint | Description |
|---|---|---|
| `POST` | `/quiz/create` | Create a new quiz |
| `GET` | `/quiz/get/{id}` | Get quiz questions by quiz ID |
| `POST` | `/quiz/submit/{id}` | Submit answers and get score |

**Create Quiz — Query Params:**

```
POST /quiz/create?category=Geography&numQ=5&title=My+Geography+Quiz
```

**Get Quiz Questions — Response:**
```json
[
  {
    "id": 1,
    "questionTitle": "What is the capital of France?",
    "option1": "Berlin",
    "option2": "Madrid",
    "option3": "Paris",
    "option4": "Rome"
  }
]
```
> Note: The correct answer is intentionally hidden from the response.

**Submit Quiz — Request Body:**
```json
[
  { "id": 1, "response": "Paris" },
  { "id": 2, "response": "Tokyo" }
]
```

**Submit Quiz — Response:**
```
4
```
*(Returns the number of correct answers as an integer)*

---

## 🗃️ Data Model

### `Question`
| Field | Type | Description |
|---|---|---|
| `id` | Integer | Primary key |
| `questionTitle` | String | The question text |
| `option1–4` | String | Multiple choice options |
| `category` | String | Topic category (e.g., Java, Geography) |
| `rightAnswer` | String | Correct answer string |
| `difficultyLevel` | String | Easy / Medium / Hard |

### `Quiz`
| Field | Type | Description |
|---|---|---|
| `id` | Integer | Auto-generated primary key |
| `title` | String | Quiz title |
| `questions` | List\<Question\> | Many-to-many linked questions |

---

## 🔮 Future Improvements

- Add user authentication (Spring Security / JWT)
- Pagination for question listing
- Timer support per quiz
- Frontend UI (React / Angular)
- Score history and leaderboard

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
