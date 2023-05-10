package com.mycompany.exercicio1override;

/**
 *
 * @author aluno
 */
public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("O gato miiiiiiiiiaaaaaaaaaaaaaaaaaaaaaaaaaaauuuuuuuuu");
    }

    @Override
    public void mover() {
        System.out.println("Ligou o seu carro e foi embora");
    }
}
