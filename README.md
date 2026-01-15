# DevShield (Backend)

Spring Boot REST API for the DevShield secure banking platform.  
Handles authentication, financial transactions, audit logging, and email notifications.

> Frontend Repository → https://github.com/quantr10/DevShield-frontend

---

## 🛠 Tech Stack

**Frontend:** React, JavaScript, HTML, CSS  
**Backend:** Spring Boot, Spring Security, JWT, REST APIs  
**Database:** MySQL  
**DevOps:** Docker, GitHub Actions  
**Cloud:** AWS S3  
**Deployment:** AWS EC2  
**Tools:** Git, Maven, npm 

---

## ✨ Features

- Secure Deposit, Withdrawal, and Transfer APIs  
- JWT Authentication & Role-based Authorization  
- ACID-compliant transaction handling  
- Full audit logging for financial operations  
- SMTP email notifications  

---


## ⚙️ Getting Started

### Clone Repository

```bash
git clone https://github.com/quantr10/DevShield-backend.git
cd devshield-backend
```

### Environment Setup
Copy the example environment file:

```bash
cp .env.example .env
```
Fill in required credentials in .env.

### Run with Docker
```bash
docker-compose up --build
```
Backend runs at: http://localhost:8090

### Run without Docker
```
mvn spring-boot:run
```
---
## 🔄 CI/CD

- Automated builds & tests on push to `main`  
- Docker images created for deployment via GitHub Actions  

---
## ☁️ Cloud Integration

- Deployed on AWS EC2  
- AWS S3 for secure file storage  
- GitHub Actions CI/CD with zero-downtime updates 

---
## 📄 License

[MIT](https://choosealicense.com/licenses/mit/)
