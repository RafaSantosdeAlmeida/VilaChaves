/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modeloPesonagens.personagem;

import modeloPesonagens.personagem.Vilao;

/**
 *
 * @author profslvo
 */
public class VilaChavosa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Heroi heroi = new Heroi("Chapolinho");
        Vilao vilao = new Vilao("Kikao");
        
        vilao.diminuirPontosVida(heroi.atacar());
        heroi.falarNomeAtaque();
        System.out.println("Vida do "+vilao.nome+": "+vilao.getPontosVida());
    }
    
}
