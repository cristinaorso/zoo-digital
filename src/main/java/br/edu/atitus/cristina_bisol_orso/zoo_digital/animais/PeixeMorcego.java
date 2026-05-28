package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Nado;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Peixe;

public final class PeixeMorcego extends Peixe implements Nado {

    public PeixeMorcego(String nome, Integer idade) {
        super(nome, "Peixe-morcego", idade);
    }

    @Override
    public void comer() {
        this.comer("pequenos crustáceos");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está fazendo bolhas na água!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando no fundo do mar!");
    }
}