/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Order;

/**
 *
 * @author Thinh
 */
public class OrderPrint {

    public String PickedTable;
    public String DescriptionOrder;
    public ArrayList<HashMap> receiptList;
    public Double Sum;
    public DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy ");
    public LocalDateTime now = LocalDateTime.now();
    public JTable tb_HoaDon;
    public JDialog kill_dialog;
    public ArrayList<String> order_list;

    /**
     * Creates new form FramePickTable
     */
    public class OrderPrinting implements Printable {

        public int print(Graphics g, PageFormat pf, int page) {
            if (page > 0) {
                return NO_SUCH_PAGE;
            }
            DescriptionOrder = "";
            
            Graphics2D g2d = (Graphics2D) g;
            g2d.translate(pf.getImageableX(), pf.getImageableY());
            g.drawString("Hoá đơn mua hàng ", 125, 50);
            g.drawString("Ngày: " + dtf.format(now).toString(), 50, 75);
            g.drawString("---------------------------------------------", 50, 100);
            g.drawString("Tên sản phẩm", 50, 125);
            g.drawString("Số lượng", 200, 125);
            g.drawString("Đơn giá", 300, 125);

            for (int i = 0; i < receiptList.size(); i++) {

                HashMap<String, String> receipt = receiptList.get(i);
                g.drawString(receipt.get("Name"), 50, 150 + i * 25);
                g.drawString(receipt.get("SL"), 220, 150 + i * 25);
                g.drawString(receipt.get("Price"), 300, 150 + i * 25);

                DescriptionOrder += receipt.get("Name") + "_" + receipt.get("SL") + "_" + receipt.get("Price") + ",";
            }

            g.drawString("---------------------------------------------", 50, 150 + receiptList.size() * 25);
            g.drawString("Tổng tiền:  " + Sum.toString(), 50, 175 + receiptList.size() * 25);
            return PAGE_EXISTS;
        }
    }

    public OrderPrint(ArrayList<HashMap> receipt, Double Total, JTable tbHoaDon, ArrayList<String> ordered, JTextField total) {
        Sum = Total;
        receiptList = receipt;
        tb_HoaDon = tbHoaDon;
        order_list = ordered;

        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new OrderPrinting());
        if (job.printDialog()) {
            try {
                job.print();

                Order rp = new Order(dtf.format(now), DescriptionOrder, Sum);
                Order.addOrder(rp);
                DefaultTableModel data_table = (DefaultTableModel) tb_HoaDon.getModel();
                for (int i = data_table.getRowCount() - 1; i >= 0; i--) {
                    data_table.removeRow(i);
                }
                receiptList.clear();
                ordered.clear();
                total.setText("");

            } catch (PrinterException pe) {
            }
        }
    }
}
