/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Clasico extends Zombies{
    
    int exp;
    Bandera b;

    public Clasico() {
    }
    public Clasico(int exp, Bandera b, String Nombre, int Ataque, int vida) {
        super(Nombre, Ataque, vida);
        this.exp = exp;
        this.b = b;
    }

    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }

    public Bandera getB() {
        return b;
    }
    public void setB(Bandera b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Nombre=" + getNombre() + " Ataque=" + getAtaque() + " Vida=" + getVida() + " Clasico:(Años de experiencia:" + exp + " Bandera=" + b + ")";
    }
    
    
}
