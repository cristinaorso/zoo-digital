package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Mamifero;

public final class Gato extends Mamifero implements Corrida, Predacao {

    public Gato(String nome, Integer idade) {
        super(nome, "Gato", idade);
    }

    @Override
    public void comer() {
        this.comer("ração de gato");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está miando!");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo silenciosamente!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando um rato!");
    }
}