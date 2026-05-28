package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Nado;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Reptil;

public final class Jacare extends Reptil implements Nado, Predacao {

    public Jacare(String nome, Integer idade) {
        super(nome, "Jacaré", idade);
    }

    @Override
    public void comer() {
        this.comer("peixes e aves");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está rugindo baixo!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando no pântano!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando na água!");
    }
}