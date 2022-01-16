/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import dao.DAOException;
import dao.MySQLDAOManager;
import data.Guia;
import data.Ruta;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LuisAneri
 */
public class Rutas extends javax.swing.JFrame {

    private static String login="i82andel";
    private static String password="lande00";
    private static String url="jdbc:oracle:thin:@oraclepr.uco.es:1521:oraclepr";
    private Guia guia = new Guia("admin","admin","admin"); 
    
    private String emailAux = "";
    

    public Rutas() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbRutas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNombreNuevo = new javax.swing.JTextField();
        txtPrecioNuevo = new javax.swing.JTextField();
        txtFechaNueva = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        nombre_guia = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        email_guia = new javax.swing.JTextPane();
        txtBuscar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtTipoRuta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rutas");

        tbRutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Fecha", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbRutas);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Rutas");

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio");

        jLabel4.setText("Fecha");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Buscar");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo Ruta");

        txtNombreNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreNuevoActionPerformed(evt);
            }
        });

        txtPrecioNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioNuevoActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre");

        jLabel8.setText("Email");

        jScrollPane2.setViewportView(nombre_guia);

        jScrollPane3.setViewportView(email_guia);

        txtBuscar.setText("Buscar");
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        jLabel10.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(txtPrecioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEliminar))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombreNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtTipoRuta)
                                        .addComponent(txtFechaNueva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)))))
                        .addGap(13, 13, 13))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTipoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btBuscar)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if(txtNombreNuevo.getText().isEmpty() || txtID.getText().isEmpty()  
               || txtPrecioNuevo.getText().isEmpty() || txtFechaNueva.getText().isEmpty() ||
               txtTipoRuta.getText().isEmpty() )
        {
           JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
       else
       {
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          LocalDate fechaAux = LocalDate.parse(txtFechaNueva.getText(), formatter);
          Ruta ruta = new Ruta(Integer.parseInt(txtID.getText()), txtNombreNuevo.getText(), fechaAux, Float.parseFloat(txtPrecioNuevo.getText())
                                ,txtTipoRuta.getText());
          ruta.setGuia(guia.getIdGuia());
          
            try {
                addRuta(ruta);
                rellenarTabla();
            } catch (Exception ex) {
                Logger.getLogger(Rutas.class.getName()).log(Level.SEVERE, null, ex);
            }
          
       }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(txtNombreNuevo.getText().isEmpty() || txtID.getText().isEmpty()  
               || txtPrecioNuevo.getText().isEmpty() || txtFechaNueva.getText().isEmpty() ||
               txtTipoRuta.getText().isEmpty() )
        {
           JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
       else
       {
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");
          LocalDate fechaAux = LocalDate.parse(txtFechaNueva.getText(), formatter);
          Ruta ruta = new Ruta(Integer.parseInt(txtID.getText()), txtNombreNuevo.getText(), fechaAux, Float.parseFloat(txtPrecioNuevo.getText())
                                ,txtTipoRuta.getText());
          ruta.setGuia(guia.getIdGuia());
          
            try {
                updateRuta(ruta);
                rellenarTabla();
            } catch (Exception ex) {
                Logger.getLogger(Rutas.class.getName()).log(Level.SEVERE, null, ex);
            }
          
       }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtNombreNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreNuevoActionPerformed

    private void txtPrecioNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioNuevoActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        if(txtBuscar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Introduzca un email");
            
        }else{
            emailAux = txtBuscar.getText();
            try {
                rellenarTabla();
            } catch (Exception ex) {
                Logger.getLogger(Rutas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(txtID.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
       else
       {  
        try {
            deleteRuta(Integer.parseInt(txtID.getText()));
            rellenarTabla();
        } catch (Exception ex) {
            Logger.getLogger(Rutas.class.getName()).log(Level.SEVERE, null, ex);
        }
          
       }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void addRuta(Ruta r) throws DAOException {
        
        MySQLDAOManager man;
        try {
            man = new MySQLDAOManager(url,login,password);
            man.getRutas().insertar(r);
        } catch (SQLException ex ) {
            Logger.getLogger(Rutas.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        
    }
    private void updateRuta(Ruta r) throws DAOException {
        
        MySQLDAOManager man;
        try {
            man = new MySQLDAOManager(url,login,password);
            man.getRutas().modificar(r);
        } catch (SQLException ex) {
            Logger.getLogger(Rutas.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    }
    private void deleteRuta(int r) throws DAOException{
       
       MySQLDAOManager man;
        try {
            man = new MySQLDAOManager(url,login,password);
            man.getRutas().eliminar(r);
        } catch (SQLException ex) {
            Logger.getLogger(Rutas.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    }
    
    /**
     * @param args the command line arguments
     */
    
    public void rellenarTabla() throws SQLException, Exception{
        
        MySQLDAOManager man = new MySQLDAOManager(url,login,password);
        guia = man.getGuias().obtener(emailAux);
        DefaultTableModel model;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        
        String [] columnas={"NOMBRE", "PRECIO", "FECHA", "TIPO"};
        
        String [] filas = new String[4];
        model = new DefaultTableModel(null,columnas);
        List<Ruta> rutas = man.getRutas().obtenerTodos(guia.getIdGuia());
        for(Ruta r: rutas){
            filas[0] = r.getNombre();
            filas[1] = Float.toString(r.getPrecio());
            filas[2] = r.getFecha().format(formatter);
            filas[3] = r.getTipoRuta();
            model.addRow(filas);
        }
        
        nombre_guia.setText(guia.getUsername());
        email_guia.setText(guia.getEmail());
        tbRutas.setModel(model);
        
    }
    
    
    
    public static void main(String args[]) throws SQLException {
       
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rutas().setVisible(true);
            }
        });
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextPane email_guia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane nombre_guia;
    private javax.swing.JTable tbRutas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtFechaNueva;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombreNuevo;
    private javax.swing.JTextField txtPrecioNuevo;
    private javax.swing.JTextField txtTipoRuta;
    // End of variables declaration//GEN-END:variables
}
