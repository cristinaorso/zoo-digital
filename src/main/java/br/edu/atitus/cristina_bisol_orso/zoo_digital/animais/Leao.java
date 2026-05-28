package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Mamifero;

public final class Leao extends Mamifero implements Corrida, Predacao {

    public Leao(String nome, Integer idade) {
        super(nome, "Leão", idade);
    }

    @Override
    public void comer() {
        this.comer("carne");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está rugindo!");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo pela savana!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando uma presa!");
    }
}