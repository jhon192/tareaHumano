public class Humano {
    //atributos
    private static String nombre;
    private static String apellido;
    private static int edad;
    private static int ID;
    private static boolean casado;
    private static char genero;

    public Humano() {
    }

    //metodos Getters y setters
    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Humano.nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Humano.apellido = apellido;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        Humano.edad = edad;
    }

    public static char getGenero() {
        return genero;
    }

    public static void setGenero(char genero) {
        Humano.genero = genero;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Humano.ID = ID;
    }

    public static boolean getCasado() {
        return casado;
    }

    public static void setCasado(boolean casado) {
        Humano.casado = casado;
    }

    //Constructor
    public Humano(String nombre, String apellido, int edad,
                  int ID, char genero, boolean casado){
        Humano.nombre = nombre;
        Humano.apellido = apellido;
        Humano.edad = edad;
        Humano.ID = ID;
        Humano.genero = genero;
        Humano.casado = casado;
    }

    //metodos
    public void saludar(){
        System.out.println("Buenos dias");
    }
    public void comer(){
        System.out.println("comer con platos y cuchara e utensilios");
    }
    public static String pensar(){
        return "Pensando cosas en mente";
    }
    public void caminar(){
        System.out.println("moverse con los pies");
    }

    public void VerificadorEdad(){
        if(edad>25){
            System.out.printf("%s es un(a) adulto/a\n", nombre);
        }
        else if(edad>13 && edad<25){
            System.out.printf("%s es un(a) adolescente\n", nombre);
        }
        else{
            System.out.printf("%s es un/a niño/a\n", nombre);
        }
    }

    public void IdentificadorGenero(){
        genero = Character.toLowerCase(genero);
        if(genero == 'm'){
            System.out.printf("%s es un hombre\n", nombre);
        }
        else if(genero == 'f'){
            System.out.printf("%s es una mujer\n", nombre);
        }
        else{
            System.out.println("No binario\n");
        }

    }

    public void IdentificadorEstatus(){
        if(casado = true){
            System.out.printf("%s usted esta casad@", nombre);
        }
        else {
            System.out.printf("%s usted esta solter@", nombre);
        }
    }

    //clases y metodos abstracto usados para heredarse a otra clase hija para darle uso a la abstracta
    abstract static class Identificar{
        abstract public void Identificador_de_apellido();
    }

    //clases estaticas
    static class Padre extends Humano{

        public Padre() {
            super(nombre, apellido, edad, ID, genero, casado);
            nombre = "juan";
            apellido = "Martinez";
            edad = 42;
            casado = true;
            genero = 'm';
            ID = 473984719;
        }

    }
    static class Madre extends Humano{
        public Madre(){
            super(nombre, apellido, edad, ID, genero, casado);
            nombre = "Josefina";
            apellido = "Guzman";
            edad = 37;
            casado = true;
            genero = 'f';
            ID = 1239809832;
        }
    }

    static class Hijo extends Humano{
        public Hijo(){
            super(nombre, apellido, edad, ID, genero, casado);
            nombre = "josue";
            apellido = "Martinez";
            edad = 13;
            casado = false;
            genero = 'm';
            ID = 239654343;

        }
    }

    static class Hija extends Humano{
        public Hija(){
            super(nombre, apellido, edad, ID, genero, casado);
            nombre = "jose jr";
            apellido = "Martinez";
            edad = 16;
            casado = false;
            genero = 'm';
            ID = 239524343;
        }
    }

    static class Tio extends Humano{
        public Tio(){
            super(nombre, apellido, edad, ID, genero, casado);
            nombre = "jean";
            apellido = "Martinez";
            edad = 43;
            casado = false;
            genero = 'm';
            ID = 543654343;
        }
    }

    static class Tia extends Humano{
        public Tia(){
            super(nombre, apellido, edad, ID, genero, casado);
            nombre = "altagracia";
            apellido = "Guzman";
            edad = 33;
            casado = true;
            genero = 'f';
            ID = 984165332;
        }
    }

    static class Abuelo extends Humano{
        public Abuelo(){
            super(nombre, apellido, edad, ID, genero, casado);
            nombre = "Virgilio";
            apellido = "Guzman";
            edad = 76;
            casado = true;
            genero = 'm';
            ID = 543132132;
        }
    }

    static class Abuela extends Humano{
        public Abuela(){
            super(nombre, apellido, edad, ID, genero, casado);
            nombre = "Luz";
            apellido = "Guzman";
            edad = 73;
            casado = true;
            genero = 'f';
            ID = 549876432;
        }
    }

}