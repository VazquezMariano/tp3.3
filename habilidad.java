public class habilidad {
    private String nombre;
    private int valor;

    public habilidad(String s, int val){
        this.nombre = s;
        this.valor = val;
    }

    public int getVal(){
        return this.valor;
    }

    public String getNombre(){
        return this.nombre;
    }
}
