package ar.com.xeven;

public class Empleado {
    private String nombre;
    private Integer nroEmpleado;
    private Integer dni;
    private Integer edad;
    private String direccion;
    private String puesto;

    public Empleado() {
    }
    public Empleado(String nombre, Integer nroEmpleado, Integer dni, Integer edad, String direccion, String puesto) {
        this.nombre = nombre;
        this.nroEmpleado = nroEmpleado;
        this.dni = dni;
        this.edad = edad;
        this.direccion = direccion;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNroEmpleado() {
        return nroEmpleado;
    }

    public void setNroEmpleado(Integer nroEmpleado) {
        this.nroEmpleado = nroEmpleado;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", nroEmpleado=" + nroEmpleado +
                ", dni=" + dni +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", puesto='" + puesto + '\'' +
                '}';
    }
}
