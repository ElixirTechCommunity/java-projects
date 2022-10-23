class QuickSort {
  int partition(int arr[], int l, int h) {
        int p = arr[h];
        int j = (l - 1); 
        for (int i = l; i < h; i++) {
            if (arr[i] <= p)  {
                j++;
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        int t = arr[j + 1];
        arr[j + 1] = arr[h];
        arr[h] = t;
        return j + 1;
    }
  void sort(int arr[], int l, int h) {
        if (l < h) {
            int p = partition(arr, l, h);
            sort(arr, l, p - 1);
            sort(arr, p + 1, h);
        }
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);
        System.out.println("Unsorted array");
        printArray(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
}
