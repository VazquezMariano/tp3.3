public class sistemaJuego {
    private personaje heroe;
    private personaje villano;


    public sistemaJuego(personaje h, personaje v){
        this.heroe = h;
        this.villano = v;
    }

    public void jugar(String h1, String h2){

        if(this.heroe.getHabilidad(h1).getVal() == this.villano.getHabilidad(h1).getVal()){
            if(this.heroe.getHabilidad(h2).getVal() == this.villano.getHabilidad(h2).getVal()){
                System.out.println("EMPATE TOTAL");
            } else if(this.heroe.getHabilidad(h2).getVal() > this.villano.getHabilidad(h2).getVal()){
                System.out.println("Gano " + this.heroe.getNombre());
            } else {
                System.out.println("gano " + this.villano.getNombre());
            }
        } else if(this.heroe.getHabilidad(h1).getVal() > this.villano.getHabilidad(h2).getVal()){
            System.out.println("ganaddor" + this.heroe.getNombre());
        } else {
            System.out.println("ganador " + this.villano.getNombre());
        }
    }

    public void setHeroesyVillanos(personaje h, personaje v){
        this.heroe = h;
        this.villano = v;
    }
}
