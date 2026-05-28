package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Nado;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Ave;

public final class Pinguim extends Ave implements Nado, Predacao {

    public Pinguim(String nome, Integer idade) {
        super(nome, "Pinguim", idade);
    }

    @Override
    public void comer() {
        this.comer("peixes pequenos");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está emitindo som de pinguim!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando no gelo!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando krill no gelo!");
    }
}