public class ArrayDemo2{
   static void min(int arr[]){
        int m = arr[0];
        for(int i=1;i<arr.length;i++){
            if(m>arr[i]){
                m=arr[i];
            }
        }
        System.out.println("The smallest element is " + m);
    }
    public static void main(String args[]){
        int a[]={11,99,66,44,2};
        min(a);
    }
}
