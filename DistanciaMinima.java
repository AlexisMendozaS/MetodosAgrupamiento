import java.util.Scanner;

public class DistanciaMinima {
    public static class Coordenadas {
        int x;
        int y;

        public Coordenadas(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas de los objetos:");
        
        //CLASE 1
        System.out.println("CLASE 1");
        Coordenadas[] coordenadas = new Coordenadas[3];

        // Lee las coordenadas ingresadas por el usuario y las almacena en el array
        for (int i = 0; i < 3; i++) {
            System.out.print("Coordenada " + (i + 1) + " (x, y): ");
            int x = leer.nextInt();
            int y = leer.nextInt();
            coordenadas[i] = new Coordenadas(x, y);
        }

        //CLASE 2
        System.out.println("CLASE 2");
        Coordenadas[] coordenadas2 = new Coordenadas[5]; // Se cambió el tamaño a 5

        // Lee las coordenadas ingresadas por el usuario y las almacena en el array
        for (int j = 0; j < 4; j++) { // Se corrigió el rango del bucle
            System.out.print("Coordenada " + (j + 1) + " (x1, y1): ");
            int x1 = leer.nextInt();
            int y1 = leer.nextInt();
            coordenadas2[j] = new Coordenadas(x1, y1);
        }

        //CLASE 3
        System.out.println("CLASE 3");
        Coordenadas[] coordenadas3 = new Coordenadas[3]; // Se cambió el tamaño a 3

        // Lee las coordenadas ingresadas por el usuario y las almacena en el array
        for (int k = 0; k < 2; k++) { // Se corrigió el rango del bucle
            System.out.print("Coordenada " + (k + 1) + " (x2, y2): ");
            int x2 = leer.nextInt();
            int y2 = leer.nextInt();
            coordenadas3[k] = new Coordenadas(x2, y2);
        }



        // Imprime las coordenadas almacenadas en el array
        System.out.println("CLASE 1");
        for (Coordenadas c : coordenadas) {
            System.out.println(c);
        }
        // Imprime las coordenadas almacenadas en el array
        
        System.out.println("CLASE 2");
        for (Coordenadas c : coordenadas2) {
            System.out.println(c);
        }

        // Imprime las coordenadas almacenadas en el array
        System.out.println("CLASE 3");
        for (Coordenadas c : coordenadas3) 
            System.out.println(c);
        }
    } //FIN DE MAIN
}
