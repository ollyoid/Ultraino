package acousticfield3d.gui.panels;

import acousticfield3d.gui.MainForm;
import acousticfield3d.math.M;
import acousticfield3d.math.Vector3f;
import acousticfield3d.protocols.ArduinoMEGA64;
import acousticfield3d.protocols.ArduinoMEGA64_Anim;
import acousticfield3d.protocols.ArduinoNano;
import acousticfield3d.protocols.ArduinoNano16;
import acousticfield3d.protocols.ChainedFPGA;
import acousticfield3d.protocols.DeviceConnection;
import acousticfield3d.protocols.SimpleFPGA;
import acousticfield3d.protocols.SimpleFPGA_128;
import acousticfield3d.protocols.PicoDriver;
import acousticfield3d.scene.Entity;
import acousticfield3d.simulation.AnimKeyFrame;
import acousticfield3d.simulation.Simulation;
import acousticfield3d.simulation.Transducer;
import acousticfield3d.utils.Parse;
import acousticfield3d.utils.uartComm.SerialComms;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asier
 */
public class TransControlPanel extends javax.swing.JPanel {    
    public static final int DEFAULT_DIVS_PER_PERIOD = 24; 
    
    final MainForm mf;
    
    DeviceConnection device = null;
    final List<DeviceConnection> extraDevices = new ArrayList<>();
    
