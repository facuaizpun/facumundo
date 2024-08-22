// Método principal (main) para ejecutar el programa
public static void main(String[] args) {
    // Crea una instancia de la clase Juego con 5 vidas
    Juego juego1 = new Juego(5);

    // Muestra las vidas restantes
    juego1.MuestraVidasRestantes();

    // Resta una vida y muestra si quedan vidas
    while (juego1.QuitaVida()) {
        juego1.MuestraVidasRestantes();
    }

    // Reinicia la partida y muestra las vidas restantes
    juego1.ReiniciaPartida();
    juego1.MuestraVidasRestantes();

    // Crea otra instancia de la clase Juego con 5 vidas
    Juego juego2 = new Juego(5);

    // Muestra las vidas restantes de la nueva instancia
    juego2.MuestraVidasRestantes();

    // Muestra las vidas restantes de la instancia anterior
    juego1.MuestraVidasRestantes();
}
