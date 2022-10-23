import java.util.Scanner;


public class CantidadVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine(); //leemos la cadena
        int cantidadVocales = 0;
        int cantidadA = 0;
        int cantidadE = 0;
        int cantidadI = 0;
        int cantidadO = 0;
        int cantidadU = 0;
        //iteramos mientras el indice sea menor al tamanio total de la cadena
        for (int i = 0; i < cad.length(); i++) {
            char car = cad.charAt(i); //obtenemos el caracter en la posicion i
            //si el caracter es igual a "a", "e", "i", "o", ó "u" entonces es vocal
            if (car == 'a' || car == 'e' || car ==  'i' || car == 'o' || car == 'u') {
                cantidadVocales++; //contamos cantidad vocales +1

                switch (car) {
                    case 'a':
                        cantidadA++;
                        break;
                    case 'e':
                        cantidadE++;
                        break;
                    case 'i':
                        cantidadI++;
                        break;
                    case 'o':
                        cantidadO++;
                        break;
                    case 'u':
                        cantidadU++;
                        break;
                }
            }

        }
        //mostramos por pantalla cantidad de vocales
        System.out.println("La cantidad de vocales es: " + cantidadVocales);

        System.out.println("El total de A es: " + cantidadA );
        System.out.println("El total de E es: " + cantidadE );
        System.out.println("El total de I es: " + cantidadI );
        System.out.println("El total de O es: " + cantidadO );
        System.out.println("El total de U es: " + cantidadU );
    }
}
