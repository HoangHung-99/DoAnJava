/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;

/**
 *
 * @author nnqua
 */
public class AdminForm extends javax.swing.JFrame {

    private DefaultListModel model = new DefaultListModel();

    public AdminForm() {
        initComponents();
        liveDate();
        liveTime();
    }

    //Live Date
    public void liveDate() {
        Date d = new Date();
        SimpleDateFormat sdf_date = new SimpleDateFormat("dd/MM/yyyy");
        String dd = sdf_date.format(d);
        lbl_date.setText(dd);
    }

    //Live Time
    Timer time;
    SimpleDateFormat sdf_time;

    public void liveTime() {
        time = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //To change body of generated methods, choose Tools | Templates.
                //throw new UnsupportedOperationException("Not supported yet."); 
                sdf_time = new SimpleDateFormat("HH:mm:ss");
                Date dt = new Date();
                String tt = sdf_time.format(dt);
                lbl_time.setText(tt);
            }
        });
        time.start();
    }

    private void addCafeToList() {
        if (rb_Cafe.isSelected()) {
            if (buttonGroupCafe.getSelection() != null) {
                String s = "Cafe";
                if (chb_Sua.isSelected()) {
                    s += " Sửa";
                }
                if (chb_Phin.isSelected()) {
                    s += " Phin";
                }
                if (chb_Bacxiu.isSelected()) {
                    s += " Bạc Xỉu";
                }
                if (chb_Latte.isSelected()) {
                    s += " Latte";
                }
                if (chb_Espresso.isSelected()) {
                    s += " Espresso";
                }
                if (chb_Cappucino.isSelected()) {
                    s += " Cappuchino";
                }
                if (chb_Mocha.isSelected()) {
                    s += " Mocha";
                }
                ListOrder.setModel(model);
                model.addElement(s);
                buttonGroupCafe.clearSelection();
            } else {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn đồ uống");
            }
        }
    }

    public void updateChange() {
        if (ButtonGroupDrink.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Hãy chọn loại đồ uống bạn muốn !");
        } else {
            addCafeToList();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroupDrink = new javax.swing.ButtonGroup();
        buttonGroupCafe = new javax.swing.ButtonGroup();
        buttonGroupTequila = new javax.swing.ButtonGroup();
        buttonGroupMojito = new javax.swing.ButtonGroup();
        buttonGroupSinhTo = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lbl_Latte = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lbl_Cappucino = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_CafePhin = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_NuocEp = new javax.swing.JLabel();
        lbl_CafeSua = new javax.swing.JLabel();
        lbl_Tequila = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbl_Espresso = new javax.swing.JLabel();
        lbl_Cocktail = new javax.swing.JLabel();
        lbl_BacXiu = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_Mojito = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbl_Sinhto = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        rb_Tequila = new javax.swing.JRadioButton();
        rb_Mojito = new javax.swing.JRadioButton();
        rb_Nuocepsinhto = new javax.swing.JRadioButton();
        rb_Cafe = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        chb_Sunrise = new javax.swing.JCheckBox();
        chb_Margarita = new javax.swing.JCheckBox();
        chb_Paloma = new javax.swing.JCheckBox();
        chb_BraveBull = new javax.swing.JCheckBox();
        chb_Acapulco = new javax.swing.JCheckBox();
        chb_Blue = new javax.swing.JCheckBox();
        chb_PhucBonTu = new javax.swing.JCheckBox();
        chb_Vietquat = new javax.swing.JCheckBox();
        chb_Dao = new javax.swing.JCheckBox();
        chb_Kiwi = new javax.swing.JCheckBox();
        chb_Bo = new javax.swing.JCheckBox();
        chb_Cam = new javax.swing.JCheckBox();
        chb_Nho = new javax.swing.JCheckBox();
        chb_Duahau = new javax.swing.JCheckBox();
        chb_Dua = new javax.swing.JCheckBox();
        chb_Sua = new javax.swing.JCheckBox();
        chb_Phin = new javax.swing.JCheckBox();
        chb_Bacxiu = new javax.swing.JCheckBox();
        chb_Latte = new javax.swing.JCheckBox();
        chb_Espresso = new javax.swing.JCheckBox();
        chb_Cappucino = new javax.swing.JCheckBox();
        chb_Mocha = new javax.swing.JCheckBox();
        chb_Ole = new javax.swing.JCheckBox();
        chb_Xoai = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        chb_Kem = new javax.swing.JCheckBox();
        chb_Suadac = new javax.swing.JCheckBox();
        chb_Thachraucau = new javax.swing.JCheckBox();
        chb_Matong = new javax.swing.JCheckBox();
        chb_Dautay = new javax.swing.JCheckBox();
        chb_Hatchia = new javax.swing.JCheckBox();
        chb_BanhFlan = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        chb_Sting = new javax.swing.JCheckBox();
        chb_Coca = new javax.swing.JCheckBox();
        chb_Pepsi = new javax.swing.JCheckBox();
        chb_7Up = new javax.swing.JCheckBox();
        chb_Twister = new javax.swing.JCheckBox();
        chb_Fanta = new javax.swing.JCheckBox();
        chb_Mirinda = new javax.swing.JCheckBox();
        chb_Redbull = new javax.swing.JCheckBox();
        chb_Wakeup = new javax.swing.JCheckBox();
        chb_Warrior = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListOrder = new javax.swing.JList<>();
        btnConfirm = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Menu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lbl_Latte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/latte.jpg"))); // NOI18N
        lbl_Latte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_LatteMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Cappucino");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Cà phê sữa");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setText("Nước ép hoa quả");

        lbl_Cappucino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cappucino.jpg"))); // NOI18N
        lbl_Cappucino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CappucinoMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Bạc xỉu");

        lbl_CafePhin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cafephin.jpg"))); // NOI18N
        lbl_CafePhin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CafePhinMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("Sinh tố trái cây");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Cà phê phin");

        lbl_NuocEp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nuocep.jpg"))); // NOI18N
        lbl_NuocEp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_NuocEpMouseClicked(evt);
            }
        });

        lbl_CafeSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cafesua.jpg"))); // NOI18N
        lbl_CafeSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CafeSuaMouseClicked(evt);
            }
        });

        lbl_Tequila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tequila.jpg"))); // NOI18N
        lbl_Tequila.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_TequilaMouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setText("Mojito");

        lbl_Espresso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/espresso.jpg"))); // NOI18N
        lbl_Espresso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_EspressoMouseClicked(evt);
            }
        });

        lbl_Cocktail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cocktail.jpg"))); // NOI18N
        lbl_Cocktail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CocktailMouseClicked(evt);
            }
        });

        lbl_BacXiu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bacxiu.jpg"))); // NOI18N
        lbl_BacXiu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_BacXiuMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Espresso");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Latte");

        lbl_Mojito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mojito.jpg"))); // NOI18N
        lbl_Mojito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_MojitoMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Cocktail");

        lbl_Sinhto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sinhto.jpg"))); // NOI18N
        lbl_Sinhto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_SinhtoMouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel23.setText("Tequila");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_CafePhin)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_CafeSua)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_BacXiu)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Cappucino)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Latte)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Cocktail)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Espresso)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_NuocEp)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Sinhto)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Mojito)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Tequila))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel3)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel4)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel5)
                        .addGap(152, 152, 152)
                        .addComponent(jLabel18)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel19)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel20)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel21)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel22)
                        .addGap(148, 148, 148)
                        .addComponent(jLabel23)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_Tequila)
                    .addComponent(lbl_Mojito)
                    .addComponent(lbl_NuocEp)
                    .addComponent(lbl_Sinhto)
                    .addComponent(lbl_Espresso)
                    .addComponent(lbl_Latte)
                    .addComponent(lbl_Cocktail)
                    .addComponent(lbl_Cappucino)
                    .addComponent(lbl_CafeSua)
                    .addComponent(lbl_BacXiu)
                    .addComponent(lbl_CafePhin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Menu tự chọn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nước", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        ButtonGroupDrink.add(rb_Tequila);
        rb_Tequila.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_Tequila.setText("Tequila");
        rb_Tequila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_TequilaActionPerformed(evt);
            }
        });

        ButtonGroupDrink.add(rb_Mojito);
        rb_Mojito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_Mojito.setText("Mojito");
        rb_Mojito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_MojitoActionPerformed(evt);
            }
        });

        ButtonGroupDrink.add(rb_Nuocepsinhto);
        rb_Nuocepsinhto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_Nuocepsinhto.setText("Nước ép/ Sinh tố");
        rb_Nuocepsinhto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_NuocepsinhtoActionPerformed(evt);
            }
        });

        ButtonGroupDrink.add(rb_Cafe);
        rb_Cafe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_Cafe.setText("Cafe");
        rb_Cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_CafeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_Tequila)
                    .addComponent(rb_Mojito)
                    .addComponent(rb_Nuocepsinhto)
                    .addComponent(rb_Cafe))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(rb_Cafe)
                .addGap(68, 68, 68)
                .addComponent(rb_Tequila)
                .addGap(74, 74, 74)
                .addComponent(rb_Mojito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(rb_Nuocepsinhto)
                .addGap(65, 65, 65))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thành phần tự chọn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        buttonGroupTequila.add(chb_Sunrise);
        chb_Sunrise.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Sunrise.setText("Sunrise");

        buttonGroupTequila.add(chb_Margarita);
        chb_Margarita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Margarita.setText("Margarita");

        buttonGroupTequila.add(chb_Paloma);
        chb_Paloma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Paloma.setText("Paloma");

        buttonGroupTequila.add(chb_BraveBull);
        chb_BraveBull.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_BraveBull.setText("Brave Bull");

        buttonGroupTequila.add(chb_Acapulco);
        chb_Acapulco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Acapulco.setText("Acapulco");

        buttonGroupMojito.add(chb_Blue);
        chb_Blue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Blue.setText("Blue");

        buttonGroupMojito.add(chb_PhucBonTu);
        chb_PhucBonTu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_PhucBonTu.setText("Phúc Bồn Tử");

        buttonGroupMojito.add(chb_Vietquat);
        chb_Vietquat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Vietquat.setText("Việt quất");

        buttonGroupMojito.add(chb_Dao);
        chb_Dao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Dao.setText("Đào");

        buttonGroupMojito.add(chb_Kiwi);
        chb_Kiwi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Kiwi.setText("Kiwi Mint");

        buttonGroupSinhTo.add(chb_Bo);
        chb_Bo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Bo.setText("Bơ");

        buttonGroupSinhTo.add(chb_Cam);
        chb_Cam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Cam.setText("Cam");

        buttonGroupSinhTo.add(chb_Nho);
        chb_Nho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Nho.setText("Nho");

        buttonGroupSinhTo.add(chb_Duahau);
        chb_Duahau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Duahau.setText("Dưa hấu");

        chb_Dua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Dua.setText("Dừa");

        buttonGroupCafe.add(chb_Sua);
        chb_Sua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Sua.setText("Sữa");

        buttonGroupCafe.add(chb_Phin);
        chb_Phin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Phin.setText("Phin");

        buttonGroupCafe.add(chb_Bacxiu);
        chb_Bacxiu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Bacxiu.setText("Bạc xỉu");

        buttonGroupCafe.add(chb_Latte);
        chb_Latte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Latte.setText("Latte");
        chb_Latte.setToolTipText("");

        buttonGroupCafe.add(chb_Espresso);
        chb_Espresso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Espresso.setText("Espresso");

        buttonGroupCafe.add(chb_Cappucino);
        chb_Cappucino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Cappucino.setText("Cappucino");

        buttonGroupCafe.add(chb_Mocha);
        chb_Mocha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Mocha.setText("Mocha");

        buttonGroupTequila.add(chb_Ole);
        chb_Ole.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Ole.setText("Olé");

        chb_Xoai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Xoai.setText("Xoài");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(chb_Mocha)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chb_Sua)
                            .addComponent(chb_Phin)
                            .addComponent(chb_Bacxiu)
                            .addComponent(chb_Latte)
                            .addComponent(chb_Espresso)
                            .addComponent(chb_Cappucino))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(chb_Ole)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chb_Sunrise)
                                    .addComponent(chb_Margarita)
                                    .addComponent(chb_Paloma)
                                    .addComponent(chb_BraveBull)
                                    .addComponent(chb_Acapulco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chb_Blue)
                                    .addComponent(chb_PhucBonTu)
                                    .addComponent(chb_Vietquat)
                                    .addComponent(chb_Dao)
                                    .addComponent(chb_Kiwi))
                                .addGap(35, 35, 35)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chb_Xoai)
                            .addComponent(chb_Bo)
                            .addComponent(chb_Cam)
                            .addComponent(chb_Nho)
                            .addComponent(chb_Duahau)
                            .addComponent(chb_Dua))
                        .addGap(44, 44, 44))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(chb_Sua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chb_Phin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chb_Bacxiu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chb_Latte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chb_Espresso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chb_Cappucino))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(chb_Sunrise)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chb_Margarita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chb_Paloma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chb_BraveBull)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chb_Acapulco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chb_Ole))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(chb_Bo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chb_Cam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chb_Nho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chb_Duahau)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chb_Dua))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(chb_Blue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chb_PhucBonTu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chb_Vietquat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chb_Dao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chb_Kiwi)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chb_Xoai)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chb_Mocha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Topping", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        chb_Kem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Kem.setText("Kem");

        chb_Suadac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Suadac.setText("Sữa đặc");

        chb_Thachraucau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Thachraucau.setText("Thạch rau câu");

        chb_Matong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Matong.setText("Mật ong");

        chb_Dautay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Dautay.setText("Dâu tây");

        chb_Hatchia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Hatchia.setText("Hạt chia");

        chb_BanhFlan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_BanhFlan.setText("Bánh flan");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chb_Kem)
                            .addComponent(chb_Suadac)
                            .addComponent(chb_Thachraucau)
                            .addComponent(chb_Matong))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chb_Hatchia)
                            .addComponent(chb_BanhFlan))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(chb_Dautay)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_Kem)
                    .addComponent(chb_Hatchia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_Suadac)
                    .addComponent(chb_BanhFlan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chb_Dautay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chb_Thachraucau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chb_Matong)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nước ngọt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        chb_Sting.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Sting.setText("Sting");

        chb_Coca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Coca.setText("Coca cola");

        chb_Pepsi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Pepsi.setText("Pepsi");

        chb_7Up.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_7Up.setText("7 Up");

        chb_Twister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Twister.setText("Twister");

        chb_Fanta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Fanta.setText("Fanta");

        chb_Mirinda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Mirinda.setText("Mirinda");

        chb_Redbull.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Redbull.setText("Red Bull");

        chb_Wakeup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Wakeup.setText("Wake up 247");

        chb_Warrior.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_Warrior.setText("Warrior");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chb_Coca)
                    .addComponent(chb_7Up)
                    .addComponent(chb_Pepsi)
                    .addComponent(chb_Sting)
                    .addComponent(chb_Twister))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chb_Fanta)
                    .addComponent(chb_Mirinda)
                    .addComponent(chb_Redbull)
                    .addComponent(chb_Wakeup)
                    .addComponent(chb_Warrior))
                .addGap(16, 16, 16))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_Coca)
                    .addComponent(chb_Fanta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_Pepsi)
                    .addComponent(chb_Mirinda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_Sting)
                    .addComponent(chb_Redbull))
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_7Up)
                    .addComponent(chb_Wakeup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_Twister)
                    .addComponent(chb_Warrior))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        ListOrder.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Các món đã chọn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jScrollPane3.setViewportView(ListOrder);

        btnConfirm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConfirm.setText("Xác nhận");

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Số lượng:");

        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmount.setText("5");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Tổng giá:");

        txtTotalPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalPrice.setText("135000 đ");

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setText("Xóa");

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setText("Làm mới");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Date: ");

        lbl_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_date.setText("0");

        lbl_time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_time.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnReset)
                                .addGap(81, 81, 81)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addGap(117, 117, 117))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_CafePhinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CafePhinMouseClicked

        rb_Cafe.setSelected(true);
        chb_Phin.setSelected(true);
    }//GEN-LAST:event_lbl_CafePhinMouseClicked

    private void lbl_CafeSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CafeSuaMouseClicked

        rb_Cafe.setSelected(true);
        chb_Sua.setSelected(true);
    }//GEN-LAST:event_lbl_CafeSuaMouseClicked

    private void lbl_BacXiuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_BacXiuMouseClicked
        rb_Cafe.setSelected(true);
        chb_Bacxiu.setSelected(true);
    }//GEN-LAST:event_lbl_BacXiuMouseClicked

    private void lbl_CappucinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CappucinoMouseClicked
        rb_Cafe.setSelected(true);
        chb_Cappucino.setSelected(true);
    }//GEN-LAST:event_lbl_CappucinoMouseClicked

    private void lbl_LatteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_LatteMouseClicked
        rb_Cafe.setSelected(true);
        chb_Latte.setSelected(true);
    }//GEN-LAST:event_lbl_LatteMouseClicked

    private void lbl_CocktailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CocktailMouseClicked
        rb_Tequila.setSelected(true);
    }//GEN-LAST:event_lbl_CocktailMouseClicked

    private void lbl_EspressoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_EspressoMouseClicked
        rb_Cafe.setSelected(true);
        chb_Espresso.setSelected(true);
    }//GEN-LAST:event_lbl_EspressoMouseClicked

    private void lbl_NuocEpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_NuocEpMouseClicked
        rb_Nuocepsinhto.setSelected(true);

    }//GEN-LAST:event_lbl_NuocEpMouseClicked

    private void lbl_SinhtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SinhtoMouseClicked
        rb_Nuocepsinhto.setSelected(true);
    }//GEN-LAST:event_lbl_SinhtoMouseClicked

    private void lbl_TequilaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TequilaMouseClicked
        rb_Tequila.setEnabled(true);
    }//GEN-LAST:event_lbl_TequilaMouseClicked

    private void lbl_MojitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_MojitoMouseClicked
        rb_Mojito.setEnabled(true);
    }//GEN-LAST:event_lbl_MojitoMouseClicked

    private void rb_CafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_CafeActionPerformed
        if (rb_Cafe.isSelected()) {
            buttonGroupTequila.clearSelection();
            buttonGroupMojito.clearSelection();
            buttonGroupSinhTo.clearSelection();
            //Phần Cafe -> mở
            chb_Sua.setEnabled(true);
            chb_Phin.setEnabled(true);
            chb_Bacxiu.setEnabled(true);
            chb_Latte.setEnabled(true);
            chb_Espresso.setEnabled(true);
            chb_Cappucino.setEnabled(true);;
            chb_Mocha.setEnabled(true);

            //Phần Tequila -> ẩn
            chb_Sunrise.setEnabled(false);
            chb_Margarita.setEnabled(false);
            chb_Paloma.setEnabled(false);
            chb_BraveBull.setEnabled(false);
            chb_Acapulco.setEnabled(false);
            chb_Ole.setEnabled(false);

            //Phần Mojito -> ẩn
            chb_Blue.setEnabled(false);
            chb_PhucBonTu.setEnabled(false);
            chb_Vietquat.setEnabled(false);
            chb_Dao.setEnabled(false);
            chb_Kiwi.setEnabled(false);

            //Phần Nước ép/sinh tố -> ẩn
            chb_Bo.setEnabled(false);
            chb_Cam.setEnabled(false);
            chb_Nho.setEnabled(false);
            chb_Duahau.setEnabled(false);
            chb_Dua.setEnabled(false);
            chb_Xoai.setEnabled(false);

            //Khóa phần Topping
            chb_Kem.setEnabled(false);
            chb_Suadac.setEnabled(false);
            chb_Dautay.setEnabled(false);
            chb_Thachraucau.setEnabled(false);
            chb_Matong.setEnabled(false);
            chb_Hatchia.setEnabled(false);
            chb_BanhFlan.setEnabled(false);
        }
    }//GEN-LAST:event_rb_CafeActionPerformed

    private void rb_TequilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_TequilaActionPerformed
        if (rb_Tequila.isSelected()) {
            buttonGroupCafe.clearSelection();
            buttonGroupMojito.clearSelection();
            buttonGroupSinhTo.clearSelection();
            //Phần Cafe -> ẩn
            chb_Sua.setEnabled(false);
            chb_Phin.setEnabled(false);
            chb_Bacxiu.setEnabled(false);
            chb_Latte.setEnabled(false);
            chb_Espresso.setEnabled(false);
            chb_Cappucino.setEnabled(false);;
            chb_Mocha.setEnabled(false);

            //Phần Tequila -> Mở
            chb_Sunrise.setEnabled(true);
            chb_Margarita.setEnabled(true);
            chb_Paloma.setEnabled(true);
            chb_BraveBull.setEnabled(true);
            chb_Acapulco.setEnabled(true);
            chb_Ole.setEnabled(true);

            //Phần Mojito -> ẩn
            chb_Blue.setEnabled(false);
            chb_PhucBonTu.setEnabled(false);
            chb_Vietquat.setEnabled(false);
            chb_Dao.setEnabled(false);
            chb_Kiwi.setEnabled(false);

            //Phần Nước ép/sinh tố -> ẩn
            chb_Bo.setEnabled(false);
            chb_Cam.setEnabled(false);
            chb_Nho.setEnabled(false);
            chb_Duahau.setEnabled(false);
            chb_Dua.setEnabled(false);
            chb_Xoai.setEnabled(false);

            chb_Kem.setEnabled(true);
            chb_Suadac.setEnabled(true);
            chb_Dautay.setEnabled(true);
            chb_Thachraucau.setEnabled(true);
            chb_Matong.setEnabled(true);
            chb_Hatchia.setEnabled(true);
            chb_BanhFlan.setEnabled(true);
        }
    }//GEN-LAST:event_rb_TequilaActionPerformed

    private void rb_MojitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_MojitoActionPerformed
        if (rb_Mojito.isSelected()) {
            //Phần Cafe -> ẩn
            buttonGroupCafe.clearSelection();
            buttonGroupSinhTo.clearSelection();
            buttonGroupTequila.clearSelection();
            chb_Sua.setEnabled(false);
            chb_Phin.setEnabled(false);
            chb_Bacxiu.setEnabled(false);
            chb_Latte.setEnabled(false);
            chb_Espresso.setEnabled(false);
            chb_Cappucino.setEnabled(false);;
            chb_Mocha.setEnabled(false);

            //Phần Tequila -> ẩn
            chb_Sunrise.setEnabled(false);
            chb_Margarita.setEnabled(false);
            chb_Paloma.setEnabled(false);
            chb_BraveBull.setEnabled(false);
            chb_Acapulco.setEnabled(false);
            chb_Ole.setEnabled(false);

            //Phần Mojito -> mở
            chb_Blue.setEnabled(true);
            chb_PhucBonTu.setEnabled(true);
            chb_Vietquat.setEnabled(true);
            chb_Dao.setEnabled(true);
            chb_Kiwi.setEnabled(true);

            //Phần Nước ép/sinh tố -> ẩn
            chb_Bo.setEnabled(false);
            chb_Cam.setEnabled(false);
            chb_Nho.setEnabled(false);
            chb_Duahau.setEnabled(false);
            chb_Dua.setEnabled(false);
            chb_Xoai.setEnabled(false);

            chb_Kem.setEnabled(true);
            chb_Suadac.setEnabled(true);
            chb_Dautay.setEnabled(true);
            chb_Thachraucau.setEnabled(true);
            chb_Matong.setEnabled(true);
            chb_Hatchia.setEnabled(true);
            chb_BanhFlan.setEnabled(true);
        }
    }//GEN-LAST:event_rb_MojitoActionPerformed

    private void rb_NuocepsinhtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_NuocepsinhtoActionPerformed
        if (rb_Nuocepsinhto.isSelected()) {
            buttonGroupCafe.clearSelection();
            buttonGroupMojito.clearSelection();
            buttonGroupTequila.clearSelection();
            //Phần Cafe -> ẩn
            chb_Sua.setEnabled(false);
            chb_Phin.setEnabled(false);
            chb_Bacxiu.setEnabled(false);
            chb_Latte.setEnabled(false);
            chb_Espresso.setEnabled(false);
            chb_Cappucino.setEnabled(false);;
            chb_Mocha.setEnabled(false);

            //Phần Tequila -> ẩn
            chb_Sunrise.setEnabled(false);
            chb_Margarita.setEnabled(false);
            chb_Paloma.setEnabled(false);
            chb_BraveBull.setEnabled(false);
            chb_Acapulco.setEnabled(false);
            chb_Ole.setEnabled(false);

            //Phần Mojito -> ẩn
            chb_Blue.setEnabled(false);
            chb_PhucBonTu.setEnabled(false);
            chb_Vietquat.setEnabled(false);
            chb_Dao.setEnabled(false);
            chb_Kiwi.setEnabled(false);

            //Phần Nước ép/sinh tố -> mở
            chb_Bo.setEnabled(true);
            chb_Cam.setEnabled(true);
            chb_Nho.setEnabled(true);
            chb_Duahau.setEnabled(true);
            chb_Dua.setEnabled(true);
            chb_Xoai.setEnabled(true);

            chb_Kem.setEnabled(true);
            chb_Suadac.setEnabled(true);
            chb_Dautay.setEnabled(true);
            chb_Thachraucau.setEnabled(true);
            chb_Matong.setEnabled(true);
            chb_Hatchia.setEnabled(true);
            chb_BanhFlan.setEnabled(true);
        }
    }//GEN-LAST:event_rb_NuocepsinhtoActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        updateChange();
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroupDrink;
    private javax.swing.JList<String> ListOrder;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.ButtonGroup buttonGroupCafe;
    private javax.swing.ButtonGroup buttonGroupMojito;
    private javax.swing.ButtonGroup buttonGroupSinhTo;
    private javax.swing.ButtonGroup buttonGroupTequila;
    private javax.swing.JCheckBox chb_7Up;
    private javax.swing.JCheckBox chb_Acapulco;
    private javax.swing.JCheckBox chb_Bacxiu;
    private javax.swing.JCheckBox chb_BanhFlan;
    private javax.swing.JCheckBox chb_Blue;
    private javax.swing.JCheckBox chb_Bo;
    private javax.swing.JCheckBox chb_BraveBull;
    private javax.swing.JCheckBox chb_Cam;
    private javax.swing.JCheckBox chb_Cappucino;
    private javax.swing.JCheckBox chb_Coca;
    private javax.swing.JCheckBox chb_Dao;
    private javax.swing.JCheckBox chb_Dautay;
    private javax.swing.JCheckBox chb_Dua;
    private javax.swing.JCheckBox chb_Duahau;
    private javax.swing.JCheckBox chb_Espresso;
    private javax.swing.JCheckBox chb_Fanta;
    private javax.swing.JCheckBox chb_Hatchia;
    private javax.swing.JCheckBox chb_Kem;
    private javax.swing.JCheckBox chb_Kiwi;
    private javax.swing.JCheckBox chb_Latte;
    private javax.swing.JCheckBox chb_Margarita;
    private javax.swing.JCheckBox chb_Matong;
    private javax.swing.JCheckBox chb_Mirinda;
    private javax.swing.JCheckBox chb_Mocha;
    private javax.swing.JCheckBox chb_Nho;
    private javax.swing.JCheckBox chb_Ole;
    private javax.swing.JCheckBox chb_Paloma;
    private javax.swing.JCheckBox chb_Pepsi;
    private javax.swing.JCheckBox chb_Phin;
    private javax.swing.JCheckBox chb_PhucBonTu;
    private javax.swing.JCheckBox chb_Redbull;
    private javax.swing.JCheckBox chb_Sting;
    private javax.swing.JCheckBox chb_Sua;
    private javax.swing.JCheckBox chb_Suadac;
    private javax.swing.JCheckBox chb_Sunrise;
    private javax.swing.JCheckBox chb_Thachraucau;
    private javax.swing.JCheckBox chb_Twister;
    private javax.swing.JCheckBox chb_Vietquat;
    private javax.swing.JCheckBox chb_Wakeup;
    private javax.swing.JCheckBox chb_Warrior;
    private javax.swing.JCheckBox chb_Xoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_BacXiu;
    private javax.swing.JLabel lbl_CafePhin;
    private javax.swing.JLabel lbl_CafeSua;
    private javax.swing.JLabel lbl_Cappucino;
    private javax.swing.JLabel lbl_Cocktail;
    private javax.swing.JLabel lbl_Espresso;
    private javax.swing.JLabel lbl_Latte;
    private javax.swing.JLabel lbl_Mojito;
    private javax.swing.JLabel lbl_NuocEp;
    private javax.swing.JLabel lbl_Sinhto;
    private javax.swing.JLabel lbl_Tequila;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JRadioButton rb_Cafe;
    private javax.swing.JRadioButton rb_Mojito;
    private javax.swing.JRadioButton rb_Nuocepsinhto;
    private javax.swing.JRadioButton rb_Tequila;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
