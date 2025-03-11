
package swingejemplo;
import javax.swing.*;
public class SWINGEJEMPLO {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Ejemplo");
        JButton button = new JButton("Entrar");
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "estas en el sistema"));

        frame.setSize(700,300);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(button); 
        frame.setVisible(true);  
    }
}

