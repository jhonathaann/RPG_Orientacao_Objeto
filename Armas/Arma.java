package Armas;
/*
 * Definindo a classe abstrata Arma
 * essa Classe precisa de um objeto do tipo "Personagem" para existir
 */

public abstract class Arma {
    
    /*
     * Defindo os atributos de instândia da classe
     */
    private String nome;
    private double modDano;

    /*
     * Construtor da Classe
     */
    public Arma (String nome, double modificador){
        this.nome = nome;
        modDano = modificador;
    }

    /*
     * Método publico que retorna o nome da arma
     */
    public String getNome(){
        return nome;
    }

    /*
     * Método público que retorna o dano que a arma causa
     */
    public double getModificadorDano(){
        return modDano;
    }
}
