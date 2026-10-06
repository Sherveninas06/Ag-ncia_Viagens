# Atividade 1 - Agência de Viagens (Java)

Projeto console em Java que cadastra uma venda de pacote de viagem.

## Classes (`src/agenciaviagens`)

| Classe | Responsabilidade |
|---|---|
| `Transporte` | tipo (aéreo, rodoviário, marítimo...) e valor em dólar |
| `Hospedagem` | descrição e valor da diária em dólar |
| `PacoteViagem` | transporte, hospedagem, destino e dias; calcula total da hospedagem, lucro e total do pacote |
| `Venda` | cliente, forma de pagamento, data e pacote; converte dólar/real e mostra os totais |
| `Principal` | interação com o usuário via `Scanner` |

## Regras de cálculo

- Total da hospedagem = valor da diária × quantidade de dias
- Lucro = valor + (valor × margem% / 100)
- Total do pacote = lucro(transporte + total da hospedagem, margem) + taxas adicionais
- Total em reais = total em dólar × cotação

## Fluxo conpleto da atividade 

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