/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app.ui;

import javax.swing.JOptionPane;
import app.model.TipoDePeca;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nirva
 */
public class CadastroTipoPeca extends javax.swing.JFrame {

	/**
	 * Creates new form CadastroPeca
	 */
	public CadastroTipoPeca()
	{
		initComponents();
		loadTable();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents()
        {

                pnlPrincipal = new javax.swing.JPanel();
                lblId = new javax.swing.JLabel();
                txtId = new javax.swing.JTextField();
                lblTipo = new javax.swing.JLabel();
                txtTipo = new javax.swing.JFormattedTextField();
                lblMarca = new javax.swing.JLabel();
                txtMarca = new javax.swing.JTextField();
                btnSearchTM = new javax.swing.JButton();
                btnSearchC = new javax.swing.JButton();
                lblPrice = new javax.swing.JLabel();
                txtPrice = new javax.swing.JTextField();
                pnlTabela = new javax.swing.JScrollPane();
                tblTable = new javax.swing.JTable();
                btnEdit = new javax.swing.JButton();
                btnRemove = new javax.swing.JButton();
                btnRegister = new javax.swing.JButton();
                btnSave = new javax.swing.JButton();
                btnCancel = new javax.swing.JButton();
                btnReturn = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Cadastro e Gerenciamento de Peças");
                setResizable(false);

                pnlPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Peça"));

                lblId.setText("Código");

                lblTipo.setText("Tipo");

                lblMarca.setText("Marca");

                btnSearchTM.setText("Pesquisar por Tipo e Marca");
                btnSearchTM.addActionListener(new java.awt.event.ActionListener()
                {
                        public void actionPerformed(java.awt.event.ActionEvent evt)
                        {
                                btnSearchTMActionPerformed(evt);
                        }
                });

                btnSearchC.setText("Pesquisar por Código");
                btnSearchC.addActionListener(new java.awt.event.ActionListener()
                {
                        public void actionPerformed(java.awt.event.ActionEvent evt)
                        {
                                btnSearchCActionPerformed(evt);
                        }
                });

                lblPrice.setText("Preço");

                txtPrice.setEnabled(false);

                javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
                pnlPrincipal.setLayout(pnlPrincipalLayout);
                pnlPrincipalLayout.setHorizontalGroup(
                        pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTipo)
                                                        .addComponent(lblMarca)
                                                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                                                .addComponent(txtTipo))
                                                        .addComponent(btnSearchTM))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnSearchC)
                                                        .addComponent(lblId)
                                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblPrice)
                                                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 11, Short.MAX_VALUE))))
                );
                pnlPrincipalLayout.setVerticalGroup(
                        pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchTM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(24, Short.MAX_VALUE))
                );

                tblTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][]
                        {

                        },
                        new String []
                        {
                                "Código", "Tipo", "Marca", "Preço"
                        }
                )
                {
                        boolean[] canEdit = new boolean []
                        {
                                false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex)
                        {
                                return canEdit [columnIndex];
                        }
                });
                tblTable.getTableHeader().setReorderingAllowed(false);
                tblTable.addMouseListener(new java.awt.event.MouseAdapter()
                {
                        public void mouseClicked(java.awt.event.MouseEvent evt)
                        {
                                tblTableMouseClicked(evt);
                        }
                });
                pnlTabela.setViewportView(tblTable);
                if (tblTable.getColumnModel().getColumnCount() > 0)
                {
                        tblTable.getColumnModel().getColumn(0).setPreferredWidth(5);
                }

                btnEdit.setText("Editar esta peça");
                btnEdit.setEnabled(false);
                btnEdit.addActionListener(new java.awt.event.ActionListener()
                {
                        public void actionPerformed(java.awt.event.ActionEvent evt)
                        {
                                btnEditActionPerformed(evt);
                        }
                });

                btnRemove.setText("Remover esta peça");
                btnRemove.setEnabled(false);
                btnRemove.addActionListener(new java.awt.event.ActionListener()
                {
                        public void actionPerformed(java.awt.event.ActionEvent evt)
                        {
                                btnRemoveActionPerformed(evt);
                        }
                });

                btnRegister.setText("Cadastrar nova peça");
                btnRegister.addActionListener(new java.awt.event.ActionListener()
                {
                        public void actionPerformed(java.awt.event.ActionEvent evt)
                        {
                                btnRegisterActionPerformed(evt);
                        }
                });

                btnSave.setText("Salvar");
                btnSave.setEnabled(false);
                btnSave.addActionListener(new java.awt.event.ActionListener()
                {
                        public void actionPerformed(java.awt.event.ActionEvent evt)
                        {
                                btnSaveActionPerformed(evt);
                        }
                });

                btnCancel.setText("Cancelar");
                btnCancel.setEnabled(false);
                btnCancel.addActionListener(new java.awt.event.ActionListener()
                {
                        public void actionPerformed(java.awt.event.ActionEvent evt)
                        {
                                btnCancelActionPerformed(evt);
                        }
                });

                btnReturn.setText("Voltar");
                btnReturn.addActionListener(new java.awt.event.ActionListener()
                {
                        public void actionPerformed(java.awt.event.ActionEvent evt)
                        {
                                btnReturnActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(btnEdit)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnRemove)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnRegister)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSave)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCancel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnReturn))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pnlTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnlTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnEdit)
                                        .addComponent(btnRegister)
                                        .addComponent(btnRemove)
                                        .addComponent(btnSave)
                                        .addComponent(btnCancel)
                                        .addComponent(btnReturn))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

	// nongenerated attributes
	TipoDePeca currentTPeca;

	enum Editmode {
		EDITING, NEW
	};
	Editmode mode;

	// funcoes de estado da tela para gerenciar botoes e campos ativos etc
	// loadTable: atualiza a tabela
	private void loadTable()
	{
		DefaultTableModel newTable = new DefaultTableModel(new Object[]{"Código", "Tipo", "Marca", "Preço"}, 0);

		for (int i = 0; i < TipoDePeca.getTPecaQuantity(); i++) {
			Object line[] = new Object[]{
				TipoDePeca.searchTPecaPosition(i).getId(),
				TipoDePeca.searchTPecaPosition(i).getTipo(),
				TipoDePeca.searchTPecaPosition(i).getMarca(),
				String.format("%.2f", TipoDePeca.searchTPecaPosition(i).getPreco())};
			newTable.addRow(line);
		}

		tblTable.setModel(newTable);

		tblTable.getColumnModel().getColumn(0).setPreferredWidth(5);
	}

	// limpa campos de texto
	private void clearTextFields()
	{
		txtId.setText("");
		txtTipo.setText("");
		txtMarca.setText("");
		txtPrice.setText("");
	}

	private void enterMainState()
	{
		btnCancel.setEnabled(false);
		btnSave.setEnabled(false);
		btnEdit.setEnabled(false);
		btnSearchTM.setEnabled(true);
		btnSearchC.setEnabled(true);
		btnRegister.setEnabled(true);
		btnRemove.setEnabled(false);

		txtId.setEnabled(true);
		txtTipo.setEnabled(true);
		txtMarca.setEnabled(true);
		txtPrice.setEnabled(false);
		clearTextFields();

		loadTable();
	}

	private void enterEditState()
	{
		btnSearchTM.setEnabled(false);
		btnSearchC.setEnabled(false);
		btnRegister.setEnabled(false);
		btnEdit.setEnabled(false);
		btnSave.setEnabled(true);
		btnCancel.setEnabled(true);
		btnRemove.setEnabled(false);

		txtId.setEnabled(false);
		txtTipo.setEnabled(true);
		txtMarca.setEnabled(true);
		txtPrice.setEnabled(true);
	}

	private void enterViewState()
	{
		btnRemove.setEnabled(true);
		btnEdit.setEnabled(true);
		btnRegister.setEnabled(false);
		btnSearchTM.setEnabled(false);
		btnSearchC.setEnabled(false);
		btnCancel.setEnabled(true);

		txtId.setEnabled(false);
		txtTipo.setEnabled(false);
		txtMarca.setEnabled(false);
		txtPrice.setEnabled(false);

		txtId.setText(String.valueOf(currentTPeca.getId()));
		txtTipo.setText(currentTPeca.getTipo());
		txtMarca.setText(currentTPeca.getMarca());
		txtPrice.setText(String.format("%.2f", currentTPeca.getPreco()));
	}

	// funcoes de eventos

        private void btnSearchTMActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchTMActionPerformed
        {//GEN-HEADEREND:event_btnSearchTMActionPerformed
		String tipo;
		String marca;

		if (txtTipo.getText().equals("") || txtMarca.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Preencha os campos de tipo e marca!", "Erro", JOptionPane.ERROR_MESSAGE);
		} else {

			tipo = txtTipo.getText();
			marca = txtMarca.getText();

			if ((currentTPeca = TipoDePeca.searchTPeca(tipo, marca)) != null) {
				mode = Editmode.EDITING;
				enterViewState();
			} else {
				JOptionPane.showMessageDialog(null, "Não encontramos esse tipo de peça", "Erro", JOptionPane.ERROR_MESSAGE);
				enterMainState();
			}
		}
        }//GEN-LAST:event_btnSearchTMActionPerformed

        private void btnSearchCActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchCActionPerformed
        {//GEN-HEADEREND:event_btnSearchCActionPerformed
		int id;

		if (txtId.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Preencha o campo de código!", "Erro", JOptionPane.ERROR_MESSAGE);
		} else {

			id = Integer.parseInt(txtId.getText());

			if ((currentTPeca = TipoDePeca.searchTPeca(id)) != null) {
				mode = Editmode.EDITING;
				enterViewState();
			} else {
				JOptionPane.showMessageDialog(null, "Não encontramos esse tipo de peça", "Erro", JOptionPane.ERROR_MESSAGE);
				enterMainState();
			}
		}
        }//GEN-LAST:event_btnSearchCActionPerformed

        private void btnEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditActionPerformed
        {//GEN-HEADEREND:event_btnEditActionPerformed
		enterEditState();
        }//GEN-LAST:event_btnEditActionPerformed

        private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegisterActionPerformed
        {//GEN-HEADEREND:event_btnRegisterActionPerformed
		txtId.setText("");
		txtPrice.setText("");
		mode = Editmode.NEW;
		enterEditState();
        }//GEN-LAST:event_btnRegisterActionPerformed

        private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRemoveActionPerformed
        {//GEN-HEADEREND:event_btnRemoveActionPerformed
		TipoDePeca.removerCadastro(currentTPeca);
		enterMainState();
        }//GEN-LAST:event_btnRemoveActionPerformed

        private void btnSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveActionPerformed
        {//GEN-HEADEREND:event_btnSaveActionPerformed
		String tipo = txtTipo.getText();
		String marca = txtMarca.getText();
		
		if (mode == Editmode.NEW) {	
			if ((currentTPeca = TipoDePeca.searchTPeca(tipo, marca)) == null) {
				currentTPeca = new TipoDePeca(tipo, marca, Double.valueOf(txtPrice.getText()));
				enterMainState();
			} else {
				int selection = JOptionPane.showOptionDialog(null, "Esse cadastro já existe! Editar?", "Aviso", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (selection == 0)
					mode = Editmode.EDITING;
				enterEditState();
			}
		} else if (mode == Editmode.EDITING) {
			currentTPeca.setMarca(txtMarca.getText());
			currentTPeca.setTipo(txtTipo.getText());
			currentTPeca.setPreco(Double.valueOf(txtPrice.getText()));
			enterMainState();
		}
        }//GEN-LAST:event_btnSaveActionPerformed

        private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
        {//GEN-HEADEREND:event_btnCancelActionPerformed
		// cancelamento de qualquer acao
		currentTPeca = null;
		enterMainState();
        }//GEN-LAST:event_btnCancelActionPerformed

        private void tblTableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblTableMouseClicked
        {//GEN-HEADEREND:event_tblTableMouseClicked
		// handling de clique na tabela
		currentTPeca = TipoDePeca.searchTPecaPosition(tblTable.getSelectedRow());
		mode = Editmode.EDITING;
		enterViewState();
        }//GEN-LAST:event_tblTableMouseClicked

        private void btnReturnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnReturnActionPerformed
        {//GEN-HEADEREND:event_btnReturnActionPerformed
                this.dispose();
        }//GEN-LAST:event_btnReturnActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[])
	{
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			javax.swing.UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(CadastroTipoPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CadastroTipoPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CadastroTipoPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CadastroTipoPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				new CadastroTipoPeca().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnCancel;
        private javax.swing.JButton btnEdit;
        private javax.swing.JButton btnRegister;
        private javax.swing.JButton btnRemove;
        private javax.swing.JButton btnReturn;
        private javax.swing.JButton btnSave;
        private javax.swing.JButton btnSearchC;
        private javax.swing.JButton btnSearchTM;
        private javax.swing.JLabel lblId;
        private javax.swing.JLabel lblMarca;
        private javax.swing.JLabel lblPrice;
        private javax.swing.JLabel lblTipo;
        private javax.swing.JPanel pnlPrincipal;
        private javax.swing.JScrollPane pnlTabela;
        private javax.swing.JTable tblTable;
        private javax.swing.JTextField txtId;
        private javax.swing.JTextField txtMarca;
        private javax.swing.JTextField txtPrice;
        private javax.swing.JFormattedTextField txtTipo;
        // End of variables declaration//GEN-END:variables
}