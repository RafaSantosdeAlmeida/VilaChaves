/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelolancamentocanhao;

/**
 *
 * @author profslvo
 */
public class Canhao {
    
    private Bala bala;
    
    public void disparar(double velocidade, double angulo){
        bala.setPosicaoX(getAlcanceMaximo(velocidade,angulo));
        System.out.println("Alcance maximo: "+bala.getPosicaoX());
    }

    private double getAlcanceMaximo(double velocidade, double angulo){
        return ((2*Math.pow(velocidade,2))*
                (Math.cos(Math.toRadians(angulo))*Math.sin(Math.toRadians(angulo))/9.81)
               );
    }
    
    public void setBala() {
        this.bala = new Bala();
    }
    
}
