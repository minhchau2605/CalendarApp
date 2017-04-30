/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalendarGUI;

import Algorithm.algorithmCalendar;
import Algorithm.checkData;
import javax.swing.JOptionPane;

/**
 *
 * @author Chau Milano
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public mainFrame() {
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

        jPanelBg = new javax.swing.JPanel();
        btnLunar2Solar = new javax.swing.JButton();
        btnSolar2Lunar = new javax.swing.JButton();
        jLabelBg = new javax.swing.JLabel();
        jPanelMain = new javax.swing.JPanel();
        jPanelWelcome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelLunar2Solar = new javax.swing.JPanel();
        jLabelSolar1 = new javax.swing.JLabel();
        jLabelLunar1 = new javax.swing.JLabel();
        tfSolarDay1 = new javax.swing.JTextField();
        tfLunarDay1 = new javax.swing.JTextField();
        tfSolarMonth1 = new javax.swing.JTextField();
        tfLunarMonth1 = new javax.swing.JTextField();
        tfLunarYear1 = new javax.swing.JTextField();
        tfSolarYear1 = new javax.swing.JTextField();
        tfLeap1 = new javax.swing.JTextField();
        jLabelDay1 = new javax.swing.JLabel();
        jLabelMonth1 = new javax.swing.JLabel();
        jLabelYear1 = new javax.swing.JLabel();
        jLabelLeap1 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnConvertLunar2Solar = new javax.swing.JButton();
        jLabeLNote = new javax.swing.JLabel();
        jPanelSolar2Lunar = new javax.swing.JPanel();
        jLabelSolar = new javax.swing.JLabel();
        jLabelLunar = new javax.swing.JLabel();
        tfSolarDay = new javax.swing.JTextField();
        tfLunarDay = new javax.swing.JTextField();
        tfSolarMonth = new javax.swing.JTextField();
        tfLunarMonth = new javax.swing.JTextField();
        tfLunarYear = new javax.swing.JTextField();
        tfSolarYear = new javax.swing.JTextField();
        tfLeap = new javax.swing.JTextField();
        jLabelDay = new javax.swing.JLabel();
        jLabelMonth = new javax.swing.JLabel();
        jLabelYear = new javax.swing.JLabel();
        jLabelLeap = new javax.swing.JLabel();
        btnConvertSolar2Lunar = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CHƯƠNG TRÌNH CHUYỂN ĐỔI NGÀY DƯƠNG - ÂM LỊCH");
        setResizable(false);

        jPanelBg.setLayout(null);

        btnLunar2Solar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnLunar2Solar.setText("ÂM LỊCH SANG DƯƠNG LỊCH");
        btnLunar2Solar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLunar2SolarActionPerformed(evt);
            }
        });
        jPanelBg.add(btnLunar2Solar);
        btnLunar2Solar.setBounds(380, 10, 250, 60);

        btnSolar2Lunar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnSolar2Lunar.setText("DƯƠNG LỊCH SANG ÂM LỊCH");
        btnSolar2Lunar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolar2LunarActionPerformed(evt);
            }
        });
        jPanelBg.add(btnSolar2Lunar);
        btnSolar2Lunar.setBounds(50, 10, 250, 60);

        jLabelBg.setBackground(new java.awt.Color(255, 51, 153));
        jLabelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CalendarGUI/background.jpg"))); // NOI18N
        jPanelBg.add(jLabelBg);
        jLabelBg.setBounds(0, 0, 680, 110);

        jPanelMain.setLayout(new java.awt.CardLayout());

        jPanelWelcome.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CHƯƠNG TRÌNH CHUYỂN ĐỔI NGÀY DƯƠNG - ÂM");
        jPanelWelcome.add(jLabel2);
        jLabel2.setBounds(130, 90, 430, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CalendarGUI/background.jpg"))); // NOI18N
        jPanelWelcome.add(jLabel1);
        jLabel1.setBounds(-6, -6, 690, 330);

        jPanelMain.add(jPanelWelcome, "card4");

        jLabelSolar1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelSolar1.setText("ÂM LỊCH");

        jLabelLunar1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelLunar1.setText("DƯƠNG LỊCH");

        tfSolarDay1.setEditable(false);
        tfSolarDay1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        tfLunarDay1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        tfSolarMonth1.setEditable(false);
        tfSolarMonth1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        tfLunarMonth1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        tfLunarYear1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        tfSolarYear1.setEditable(false);
        tfSolarYear1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        tfLeap1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabelDay1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelDay1.setText("NGÀY");

        jLabelMonth1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelMonth1.setText("THÁNG");

        jLabelYear1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelYear1.setText("NĂM");

        jLabelLeap1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelLeap1.setText("NHUẬN");

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnClear.setText("NHẬP LẠI");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnConvertLunar2Solar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnConvertLunar2Solar.setText("CHUYỂN ĐỔI");
        btnConvertLunar2Solar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertLunar2SolarActionPerformed(evt);
            }
        });

        jLabeLNote.setForeground(new java.awt.Color(204, 0, 51));
        jLabeLNote.setText("LƯU Ý: NẾU LÀ NĂM NHUẬN NHẬP 1, NĂM KHÔNG NHUẬN NHẬP 0");

        javax.swing.GroupLayout jPanelLunar2SolarLayout = new javax.swing.GroupLayout(jPanelLunar2Solar);
        jPanelLunar2Solar.setLayout(jPanelLunar2SolarLayout);
        jPanelLunar2SolarLayout.setHorizontalGroup(
            jPanelLunar2SolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLunar2SolarLayout.createSequentialGroup()
                .addGroup(jPanelLunar2SolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLunar2SolarLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanelLunar2SolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLunar2SolarLayout.createSequentialGroup()
                                .addComponent(jLabelLunar1)
                                .addGap(82, 82, 82)
                                .addComponent(tfSolarDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLunar2SolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnConvertLunar2Solar)
                                .addGroup(jPanelLunar2SolarLayout.createSequentialGroup()
                                    .addComponent(jLabelSolar1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(82, 82, 82)
                                    .addGroup(jPanelLunar2SolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfLunarDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanelLunar2SolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfLunarMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfSolarMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnClear))
                                    .addGap(26, 26, 26)
                                    .addGroup(jPanelLunar2SolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfSolarYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfLunarYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(38, 38, 38)
                                    .addGroup(jPanelLunar2SolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelLeap1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfLeap1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabeLNote, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelLunar2SolarLayout.setVerticalGroup(
            jPanelLunar2SolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLunar2SolarLayout.createSequentialGroup()
                .addComponent(jLabeLNote, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLunar2SolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLeap1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLunar2SolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLunar2SolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfLunarDay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfLunarMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfLunarYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfLeap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelSolar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanelLunar2SolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLunar2SolarLayout.createSequentialGroup()
                        .addGroup(jPanelLunar2SolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSolarDay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSolarMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSolarYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanelLunar2SolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConvertLunar2Solar)
                            .addComponent(btnClear)))
                    .addComponent(jLabelLunar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        jPanelMain.add(jPanelLunar2Solar, "card2");

        jLabelSolar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelSolar.setText("DƯƠNG LỊCH");

        jLabelLunar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelLunar.setText("ÂM LỊCH");

        tfSolarDay.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        tfLunarDay.setEditable(false);
        tfLunarDay.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        tfSolarMonth.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        tfLunarMonth.setEditable(false);
        tfLunarMonth.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        tfLunarYear.setEditable(false);
        tfLunarYear.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        tfSolarYear.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        tfLeap.setEditable(false);
        tfLeap.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabelDay.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelDay.setText("NGÀY");

        jLabelMonth.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelMonth.setText("THÁNG");

        jLabelYear.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelYear.setText("NĂM");

        jLabelLeap.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelLeap.setText("NHUẬN");

        btnConvertSolar2Lunar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnConvertSolar2Lunar.setText("CHUYỂN ĐỔI");
        btnConvertSolar2Lunar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertSolar2LunarActionPerformed(evt);
            }
        });

        jButtonClear.setText("NHẬP LẠI");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSolar2LunarLayout = new javax.swing.GroupLayout(jPanelSolar2Lunar);
        jPanelSolar2Lunar.setLayout(jPanelSolar2LunarLayout);
        jPanelSolar2LunarLayout.setHorizontalGroup(
            jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSolar2LunarLayout.createSequentialGroup()
                .addGroup(jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSolar2LunarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelSolar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelLunar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(104, 104, 104)
                        .addGroup(jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfLunarDay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSolarDay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDay))
                        .addGroup(jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSolar2LunarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfLunarMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSolar2LunarLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelMonth)
                                    .addComponent(tfSolarMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelSolar2LunarLayout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSolarYear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnConvertSolar2Lunar)
                        .addGroup(jPanelSolar2LunarLayout.createSequentialGroup()
                            .addGroup(jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfLunarYear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelYear))
                            .addGap(57, 57, 57)
                            .addGroup(jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelLeap)
                                .addComponent(tfLeap, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanelSolar2LunarLayout.setVerticalGroup(
            jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSolar2LunarLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMonth)
                    .addComponent(jLabelDay)
                    .addComponent(jLabelYear)
                    .addComponent(jLabelLeap))
                .addGap(34, 34, 34)
                .addGroup(jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSolarDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSolar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSolarMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSolarYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfLunarDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfLunarMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfLunarYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfLeap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelLunar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanelSolar2LunarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvertSolar2Lunar)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanelMain.add(jPanelSolar2Lunar, "card2");

        jPanelBg.add(jPanelMain);
        jPanelMain.setBounds(0, 110, 680, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBg, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBg, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSolar2LunarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolar2LunarActionPerformed
        jPanelMain.removeAll();
        jPanelMain.add(jPanelSolar2Lunar);
        jPanelMain.repaint();
        jPanelMain.validate();
    }//GEN-LAST:event_btnSolar2LunarActionPerformed

    private void btnLunar2SolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLunar2SolarActionPerformed
        jPanelMain.removeAll();
        jPanelMain.add(jPanelLunar2Solar);
        jPanelMain.repaint();
        jPanelMain.validate();
    }//GEN-LAST:event_btnLunar2SolarActionPerformed

    private void btnConvertLunar2SolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertLunar2SolarActionPerformed
        try {
            if (tfLunarDay1.getText().length() == 0 || tfLunarMonth1.getText().length() == 0 || tfLunarYear1.getText().length() == 0 || tfLeap1.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Chưa nhập dữ liệu !", null, JOptionPane.ERROR_MESSAGE);
                tfSolarDay1.setText(null);
                tfSolarMonth1.setText(null);
                tfSolarYear1.setText(null);
            } else if (checkData.checkFormatLunar(Integer.parseInt(tfLunarDay1.getText()), Integer.parseInt(tfLunarMonth1.getText()), Integer.parseInt(tfLunarYear1.getText()), Integer.parseInt(tfLeap1.getText()))) {
                JOptionPane.showMessageDialog(null, "Định dạng sai !", null, JOptionPane.ERROR_MESSAGE);
                tfSolarDay1.setText(null);
                tfSolarMonth1.setText(null);
                tfSolarYear1.setText(null);
            } else {
                int a[] = algorithmCalendar.convertLunar2Solar(Integer.parseInt(tfLunarDay1.getText()), Integer.parseInt(tfLunarMonth1.getText()), Integer.parseInt(tfLunarYear1.getText()), Integer.parseInt(tfLeap1.getText()));
                tfSolarDay1.setText(String.valueOf(a[0]));
                tfSolarMonth1.setText(String.valueOf(a[1]));
                tfSolarYear1.setText(String.valueOf(a[2]));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Không cho phép nhập ký tự đặc biệt !", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConvertLunar2SolarActionPerformed

    private void btnConvertSolar2LunarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertSolar2LunarActionPerformed
        try {
            if (this.tfSolarDay.getText().length() == 0 || this.tfSolarMonth.getText().length() == 0 || this.tfSolarYear.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Chưa nhập dữ liệu !", null, JOptionPane.ERROR_MESSAGE);
                tfLunarDay.setText(null);
                tfLunarMonth.setText(null);
                tfLunarYear.setText(null);
                tfLeap.setText(null);
            } else if (checkData.checkFormatSolar(Integer.parseInt(tfSolarDay.getText()), Integer.parseInt(tfSolarMonth.getText()), Integer.parseInt(tfSolarYear.getText()))) {
                JOptionPane.showMessageDialog(null, "Định dạng sai !", null, JOptionPane.ERROR_MESSAGE);
                tfLunarDay.setText(null);
                tfLunarMonth.setText(null);
                tfLunarYear.setText(null);
                tfLeap.setText(null);

            } else {
                int a[] = algorithmCalendar.convertSolar2Lunar(Integer.parseInt(tfSolarDay.getText()), Integer.parseInt(tfSolarMonth.getText()), Integer.parseInt(tfSolarYear.getText()));
                tfLunarDay.setText(String.valueOf(a[0]));
                tfLunarMonth.setText(String.valueOf(a[1]));
                tfLunarYear.setText(String.valueOf(a[2]));
                if (a[3] == 0) {
                    tfLeap.setText("Không");
                } else {
                    tfLeap.setText("Có");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Không cho phép nhập ký tự đặc biệt !", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConvertSolar2LunarActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
                tfLunarDay1.setText(null);
                tfLunarMonth1.setText(null);
                tfLunarYear1.setText(null);
                tfLeap1.setText(null);
                tfSolarDay1.setText(null);
                tfSolarMonth1.setText(null);
                tfSolarYear1.setText(null);              
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
                tfLunarDay.setText(null);
                tfLunarMonth.setText(null);
                tfLunarYear.setText(null);
                tfLeap.setText(null);
                tfSolarDay.setText(null);
                tfSolarMonth.setText(null);
                tfSolarYear.setText(null);         
    }//GEN-LAST:event_jButtonClearActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConvertLunar2Solar;
    private javax.swing.JButton btnConvertSolar2Lunar;
    private javax.swing.JButton btnLunar2Solar;
    private javax.swing.JButton btnSolar2Lunar;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JLabel jLabeLNote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBg;
    private javax.swing.JLabel jLabelDay;
    private javax.swing.JLabel jLabelDay1;
    private javax.swing.JLabel jLabelLeap;
    private javax.swing.JLabel jLabelLeap1;
    private javax.swing.JLabel jLabelLunar;
    private javax.swing.JLabel jLabelLunar1;
    private javax.swing.JLabel jLabelMonth;
    private javax.swing.JLabel jLabelMonth1;
    private javax.swing.JLabel jLabelSolar;
    private javax.swing.JLabel jLabelSolar1;
    private javax.swing.JLabel jLabelYear;
    private javax.swing.JLabel jLabelYear1;
    private javax.swing.JPanel jPanelBg;
    private javax.swing.JPanel jPanelLunar2Solar;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelSolar2Lunar;
    private javax.swing.JPanel jPanelWelcome;
    private javax.swing.JTextField tfLeap;
    private javax.swing.JTextField tfLeap1;
    private javax.swing.JTextField tfLunarDay;
    private javax.swing.JTextField tfLunarDay1;
    private javax.swing.JTextField tfLunarMonth;
    private javax.swing.JTextField tfLunarMonth1;
    private javax.swing.JTextField tfLunarYear;
    private javax.swing.JTextField tfLunarYear1;
    private javax.swing.JTextField tfSolarDay;
    private javax.swing.JTextField tfSolarDay1;
    private javax.swing.JTextField tfSolarMonth;
    private javax.swing.JTextField tfSolarMonth1;
    private javax.swing.JTextField tfSolarYear;
    private javax.swing.JTextField tfSolarYear1;
    // End of variables declaration//GEN-END:variables
}
