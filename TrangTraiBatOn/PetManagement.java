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

public class PetManagement extends JFrame {
    private List<Pet> petList;

    public PetManagement() {
        petList = new ArrayList<>();

        setTitle("Quản lý vật nuôi");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton btnAddPet = new JButton("Thêm vật nuôi");
        JButton btnRemovePet = new JButton("Xóa vật nuôi");
        JButton btnShowPets = new JButton("Hiển thị vật nuôi");

        panel.add(btnAddPet);
        panel.add(btnRemovePet);
        panel.add(btnShowPets);

        add(panel);

        btnAddPet.addActionListener((ActionEvent e) -> {
            String petName = JOptionPane.showInputDialog("Nhập tên vật nuôi:");
            String petType = JOptionPane.showInputDialog("Nhập loại vật nuôi:");
            String healthStatus = JOptionPane.showInputDialog("Nhập tình trạng sức khỏe:");
            int age = Integer.parseInt(JOptionPane.showInputDialog("Nhập tuổi:"));
            if (!petName.isEmpty()) {
                Pet pet = new Pet(petName, petType, healthStatus, age);
                addPet(pet);
                JOptionPane.showMessageDialog(null, "Đã thêm vật nuôi mới: " + petName);
            }
        });

        btnRemovePet.addActionListener((ActionEvent e) -> {
            String petToRemove = JOptionPane.showInputDialog("Nhập tên vật nuôi cần xóa:");
            if (!petToRemove.isEmpty()) {
                removePet(petToRemove);
                JOptionPane.showMessageDialog(null, "Đã xóa vật nuôi: " + petToRemove);
            }
        });

        btnShowPets.addActionListener((ActionEvent e) -> {
            StringBuilder petInfo = new StringBuilder("Danh sách vật nuôi:\n");
            for (Pet pet : petList) {
                petInfo.append("- Tên: ").append(pet.getName())
                        .append(", Loại: ").append(pet.getType())
                        .append(", Tình trạng sức khỏe: ").append(pet.getHealthStatus())
                        .append(", Tuổi: ").append(pet.getAge())
                        .append("\n");
            }
            JOptionPane.showMessageDialog(null, petInfo.toString());
        });
    }

    private void addPet(Pet pet) {
        petList.add(pet);
    }

    private void removePet(String petName) {
        Pet petToRemove = null;
        for (Pet pet : petList) {
            if (pet.getName().equals(petName)) {
                petToRemove = pet;
                break;
            }
        }
        if (petToRemove != null) {
            petList.remove(petToRemove);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PetManagement petManagement = new PetManagement();
                petManagement.setVisible(true);
            }
        });
    }
}


