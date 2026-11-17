package EjerciciosParte1;

public class Lampara {
    public boolean encendida = false;

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public String estado() {
        return this.encendida ? "Encendida" : "Apagada";
    }

    public static void main(String[] args) {
        Lampara lampara = new Lampara();
        System.out.println(lampara.estado()); // Apagada
        lampara.encender();
        System.out.println(lampara.estado()); // Encendida
    }
}
// Sayori is my core :3
