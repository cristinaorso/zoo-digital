package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Nado;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Peixe;

public final class Traira extends Peixe implements Nado, Predacao {

    public Traira(String nome, Integer idade) {
        super(nome, "Traíra", idade);
    }

    @Override
    public void comer() {
        this.comer("peixes menores");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está emitindo som de peixe!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando no rio!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando peixes menores!");
    }
}