
package oficinahugo;

import view.Login;

/**
 *
 * @author wellici araujo
 */
public class OficinaHugo {
    public static Boolean controleDeJanela = false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true); 
    }
    
}
