# Zoo Digital

Projeto desenvolvido para a atividade avaliativa de Programação Orientada a Objetos em Java.

## Aluna

Cristina Bisol Orso  
RA: 1139000

## Objetivo

O sistema tem como objetivo realizar o cadastro e a consulta de animais por meio de uma interface de linha de comando, aplicando conceitos de Programação Orientada a Objetos.

## Conceitos aplicados

- Herança
- Polimorfismo
- Classes abstratas
- Interfaces
- Casting
- Encapsulamento
- Modificadores de acesso
- Atributo e método `static`
- Sobrescrita de métodos
- Sobrecarga de métodos
- Organização de pacotes
- Projeto Maven

## Estrutura do projeto

O projeto foi organizado nos seguintes pacotes:

- `animais`: contém as classes concretas dos animais.
- `especies`: contém as classes abstratas `Animal`, `Mamifero`, `Ave`, `Peixe` e `Reptil`.
- `comportamentos`: contém as interfaces `Corrida`, `Nado`, `Voo` e `Predacao`.
- `app`: contém a classe principal `ZooDigitalApp`, responsável pela execução do sistema.

## Funcionalidades

O menu do sistema permite:

1. Cadastrar animal
2. Listar todos os animais
3. Listar animais corredores
4. Listar animais nadadores
5. Listar animais voadores
6. Listar animais predadores
7. Exibir o total de animais cadastrados

## Animais implementados

### Mamíferos

- Cachorro
- Gato
- Golfinho
- Leão
- Cavalo

### Aves

- Pato
- Pinguim
- Águia
- Coruja

### Peixes

- Peixe-morcego
- Traíra
- Tubarão
- Sardinha

### Répteis

- Cobra
- Jacaré
- Tartaruga
- Lagarto

## Observação sobre saída no terminal

O projeto utiliza `System.out.println` e `System.out.print` para saída de dados no terminal, garantindo compatibilidade com a execução padrão do Java no IntelliJ IDEA.

## Como executar

1. Abrir o projeto no IntelliJ IDEA.
2. Carregar o projeto Maven.
3. Executar a classe `ZooDigitalApp`.
4. Utilizar o menu exibido no terminal.

## Tecnologias utilizadas

- Java
- Maven
- IntelliJ IDEA
- GitHub

---

# Zoo Digital

Project developed for the Object-Oriented Programming assessment activity in Java.

## Student

Cristina Bisol Orso  
Student ID: 1139000

## Objective

The system aims to register and consult animals through a command-line interface, applying Object-Oriented Programming concepts.

## Applied Concepts

- Inheritance
- Polymorphism
- Abstract classes
- Interfaces
- Casting
- Encapsulation
- Access modifiers
- `static` attribute and method
- Method overriding
- Method overloading
- Package organization
- Maven project structure

## Project Structure

The project is organized into the following packages:

- `animais`: contains the concrete animal classes.
- `especies`: contains the abstract classes `Animal`, `Mamifero`, `Ave`, `Peixe`, and `Reptil`.
- `comportamentos`: contains the interfaces `Corrida`, `Nado`, `Voo`, and `Predacao`.
- `app`: contains the main class `ZooDigitalApp`, responsible for running the system.

## Features

The system menu allows the user to:

1. Register an animal
2. List all animals
3. List running animals
4. List swimming animals
5. List flying animals
6. List predator animals
7. Display the total number of registered animals

## Implemented Animals

### Mammals

- Dog
- Cat
- Dolphin
- Lion
- Horse

### Birds

- Duck
- Penguin
- Eagle
- Owl

### Fish

- Batfish
- Traíra
- Shark
- Sardine

### Reptiles

- Snake
- Alligator
- Turtle
- Lizard

## Note About Terminal Output

The project uses `System.out.println` and `System.out.print` for terminal output, ensuring compatibility with standard Java execution in IntelliJ IDEA.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Load the Maven project.
3. Run the `ZooDigitalApp` class.
4. Use the menu displayed in the terminal.

## Technologies Used

- Java
- Maven
- IntelliJ IDEA
- GitHub
