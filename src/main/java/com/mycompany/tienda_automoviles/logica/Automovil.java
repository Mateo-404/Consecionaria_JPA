/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda_automoviles.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automovil implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Basic
    private String marca;
    private String modelo;
    private String color;
    private String patente;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, String color, String patente) {
        this.marca = marca.toUpperCase();
        this.modelo = modelo.toUpperCase();
        this.color = color.toUpperCase();
        this.patente = patente.toUpperCase();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca.toUpperCase();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.toUpperCase();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color.toUpperCase();
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente.toUpperCase();
    }

    @Override
    public String toString() {
        return "Automovil [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", patente="
                + patente + "]";
    }
    
    
}
