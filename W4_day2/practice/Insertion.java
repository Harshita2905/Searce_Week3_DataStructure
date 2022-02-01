package sort;
public class Insertion {
    public void sort(int arr[]) {
        int n= arr.length;
        for(int i=1; i<n-1; ++i){
            int key=arr[i];
            int j=i-1;

            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }}
        void printArr(int arr[]){
            int n = arr.length;
            for(int i=0;i<n;i++){
                System.out.println(arr[i]+ " ");
                System.out.println();
            }
        }
    
       
        public static void main(String[] args) {
            Insertion ob = new Insertion();
            int arr[] = {21,25, 11, 43, 89};
            ob.sort(arr);
            System.out.println("Your Sorted array");
            ob.printArr(arr);
        }
}
