public class App {
    public static void main(String[] args) throws Exception {
        /* 

        Libro libro1 = new Libro();
        libro1.settitulo("El Quijote");
        libro1.setautor("Miguel de Cervantes");
        libro1.setdisponible(true);

        libro1.mostrarInfo();
        libro1.prestar();
        libro1.mostrarInfo();
        libro1.devolver();
        libro1.mostrarInfo();

        Libro libro2 = new Libro();
        libro2.settitulo("Cien Años de Soledad");
        libro2.setautor("Gabriel García Márquez");
        libro2.setdisponible(false);
        libro2.mostrarInfo();
        libro2.prestar();
        libro2.mostrarInfo();
        libro2.devolver();
        libro2.mostrarInfo();


        Vuelo vuelo1 = new Vuelo();
        vuelo1.setNumeroVuelo("IB123");
        vuelo1.setOrigen("Bogotá");
        vuelo1.setDestino("Madrid");
        vuelo1.setCapacidadMaxima(100);
        vuelo1.setNumPasajeros(50);
        vuelo1.mostrarInfo();
        vuelo1.embarcar(20);
        vuelo1.mostrarInfo();
        vuelo1.desembarcar(10);
        vuelo1.mostrarInfo();

        Vuelo vuelo2 = new Vuelo();
        vuelo2.setNumeroVuelo("IB456");
        vuelo2.setOrigen("Medellín");
        vuelo2.setDestino("Paris");
        vuelo2.setCapacidadMaxima(150);
        vuelo2.setNumPasajeros(75);
        vuelo2.mostrarInfo();
        vuelo2.embarcar(50);
        vuelo2.mostrarInfo();
        vuelo2.desembarcar(30);
        vuelo2.mostrarInfo();
    */
        
        DepositoAgua deposito1 = new DepositoAgua();
        deposito1.setCapacidad(100);
        deposito1.setVolumenActual(50);
        deposito1.mostrarEstado();
        deposito1.agregarAgua(60);
        deposito1.mostrarEstado();
        deposito1.quitarAgua(20);
        deposito1.mostrarEstado();
        
        DepositoAgua deposito2 = new DepositoAgua();
        deposito2.setCapacidad(200);
        deposito2.setVolumenActual(50);
        deposito2.mostrarEstado();
        deposito2.agregarAgua(60);
        deposito2.mostrarEstado();
        deposito2.quitarAgua(20);
        deposito2.mostrarEstado();
    }
}
