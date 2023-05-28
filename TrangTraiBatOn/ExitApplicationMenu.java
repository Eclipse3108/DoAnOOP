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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitApplicationMenu {
    public static void showExitConfirmationDialog() {
        int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát ứng dụng?", "Thoát ứng dụng",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}

