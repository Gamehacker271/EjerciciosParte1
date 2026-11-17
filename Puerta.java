package EjerciciosParte1;

public class Puerta {
    public boolean abierta = false;

    public void abrir() {
        this.abierta = true;
    }

    public void cerrar() {
        this.abierta = false;
    }

    public String estado() {
        return this.abierta ? "Abierta" : "Cerrada";
    }

    public static void main(String[] args) {
        Puerta puerta = new Puerta();
        puerta.abrir();
        System.out.println(puerta.estado()); // Abierta
    }
}
