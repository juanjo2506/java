
import java.io.PrintStream; // 👈 Importar PrintStream
import java.io.FileNotFoundException; // 👈
import java.util.Scanner;

public class HelloWorldExercises {/*aqui se determina la clase y debe ser igual el nombre al del archivo*/

    public static void main(String[] args) { /*aqui se inicia el main y siempre debe hacerse para que funcione la compilacion*/
        /*System.out.println("juan");*/
        System.out.println("hola\nmundo"); /*Aqui se imprime lo que se escriba*/
        //crear un comentario
        //en varias lineas
        System.out.println(26);
        System.out.println("negro");
        System.out.println("armenia");
        System.out.println("Este");
        System.out.println("es");
        System.out.println("un");
        System.out.println("ejemplo");
        System.out.println("de");
        System.out.println("frase");
        System.out.println(":)");
        Scanner sc = new Scanner(System.in);
        System.out.println("indica un caracter: ");
        char c = sc.next().charAt(0); /*el next hace que espere aqui e ingreses el caracter, pero igual acordarse que el orden depende de uno, es para que se vea bien semanticamente*/
        System.out.println("indica un caracter: ");
        int ascii = (int) c;
        System.out.println(ascii);


        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();   // convierte directamente a int

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.next(); // lee palabra
        try {
            PrintStream archivo = new PrintStream("salida.txt");
            System.setOut(archivo);
            System.out.println("Esto se va llenando");
            archivo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // imprime el error si algo falla
        }
    }

}
