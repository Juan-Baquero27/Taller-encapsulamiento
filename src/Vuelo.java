public class Vuelo {
    
    private String numeroVuelo;
    private String origen;
    private String destino;
    private int numPasajeros;
    private int capacidadMaxima;

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        if (numPasajeros < 0 || numPasajeros > this.capacidadMaxima) {
            System.out.println("Número de pasajeros inválido.");
        } else {
            this.numPasajeros = numPasajeros;
        }
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void mostrarInfo() {
        System.out.println("Número de Vuelo: " + numeroVuelo);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Número de Pasajeros: " + numPasajeros);
        System.out.println("Capacidad Máxima: " + capacidadMaxima);
    }

    public void embarcar(int numPasajeros) {
        if (this.numPasajeros + numPasajeros > this.capacidadMaxima) {
            System.out.println("No se puede embarcar a más pasajeros. Capacidad máxima alcanzada.");
        } else {
            this.numPasajeros += numPasajeros;
            System.out.println(numPasajeros + " pasajeros han sido embarcados.");
        }
    }

    public void desembarcar(int numPasajeros) {
        if (numPasajeros > this.numPasajeros) {
            System.out.println("No se puede desembarcar a más pasajeros de los que hay a bordo.");
        } else {
            this.numPasajeros -= numPasajeros;
            System.out.println(numPasajeros + " pasajeros han sido desembarcados.");
        }
    }
}
