package search;

public class BinarySearch {
    public static void main(String[] sr){
        int arr[] = {1,2,3,6,7,8,9,10};
        int start =0, end = arr.length, mid =(start+end)/2;
        int x = 122;
        while(mid>0 && mid<arr.length){
            if(arr[mid]==x){
                System.out.println(mid+1);
                return;
            }
            if(arr[mid]>x){
                end = mid-1;
            }else{
                start = mid+1;
            }
            mid = (start+end)/2;


        }
        System.out.println(-1);
    }
}
