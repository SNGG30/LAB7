/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Explosiva extends Plantas{
    
    int Magnitud;

    public Explosiva() {
    }
    public Explosiva(int Magnitud, String Rango, String Nombre, int Ataque, int vida) {
        super(Rango, Nombre, Ataque, vida);
        this.Magnitud = Magnitud;
    }

    public int getMagnitud() {
        return Magnitud;
    }
    public void setMagnitud(int Magnitud) {
        this.Magnitud = Magnitud;
    }

    @Override
    public String toString() {
        return "Explosiva{" + "Magnitud=" + Magnitud + '}';
    }
}
