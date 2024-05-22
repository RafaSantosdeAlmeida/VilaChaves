/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloPesonagens.personagem;

/**
 *
 * @author profslvo
 */
public class Vilao extends Personagem{

    public Vilao(String nome) {
        super(nome);
    }
    
    @Override
    public int atacar() {
        super.energia-=15;
        return 30;
    }
    
    public void falaVilao(){
        System.out.println("Ora seu, PUUUUMPALPU!!");
    }
    
}
