# 📋 Sistema de Atendimento – PROCON Coelho Neto (MA)

Projeto acadêmico da disciplina de Prática Profissional Supervisionada  
**Curso:** Análise e Desenvolvimento de Sistemas – UEMA

## O problema
Em visita ao PROCON de Coelho Neto – MA, identificamos atrasos no atendimento causados por formulários em papel, arquivamento físico e conferência manual de documentos.

## A solução (MVP)
Um sistema em Java com banco de dados PostgreSQL para organizar o atendimento:

- Cadastro de cidadãos (com validação de CPF e bloqueio de CPF duplicado)
- Criação de agendamentos (sem permitir datas passadas)
- Busca de agendamentos por CPF
- Edição e cancelamento de agendamentos

## Tecnologias
- Java 17
- PostgreSQL (JDBC)
- Maven
- IntelliJ IDEA
- Git e GitHub

## Próximos passos
- Interface visual para cidadãos e servidores
- Gestão de documentos digitais
- Acompanhamento do status dos atendimentos
- Controle de acesso por perfil de usuário
