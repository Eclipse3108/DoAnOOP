/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrangTraiBatOn;

/**
 *
 * @author ADMIN
 */
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FarmManagementMenu menu = new FarmManagementMenu();
            menu.setVisible(true);
        });
    }
}

