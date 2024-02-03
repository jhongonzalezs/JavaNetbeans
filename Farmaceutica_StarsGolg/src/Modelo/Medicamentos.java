package Modelo;

public class Medicamentos {

    private int id;
    private String Codigo;
    private String Nombre;
    private String Tipo_Venta;
    private int Cantidad;
    private int Valor;
    private String Informacion; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo_Venta() {
        return Tipo_Venta;
    }

    public void setTipo_Venta(String Tipo_Venta) {
        this.Tipo_Venta = Tipo_Venta;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public String getInformacion() {
        return Informacion;
    }

    public void setInformacion(String Informacion) {
        this.Informacion = Informacion;
    }
    
    
    

}
