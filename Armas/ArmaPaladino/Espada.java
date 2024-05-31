package Armas.ArmaPaladino;
/*
 * Definindo uma classe concreta que estende a classe ArmaPaladino
 * Essa é uma das Armas do Paladino
 */

// package nome pasta (Armas) 
// package nome pasta maior.nome subpasta (Armas.ArmasClerigo)

public class Espada extends ArmaPaladino{
    
    /*
     * Construtor da classe
     */
    public Espada(){

        /*
         * Invocando o Construtor da super classe (no caso, ArmaPaladino);
         */
        super("Espada", 0.3);

    }
}
