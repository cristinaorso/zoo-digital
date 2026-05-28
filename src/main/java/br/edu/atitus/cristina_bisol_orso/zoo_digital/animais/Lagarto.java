package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Reptil;

public final class Lagarto extends Reptil implements Corrida, Predacao {

    public Lagarto(String nome, Integer idade) {
        super(nome, "Lagarto", idade);
    }

    @Override
    public void comer() {
        this.comer("insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está emitindo som de lagarto!");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo sobre as pedras!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando insetos!");
    }
}