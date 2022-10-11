
package secondq;

import javax.swing.JOptionPane;

public class CustomerView extends javax.swing.JFrame {

    Queue queue = new Queue();
    Counter Counter1 = new Counter();
    Counter Counter2 = new Counter();
    Counter Counter3 = new Counter();
    Counter Counter4 = new Counter();
    
    public CustomerView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblnowServing = new javax.swing.JLabel();
        lblLastNum = new javax.swing.JLabel();
        takeANumBtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        counter2 = new javax.swing.JLabel();
        number2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        counter1 = new javax.swing.JLabel();
        number1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        counter3 = new javax.swing.JLabel();
        number3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        counter4 = new javax.swing.JLabel();
        number4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        offline6 = new javax.swing.JButton();
        compCurrent6 = new javax.swing.JButton();
        callNext6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        offline2 = new javax.swing.JButton();
        compCurrent2 = new javax.swing.JButton();
        callNext2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        offline3 = new javax.swing.JButton();
        compCurrent3 = new javax.swing.JButton();
        callNext3 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        offline1 = new javax.swing.JButton();
        compCurrent1 = new javax.swing.JButton();
        callNext1 = new javax.swing.JButton();

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("DialogInput", 3, 24)); // NOI18N
        jLabel1.setText("Customer View");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblnowServing.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        lblnowServing.setText("Now Serving : ");

        lblLastNum.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        lblLastNum.setText("Last Number : ");

        takeANumBtn.setFont(new java.awt.Font("Franklin Gothic Medium", 3, 18)); // NOI18N
        takeANumBtn.setText("Take a Number");
        takeANumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeANumBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLastNum)
                    .addComponent(lblnowServing))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(takeANumBtn)
                .addGap(250, 250, 250))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblnowServing)
                .addGap(27, 27, 27)
                .addComponent(lblLastNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(takeANumBtn)
                .addGap(20, 20, 20))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 18)); // NOI18N

        counter2.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        counter2.setText("Counter 2");

        number2.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        number2.setText("0000");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(counter2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(counter2)
                .addGap(50, 50, 50)
                .addComponent(number2)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 18)); // NOI18N

        counter1.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        counter1.setText("Counter 1");

        number1.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        number1.setText("0000");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(counter1))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(counter1)
                .addGap(50, 50, 50)
                .addComponent(number1)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 18)); // NOI18N

        counter3.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        counter3.setText("Counter 3");

        number3.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        number3.setText("0000");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(counter3))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(number3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(counter3)
                .addGap(50, 50, 50)
                .addComponent(number3)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 18)); // NOI18N

        counter4.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        counter4.setText("Counter 4");

        number4.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        number4.setText("0000");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(counter4))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(number4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(counter4)
                .addGap(50, 50, 50)
                .addComponent(number4)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        jLabel9.setText("Counter 4");

        offline6.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        offline6.setText("Go Offline");
        offline6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offline6ActionPerformed(evt);
            }
        });

        compCurrent6.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        compCurrent6.setText("Complete current ");
        compCurrent6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compCurrent6ActionPerformed(evt);
            }
        });

        callNext6.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        callNext6.setText("Call Next");
        callNext6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callNext6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(offline6)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(compCurrent6)
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(callNext6)
                .addGap(65, 65, 65))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addGap(29, 29, 29)
                .addComponent(offline6)
                .addGap(18, 18, 18)
                .addComponent(compCurrent6)
                .addGap(18, 18, 18)
                .addComponent(callNext6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        jLabel3.setText("Counter 2");

        offline2.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        offline2.setText("Go Offline");
        offline2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offline2ActionPerformed(evt);
            }
        });

        compCurrent2.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        compCurrent2.setText("Complete current ");
        compCurrent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compCurrent2ActionPerformed(evt);
            }
        });

        callNext2.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        callNext2.setText("Call Next");
        callNext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callNext2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(offline2)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(compCurrent2)
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(callNext2)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(offline2)
                .addGap(18, 18, 18)
                .addComponent(compCurrent2)
                .addGap(18, 18, 18)
                .addComponent(callNext2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dubai Medium", 3, 24)); // NOI18N
        jLabel2.setText("Counter Management");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        jLabel4.setText("Counter 3");

        offline3.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        offline3.setText("Go Offline");
        offline3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offline3ActionPerformed(evt);
            }
        });

        compCurrent3.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        compCurrent3.setText("Complete current ");
        compCurrent3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compCurrent3ActionPerformed(evt);
            }
        });

        callNext3.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        callNext3.setText("Call Next");
        callNext3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callNext3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(offline3)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(compCurrent3)
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(callNext3)
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(offline3)
                .addGap(18, 18, 18)
                .addComponent(compCurrent3)
                .addGap(18, 18, 18)
                .addComponent(callNext3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        jLabel5.setText("Counter 1");

        offline1.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        offline1.setText("Go Offline");
        offline1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offline1ActionPerformed(evt);
            }
        });

        compCurrent1.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        compCurrent1.setText("Complete current ");
        compCurrent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compCurrent1ActionPerformed(evt);
            }
        });

        callNext1.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        callNext1.setText("Call Next");
        callNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callNext1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(offline1)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(compCurrent1)
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(callNext1)
                .addGap(65, 65, 65))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addComponent(offline1)
                .addGap(18, 18, 18)
                .addComponent(compCurrent1)
                .addGap(18, 18, 18)
                .addComponent(callNext1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(362, 362, 362))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(169, 169, 169))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(366, 366, 366)))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void takeANumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeANumBtnActionPerformed
        queue.setQueue(queue.getNewNumber(), "add");
        System.out.println(queue.getQueueItems());

        lblLastNum.setText("Last number : " + queue.getQueueTail());
        lblnowServing.setText("Now Serving : " + queue.getQueueHead() ); 
    }//GEN-LAST:event_takeANumBtnActionPerformed

    private void callNext6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callNext6ActionPerformed
        if(!queue.getQueueItems().isEmpty() && !"Offline".equals(Counter4.getStatus()))
        {
           number4.setText(queue.getQueueHead());
           queue.removeHead(); 
        }
        else{
            JOptionPane.showMessageDialog(null, "No one in queue or you are offline");
        }
    }//GEN-LAST:event_callNext6ActionPerformed

    private void callNext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callNext2ActionPerformed
        if(!queue.getQueueItems().isEmpty() && !"Offline".equals(Counter2.getStatus()))
        {
           number2.setText(queue.getQueueHead());
           queue.removeHead(); 
        }
        else{
            JOptionPane.showMessageDialog(null, "No one in queue or you are offline");
        }
    }//GEN-LAST:event_callNext2ActionPerformed

    private void callNext3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callNext3ActionPerformed
        if(!queue.getQueueItems().isEmpty()&& !"Offline".equals(Counter3.getStatus()))
        {
           number3.setText(queue.getQueueHead());
           queue.removeHead(); 
        }
        else{
            JOptionPane.showMessageDialog(null, "No one in queue or you are offline");
        }
    }//GEN-LAST:event_callNext3ActionPerformed

    private void offline1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offline1ActionPerformed
        if(Counter1.getStatus().equals("Online"))
        {
            Counter1.setStatus("Offline");
            number1.setText(Counter1.getStatus());
            offline1.setText("Go Online");    
        }
        else{
            Counter1.setStatus("Online");
            number1.setText(Counter1.getStatus());
            offline1.setText("Go Offine");  
        }
        
    }//GEN-LAST:event_offline1ActionPerformed

    private void callNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callNext1ActionPerformed
        if(!queue.getQueueItems().isEmpty() && !"Offline".equals(Counter1.getStatus()))
        {
           number1.setText(queue.getQueueHead());
           queue.removeHead(); 
        }
        else{
            JOptionPane.showMessageDialog(null, "No one in queue or you are offline");
        }
        
    }//GEN-LAST:event_callNext1ActionPerformed

    private void offline2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offline2ActionPerformed
        if(Counter2.getStatus().equals("Online"))
        {
            Counter2.setStatus("Offline");
            number2.setText(Counter2.getStatus());
            offline2.setText("Go Online");    
        }
        else{
            Counter2.setStatus("Online");
            number2.setText(Counter2.getStatus());
            offline2.setText("Go Offine");  
        }
    }//GEN-LAST:event_offline2ActionPerformed

    private void offline3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offline3ActionPerformed
        if(Counter3.getStatus().equals("Online"))
        {
            Counter3.setStatus("Offline");
            number3.setText(Counter3.getStatus());
            offline3.setText("Go Online");    
        }
        else{
            Counter3.setStatus("Online");
            number3.setText(Counter3.getStatus());
            offline3.setText("Go Offine");  
        }
    }//GEN-LAST:event_offline3ActionPerformed

    private void offline6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offline6ActionPerformed
        if(Counter4.getStatus().equals("Online"))
        {
            Counter4.setStatus("Offline");
            number4.setText(Counter4.getStatus());
            offline6.setText("Go Online");    
        }
        else{
            Counter4.setStatus("Online");
            number4.setText(Counter4.getStatus());
            offline6.setText("Go Offine");  
        }
    }//GEN-LAST:event_offline6ActionPerformed

    private void compCurrent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compCurrent2ActionPerformed
        Counter2.setStatus("Online");
        number2.setText(Counter1.getStatus());
    }//GEN-LAST:event_compCurrent2ActionPerformed

    private void compCurrent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compCurrent1ActionPerformed
        Counter1.setStatus("Online");
        number1.setText(Counter1.getStatus());
    }//GEN-LAST:event_compCurrent1ActionPerformed

    private void compCurrent3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compCurrent3ActionPerformed
        Counter3.setStatus("Online");
        number3.setText(Counter1.getStatus());
    }//GEN-LAST:event_compCurrent3ActionPerformed

    private void compCurrent6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compCurrent6ActionPerformed
        Counter4.setStatus("Online");
        number4.setText(Counter1.getStatus());
    }//GEN-LAST:event_compCurrent6ActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton callNext1;
    private javax.swing.JButton callNext2;
    private javax.swing.JButton callNext3;
    private javax.swing.JButton callNext4;
    private javax.swing.JButton callNext5;
    private javax.swing.JButton callNext6;
    private javax.swing.JButton compCurrent1;
    private javax.swing.JButton compCurrent2;
    private javax.swing.JButton compCurrent3;
    private javax.swing.JButton compCurrent4;
    private javax.swing.JButton compCurrent5;
    private javax.swing.JButton compCurrent6;
    private javax.swing.JLabel counter1;
    private javax.swing.JLabel counter2;
    private javax.swing.JLabel counter3;
    private javax.swing.JLabel counter4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblLastNum;
    private javax.swing.JLabel lblnowServing;
    private javax.swing.JLabel number1;
    private javax.swing.JLabel number2;
    private javax.swing.JLabel number3;
    private javax.swing.JLabel number4;
    private javax.swing.JButton offline1;
    private javax.swing.JButton offline2;
    private javax.swing.JButton offline3;
    private javax.swing.JButton offline4;
    private javax.swing.JButton offline5;
    private javax.swing.JButton offline6;
    private javax.swing.JButton takeANumBtn;
    // End of variables declaration//GEN-END:variables
}
