/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acousticfield3d.gui.misc;

import acousticfield3d.algorithms.CalcField;
import acousticfield3d.gui.MainForm;
import acousticfield3d.math.M;
import acousticfield3d.math.Vector3f;
import acousticfield3d.simulation.Transducer;
import acousticfield3d.utils.Parse;
import acousticfield3d.utils.StringFormats;
import java.util.ArrayList;

/**
 *
 * @author am14010
 */
public class BowlsForm extends javax.swing.JFrame {
    final MainForm mf;
    
    public BowlsForm(MainForm mf) {
        this.mf = mf;
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
        amountText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        radiousText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inclinationText = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        deleteAllButton = new javax.swing.JButton();
        alignTransducersCheck = new javax.swing.JCheckBox();
        doubleBowlCheck = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        pressureAtFocusText = new javax.swing.JTextField();
        fillButton = new javax.swing.JButton();
        fillText = new javax.swing.JTextField();
        autoDeleteCheck = new javax.swing.JCheckBox();
        autoIncliCheck = new javax.swing.JCheckBox();
        autoIncliSepText = new javax.swing.JTextField();
        sweepParametersButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Amount:");

        amountText.setText("1,6,12,18,24");

        jLabel2.setText("Radious:");

        radiousText.setText("0.10");

        jLabel3.setText("Incli:");

        inclinationText.setText("4");

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        deleteAllButton.setText("Delete all");
        deleteAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllButtonActionPerformed(evt);
            }
        });

        alignTransducersCheck.setText("align");

        doubleBowlCheck.setText("double bowl");

        jLabel4.setText("Pa at focus:");

        pressureAtFocusText.setEditable(false);
        pressureAtFocusText.setText("0");

        fillButton.setText("fill");
        fillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillButtonActionPerformed(evt);
            }
        });

        fillText.setText("5");

        autoDeleteCheck.setSelected(true);
        autoDeleteCheck.setText("autoDelete");

        autoIncliCheck.setSelected(true);
        autoIncliCheck.setText("auto: min sep");

        autoIncliSepText.setText("0.01");

        sweepParametersButton.setText("Sweep");
        sweepParametersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweepParametersButtonActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(amountText)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sweepParametersButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(autoDeleteCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteAllButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alignTransducersCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doubleBowlCheck)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pressureAtFocusText))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fillButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fillText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(radiousText, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inclinationText, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(autoIncliCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autoIncliSepText)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(radiousText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fillButton)
                        .addComponent(fillText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inclinationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autoIncliCheck)
                    .addComponent(autoIncliSepText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doubleBowlCheck)
                    .addComponent(alignTransducersCheck)
                    .addComponent(jLabel4)
                    .addComponent(pressureAtFocusText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(deleteAllButton)
                    .addComponent(autoDeleteCheck)
                    .addComponent(sweepParametersButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        createAction();
    }//GEN-LAST:event_createButtonActionPerformed

    private void createAction(){
        final boolean wasEmpty = mf.simulation.transducers.isEmpty();
        
        if (autoDeleteCheck.isSelected()){
            deleteAllButtonActionPerformed( null );
        }
        
        final int[] amount = Parse.parseIntArray(amountText.getText(), ",");
        final float radious = Parse.toFloat( radiousText.getText() );
        final float inc = getInclination();
        final boolean doubleBowl = doubleBowlCheck.isSelected();
        final boolean alignTransducers = alignTransducersCheck.isSelected();
        
        final int n = amount.length;
        for (int i = 0; i < n; ++i){
            final int trans = amount[i];
            for(int j = 0; j < trans; ++j){
                final Transducer t = createTransducer();
                final Vector3f pos = t.getTransform().getTranslation();
                
                float angle = M.TWO_PI * j / trans;
                if (alignTransducers && i % 2 == 0){
                    angle += M.TWO_PI / trans /2.0f;
                }
                pos.fromPolar(radious, angle, inc * i);
                pos.y *= -1;
                
                t.pointToTarget( Vector3f.ZERO );
                addTransducer(t);
                
                if (doubleBowl){
                   final Transducer t2 = createTransducer();
                   t2.getTransform().getTranslation().set( pos ).multLocal(1, -1, 1);
                   t2.pointToTarget( Vector3f.ZERO );
                   addTransducer(t2);
                }
            }
        }
        
        final float pressure = CalcField.calcFieldAt(Vector3f.ZERO, mf).length();
        pressureAtFocusText.setText( StringFormats.get().dc2(pressure) );
        
        float maxY = -Float.MAX_VALUE;
        for(Transducer t : mf.simulation.transducers){
            maxY = M.max(maxY, t.getTransform().getTranslation().y);
        }
        maxY = -maxY;
        System.out.println(pressure + "," + n +
                "," + radiousText.getText() + "," + inclinationText.getText() + "," + maxY);
        
        if (wasEmpty){
            mf.updateBoundaries();
            mf.adjustGUIGainAndCameras();
        }
        mf.needUpdate();
    }
    
    private void deleteAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllButtonActionPerformed
        mf.clearSelection();
        final ArrayList<Transducer> copy = new ArrayList<>(mf.simulation.transducers);
        mf.transducersPanel.deleteTransducers( copy );
        mf.needUpdate();
    }//GEN-LAST:event_deleteAllButtonActionPerformed

    private void fillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillButtonActionPerformed
        fillAction();
    }//GEN-LAST:event_fillButtonActionPerformed

    private void fillAction(){
        final int n = Parse.toInt( fillText.getText() );
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; ++i){
            if (i == 0){
                sb.append("1");
            }else{
                sb.append( (i*6) + "");
            }
            if (i < n-1){
                sb.append(",");
            }
        }
        amountText.setText(sb.toString());
    }
    
    private void sweepParametersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweepParametersButtonActionPerformed
        
        for (float radious = 0.001f; radious < 0.3f; radious += 0.01){
            for (int amount = 1; amount < 20; ++amount){
                radiousText.setText( radious + "");
                fillText.setText( amount + "");
                fillAction();
                
                if (amount * getInclination() < M.PI/2){
                    createAction();
                }
            }
        }
    }//GEN-LAST:event_sweepParametersButtonActionPerformed

        private float getInclination() {
        if (autoIncliCheck.isSelected()){
            final float radious = Parse.toFloat( radiousText.getText() );
            final float minSep = Parse.toFloat( autoIncliSepText.getText() );
            final int[] amount = Parse.parseIntArray(amountText.getText(), ",");
            
            final float angleSepRows = 2.0f * M.atan( minSep / radious / 2);
            final int nRows = amount.length;
            float minAngleSepTrans = 0.0f;
            for(int i = 1; i < nRows; ++i){
                final float angleTrans = M.asin(minSep*amount[i] / radious / 2 / M.PI ) / (float)(i);
                minAngleSepTrans = M.max(minAngleSepTrans, angleTrans);
            }
            final float inclinationNeeded = M.max(angleSepRows, minAngleSepTrans);
            inclinationText.setText( StringFormats.get().dc4(inclinationNeeded * M.RAD_TO_DEG));
            return inclinationNeeded;
        }else{
            return Parse.toFloat( inclinationText.getText() ) * M.DEG_TO_RAD;
        }
    }

    private Transducer createTransducer(){
        return mf.addTransducersForm.createTransducer();
    }
    
    private void addTransducer(Transducer t){
        mf.addTransducersForm.addTransducer(t);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alignTransducersCheck;
    private javax.swing.JTextField amountText;
    private javax.swing.JCheckBox autoDeleteCheck;
    private javax.swing.JCheckBox autoIncliCheck;
    private javax.swing.JTextField autoIncliSepText;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteAllButton;
    private javax.swing.JCheckBox doubleBowlCheck;
    private javax.swing.JButton fillButton;
    private javax.swing.JTextField fillText;
    private javax.swing.JTextField inclinationText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField pressureAtFocusText;
    private javax.swing.JTextField radiousText;
    private javax.swing.JButton sweepParametersButton;
    // End of variables declaration//GEN-END:variables


}
