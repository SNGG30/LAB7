/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Plantas extends Entidades{
    
    String Rango;

    public Plantas() {
    }
    public Plantas(String Rango, String Nombre, int Ataque, int vida) {
        super(Nombre, Ataque, vida);
        this.Rango = Rango;
    }

    public String getRango() {
        return Rango;
    }
    public void setRango(String Rango) {
        this.Rango = Rango;
    }

    @Override
    public String toString() {
        return "Plantas{" + "Rango=" + Rango + '}';
    }
}
