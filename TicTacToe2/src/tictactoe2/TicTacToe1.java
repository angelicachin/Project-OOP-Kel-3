/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoe2;

import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author angel
 */
public class TicTacToe1 extends javax.swing.JFrame {

    int nilai, nilaiX, nilaiO;
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    /**
     * Creates new form JFrame
     */
    public TicTacToe1() {
        initComponents();
        nilai = 1;
        nilaiX = 0;
        nilaiO = 0;
    }

    private void gameScore(){
        jlblX.setText(String.valueOf(xCount));
        jlblO.setText(String.valueOf(oCount));
    }
    
    private void choose(){
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
        }else{
            startGame = "X";
        }
    }
    
    private void randomComp(){
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
        Random rand = new Random();
        int temp = rand.nextInt(9)+ 1;
        if(temp == 1){
            if(b1.equals("")){
                btn1.setText("O");
                startGame = "O";
            }else{
                randomComp();
            }
        }else if(temp == 2){
            if(b2.equals("")){
                btn2.setText("O");
                startGame = "O";
            }else{
                randomComp();
            }
        }else if(temp == 3){
            if(b3.equals("")){
                btn3.setText("O");
                startGame = "O";
            }else{
                randomComp();
            }
        }else if(temp == 4){
            if(b4.equals("")){
                btn4.setText("O");
                startGame = "O";
            }else{
                randomComp();
            }
        }else if(temp == 5){
            if(b5.equals("")){
                btn5.setText("O");
                startGame = "O";
            }else{
                randomComp();
            }
        }else if(temp == 6){
            if(b6.equals("")){
                btn6.setText("O");
                startGame = "O";
            }else{
                randomComp();
            }
        }else if(temp == 7){
            if(b7.equals("")){
                btn7.setText("O");
                startGame = "O";
            }else{
                randomComp();
            }
        }else if(temp == 8){
            if(b8.equals("")){
                btn8.setText("O");
                startGame = "O";
            }else{
                randomComp();
            }
        }else if(temp == 9){
            if(b9.equals("")){
                btn9.setText("O");
                startGame = "O";
            }else{
                randomComp();
            }
        }
        
    }
    private void winningGame(){
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
        if(b1 == ("X") && b2 == ("X") && b3 == ("X")){
            xCount++;
            gameScore();
        }
        if(b4 == ("X") && b5 == ("X") && b6 == ("X")){
            xCount++;
            gameScore();
        }
        if(b7 == ("X") && b8 == ("X") && b9 == ("X")){
            xCount++;
            gameScore();
        }
        if(b1 == ("X") && b5 == ("X") && b9 == ("X")){
            xCount++;
            gameScore();
        }
        if(b1 == ("X") && b4 == ("X") && b7 == ("X")){
            xCount++;
            gameScore();
        }
        if(b2 == ("X") && b5 == ("X") && b8 == ("X")){
            xCount++;
            gameScore();
        }
        if(b3 == ("X") && b6 == ("X") && b9 == ("X")){
            xCount++;
            gameScore();
        }
        if(b3 == ("X") && b5 == ("X") && b7 == ("X")){
            xCount++;
            gameScore();
        }
        // O
        if(b1 == ("O") && b2 == ("O") && b3 == ("O")){
            oCount++;
            gameScore();
        }
        if(b4 == ("O") && b5 == ("O") && b6 == ("O")){
            oCount++;
            gameScore();
        }
        if(b7 == ("O") && b8 == ("O") && b9 == ("O")){
            oCount++;
            gameScore();
        }
       
        if(b1 == ("O") && b5 == ("O") && b9 == ("O")){
            oCount++;
            gameScore();
        }
        if(b1 == ("O") && b4 == ("O") && b7 == ("O")){
            oCount++;
            gameScore();
        }
        if(b2 == ("O") && b5 == ("O") && b8 == ("O")){
            oCount++;
            gameScore();
        }
        if(b3 == ("O") && b6 == ("O") && b9 == ("O")){
            oCount++;
            gameScore();
        }
        if(b3 == ("O") && b5 == ("O") && b7 == ("O")){
            oCount++;
            gameScore();
        }
    }
    
    void pemenang() {
        if (btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is X!");
        } else if (btn4.getText() == "X" && btn5.getText() == "X" && btn6.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is X!");
        } else if (btn7.getText() == "X" && btn8.getText() == "X" && btn9.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is X!");
        } else if (btn1.getText() == "X" && btn5.getText() == "X" && btn9.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is X!");
        } else if (btn3.getText() == "X" && btn5.getText() == "X" && btn7.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is X!");
        } else if (btn1.getText() == "X" && btn4.getText() == "X" && btn7.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is X!");
        } else if (btn2.getText() == "X" && btn5.getText() == "X" && btn8.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is X!");
        } else if (btn3.getText() == "X" && btn6.getText() == "X" && btn9.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is X!");
        }

        if (btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is O!");
        } else if (btn4.getText() == "O" && btn5.getText() == "O" && btn6.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is O!");
        } else if (btn7.getText() == "O" && btn8.getText() == "O" && btn9.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is O!");
        } else if (btn1.getText() == "O" && btn5.getText() == "O" && btn9.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is O!");
        } else if (btn3.getText() == "O" && btn5.getText() == "O" && btn7.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is O!");
        } else if (btn1.getText() == "O" && btn4.getText() == "O" && btn7.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is O!");
        } else if (btn2.getText() == "O" && btn5.getText() == "O" && btn8.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is O!");
        } else if (btn3.getText() == "O" && btn6.getText() == "O" && btn9.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "The Winner is O!");
        }
    }
    
    void reset() {
        nilai = 1;
        nilaiX = 0;
        nilaiO = 0;

        jlblO.setText(String.valueOf(oCount));
        jlblX.setText(String.valueOf(xCount));

        btn1.setText("");
        btn1.setEnabled(true);
        btn2.setText("");
        btn2.setEnabled(true);
        btn3.setText("");
        btn3.setEnabled(true);
        btn4.setText("");
        btn4.setEnabled(true);
        btn5.setText("");
        btn5.setEnabled(true);
        btn6.setText("");
        btn6.setEnabled(true);
        btn7.setText("");
        btn7.setEnabled(true);
        btn8.setText("");
        btn8.setEnabled(true);
        btn9.setText("");
        btn9.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblX = new javax.swing.JLabel();
        jlblO = new javax.swing.JLabel();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnreset1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Tic Tac Toe");

        jlblX.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblX.setText("0");

        jlblO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblO.setText("0");

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnreset.setBackground(new java.awt.Color(153, 153, 153));
        btnreset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnreset1.setBackground(new java.awt.Color(153, 153, 153));
        btnreset1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnreset1.setText("BACK");
        btnreset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Player X:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Player O:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnreset1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlblX))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(4, 4, 4)
                            .addComponent(jlblO))))
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblX)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblO)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnreset1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        btn1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        if(!btn1.getText().equals("")){
            btn1.setEnabled(false);
        }
        randomComp();
        choose();
        pemenang();
        winningGame();
       
    }//GEN-LAST:event_btn1ActionPerformed

    
    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        reset();
        
    }//GEN-LAST:event_btnresetActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        btn2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        if(!btn2.getText().equals("")){
            btn2.setEnabled(false);
        }
        randomComp();
        choose();
        pemenang();
        winningGame();

    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        btn3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        if(!btn3.getText().equals("")){
            btn3.setEnabled(false);
        }
        randomComp();
        choose();
        pemenang();
        winningGame();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        btn4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        if(!btn4.getText().equals("")){
            btn4.setEnabled(false);
        }
        randomComp();
        choose();
        pemenang();
        winningGame();

    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        btn5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        if(!btn5.getText().equals("")){
            btn5.setEnabled(false);
        }
        randomComp();
        choose();
        pemenang();
        winningGame();

    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        btn6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        if(!btn6.getText().equals("")){
            btn6.setEnabled(false);
        }
        randomComp();
        choose();
        pemenang();
        winningGame();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        btn7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        if(!btn7.getText().equals("")){
            btn7.setEnabled(false);
        }
        randomComp();
        choose();
        pemenang();
        winningGame();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        btn8.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        if(!btn8.getText().equals("")){
            btn8.setEnabled(false);
        }
        randomComp();
        choose();
        pemenang();
        winningGame();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        btn9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker = true;
        }
        if(!btn9.getText().equals("")){
            btn9.setEnabled(false);
        }
        randomComp();
        choose();
        pemenang();
        winningGame();

    }//GEN-LAST:event_btn9ActionPerformed

    private void btnreset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login a = new Login();
        a.setVisible(true);
    }//GEN-LAST:event_btnreset1ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnreset1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlblO;
    private javax.swing.JLabel jlblX;
    // End of variables declaration//GEN-END:variables
}
