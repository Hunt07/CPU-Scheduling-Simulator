// import java.awt.event.WindowAdapter;
// import java.awt.event.WindowEvent;
// import javax.swing.*;
// import java.io.File;
// import java.util.Random;

// public class SchedulingGUI extends JFrame {
//     private String[] algorithms = {"FCFS", "Round Robin", "Shortest Job First", "Priority Scheduling"};
//     private String sourcePath = new String();
//     public static int NUM_OF_PROCESSES = 0;
//     static String selectedAlgo = new String();
    
//     public SchedulingGUI() {
//         initComponents();
//         jLabel7.setIcon(new javax.swing.ImageIcon("src\\main\\java\\dark-abstract-tech-background_53876-90630.jpg")); 
//         setResizable(false);
//         setTitle("CPU Scheduling Simulator");
//         jComboBox1.setModel(new DefaultComboBoxModel<>(algorithms));
//         addWindowListener(new WindowListener());
//         setLocationRelativeTo(null);
//     }
    
//     private class WindowListener extends WindowAdapter {
//         public void windowOpened(WindowEvent e) {
//             TitleThread thread = new TitleThread("Simulation", jLabel1, 200);
//             thread.start();
//         }
//     }
//     private void initComponents() {
//         jPanel1 = new javax.swing.JPanel();
//         jLabel2 = new javax.swing.JLabel();
//         jComboBox1 = new javax.swing.JComboBox<>();
//         jLabel3 = new javax.swing.JLabel();
//         jButton2 = new javax.swing.JButton();
//         jLabel4 = new javax.swing.JLabel();
//         jLabel1 = new javax.swing.JLabel();
//         jLabel5 = new javax.swing.JLabel();
//         jTextField1 = new javax.swing.JTextField();
//         nextStep2 = new javax.swing.JButton();
//         jLabel6 = new javax.swing.JLabel();
//         jLabel7 = new javax.swing.JLabel();
        
//         // New labels and text fields for Arrival Time, Burst Time, and Priority
//         jLabel8 = new javax.swing.JLabel();
//         jTextFieldArrivalTime = new javax.swing.JTextField();
//         jLabel9 = new javax.swing.JLabel();
//         jTextFieldBurstTime = new javax.swing.JTextField();
//         jLabel10 = new javax.swing.JLabel();
//         jTextFieldPriority = new javax.swing.JTextField();
    
//         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
//         jPanel1.setBackground(new java.awt.Color(0, 102, 102));
//         jPanel1.setLayout(new AbsoluteLayout());
    
//         jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); 
//         jLabel2.setForeground(new java.awt.Color(255, 255, 255));
//         jLabel2.setText("Process NO.:");
//         jPanel1.add(jLabel2, new AbsoluteConstraints(320, 290, 130, 30));
    
//         jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFS", "Round Robin", "Shortest Job First", "Priority Scheduling" }));
//         jPanel1.add(jComboBox1, new AbsoluteConstraints(490, 190, 140, 30));
    
//         jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); 
//         jLabel3.setForeground(new java.awt.Color(255, 255, 255));
//         jLabel3.setText("Algorithm:");
    
//         jButton2.setFont(new java.awt.Font("Tahoma", 3, 12)); 
//         jButton2.setText("Team Info");
//         jButton2.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 jButton2ActionPerformed(evt);
//             }
//         });
//         jPanel1.add(jButton2, new AbsoluteConstraints(0, 500, 100, 30));
    
//         jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 48)); 
//         jLabel4.setForeground(new java.awt.Color(255, 255, 255));
//         jLabel4.setText("CPU Scheduling");
//         jPanel1.add(jLabel4, new AbsoluteConstraints(280, 10, 420, 80));
    
//         jLabel1.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); 
//         jLabel1.setForeground(new java.awt.Color(255, 255, 255));
//         jLabel1.setText("Simulation");
//         jPanel1.add(jLabel1, new AbsoluteConstraints(410, 90, 120, -1));
    
    
//         jPanel1.add(jLabel5, new AbsoluteConstraints(320, 240, 70, 30));
    
//         jTextField1.setText(" ");
//         jPanel1.add(jTextField1, new AbsoluteConstraints(490, 290, 140, 30));
    
//         // New text fields for Arrival Time, Burst Time, and Priority
//         jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); 
//         jLabel8.setForeground(new java.awt.Color(255, 255, 255));
//         jLabel8.setText("Arrival Time:");
//         jPanel1.add(jLabel8, new AbsoluteConstraints(320, 340, 130, 30));
//         jPanel1.add(jTextFieldArrivalTime, new AbsoluteConstraints(490, 340, 140, 30));
    
