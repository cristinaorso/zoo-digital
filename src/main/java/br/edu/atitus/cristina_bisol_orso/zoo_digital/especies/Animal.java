package br.edu.atitus.cristina_bisol_orso.zoo_digital.especies;

public abstract class Animal {

    // Atributo estático compartilhado por todos os animais cadastrados
    private static int contador = 0;

    public static int getContador() {
        return contador;
    }

    public final String VERSAO_APP = "1.0";

    // Atributos encapsulados da classe Animal
    private String nome;
    private String especie;
    private Integer idade;

    // Construtor utilizado pelas classes filhas
    public Animal(String nome, String especie, Integer idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        Animal.contador++;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public Integer getIdade() {
        return idade;
    }

    // Método que pode ser sobrescrito pelas classes filhas
    public void comer() {
        this.comer("alguma coisa");
    }

    // Sobrecarga de método
    public final void comer(String alimento) {
        System.out.println(this.getNome() + " está comendo " + alimento);
    }

    // Representação textual do animal
    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "; Espécie: " + this.getEspecie() + "; Idade: " + this.getIdade() + " anos.";
    }

    // Método abstrato obrigatório para todas as classes concretas
    public abstract void emitirSom();
}