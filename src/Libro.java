public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public String gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El titulo no puede estar vacio");
        }
        this.titulo = titulo;
    }

    public String getautor() {
        return autor;
    }

    public void setautor(String autor) {
        this.autor = autor;
    }

    public boolean disponible() {
        return disponible;
    }

    public void setdisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + disponible);
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro ya está disponible.");
        }
    }
}
