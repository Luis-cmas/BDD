/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectobdd;

import Conexion.Conexiones;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author M4I_I
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);//Colooca la ventana en medio de la pantalla
        setTitle("Adventure");//Cambia el titulo del frame
        
        
    }
    
    void defaultModel(){
        jText_Categoria.setEnabled(false);
        jText_Localidad.setEnabled(false);
        jText_Cantidad.setEnabled(false);
        jText_Apellido.setEnabled(false);
        jText_Correo.setEnabled(false);
        jText_Metodo.setEnabled(false);
        jText_Nombre.setEnabled(false);
        jText_Territorio.setEnabled(false);
        jText_Orden.setEnabled(false);
        jText_FechaE.setEnabled(false);
        jText_FechaS.setEnabled(false);
    }
    
    void limpiar(){
          jText_Categoria.setText("");
          jText_Localidad.setText("");
          jText_Cantidad.setText("");
          jText_Apellido.setText("");
          jText_Correo.setText("");
          jText_Metodo.setText("");
          jText_Nombre.setText("");
          jText_Territorio.setText("");
          jText_Orden.setText("");
    }
    
    void modeloConsulta1(){
        DefaultTableModel C1= new DefaultTableModel();
        String[] col1= new String []{"Territorio ID","Ventas"};
        C1.setColumnIdentifiers(col1);
        jTableDatos.setModel(C1);
        jText_Categoria.setEnabled(true);
        jText_Localidad.setEnabled(false);
        jText_Cantidad.setEnabled(false);
        jText_Apellido.setEnabled(false);
        jText_Correo.setEnabled(false);
        jText_Metodo.setEnabled(false);
        jText_Nombre.setEnabled(false);
        jText_Territorio.setEnabled(false);
        jText_Orden.setEnabled(false);
        jText_FechaE.setEnabled(false);
        jText_FechaS.setEnabled(false);
        
    }
    void modeloConsulta2(){
        DefaultTableModel C2= new DefaultTableModel();
        String[] col2= new String []{"Territorio ID","Ventas"};
        C2.setColumnIdentifiers(col2);
        jTableDatos.setModel(C2); 
        jText_Categoria.setEnabled(false);
        jText_Localidad.setEnabled(false);
        jText_Cantidad.setEnabled(false);
        jText_Apellido.setEnabled(false);
        jText_Correo.setEnabled(false);
        jText_Metodo.setEnabled(false);
        jText_Nombre.setEnabled(false);
        jText_Territorio.setEnabled(false);
        jText_Orden.setEnabled(false);
        jText_FechaE.setEnabled(false);
        jText_FechaS.setEnabled(false);
        
    }
    void modeloConsulta3(){
        
    }
    void modeloConsulta4(){
        DefaultTableModel C4= new DefaultTableModel();
        String[] col4= new String []{"Customer ID"};
        C4.setColumnIdentifiers(col4);
        jTableDatos.setModel(C4); 
        jText_Categoria.setEnabled(false);
        jText_Localidad.setEnabled(false);
        jText_Cantidad.setEnabled(false);
        jText_Apellido.setEnabled(false);
        jText_Correo.setEnabled(false);
        jText_Metodo.setEnabled(false);
        jText_Nombre.setEnabled(false);
        jText_Territorio.setEnabled(true);
        jText_Orden.setEnabled(false);
        jText_FechaE.setEnabled(false);
        jText_FechaS.setEnabled(false);
        
    }
    void modeloConsulta5(){
        
    }
    void modeloConsulta6(){
        
    }
    void modeloConsulta7(){
        
    }
    void modeloConsulta8(){
        DefaultTableModel C8= new DefaultTableModel();
        String[] col8= new String []{"Territorio ID","SalesPersonID","Nombre","Apellidos","Total de pedidos"};
        C8.setColumnIdentifiers(col8);
        jTableDatos.setModel(C8); 
        jText_Categoria.setEnabled(false);
        jText_Localidad.setEnabled(false);
        jText_Cantidad.setEnabled(false);
        jText_Apellido.setEnabled(false);
        jText_Correo.setEnabled(false);
        jText_Metodo.setEnabled(false);
        jText_Nombre.setEnabled(false);
        jText_Territorio.setEnabled(false);
        jText_Orden.setEnabled(false);
        jText_FechaE.setEnabled(false);
        jText_FechaS.setEnabled(false);
        
    }
    void modeloConsulta9(){
        DefaultTableModel C9= new DefaultTableModel();
        String[] col9= new String []{"Territorio ID","Total de Ventas"};
        C9.setColumnIdentifiers(col9);
        jTableDatos.setModel(C9); 
        jText_Categoria.setEnabled(false);
        jText_Localidad.setEnabled(false);
        jText_Cantidad.setEnabled(false);
        jText_Apellido.setEnabled(false);
        jText_Correo.setEnabled(false);
        jText_Metodo.setEnabled(false);
        jText_Nombre.setEnabled(false);
        jText_Territorio.setEnabled(false);
        jText_Orden.setEnabled(false);
        jText_FechaE.setEnabled(true);
        jText_FechaS.setEnabled(true);
        
    }
    void modeloConsulta10(){
        System.out.println("consulta 10");
        DefaultTableModel C10= new DefaultTableModel();
        String[] col10= new String []{"Territorio ID","Total de Ventas"};
        C10.setColumnIdentifiers(col10);
        jTableDatos.setModel(C10); 
        jText_Categoria.setEnabled(true);
        jText_Localidad.setEnabled(false);
        jText_Cantidad.setEnabled(false);
        jText_Apellido.setEnabled(false);
        jText_Correo.setEnabled(false);
        jText_Metodo.setEnabled(false);
        jText_Nombre.setEnabled(false);
        jText_Territorio.setEnabled(false);
        jText_Orden.setEnabled(false);
        jText_FechaE.setEnabled(false);
        jText_FechaS.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Opcion = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jBox_Consulta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jText_Categoria = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadio_Consulta = new javax.swing.JRadioButton();
        jRadio_Actializacion = new javax.swing.JRadioButton();
        jBox_Actualizar = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jText_Localidad = new javax.swing.JTextField();
        jText_Territorio = new javax.swing.JTextField();
        jText_Cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jText_Orden = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jText_Metodo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jText_Nombre = new javax.swing.JTextField();
        jText_Apellido = new javax.swing.JTextField();
        jText_Correo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jText_FechaE = new javax.swing.JTextField();
        jText_FechaS = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BIenvenido, ¿que deseas realizar?");

        jBox_Consulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1)Determinar el total de las ventas de los productos de una categoría", "2)Determinar el producto más solicitado para la región y en que territorio de la región tiene mayor demanda", "4)Determinar si hay clientes de un territorio que se especifique", "8)Determinar el empleado que atendió más ordenes por territorio/región", "9)Determinar cual es el total de las ventas en cada una de las regiones por un rango de fechas establecidas", "10)Determinar los 5 productos menos vendidos en un rango de fecha establecido", " " }));
        jBox_Consulta.setSelectedIndex(-1);
        jBox_Consulta.setEnabled(false);
        jBox_Consulta.setName(""); // NOI18N
        jBox_Consulta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                seleccion(evt);
            }
        });

        jLabel2.setText("Categoria:");

        jText_Categoria.setEnabled(false);

        jButton1.setText("Ejecutar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ejecutar(evt);
            }
        });

        Opcion.add(jRadio_Consulta);
        jRadio_Consulta.setText("Consulta");
        jRadio_Consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcion1(evt);
            }
        });

        Opcion.add(jRadio_Actializacion);
        jRadio_Actializacion.setText("Actualizacíon");
        jRadio_Actializacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcion2(evt);
            }
        });

        jBox_Actualizar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3) Actualizar el stock disponible en un 5% de los productos de una categoría", "5) Actualizar la cantidad de productos de una orden", "6) Actualizar el método de envío de una orden que se reciba", "7) Actualizar el correo electrónico de una cliente que se reciba" }));
        jBox_Actualizar.setSelectedIndex(-1);
        jBox_Actualizar.setEnabled(false);
        jBox_Actualizar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                seleccion2(evt);
            }
        });

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableDatos);

        jLabel3.setText("Localidad:");

        jLabel4.setText("Territorio:");

        jLabel5.setText("Cantidad del producto:");

        jText_Localidad.setEnabled(false);

        jText_Territorio.setEnabled(false);

        jText_Cantidad.setEnabled(false);

        jLabel6.setText("Orden ID:");

        jText_Orden.setEnabled(false);

        jLabel7.setText("Metodo de envio:");

        jText_Metodo.setEnabled(false);

        jLabel8.setText("Nombre:");

        jLabel9.setText("Apellido:");

        jLabel10.setText("Correo:");

        jText_Nombre.setEnabled(false);

        jText_Apellido.setEnabled(false);

        jText_Correo.setEnabled(false);

        jLabel11.setText("Fecha de entrada:");

        jLabel12.setText("Fecha de salida:");

        jText_FechaE.setEnabled(false);

        jText_FechaS.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBox_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBox_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jText_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadio_Actializacion)
                                    .addComponent(jRadio_Consulta)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_Localidad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_Territorio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jText_Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel11)
                                        .addGap(4, 4, 4)
                                        .addComponent(jText_FechaE, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jText_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jText_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jText_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jText_FechaS, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(344, 344, 344))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(377, 377, 377))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jRadio_Consulta)
                .addGap(1, 1, 1)
                .addComponent(jBox_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jRadio_Actializacion)
                .addGap(4, 4, 4)
                .addComponent(jBox_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jText_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jText_Localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jText_Territorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jText_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jText_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jText_Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jText_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jText_FechaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_FechaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcion1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcion1
        // TODO add your handling code here:
        jBox_Consulta.setEnabled(true);
        jBox_Actualizar.setEnabled(false);
        jBox_Consulta.setSelectedIndex(-1);  
        jBox_Actualizar.setSelectedIndex(-1);
        
    }//GEN-LAST:event_opcion1

    private void opcion2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcion2
        // TODO add your handling code here:
        jBox_Actualizar.setEnabled(true);
        jBox_Consulta.setEnabled(false);
        jBox_Consulta.setSelectedIndex(-1); 
        jBox_Actualizar.setSelectedIndex(-1);
    }//GEN-LAST:event_opcion2

    private void seleccion(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seleccion
        // TODO add your handling code here:
        int numero=jBox_Consulta.getSelectedIndex();
        
        if(numero==-1){
               defaultModel();
            
        }else{
            switch(numero){
                case 0:
                    System.out.println("consulta 1");            
                    modeloConsulta1();
                    limpiar();
                break;
               case 1:
                   System.out.println("consulta 2");
                   modeloConsulta2();
                   limpiar();
               break;
               case 2:
                   System.out.println("consulta 4");
                   modeloConsulta4();
                   limpiar();
               break;
               case 3:
                   System.out.println("consulta 8");
                   modeloConsulta8();
                   limpiar();
               break;
               case 4:
                   System.out.println("consulta 9");
                   modeloConsulta9();
                   limpiar();
               break;
               case 5:
                   modeloConsulta10();
                   limpiar();
               break;
               default:                  
           }
         }
    }//GEN-LAST:event_seleccion

    private void seleccion2(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seleccion2
        // TODO add your handling code here:
        int numero=jBox_Actualizar.getSelectedIndex();
        
        if(numero==-1){
               defaultModel();
               limpiar();
            
        }else{
        
            switch(numero){
                case 0:
                    System.out.println("consulta 3");
                    jText_Categoria.setEnabled(true);
                    jText_Localidad.setEnabled(true);
                    jText_Cantidad.setEnabled(false);
                    jText_Apellido.setEnabled(false);
                    jText_Correo.setEnabled(false);
                    jText_Metodo.setEnabled(false);
                    jText_Nombre.setEnabled(false);
                    jText_Territorio.setEnabled(false);
                    jText_Orden.setEnabled(false);
                    limpiar();
                    
                break;
                case 1:
                    System.out.println("consulta 5");
                    jText_Categoria.setEnabled(false);
                    jText_Localidad.setEnabled(false);
                    jText_Cantidad.setEnabled(true);
                    jText_Apellido.setEnabled(false);
                    jText_Correo.setEnabled(false);
                    jText_Metodo.setEnabled(false);
                    jText_Nombre.setEnabled(false);
                    jText_Territorio.setEnabled(false);
                    jText_Orden.setEnabled(true);
                    limpiar();
                break;
                case 2:
                    System.out.println("consulta 6");
                    jText_Categoria.setEnabled(false);
                    jText_Localidad.setEnabled(false);
                    jText_Cantidad.setEnabled(false);
                    jText_Apellido.setEnabled(false);
                    jText_Correo.setEnabled(false);
                    jText_Metodo.setEnabled(true);
                    jText_Nombre.setEnabled(false);
                    jText_Territorio.setEnabled(false);
                    jText_Orden.setEnabled(true);
                    limpiar();
                break;
                case 3:
                    System.out.println("consulta 7");
                    jText_Categoria.setEnabled(false);
                    jText_Localidad.setEnabled(false);
                    jText_Cantidad.setEnabled(false);
                    jText_Apellido.setEnabled(true);
                    jText_Correo.setEnabled(true);
                    jText_Nombre.setEnabled(true);
                    jText_Metodo.setEnabled(false);               
                    jText_Territorio.setEnabled(false);
                    jText_Orden.setEnabled(false);
                    limpiar();
                break;
                default:
             }    
                          
       }
          
    }//GEN-LAST:event_seleccion2

    private void Ejecutar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ejecutar
        // TODO add your handling code here:
        boolean op=jRadio_Consulta.isSelected();
        int numConsulta;
        Conexiones bdd = new Conexiones();
        bdd.conectar();
        if(op!=false){
            System.out.println("gg");
            numConsulta=jBox_Consulta.getSelectedIndex();
            switch(numConsulta){
                case 0:
                    System.out.println("consulta 1");
                    DefaultTableModel modelo=(DefaultTableModel)jTableDatos.getModel();//Obtenemos el modelo de la tabla para obtener los titulos
                    int cat=Integer.parseInt(jText_Categoria.getText());//Obtenemos el parametro para el SP
                    modelo.setRowCount(0);//Limpiamos la tabla
                    try{
                    CallableStatement statement = bdd.conectar().prepareCall("{call sp_consulta_A(?)}");
                    statement.setInt(1,cat);//asignamos el  parametro al procedimiento
                    statement.execute();//ejecutamos el procedimiento
                    ResultSet consulta =statement.getResultSet();//guardamos resultados
                    
                    //recorremos los resultados obtenidos del procedimiento
                    while(consulta.next()){
                        Vector v=new Vector();
                        v.add(consulta.getInt(1));//GUardamos los datos de la primera columna
                        v.add(consulta.getInt(2));//GUardamos los datos de la segunda columna
                        modelo.addRow(v);//Agregamos los datos de las columnas guardadas a la tabla
                        jTableDatos.setModel(modelo);//Aplicamos el modelo ocn los datos al objeto tabla
                        System.out.println("columna:"+consulta.getRow()+"\nTerritorioID:"+consulta.getString(1)+"\nVentas:"+consulta.getString(2)+"\n\n");
                    }
                        
                    }catch(SQLException ex){
                        
                    }
                    
          
                break;


               case 1:
                   System.out.println("consulta 2");
         
               break;
               case 2:
                   System.out.println("consulta 4");
                    DefaultTableModel modelo1=(DefaultTableModel)jTableDatos.getModel();//Obtenemos el modelo de la tabla para obtener los titulos
                    int terr=Integer.parseInt(jText_Territorio.getText());//Obtenemos el parametro para el SP
                    modelo1.setRowCount(0);//Limpiamos la tabla
                    try{
                    CallableStatement statement4 = bdd.conectar().prepareCall("{call sp_consulta_D(?)}");
                    statement4.setInt(1,terr);//asignamos el primer(unico) parametro al procedimiento
                    statement4.execute();//ejecutamos el procedimiento
                    ResultSet consulta4 =statement4.getResultSet();//guardamos resultados
                    
                    //recorremos los resultados obtenidos del procedimiento
                    while(consulta4.next()){
                        Vector v=new Vector();
                        v.add(consulta4.getInt(1));//GUardamos los datos de la primera columna
                        modelo1.addRow(v);//Agregamos los datos de las columnas guardadas a la tabla
                        jTableDatos.setModel(modelo1);//Aplicamos el modelo ocn los datos al objeto tabla
                        
                    }
                        
                    }catch(SQLException ex){
                        
                    }
          
               break;
               case 3:
                   System.out.println("consulta 8");
                   DefaultTableModel modelo2=(DefaultTableModel)jTableDatos.getModel();//Obtenemos el modelo de la tabla para obtener los titulos
                   modelo2.setRowCount(0);//Limpiamos la tabla
                   try{
                       CallableStatement statement8 = bdd.conectar().prepareCall("{call sp_consulta_H}");
                       statement8.execute();//ejecutamos el procedimiento
                       ResultSet consulta8 =statement8.getResultSet();//guardamos resultados
                    
                    //recorremos los resultados obtenidos del procedimiento
                   while(consulta8.next()){
                        Vector v=new Vector();
                        v.add(consulta8.getInt(1));//GUardamos los datos de la primera columna
                        v.add(consulta8.getInt(2));//GUardamos los datos de la primera columna
                        v.add(consulta8.getString(3));//GUardamos los datos de la primera columna
                        v.add(consulta8.getString(4));//GUardamos los datos de la primera columna
                        v.add(consulta8.getInt(5));//GUardamos los datos de la primera columna
                        modelo2.addRow(v);//Agregamos los datos de las columnas guardadas a la tabla
                        jTableDatos.setModel(modelo2);//Aplicamos el modelo ocn los datos al objeto tabla
                        }
                        
                       }catch(SQLException ex){
                        
                    }
                   
          
               break;
               case 4: 
                   System.out.println("consulta 9");
                   DefaultTableModel modelo3=(DefaultTableModel)jTableDatos.getModel();//Obtenemos el modelo de la tabla para obtener los titulos
                   modelo3.setRowCount(0);//Limpiamos la tabla
                   String fechaEntrada=jText_FechaE.getText();
                   String fechaSalida=jText_FechaS.getText();
                   try{
                       //llamando al proceimiento
                    CallableStatement statement9 = bdd.conectar().prepareCall("{call sp_consulta_I(?,?)}");
                    statement9.setString(1,fechaEntrada);//asignamos el primer(unico) parametro al procedimiento
                    statement9.setString(2,fechaSalida);
                    statement9.execute();//ejecutamos el procedimiento
                    ResultSet consulta9 =statement9.getResultSet();//guardamos resultados
                    
                    
                    //recorremos los resultados obtenidos del procedimiento
                   while(consulta9.next()){
                        Vector v=new Vector();
                        v.add(consulta9.getInt(1));//GUardamos los datos de la primera columna
                        v.add(consulta9.getInt(2));//GUardamos los datos de la primera columna
                        modelo3.addRow(v);//Agregamos los datos de las columnas guardadas a la tabla
                        jTableDatos.setModel(modelo3);//Aplicamos el modelo ocn los datos al objeto tabla
                        }
                        
                       }catch(SQLException ex){
                        
                    }
                   
                   
               break;
               case 5:
                   System.out.println("consulta 10");
               break;
               default:                  
           }
            
        }else{
            System.out.println("oo");
            numConsulta=jBox_Actualizar.getSelectedIndex();
            switch(numConsulta){
                case 0:
                    System.out.println("consulta 3");
                    int cat=Integer.parseInt(jText_Categoria.getText());
                    int loc=Integer.parseInt(jText_Localidad.getText());
                     //llamamos al procedimiento
                    try{
                    CallableStatement statement3 = bdd.conectar().prepareCall("{call sp_consulta_C(?,?)}");
                    statement3.setInt(1,cat);//asignamos el primer(unico) parametro al procedimiento
                    statement3.setInt(2,loc);
                    statement3.execute();//ejecutamos el procedimiento
                    ResultSet consulta3=statement3.getResultSet();//guardamos resultados
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    }catch(SQLException ex){
                        
                    }
                    
                break;
                case 1:
                    System.out.println("consulta 5");
                    int cantidad=Integer.parseInt(jText_Cantidad.getText());
                    int orden1=Integer.parseInt(jText_Orden.getText());
                    
                    try{
                        CallableStatement statement5 = bdd.conectar().prepareCall("{call sp_consulta_E(?,?)}");
                        statement5.setInt(1,cantidad);//asignamos el primer(unico) parametro al procedimiento
                        statement5.setInt(2,orden1);
                        statement5.execute();//ejecutamos el procedimiento
                        ResultSet consulta5 =statement5.getResultSet();//guardamos resultados
                    }catch(SQLException ex){
                        
                    }
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    
                break;
                case 2:
                    System.out.println("consulta 6");
                    int met=Integer.parseInt(jText_Metodo.getText());
                    int orden2=Integer.parseInt(jText_Orden.getText());
                    try{
                        CallableStatement statement6 = bdd.conectar().prepareCall("{call sp_consulta_F(?,?)}");
                        statement6.setInt(1,met);//asignamos el primer(unico) parametro al procedimiento
                        statement6.setInt(2,orden2);
                        statement6.execute();//ejecutamos el procedimiento
                        ResultSet consulta6 =statement6.getResultSet();//guardamos resultados 
                    }catch(SQLException ex){
                        
                    }

                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                  
                break;
                case 3:
                    System.out.println("consulta 7");
                    String nom=jText_Nombre.getText();
                    String ap=jText_Nombre.getText();
                    String correo=jText_Nombre.getText();
                    
                    try{
                        CallableStatement statement7 = bdd.conectar().prepareCall("{call sp_consulta_G(?,?,?)}");
                        statement7.setString(1,nom);//asignamos el primer(unico) parametro al procedimiento
                        statement7.setString(2,ap);
                        statement7.setString(3,correo);
                        statement7.execute();//ejecutamos el procedimiento
                        ResultSet consulta7 =statement7.getResultSet();//guardamos resultados
                        
                    }catch(SQLException ex){
                        
                    }
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    
                    
                break;
                default:
             }    
            
            
            
        }
    }//GEN-LAST:event_Ejecutar

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Opcion;
    private javax.swing.JComboBox<String> jBox_Actualizar;
    private javax.swing.JComboBox<String> jBox_Consulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadio_Actializacion;
    private javax.swing.JRadioButton jRadio_Consulta;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JTextField jText_Apellido;
    private javax.swing.JTextField jText_Cantidad;
    private javax.swing.JTextField jText_Categoria;
    private javax.swing.JTextField jText_Correo;
    private javax.swing.JTextField jText_FechaE;
    private javax.swing.JTextField jText_FechaS;
    private javax.swing.JTextField jText_Localidad;
    private javax.swing.JTextField jText_Metodo;
    private javax.swing.JTextField jText_Nombre;
    private javax.swing.JTextField jText_Orden;
    private javax.swing.JTextField jText_Territorio;
    // End of variables declaration//GEN-END:variables
}
