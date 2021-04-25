/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Category;
import model.Product;

/**
 *
 * @author Thinh
 */
public class OrderForm extends javax.swing.JFrame {
    private JButton[] ListButton;
    public Double Sum=0.0;
    public ArrayList<HashMap> ReceiptList;
    public ArrayList<String> ordered;
    /**
     * Creates new form OrderForm
     */
    public OrderForm() {
        initComponents();
        ordered = new ArrayList<String>(); // Lưu sản phẩm đã order
        //List Receipt
        ReceiptList = new ArrayList<HashMap>();
        ArrayList<Category> listOfCategory = Category.getCategory();
        for (int index = 0; index < listOfCategory.size(); index++) {
            Integer cate_id = listOfCategory.get(index).getCateID();
            JPanel temp_Panel = new JPanel();
            ArrayList<Product> arrayproduct = Product.getProductbyCateID(cate_id);
            ListButton = new JButton[arrayproduct.size()];
            Integer rows=1;
            Integer columns = 5;
            Integer count_prod=0;
            //iNITIALIZE ROW OF PRODUCT
            for (int item = 1; item < arrayproduct.size(); item++) {
                if(item%columns==0){
                    rows=rows+1;
                }
            }
            temp_Panel.setLayout(new GridLayout(rows,columns));
            for (int i = 0; i < rows; i++) {
                for(int j=0;j < 5;j++){
                    if(count_prod==arrayproduct.size()){
                        break;
                    }else{
                        Product p;
                        p = new Product();
                        p = arrayproduct.get(count_prod);
                        String name = p.getName();
                        System.out.println(name);
                        System.out.println(count_prod);
                        Double price = p.getPrice();
                        ListButton[count_prod] = new javax.swing.JButton();
                        ListButton[count_prod].setText(p.getName());
                        ListButton[count_prod].setVisible(true);
                        ListButton[count_prod].setPreferredSize(new Dimension(40, 40));
                        ListButton[count_prod].addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e) {
                                HashMap<String, String> data = new HashMap<String, String>();
                                data.put("Name", name);
                                data.put("SL","1");
                                data.put("Price", price.toString());

                                if(!ordered.contains(name)){
                                    ordered.add(name);
                                    ReceiptList.add(data);
                                }else{
                                    for(int i =0; i < ReceiptList.size(); i++) {
                                    HashMap<String, String> receipt_item = ReceiptList.get(i);
                                    if (data.get("Name").equals(receipt_item.get("Name"))) {
                                         Integer ex_SL = Integer.valueOf(receipt_item.get("SL"));
                                         ex_SL = ex_SL+1;
                                         receipt_item.replace("SL", ex_SL.toString());
                                    }   
                                    }
                                }
                                DefaultTableModel tbHoaDon = (DefaultTableModel) tb_HoaDon.getModel();
                                //Remove rows one by one from the end of the table
                                for (int i = tbHoaDon.getRowCount() - 1; i >= 0; i--) {
                                    tbHoaDon.removeRow(i);
                                }
                                for(int i =0; i < ReceiptList.size(); i++) {
                                    HashMap<String, String> receipt = ReceiptList.get(i);
                                    Object[] tb_row = {receipt.get("Name"),Integer.parseInt(receipt.get("SL")) ,Double.parseDouble(receipt.get("Price"))};
                                    tbHoaDon.addRow(tb_row);
                                }


                                Sum=Sum+price;
                                txtTongTien.setText(Sum.toString());
                            }
                        });
                        temp_Panel.add(ListButton[count_prod],i,j);
                        count_prod++;
                }
                
            }
            tabPanel.addTab(listOfCategory.get(index).getName(), temp_Panel);
            
        }
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

        tabPanel = new javax.swing.JTabbedPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_HoaDon = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        btnThanhToan = new javax.swing.JButton();
        btnChonXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang order thức uống");

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        tb_HoaDon.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tb_HoaDon);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        jSplitPane1.setTopComponent(jPanel1);

        jLabel1.setText("Tổng tiền");

        btnThanhToan.setText("Thanh toán");

        btnChonXoa.setText("Chọn xóa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtTongTien))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChonXoa)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnChonXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnThanhToan)
                .addGap(16, 16, 16))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabPanel)
                    .addComponent(jSplitPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChonXoa;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JTable tb_HoaDon;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
