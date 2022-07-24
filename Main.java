import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        En el siguiente ejercicio se solicita calcular el área y el perímetro de un Rectángulo, para ello deberemos crear las siguientes variables:

alto (int)

ancho (int)

El usuario debe proporcionar los valores de largo y ancho, y después se debe imprimir el resultado en el siguiente formato(no usar acentos y respetar los espacios, mayúsculas, minúsculas y saltos de línea):

Proporciona el alto:
Proporciona el ancho:
Area: <area>
Perimetro: <perimetro>
Las fórmulas para calcular el área y el perímetro de un Rectángulo son:

Área: alto * ancho

Perímetro: (alto + ancho) * 2
        * */


        int alto;
        int ancho;
        int perimetro;

        Scanner a = new Scanner(System.in);
        System.out.println("Proporciona el alto:");
        alto = Integer.parseInt(a.nextLine());

        System.out.println("Proporciona el ancho:");
        ancho = Integer.parseInt(a.nextLine());

        perimetro = (alto + ancho) * 2;

        System.out.println("Perímetro:"+perimetro);

    }
}
