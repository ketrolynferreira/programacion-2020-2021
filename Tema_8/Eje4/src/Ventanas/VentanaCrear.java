/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import eje4.Controlador;
import java.awt.Color;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.regex.*;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author Ketrolyn
 */
public class VentanaCrear extends javax.swing.JDialog {

    private static LocalDate fecha;
    private static LocalTime horai;
    private static LocalTime horaf;
    private static Integer aforo;
    
    public VentanaCrear(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        llenarcombo();
        jcLugar.setSelectedIndex(-1);
        bAceptar.setEnabled(false);
        fFecha.setVisible(false);
        fHoras.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bAceptar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        tfNombre = new javax.swing.JTextField();
        jcLugar = new javax.swing.JComboBox<>();
        tfAforo = new javax.swing.JTextField();
        jfFecha = new javax.swing.JFormattedTextField();
        jfHorai = new javax.swing.JFormattedTextField();
        fFecha = new javax.swing.JLabel();
        fHoras = new javax.swing.JLabel();
        jlError = new javax.swing.JLabel();
        jfHoraf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Operaciones sobre acontecimientos");

        jLabel2.setText("Nombre");

        jLabel3.setText("Lugar");

        jLabel4.setText("Fecha");

        jLabel5.setText("Hora inicio");

        jLabel6.setText("Hora finalización");

        jLabel7.setText("Aforo");

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        jcLugar.setEnabled(false);
        jcLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcLugarActionPerformed(evt);
            }
        });

        tfAforo.setEnabled(false);
        tfAforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAforoActionPerformed(evt);
            }
        });

        jfFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jfFecha.setEnabled(false);
        jfFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfFechaActionPerformed(evt);
            }
        });

        jfHorai.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("HH:mm"))));
        jfHorai.setEnabled(false);
        jfHorai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfHoraiActionPerformed(evt);
            }
        });

        fFecha.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        fFecha.setText("*Formato_Fecha → dd/MM/yyyy");

        fHoras.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        fHoras.setText("*Formato_Horas → HH:mm");

        jlError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlError.setForeground(new java.awt.Color(255, 51, 51));

        jfHoraf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("HH:mm"))));
        jfHoraf.setEnabled(false);
        jfHoraf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfHorafActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jfHorai, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jfHoraf, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(fHoras))
                                    .addComponent(tfAforo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(129, 129, 129)
                                        .addComponent(jlError, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(fFecha))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jcLugar, 0, 164, Short.MAX_VALUE)
                                        .addComponent(tfNombre))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jfHorai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fHoras)
                    .addComponent(jfHoraf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jlError, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bSalir))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarcombo()
    {
       jcLugar.addItem("Artium");
       jcLugar.addItem("Buesa Arena");
       jcLugar.addItem("Iradier Arena");
       jcLugar.addItem("Mendizorroza");
       jcLugar.addItem("Teatro Principal");
    }
    
    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        Controlador.salirv(this);
    }//GEN-LAST:event_bSalirActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        try
        {
            if (tfNombre.getText().isEmpty())
                throw new Exception("CAMPO OBLIGATORIO");
            
            if (!validardato(tfNombre.getText().toUpperCase(),"^[A-Z]+( [A-Z]+)*$"))
                throw new Exception("NOMBRE INCORRECTO");
            
            if (tfNombre.getText().length() > 50)
                throw new Exception("LA LONGITUD MAXIMA ES DE 50 CARACTERES");
            
            if (Controlador.buscarnombre(tfNombre.getText().toUpperCase()))
                throw new Exception("NOMBRE YA EXISTENTE");
            
            defectod(tfNombre);
            jcLugar.setEnabled(true);
            jcLugar.requestFocus();
        }
        catch (Exception e)
        {
            errcon(tfNombre,e);
        }
    }//GEN-LAST:event_tfNombreActionPerformed

    public void defectod(javax.swing.JTextField jt)
    {
        jt.setBackground(Color.WHITE);
        jt.setEnabled(false);
        jlError.setText("");
    } 
    
    public void defectoc(javax.swing.JFormattedTextField jf,javax.swing.JLabel jl,boolean valor)
    {
        jf.setEnabled(valor);
        jl.setVisible(valor);
    }
    
    private void jcLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcLugarActionPerformed
        if (jcLugar.getSelectedIndex() != -1)
        {
            defectoc(jfFecha,fFecha,true);
            jfFecha.requestFocus();
            jcLugar.setEnabled(false);
        }
        else
        {
            jfFecha.setEnabled(false);
        }
    }//GEN-LAST:event_jcLugarActionPerformed

    private void jfFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfFechaActionPerformed
        try
        {
            fecha = LocalDate.parse(jfFecha.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            
            if (fecha.isBefore(LocalDate.now()))
                throw new Exception("LA FECHA TECLEADA NO ES VALIDA");
            
            jfHorai.requestFocus();
            defectoc(jfHorai,fHoras,true);  
            defectoc(jfFecha,fFecha,false);
            jfFecha.setBackground(Color.WHITE);
            jlError.setText("");
        }
        catch (Exception e)
        {
            jfFecha.setBackground(Color.red);
            jfFecha.requestFocus();
            jlError.setText(e.getMessage());
        }
    }//GEN-LAST:event_jfFechaActionPerformed

    private void jfHoraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfHoraiActionPerformed
        jfHoraf.setEnabled(true);
        jfHoraf.requestFocus();
        jfHoraf.setText("");
        jfHorai.setEnabled(false);
    }//GEN-LAST:event_jfHoraiActionPerformed

    private void errcon(javax.swing.JTextField jt,Exception e)
    {
        jlError.setText(e.getMessage());
        jt.setBackground(Color.red);
    }
    
    private void tfAforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAforoActionPerformed
       try
       {
           if (tfAforo.getText().isEmpty())
               throw new Exception("CAMPO OBLIGATORIO");
                       
           if (!validardato(tfAforo.getText(),"^[1-9][\\d]*$"))
                throw new Exception("SOLO NUMEROS");
           
           if (tfAforo.getText().length() > 11)
               throw new Exception("LA LONGITUD MAXIMA ES DE 11 NUMEROS");
           
           defectod(tfAforo);
           aforo = Integer.parseInt(tfAforo.getText());
           bAceptar.setEnabled(true);
           bAceptar.requestFocus();
       }
       catch (Exception e)
       {
           errcon(tfAforo,e);
       }      
    }//GEN-LAST:event_tfAforoActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
      try
      {
            if (Controlador.comprobarlugar(String.valueOf(jcLugar.getSelectedItem()), fecha, horai, horaf))
                    throw new Exception ("YA HAY UN ACONTECIMIENTO CREADO EN ESE LUGAR EL MISMO DIA Y ENTRE LAS HORAS INTRODUCIDAS");
                            
            Controlador.insertar(tfNombre.getText().toUpperCase(),String.valueOf(jcLugar.getSelectedItem()),fecha,horai,horaf,aforo);
                showMessageDialog(this,"ACONTECIMIENTO INSERTADO");
                Controlador.salirv(this);
      }
      catch (Exception e)
      {
          showMessageDialog(this,e.getMessage());
          limpiarventana();
      }            
    }//GEN-LAST:event_bAceptarActionPerformed

    private void jfHorafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfHorafActionPerformed
        try
        {   
            horai = LocalTime.parse(jfHorai.getText());
            horaf = LocalTime.parse(jfHoraf.getText());
            
            if (horai.isAfter(horaf))
                throw new Exception("LA HI NO PUEDE SER POSTERIOR A LA HF");
            
            if (horai.compareTo(horaf) ==0)
                throw new Exception("LA HORAS NO PUEDEN SER IGUALES");
            
            defectoc(jfHoraf,fHoras,false);
            defectoc(jfHorai,fHoras,false);
            jfHoraf.setBackground(Color.WHITE);
            jfHorai.setBackground(Color.WHITE);
            jlError.setText("");
            tfAforo.setEnabled(true);
            tfAforo.requestFocus();
        }
        catch (DateTimeException dte)
        {
            jfHoraf.setBackground(Color.red);
            jlError.setText("HORA INCORRECTA");
            jfHoraf.setEnabled(true);
            jfHoraf.setText("");
            jfHorai.setBackground(Color.WHITE);
            jfHoraf.requestFocus();
        }
        catch(Exception e)
        {
            jfHoraf.setBackground(Color.red);
            jfHorai.setBackground(Color.red);
            jlError.setText(e.getMessage());
            jfHorai.setEnabled(true);
            jfHorai.setText("");
            jfHorai.requestFocus();
            jfHoraf.setEnabled(false);
        }  
    }//GEN-LAST:event_jfHorafActionPerformed

    public void limpiarventana()
    {
        //Nombre
            defte(tfNombre,true);
            tfNombre.requestFocus();
        
        //Lugar
            jcLugar.setSelectedIndex(-1);
            
        //Fecha
            defft(jfFecha);
            
        //Horas
            defft(jfHorai);
            defft(jfHoraf);
        
        //Aforo
            defte(tfAforo,false);
            
        //Boton
            bAceptar.setEnabled(false);     
    }
    
    public void defte(javax.swing.JTextField tf,boolean valor)
    {
        tf.setText("");
        tf.setEnabled(valor);
    } 
    
    public void defft(javax.swing.JFormattedTextField jf)
    {
        jf.setText("");
    }
    
    private boolean validardato(String dato, String expre)
    {
        Pattern pt = Pattern.compile(expre);
        Matcher m = pt.matcher(dato);
        return m.matches();
        
        /*
            if(!m.matches())
                return false;
            return true;
        */
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
            java.util.logging.Logger.getLogger(VentanaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaCrear dialog = new VentanaCrear(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel fFecha;
    private javax.swing.JLabel fHoras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jcLugar;
    private javax.swing.JFormattedTextField jfFecha;
    private javax.swing.JFormattedTextField jfHoraf;
    private javax.swing.JFormattedTextField jfHorai;
    private javax.swing.JLabel jlError;
    private javax.swing.JTextField tfAforo;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
