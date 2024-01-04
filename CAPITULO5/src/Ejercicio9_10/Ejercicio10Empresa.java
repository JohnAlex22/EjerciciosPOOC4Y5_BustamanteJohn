package Ejercicio9_10;

class Ejercicio10Empresa extends Ejercicio10Cliente {
    private String razonSocial;
    private String nit;

    public Ejercicio10Empresa(String razonSocial, String nit, String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion);
        this.razonSocial = razonSocial;
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Empresa [Razón Social = " + razonSocial + ", NIT = " + nit + ", " + super.toString() + "]";
    }
}

