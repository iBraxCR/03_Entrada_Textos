import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner entrada = new Scanner(System.in);
        String texto;


        System.out.print("Digete el texto: ");

        texto = entrada.nextLine(); //Si no quieres que el texto tenga espacio simplemente se coloca el "next" pero si es que quieres que tenga espacio "nextline"
        //charAt(0) se usa cuando solo se quiere colocar una letra que detecte por ejemplo de un texto que diga "Hola" se guarda solo la "H"
        System.out.print("El texto dice lo siguiente:"+texto);
    }
}
