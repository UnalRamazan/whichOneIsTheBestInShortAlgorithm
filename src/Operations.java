public class Operations {

    public Operations() {

    }

    public void bubbleSort(int[] array) {//integer bir array alacak

        int n = array.length;//dizinin boyutu buldum
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {

                    //swap elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void insertionSort(int[] array) {//integer bir array alacak

        int n = array.length;//dizinin boyutu buldum

        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end]; // pivot element
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {
            // If current element is smaller than the pivot
            if (array[j] < pivot) {
                i++; // increment index of smaller element
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        return (i + 1);
    }

    public void quickSort(int[] array, int start, int end) {//integer bir array alacak, start = 0, end = dizi boyutu - 1
        if (start < end) {
            int p = partition(array, start, end);//p is partitioning index
            quickSort(array, start, p - 1);
            quickSort(array, p + 1, end);
        }
    }


    public void selectionSort(int[] array) {//integer bir array alacak

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }

    private void merge(int[] array, int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        //temporary Arrays
        int[] LeftArray = new int[n1];
        int[] RightArray = new int[n2];

        //copy data to temp arrays
        for (i = 0; i < n1; i++)
            LeftArray[i] = array[beg + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = array[mid + 1 + j];

        i = 0;//initial index of first sub-array
        j = 0;//initial index of second sub-array
        k = beg;//initial index of merged sub-array

        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                array[k] = LeftArray[i];
                i++;
            } else {
                array[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = RightArray[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] a, int start, int end) {//integer bir array alacak, start = 0, end = dizi boyutu - 1
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }
}