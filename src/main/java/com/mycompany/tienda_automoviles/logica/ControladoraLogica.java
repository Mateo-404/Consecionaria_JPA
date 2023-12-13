/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda_automoviles.logica;

import java.util.ArrayList;

import com.mycompany.tienda_automoviles.persistencia.ControladoraPersistencia;

/**
 *
 * @author Gary
 */
public class ControladoraLogica {
    ControladoraPersistencia controladora = new ControladoraPersistencia();
    
    public void crearAutomovil (Automovil auto){
        controladora.crearAutomovil(auto);
    }

    public void eliminarAutomovil (int id){
        controladora.eliminarAutomovil(id);
    }

    public void modificarAutomovil (Automovil auto){
        controladora.modificarAutomovil(auto);
    }

    public Automovil buscarAutomovil(int id){
        return controladora.buscarAutomovil(id);
    }

    public ArrayList<Automovil> buscarTodosAutomoviles(){
        return controladora.buscarTodosAutomoviles();
    }
}
