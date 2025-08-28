# 🛒 Sistema de E-commerce com POO

Este projeto consiste em um sistema simples de E-commerce desenvolvido utilizando os **4 pilares da Programação Orientada a Objetos (POO)**: encapsulamento, herança, polimorfismo e abstração.

## 📘 Cenário Proposto

Desenvolver um sistema que permita o cadastro de produtos, criação de clientes e administradores, gerenciamento de carrinho de compras e finalização de pedidos com diferentes formas de pagamento.

---

## 🧱 Estrutura de Classes

### 1. `Produto`
- **Atributos**:
  - `nome`
  - `preco`
  - `estoque`
- **Encapsulamento**:
  - Atributos privados
  - Getters e Setters
- **Método**:
  - `exibirInformacoes()`: Exibe os detalhes do produto

---

### 2. `Usuário` (Classe Base)
- **Atributos**:
  - `nome`
  - `email`
- **Método**:
  - `exibirInformacoes()`
- **Construtor**:
  - Inicializa os atributos comuns

---

### 3. `Cliente` (Herda de `Usuário`)
- **Atributo**:
  - `carrinho`: Lista de produtos
- **Métodos**:
  - `adicionarProduto(produto)`
  - `listarCarrinho()`

---

### 4. `Administrador` (Herda de `Usuário`)
- **Métodos**:
  - `cadastrarProduto(produto)`
  - `removerProduto(produto)`

---

### 5. `Pagamento` (Classe Abstrata)
- **Atributo**:
  - `valor`
- **Método Abstrato**:
  - `processarPagamento()`

---

### 6. `PagamentoCartao` e `PagamentoBoleto` (Herdam de `Pagamento`)
- Implementam o método `processarPagamento()` com comportamentos diferentes (**polimorfismo**)

---

## ⚙️ Funcionalidades Obrigatórias

O sistema deve permitir:

- ✅ Criar um administrador e **cadastrar/remover produtos** no catálogo.
- ✅ Criar um cliente.
- ✅ O cliente pode **visualizar produtos disponíveis** e **adicionar ao carrinho**.
- ✅ O cliente pode **finalizar a compra**, escolhendo entre **pagamento por cartão ou boleto**.
- ✅ O sistema **processa o pagamento utilizando polimorfismo**.
- ✅ Ao final, **exibir os detalhes do pedido** no console (ou interface).

---

## 💡 Conceitos de POO Aplicados

- **Encapsulamento**: Atributos privados com acesso por getters/setters.
- **Herança**: Cliente e Administrador herdam da classe Usuário.
- **Polimorfismo**: Classes de pagamento implementam o método de forma distinta.
- **Abstração**: Classe `Pagamento` como base abstrata para outras formas de pagamento.

---

## 🚀 Como Executar

1. Clone este repositório.
2. Compile e execute o código principal.
3. Interaja com o sistema por meio do console (ou interface, se houver).
4. Acompanhe os detalhes da execução conforme os comportamentos esperados.

---

## 🧑‍💻 Contribuição

Sinta-se à vontade para contribuir com melhorias, refatorações ou novas funcionalidades!

---

## 📄 Licença

Este projeto é apenas para fins educacionais e não possui licença específica.