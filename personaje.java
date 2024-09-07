import java.util.ArrayList;

public class personaje {
    private ArrayList<habilidad> habilidades;
    private String nombre;

    public personaje(String s){
        this.nombre = s;
        this.habilidades = new ArrayList <>();
    }

    public void agregarHabilidad(habilidad h){
        this.habilidades.add(h);
    }

    public habilidad getHabilidad(String s){
        for(habilidad hab: this.habilidades){
            if(hab.getNombre().equalsIgnoreCase(s)){
                return hab;
            }
        }
        return null;
    }

    public String getNombre(){
        return this.nombre;
    }
    
}
