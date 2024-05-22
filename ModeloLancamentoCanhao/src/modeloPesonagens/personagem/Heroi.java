/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloPesonagens.personagem;

/**
 *
 * @author profslvo
 */
public class Heroi extends Personagem{

    public Heroi(String nome) {
        super(nome);
    }
    
    @Override
    public int atacar() {
        super.energia-=20;
        return 25;
    }
    
    public void falarNomeAtaque(){
        System.out.println("Nao contavam com a minha astucia, TONHONHONHONNNNN!!");
    }
    
}
