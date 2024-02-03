package farmaceutica_starsgolg;

import Controlador.Controlador_De_Medicina;
import Modelo.Consulta_De_Medicamentos;
import Modelo.Medicamentos;
import Modelo.Usuarios;
import Vistas.Agregar;
import Vistas.Registrarse;
import Vistas.Session;
import Vistas.Vender;

public class Farmaceutica_StarsGolg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Medicamentos MD = new Medicamentos();
        Consulta_De_Medicamentos CM = new Consulta_De_Medicamentos();
        Agregar AG = new Agregar();
        Vender VD = new Vender();
        Usuarios US = new Usuarios();
        Registrarse RG = new Registrarse();

        Controlador_De_Medicina Controlador = new Controlador_De_Medicina(MD, CM, AG, VD, US, RG);
        Controlador.Iniciar();

        Session User = new Session();
        User.setVisible(true);
        User.setLocationRelativeTo(null);
    }

}
