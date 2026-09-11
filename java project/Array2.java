public class Array2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] b=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            b[i]=arr[arr.length-1-i];
        }
            for(int i=0;i<arr.length;i++){
                System.out.println(b[i]);
        }
        
    }
    
}

