package EjerciciosParte1;

public class Termometro {
    public double temperatura = 0.0;

    public void subir(double grados) {
        this.temperatura += grados;
    }

    public void bajar(double grados) {
        this.temperatura -= grados;
    }

    public double mostrarTemperatura() {
        return this.temperatura;
    }

    public static void main(String[] args) {
        Termometro t = new Termometro();
        t.subir(5.0);
        t.bajar(2.0);
        System.out.println(t.mostrarTemperatura()); // 3.0
    }
}
