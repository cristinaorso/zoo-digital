package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Mamifero;

public final class Cachorro extends Mamifero implements Corrida, Predacao {

    public Cachorro(String nome, Integer idade) {
        super(nome, "Cachorro", idade);
    }

    @Override
    public void comer() {
        this.comer("ração");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está latindo!");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando a meia que roubou!");
    }
}