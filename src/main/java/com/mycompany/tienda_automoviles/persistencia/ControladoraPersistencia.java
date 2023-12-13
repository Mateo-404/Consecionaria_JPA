/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda_automoviles.persistencia;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.tienda_automoviles.logica.Automovil;
import com.mycompany.tienda_automoviles.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Gary
 */
public class ControladoraPersistencia {
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void crearAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public void eliminarAutomovil(int id) {
        try {
            autoJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        }
    }

    public Automovil buscarAutomovil(int id) {
        return autoJpa.findAutomovil(id);
    }

    public ArrayList<Automovil> buscarTodosAutomoviles() {
        List<Automovil> autoss = autoJpa.findAutomovilEntities();
        ArrayList<Automovil> autos = new ArrayList<>(autoss);
        return autos;
    }

    public void modificarAutomovil(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
