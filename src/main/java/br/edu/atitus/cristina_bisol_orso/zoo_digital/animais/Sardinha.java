package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Nado;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Peixe;

public final class Sardinha extends Peixe implements Nado {

    public Sardinha(String nome, Integer idade) {
        super(nome, "Sardinha", idade);
    }

    @Override
    public void comer() {
        this.comer("plâncton");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está fazendo bolhas!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando em cardume!");
    }
}