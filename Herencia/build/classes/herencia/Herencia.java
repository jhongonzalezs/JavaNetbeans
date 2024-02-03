package herencia;
import javax.swing.*;
import herencia.Hereditario;

public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hereditario Hijo = new Hereditario();
        
        
        
        Hijo.Padre=JOptionPane.showInputDialog("Nombre Del Padre");
        Hijo.Apellido_Padre=JOptionPane.showInputDialog("Primer Apellido Del Padre");
        Hijo.Madre=JOptionPane.showInputDialog("Nombre De la Madre");
        Hijo.Apellido_Madre=JOptionPane.showInputDialog("Primer Apellido De La Madre");
        Hijo.Nombre=JOptionPane.showInputDialog("Primer Y Segundo Nombre Del Recien Nacido");
        
        
        System.out.println(Hijo.Padre);
        System.out.println(Hijo.Madre);
        System.out.println(Hijo.Nombre+" "+Hijo.Apellido_Padre+" "+Hijo.Apellido_Madre);
        
    }
    
}
