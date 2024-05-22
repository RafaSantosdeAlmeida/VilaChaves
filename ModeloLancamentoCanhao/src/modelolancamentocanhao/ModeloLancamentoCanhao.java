/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelolancamentocanhao;

/**
 *
 * @author profslvo
 */
public class ModeloLancamentoCanhao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Canhao canhao = new Canhao();
        canhao.setBala();
        canhao.disparar(50, 45);
        canhao.setBala();
        canhao.disparar(45, 90);
        canhao.setBala();
        canhao.disparar(100, 0);
        canhao.setBala();
        canhao.disparar(30, 17);
        canhao.setBala();
        canhao.disparar(80, 45);
    }
    
}
