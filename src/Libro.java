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
}
