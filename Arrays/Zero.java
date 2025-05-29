package Arrays;
public class Zero {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,4,5,0,6};
        System.out.println("input:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        int n=arr.length;
        int left=0;
        int right=1;
        while(right<n){
            if(arr[left]==0){
                if(arr[right]!=0){
                    int temp=arr[right];
                    arr[right]=arr[left];
                    arr[left]=temp;
                    left++;
                    right++;
                }
                else{
                    right++;
                }
            }
            else{
                left++;
                right++;
            }
        }
        // output
        System.out.println("Output:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    
}
