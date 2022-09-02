/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Disparo extends Plantas{
    
    String NombreP;
    String Color;

    public Disparo() {
    }
    public Disparo(String NombreP, String Color, String Rango, String Nombre, int Ataque, int vida) {
        super(Rango, Nombre, Ataque, vida);
        this.NombreP = NombreP;
        this.Color = Color;
    }

    public String getNombreP() {
        return NombreP;
    }
    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public String getColor() {
        return Color;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Nombre=" + getNombre() + " Rango=" + getRango() + " Ataque=" + getAtaque() + " Vida=" + getVida() + " Disparo:(Proyectil=" + getNombreP() + " Color=" + getColor() + ")";
    }
}
