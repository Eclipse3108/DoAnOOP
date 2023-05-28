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

public class UserManagement extends JFrame {
    private JTable table;
    private JScrollPane scrollPane;
    private JButton btnAddUser, btnDeleteUser, btnViewUser;
    private JLabel lblUserId, lblUserName, lblPosition;
    private JTextField txtUserId, txtUserName;
    private JComboBox<String> cmbPosition;

    public UserManagement() {
        setTitle("Quản lý người dùng");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Tạo bảng hiển thị danh sách người dùng
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
        lblUserId = new JLabel("ID người dùng:");
        inputPanel.add(lblUserId, gbc);

        gbc.gridx++;
        txtUserId = new JTextField(10);
        inputPanel.add(txtUserId, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        lblUserName = new JLabel("Tên người dùng:");
        inputPanel.add(lblUserName, gbc);

        gbc.gridx++;
        txtUserName = new JTextField(10);
        inputPanel.add(txtUserName, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        lblPosition = new JLabel("Chức vụ:");
        inputPanel.add(lblPosition, gbc);

        gbc.gridx++;
        cmbPosition = new JComboBox<>();
        cmbPosition.addItem("Chức vụ 1");
        cmbPosition.addItem("Chức vụ 2");
        cmbPosition.addItem("Chức vụ 3");
        inputPanel.add(cmbPosition, gbc);

        // Tạo nút chức năng
        gbc.gridx = 0;
        gbc.gridy++;
        btnAddUser = new JButton("Thêm người dùng");
        inputPanel.add(btnAddUser, gbc);

        gbc.gridx++;
        btnDeleteUser = new JButton("Xóa người dùng");
        inputPanel.add(btnDeleteUser, gbc);

        gbc.gridx++;
        btnViewUser = new JButton("Xem người dùng");
        inputPanel.add(btnViewUser, gbc);

        add(panel);

        btnAddUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userId = txtUserId.getText();
                String userName = txtUserName.getText();
                String position = cmbPosition.getSelectedItem().toString();

                // Thực hiện các xử lý cần thiết để thêm người dùng
                // ...

                // Hiển thị thông báo thành công
                JOptionPane.showMessageDialog(UserManagement.this, "Thêm người dùng thành công");
            }
        });

        btnDeleteUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Thực hiện các xử lý cần thiết để xóa người dùng
                // ...

                // Hiển thị thông báo thành công
                JOptionPane.showMessageDialog(UserManagement.this, "Xóa người dùng thành công");
            }
        });

        btnViewUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy thông tin người dùng đã thêm vào từ trường nhập liệu
                String userId = txtUserId.getText();
                String userName = txtUserName.getText();
                String position = cmbPosition.getSelectedItem().toString();

                // Hiển thị thông tin người dùng đã thêm
                String message = "Thông tin người dùng:\n";
                message += "ID: " + userId + "\n";
                message += "Tên: " + userName + "\n";
                message += "Chức vụ: " + position;

                JOptionPane.showMessageDialog(UserManagement.this, message);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UserManagement userManagement = new UserManagement();
                userManagement.setVisible(true);
            }
        });
    }
}
