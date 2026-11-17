package EjerciciosParte1;

public class Semaforo {
    public String color = "Rojo";

    public void cambiarRojo() {
        this.color = "Rojo";
    }

    public void cambiarAmarillo() {
        this.color = "Amarillo";
    }

    public void cambiarVerde() {
        this.color = "Verde";
    }

    public String mostrarColor() {
        return this.color;
    }

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        semaforo.cambiarVerde();
        System.out.println(semaforo.mostrarColor()); // Verde
    }
}
// Sayori is my core :3
