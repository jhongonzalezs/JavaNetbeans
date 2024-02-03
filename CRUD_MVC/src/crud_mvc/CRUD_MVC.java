package crud_mvc;

import Vista.Formulario_Producto;
import Modelo.Producto;
import Modelo.Consultas_Productos;
import Controlador.Controlador_Producto;

public class CRUD_MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto PD = new Producto();
        Formulario_Producto FP = new Formulario_Producto();
        Consultas_Productos CP = new Consultas_Productos();
        
        Controlador_Producto ConP = new Controlador_Producto(PD, CP, FP);
        ConP.Iniciar();
        FP.setVisible(true);
        
    }
    
}
