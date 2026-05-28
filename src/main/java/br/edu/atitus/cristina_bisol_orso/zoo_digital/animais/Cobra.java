package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Reptil;

public final class Cobra extends Reptil implements Predacao {

    public Cobra(String nome, Integer idade) {
        super(nome, "Cobra", idade);
    }

    @Override
    public void comer() {
        this.comer("pequenos roedores");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está sibilando!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando silenciosamente!");
    }
}