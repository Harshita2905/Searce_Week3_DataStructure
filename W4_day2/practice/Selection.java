package sort;
public class Selection {
    void sort(int arr[]){
        int n = arr.length; 

        for(int i =0; i<n-1;i++){
            int mid_idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mid_idx])
                    mid_idx = j;
            }

            int temp =arr[mid_idx];
            arr[mid_idx] =arr[i];
            arr[i] = temp;
        }

    }

    void printArr(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Selection ob = new Selection();
        int arr[] = {21,25, 11, 43, 89};
        ob.sort(arr);
        System.out.println("Your Sorted array");
        ob.printArr(arr);
    }
}

