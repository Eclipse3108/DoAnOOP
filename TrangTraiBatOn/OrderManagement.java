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

public class OrderManagement extends JFrame {
    private JTable table;
    private JScrollPane scrollPane;
    private JButton btnAddOrder, btnDeleteOrder, btnViewOrder;
    private JLabel lblOrderId, lblCustomerName, lblProduct;
    private JTextField txtOrderId, txtCustomerName;
    private JComboBox<String> cmbProduct;

    public OrderManagement() {
        setTitle("Quản lý đơn đặt hàng");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Tạo bảng hiển thị danh sách đơn đặt hàng
        table = new JTable();
        scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Tạo panel chứa các thành phần nhập liệu và nút chức năng
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridBagLayout());
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(inputPanel, BorderLayout.SOUTH);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Thêm các nhãn và trường nhập liệu
        lblOrderId = new JLabel("ID đơn đặt hàng:");
        inputPanel.add(lblOrderId, gbc);

        gbc.gridx++;
        txtOrderId = new JTextField(10);
        inputPanel.add(txtOrderId, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        lblCustomerName = new JLabel("Tên khách hàng:");
        inputPanel.add(lblCustomerName, gbc);

        gbc.gridx++;
        txtCustomerName = new JTextField(10);
        inputPanel.add(txtCustomerName, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        lblProduct = new JLabel("Sản phẩm:");
        inputPanel.add(lblProduct, gbc);

        gbc.gridx++;
        cmbProduct = new JComboBox<>();
        cmbProduct.addItem("Sản phẩm 1");
        cmbProduct.addItem("Sản phẩm 2");
        cmbProduct.addItem("Sản phẩm 3");
        inputPanel.add(cmbProduct, gbc);

        // Tạo nút chức năng
        gbc.gridx = 0;
        gbc.gridy++;
        btnAddOrder = new JButton("Thêm đơn đặt hàng");
        inputPanel.add(btnAddOrder, gbc);

        gbc.gridx++;
        btnDeleteOrder = new JButton("Xóa đơn đặt hàng");
        inputPanel.add(btnDeleteOrder, gbc);

        gbc.gridx++;
        btnViewOrder = new JButton("Xem đơn đặt hàng");
        inputPanel.add(btnViewOrder, gbc);

        add(panel);

        btnAddOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String orderId = txtOrderId.getText();
                String customerName = txtCustomerName.getText();
                String product = cmbProduct.getSelectedItem().toString();

                // Thực hiện các xử lý cần thiết để thêm đơn đặt hàng
                // ...

                // Hiển thị thông báo thành công
                JOptionPane.showMessageDialog(OrderManagement.this, "Thêm đơn đặt hàng thành công");
            }
        });

        btnDeleteOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Thực hiện các xử lý cần thiết để xóa đơn đặt hàng
                // ...

                // Hiển thị thông báo thành công
                JOptionPane.showMessageDialog(OrderManagement.this, "Xóa đơn đặt hàng thành công");
            }
        });

        btnViewOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy thông tin đơn đặt hàng đã thêm vào từ trường nhập liệu
                String orderId = txtOrderId.getText();
                String customerName = txtCustomerName.getText();
                String product = cmbProduct.getSelectedItem().toString();

                // Hiển thị thông tin đơn đặt hàng đã thêm
                String message = "Thông tin đơn đặt hàng:\n";
                message += "ID: " + orderId + "\n";
                message += "Khách hàng: " + customerName + "\n";
                message += "Sản phẩm: " + product;

                JOptionPane.showMessageDialog(OrderManagement.this, message);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                OrderManagement orderManagement = new OrderManagement();
                orderManagement.setVisible(true);
            }
        });
    }
}
