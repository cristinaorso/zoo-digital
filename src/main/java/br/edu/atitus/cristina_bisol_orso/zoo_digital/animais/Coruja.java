package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Voo;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Ave;

public final class Coruja extends Ave implements Voo, Predacao {

    public Coruja(String nome, Integer idade) {
        super(nome, "Coruja", idade);
    }

    @Override
    public void comer() {
        this.comer("pequenos roedores");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está piando durante a noite!");
    }

    @Override
    public void voar() {
        System.out.println(this.getNome() + " está voando silenciosamente!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando à noite!");
    }
}