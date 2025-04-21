
package modelos;
public class ModeloCliente {
    
    int idCliente;
    String nombres;
    String appaterno;
    String appmaterno;

    public ModeloCliente(int idCliente, String nombres, String appaterno, String appmaterno) {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.appaterno = appaterno;
        this.appmaterno = appmaterno;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getAppmaterno() {
        return appmaterno;
    }

    public void setAppmaterno(String appmaterno) {
        this.appmaterno = appmaterno;
    }
    
    
    
    
    
}
