# ✈️ Sistema de Agência de Viagens

Sistema desenvolvido em **Java** para simular a venda de pacotes de viagens, utilizando conceitos de **Programação Orientada a Objetos (POO)**.

O projeto permite cadastrar informações do cliente, transporte, hospedagem e destino, além de realizar cálculos de hospedagem, margem de lucro, taxas adicionais e conversão do valor final de dólar para real.

---

## 🎯 Objetivo

O objetivo deste projeto é praticar os principais conceitos de **Java e POO**, desenvolvendo um sistema simples e funcional para gerenciamento e venda de pacotes de viagens.

---

## 🚀 Funcionalidades

- Cadastro do cliente
- Cadastro do tipo de transporte
- Definição do valor do transporte em dólar
- Cadastro da hospedagem
- Definição do valor da diária
- Definição do destino da viagem
- Definição da quantidade de dias
- Cálculo do valor total da hospedagem
- Aplicação de margem de lucro
- Adição de taxas extras
- Cadastro da forma de pagamento
- Registro da data da venda
- Conversão do valor final de dólar para real
- Exibição dos dados da venda no terminal

---

## 🧩 Estrutura do Projeto

O projeto foi dividido em diferentes classes para organizar as responsabilidades do sistema:

```text
src/
│
├── Principal.java
├── Transporte.java
├── Hospedagem.java
├── PacoteViagem.java
└── Venda.java

## Fluxo completo da atividade 

                    PRINCIPAL
                        │
                        ▼
                  Pergunta dados
                        │
          ┌─────────────┴─────────────┐
          ▼                           ▼
     Transporte                   Hospedagem
          │                           │
          └─────────────┬─────────────┘
                        ▼
                  PacoteViagem
                        │
              ┌─────────┴─────────┐
              ▼                   ▼
       Calcula hospedagem     Calcula lucro
              │                   │
              └─────────┬─────────┘
                        ▼
                  Total pacote
                        │
                        ▼
                      Venda
                        │
                        ▼
               Conversão para R$
                        │
                        ▼
                    RESULTADO
