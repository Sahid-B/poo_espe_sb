
package proyecto2;

import javax.swing.SwingUtilities;


public class Proyecto2 {
  public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
}