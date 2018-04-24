package net.librec.gui;

import java.io.File;
import java.util.HashMap;

import net.librec.util.ConfirmationUtil;
import net.librec.util.FileUtil;
import net.librec.util.StringUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

		   

/**
 *
 * @author PinkySwear
 */
public class AlgorithmParameterEditor extends javax.swing.JFrame {

	private String algorithm;
	private HashMap<String, String> parameters;
	
    /** Creates new form AlgorithmParameterEditor */
    public AlgorithmParameterEditor(String algorithm) {
        this.algorithm = algorithm;
        initComponents();
//        checkBoxUIR.setSelected(true);
//        checkBoxSplitRatio.setSelected(true);
     // set for the whole GUI
        setDefaultCloseOpt();
        setTitle("Parameter editor for " + algorithm);
        initParameters();
//        tableParameters.setSelectionColumnView();
        adjustTables();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelAll = new javax.swing.JPanel();
        panelTableDouble = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDoubleParameters = new UserFriendlyTable();
        panelStringParameters = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableStringParameters = new UserFriendlyTable();
        buttonCancel = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        panelTableInt = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableIntParameters = new UserFriendlyTable();
        jToolBar1 = new javax.swing.JToolBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelAll.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit algorithm parameters"));

        tableDoubleParameters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parameter", "Start value", "Step", "End value", "Manual values"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDoubleParameters);

        javax.swing.GroupLayout panelTableDoubleLayout = new javax.swing.GroupLayout(panelTableDouble);
        panelTableDouble.setLayout(panelTableDoubleLayout);
        panelTableDoubleLayout.setHorizontalGroup(
            panelTableDoubleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableDoubleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTableDoubleLayout.setVerticalGroup(
            panelTableDoubleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableDoubleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        tableStringParameters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parameter", "Value(s)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableStringParameters);

        javax.swing.GroupLayout panelStringParametersLayout = new javax.swing.GroupLayout(panelStringParameters);
        panelStringParameters.setLayout(panelStringParametersLayout);
        panelStringParametersLayout.setHorizontalGroup(
            panelStringParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStringParametersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        panelStringParametersLayout.setVerticalGroup(
            panelStringParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStringParametersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonCancel.setText("CANCEL");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonSave.setText("SAVE");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        tableIntParameters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parameter", "Start value", "Step", "End value", "Manual values"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableIntParameters);

        javax.swing.GroupLayout panelTableIntLayout = new javax.swing.GroupLayout(panelTableInt);
        panelTableInt.setLayout(panelTableIntLayout);
        panelTableIntLayout.setHorizontalGroup(
            panelTableIntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableIntLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTableIntLayout.setVerticalGroup(
            panelTableIntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableIntLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelAllLayout = new javax.swing.GroupLayout(panelAll);
        panelAll.setLayout(panelAllLayout);
        panelAllLayout.setHorizontalGroup(
            panelAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAllLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelStringParameters, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTableDouble, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAllLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonSave)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCancel)
                        .addGap(14, 14, 14))
                    .addComponent(panelTableInt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelAllLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonCancel, buttonSave});

        panelAllLayout.setVerticalGroup(
            panelAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAllLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTableDouble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelTableInt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelStringParameters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
																																								  
																					
																																										  
																					
                .addGroup(panelAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel)
                    .addComponent(buttonSave))
                .addContainerGap())
        );

        jToolBar1.setRollover(true);
        jToolBar1.setFloatable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	if(ConfirmationUtil.getConfirmation("If you cancel, your changes will not be saved. Are you sure you want to cancel?", "Really cancel?"))
    	{
    		dispose();
    	}
    }                                            

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AlgorithmParameterEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AlgorithmParameterEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AlgorithmParameterEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AlgorithmParameterEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AlgorithmParameterEditor("").setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panelAll;
    private javax.swing.JPanel panelStringParameters;
    private javax.swing.JPanel panelTableDouble;
    private javax.swing.JPanel panelTableInt;
    private UserFriendlyTable tableDoubleParameters;
    private UserFriendlyTable tableIntParameters;
    private UserFriendlyTable tableStringParameters;
    // End of variables declaration//GEN-END:variables
    public void initParameters()
    {
    	String filePath = System.getProperty("user.dir") + File.separator + "conf" + File.separator + algorithm + ".properties";
    	try
		{
			parameters = (HashMap<String, String>) FileUtil.readAsMap(filePath, "=");
			int doubleTableRow = 0, intTableRow = 0;
			for(String key : parameters.keySet())
			{
				String value = parameters.get(key).trim();
				if(!key.contains("rec.recommender.class")){
					if(value.matches(".*\\d+.*"))
					{
						if(value.contains("."))
						{
							tableDoubleParameters.addRowWithoutSelect(key);
//							System.out.println(filePath);
							tableDoubleParameters.setValueAt(Double.parseDouble(value), doubleTableRow, 1);
							for(int col = 2; col < tableDoubleParameters.getColumnCount(); col++)
								tableDoubleParameters.setValueAt(0.0, doubleTableRow, col);
							doubleTableRow++;
						}
						else
						{
							tableIntParameters.addRowWithoutSelect(key);
							tableIntParameters.setValueAt(value, intTableRow, 1);
							for(int col = 2; col < tableIntParameters.getColumnCount(); col++)
							{
//								System.out.println(col);
								tableIntParameters.setValueAt(0, intTableRow, col);
							}
															
							intTableRow++;
						}
							
					}
					else
					{
						tableStringParameters.addRowWithoutSelect(key + StringUtil.FOUR_COLONS + value);
					}
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
    }
    
	private void setDefaultCloseOpt()
    {
    	setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent)
			{
				if (ConfirmationUtil.getConfirmation("Are you sure you want to close? Any changes you made will not be saved.", "Really Closing?"))
				{
					windowEvent.getWindow().dispose();
				}

			}
		});
    }
    
    public javax.swing.JButton getSaveButton()
    {
    	return buttonSave;
    }
    
    public void save()
    {
    	System.out.println("Saved parameters for " + algorithm);
    	dispose();
    }

	public HashMap<String, String> getParameters()
	{
		return parameters;
	}

	public void setParameters(HashMap<String, String> parameters)
	{
		this.parameters = parameters;
	}

	public String getAlgorithm()
	{
		return algorithm;
	}

	public UserFriendlyTable getTableDoubleParameters()
	{
		return tableDoubleParameters;
	}

	public UserFriendlyTable getTableStringParameters()
	{
		return tableStringParameters;
	}

	public UserFriendlyTable getTableIntParameters()
	{
		return tableIntParameters;
	}
	
	private void adjustTables()
	{
        tableDoubleParameters.adjustColumnWidth();
        tableIntParameters.adjustColumnWidth();
        tableStringParameters.adjustColumnWidth();
        tableDoubleParameters.setShowVerticalLines(true);
        tableIntParameters.setShowVerticalLines(true);
        tableStringParameters.setShowVerticalLines(true);
	}
	
}

