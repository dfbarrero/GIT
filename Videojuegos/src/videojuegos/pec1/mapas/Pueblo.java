/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos.pec1.mapas;

import javax.swing.ImageIcon;

/**
 *
 * @author pedro
 */
public class Pueblo extends Terreno{

    public Pueblo(String nombre, int lvl, ImageIcon imagen) {
        super(nombre, lvl, imagen);
    }


    
    public void getContenido(){
        //aqui iria el menu del pueblo
    }
    
    public String toString(){
        return "Nombre: "+super.getNombre();
    }
}
