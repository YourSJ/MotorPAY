/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package motorph9;

import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import static com.opencsv.ICSVWriter.NO_QUOTE_CHARACTER;
import com.opencsv.exceptions.CsvException;
import java.awt.event.KeyEvent;


/**
 *
 * @author Shekinah Jabez
 */
public class AddEmployee extends javax.swing.JFrame {

    private static final String CSV_FILE = "src\\motorph9\\EmployeeDetails.csv";
    
    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
        initComponents();
        
         // Read CSV data and populate the JTable
        populateTableFromCSV(CSV_FILE);
           
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTimeAndDate();
            }
        });
        timer.start();
    }
    
     private void updateTimeAndDate() {
        
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm:ss a");
        String time = timeFormat.format(new Date());

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        String date = dateFormat.format(new Date());
      
        jLabelTime.setText(time);
        jLabelDate.setText(date);
    }
     
    public void populateTableFromCSV(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            Vector<Vector<String>> data = new Vector<>();
            Vector<String> columnNames = new Vector<>();

           // Read column names
            line = br.readLine();
            String[] columns = line.split(",");
            columnNames.add(columns[0].trim()); // Employee Number
            columnNames.add(columns[3].trim()); // Last Name
            columnNames.add(columns[4].trim()); // First Name
            columnNames.add(columns[8].trim()); // SSS No.
            columnNames.add(columns[9].trim()); // PhilHealth No.
            columnNames.add(columns[10].trim()); // TIN
            columnNames.add(columns[11].trim()); // Pagibig No.

            // Read data rows
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Vector<String> row = new Vector<>();
                row.add(values[0].trim()); // Employee Number
                row.add(values[3].trim()); // Last Name
                row.add(values[4].trim()); // First Name
                row.add(values[8].trim()); // SSS No.
                row.add(values[9].trim()); // PhilHealth No.
                row.add(values[10].trim()); // TIN
                row.add(values[11].trim()); // Pagibig No.
                data.add(row);
            }

            // Create a DefaultTableModel with the data
            DefaultTableModel model = new DefaultTableModel(data, columnNames);
            jTableEmployees.setModel(model);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAddemployeeMain = new javax.swing.JPanel();
        jPanelAdddetails = new javax.swing.JPanel();
        jLabelEmployeeno = new javax.swing.JLabel();
        jTextFieldEmployeeno = new javax.swing.JTextField();
        jLabelLastname = new javax.swing.JLabel();
        jTextFieldLastname = new javax.swing.JTextField();
        jLabelFirstname = new javax.swing.JLabel();
        jTextFieldFirstname = new javax.swing.JTextField();
        jLabelSSSno = new javax.swing.JLabel();
        jLabelPhilhealthno = new javax.swing.JLabel();
        jTextFieldSSSno = new javax.swing.JTextField();
        jTextFieldPhilhealthno = new javax.swing.JTextField();
        jLabelTINno = new javax.swing.JLabel();
        jTextFieldTINno = new javax.swing.JTextField();
        jLabelPagibigno = new javax.swing.JLabel();
        jTextFieldPagibigno = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jButtonDashboard = new javax.swing.JButton();
        jButtonEmployeelist = new javax.swing.JButton();
        jScrollPaneTableEmployees = new javax.swing.JScrollPane();
        jTableEmployees = new javax.swing.JTable();
        jLabelDate = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabelGMT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelAddemployeeMain.setBackground(new java.awt.Color(0, 0, 0));

        jPanelAdddetails.setBackground(new java.awt.Color(0, 0, 51));

        jLabelEmployeeno.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelEmployeeno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmployeeno.setText("EMPLOYEE NO");

        jTextFieldEmployeeno.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldEmployeeno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldEmployeeno.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEmployeeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmployeenoActionPerformed(evt);
            }
        });
        jTextFieldEmployeeno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEmployeenoKeyTyped(evt);
            }
        });

        jLabelLastname.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelLastname.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLastname.setText("LAST NAME");

        jTextFieldLastname.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldLastname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldLastname.setForeground(new java.awt.Color(255, 255, 255));

        jLabelFirstname.setBackground(new java.awt.Color(0, 0, 0));
        jLabelFirstname.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelFirstname.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFirstname.setText("FIRST NAME");

        jTextFieldFirstname.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldFirstname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldFirstname.setForeground(new java.awt.Color(255, 255, 255));

        jLabelSSSno.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelSSSno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSSSno.setText("SSS NO");

        jLabelPhilhealthno.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelPhilhealthno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPhilhealthno.setText("PHILHEALTH NO");

        jTextFieldSSSno.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldSSSno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldSSSno.setForeground(new java.awt.Color(255, 255, 255));

        jTextFieldPhilhealthno.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldPhilhealthno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPhilhealthno.setForeground(new java.awt.Color(255, 255, 255));

        jLabelTINno.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelTINno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTINno.setText("TIN NO");

        jTextFieldTINno.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldTINno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldTINno.setForeground(new java.awt.Color(255, 255, 255));

        jLabelPagibigno.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelPagibigno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPagibigno.setText("PAGIBIG NO");

        jTextFieldPagibigno.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldPagibigno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPagibigno.setForeground(new java.awt.Color(255, 255, 255));

        jButtonAdd.setBackground(new java.awt.Color(0, 0, 51));
        jButtonAdd.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAdddetailsLayout = new javax.swing.GroupLayout(jPanelAdddetails);
        jPanelAdddetails.setLayout(jPanelAdddetailsLayout);
        jPanelAdddetailsLayout.setHorizontalGroup(
            jPanelAdddetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdddetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAdddetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdddetailsLayout.createSequentialGroup()
                        .addGroup(jPanelAdddetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmployeeno)
                            .addComponent(jLabelLastname)
                            .addComponent(jLabelFirstname)
                            .addComponent(jLabelSSSno, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanelAdddetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEmployeeno, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jTextFieldLastname)
                            .addComponent(jTextFieldSSSno)
                            .addComponent(jTextFieldFirstname, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanelAdddetailsLayout.createSequentialGroup()
                        .addComponent(jLabelPhilhealthno, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPhilhealthno))
                    .addGroup(jPanelAdddetailsLayout.createSequentialGroup()
                        .addComponent(jLabelTINno, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTINno))
                    .addGroup(jPanelAdddetailsLayout.createSequentialGroup()
                        .addComponent(jLabelPagibigno, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPagibigno))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdddetailsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAdd)))
                .addContainerGap())
        );
        jPanelAdddetailsLayout.setVerticalGroup(
            jPanelAdddetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdddetailsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelAdddetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmployeeno)
                    .addComponent(jTextFieldEmployeeno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAdddetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLastname)
                    .addComponent(jTextFieldLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAdddetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFirstname)
                    .addComponent(jTextFieldFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAdddetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSSSno)
                    .addComponent(jTextFieldSSSno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAdddetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhilhealthno)
                    .addComponent(jTextFieldPhilhealthno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAdddetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTINno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTINno))
                .addGap(18, 18, 18)
                .addGroup(jPanelAdddetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPagibigno)
                    .addComponent(jTextFieldPagibigno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jButtonAdd)
                .addGap(19, 19, 19))
        );

        jLabelTitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(204, 0, 0));
        jLabelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos9/empdes3.png"))); // NOI18N

        jButtonDashboard.setBackground(new java.awt.Color(0, 0, 51));
        jButtonDashboard.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDashboard.setText("Dashboard");
        jButtonDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDashboardActionPerformed(evt);
            }
        });

        jButtonEmployeelist.setBackground(new java.awt.Color(0, 0, 51));
        jButtonEmployeelist.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEmployeelist.setText("Employee List");
        jButtonEmployeelist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmployeelistActionPerformed(evt);
            }
        });

        jTableEmployees.setBackground(new java.awt.Color(0, 0, 51));
        jTableEmployees.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTableEmployees.setForeground(new java.awt.Color(255, 255, 255));
        jTableEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee Number", "Last Name", "First name", "SSS No.", "PhilHealth No.", "TIN No.", "Pagibig No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneTableEmployees.setViewportView(jTableEmployees);

        jLabelDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDate.setText("Wednesday, December 25, 2012");
        jLabelDate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelTime.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTime.setText("12:12:12 AM");

        jLabelGMT.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGMT.setText("GMT+8 PH Time");

        javax.swing.GroupLayout jPanelAddemployeeMainLayout = new javax.swing.GroupLayout(jPanelAddemployeeMain);
        jPanelAddemployeeMain.setLayout(jPanelAddemployeeMainLayout);
        jPanelAddemployeeMainLayout.setHorizontalGroup(
            jPanelAddemployeeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddemployeeMainLayout.createSequentialGroup()
                .addGroup(jPanelAddemployeeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAddemployeeMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelAdddetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanelAddemployeeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddemployeeMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelGMT)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEmployeelist)
                        .addGap(12, 12, 12))
                    .addGroup(jPanelAddemployeeMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneTableEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanelAddemployeeMainLayout.setVerticalGroup(
            jPanelAddemployeeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddemployeeMainLayout.createSequentialGroup()
                .addGroup(jPanelAddemployeeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddemployeeMainLayout.createSequentialGroup()
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelAdddetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelAddemployeeMainLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanelAddemployeeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEmployeelist, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDate)
                            .addComponent(jLabelTime)
                            .addComponent(jLabelGMT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneTableEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddemployeeMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddemployeeMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDashboardActionPerformed
        // TODO add your handling code here:
        Dashboard newClassInstance = new Dashboard();
                newClassInstance.setVisible(true);

                dispose();
    }//GEN-LAST:event_jButtonDashboardActionPerformed

    private void jButtonEmployeelistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmployeelistActionPerformed
        // TODO add your handling code here:
        Employee newClassInstance = new Employee();
                newClassInstance.setVisible(true);

                dispose();
    }//GEN-LAST:event_jButtonEmployeelistActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        int jTableLastRow = jTableEmployees.getRowCount()+1;

        // TODO add your handling code here:
        DefaultTableModel addedRow = (DefaultTableModel) jTableEmployees.getModel();       
        String id = jTextFieldEmployeeno.getText();
        String lastName  = jTextFieldLastname.getText();
        String firstName = jTextFieldFirstname.getText();
        String SSSno = jTextFieldSSSno.getText();
        String PhilhealtNum = jTextFieldPhilhealthno.getText();
        String Tin = jTextFieldTINno.getText();
        String PagibigNum = jTextFieldPagibigno.getText();
//        String birthday = empBday.getText();
//        String address = empAddy.getText();
//        String phone = empPhone.getText();
//        String status = empStatus.getText();
//        String position = empPosition.getText();
//        String supervisor = empSupp.getText();
                 
        for (char c : id.toCharArray()) {
            if (Character.isAlphabetic(c)){
                JOptionPane.showMessageDialog (this,
                "Error",
                "Try Again",
                JOptionPane.INFORMATION_MESSAGE);                    
                break;
            }
            
            if (id.isEmpty() ||
                lastName.isEmpty() || 
                firstName.isEmpty() || 
                SSSno.isEmpty() || 
                PhilhealtNum.isEmpty() || 
                Tin.isEmpty() || 
                PagibigNum.isEmpty()) {
                JOptionPane.showMessageDialog (this,
                    "Pease enter all fields",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);

            } else {          
                addedRow.addRow(new Object[] {id, lastName, firstName, SSSno, PhilhealtNum, Tin, PagibigNum});      
            }
            
            try {updateCSVFile(id, lastName, firstName, SSSno, PhilhealtNum, Tin, PagibigNum, addedRow, jTableLastRow);} 
            catch (IOException ex) {
                Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }//GEN-LAST:event_jButtonAddActionPerformed

    public void updateCSVFile(String employeeNo,
                              String lastName,
                              String firstName, 
                              String sssNo,
                              String philHealthNo,
                              String tinNo,
                              String pagibigNo,
                              DefaultTableModel addedRow,
                              int jTableLastRow) throws FileNotFoundException, IOException{                    
        try{           
            DefaultTableModel modelToCSV = (DefaultTableModel) jTableEmployees.getModel();
            int jTable_columnCount = modelToCSV.getColumnCount();
            
            //Saving all the Column Name from JTable in An Array
            String[] jTableColumnName = new String[jTable_columnCount];           
            for (int i=0;i<jTable_columnCount;i++){
                jTableColumnName[i] = modelToCSV.getColumnName(i);
            }
            
            //Getting Row of Data Added from Jtable
            String[] arrAddedJTableRowData = new String [jTable_columnCount];                     
            for (int i = 0; i < jTable_columnCount; i++) {                               
                arrAddedJTableRowData[i] = (String) addedRow.getValueAt(jTableLastRow-1, i);
            }         
            
            //Reading the CSV Document
            List<List<String>> records = new ArrayList<>();      
            try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");                   
                    records.add(Arrays.asList(values));                  
                }
            }           
            catch(IOException e){e.printStackTrace();}
        
            //Getting the ColumnName from the CSV file.
            List <String> csvOneLineRead = records.get(0);        
            int csvMaxIndex = csvOneLineRead.size();
      
            //Converting the from an Array List to an Array - Getting column names
            String[] arrCSVOneLineRead = new String[csvMaxIndex];
            for (int i = 0; i < csvOneLineRead.size(); i++) {
                arrCSVOneLineRead[i] = csvOneLineRead.get(i);
            }
        
            //Getting the actual index of an array based from JTable Column Name
            int[] jTableToCSVIdentifier = new int[jTable_columnCount];
            for(int i=0;i<jTable_columnCount;i++){
                for(int j=0;j<arrCSVOneLineRead.length;j++){
                    if(jTableColumnName[i].equalsIgnoreCase(arrCSVOneLineRead[j])){
                        jTableToCSVIdentifier[i] = j;
                    }
                }
            }            
            
            int indexer = 0;
            String[] dataToInput = new String[csvMaxIndex];
            for(int i=0;i<jTableToCSVIdentifier.length;i++){                                                                                           
                for(int j=0;j<csvMaxIndex;j++){
                    if(j == jTableToCSVIdentifier[i]){
                        dataToInput[j] = arrAddedJTableRowData[i];                          
                        indexer++;
                        break;
                    }                      
                }                    
            }
                        
            try{             
                CSVReader csvReader = new CSVReader(new FileReader(new File(CSV_FILE)));                
                List<String[]> allData = csvReader.readAll(); 
                allData.add(dataToInput);
                                
                CSVWriter csvWriter = new CSVWriter (new FileWriter(new File(CSV_FILE)));
                csvWriter.writeAll(allData,false);                
                csvReader.close();   
                csvWriter.flush();  
                csvWriter.close();                                                                                
                }
            catch(CsvException e){e.printStackTrace();}                   
        }
        catch (IOException e){e.printStackTrace();}
    }
    
    private void jTextFieldEmployeenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmployeenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmployeenoActionPerformed

    private void jTextFieldEmployeenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmployeenoKeyTyped
        boolean max = jTextFieldEmployeeno.getText().length() > 4; 
        char empID = evt.getKeyChar();                             
        if(!Character.isDigit(empID)|| max){evt.consume();}           
    }//GEN-LAST:event_jTextFieldEmployeenoKeyTyped

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDashboard;
    private javax.swing.JButton jButtonEmployeelist;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelEmployeeno;
    private javax.swing.JLabel jLabelFirstname;
    private javax.swing.JLabel jLabelGMT;
    private javax.swing.JLabel jLabelLastname;
    private javax.swing.JLabel jLabelPagibigno;
    private javax.swing.JLabel jLabelPhilhealthno;
    private javax.swing.JLabel jLabelSSSno;
    private javax.swing.JLabel jLabelTINno;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelAdddetails;
    private javax.swing.JPanel jPanelAddemployeeMain;
    private javax.swing.JScrollPane jScrollPaneTableEmployees;
    private javax.swing.JTable jTableEmployees;
    private javax.swing.JTextField jTextFieldEmployeeno;
    private javax.swing.JTextField jTextFieldFirstname;
    private javax.swing.JTextField jTextFieldLastname;
    private javax.swing.JTextField jTextFieldPagibigno;
    private javax.swing.JTextField jTextFieldPhilhealthno;
    private javax.swing.JTextField jTextFieldSSSno;
    private javax.swing.JTextField jTextFieldTINno;
    // End of variables declaration//GEN-END:variables
}