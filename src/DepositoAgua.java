public class DepositoAgua {
    
    private double capacidad;
    private double volumenActual;
    private DepositoAgua depositoDesborde;

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que cero.");
        }
        this.capacidad = capacidad;
    }

    public double getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(double volumenActual) {
        this.volumenActual = volumenActual;
    }

    public void mostrarEstado() {
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Volumen Actual: " + volumenActual);
    }

    public void agregarAgua(double cantidad) {
        double nuevoVolumen = volumenActual + cantidad;
        if (nuevoVolumen > capacidad) {
            System.out.println("El depósito se ha desbordado. El exceso de agua se transferirá al depósito de desborde.");
            if (depositoDesborde != null) {
                double exceso = nuevoVolumen - capacidad;
                depositoDesborde.agregarAgua(exceso);
                volumenActual = capacidad;
            } else {
                System.out.println("No hay depósito de desborde. El exceso de agua se perderá.");
                volumenActual = capacidad;
            }
        } else {
            volumenActual = nuevoVolumen;
        }
    }

    public void quitarAgua(double cantidad) {
        if (cantidad > volumenActual) {
            System.out.println("No hay suficiente agua en el depósito para quitar la cantidad solicitada.");
            volumenActual = 0;
        } else {
            volumenActual -= cantidad;
        }
    }
}
