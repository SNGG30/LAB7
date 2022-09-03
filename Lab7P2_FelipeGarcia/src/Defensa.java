/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Defensa extends Plantas{
    
    int Altura;
    int Peso;
    int Dureza;

    public Defensa() {
    }
    public Defensa(int Altura, int Peso, int Dureza, String Rango, String Nombre, int Ataque, int vida) {
        super(Rango, Nombre, Ataque, vida);
        this.Altura = Altura;
        this.Peso = Peso;
        this.Dureza = Dureza;
    }

    public int getAltura() {
        return Altura;
    }
    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public int getPeso() {
        return Peso;
    }
    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public int getDureza() {
        return Dureza;
    }
    public void setDureza(int Dureza) {
        this.Dureza = Dureza;
    }

    @Override
    public String toString() {
        return "Nombre=" + getNombre() + " Rango=" + getRango() + " Ataque=" + getAtaque() + " Vida=" + getVida() + " Defensa:(Altura=" + Altura + " Peso=" + Peso + " Dureza=" + Dureza + ")";
    }
}