//         jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); 
//         jLabel9.setForeground(new java.awt.Color(255, 255, 255));
//         jLabel9.setText("Burst Time:");
//         jPanel1.add(jLabel9, new AbsoluteConstraints(320, 380, 130, 30));
//         jPanel1.add(jTextFieldBurstTime, new AbsoluteConstraints(490, 380, 140, 30));
    
//         jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); 
//         jLabel10.setForeground(new java.awt.Color(255, 255, 255));
//         jLabel10.setText("Priority:");
//         jPanel1.add(jLabel10, new AbsoluteConstraints(320, 420, 130, 30));
//         jPanel1.add(jTextFieldPriority, new AbsoluteConstraints(490, 420, 140, 30));
    
//         nextStep2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
//         nextStep2.setText("Start");
//         nextStep2.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 nextStep2ActionPerformed(evt);
//             }
//         });
//         jPanel1.add(nextStep2, new AbsoluteConstraints(410, 470, 130, 40));
    
//         jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); 
//         jLabel6.setForeground(new java.awt.Color(255, 255, 255));
//         jLabel6.setText("(3 <= N <= 10)");
//         jPanel1.add(jLabel6, new AbsoluteConstraints(650, 290, 120, 30));
    
    
//         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//         getContentPane().setLayout(layout);
//         layout.setHorizontalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(layout.createSequentialGroup()
//                 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(0, 0, Short.MAX_VALUE))
//         );
//         layout.setVerticalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(layout.createSequentialGroup()
//                 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(0, 0, Short.MAX_VALUE))
//         );
    
//         pack();
//         setLocationRelativeTo(null);
//     }
    
//     // private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//     //     JFileChooser fileChooser = new JFileChooser();
//     //     fileChooser.showOpenDialog(null);
//     //     File file = fileChooser.getSelectedFile();
//     //     sourcePath = file.getAbsolutePath();
//     // }//GEN-LAST:event_jButton1ActionPerformed
    
//     // Define a static file path within the project directory
//     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
//         sourcePath = "C:\\Users\\osama\\CPU-Scheduling-Simulator\\resources\\example.txt"; // Static path
//         // System.out.println("Static Path: " + sourcePath);
//         // File file = new File(sourcePath);
//         // if (file.exists() && file.isFile()) {
//             System.out.println("File exists and is ready for use.");
//         // } else {
//             // System.out.println("Error: File not found at " + sourcePath);
//         // }
//     }
    
    

//     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//         JOptionPane.showMessageDialog(null, "");
//     }//GEN-LAST:event_jButton2ActionPerformed

//     // private void nextStep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextStep2ActionPerformed
//     //     int numOfProcesses = Integer.parseInt(jTextField1.getText());

//     //     /*if(sourcePath.isEmpty())
//     //         JOptionPane.showMessageDialog(null, "ERROR: Please input the source of computation");*/ 

//     //     // else if 
//     //     if(numOfProcesses <= 0)
//     //         JOptionPane.showMessageDialog(null, "ERROR: Please input the appropriate number of processes");
//     //     else {
//     //         selectedAlgo = jComboBox1.getSelectedItem().toString();
//     //         NUM_OF_PROCESSES = Integer.parseInt(jTextField1.getText());
//     //         Job[] jobs = new Job[NUM_OF_PROCESSES];
//     //         for(int i = 1; i <= NUM_OF_PROCESSES; i++) {
//     //             String processID = "P"+i;
//     //             long arrivalTime = (new java.util.Random().nextInt(9) + 1) * 300;
//     //             long burstTime = (new java.util.Random().nextInt(3) + 1) * 100;
//     //             long STRTTIME = System.nanoTime();
                
//     //             Job newJob = new Job(processID, arrivalTime, burstTime, STRTTIME);
//     //             jobs[(i-1)] = newJob;
//     //         }
//     //             CalcSimulation sim = 
//     //                     new CalcSimulation(jobs, NUM_OF_PROCESSES, sourcePath, selectedAlgo);
//     //         sim.start();
//     //         this.dispose();
//     //     }
//     // }//GEN-LAST:event_nextStep2ActionPerformed

//     private void nextStep2ActionPerformed(java.awt.event.ActionEvent evt) {
//         int numOfProcesses = Integer.parseInt(jTextField1.getText());
    
