public class prueba33 {
    public static void main(String[] args) {
        personaje BIMBOSO = new personaje("Bimboso");
        personaje Yayu = new personaje("Yayu");

        habilidad fuerzaB = new habilidad("fuerza", 4);
        habilidad fuerzaY = new habilidad("fuerza", 4);
        habilidad velocidadB = new habilidad("velocidad", 3);
        habilidad velocidadY = new habilidad("velocidad", 9);

        BIMBOSO.agregarHabilidad(fuerzaB);
        BIMBOSO.agregarHabilidad(velocidadB);

        Yayu.agregarHabilidad(fuerzaY);
        Yayu.agregarHabilidad(velocidadY);

        sistemaJuego sist = new sistemaJuego(BIMBOSO, Yayu);

        sist.jugar("fuerza", "velocidad");


    }
}
