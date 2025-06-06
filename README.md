# Conversor de Unidades com Classes Abstratas em Java

### 📋 Descrição do Projeto

O sistema consiste em um conversor de unidades desenvolvido em Java utilizando o conceito de classes abstratas.

#### Classe Abstrata ConversorUnidades:

Define a estrutura comum para conversores de unidades.

Métodos:
- converter(double valor): abstrato, responsável pela conversão de valores.
- getDescricao(): abstrato, retorna a descrição da conversão.

Atributo:
- descricao: descrição da conversão.

#### Classe Main:

Permite a execução do sistema e demonstra o uso da classe abstrata com diferentes conversores concretos.

Conversores Implementados:
- Quilômetros para Milhas
- Celsius para Fahrenheit
- Quilogramas para Libras

Cada conversor concreto herda de ConversorUnidades e implementa suas próprias regras de conversão.

### 🔧 Pré-requisitos

- Java JDK 8 ou superior
- Eclipse IDE (ou outra IDE Java de sua preferência)
  
### 🚀 Instalação e execução

1. Clone o repositório:

```
git clone https://github.com/seu-usuario/CLASSE_ESTATICA
```

2. Importe o projeto no Eclipse:
- File → Import → Existing Projects into Workspace
- Selecione a pasta do projeto clonado

3. Execute a classe Main localizada no pacote Main para ver a demonstração do sistema.

### 🛠️ Funcionalidades Implementadas

- Conversão de diferentes unidades com base em classes abstratas
- Arquitetura flexível para adicionar novos conversores
- Exibição de descrições das conversões realizadas

### 📝 Exemplo de Saída

Ao executar a classe Main, você verá uma demonstração das operações para ambos os tipos de conta, mostrando:

```
Celsius para Fahreinheit
30 Graus Celsius são 86.0 Fahreinheit

KM para Milhas
15 KM são 9.320565 Milhas

Gramas para Libras
40 Gramas são 0.08818480000000001 Libras
```

## ✒️ Autores

* **Mateus Franco Bezerra** - CLASSE ESTATICA 
