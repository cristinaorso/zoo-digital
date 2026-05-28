package br.edu.atitus.cristina_bisol_orso.zoo_digital.app;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.animais.*;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.*;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDigitalApp {

    // Lista que armazena todos os animais cadastrados durante a execução
    private List<Animal> animais = new ArrayList<>();

    // Scanner utilizado para ler as opções digitadas pelo usuário
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ZooDigitalApp app = new ZooDigitalApp();
        app.executar();
    }

    public void executar() {
        int opcao;

        do {
            System.out.println("\nZoo Digital");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Listar Todos Animais");
            System.out.println("3 - Listar Animais Corredores");
            System.out.println("4 - Listar Animais Nadadores");
            System.out.println("5 - Listar Animais Voadores");
            System.out.println("6 - Listar Animais Predadores");
            System.out.println("7 - Exibir Total de Animais");
            System.out.println("0 - Sair");
            IO.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarAnimal();
                case 2 -> listarTodos();
                case 3 -> listarCorredores();
                case 4 -> listarNadadores();
                case 5 -> listarVoadores();
                case 6 -> listarPredadores();
                case 7 -> System.out.println("Total de animais: " + Animal.getContador());
                case 0 -> System.out.println("Encerrando o sistema.");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    private void cadastrarAnimal() {
        System.out.println("\nEscolha o animal:");
        System.out.println("1 - Cachorro");
        System.out.println("2 - Gato");
        System.out.println("3 - Golfinho");
        System.out.println("4 - Pato");
        System.out.println("5 - Pinguim");
        System.out.println("6 - Peixe-morcego");
        System.out.println("7 - Traíra");
        System.out.println("8 - Cobra");
        System.out.println("9 - Jacaré");
        System.out.println("10 - Tartaruga");
        System.out.println("11 - Lagarto");
        System.out.println("12 - Leão");
        System.out.println("13 - Cavalo");
        System.out.println("14 - Águia");
        System.out.println("15 - Coruja");
        System.out.println("16 - Tubarão");
        System.out.println("17 - Sardinha");

        IO.print("Opção: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        IO.print("Nome: ");
        String nome = scanner.nextLine();

        IO.print("Idade: ");
        Integer idade = scanner.nextInt();
        scanner.nextLine();

        Animal animal = null;

        switch (tipo) {
            case 1 -> animal = new Cachorro(nome, idade);
            case 2 -> animal = new Gato(nome, idade);
            case 3 -> animal = new Golfinho(nome, idade);
            case 4 -> animal = new Pato(nome, idade);
            case 5 -> animal = new Pinguim(nome, idade);
            case 6 -> animal = new PeixeMorcego(nome, idade);
            case 7 -> animal = new Traira(nome, idade);
            case 8 -> animal = new Cobra(nome, idade);
            case 9 -> animal = new Jacare(nome, idade);
            case 10 -> animal = new Tartaruga(nome, idade);
            case 11 -> animal = new Lagarto(nome, idade);
            case 12 -> animal = new Leao(nome, idade);
            case 13 -> animal = new Cavalo(nome, idade);
            case 14 -> animal = new Aguia(nome, idade);
            case 15 -> animal = new Coruja(nome, idade);
            case 16 -> animal = new Tubarao(nome, idade);
            case 17 -> animal = new Sardinha(nome, idade);
            default -> System.out.println("Tipo inválido.");
        }

        if (animal != null) {
            animais.add(animal);
            System.out.println("Animal cadastrado com sucesso.");
        }
    }

    private void listarTodos() {
        for (Animal animal : animais) {
            System.out.println(animal.toString());
            animal.comer();
            animal.emitirSom();
        }
    }

    private void listarCorredores() {
        for (Animal animal : animais) {
            if (animal instanceof Corrida) {
                System.out.println(animal.toString());
                ((Corrida) animal).correr();
            }
        }
    }

    private void listarNadadores() {
        for (Animal animal : animais) {
            if (animal instanceof Nado) {
                System.out.println(animal.toString());
                ((Nado) animal).nadar();
            }
        }
    }

    private void listarVoadores() {
        for (Animal animal : animais) {
            if (animal instanceof Voo) {
                System.out.println(animal.toString());
                ((Voo) animal).voar();
            }
        }
    }

    private void listarPredadores() {
        for (Animal animal : animais) {
            if (animal instanceof Predacao) {
                System.out.println(animal.toString());
                ((Predacao) animal).cacar();
            }
        }
    }
}