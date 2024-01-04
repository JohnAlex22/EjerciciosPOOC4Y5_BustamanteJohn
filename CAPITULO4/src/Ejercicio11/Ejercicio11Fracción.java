package Ejercicio11;

public class Ejercicio11Fracción extends Ejercicio11Numérica {
    private int numerador;
    private int denominador;

    public Ejercicio11Fracción(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;

        Ejercicio11Fracción fracción = (Ejercicio11Fracción) ob;

        return numerador == fracción.numerador && denominador == fracción.denominador;
    }

    @Override
    public Ejercicio11Numérica sumar(Ejercicio11Numérica número) {
        if (!(número instanceof Ejercicio11Fracción)) {
            throw new IllegalArgumentException("No se puede sumar una fracción con otro tipo de número.");
        }
        Ejercicio11Fracción otraFracción = (Ejercicio11Fracción) número;
        int nuevoNumerador = numerador * otraFracción.denominador + otraFracción.numerador * denominador;
        int nuevoDenominador = denominador * otraFracción.denominador;
        return new Ejercicio11Fracción(nuevoNumerador, nuevoDenominador);
    }

    @Override
    public Ejercicio11Numérica restar(Ejercicio11Numérica número) {
        if (!(número instanceof Ejercicio11Fracción)) {
            throw new IllegalArgumentException("No se puede restar una fracción con otro tipo de número.");
        }
        Ejercicio11Fracción otraFracción = (Ejercicio11Fracción) número;
        int nuevoNumerador = numerador * otraFracción.denominador - otraFracción.numerador * denominador;
        int nuevoDenominador = denominador * otraFracción.denominador;
        return new Ejercicio11Fracción(nuevoNumerador, nuevoDenominador);
    }

    @Override
    public Ejercicio11Numérica multiplicar(Ejercicio11Numérica número) {
        if (!(número instanceof Ejercicio11Fracción)) {
            throw new IllegalArgumentException("No se puede multiplicar una fracción con otro tipo de número.");
        }
        Ejercicio11Fracción otraFracción = (Ejercicio11Fracción) número;
        int nuevoNumerador = numerador * otraFracción.numerador;
        int nuevoDenominador = denominador * otraFracción.denominador;
        return new Ejercicio11Fracción(nuevoNumerador, nuevoDenominador);
    }

    @Override
    public Ejercicio11Numérica dividir(Ejercicio11Numérica número) {
        if (!(número instanceof Ejercicio11Fracción)) {
            throw new IllegalArgumentException("No se puede dividir una fracción con otro tipo de número.");
        }
        Ejercicio11Fracción otraFracción = (Ejercicio11Fracción) número;
        // Para dividir, multiplicamos por el recíproco
        int nuevoNumerador = numerador * otraFracción.denominador;
        int nuevoDenominador = denominador * otraFracción.numerador;
        return new Ejercicio11Fracción(nuevoNumerador, nuevoDenominador);
    }

    // Método para simplificar la fracción
    private void simplificar() {
        int gcd = gcd(Math.abs(numerador), Math.abs(denominador));
        numerador /= gcd;
        denominador /= gcd;
        // Mantener el signo en el numerador
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
    }

    // Método para calcular el máximo común divisor
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
