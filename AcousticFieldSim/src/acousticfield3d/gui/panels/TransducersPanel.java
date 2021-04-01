package acousticfield3d.gui.panels;

import acousticfield3d.gui.MainForm;
import acousticfield3d.gui.MainForm.FieldsToChange;
import acousticfield3d.math.M;
import acousticfield3d.scene.Entity;
import acousticfield3d.scene.Scene;
import acousticfield3d.simulation.Animation;
import acousticfield3d.simulation.Transducer;
import acousticfield3d.utils.StringFormats;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import javax.swing.JTextField;

/**
 *
 * @author Asier
 */
public class TransducersPanel extends javax.swing.JPanel {
    final public MainForm mf;
    
    public TransducersPanel(MainForm mf) {
        this.mf = mf;
        initComponents();
    }

    public JTextField getAmpText() {
        return ampText;
    }

    public JTextField getFrText() {
        return frText;
    }

    public JTextField getPhaseText() {
        return phaseText;
    }

    public JTextField getwText() {
        return wText;
    }
    
    public boolean isPhaseH(){
        return phaseHCheck.isSelected();
    }

    public JTextField getPowerText() {
        return powerText;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        frText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ampText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        phaseText = new javax.swing.JTextField();
        selectAllTransButton = new javax.swing.JButton();
        showHideTransCheck = new javax.swing.JCheckBox();
        phaseHCheck = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        powerText = new javax.swing.JTextField();
        labelButton = new javax.swing.JButton();
        orderText = new javax.swing.JTextField();
        pinText = new javax.swing.JTextField();
        pinButton = new javax.swing.JButton();

        wText.setText("0");
        wText.setToolTipText("apperture of the transducer - diameter of the emitting piston");
        wText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                wTextFocusGained(evt);
            }
        });
        wText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wTextActionPerformed(evt);
            }
        });

        jLabel7.setText("W");

        jLabel8.setText("FR");

        frText.setText("0");
        frText.setToolTipText("frequency");
        frText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                frTextFocusGained(evt);
            }
        });
        frText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frTextActionPerformed(evt);
            }
        });

        jLabel9.setText("A");

        ampText.setText("0");
        ampText.setToolTipText("relative emission amplitude - from 0 to 1 (0 is off, 1 is on)");
        ampText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ampTextFocusGained(evt);
            }
        });
        ampText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ampTextActionPerformed(evt);
            }
        });

        jLabel10.setText("PH");

        phaseText.setText("0");
        phaseText.setToolTipText("phase - it is in radians/PI (to change soon...)");
        phaseText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phaseTextFocusGained(evt);
            }
        });
        phaseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phaseTextActionPerformed(evt);
            }
        });

        selectAllTransButton.setText("Select All");
        selectAllTransButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllTransButtonActionPerformed(evt);
            }
        });

        showHideTransCheck.setText("Show");
        showHideTransCheck.setToolTipText("shows/hides the transducers");
        showHideTransCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHideTransCheckActionPerformed(evt);
            }
        });

        phaseHCheck.setText("Grey");
        phaseHCheck.setToolTipText("uses greyscale instead of hue to represent the transducer's phase");
        phaseHCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phaseHCheckActionPerformed(evt);
            }
        });

        jLabel11.setText("P");

        powerText.setText("0");
        powerText.setToolTipText("power - pascals at 1m with a 15Vpp excitation signal");
        powerText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                powerTextFocusGained(evt);
            }
        });
        powerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerTextActionPerformed(evt);
            }
        });

        labelButton.setText("Order");
        labelButton.setToolTipText("assigns the order to the selected transducers");
        labelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelButtonActionPerformed(evt);
            }
        });

        orderText.setText("0");
        orderText.setToolTipText("start number for the order");

        pinText.setText("0");
        pinText.setToolTipText("start number for the pin");
        pinText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinTextActionPerformed(evt);
            }
        });

        pinButton.setText("Pin");
        pinButton.setToolTipText("assigns the pins to the selected transducers - related to hardware channels");
        pinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ampText))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(powerText)
                                    .addComponent(wText))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phaseText)
                            .addComponent(frText)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectAllTransButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(phaseHCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(showHideTransCheck)))
                                .addGap(0, 49, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pinText)
                                    .addComponent(orderText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pinButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ampText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(phaseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(wText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(frText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(powerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectAllTransButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phaseHCheck)
                    .addComponent(showHideTransCheck))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelButton)
                    .addComponent(orderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinButton)
                    .addComponent(pinText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    

    
    private void wTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wTextFocusGained
        mf.changeSlider(FieldsToChange.wField, "W", mf.simulation.getMinSize());
    }//GEN-LAST:event_wTextFocusGained

    private void wTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wTextActionPerformed
        mf.updateTransForField(FieldsToChange.wField, wText.getText());
    }//GEN-LAST:event_wTextActionPerformed

    private void frTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_frTextFocusGained
        mf.changeSlider(FieldsToChange.frField, "FR", 40000);
    }//GEN-LAST:event_frTextFocusGained

    private void frTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frTextActionPerformed
        mf.updateTransForField(FieldsToChange.frField, frText.getText());
    }//GEN-LAST:event_frTextActionPerformed

    private void ampTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ampTextFocusGained
        mf.changeSlider(FieldsToChange.ampField, "AMP", 1);
    }//GEN-LAST:event_ampTextFocusGained

    private void ampTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ampTextActionPerformed
        mf.updateTransForField(FieldsToChange.ampField, ampText.getText());
    }//GEN-LAST:event_ampTextActionPerformed

    private void phaseTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phaseTextFocusGained
        mf.changeSlider(FieldsToChange.phaseField, "PHA", M.TWO_PI);
    }//GEN-LAST:event_phaseTextFocusGained

    private void phaseTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phaseTextActionPerformed
        mf.updateTransForField(FieldsToChange.phaseField, phaseText.getText());
    }//GEN-LAST:event_phaseTextActionPerformed

    public void selectAll(){
        selectAllTransButtonActionPerformed(null);
    }
    
    private void selectAllTransButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllTransButtonActionPerformed
        mf.clearSelection();
        for(Transducer t : mf.simulation.getTransducers()){
            t.selected = true;
            mf.selection.add(t);
        }
        mf.needUpdate();
    }//GEN-LAST:event_selectAllTransButtonActionPerformed

    private void showHideTransCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHideTransCheckActionPerformed
        Scene.setVisible( mf.scene.getEntities(), Entity.TAG_TRANSDUCER, showHideTransCheck.isSelected());
        mf.needUpdate();
    }//GEN-LAST:event_showHideTransCheckActionPerformed

    private void phaseHCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phaseHCheckActionPerformed
        final boolean ug = phaseHCheck.isSelected();
        for(Transducer t :  mf.simulation.transducers){
            t.useGreyScale = ug;
        }
        mf.needUpdate();
    }//GEN-LAST:event_phaseHCheckActionPerformed

    private void powerTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_powerTextFocusGained
        mf.changeSlider(FieldsToChange.powerField, "POW", 2);
    }//GEN-LAST:event_powerTextFocusGained

    private void powerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerTextActionPerformed
        mf.updateTransForField(FieldsToChange.powerField, powerText.getText());
    }//GEN-LAST:event_powerTextActionPerformed

    private void labelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelButtonActionPerformed
        int number = Integer.parseInt( orderText.getText() );
        for(Entity e: mf.getSelection()){
            if(e instanceof Transducer){
                Transducer t = (Transducer)e;
                t.setOrderNumber(number);
                number++;
            }
        }
        mf.simulation.sortTransducers();
        mf.simulation.labelNumberTransducers();
    }//GEN-LAST:event_labelButtonActionPerformed

    private void pinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinButtonActionPerformed
        int number = Integer.parseInt( pinText.getText() );
        for(Entity e: mf.getSelection()){
            if(e instanceof Transducer){
                Transducer t = (Transducer)e;
                t.setDriverPinNumber(number);
                number++;
            }
        }
    }//GEN-LAST:event_pinButtonActionPerformed

    private void pinTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinTextActionPerformed

    public JTextField getPinText() {
        return pinText;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ampText;
    private javax.swing.JTextField frText;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton labelButton;
    private javax.swing.JTextField orderText;
    private javax.swing.JCheckBox phaseHCheck;
    private javax.swing.JTextField phaseText;
    private javax.swing.JButton pinButton;
    private javax.swing.JTextField pinText;
    private javax.swing.JTextField powerText;
    private javax.swing.JButton selectAllTransButton;
    private javax.swing.JCheckBox showHideTransCheck;
    private javax.swing.JTextField wText;
    // End of variables declaration//GEN-END:variables

    public void setTransPhase(String f) {
        mf.updateTransForField(FieldsToChange.phaseField, f);
        mf.transControlPanel.sendPattern();
    }
    
    public void setTransPhase(float f) {
        mf.updateTransForField(FieldsToChange.phaseField, f + "");
        mf.transControlPanel.sendPattern();
    }

    public void setTransAmp(float f) {
        mf.updateTransForField(FieldsToChange.ampField, f + "");
        mf.transControlPanel.sendPattern();
    }
    
    public void deleteSelectedTransducers(){
        ArrayList<Transducer> trans = new ArrayList<>();
        for( Entity e : mf.selection){
            if ( e instanceof Transducer) { trans.add( (Transducer) e ); }
        }
        
        deleteTransducers( trans );
        
        mf.clearSelection();
        mf.needUpdate();
    }
    
    public void deleteTransducers(final ArrayList<Transducer> trans){
        //delete transducers from animation->animationKeys
        for(Animation anim : mf.simulation.animations.getElements()){
            anim.deleteTransducers(trans);
        }
        
        //Remove from simulation and scene
        for (Transducer t : trans){
            mf.scene.getEntities().remove( t );
            mf.simulation.transducers.remove( t );
        }
    }

 

    public JTextField getLabelText() {
        return orderText;
    }

    
    
    public void selectTopTransducers(final boolean topOrBottom){
        mf.clearSelection();
        final float midY = mf.simulation.calcTransducersMidY();
        for(Transducer t : mf.simulation.transducers){
            final float tY = t.getTransform().getTranslation().y;
            if ( (topOrBottom && tY > midY) || (!topOrBottom && tY < midY)){
                t.selected = true;
                mf.selection.add(t);
            }
        }
        mf.needUpdate();
    }

    public void switchOnRandom(int switchOn) {
        if (switchOn == 0){ return; }
        
        final ArrayList<Transducer> trans = new ArrayList<>();
        for (Transducer t : mf.simulation.transducers) {
            if (t.getpAmplitude() == 0 && switchOn > 0) {
                trans.add(t);
            } else if (t.getAmplitude() > 0 && switchOn < 0){
                trans.add(t);
            }
        }
        int amplitude = 1;
        if (switchOn < 0) { 
            switchOn = -switchOn;
            amplitude = 0;
        }
        
        while ( switchOn>0 && !trans.isEmpty() ){
            final int index = M.randomInt(0, trans.size());
            trans.get(index).setpAmplitude( amplitude );
            trans.remove(index);
            --switchOn;
        }
        
        mf.movePanel.applyDisplacement(0, 0, 0);
        mf.needUpdate();
    }

    public void updateFromTransducer(Transducer t) {

        getwText().setText(StringFormats.get().dc4(t.getApperture()));
        getPowerText().setText(StringFormats.get().dc4(t.getPower()));
        getFrText().setText(StringFormats.get().dc4(t.getFrequency()));

        getAmpText().setText(StringFormats.get().dc4(t.getAmplitude()));
        getPhaseText().setText(StringFormats.get().dc4(t.getPhase()));
        getLabelText().setText(t.getOrderNumber() + "");
        getPinText().setText(t.getDriverPinNumber() + "");
    }

    public void updateField(Transducer t, FieldsToChange field, float value, boolean absolute, boolean updateTextField) {
        if (field == FieldsToChange.wField) {
            t.apperture = absolute ? value : t.apperture + value;
            if (updateTextField) {
                getwText().setText(StringFormats.get().dc4(t.apperture));
            }
        } else if (field == FieldsToChange.frField) {
            t.frequency = absolute ? value : t.frequency + value;
            if (updateTextField) {
                getFrText().setText(StringFormats.get().dc4(t.frequency));
            }
        } else if (field == FieldsToChange.ampField) {
            t.amplitude = absolute ? value : t.amplitude + value;
            if (updateTextField) {
                getAmpText().setText(StringFormats.get().dc4(t.amplitude));
            }
        } else if (field == FieldsToChange.phaseField) {
            t.phase = absolute ? value : t.phase + value;
            if (updateTextField) {
                getPhaseText().setText(StringFormats.get().dc4(t.phase));
            }
        } else if (field == FieldsToChange.powerField) {
            t.power = absolute ? value : t.power + value;
            if (updateTextField) {
                getPowerText().setText(StringFormats.get().dc4(t.power));
            }
        }
    }
}
