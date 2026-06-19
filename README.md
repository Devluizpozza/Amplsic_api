# PsicApp API

Backend REST API para o [PsicApp](../psic_app/README.md) — plataforma de agendamento de consultas de psicologia.

## Stack

| Componente | Tecnologia |
|---|---|
| Linguagem | Kotlin 1.9.25 |
| Framework | Spring Boot 3.5.15 |
| JVM | Java 21 |
| Banco de dados | PostgreSQL 16 |
| ORM | Spring Data JPA (Hibernate) |
| Build | Gradle 8 (Kotlin DSL) |

## Pré-requisitos

- JDK 21+
- Docker e Docker Compose

## Rodando localmente

**1. Suba o PostgreSQL com Docker:**
```bash
docker compose up -d
```

**2. Execute a aplicação:**
```bash
./gradlew bootRun
```

A API estará disponível em `http://localhost:8080`.

## Configuração

As configurações ficam em `src/main/resources/application.yaml`. Para desenvolvimento local o banco é configurado automaticamente via Docker Compose com as credenciais padrão `postgres:postgres`.

## Endpoints disponíveis

| Método | Rota | Descrição |
|---|---|---|
| GET | `/health` | Verifica se a API está no ar |

## Domínio da aplicação

O backend suporta os seguintes conceitos do PsicApp (a ser implementado):

- **Usuário (`AppUser`)** — perfil base com papel (`paciente` ou `psicólogo`) e etapa de onboarding
- **Paciente (`Patient`)** — dados e triagem de saúde mental
- **Psicólogo (`Psychologist`)** — perfil com especialidade
- **Agenda (`Schedule`)** — consulta com status (`solicitada`, `agendada`, `cancelada`)
- **Horário disponível (`TimeSlot`)** — slots de atendimento por data
- **Acompanhamento (`Follower`)** — vínculo entre paciente e psicólogo

## Estrutura do projeto

```
src/main/kotlin/br/com/pozza/psicapp/
├── controller/
│   └── health_controller.kt
└── PsicappApiApplication.kt
```

## Frontend

O aplicativo mobile é desenvolvido em Flutter e está em [`../psic_app`](../psic_app). A autenticação é feita via Firebase (telefone/SMS e Google Sign-In).
