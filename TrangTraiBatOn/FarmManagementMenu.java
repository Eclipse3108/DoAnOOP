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

public class FarmManagementMenu extends JFrame {
    public FarmManagementMenu() {
        setTitle("Quản lý trang trại");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));

        // Thêm logo vào menu
        ImageIcon logo = new ImageIcon("\"C:\\Users\\ADMIN\\Downloads\\6284a5a2d5572.png\".png");
        JLabel lblLogo = new JLabel(logo);
        panel.add(lblLogo);

        JButton btnManagePets = new JButton("Quản lý vật nuôi");
        JButton btnManageProducts = new JButton("Quản lý sản phẩm");
        JButton btnManageOrders = new JButton("Quản lý đơn đặt hàng");
        JButton btnManageUsers = new JButton("Quản lý người dùng");
        JButton btnExit = new JButton("Thoát ứng dụng");

        panel.add(btnManagePets);
        panel.add(btnManageProducts);
        panel.add(btnManageOrders);
        panel.add(btnManageUsers);
        panel.add(btnExit);

        add(panel);

        btnManagePets.addActionListener((ActionEvent e) -> {
            PetManagement petManagement = new PetManagement();
            petManagement.setVisible(true);
        });

        btnManageProducts.addActionListener((ActionEvent e) -> {
            ProductManagement productManagement = new ProductManagement();
            productManagement.setVisible(true);
        });

        btnManageOrders.addActionListener((ActionEvent e) -> {
            OrderManagement orderManagement = new OrderManagement();
            orderManagement.setVisible(true);
        });

        btnManageUsers.addActionListener((ActionEvent e) -> {
            UserManagement userManagement = new UserManagement();
            userManagement.setVisible(true);
        });

        btnExit.addActionListener((ActionEvent e) -> {
            ExitApplicationMenu.showExitConfirmationDialog();
        });
    }
}
