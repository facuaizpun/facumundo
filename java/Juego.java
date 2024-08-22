public class Juego {
    public int vidas;
    public Juego(int vidasIniciales) {
        this.vidas = vidasIniciales;
    }
    public void MuestraVidasRestantes() {
        System.out.println("Vidas restantes: " + vidas);
    }
}
