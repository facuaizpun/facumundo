public class Main {
    public static void main(String[] args) {
        Juego juego1 = new Juego(5);
        juego1.MuestraVidasRestantes();
        juego1.vidas--;
        juego1.MuestraVidasRestantes();
        Juego juego2 = new Juego(5);
        juego2.MuestraVidasRestantes();
        juego1.MuestraVidasRestantes();
    }
}
