# MetodosAgrupamiento
Desarrollo de los métodos de agrupamiento jerarquico



algoritmo knn blackbox
import java.util.Scanner;

public class KNN {
    private double[][] data;
    private int[] labels;
    private int k;
    private double[][] newData;

    public KNN(double[][] data, int[] labels, int k, double[][] newData) {
        this.data = data;
        this.labels = labels;
        this.k = k;
        this.newData = newData;
    }

    public int[] predict() {
        int[] predictions = new int[newData.length];
        for (int i = 0; i < newData.length; i++) {
            double[] newPoint = newData[i];
            int[] nearestNeighbors = findNearestNeighbors(newPoint);
            predictions[i] = findMostCommonLabel(nearestNeighbors);
        }
        return predictions;
    }

    private double[][] findNearestNeighbors(double[] point) {
        double[][] distances = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double[] dataPoint = data[i];
            double distance = Math.pow(point[0] - dataPoint[0], 2) + Math.pow(point[1] - dataPoint[1], 2);
            distances[i][0] = distance;
            distances[i][1] = labels[i];
        }
        quickSort(distances, 0, distances.length - 1);
        return new double[][]{distances[0], distances[1], distances[2], distances[3], distances[4]};
    }

    private void quickSort(double[][] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(double[][] arr, int low, int high) {
        double pivot = arr[high][0];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j][0] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(double[][] arr, int i, int j) {
        double[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int findMostCommonLabel(double[][] neighbors) {
        int[] counts = new int[5];
        for (double[] neighbor : neighbors) {
            int label = (int) neighbor[1];
            counts[label]++;
        }
        int maxCount = 0;
        int mostCommonLabel = -1;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                mostCommonLabel = i;
            }
        }
        return mostCommonLabel;
    }
}