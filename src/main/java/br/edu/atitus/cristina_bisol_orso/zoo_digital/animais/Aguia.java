package br.edu.atitus.cristina_bisol_orso.zoo_digital.animais;

import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Voo;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.cristina_bisol_orso.zoo_digital.especies.Ave;

public final class Aguia extends Ave implements Voo, Predacao {

    public Aguia(String nome, Integer idade) {
        super(nome, "Águia", idade);
    }

    @Override
    public void comer() {
        this.comer("pequenos animais");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está piando!");
    }

    @Override
    public void voar() {
        System.out.println(this.getNome() + " está voando alto!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando do alto!");
    }
}