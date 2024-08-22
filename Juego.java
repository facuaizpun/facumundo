public class Juego {
    // Atributos privados
    private int vidas;
    private int vidasIniciales;

    // Constructor que inicializa el número de vidas y guarda el número inicial
    public Juego(int vidasIniciales) {
        this.vidasIniciales = vidasIniciales;
        this.vidas = vidasIniciales;
    }

    // Método para mostrar las vidas restantes
    public void MuestraVidasRestantes() {
        System.out.println("Vidas restantes: " + vidas);
    }

    // Método para quitar una vida, devuelve true si quedan vidas, false si no
    public boolean QuitaVida() {
        if (vidas > 0) {
            vidas--;
        }
        if (vidas <= 0) {
            System.out.println("No te quedan más vidas.");
            return false;
        }
        return true;
    }

    // Método para reiniciar la partida, restablece las vidas al valor inicial
    public void ReiniciaPartida() {
        vidas = vidasIniciales;
        System.out.println("Partida reiniciada. Vidas restauradas a " + vidasIniciales);
    }
}