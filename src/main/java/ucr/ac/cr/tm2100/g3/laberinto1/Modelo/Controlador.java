/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.laberinto1.Modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.tm2100.g3.laberinto1.Vista.GUIHistoria;
import ucr.ac.cr.tm2100.g3.laberinto1.Vista.GUIInstrucciones;
import ucr.ac.cr.tm2100.g3.laberinto1.Vista.GUIInterfaz;
import ucr.ac.cr.tm2100.g3.laberinto1.Vista.GUIMenu;

/**
 *
 * @author carlo
 */
public class Controlador implements ActionListener {
    
    private GUIHistoria guiHistoria;
    private GUIInstrucciones guiInstrucciones;
    private GUIInterfaz guiInterfaz;
    private GUIMenu guiMenu;
    public Controlador  (){

// Frames y instancias 

guiHistoria=new GUIHistoria();
guiInstrucciones= new GUIInstrucciones();
guiInterfaz=new GUIInterfaz();
guiMenu=new GUIMenu(this);

//Los botones y metodos 

  guiInstrucciones.escuchar(this);//Llamar escuchar creado en la clase instrucciones y realizar lo mismo en los demas
  guiInterfaz.escuchar(this);
  guiHistoria.escuchar(this);
  guiMenu.setVisible(true);
}
    
    public void actionPerformed(ActionEvent e) {
      switch(e.getActionCommand()){
          case  "Instrucciones":
              guiInstrucciones.setVisible(true);
              guiMenu.setVisible(false);
              break;
          case "Jugar":
              guiInterfaz.setVisible(true);
              guiMenu.setVisible(false);
              break;
          case"Historia":
             guiHistoria.setVisible(true);
             guiMenu.setVisible(false);
              break;
          case"Salir":
              System.exit(0);
              break;
          case "Salir de Instrucciones":
              guiInstrucciones.setVisible(false);
              guiMenu.setVisible(true);
              break;
          case "Salir de Interfaz":    
              guiInterfaz.setVisible(false);
              guiMenu.setVisible(true);
          case"Salir de Historia":
              guiHistoria.setVisible(false);
              guiMenu.setVisible(true);
              break;
         
              
      }
    
    
    
}
}