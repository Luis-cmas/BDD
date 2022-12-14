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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        jLabelCorreoInvalido.setVisible(false);
        JlabelRequerido1.setVisible(false);
        jLabelRequerido2.setVisible(false);
        jLabelRequerido3.setVisible(false);
        jLabelRequerido4.setVisible(false);
        jLabelRequerido5.setVisible(false);
        jLabelRequerido6.setVisible(false);
        jLabelRequerido7.setVisible(false);
        jLabelRequerido8.setVisible(false);
        jLabelRequerido9.setVisible(false);
        jLabelRequerido10.setVisible(false);
        jLabelRequerido11.setVisible(false);
        
        
        
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
        jDateEntrada.setEnabled(false);
        jDateSalida.setEnabled(false);
        jLabelCorreoInvalido.setVisible(false);
        JlabelRequerido1.setVisible(false);
        jLabelRequerido2.setVisible(false);
        jLabelRequerido3.setVisible(false);
        jLabelRequerido4.setVisible(false);
        jLabelRequerido5.setVisible(false);
        jLabelRequerido6.setVisible(false);
        jLabelRequerido7.setVisible(false);
        jLabelRequerido8.setVisible(false);
        jLabelRequerido9.setVisible(false);
        jLabelRequerido10.setVisible(false);
        jLabelRequerido11.setVisible(false);
        
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
        jDateEntrada.setEnabled(false);
        jDateSalida.setEnabled(false);
        JlabelRequerido1.setVisible(true);
        jLabelRequerido2.setVisible(false);
        jLabelRequerido3.setVisible(false);
        jLabelRequerido4.setVisible(false);
        jLabelRequerido5.setVisible(false);
        jLabelRequerido6.setVisible(false);
        jLabelRequerido7.setVisible(false);
        jLabelRequerido8.setVisible(false);
        jLabelRequerido9.setVisible(false);
        jLabelRequerido10.setVisible(false);
        jLabelRequerido11.setVisible(false);       
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
        jDateEntrada.setEnabled(false);
        jDateSalida.setEnabled(false); 
        JlabelRequerido1.setVisible(false);
        jLabelRequerido2.setVisible(false);
        jLabelRequerido3.setVisible(false);
        jLabelRequerido4.setVisible(false);
        jLabelRequerido5.setVisible(false);
        jLabelRequerido6.setVisible(false);
        jLabelRequerido7.setVisible(false);
        jLabelRequerido8.setVisible(false);
        jLabelRequerido9.setVisible(false);
        jLabelRequerido10.setVisible(false);
        jLabelRequerido11.setVisible(false);
        
    }
    void modeloConsulta3(){
        jText_Categoria.setEnabled(true);
        jText_Localidad.setEnabled(true);
        jText_Cantidad.setEnabled(false);
        jText_Apellido.setEnabled(false);
        jText_Correo.setEnabled(false);
        jText_Metodo.setEnabled(false);
        jText_Nombre.setEnabled(false);
        jText_Territorio.setEnabled(false);
        jText_Orden.setEnabled(false);
        JlabelRequerido1.setVisible(true);
        jLabelRequerido2.setVisible(false);
        jLabelRequerido3.setVisible(false);
        jLabelRequerido4.setVisible(true);
        jLabelRequerido5.setVisible(false);
        jLabelRequerido6.setVisible(false);
        jLabelRequerido7.setVisible(false);
        jLabelRequerido8.setVisible(false);
        jLabelRequerido9.setVisible(false);
        jLabelRequerido10.setVisible(false);
        jLabelRequerido11.setVisible(false);
        
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
        jDateEntrada.setEnabled(false);
        jDateSalida.setEnabled(false); 
        JlabelRequerido1.setVisible(false);
        jLabelRequerido2.setVisible(false);
        jLabelRequerido3.setVisible(true);
        jLabelRequerido4.setVisible(false);
        jLabelRequerido5.setVisible(false);
        jLabelRequerido6.setVisible(false);
        jLabelRequerido7.setVisible(false);
        jLabelRequerido8.setVisible(false);
        jLabelRequerido9.setVisible(false);
        jLabelRequerido10.setVisible(false);
        jLabelRequerido11.setVisible(false);
        
        
    }
    void modeloConsulta5(){
        jText_Categoria.setEnabled(false);
        jText_Localidad.setEnabled(false);
        jText_Cantidad.setEnabled(true);
        jText_Apellido.setEnabled(false);
        jText_Correo.setEnabled(false);
        jText_Metodo.setEnabled(false);
        jText_Nombre.setEnabled(false);
        jText_Territorio.setEnabled(false);
        jText_Orden.setEnabled(true);    
        JlabelRequerido1.setVisible(false);
        jLabelRequerido2.setVisible(true);
        jLabelRequerido3.setVisible(false);
        jLabelRequerido4.setVisible(false);
        jLabelRequerido5.setVisible(true);
        jLabelRequerido6.setVisible(false);
        jLabelRequerido7.setVisible(false);
        jLabelRequerido8.setVisible(false);
        jLabelRequerido9.setVisible(false);
        jLabelRequerido10.setVisible(false);
        jLabelRequerido11.setVisible(false);
        
    }
    void modeloConsulta6(){
        jText_Categoria.setEnabled(false);
        jText_Localidad.setEnabled(false);
        jText_Cantidad.setEnabled(false);
        jText_Apellido.setEnabled(false);
        jText_Correo.setEnabled(false);
        jText_Metodo.setEnabled(true);
        jText_Nombre.setEnabled(false);
        jText_Territorio.setEnabled(false);
        jText_Orden.setEnabled(true);
        JlabelRequerido1.setVisible(false);
        jLabelRequerido2.setVisible(false);
        jLabelRequerido3.setVisible(false);
        jLabelRequerido4.setVisible(false);
        jLabelRequerido5.setVisible(true);
        jLabelRequerido6.setVisible(true);
        jLabelRequerido7.setVisible(false);
        jLabelRequerido8.setVisible(false);
        jLabelRequerido9.setVisible(false);
        jLabelRequerido10.setVisible(false);
        jLabelRequerido11.setVisible(false);
        
    }
    void modeloConsulta7(){
        jText_Categoria.setEnabled(false);
        jText_Localidad.setEnabled(false);
        jText_Cantidad.setEnabled(false);
        jText_Apellido.setEnabled(true);
        jText_Correo.setEnabled(true);
        jText_Nombre.setEnabled(true);
        jText_Metodo.setEnabled(false);               
        jText_Territorio.setEnabled(false);
        jText_Orden.setEnabled(false);
        JlabelRequerido1.setVisible(false);
        jLabelRequerido2.setVisible(false);
        jLabelRequerido3.setVisible(false);
        jLabelRequerido4.setVisible(false);
        jLabelRequerido5.setVisible(false);
        jLabelRequerido6.setVisible(false);
        jLabelRequerido7.setVisible(true);
        jLabelRequerido8.setVisible(true);
        jLabelRequerido9.setVisible(true);
        jLabelRequerido10.setVisible(false);
        jLabelRequerido11.setVisible(false);
        
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
        jDateEntrada.setEnabled(false);
        jDateSalida.setEnabled(false); 
        JlabelRequerido1.setVisible(false);
        jLabelRequerido2.setVisible(false);
        jLabelRequerido3.setVisible(false);
        jLabelRequerido4.setVisible(false);
        jLabelRequerido5.setVisible(false);
        jLabelRequerido6.setVisible(false);
        jLabelRequerido7.setVisible(false);
        jLabelRequerido8.setVisible(false);
        jLabelRequerido9.setVisible(false);
        jLabelRequerido10.setVisible(false);
        jLabelRequerido11.setVisible(false);
        
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
        jDateEntrada.setEnabled(true);
        jDateSalida.setEnabled(true); 
        JlabelRequerido1.setVisible(false);
        jLabelRequerido2.setVisible(false);
        jLabelRequerido3.setVisible(false);
        jLabelRequerido4.setVisible(false);
        jLabelRequerido5.setVisible(false);
        jLabelRequerido6.setVisible(false);
        jLabelRequerido7.setVisible(false);
        jLabelRequerido8.setVisible(false);
        jLabelRequerido9.setVisible(false);
        jLabelRequerido10.setVisible(true);
        jLabelRequerido11.setVisible(true);
        
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
        jDateEntrada.setEnabled(false);
        jDateSalida.setEnabled(false);
        JlabelRequerido1.setVisible(false);
        jLabelRequerido2.setVisible(false);
        jLabelRequerido3.setVisible(false);
        jLabelRequerido4.setVisible(false);
        jLabelRequerido5.setVisible(false);
        jLabelRequerido6.setVisible(false);
        jLabelRequerido7.setVisible(false);
        jLabelRequerido8.setVisible(false);
        jLabelRequerido9.setVisible(false);
        jLabelRequerido10.setVisible(false);
        jLabelRequerido11.setVisible(false);
        
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
        jDateEntrada = new com.toedter.calendar.JDateChooser();
        jDateSalida = new com.toedter.calendar.JDateChooser();
        jLabelCorreoInvalido = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelRequerido4 = new javax.swing.JLabel();
        jLabelRequerido3 = new javax.swing.JLabel();
        JlabelRequerido1 = new javax.swing.JLabel();
        jLabelRequerido2 = new javax.swing.JLabel();
        jLabelRequerido5 = new javax.swing.JLabel();
        jLabelRequerido6 = new javax.swing.JLabel();
        jLabelRequerido7 = new javax.swing.JLabel();
        jLabelRequerido8 = new javax.swing.JLabel();
        jLabelRequerido9 = new javax.swing.JLabel();
        jLabelRequerido10 = new javax.swing.JLabel();
        jLabelRequerido11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BIenvenido, ??que deseas realizar?");

        jBox_Consulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1)Determinar el total de las ventas de los productos de una categor??a", "2)Determinar el producto m??s solicitado para la regi??n y en que territorio de la regi??n tiene mayor demanda", "4)Determinar si hay clientes de un territorio que se especifique", "8)Determinar el empleado que atendi?? m??s ordenes por territorio/regi??n", "9)Determinar cual es el total de las ventas en cada una de las regiones por un rango de fechas establecidas", "10)Determinar los 5 productos menos vendidos en un rango de fecha establecido", " " }));
        jBox_Consulta.setSelectedIndex(-1);
        jBox_Consulta.setEnabled(false);
        jBox_Consulta.setName(""); // NOI18N
        jBox_Consulta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                seleccionConsulta(evt);
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
        jRadio_Actializacion.setText("Actualizac??on");
        jRadio_Actializacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcion2(evt);
            }
        });

        jBox_Actualizar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3) Actualizar el stock disponible en un 5% de los productos de una categor??a", "5) Actualizar la cantidad de productos de una orden", "6) Actualizar el m??todo de env??o de una orden que se reciba", "7) Actualizar el correo electr??nico de una cliente que se reciba" }));
        jBox_Actualizar.setSelectedIndex(-1);
        jBox_Actualizar.setEnabled(false);
        jBox_Actualizar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                seleccionActualizar(evt);
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
        jText_Territorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_TerritorioActionPerformed(evt);
            }
        });

        jText_Cantidad.setEnabled(false);
        jText_Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_CantidadActionPerformed(evt);
            }
        });

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
        jText_Correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_CorreoKeyReleased(evt);
            }
        });

        jLabel11.setText("Fecha de entrada:");

        jLabel12.setText("Fecha de salida:");

        jDateEntrada.setEnabled(false);

        jDateSalida.setEnabled(false);

        jLabelCorreoInvalido.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCorreoInvalido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCorreoInvalido.setText("Correo invalido");
        jLabelCorreoInvalido.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("Campo requerido (*)");

        jLabelRequerido4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRequerido4.setForeground(new java.awt.Color(255, 0, 51));
        jLabelRequerido4.setText("*");

        jLabelRequerido3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRequerido3.setForeground(new java.awt.Color(255, 0, 51));
        jLabelRequerido3.setText("*");

        JlabelRequerido1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JlabelRequerido1.setForeground(new java.awt.Color(255, 0, 51));
        JlabelRequerido1.setText("*");

        jLabelRequerido2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRequerido2.setForeground(new java.awt.Color(255, 0, 51));
        jLabelRequerido2.setText("*");

        jLabelRequerido5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRequerido5.setForeground(new java.awt.Color(255, 0, 0));
        jLabelRequerido5.setText("*");

        jLabelRequerido6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRequerido6.setForeground(new java.awt.Color(255, 0, 51));
        jLabelRequerido6.setText("*");

        jLabelRequerido7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRequerido7.setForeground(new java.awt.Color(255, 0, 51));
        jLabelRequerido7.setText("*");

        jLabelRequerido8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRequerido8.setForeground(new java.awt.Color(255, 0, 51));
        jLabelRequerido8.setText("*");

        jLabelRequerido9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRequerido9.setForeground(new java.awt.Color(255, 0, 51));
        jLabelRequerido9.setText("*");

        jLabelRequerido10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRequerido10.setForeground(new java.awt.Color(255, 0, 51));
        jLabelRequerido10.setText("*");

        jLabelRequerido11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRequerido11.setForeground(new java.awt.Color(255, 0, 51));
        jLabelRequerido11.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(378, 378, 378))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(321, 321, 321))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadio_Actializacion)
                            .addComponent(jRadio_Consulta)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabelCorreoInvalido, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jText_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabelRequerido9)
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jDateEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelRequerido10)
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDateSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabelRequerido11))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jText_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jText_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel14))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabelRequerido5)
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(jText_Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelRequerido6)
                                    .addGap(222, 222, 222)
                                    .addComponent(jText_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelRequerido8))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(JlabelRequerido1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jText_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelRequerido2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jText_Territorio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelRequerido3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jText_Localidad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelRequerido4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBox_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jText_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabelRequerido7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addGap(79, 79, 79))
                            .addComponent(jBox_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jRadio_Consulta)
                .addGap(1, 1, 1)
                .addComponent(jBox_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadio_Actializacion)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jBox_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jText_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(jText_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(17, 17, 17)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel3)
                                                .addComponent(jText_Localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4)
                                                .addComponent(jText_Territorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabelRequerido3)
                                        .addComponent(jLabelRequerido4)
                                        .addComponent(jLabelRequerido2))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(JlabelRequerido1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jText_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jText_Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jText_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelRequerido5)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelRequerido7)
                                    .addComponent(jLabelRequerido6)
                                    .addComponent(jLabelRequerido8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jDateEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(jText_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabelRequerido10)
                            .addComponent(jLabelRequerido11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelRequerido9)
                        .addGap(27, 27, 27)))
                .addComponent(jLabelCorreoInvalido)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
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

    private void seleccionConsulta(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seleccionConsulta
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
    }//GEN-LAST:event_seleccionConsulta

    private void seleccionActualizar(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seleccionActualizar
        // TODO add your handling code here:
        int numero=jBox_Actualizar.getSelectedIndex();
        if(numero==-1){
               defaultModel();
               limpiar();   
        }else{ 
            switch(numero){
                case 0:
                    System.out.println("consulta 3");
                    modeloConsulta3();
                    limpiar();                  
                break;
                case 1:
                    System.out.println("consulta 5");
                    modeloConsulta5();
                    limpiar();
                break;
                case 2:
                    System.out.println("consulta 6");
                    modeloConsulta6();
                    limpiar();
                break;
                case 3:
                    System.out.println("consulta 7");
                    modeloConsulta7();
                    limpiar();
                break;
                default:
             }                     
       }        
    }//GEN-LAST:event_seleccionActualizar

    private void Ejecutar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ejecutar
        // TODO add your handling code here:
        boolean op=jRadio_Consulta.isSelected();
        int numConsulta;
        Conexiones bdd = new Conexiones();
        bdd.conectar();
        if(op!=false){
            System.out.println("Entrando a consultas");
            numConsulta=jBox_Consulta.getSelectedIndex();
            switch(numConsulta){
                case 0:
                    System.out.println("consulta 1");
                    DefaultTableModel modelo=(DefaultTableModel)jTableDatos.getModel();//Obtenemos el modelo de la tabla para obtener los titulos
                    if(jText_Categoria.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Ingrese los datos solicitados", "Error de parametros", JOptionPane.WARNING_MESSAGE);
                        break;  
                    }
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
                        JOptionPane.showMessageDialog(null, "Error en la consulta", "Error", JOptionPane.WARNING_MESSAGE);
                        
                    }
                    
          
                break;


               case 1:
                   System.out.println("consulta 2");
         
               break;
               case 2:
                   System.out.println("consulta 4");
                    DefaultTableModel modelo1=(DefaultTableModel)jTableDatos.getModel();//Obtenemos el modelo de la tabla para obtener los titulos
                    if(jText_Territorio.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Ingrese los datos solicitados", "Error de parametros", JOptionPane.WARNING_MESSAGE);
                        break;  
                    }
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
                        JOptionPane.showMessageDialog(null, "Error en la consulta", "Error", JOptionPane.WARNING_MESSAGE);
                        
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
                           JOptionPane.showMessageDialog(null, "Error en la consulta", "Error", JOptionPane.WARNING_MESSAGE);
                        
                    }
                   
          
               break;
               case 4: 
                  /* System.out.println("consulta 9");
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
                           JOptionPane.showMessageDialog(null, "Error en la consulta", "Error", JOptionPane.WARNING_MESSAGE);     
                       }
                   
                   */
                   
               break;
                   
               case 5:
                   System.out.println("consulta 10");
               break;
               default:                  
           }
            
        }else{
            System.out.println("Entrando a actualizaciones");
            numConsulta=jBox_Actualizar.getSelectedIndex();
            switch(numConsulta){
                case 0:
                    System.out.println("consulta 3");
                    if((jText_Localidad.getText().isEmpty()) && (jText_Categoria.getText().isEmpty())){
                        JOptionPane.showMessageDialog(null, "Ingrese los datos solicitados", "Error de parametros", JOptionPane.WARNING_MESSAGE);
                        break;  
                    }
                    int cat=Integer.parseInt(jText_Categoria.getText());
                    int loc=Integer.parseInt(jText_Localidad.getText());
                     //llamamos al procedimiento
                    try{
                    CallableStatement statement3 = bdd.conectar().prepareCall("{call sp_consulta_C(?,?)}");
                    statement3.setInt(1,cat);//asignamos el primer(unico) parametro al procedimiento
                    statement3.setInt(2,loc);
                    statement3.execute();//ejecutamos el procedimiento
                    ResultSet consulta3=statement3.getResultSet();//guardamos resultados
                    }catch(SQLException ex){
                        JOptionPane.showMessageDialog(null, "Error en la actualizaci??n", "Error", JOptionPane.WARNING_MESSAGE);    
                    }
                    JOptionPane.showMessageDialog(null, "Actualizaci??n realizada correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                    
                break;
                
                
                case 1:
                    System.out.println("consulta 5");
                    if((jText_Cantidad.getText().isEmpty()) && (jText_Orden.getText().isEmpty())){
                        JOptionPane.showMessageDialog(null, "Ingrese los datos solicitados", "Error de parametros", JOptionPane.WARNING_MESSAGE);
                        break;  
                    }
                    int cantidad=Integer.parseInt(jText_Cantidad.getText());
                    int orden1=Integer.parseInt(jText_Orden.getText());
                    
                    try{
                        CallableStatement statement5 = bdd.conectar().prepareCall("{call sp_consulta_E(?,?)}");
                        statement5.setInt(1,cantidad);//asignamos el primer(unico) parametro al procedimiento
                        statement5.setInt(2,orden1);
                        statement5.execute();//ejecutamos el procedimiento
                        ResultSet consulta5 =statement5.getResultSet();//guardamos resultados
                    }catch(SQLException ex){
                        JOptionPane.showMessageDialog(null, "Error en la actualizaci??n", "Error", JOptionPane.WARNING_MESSAGE);
                        
                    }
                    JOptionPane.showMessageDialog(null, "Actualizaci??n realizada correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                    
                break;
                
                
                case 2:
                    System.out.println("consulta 6");
                    if((jText_Metodo.getText().isEmpty()) && (jText_Orden.getText().isEmpty())){
                        JOptionPane.showMessageDialog(null, "Ingrese los datos solicitados", "Error de parametros", JOptionPane.WARNING_MESSAGE);
                        break;  
                    }
                    int met=Integer.parseInt(jText_Metodo.getText());
                    int orden2=Integer.parseInt(jText_Orden.getText());
                    try{
                        CallableStatement statement6 = bdd.conectar().prepareCall("{call sp_consulta_F(?,?)}");
                        statement6.setInt(1,met);//asignamos el primer(unico) parametro al procedimiento
                        statement6.setInt(2,orden2);
                        statement6.execute();//ejecutamos el procedimiento
                        ResultSet consulta6 =statement6.getResultSet();//guardamos resultados 
                    }catch(SQLException ex){
                        JOptionPane.showMessageDialog(null, "Error en la actualizaci??n", "Error", JOptionPane.WARNING_MESSAGE);
                        
                    }
                    JOptionPane.showMessageDialog(null, "Actualizaci??n realizada correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                  
                break;
                
                
                case 3:                  
                    System.out.println("consulta 7");
                    if((jLabelCorreoInvalido.isVisible()== true) && ((jText_Localidad.getText().isEmpty()) && (jText_Categoria.getText().isEmpty()))){
                        JOptionPane.showMessageDialog(null, "Ingrese los datos solicitados", "Error de parametros", JOptionPane.WARNING_MESSAGE);
                        break;
                    }
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
                        JOptionPane.showMessageDialog(null, "Error en la actualizaci??n", "Error", JOptionPane.WARNING_MESSAGE);
                        
                        
                    }
                        JOptionPane.showMessageDialog(null, "Actualizaci??n realizada correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                    
                    
                break;
                default:
             }    
            
            
            
        }
    }//GEN-LAST:event_Ejecutar

    private void jText_CorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_CorreoKeyReleased
        // TODO add your handling code here:
        if(verificarCorreo(jText_Correo.getText())){
            jLabelCorreoInvalido.setVisible(false);   
        }else{
            jLabelCorreoInvalido.setVisible(true);
        }
    }//GEN-LAST:event_jText_CorreoKeyReleased

    private void jText_CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_CantidadActionPerformed

    private void jText_TerritorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_TerritorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_TerritorioActionPerformed

    public boolean verificarCorreo(String correo){
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat=patron.matcher(correo);
        return mat.find();
    }
   
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
    private javax.swing.JLabel JlabelRequerido1;
    private javax.swing.ButtonGroup Opcion;
    private javax.swing.JComboBox<String> jBox_Actualizar;
    private javax.swing.JComboBox<String> jBox_Consulta;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateEntrada;
    private com.toedter.calendar.JDateChooser jDateSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCorreoInvalido;
    private javax.swing.JLabel jLabelRequerido10;
    private javax.swing.JLabel jLabelRequerido11;
    private javax.swing.JLabel jLabelRequerido2;
    private javax.swing.JLabel jLabelRequerido3;
    private javax.swing.JLabel jLabelRequerido4;
    private javax.swing.JLabel jLabelRequerido5;
    private javax.swing.JLabel jLabelRequerido6;
    private javax.swing.JLabel jLabelRequerido7;
    private javax.swing.JLabel jLabelRequerido8;
    private javax.swing.JLabel jLabelRequerido9;
    private javax.swing.JRadioButton jRadio_Actializacion;
    private javax.swing.JRadioButton jRadio_Consulta;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JTextField jText_Apellido;
    private javax.swing.JTextField jText_Cantidad;
    private javax.swing.JTextField jText_Categoria;
    private javax.swing.JTextField jText_Correo;
    private javax.swing.JTextField jText_Localidad;
    private javax.swing.JTextField jText_Metodo;
    private javax.swing.JTextField jText_Nombre;
    private javax.swing.JTextField jText_Orden;
    private javax.swing.JTextField jText_Territorio;
    // End of variables declaration//GEN-END:variables
}
