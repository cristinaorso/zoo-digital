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
