/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Bandera {
    
    String color;
    String img;

    public Bandera() {
    }
    public Bandera(String color, String img) {
        this.color = color;
        this.img = img;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Bandera{" + "color=" + color + ", img=" + img + '}';
    }
}
