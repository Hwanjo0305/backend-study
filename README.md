# 🚀 Backend Study

Java와 Spring Boot를 활용한 백엔드 개발 학습 기록입니다.

백엔드 개발에 필요한 Java, 자료구조, 운영체제, 네트워크, 데이터베이스를 학습하고 직접 프로그램과 REST API를 구현합니다.

## 🛠 기술 스택

- **Language:** Java
- **Framework:** Spring Boot, Spring MVC
- **Database:** PostgreSQL, JDBC
- **Tools:** Git, GitHub, VS Code, Maven
- **Environment:** Windows, WSL2 (Ubuntu)

## 📚 학습 내용

| 구분 | 주요 학습 내용 |
|---|---|
| Week 1 | Java 기초, 클래스, 객체지향 |
| Week 2 | Collection, Generic, Exception, Lambda, Stream, 자료구조 |
| Week 3 | Git, Linux, Process, Thread, TCP/UDP, HTTP |
| Week 4 | REST API, PostgreSQL, JDBC, Spring Boot, Todo API |

## 📂 프로젝트 구조

```text
backend-study/
├── lib/
├── week1-java/   # Java 기초 및 객체지향
├── week2/        # Collection, 알고리즘, 회원 관리
├── week3/        # 운영체제, 네트워크, HTTP
├── week4/        # SQL, JDBC, Spring Boot, REST API
├── .gitignore
└── README.md
```

## 💻 주요 실습 프로젝트

### 1. Java 회원 관리 프로그램

Java Collection을 사용한 콘솔 기반 CRUD 프로그램

- 회원 등록 및 조회
- 회원 검색 및 삭제
- HashMap을 이용한 회원 데이터 관리
- 중복 회원 ID 검사

### 2. HTTP Server 구현

Java Socket을 이용하여 HTTP 서버를 직접 구현

- TCP 연결 수립
- HTTP Request Header 파싱
- GET / POST 요청 처리
- HTTP Response 반환
- Request Body 처리

### 3. Spring Boot Todo API

Spring Boot 기반 Todo CRUD REST API

- `GET /todos` — 전체 조회
- `GET /todos/{id}` — 개별 조회
- `POST /todos` — Todo 생성
- `PUT /todos/{id}` — Todo 수정
- `DELETE /todos/{id}` — Todo 삭제

Controller, Service, Repository로 역할을 구분하여 구현했습니다.

현재 학습 프로젝트에서는 메모리 기반 데이터 저장을 사용하며, 이후 PostgreSQL과 JPA를 연동할 예정입니다.

## 🎯 향후 학습 계획

- Spring Boot / Spring MVC 심화
- JPA와 데이터베이스 연동
- REST API 설계 및 예외 처리
- UNIST 학생용 Study Platform 개발

## 📝 학습 목표

단순히 프레임워크 사용법을 익히는 것을 넘어, HTTP 요청부터 서버의 비즈니스 로직과 데이터베이스 접근까지 전체 동작 원리를 이해하는 백엔드 개발자가 되는 것을 목표로 합니다.