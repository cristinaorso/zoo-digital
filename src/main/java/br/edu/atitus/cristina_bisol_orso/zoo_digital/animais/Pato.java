package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Nado;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Voo;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Ave;

public final class Pato extends Ave implements Corrida, Nado, Voo {

    public Pato(String nome, Integer idade) {
        super(nome, "Pato", idade);
    }

    @Override
    public void comer() {
        this.comer("sementes");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está grasnando!");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está caminhando rapidamente!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando no lago!");
    }

    @Override
    public void voar() {
        System.out.println(this.getNome() + " está voando!");
    }
}