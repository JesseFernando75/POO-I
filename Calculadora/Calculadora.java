package swing;

public class Calculadora extends javax.swing.JFrame {
    
    public Calculadora() {
        initComponents();
    }
    
    double valor1, valor2;
    String operacao;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        edtNum2 = new javax.swing.JTextField();
        btnNum7 = new javax.swing.JButton();
        btnNum8 = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnNum1 = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnSomar = new javax.swing.JButton();
        edtNum1 = new javax.swing.JTextField();
        btnApagar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("           Calculadora");
        setBackground(java.awt.SystemColor.controlDkShadow);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        edtNum2.setEditable(false);
        edtNum2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        edtNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNum2ActionPerformed(evt);
            }
        });

        btnNum7.setText("7");
        btnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum7ActionPerformed(evt);
            }
        });

        btnNum8.setText("8");
        btnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum8ActionPerformed(evt);
            }
        });

        btnNum9.setText("9");
        btnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum9ActionPerformed(evt);
            }
        });

        btnMultiplicar.setText("x");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnNum4.setText("4");
        btnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum4ActionPerformed(evt);
            }
        });

        btnNum5.setText("5");
        btnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum5ActionPerformed(evt);
            }
        });

        btnNum6.setText("6");
        btnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum6ActionPerformed(evt);
            }
        });

        btnLimpar.setText("C");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnNum1.setText("1");
        btnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum2.setText("2");
        btnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum2ActionPerformed(evt);
            }
        });

        btnNum3.setText("3");
        btnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum3ActionPerformed(evt);
            }
        });

        btnSubtrair.setText("-");
        btnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtrairActionPerformed(evt);
            }
        });

        btnNum0.setText("0");
        btnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum0ActionPerformed(evt);
            }
        });

        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnSomar.setText("+");
        btnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomarActionPerformed(evt);
            }
        });

        edtNum1.setEditable(false);
        edtNum1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        edtNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNum1ActionPerformed(evt);
            }
        });

        btnApagar.setText("CE");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnDividir.setText("÷");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnPonto.setText(".");
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(edtNum2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(edtNum1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnNum0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(65, 65, 65)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(edtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnIgual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNum2ActionPerformed

    }//GEN-LAST:event_edtNum2ActionPerformed

    private void btnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum8ActionPerformed
         edtNum1.setText(edtNum1.getText() +"8");
    }//GEN-LAST:event_btnNum8ActionPerformed

    private void btnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum9ActionPerformed
         edtNum1.setText(edtNum1.getText() +"9");
    }//GEN-LAST:event_btnNum9ActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
         valor1 = Double.parseDouble(edtNum1.getText());
         operacao = " x ";
         edtNum2.setText(+valor1 +operacao);
         edtNum1.setText("");
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum0ActionPerformed
        edtNum1.setText("0");
    }//GEN-LAST:event_btnNum0ActionPerformed

    private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
        edtNum1.setText(edtNum1.getText() +"1");
    }//GEN-LAST:event_btnNum1ActionPerformed

    private void btnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum2ActionPerformed
        edtNum1.setText(edtNum1.getText() +"2");
    }//GEN-LAST:event_btnNum2ActionPerformed

    private void btnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum3ActionPerformed
       edtNum1.setText(edtNum1.getText() +"3");
    }//GEN-LAST:event_btnNum3ActionPerformed

    private void btnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum4ActionPerformed
       edtNum1.setText(edtNum1.getText() +"4");
    }//GEN-LAST:event_btnNum4ActionPerformed

    private void btnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum5ActionPerformed
        edtNum1.setText(edtNum1.getText() +"5");
    }//GEN-LAST:event_btnNum5ActionPerformed

    private void btnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum6ActionPerformed
        edtNum1.setText(edtNum1.getText() +"6");
    }//GEN-LAST:event_btnNum6ActionPerformed

    private void btnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum7ActionPerformed
        edtNum1.setText(edtNum1.getText() +"7");
    }//GEN-LAST:event_btnNum7ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
         edtNum1.setText("");
         edtNum2.setText("");
         valor1 = 0; valor2 = 0; operacao = "";
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtrairActionPerformed
         valor1 = Double.parseDouble(edtNum1.getText());
         operacao = " - ";
         edtNum2.setText(+valor1 +operacao);
         edtNum1.setText("");
    }//GEN-LAST:event_btnSubtrairActionPerformed

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomarActionPerformed
         valor1 = Double.parseDouble(edtNum1.getText());
         operacao = " + ";
         edtNum2.setText(+valor1 +operacao);
         edtNum1.setText("");
    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        valor2 = Double.parseDouble(edtNum1.getText());
        edtNum1.setText("");
        edtNum2.setText(edtNum2.getText() +valor2);
         
        switch (operacao){
            case " + ":
                edtNum1.setText(String.valueOf(valor1 + valor2));
                break;
            case " - ":
                edtNum1.setText(String.valueOf(valor1 - valor2));
                break;
            case " ÷ ":
                if(valor2 == 0){
                 edtNum1.setText("Não é possível dividir por zero");
                } else{
                   edtNum1.setText(String.valueOf(valor1 / valor2));
                 }
                break;
            case " x ":
                edtNum1.setText(String.valueOf(valor1 * valor2));
                break;
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void edtNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNum1ActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        edtNum1.setText("");
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
         valor1 = Double.parseDouble(edtNum1.getText());
         operacao = " ÷ ";
         edtNum2.setText(+valor1 +operacao);
         edtNum1.setText("");
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
         edtNum1.setText(edtNum1.getText() +".");
    }//GEN-LAST:event_btnPontoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculadora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum8;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JTextField edtNum1;
    private javax.swing.JTextField edtNum2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
