package Ejercicio18_19;

public class Ejercicio19VehiculoAereo extends Ejercicio18Vehículo implements Ejercicio19Reactor, Ejercicio19Alas {
    public Ejercicio19VehiculoAereo(int velocidadActual, int velocidadMáxima) {
        super(velocidadActual, velocidadMáxima);
    }

    void acelerar(int velocidad) {
        int vel = velocidadActual + velocidad;
        if (vel > velocidadMáxima) {
            System.out.println("Supera la velocidad máxima permitida");
        } else {
            velocidadActual = vel;
        }
    }

    void frenar(int velocidad) {
        int vel = velocidadActual - velocidad;
        if (vel < 0) {
            System.out.println("La velocidad no puede ser negativa");
        } else {
            velocidadActual = vel;
        }
    }

    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return (fuerza * radio);
    }

    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80 || velocidadViento < 10) {
            velocidadActual = 0;
        }
    }

    public void encender() {
        System.out.println("Reactor encendido");
    }

    public void apagar() {
        System.out.println("Reactor apagado");
    }

    public void soltar() {
        System.out.println("Alas soltadas");
    }

    public void subirTrenDeAterrizaje() {
        System.out.println("Tren de aterrizaje subido");
    }

    public void volar() {
        System.out.println("Vehículo aéreo volando");
    }

    public void despegar() {
        System.out.println("Vehículo aéreo despegando");
    }

    public void aterrizar() {
        System.out.println("Vehículo aéreo aterrizando");
    }
}

