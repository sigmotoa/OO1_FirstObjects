//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Crear un objeto de tipo funciono llamado algoraro
        Funcion algoraro = new Funcion();
        algoraro.base=10;
        short cubo = algoraro.calcularCubo(algoraro.base);

        System.out.println(cubo);


    }
    public static String person(String name, int year){
        return (name+" you are "+year).toUpperCase();
    }
}