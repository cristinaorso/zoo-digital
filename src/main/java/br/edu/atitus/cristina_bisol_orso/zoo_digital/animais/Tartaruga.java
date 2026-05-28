package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Nado;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Reptil;

public final class Tartaruga extends Reptil implements Nado {

    public Tartaruga(String nome, Integer idade) {
        super(nome, "Tartaruga", idade);
    }

    @Override
    public void comer() {
        this.comer("folhas e frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está emitindo um som baixo!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando lentamente!");
    }
}