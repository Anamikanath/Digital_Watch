/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smart;

/**
 *
 * @author ARN
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.management.Query.times;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerSwing extends javax.swing.JFrame {

    /**
     * Creates new form TimerSwing
     */
    int min,sec,min1,sec1;
    Timer timer;
    boolean flag=true;
    boolean ifStop=false;
    public TimerSwing() {
        initComponents();
        
         for(int i=0;i<24;i++)
        {
              if(i<10)
            cboxMin.addItem("0"+i);
              else
                 cboxMin.addItem(""+i); 
        }
       for(int i=0;i<60;i++)
        {
            if(i<10)
            cboxSec.addItem("0"+i);
            else
                 cboxSec.addItem(""+i);
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblSec = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboxMin = new javax.swing.JComboBox<>();
        cboxSec = new javax.swing.JComboBox<>();
        btnStop = new javax.swing.JButton();
        btnStart1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel3.setText("00");

        jLabel4.setText(":");

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("00");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText(":");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("********Countdown********");

        lblSec.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblSec.setText("00");

        lblMin.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblMin.setText("00");

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setText(":");

        cboxMin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cboxMin.setForeground(new java.awt.Color(255, 0, 0));
        cboxMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxMinActionPerformed(evt);
            }
        });

        cboxSec.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cboxSec.setForeground(new java.awt.Color(255, 0, 0));
        cboxSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxSecActionPerformed(evt);
            }
        });

        btnStop.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnStop.setForeground(new java.awt.Color(255, 0, 0));
        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        btnStart1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnStart1.setForeground(new java.awt.Color(255, 0, 0));
        btnStart1.setText("Start");
        btnStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(btnStart1)
                .addGap(18, 18, 18)
                .addComponent(btnStop)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cboxMin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxSec, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStop)
                    .addComponent(btnStart1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
                 min1=min;
                 sec1=sec;
                 ifStop=true;
                 timer.stop();
        
    }                                       

    private void btnStart1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
      timer =new Timer(1000,new ActionListener() {
        
          @Override
          public void actionPerformed(ActionEvent e) {
                lblMin.setForeground(Color.black);
                  lblSec.setForeground(Color.black);
              if(ifStop)
              {
                 min=min1;
                 sec=sec1;
                 ifStop=false;
              }
              if(sec==0)
              {
                  sec=60;
                  min--;
              }
              if(min==0)
              {
                  lblMin.setForeground(Color.red);
                  lblSec.setForeground(Color.red);
                  
              }
              if(min<0)
              {
                  JOptionPane.showMessageDialog(rootPane,"times up...","Stopped",0);
                  min=0;sec=0;
                  timer.stop();
                  
              }
              else
              {
             sec--;
             if(sec<10)
             {
                 lblSec.setText("0"+sec);
                 flag=false;
             }
             if(min<10)
             {
                 lblMin.setText("0"+min);
                 if(sec<10)
                 {
                     lblSec.setText("0"+sec);
                 }
                 else
                     lblSec.setText(""+sec);
                 flag=false;
             }
             if(flag)
             {
             lblMin.setText(""+min);
             lblSec.setText(""+sec);
             }
              }
          }
      });
      timer.start();
        
    }                                         

    private void cboxMinActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
       // cboxMin.getSelectedItem();
       lblMin.setText(""+cboxMin.getSelectedItem());
       min=Integer.parseInt(lblMin.getText());
    }                                       

    private void cboxSecActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
       lblSec.setText(""+cboxSec.getSelectedItem());
       sec=Integer.parseInt(lblSec.getText());
    }                                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        watch st=new watch();
        st.show();
        dispose();
    }                                        

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
            java.util.logging.Logger.getLogger(TimerSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimerSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimerSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimerSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimerSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnStart1;
    private javax.swing.JButton btnStop;
    private javax.swing.JComboBox<String> cboxMin;
    private javax.swing.JComboBox<String> cboxSec;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblSec;
    // End of variables declaration                   
}
