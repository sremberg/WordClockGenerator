/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordclockgenerator;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patrick
 */
public class JPTimeToWords extends javax.swing.JPanel {
    private static ArrayList<TimeText> timetextlist= new ArrayList<>();
    public static ArrayList<TimeText> getTimeTextList(){
        return timetextlist;
    }
    /**
     * Creates new form JPTimeToWords
     */
    public JPTimeToWords() {
        initComponents();
        jCBmModeActionPerformed(null);
        jCBhModeActionPerformed(null);
        jTFArangement.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                recalc();        
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                recalc();        
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                recalc();        
            }
        });
       recalc();
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
        jCBmMode = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTm = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jCBhMode = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTh = new javax.swing.JTable();
        jTFArangement = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jToutput = new javax.swing.JTable();

        jLabel1.setText("Minutes");

        jCBmMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "5", "10", "15", "30", " " }));
        jCBmMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBmModeActionPerformed(evt);
            }
        });

        jTm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTm.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTmPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTm);

        jLabel2.setText("Hours");

        jCBhMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "24", "AM/PM" }));
        jCBhMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBhModeActionPerformed(evt);
            }
        });

        jTh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTh.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jThPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(jTh);

        jTFArangement.setText("It's [minutes] [hours] [ampm]");

        jLabel3.setText("Arrange: [minutes], [hours] and [ampm]:");

        jLabel4.setText("Output");

        jToutput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jToutput.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jToutputPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(jToutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBmMode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jCBhMode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTFArangement)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBmMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBhMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFArangement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private int getmStep(){
        switch (jCBmMode.getSelectedIndex()){
            default:
            case 0: //1
                return 1;
            case 1: //5
                return 5;
            case 2: //10
                return 10;
            case 3: //15
                return 15;
            case 4: //30
                return 30;
        }        
    }
    private int gethLength(){
        switch (jCBhMode.getSelectedIndex()){
            default:
            case 0: //24
                return 24;
            case 1: //am pm
                return 12;
        }        
    }
    
    private void jCBmModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBmModeActionPerformed
        int step = getmStep();
        Object[][] table= new String[60/step][3];
        for(int i=0;i<60;i+=step){
            table[i/step][0]=i+":";
            table[i/step][1]="";
            table[i/step][2]="0";
        }
        
        DefaultTableModel mtable = new InternDefaultTableModel(table,new String[]{"Hours","Text","h diff"});
        jTm.setModel(mtable);
        recalc();        
    }//GEN-LAST:event_jCBmModeActionPerformed

    private void jCBhModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBhModeActionPerformed
        int length =gethLength();
        Object[][] table= new String[length+2][2];
        for(int i=0;i<length;i++){
            table[i][0]=i+":";
            table[i][1]="";
        }
        table[length][0]="AM:";
        table[length][1]="";
        table[length+1][0]="PM:";
        table[length+1][1]="";
        
        DefaultTableModel mtable = new InternDefaultTableModel(table,new String[]{"Hours","Text"});
        jTh.setModel(mtable);
        recalc();
    }//GEN-LAST:event_jCBhModeActionPerformed

    private void jTmPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTmPropertyChange
        recalc();
    }//GEN-LAST:event_jTmPropertyChange

    private void jThPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jThPropertyChange
        recalc();
    }//GEN-LAST:event_jThPropertyChange

    private void jToutputPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jToutputPropertyChange
        ArrayList<TimeText> list= new ArrayList<>();
        for(int i =0;i<jToutput.getModel().getRowCount();i++){
            TimeText tt = (TimeText) jToutput.getModel().getValueAt(i, 0);
            if(jToutput.getModel().getValueAt(i, 1)!=null)
                tt.setText(jToutput.getModel().getValueAt(i, 1).toString());
            list.add(tt);
        }
        timetextlist= list;
    }//GEN-LAST:event_jToutputPropertyChange

    private void recalc(){
        ArrayList<TimeText> time = new ArrayList<>();
        ArrayList<String> text = new ArrayList<>();
        try {
            for(int h=0;h<24;h++){
                for (int m=0;m<60;m++){
                    TimeText tt= new TimeText(h, m, "");
                    time.add(tt);
                    String minutes=jTm.getModel().getValueAt(m/getmStep(), 1).toString();
                    int hdiff=0;
                    try{
                        hdiff=Integer.parseInt(jTm.getModel().getValueAt(m/getmStep(), 2).toString());
                    }
                    catch(Exception e){};                            
                    String hours=jTh.getModel().getValueAt((h+hdiff)%gethLength(), 1).toString();
                    String ampm=(h<=12)?jTh.getModel().getValueAt(gethLength(), 1).toString():jTh.getModel().getValueAt(gethLength()+1, 1).toString();
                    text.add(jTFArangement.getText().replace("[minutes]", minutes).replace("[hours]", hours).replace("[ampm]", ampm)); //
                }
            }
            Object[][] table= new Object[text.size()][2];
            for(int i=0;i<text.size();i++)
            {
                table[i][0]=time.get(i);
                table[i][1]=text.get(i);
            }
            jToutput.setModel(new InternDefaultTableModel(table, new String[] {"Time","Text"}));        
        } catch (Exception e) {

        }
        jToutputPropertyChange(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jCBhMode;
    private javax.swing.JComboBox jCBmMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTFArangement;
    private javax.swing.JTable jTh;
    private javax.swing.JTable jTm;
    private javax.swing.JTable jToutput;
    // End of variables declaration//GEN-END:variables

    void save(ObjectOutputStream os) throws Exception{
        os.writeObject((Integer)jCBmMode.getSelectedIndex());
        for(int i =0;i<jTm.getModel().getRowCount();i++){
            os.writeObject(jTm.getModel().getValueAt(i, 1).toString());
            os.writeObject(jTm.getModel().getValueAt(i, 2).toString());
        }
        os.writeObject((Integer)jCBhMode.getSelectedIndex());
        for(int i =0;i<jTh.getModel().getRowCount();i++){
            os.writeObject(jTh.getModel().getValueAt(i, 1).toString());   
        }     
        os.writeObject(jTFArangement.getText());
        for(int i =0;i<jToutput.getModel().getRowCount();i++){
            os.writeObject(jToutput.getModel().getValueAt(i, 1).toString());  
        }
    }

    void load(ObjectInputStream is) throws Exception{
        jCBmMode.setSelectedIndex((Integer)is.readObject());
        for(int i =0;i<jTm.getModel().getRowCount();i++){
            jTm.getModel().setValueAt(is.readObject().toString(),i, 1); 
            jTm.getModel().setValueAt(is.readObject().toString(),i, 2); 
        }
        jCBhMode.setSelectedIndex((Integer)is.readObject());
        for(int i =0;i<jTh.getModel().getRowCount();i++){
            jTh.getModel().setValueAt(is.readObject().toString(),i, 1);  
        }
        jTFArangement.setText((String)is.readObject());
        for(int i =0;i<jToutput.getModel().getRowCount();i++){
            jToutput.getModel().setValueAt(is.readObject().toString(),i, 1);  
        }
        jToutputPropertyChange(null);
    }
        
    private static class InternDefaultTableModel extends DefaultTableModel implements Serializable{

        public InternDefaultTableModel(Object[][] data, Object[] columnNames) {
            super(data, columnNames);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if(column==0) return false;
            return super.isCellEditable(row, column); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
}
