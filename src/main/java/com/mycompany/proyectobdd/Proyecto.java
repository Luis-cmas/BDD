/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobdd;

import java.util.Scanner;

/**
 *
 * @author Equipo 9
 */
public class main {
    public static void main (String[] args){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int op;
        while (!salir) {
            System.out.println("Bienvenido, ¿Qué desea?");
            System.out.println("1)Determinar el total de las ventas de los productos de una categoría ");
            System.out.println("2)Determinar el producto más solicitado para la región y en que territorio de la región tiene mayor demanda");
            System.out.println("3)Actualizar el stock disponible en un 5% de los productos de una categoría");
            System.out.println("4)Determinar si hay clientes de un territorio que se especifique ");
            System.out.println("5)Actualizar la cantidad de productos de una orden");
            System.out.println("6)Actualizar el método de envío de una orden que se reciba");
            System.out.println("7)Actualizar el correo electrónico de una cliente que se reciba");
            System.out.println("8)Determinar el empleado que atendió más ordenes por territorio/región");
            System.out.println("9)Determinar cual es el total de las ventas en cada una de las regiones por un rango de fechas establecidas");
            System.out.println("10)Determinar los 5 productos menos vendidos en un rango de fecha establecido ");
            System.out.println("11.-Salir");

            System.out.println("Escoga una opcion");
            op=sn.nextInt();
            switch (op){
                case 1:
                    System.out.println("Opcion 1 Total de las ventas de los productos por categoria");
                    break;

                case 2:
                    System.out.println("Opcion 2 Determinar el producto mas solicitado y en que territorio");

                    break;

                case 3:
                    System.out.println("Opcion 3 Actualizar el stock disponible en un 5% de los productos de una categoría");

                    break;

                case 4:
                    System.out.println("Opcion 4 Determinar si hay clientes de un territorio ");
                    break;

                case 5:
                    System.out.println("Opcion 5 Actualizar la cantidad de productos de una orden");
                    break;

                case 6:
                    System.out.println("Opcion 6 Actualizar el método de envío de una orden que se reciba");
                    break;

                case 7:
                    System.out.println("Opcion 7 Actualizar el correo electrónico de una cliente que se reciba");
                    break;

                case 8:
                    System.out.println("Opcion 8 Determinar el empleado que atendió más ordenes por territorio/región");
                    break;

                case 9:
                    System.out.println("Opcion 9 Determinar cual es el total de las ventas en cada una de las regiones");
                    break;

                case 10:
                    System.out.println("Opcion 10 Determinar los 5 productos menos vendidos en un rango de fecha establecido");
                    break;

                case 11:
                    salir=true;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida, por favor");

            }
        }
    }
}
