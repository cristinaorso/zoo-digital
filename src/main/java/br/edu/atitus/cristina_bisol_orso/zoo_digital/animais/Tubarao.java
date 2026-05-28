package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Nado;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Peixe;

public final class Tubarao extends Peixe implements Nado, Predacao {

    public Tubarao(String nome, Integer idade) {
        super(nome, "Tubarão", idade);
    }

    @Override
    public void comer() {
        this.comer("peixes grandes");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está se movimentando em silêncio!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando rapidamente!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando no oceano!");
    }
}