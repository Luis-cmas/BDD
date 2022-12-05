/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobdd;

import Conexion.Conexiones;
import java.sql.CallableStatement;
import java.sql.ResultSet;

import java.util.Scanner;

/**
 *
 * @author super
 */
public class main {
    public static void main(String[] args) {
        Conexiones bdd = new Conexiones();
        bdd.conectar();
        
        
        Scanner sn = new Scanner(System.in);
        boolean salir = true;
        int op;
        while (salir) {
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
         try{
            System.out.println("Escoga una opcion");
            op = sn.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Opcion 1 Total de las ventas de los productos por categoria");
                    System.out.println("introduzca la categoria:");
                    
                    //entrada de datos
                    Scanner sn2=new Scanner(System.in);
                    int categoria = sn.nextInt();
                    
                    //llamamos al procedimiento
                    CallableStatement statement = bdd.conectar().prepareCall("{call sp_consulta_A(?)}");
                    statement.setInt(1,categoria);//asignamos el primer(unico) parametro al procedimiento
                    statement.execute();//ejecutamos el procedimiento
                    ResultSet consulta =statement.getResultSet();//guardamos resultados
                    
                    //recorremos los resultados obtenidos del procedimiento
                    while(consulta.next()){
                        System.out.println("columna:"+consulta.getRow()+"\nTerritorioID:"+consulta.getString(1)+"\nVentas:"+consulta.getString(2)+"\n\n");
                    }
                    
                    System.out.println("/npresione una tecla para continuar");
                    Scanner sn22=new Scanner(System.in);
                    String relleno = sn.next();
                    break;


                case 2:
                    System.out.println("Opcion 2 Determinar el producto mas solicitado y en que territorio");
                    System.out.println("");
                    
                    break;

                case 3:
                    
                    System.out.println("Opcion 3 Actualizar el stock disponible en un 5% de los productos de una categoría");
                    System.out.println("Introduzca la categoria del producto");
                    Scanner sn3=new Scanner(System.in);
                    int cat3 = sn.nextInt();
                    System.out.println("Introduzca la localidad");
                    Scanner sn32=new Scanner(System.in);
                    int loc = sn.nextInt();
                    
                     //llamamos al procedimiento
                    CallableStatement statement3 = bdd.conectar().prepareCall("{call sp_consulta_C(?,?)}");
                    statement3.setInt(1,cat3);//asignamos el primer(unico) parametro al procedimiento
                    statement3.setInt(2,loc);
                    statement3.execute();//ejecutamos el procedimiento
                    ResultSet consulta3 =statement3.getResultSet();//guardamos resultados
                    
                    System.out.println("\nStock actualizado!");
                    
                    
                    break;

                case 4:
                    System.out.println("Opcion 4 Determinar si hay clientes de un territorio ");
                    System.out.println("introduzca el territorio:");
                    Scanner sn4=new Scanner(System.in);
                    int terri4 = sn.nextInt();
                    
                    CallableStatement statement4 = bdd.conectar().prepareCall("{call sp_consulta_D(?)}");
                    statement4.setInt(1,terri4);//asignamos el primer(unico) parametro al procedimiento
                    statement4.execute();//ejecutamos el procedimiento
                    ResultSet consulta4 =statement4.getResultSet();//guardamos resultados
                    
                    //recorremos los resultados obtenidos del procedimiento
                    while(consulta4.next()){
                        System.out.println("columna:"+consulta4.getRow()+"\nCustomerID:"+consulta4.getString(1)+"\n\n");
                    }
                    break;

                case 5:
                    System.out.println("Opcion 5 Actualizar la cantidad de productos de una orden");
                    System.out.println("Introduzca la cantidad del producto");
                    Scanner sn5=new Scanner(System.in);
                    int cant5 = sn.nextInt();
                    System.out.println("Introduzca la order id");
                    Scanner sn52=new Scanner(System.in);
                    int oid5 = sn.nextInt();
                    
                     //llamamos al procedimiento
                    CallableStatement statement5 = bdd.conectar().prepareCall("{call sp_consulta_C(?,?)}");
                    statement5.setInt(1,cant5);//asignamos el primer(unico) parametro al procedimiento
                    statement5.setInt(2,oid5);
                    statement5.execute();//ejecutamos el procedimiento
                    ResultSet consulta5 =statement5.getResultSet();//guardamos resultados
                    
                    System.out.println("\nOperacion realizada!");
                    
                    
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
                    salir = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida, por favor");

            }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
