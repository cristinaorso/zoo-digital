package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Mamifero;

public final class Cavalo extends Mamifero implements Corrida {

    public Cavalo(String nome, Integer idade) {
        super(nome, "Cavalo", idade);
    }

    @Override
    public void comer() {
        this.comer("capim");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está relinchando!");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está galopando!");
    }
}