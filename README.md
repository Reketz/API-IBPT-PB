# API IBPT PB

Api de calculo de impostos nacional, estadual e municipal baseado no ncm, estado e valor do produto.

<p align="center">
  <img src="https://github.com/Reketz/API-IBPT-PB/blob/main/assets/impostos2.png">
</p>

## Introdução à API IBPT

O objetivo desta documentação é orientar o desenvolvedor sobre como integrar com a API IBPT PB, descrevendo os serviços disponíveis com exemplos de requisição e resposta.

## Características da Solução

A solução API IBPT PB foi desenvolvida com a tecnologia REST, que é padrão de mercado e independe da tecnologia utilizada pelo consumidor. Desta forma, é possível integrar-se utilizando as mais variadas linguagens de programação, tais como: Java, PHP, Ruby, Python e outras.

## Arquitetura da Integração

O modelo empregado na integração da API é simples e se baseia na utilização de uma URL

## Como utilizar

1. Combine a base da URL do ambiente com o endpoint e os parâmetros da operação desejada:
  * Ex.: https://api-ibpt.herokuapp.com/apiibpt/getImposto/87082993/PB/150.

2. Envie a requisição para a URL utilizando o método HTTP adequado à operação.


| MÉTODO HTTP | Descrição |
|-------------|------------------------------------------------------------------------------------------|
| GET         | Retorna recursos já existentes, ex.: consulta de imposto nacional, municipal e importato.|

## Requisição
(APENAS PARA UF PB)
https://api-ibpt.herokuapp.com/apiibpt/getImposto/{codigo}/{uf}/{valor}

### Dicionário

|Parâmetro | Descrição |
|----------|-----------|
|codigo    | É o NCM (Nomenclatura Comum do Mercosul) do produto que deseja consultar.|
|uf        | É a sigla do estado que deseja consultar o imposto (por enquanto a solução é apenas para o estado da Paraíba)|
|valor     | É o valor do produto que deseja consultar o imposto sobre o mesmo.|

## Resposta
```json
{
  "id": 9982,
  "uf": "PB",
  "codigo": "87082993",
  "ex": "",
  "tipo": "0",
  "descricao": "Portas p/veiculos automoveis",
  "nacionalfederal": 14.79,
  "importadosfederal": 21.09,
  "estadual": 27,
  "municipal": 0,
  "vigenciainicio": "01/11/2020",
  "vigenciafim": "31/01/2021",
  "chave": "5DC0AE",
  "versao": "20.2.C",
  "fonte": "IBPT/empresometro.com.br",
  "valor": 150,
  "valorTributoEstadual": 40.5,
  "valorTributoImportado": 31.64,
  "valorTributoMunicipal": 0,
  "valorTributoNacional": 22.19
}
```
