/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Cargado extends Zombies{
    
    int tamaño;
    int edad;
    int enojo;

    public Cargado() {
    }
    public Cargado(int tamaño, int edad, int enojo, String Nombre, int Ataque, int vida) {
        super(Nombre, Ataque, vida);
        this.tamaño = tamaño;
        this.edad = edad;
        this.enojo = enojo;
    }

    public int getTamaño() {
        return tamaño;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEnojo() {
        return enojo;
    }
    public void setEnojo(int enojo) {
        this.enojo = enojo;
    }

    @Override
    public String toString() {
        return "Cargado{" + "tama\u00f1o=" + tamaño + ", edad=" + edad + ", enojo=" + enojo + '}';
    }
}
