/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import static colegio.VistaPrincipal.alumno;
import com.sun.xml.internal.bind.v2.model.core.Adapter;
import java.awt.event.KeyAdapter;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mila
 */
public class FormularioAlumno extends javax.swing.JInternalFrame {

   

    public FormularioAlumno() {
        initComponents();

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
        ApellidoAlumno = new javax.swing.JTextField();
        NombreAlumno = new javax.swing.JTextField();
        LegajoAlumno = new javax.swing.JTextField();
        GuardarAlumno = new javax.swing.JButton();
        NuevoAlumno = new javax.swing.JButton();
        SalirAlumno = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Legajo:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("Apellido:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("Formulario de Alumno");

        ApellidoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoAlumnoActionPerformed(evt);
            }
        });

        NombreAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreAlumnoActionPerformed(evt);
            }
        });

        LegajoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LegajoAlumnoActionPerformed(evt);
            }
        });
        LegajoAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LegajoAlumnoKeyTyped(evt);
            }
        });

        GuardarAlumno.setForeground(new java.awt.Color(102, 153, 255));
        GuardarAlumno.setText("Guardar");
        GuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarAlumnoActionPerformed(evt);
            }
        });

        NuevoAlumno.setForeground(new java.awt.Color(102, 153, 255));
        NuevoAlumno.setText("Nuevo");
        NuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoAlumnoActionPerformed(evt);
            }
        });

        SalirAlumno.setForeground(new java.awt.Color(102, 153, 255));
        SalirAlumno.setText("Salir");
        SalirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(NombreAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addComponent(ApellidoAlumno, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(LegajoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GuardarAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NuevoAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SalirAlumno)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LegajoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ApellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarAlumno)
                    .addComponent(NuevoAlumno)
                    .addComponent(SalirAlumno))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApellidoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoAlumnoActionPerformed

    private void NombreAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreAlumnoActionPerformed

    private void LegajoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LegajoAlumnoActionPerformed

    }//GEN-LAST:event_LegajoAlumnoActionPerformed

    private void SalirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirAlumnoActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirAlumnoActionPerformed

    private void NuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoAlumnoActionPerformed
        LegajoAlumno.setText("");
        ApellidoAlumno.setText("");
        NombreAlumno.setText("");
    }//GEN-LAST:event_NuevoAlumnoActionPerformed
    public boolean chequeo() {
        return (LegajoAlumno.getText().isEmpty() || ApellidoAlumno.getText().isEmpty() || NombreAlumno.getText().isEmpty());

    }
    private void GuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarAlumnoActionPerformed

        if (!chequeo()) {
                Integer legajo = Integer.parseInt(LegajoAlumno.getText());
                Alumno a1 = new Alumno(legajo, ApellidoAlumno.getText(), NombreAlumno.getText());
                VistaPrincipal.alumno.add(a1);
                JOptionPane.showMessageDialog(this, "El Alumno fue agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Complete los campos ", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_GuardarAlumnoActionPerformed

    private void LegajoAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LegajoAlumnoKeyTyped
        char car = evt.getKeyChar();
        if (!Character.isDigit(car)) {
            evt.consume();
        }

    }//GEN-LAST:event_LegajoAlumnoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoAlumno;
    private javax.swing.JButton GuardarAlumno;
    private javax.swing.JTextField LegajoAlumno;
    private javax.swing.JTextField NombreAlumno;
    private javax.swing.JButton NuevoAlumno;
    private javax.swing.JButton SalirAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
