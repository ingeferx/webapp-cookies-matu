package models;

public class Productos {
    // Declaración de variables para gestionar información de clientes
    private Long idCliente;
    private String nombre;
    private String direccion;
    private String tipoDocumento;
    private String numeroDocumento;
    private String telefono;

    // Constructor vacío
    public Productos() {
    }

    // Constructor con parámetros
    public Productos(Long idCliente, String nombre, String direccion, String tipoDocumento, String numeroDocumento, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
    }

    // Métodos Get y Set
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
