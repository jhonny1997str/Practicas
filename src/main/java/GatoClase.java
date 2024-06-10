public class GatoClase {
    //atributos
    private String nombre;
    private String cazar;
    private String comer;
    private String color;

    //constructor
    public GatoClase(String comer,String cazar, String nombre, String color){
        this.cazar = "cazando";
        this.nombre = "beto";
        this.comer = "comiendo";
        this.color = "negro";


    }
    //metodo getter
    public String getNombre(){
        return nombre;
    }
    public String getCazar() {
        return cazar;
    }
    public String getComer(){
        return comer;
    }
    public String getColor() {
        return color;
    }

    //setter
    public void setCazar(String cazar){
        this.cazar = cazar;

    }
    public void setComer(String comer){
        this.comer = comer;

    }
    //mostrar info
    public void info(){
        System.out.println("El gato " + getNombre() +   " esta "  + getCazar() + " para luego estar " + getComer() + " para disfrutar su comida." );

    }
    //metodo principal
    public static void main(String[] args) {
        GatoClase  m1 = new GatoClase("","","","");
        m1.info();


    }

}
