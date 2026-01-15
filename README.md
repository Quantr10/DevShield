# DevShield (Backend)

Spring Boot REST API for the DevShield secure banking platform.  
Handles authentication, financial transactions, audit logging, and email notifications.

> Frontend Repository → https://github.com/quantr10/devshield-frontend

---

## 🛠 Tech Stack

**Frontend:** React, JavaScript, HTML, CSS  
**Backend:** Spring Boot, Spring Security, JWT, REST APIs  
**Database:** MySQL  
**DevOps:** Docker, GitHub Actions  
**Cloud:** AWS S3  
**Tools:** Git, Maven, npm 

---

## ✨ Features

- Secure Deposit, Withdrawal, and Transfer APIs  
- JWT Authentication & Role-based Authorization  
- ACID-compliant transaction handling & audit logging  
- React SPA with protected routes & real-time feedback  
- SMTP email notifications (password reset, transaction alerts)  
- Dockerized full-stack app with GitHub Actions CI/CD  
- AWS S3 integration & cloud-ready deployment   

---


## ⚙️ Getting Started

### Clone Repository

```
git clone https://github.com/quantr10/devshield-backend.git
cd devshield-backend
```

### Environment Setup
Copy the example environment file:

```
cp .env.example .env
```
Fill in required credentials in .env.

### Run with Docker
```
docker-compose up --build
```
Backend runs at: http://localhost:8090

### Run without Docker
```
mvn spring-boot:run
```

## 🔄 CI/CD Pipeline

On every push to main:
- Runs backend tests
- Builds frontend
- Builds Docker images
- Ready for automated cloud deployment

Configured in:

```
.github/workflows/deploy.yml
```

## ☁️ Cloud Integration

- AWS S3 for secure file storage
- Container-ready for AWS EC2 / ECS / Render / Railway
- CI/CD prepared for zero-downtime deployment

## 📄 License

[MIT](https://choosealicense.com/licenses/mit/)
