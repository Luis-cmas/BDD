/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobdd;

import Conexion.Conexiones;

/**
 *
 * @author super
 */
public class main {
    public static void main(String[] args) {
        Conexiones bdd = new Conexiones();
        bdd.conectar();
    }
}
