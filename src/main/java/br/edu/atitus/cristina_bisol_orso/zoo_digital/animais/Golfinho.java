package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Nado;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Mamifero;

public final class Golfinho extends Mamifero implements Nado {

    public Golfinho(String nome, Integer idade) {
        super(nome, "Golfinho", idade);
    }

    @Override
    public void comer() {
        this.comer("peixes");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está assobiando!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando feliz!");
    }
}