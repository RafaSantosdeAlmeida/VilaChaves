/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloPesonagens.personagem;

/**
 *
 * @author profslvo
 */
public abstract class Personagem {
    
    public String nome;
    public int pontosVida,energia;
    
    public Personagem(String nome){
        this.nome = nome;
        energia = 100;
        pontosVida = 100;
    }

    public int getPontosVida() {
        return pontosVida;
    }
    
    public abstract int atacar();
    
    public void diminuirPontosVida(int danoRecebido){
        pontosVida-=danoRecebido;
    }
    
}
