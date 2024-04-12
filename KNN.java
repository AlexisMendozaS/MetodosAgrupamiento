import java.util.Arrays;
import java.util.Comparator;
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
            System.out.print("Ingresa el tamaño de la clase " + (i + 1) + ": ");
            int classSize = scanner.nextInt();

            // Create a 2D array to store the data for this class
            data[i] = new double[classSize][3];

            // Loop through each element in the class
            for (int j = 0; j < classSize; j++) {
                // Prompt the user to enter the coordinates of the element
                System.out.print("Ingresa la coordenada del elemento " + (j + 1) + ": ");
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();

                // Store the coordinates in the 2D array
                data[i][j][0] = x;
                data[i][j][1] = y;
                data[i][j][2] = i + 1; // Store the class number in the third index
            }
        }

        // Prompt the user to enter the value of k
        System.out.print("Ingresa el valor de k: ");
        int k = scanner.nextInt();

        // Prompt the user to enter the number of new points to be classified
        System.out.print("Ingresa el número de nuevos objetos: ");
        int numNewPoints = scanner.nextInt();

        // Create a 2D array to store the new points
        double[][] newPoints = new double[numNewPoints][2];

        // Loop through each new point
        for (int i = 0; i < numNewPoints; i++) {
            // Prompt the user to enter the coordinates of the new point
            System.out.print("Ingresa la coordenada del nuevo punto " + (i + 1) + ": ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            // Store the coordinates in the 2D array
            newPoints[i][0] = x;
            newPoints[i][1] = y;
        }

        // Implement the k-NN algorithm here!
        // Calculate the Manhattan distance between the new points and all the objects in all the classes
        for (int i = 0; i < numNewPoints; i++) {
            for (int j = 0; j < numClasses; j++) {
                for (int l = 0; l < data[j].length; l++) {
                    // Calculate the Manhattan distance
                    double d = Math.abs(newPoints[i][0] - data[j][l][0]);
                    double d2 = Math.abs(newPoints[i][1] - data[j][l][1]);
                    double distance = d + d2;
                    // Print the distance
                    System.out.println("d" + (l+1) + "(On" + (i+1) + ",O" + (l+1) + ") = |" + newPoints[i][0] + "-" + data[j][l][0] + "| + |" + newPoints[i][1] + "-" + data[j][l][1] + "| = " + d + " + " + d2 + " = " + distance);
                }
            }
        }
    }
}