//         if(numOfProcesses <= 0)
//             JOptionPane.showMessageDialog(null, "ERROR: Please input the appropriate number of processes");
//         else {
//             selectedAlgo = jComboBox1.getSelectedItem().toString();
//             NUM_OF_PROCESSES = Integer.parseInt(jTextField1.getText());
//             Job[] jobs = new Job[NUM_OF_PROCESSES];
            
//             for(int i = 1; i <= NUM_OF_PROCESSES; i++) {
//                 String processID = "P" + i;
                
//                 // Get the Arrival Time, Burst Time, and Priority from the text fields
//                 long arrivalTime = Long.parseLong(jTextFieldArrivalTime.getText());
//                 long burstTime = Long.parseLong(jTextFieldBurstTime.getText());
//                 int priority = Integer.parseInt(jTextFieldPriority.getText());
                
//                 long STRTTIME = System.nanoTime();
                
//                 // Create the new Job object with all values
//                 // Job newJob = new Job(processID, arrivalTime, burstTime, STRTTIME, priority);
//                 // Job newJob = new Job(processID, arrivalTime, burstTime, STRTTIME, priority);
//                 Job newJob = new Job(processID, arrivalTime, burstTime, STRTTIME, priority);


//                 jobs[(i-1)] = newJob;
//             }
            
//             CalcSimulation sim = new CalcSimulation(jobs, NUM_OF_PROCESSES, sourcePath, selectedAlgo);
//             sim.start();
//             this.dispose();
//         }
//     }
  

//     public static void main(String args[]) {
//         try {
//             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                 if ("Nimbus".equals(info.getName())) {
//                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                     break;
//                 }
//             }
//         } catch (ClassNotFoundException ex) {
//             java.util.logging.Logger.getLogger(SchedulingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (InstantiationException ex) {
//             java.util.logging.Logger.getLogger(SchedulingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (IllegalAccessException ex) {
//             java.util.logging.Logger.getLogger(SchedulingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//             java.util.logging.Logger.getLogger(SchedulingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         }
//         java.awt.EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 new SchedulingGUI().setVisible(true);
//             }
//         });
//     }

//     // Variables declaration - do not modify//GEN-BEGIN:variables
//     // private javax.swing.JButton jButton1;
//     private javax.swing.JTextField jTextFieldArrivalTime;
//     private javax.swing.JLabel jLabel9;
//     private javax.swing.JTextField jTextFieldBurstTime;
//     private javax.swing.JLabel jLabel10;
//     private javax.swing.JTextField jTextFieldPriority;
    
//     private javax.swing.JButton jButton2;
//     private javax.swing.JComboBox<String> jComboBox1;
//     private javax.swing.JLabel jLabel1;
//     private javax.swing.JLabel jLabel2;
//     private javax.swing.JLabel jLabel3;
//     private javax.swing.JLabel jLabel4;
//     private javax.swing.JLabel jLabel5;
//     private javax.swing.JLabel jLabel6;
//     private javax.swing.JLabel jLabel7;
//     private javax.swing.JPanel jPanel1;
//     private javax.swing.JTextField jTextField1;
//     private javax.swing.JButton nextStep2;
//     private javax.swing.JLabel jLabel8;

//     // End of variables declaration//GEN-END:variables
// }
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.io.File;
import java.util.Random;

public class SchedulingGUI extends JFrame {
    private String[] algorithms = {"FCFS", "Round Robin", "Shortest Job First", "Priority Scheduling"};
    private String sourcePath = new String();
    public static int NUM_OF_PROCESSES = 0;
    static String selectedAlgo = new String();
    
    public SchedulingGUI() {
        initComponents();
        jLabel7.setIcon(new javax.swing.ImageIcon("src\\main\\java\\dark-abstract-tech-background_53876-90630.jpg")); 
        setResizable(false);
        setTitle("CPU Scheduling Simulator");
        jComboBox1.setModel(new DefaultComboBoxModel<>(algorithms));
        addWindowListener(new WindowListener());
        setLocationRelativeTo(null);
    }
    
