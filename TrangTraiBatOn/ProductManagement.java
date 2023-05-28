/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrangTraiBatOn;

/**
 *
 * @author ADMIN
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ProductManagement extends JFrame {
    private List<Product> productList;

    public ProductManagement() {
        productList = new ArrayList<>();

        setTitle("Quản lý sản phẩm");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JButton btnAddProduct = new JButton("Thêm sản phẩm");
        JButton btnRemoveProduct = new JButton("Xóa sản phẩm");
        JButton btnShowProducts = new JButton("Hiển thị sản phẩm");

        panel.add(btnAddProduct);
        panel.add(btnRemoveProduct);
        panel.add(btnShowProducts);

        add(panel);

        btnAddProduct.addActionListener((ActionEvent e) -> {
            String productName = JOptionPane.showInputDialog("Nhập tên sản phẩm:");
            String productType = JOptionPane.showInputDialog("Nhập loại sản phẩm:");
            double price = Double.parseDouble(JOptionPane.showInputDialog("Nhập giá:"));
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Nhập số lượng:"));
            if (!productName.isEmpty()) {
                Product product = new Product(productName, productType, price, quantity);
                addProduct(product);
                JOptionPane.showMessageDialog(null, "Đã thêm sản phẩm mới: " + productName);
            }
        });

        btnRemoveProduct.addActionListener((ActionEvent e) -> {
            String productToRemove = JOptionPane.showInputDialog("Nhập tên sản phẩm cần xóa:");
            if (!productToRemove.isEmpty()) {
                removeProduct(productToRemove);
                JOptionPane.showMessageDialog(null, "Đã xóa sản phẩm: " + productToRemove);
            }
        });

        btnShowProducts.addActionListener((ActionEvent e) -> {
            StringBuilder productInfo = new StringBuilder("Danh sách sản phẩm:\n");
            for (Product product : productList) {
                productInfo.append("- Tên: ").append(product.getName())
                        .append(", Loại: ").append(product.getType())
                        .append(", Giá: ").append(product.getPrice())
                        .append(", Số lượng: ").append(product.getQuantity())
                        .append("\n");
            }
            JOptionPane.showMessageDialog(null, productInfo.toString());
        });
    }

    private void addProduct(Product product) {
        productList.add(product);
    }

    private void removeProduct(String productName) {
        Product productToRemove = null;
        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            productList.remove(productToRemove);
        }
    }
}
