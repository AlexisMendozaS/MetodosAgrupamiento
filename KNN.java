import java.util.Scanner;

public class KNN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of classes
        System.out.print("Ingrese cuantas clases tiene: ");
        int numClasses = scanner.nextInt();

        // Create a 2D array to store the data for each class
        double[][][] data = new double[numClasses][][];

        // Loop through each class
        for (int i = 0; i < numClasses; i++) {
            // Prompt the user to enter the size of the class
            System.out.print("Ingresa el tamaño de la clase " + (i+1) + ": ");
            int classSize = scanner.nextInt();

            // Create a 2D array to store the data for this class
            data[i] = new double[classSize][2];

            // Loop through each element in the class
            for (int j = 0; j < classSize; j++) {
                // Prompt the user to enter the coordinates of the element
                System.out.print("Ingresa la coordenada del elemento " + (j+1) + ": ");
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();

                // Store the coordinates in the 2D array
                data[i][j][0] = x;
                data[i][j][1] = y;
            }
        }

        // The k-NN algorithm goes here!
        // For now, we'll just print out the data we collected
        for (int i = 0; i < numClasses; i++) {
            System.out.println("Class " + (i+1) + ":");
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("(" + data[i][j][0] + ", " + data[i][j][1] + ")");
            }
        }
    }
}