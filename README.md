# 📌 Projeto contador com exceção personalizada em Java

## 📖 Descrição do projeto

Este projeto consiste em uma aplicação Java simples que realiza uma contagem entre dois números inteiros fornecidos pelo usuário. O programa incorpora conceitos importantes como:

✅ **Tratamento de exceções personalizadas**  
✅ **Boas Práticas de Programação Orientada a Objetos**  
✅ **Validação de entradas do usuário**  

A principal característica do projeto é a implementação de uma classe de exceção personalizada chamada `ParametrosInvalidosException`, que é lançada quando o primeiro parâmetro é maior que o segundo, indicando uma entrada inválida.

---

## ⚙️ Funcionalidades

- 📥 **Solicitação de entrada ao usuário**: O programa pede ao usuário que insira dois números inteiros.
- ✅ **Validação dos parâmetros**: Verifica se o primeiro número é menor que o segundo.
- 🔢 **Contagem personalizada**: Realiza a contagem crescente a partir do primeiro número até o segundo número.
- 🚨 **Tratamento de exceções**: Lança e captura uma exceção personalizada caso os parâmetros sejam inválidos.
- 💬 **Mensagens informativas**: Exibe mensagens claras para o usuário sobre o status da operação.

---

## 🏗️ Estrutura do projeto

📂 **Classe `ParametrosInvalidosException`**  
Exceção personalizada que estende `Exception`. Possui construtores que permitem mensagens padrão e detalhadas, incluindo os valores fornecidos pelo usuário.

📂 **Classe `Contador` (Classe principal)**  
Contém o método `main`, responsável por executar o fluxo do programa, solicitar as entradas do usuário e tratar as possíveis exceções.

---

## 🚀 Como executar o projeto

```bash
# Clone o Repositório, Compile e Execute o Código:
git clone https://github.com/leonardolginfo/DesafioControleFluxoDIOJava
cd DesafioControleFluxoDIOJava
javac ParametrosInvalidosException.java Contador.java
java Contador
