package EjerciciosParte1;

public class Reproductor {
    public String cancion = "";
    public boolean reproduciendo = false;

    public void reproducir(String cancion) {
        this.cancion = cancion;
        this.reproduciendo = true;
    }

    public void pausar() {
        this.reproduciendo = false;
    }

    public String estado() {
        if (this.reproduciendo) {
            return "Reproduciendo " + cancion;
        } else {
            return "Pausado";
        }
    }

    public static void main(String[] args) {
        Reproductor rep = new Reproductor();
        rep.reproducir("Imagine");
        System.out.println(rep.estado()); // Reproduciendo Imagine
        rep.pausar();
        System.out.println(rep.estado()); // Pausado
    }
}