    public TransControlPanel(MainForm mf) {
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

        sendButton = new javax.swing.JButton();
        initSerialButton = new javax.swing.JButton();
        stopSerialButton = new javax.swing.JButton();
        switchButton = new javax.swing.JButton();
        sendAnimButton = new javax.swing.JButton();
        deviceCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        phaseSpinner = new javax.swing.JSpinner();
        durationsText = new javax.swing.JTextField();
        durationsButton = new javax.swing.JButton();
        connectExtraButton = new javax.swing.JButton();
        extraNumberText = new javax.swing.JTextField();
        multiplexButton = new javax.swing.JButton();
        pushPullModeCheck = new javax.swing.JCheckBox();

        sendButton.setText("Send");
        sendButton.setToolTipText("send the current transducer's phases and amps to the connected devices");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        initSerialButton.setText("Connect");
        initSerialButton.setToolTipText("connects to a device");
        initSerialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initSerialButtonActionPerformed(evt);
            }
        });

        stopSerialButton.setText("Disconnect");
        stopSerialButton.setToolTipText("disconnects from all the devices");
        stopSerialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopSerialButtonActionPerformed(evt);
            }
        });

        switchButton.setText("Switch");
        switchButton.setToolTipText("just send the switch buffer command to the devices");
        switchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchButtonActionPerformed(evt);
            }
        });

        sendAnimButton.setText("Seq");
        sendAnimButton.setToolTipText("sends an animation the current devices - not supported by all");
        sendAnimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendAnimButtonActionPerformed(evt);
            }
        });

        deviceCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MEGA", "SimpleFPGA", "Nano8", "MEGA_Anim", "Nano16", "SimpleFPGA 128", "Chained FPGA", "PicoDriver" }));
        deviceCombo.setToolTipText("select the protocol");
        deviceCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deviceComboActionPerformed(evt);
            }
        });

        jLabel1.setText("Phase");

        phaseSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        phaseSpinner.setToolTipText("current phase - in divisions");
        phaseSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                phaseSpinnerStateChanged(evt);
            }
        });

        durationsText.setText("1 0");
        durationsText.setToolTipText("periods sequence to be sent");

        durationsButton.setText("Durations");
        durationsButton.setToolTipText("sends the durations - not supported by all the devices");
        durationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationsButtonActionPerformed(evt);
            }
        });

        connectExtraButton.setText("Con Extra");
        connectExtraButton.setToolTipText("connects to an extra device");
        connectExtraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectExtraButtonActionPerformed(evt);
            }
        });

        extraNumberText.setText("256");
        extraNumberText.setToolTipText("after which transducer does the new device starts");

        multiplexButton.setText("Mult");
        multiplexButton.setToolTipText("tells the device to multiplex between buffers - not supported by all devices");
        multiplexButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplexButtonActionPerformed(evt);
            }
        });

        pushPullModeCheck.setText("push/pull mode");
        pushPullModeCheck.setToolTipText("this mode will use 2 channels for every transducer and drive the second pair out of phase - this is used to achieve double the voltage peak to peak");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deviceCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sendAnimButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(multiplexButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(connectExtraButton)
                        .addGap(18, 18, 18)
                        .addComponent(extraNumberText))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sendButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(durationsText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(switchButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(durationsButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(initSerialButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(stopSerialButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pushPullModeCheck)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phaseSpinner)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initSerialButton)
                    .addComponent(stopSerialButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deviceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connectExtraButton)
                    .addComponent(extraNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pushPullModeCheck)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendButton)
                    .addComponent(switchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendAnimButton)
                    .addComponent(multiplexButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(durationsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(durationsButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(phaseSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initSerialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initSerialButtonActionPerformed
       initComm( -1 );
    }//GEN-LAST:event_initSerialButtonActionPerformed

    private void stopSerialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopSerialButtonActionPerformed
        stopComm();
    }//GEN-LAST:event_stopSerialButtonActionPerformed
    
    
    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        sendPattern();
    }//GEN-LAST:event_sendButtonActionPerformed

    private void switchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchButtonActionPerformed
        switchBuffers();
    }//GEN-LAST:event_switchButtonActionPerformed

    private void sendAnimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendAnimButtonActionPerformed
        sendAnim( mf.animPanel.getCurrentAnimation().getKeyFrames().getElements() );
    }//GEN-LAST:event_sendAnimButtonActionPerformed

    private void phaseSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_phaseSpinnerStateChanged
        final int value = (Integer) phaseSpinner.getValue();
        mf.transducersPanel.setTransPhase( stepsToPhase(value) );
    }//GEN-LAST:event_phaseSpinnerStateChanged

    public float stepsToPhase(float steps){
        
        final float phaseF = 2.0f * steps / getDivs();
        return phaseF;
    }
    
    public void addPhaseSteps(float steps){
        final float phaseF = stepsToPhase(steps);
        mf.transducersPanel.setTransPhase( "a" + phaseF );
    }
    
    private void durationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationsButtonActionPerformed
        if (device != null){
            final int[] durations = Parse.parseIntArray( durationsText.getText(), " ");
            device.sendDurations(durations);
        }
    }//GEN-LAST:event_durationsButtonActionPerformed

    private void connectExtraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectExtraButtonActionPerformed
        final DeviceConnection dc = getDeviceConnection(-1);
        dc.setNumber( Parse.toInt( extraNumberText.getText() ));
        extraDevices.add(dc);
    }//GEN-LAST:event_connectExtraButtonActionPerformed

    private void multiplexButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplexButtonActionPerformed
        if (device != null){
            device.sendToogleQuickMultiplexMode();
        }
    }//GEN-LAST:event_multiplexButtonActionPerformed

    private void deviceComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deviceComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deviceComboActionPerformed


    private DeviceConnection getDeviceConnection(int port){
        final int index = deviceCombo.getSelectedIndex();
        DeviceConnection dc;
        
        if (index == 0){ //  ArduinoMEGA64
            dc = new ArduinoMEGA64(); 
        }else if (index == 1){ //  SimpleFPGA
            dc = new SimpleFPGA();
        }else if (index == 2){ // NANO
            dc = new ArduinoNano();
        }else if (index == 3){ // MEGA Anim
            dc = new ArduinoMEGA64_Anim();
        }else if (index == 4){ // Nano16
            dc = new ArduinoNano16();
        }else if (index == 5){ // Simple FPGA 128
            dc = new SimpleFPGA_128();
        }else if (index == 6){ //chained FPGA
            dc = new ChainedFPGA();
        }else if (index == 7){ //chained FPGA
            dc = new PicoDriver();
        }else{
            dc = new DeviceConnection();
        }
        
        dc.connect( port ); //pop the GUI for selecting the port
        
        return dc;
    }
    
    public void initComm(int port){
        if (port == -1){
            stopComm();
            port = SerialComms.listAndSelectPortIndex();
            if (port != -1){
                device = getDeviceConnection(port);
            }
        }
    }
    
    
    
    public void stopComm(){
        if (device != null){
            device.disconnect();
            device = null;
        }
        for( DeviceConnection dc : extraDevices){
            dc.disconnect();
        }
        extraDevices.clear();
    }
    
    
    public void sendPattern(){
        sendPattern(true);
    }
    
    
    private List<Transducer> getTransducers(){
        if (pushPullModeCheck.isSelected()){
            final ArrayList<Transducer> trans = mf.simulation.getTransducers();
            final ArrayList<Transducer> pushPullTrans = new ArrayList<>(trans.size()*2);
            for(Transducer t : trans){
                Transducer t1 = new Transducer();
                Transducer t2 = new Transducer();
                t1.setFrequency( t.getFrequency() );
                t2.setFrequency( t.getFrequency() );
                t1.setAmplitude( t.getAmplitude() );
                t2.setAmplitude( t.getAmplitude() );
                t1.setPhase( t.getPhase() );
                t2.setPhase( t.getPhase() + 1 ); //PI out of phase for the push/pull driving
                t1.setPhaseCorrection( t.getPhaseCorrection() );
                t2.setPhaseCorrection(  t.getPhaseCorrection() );
                t1.setDriverPinNumber( t.getDriverPinNumber() * 2);
                t2.setDriverPinNumber( t.getDriverPinNumber() * 2 + 1);
                t1.setNumber( t1.getDriverPinNumber() );
                t2.setNumber( t2.getDriverPinNumber() );
                pushPullTrans.add(t1);
                pushPullTrans.add(t2);
            }
            return pushPullTrans;
        }else{
            return mf.simulation.getTransducers();
        }
    }
    
    public void sendPattern(final boolean swapBuffers){
        if (device == null){
            return;
        }        
        
        if (! extraDevices.isEmpty()) {
            device.sendPattern(getTransducers());
            for (DeviceConnection dc : extraDevices) {
                dc.sendPattern(getTransducers());
            }
            if (swapBuffers) {
                device.switchBuffers();
                for (DeviceConnection dc : extraDevices) {
                    dc.switchBuffers();
                }
            }
        } else {
            device.sendPattern(getTransducers());
            if (swapBuffers) {
                device.switchBuffers();
            }
        }
             
    }
    
    public void sendAnimFrame(int frame) {
        if (device != null){
            if (device instanceof ArduinoMEGA64_Anim){
                device.sendDurations( new int[]{frame} );
                
            }else{
                sendPattern();
            }
        }
    }
    
    public void sendPattern(final List<Transducer> trans){
        if (device != null){
            device.sendPattern( trans );
        }
    }
    
    public void switchBuffers(){
        if (device != null){
            device.switchBuffers();
        }
    }
    
    public void sendAnim(final List<AnimKeyFrame> keyFrames){
        if (device != null){
            device.sendAnim(keyFrames);
            device.switchBuffers();
        }
    }


   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connectExtraButton;
    private javax.swing.JComboBox deviceCombo;
    private javax.swing.JButton durationsButton;
    private javax.swing.JTextField durationsText;
    private javax.swing.JTextField extraNumberText;
    private javax.swing.JButton initSerialButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton multiplexButton;
    private javax.swing.JSpinner phaseSpinner;
    private javax.swing.JCheckBox pushPullModeCheck;
    private javax.swing.JButton sendAnimButton;
    private javax.swing.JButton sendButton;
    private javax.swing.JButton stopSerialButton;
    private javax.swing.JButton switchButton;
    // End of variables declaration//GEN-END:variables

    /*
    public void exportAnimation() {
        final StringBuilder sb = new StringBuilder();
        
        final Animation anim = mf.animPanel.getCurrentAnimation();
        if (anim == null) { return; }
        
        final List<AnimKeyFrame> keys =  anim.getKeyFrames().getElements();
        int nTrans = M.nearestPowerOfTwo( mf.simulation.getTransducers().size() );
        nTrans = M.max(nTrans, 8);
        sb.append("{");
        final int nKeys = keys.size();
        for(int ik = 0; ik < nKeys; ++ik){
            final AnimKeyFrame key = keys.get(ik);
            sb.append("{");
            final byte[] data = key.calcSignals01(nTrans, mf.transControlPanel.getDivs());
            final int nData = data.length;
            for(int in = 0 ; in < nData; ++in){
               sb.append( "0x" + Integer.toHexString( data[in] & 0xFF ) );
                if (in != nData-1){
                    sb.append(",");
                
            }
            if (ik != nKeys-1){
                sb.append("},\n");
            }else{
                sb.append("}}");
            }
        }
        
        TextFrame.showText("Animations", sb.toString(), this);
    }*/

    
    private int getDivs() {
        return (device != null) ? device.getDivs() : DEFAULT_DIVS_PER_PERIOD;
    }

    public void sendToogleCommand(){
        if (device != null){
            device.sendToogleQuickMultiplexMode();
        }
    }

    public void phasePi() {
        mf.transducersPanel.setTransPhase( "a" + 1 );
    }

    private int getNextTransducerAndSwitchOffCurent() {
        final List<Entity> selection = mf.getSelection();

        if (selection.isEmpty()) {
            return -1;
        }
        Entity e = selection.get(0);
        if (!(e instanceof Transducer)) {
            return -1;
        }
        Transducer t = (Transducer) e;
        mf.transducersPanel.setTransAmp(0.0f);
        int indexTrans = mf.simulation.getTransducers().indexOf(t);
        mf.clearSelection();
        return indexTrans;

    }
    
    public void offNextOnTransducerMenuActionPerformed() {
        final int indexTrans = getNextTransducerAndSwitchOffCurent();

        final Simulation simulation = mf.getSimulation();
        final List<Entity> selection = mf.getSelection();
        if (indexTrans < simulation.getTransducers().size() - 1) {
            selection.add(simulation.getTransducers().get(indexTrans + 1));
            mf.transducersPanel.setTransAmp(1.0f);
        }
    }
        
    public void offNextOnSpaceTransducerMenuActionPerformed() { //TOHACK improve the code in this crap
        final int indexTrans = getNextTransducerAndSwitchOffCurent();
        if (indexTrans == -1){
            return;
        }
        final Transducer cTrans = mf.getSimulation().getTransducers().get(indexTrans);
        final Vector3f cPos = cTrans.getTransform().getTranslation();
        
        //get in target the transducer to the right of cTrans, i.e. zDistance less than 1mm and closest x to the right
        Transducer target = null;
        float distanceToTheRight = Float.MAX_VALUE;
        for (Transducer t : mf.getSimulation().getTransducers()){ 
            final Vector3f pos = t.getTransform().getTranslation();
            if (t != cTrans && M.abs( pos.z - cPos.z) < 0.001f){ //not the same and z distance less than 1mm
                final float distX = pos.x - cPos.x;
                if (distX > 0 && distX < distanceToTheRight){
                    distanceToTheRight = distX;
                    target = t;
                }
            }
        }
        if(target != null){
            mf.addToSelection(target);
            mf.transducersPanel.setTransAmp( 1.0f );
        }else{ //select the one above to the most left
            target = null;
            float xValue = Float.MAX_VALUE;
            for (Transducer t : mf.getSimulation().getTransducers()){ 
                final Vector3f pos = t.getTransform().getTranslation();
                final float zDist =  cPos.z - pos.z;
                if (t != cTrans && zDist > 0.001f && zDist < 0.015f){  //minimum X, zDistance > 0.001 but minimum
                    final float posX = pos.x;
                    if (posX < xValue){
                        xValue = posX;
                        target = t;
                    }
                }
            }
            
            if (target != null){
                mf.addToSelection(target);
                mf.transducersPanel.setTransAmp( 1.0f );
            }
        }
    }
    
}
