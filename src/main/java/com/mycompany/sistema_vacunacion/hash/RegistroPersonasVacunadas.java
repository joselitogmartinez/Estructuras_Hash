package com.mycompany.sistema_vacunacion.hash;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;
    
public class RegistroPersonasVacunadas extends javax.swing.JFrame {
    HashMap <String, String> ListaPersonas = new HashMap<>();
    HashMap<String, ArrayList<String>> multiValueMap = new HashMap<String, ArrayList<String>>();
   
    public RegistroPersonasVacunadas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonRegistrar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        cui = new javax.swing.JTextField();
        vac = new javax.swing.JTextField();
        fech = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clave = new javax.swing.JTextField();
        BuscarPersona = new javax.swing.JButton();
        LimpiarPanel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarDatos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vacunación");

        jLabel1.setText("CUI:");

        jLabel2.setText("No. Vacuna:");

        jLabel3.setText("Fecha:");

        BotonRegistrar.setText("REGISTRAR");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        Limpiar.setText("LIMPIAR");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        jLabel4.setText("REGISTRO DE VACUNAS");

        jLabel5.setText("BÚSQUEDA DE PERSONAS");

        jLabel6.setText("CUI:");

        BuscarPersona.setText("BUSCAR");
        BuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPersonaActionPerformed(evt);
            }
        });

        LimpiarPanel.setText("LIMPIAR");
        LimpiarPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarPanelActionPerformed(evt);
            }
        });

        mostrarDatos.setColumns(20);
        mostrarDatos.setRows(5);
        jScrollPane1.setViewportView(mostrarDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(66, 66, 66)
                                .addComponent(clave, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cui)
                                    .addComponent(vac)
                                    .addComponent(fech))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(101, 101, 101))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BuscarPersona)
                            .addComponent(LimpiarPanel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BotonRegistrar)
                    .addComponent(cui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addComponent(BuscarPersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LimpiarPanel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        String DPI = cui.getText(); //Se declaran variables para posterior uso
        String VACUNA = vac.getText().toString();
        String FECHA = fech.getText().toString();
        Persona personaCrear = new Persona(DPI, VACUNA, FECHA);

        if (!ListaPersonas.containsKey(DPI) && !ListaPersonas.containsKey(VACUNA) && !ListaPersonas.containsKey(FECHA)) {
            
            Persona persona = new Persona(DPI, VACUNA, FECHA);
            ListaPersonas.put(DPI, "vacuna " + " : " + persona.vacuna + ", fecha " + " : " + persona.fecha + "");

            multiValueMap.put(DPI, new ArrayList<String>());
            multiValueMap.get(DPI).add("vacuna " + " : " + persona.vacuna + ", fecha " + " : " + persona.fecha);

            String temp = DPI + " : [{(vacuna " + " : " + persona.vacuna + ", fecha " + " : " + persona.fecha + ")}]" + "";
            JOptionPane.showMessageDialog(null, "La persona con CUI: " + DPI + " se ha registrado correctamente");
            Persona.GuardarInfo(temp);
        } else {
            multiValueMap.get(DPI).add("vacuna " + " : " + personaCrear.vacuna + ", fecha " + " : " + personaCrear.fecha + "");
            JOptionPane.showMessageDialog(null, "La persona con CUI: " + DPI + " se ha registrado correctamente");
            Persona.GuardarInfo(multiValueMap.toString());
        }
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        cui.setText("");
        vac.setText("");
        fech.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void BuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPersonaActionPerformed
        Scanner EntradaLinea = null;
        String LineaUsada;
        int NumeroLinea = 1;
        boolean Existe = false;
         
        String Texto = clave.getText().toString().trim();
        String DPIBuscar = cui.getText();
            try {
                File file = new File("C:\\Users\\Augusto\\Desktop\\Registro de Vacunas.txt");
                EntradaLinea = new Scanner(file);
                System.out.println("Archivo de texto " + file.getName() + ", Texto " + Texto);
                
                while (EntradaLinea.hasNext()) { 
                    LineaUsada = EntradaLinea.nextLine();  
                    if (LineaUsada.contains(Texto)) {           
                        System.out.println("Linea " + NumeroLinea + " " + LineaUsada);
                        mostrarDatos.setText(LineaUsada);
                        Existe = true;
                    }
                    NumeroLinea++; 
                }
                if(!Existe){ 
                    System.out.println("No se ha podido encontrar el archivo " + Texto);
                    JOptionPane.showMessageDialog(null, "La persona no está registrada en la vacunación");
                }
            } catch (NullPointerException e) {
                System.out.println(e.toString() + "Aún no se ha seleccionado ningún archivo");
            } catch (Exception e) {
                System.out.println(e.toString());
            } finally {
                if (EntradaLinea != null) {
                    EntradaLinea.close();
                }
        }
    }//GEN-LAST:event_BuscarPersonaActionPerformed

    private void LimpiarPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarPanelActionPerformed
        mostrarDatos.setText("");
        clave.setText("");
    }//GEN-LAST:event_LimpiarPanelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(RegistroPersonasVacunadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPersonasVacunadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPersonasVacunadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPersonasVacunadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPersonasVacunadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JButton BuscarPersona;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton LimpiarPanel;
    private javax.swing.JTextField clave;
    private javax.swing.JTextField cui;
    private javax.swing.JTextField fech;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mostrarDatos;
    private javax.swing.JTextField vac;
    // End of variables declaration//GEN-END:variables
}