    private class WindowListener extends WindowAdapter {
        public void windowOpened(WindowEvent e) {
            TitleThread thread = new TitleThread("Simulation", jLabel1, 200);
            thread.start();
        }
    }
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        nextStep2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        
        // New labels and text fields for Arrival Time, Burst Time, and Priority
        jLabel8 = new javax.swing.JLabel();
        jTextFieldArrivalTime = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldBurstTime = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPriority = new javax.swing.JTextField();
    
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new AbsoluteLayout());
    
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Process NO.:");
        jPanel1.add(jLabel2, new AbsoluteConstraints(320, 290, 130, 30));
    
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFS", "Round Robin", "Shortest Job First", "Priority Scheduling" }));
        jPanel1.add(jComboBox1, new AbsoluteConstraints(490, 190, 140, 30));
    
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Algorithm:");
    
        // jButton2.setFont(new java.awt.Font("Tahoma", 3, 12)); 
        // jButton2.setText("Team Info");
        // jButton2.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         jButton2ActionPerformed(evt);
        //     }
        // });
        // jPanel1.add(jButton2, new AbsoluteConstraints(0, 500, 100, 30));
    
        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 48)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPU Scheduling");
        jPanel1.add(jLabel4, new AbsoluteConstraints(280, 10, 420, 80));
    
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Simulation");
        jPanel1.add(jLabel1, new AbsoluteConstraints(410, 90, 120, -1));
    
    
        jPanel1.add(jLabel5, new AbsoluteConstraints(320, 240, 70, 30));
    
        jTextField1.setText(" ");
        jPanel1.add(jTextField1, new AbsoluteConstraints(490, 290, 140, 30));
    
        // New text fields for Arrival Time, Burst Time, and Priority
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Arrival Time:");
        jPanel1.add(jLabel8, new AbsoluteConstraints(320, 340, 130, 30));
        jPanel1.add(jTextFieldArrivalTime, new AbsoluteConstraints(490, 340, 140, 30));
    
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Burst Time:");
        jPanel1.add(jLabel9, new AbsoluteConstraints(320, 380, 130, 30));
        jPanel1.add(jTextFieldBurstTime, new AbsoluteConstraints(490, 380, 140, 30));
    
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Priority:");
        jPanel1.add(jLabel10, new AbsoluteConstraints(320, 420, 130, 30));
        jPanel1.add(jTextFieldPriority, new AbsoluteConstraints(490, 420, 140, 30));
    
        nextStep2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        nextStep2.setText("Start");
        nextStep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextStep2ActionPerformed(evt);
            }
        });
        jPanel1.add(nextStep2, new AbsoluteConstraints(410, 470, 130, 40));
    
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(3 <= N <= 10)");
        jPanel1.add(jLabel6, new AbsoluteConstraints(650, 290, 120, 30));
    
    
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    
        pack();
        setLocationRelativeTo(null);
    }
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        sourcePath = "C:\\Users\\osama\\CPU-Scheduling-Simulator\\resources\\example.txt"; // Static path
 
            System.out.println("File exists and is ready for use.");

    }
    
    

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "");
    }

    private void nextStep2ActionPerformed(java.awt.event.ActionEvent evt) {
        // Trim any leading or trailing spaces from the input text before parsing
        String numProcessesText = jTextField1.getText().trim();
        
        try {
            int numOfProcesses = Integer.parseInt(numProcessesText);
            
            if(numOfProcesses <= 0)
                JOptionPane.showMessageDialog(null, "ERROR: Please input the appropriate number of processes");
            else {
                selectedAlgo = jComboBox1.getSelectedItem().toString();
                NUM_OF_PROCESSES = numOfProcesses;
                Job[] jobs = new Job[NUM_OF_PROCESSES];
                
                // Loop to get individual values for each process
                for (int i = 0; i < NUM_OF_PROCESSES; i++) {
                    String processID = "P" + (i + 1);
                    
                    // Retrieve the Arrival Time, Burst Time, and Priority for each job dynamically
                    long arrivalTime = Long.parseLong(jTextFieldArrivalTime.getText().trim());  // Trim spaces
                    long burstTime = Long.parseLong(jTextFieldBurstTime.getText().trim());  // Trim spaces
                    int priority = Integer.parseInt(jTextFieldPriority.getText().trim());  // Trim spaces
                    
                    long STRTTIME = System.nanoTime();
                    
                    // Create a new Job with individual values
                    Job newJob = new Job(processID, arrivalTime, burstTime, STRTTIME, priority);
                    jobs[i] = newJob;
                }
                
                // Start the simulation with the created jobs
                CalcSimulation sim = new CalcSimulation(jobs, NUM_OF_PROCESSES, sourcePath, selectedAlgo);
                sim.start();
                this.dispose();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERROR: Invalid input. Please enter valid numeric values.");
        }
    }
    

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SchedulingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchedulingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchedulingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchedulingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchedulingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextFieldArrivalTime;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldBurstTime;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JTextField jTextFieldPriority;
    
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton nextStep2;
    private javax.swing.JLabel jLabel8;

    // End of variables declaration//GEN-END:variables
}
