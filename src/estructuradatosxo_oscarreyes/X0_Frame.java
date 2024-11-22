/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estructuradatosxo_oscarreyes;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class X0_Frame extends javax.swing.JFrame {

    //Constructor
    public X0_Frame() {
        initComponents();
    }
    
        //Diccionario Variables
        String Jugador;
    
    
    //Inicializando constructor - Liga la clase JFrame a la clase que maneja el juego
    static EstructuraDatosXO_OscarReyes E = new EstructuraDatosXO_OscarReyes(); 
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelJuego = new javax.swing.JPanel();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Turnos = new javax.swing.JLabel();
        panelNombres = new javax.swing.JPanel();
        Jugador1 = new javax.swing.JLabel();
        Jugador2 = new javax.swing.JLabel();
        fieldJugador1 = new javax.swing.JTextField();
        fieldJugador2 = new javax.swing.JTextField();
        seleccionJugador1 = new javax.swing.JButton();
        seleccionJugador2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelJuegoLayout = new javax.swing.GroupLayout(panelJuego);
        panelJuego.setLayout(panelJuegoLayout);
        panelJuegoLayout.setHorizontalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJuegoLayout.createSequentialGroup()
                        .addComponent(Button1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button3))
                    .addGroup(panelJuegoLayout.createSequentialGroup()
                        .addComponent(Button4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button6))
                    .addGroup(panelJuegoLayout.createSequentialGroup()
                        .addComponent(Button7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelJuegoLayout.setVerticalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(Button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button6, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button9, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Titulo.setText("Juego X-0");

        Turnos.setText("Turno de Jugador:");

        Jugador1.setText("Jugador 1: ");
        Jugador1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Jugador1PropertyChange(evt);
            }
        });

        Jugador2.setText("Jugador 2:");

        fieldJugador1.setText(". . .");
        fieldJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldJugador1ActionPerformed(evt);
            }
        });

        fieldJugador2.setText(". . .");
        fieldJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldJugador2ActionPerformed(evt);
            }
        });

        seleccionJugador1.setText("Seleccionar");
        seleccionJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionJugador1ActionPerformed(evt);
            }
        });

        seleccionJugador2.setText("Seleccionar");
        seleccionJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionJugador2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNombresLayout = new javax.swing.GroupLayout(panelNombres);
        panelNombres.setLayout(panelNombresLayout);
        panelNombresLayout.setHorizontalGroup(
            panelNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNombresLayout.createSequentialGroup()
                .addGroup(panelNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelNombresLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(panelNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Jugador2)))
                        .addGroup(panelNombresLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panelNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelNombresLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(seleccionJugador1))
                                .addComponent(fieldJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelNombresLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(seleccionJugador2))
                        .addComponent(fieldJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panelNombresLayout.setVerticalGroup(
            panelNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNombresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jugador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(seleccionJugador1)
                .addGap(18, 18, 18)
                .addComponent(Jugador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seleccionJugador2)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Turnos)
                        .addGap(170, 170, 170)))
                .addComponent(panelNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(Titulo)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Turnos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldJugador2ActionPerformed
        
    }//GEN-LAST:event_fieldJugador2ActionPerformed

    private void seleccionJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionJugador1ActionPerformed
        String NombreJugador1 = fieldJugador1.getText();
        Jugador = NombreJugador1;
        E.establecerJugador(Jugador, 1);
        Jugador1.setText("Jugador 1: " + E.Jugadores[0]);
        
            //Validacion de nombres
            if(Jugador1 == Jugador2){
                JOptionPane.showMessageDialog(null, "Ingrese un nombre diferente!!!!");
                Jugador1.setText((". . ."));
            }
    }//GEN-LAST:event_seleccionJugador1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        if (Button2.getText() == ""){
            Button2.setText(E.turnoJugador());
            E.Arreglo[0][1] = E.turnoJugador();
            E.ganoJugador();
            
            //Impresion de nombre por turno
            if (E.Turno == 1){
                Turnos.setText("Turno de: " + E.Jugadores[1]);
                E.Turno = 2;
            }
            else{
                Turnos.setText("Turno de: " + E.Jugadores[0]);
                E.Turno = 1;
            }
        }
        else {
            E.validarPosicion();
        }
        
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        if (Button5.getText() == ""){
            Button5.setText(E.turnoJugador());
            E.Arreglo[1][1] = E.turnoJugador();
           E.ganoJugador();
            
            //Impresion de nombre por turno
            if (E.Turno == 1){
                Turnos.setText("Turno de: " + E.Jugadores[1]);
                E.Turno = 2;
            }
            else{
                Turnos.setText("Turno de: " + E.Jugadores[0]);
                E.Turno = 1;
            }
        }
        else {
            E.validarPosicion();
        }
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        if (Button3.getText() == ""){
            Button3.setText(E.turnoJugador());
            E.Arreglo[0][2] = E.turnoJugador();
            E.ganoJugador();
            
            //Impresion de nombre por turno
            if (E.Turno == 1){
                Turnos.setText("Turno de: " + E.Jugadores[1]);
                E.Turno = 2;
            }
            else{
                Turnos.setText("Turno de: " + E.Jugadores[0]);
                E.Turno = 1;
            }
        }
        else {
            E.validarPosicion();
        }
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        if (Button1.getText() == ""){
            Button1.setText(E.turnoJugador());
            E.Arreglo[0][0] = E.turnoJugador();
            E.ganoJugador();
            
            //Impresion de nombre por turno
            if (E.Turno == 1){
                Turnos.setText("Turno de: " + E.Jugadores[1]);
                E.Turno = 2;
            }
            else{
                Turnos.setText("Turno de: " + E.Jugadores[0]);
                E.Turno = 1;
            }
        }
        else {
            E.validarPosicion();
        }
        
    }//GEN-LAST:event_Button1ActionPerformed

    private void seleccionJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionJugador2ActionPerformed
        String NombreJugador2 = fieldJugador2.getText();
        Jugador = NombreJugador2;
        E.establecerJugador(Jugador, 2);
        Jugador2.setText("Jugador 2: " + E.Jugadores[1]);
        
            //Validacion de nombres
            if(E.Jugadores[0] == E.Jugadores[1]){
                JOptionPane.showMessageDialog(null, "Ingrese un nombre diferente!!!!");
                Jugador2.setText((". . ."));
            }
            
            //Impresion de nombre por turno
            if (E.Turno == 1){
                Turnos.setText("Turno de: " + E.Jugadores[0]);
            }
            else{
                Turnos.setText("Turno de: " + E.Jugadores[1]);
            }
    }//GEN-LAST:event_seleccionJugador2ActionPerformed

    private void fieldJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldJugador1ActionPerformed
       
    }//GEN-LAST:event_fieldJugador1ActionPerformed

    private void Jugador1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Jugador1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_Jugador1PropertyChange

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        if (Button4.getText() == ""){
            Button4.setText(E.turnoJugador());
            E.Arreglo[1][0] = E.turnoJugador();
            E.ganoJugador();
            
            //Impresion de nombre por turno
            if (E.Turno == 1){
                Turnos.setText("Turno de: " + E.Jugadores[1]);
                E.Turno = 2;
            }
            else{
                Turnos.setText("Turno de: " + E.Jugadores[0]);
                E.Turno = 1;
            }
        }
        else {
            E.validarPosicion();
        }
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        if (Button8.getText() == ""){
            Button8.setText(E.turnoJugador());
            E.Arreglo[2][1] = E.turnoJugador();
            E.ganoJugador();
            
            //Impresion de nombre por turno
            if (E.Turno == 1){
                Turnos.setText("Turno de: " + E.Jugadores[1]);
                E.Turno = 2;
            }
            else{
                Turnos.setText("Turno de: " + E.Jugadores[0]);
                E.Turno = 1;
            }
        }
        else {
            E.validarPosicion();
        }
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        if (Button7.getText() == ""){
            Button7.setText(E.turnoJugador());
            E.Arreglo[2][0] = E.turnoJugador();
            E.ganoJugador();
            
            //Impresion de nombre por turno
            if (E.Turno == 1){
                Turnos.setText("Turno de: " + E.Jugadores[1]);
                E.Turno = 2;
            }
            else{
                Turnos.setText("Turno de: " + E.Jugadores[0]);
                E.Turno = 1;
            }
        }
        else {
            E.validarPosicion();
        }
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        if (Button6.getText() == ""){
            Button6.setText(E.turnoJugador());
            E.Arreglo[1][2] = E.turnoJugador();
            E.ganoJugador();
            
            //Impresion de nombre por turno
            if (E.Turno == 1){
                Turnos.setText("Turno de: " + E.Jugadores[1]);
                E.Turno = 2;
            }
            else{
                Turnos.setText("Turno de: " + E.Jugadores[0]);
                E.Turno = 1;
            }
        }
        else {
            E.validarPosicion();
        }
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        if (Button9.getText() == ""){
            Button9.setText(E.turnoJugador());
            E.Arreglo[2][2] = E.turnoJugador();
            E.ganoJugador();
            
            //Impresion de nombre por turno
            if (E.Turno == 1){
                Turnos.setText("Turno de: " + E.Jugadores[1]);
                E.Turno = 2;
            }
            else{
                Turnos.setText("Turno de: " + E.Jugadores[0]);
                E.Turno = 1;
            }
        }
        else {
            E.validarPosicion();
        }
    }//GEN-LAST:event_Button9ActionPerformed

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
            java.util.logging.Logger.getLogger(X0_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(X0_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(X0_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(X0_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new X0_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JLabel Jugador1;
    private javax.swing.JLabel Jugador2;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Turnos;
    private javax.swing.JTextField fieldJugador1;
    private javax.swing.JTextField fieldJugador2;
    private javax.swing.JPanel panelJuego;
    private javax.swing.JPanel panelNombres;
    private javax.swing.JButton seleccionJugador1;
    private javax.swing.JButton seleccionJugador2;
    // End of variables declaration//GEN-END:variables
}
