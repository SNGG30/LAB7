/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Entidades {
    
    String Nombre;
    int Ataque;
    int vida;

    public Entidades() {
    }
    public Entidades(String Nombre, int Ataque, int vida) {
        this.Nombre = Nombre;
        this.Ataque = Ataque;
        this.vida = vida;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAtaque() {
        return Ataque;
    }
    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Entidades{" + "Nombre=" + Nombre + ", Ataque=" + Ataque + ", vida=" + vida + '}';
    }
    
    
}
