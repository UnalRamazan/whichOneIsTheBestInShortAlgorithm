import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();

        int size = 0;//oluşturmak istediğim dizinin boyutu

        System.out.print("Please enter size of array: ");//dizinin boyutunu kullanıcıdan aldım
        size = scanner.nextInt();

        int[] bubbleSortArray = new int[size];
        int[] insertionSortArray = new int[size];
        int[] quickSortArray = new int[size];
        int[] selectionSortArray = new int[size];
        int[] mergeSortArray = new int[size];

        //array creation
        long getArrayStartTime = System.currentTimeMillis();//başlangınç zamanını tutmak için
        for (int i = 0; i < size; i++) {//random sayıları oluşturduğum dizilere attım

            int temp = (int) (Math.random() * 1000);

            bubbleSortArray[i] = temp;
            insertionSortArray[i] = temp;
            quickSortArray[i] = temp;
            selectionSortArray[i] = temp;
            mergeSortArray[i] = temp;
        }
        long getArrayEndTime = System.currentTimeMillis();//bitiş zamanını tutmak için

        long getArrayEstimatedTime = getArrayEndTime - getArrayStartTime;
        double getArrayTotalTime = (double) getArrayEstimatedTime;
        //double getArrayTotalTime = (double) getArrayEstimatedTime / 1000;//saniyeye çevirmek için 1000'e bölüyoruz.

        System.out.println("Array creation is complete(" + getArrayTotalTime + ").");
        //print(bubbleSortArray);


        //bubble sort
        long bubbleSortStartTime = System.currentTimeMillis();//başlangınç zamanını tutmak için
        operations.bubbleSort(bubbleSortArray);
        long bubbleSortEndTime = System.currentTimeMillis();//bitiş zamanını tutmak için

        long bubbleSortEstimatedTime = bubbleSortEndTime - bubbleSortStartTime;
        double bubbleSortTotalTime = (double) bubbleSortEstimatedTime;
        //double bubbleSortTotalTime = (double) bubbleSortEstimatedTime / 1000;//saniyeye çevirmek için 1000'e bölüyoruz.

        System.out.println("Bubble sort is complete(" + bubbleSortTotalTime + ").");
        //print(bubbleSortArray);


        //insertion sort
        long insertionSortStartTime = System.currentTimeMillis();
        operations.insertionSort(insertionSortArray);
        long insertionSortEndTime = System.currentTimeMillis();

        long insertionSortEstimatedTime = insertionSortEndTime - insertionSortStartTime;
        double insertionSortTotalTime = (double) insertionSortEstimatedTime;
        //double insertionSortTotalTime = (double) insertionSortEstimatedTime / 1000;//saniyeye çevirmek için 1000'e bölüyoruz.

        System.out.println("Insertion sort is complete(" + insertionSortTotalTime + ").");
        //print(insertionSortArray);


        //quick sort
        long quickSortStartTime = System.currentTimeMillis();
        operations.quickSort(quickSortArray, 0, size - 1);
        long quickSortEndTime = System.currentTimeMillis();

        long quickSortEstimatedTime = quickSortEndTime - quickSortStartTime;
        double quickSortTotalTime = (double) quickSortEstimatedTime;
        //double quickSortTotalTime = (double) quickSortEstimatedTime / 1000;//saniyeye çevirmek için 1000'e bölüyoruz.

        System.out.println("Quick sort is complete(" + quickSortTotalTime + ").");
        //print(quickSortArray);


        //selection sort
        long selectionSortStartTime = System.currentTimeMillis();
        operations.selectionSort(selectionSortArray);
        long selectionSortEndTime = System.currentTimeMillis();

        long selectionSortEstimatedTime = selectionSortEndTime - selectionSortStartTime;
        double selectionSortTotalTime = (double) selectionSortEstimatedTime;
        //double selectionSortTotalTime = (double) selectionSortEstimatedTime / 1000;//saniyeye çevirmek için 1000'e bölüyoruz.

        System.out.println("Selection sort is complete(" + selectionSortTotalTime + ").");
        //print(selectionSortArray);


        //merge sort
        long mergeSortStartTime = System.currentTimeMillis();
        operations.mergeSort(mergeSortArray, 0, size - 1);
        long mergeSortEndTime = System.currentTimeMillis();

        long mergeSortEstimatedTime = mergeSortEndTime - mergeSortStartTime;
        double mergeSortTotalTime = (double) mergeSortEstimatedTime;
        //double mergeSortTotalTime = (double) mergeSortEstimatedTime / 1000;//saniyeye çevirmek için 1000'e bölüyoruz.

        System.out.println("Merge sort is complete(" + mergeSortTotalTime + ").");
        //print(mergeSortArray);


        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Array creation: " + getArrayTotalTime);
        System.out.println("Bubble Sort: " + bubbleSortTotalTime);
        System.out.println("Insertion Sort:  " + insertionSortTotalTime);
        System.out.println("Quick sort: " + quickSortTotalTime);
        System.out.println("Selection sort: " + selectionSortTotalTime);
        System.out.println("Merge sort: " + mergeSortTotalTime);
        System.out.println("Total Time: " + (getArrayTotalTime + bubbleSortTotalTime + insertionSortTotalTime + quickSortTotalTime + selectionSortTotalTime + mergeSortTotalTime));
        System.out.println("--------------------------------------------------------------------------------------------");
    }

    static public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i]);
            }
        }
    }
}