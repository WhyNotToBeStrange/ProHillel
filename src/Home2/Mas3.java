package Home2;

public class Mas3 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for(int i=0;i< array.length;i++){
            if(i<2){
                array[i]=1;
            }else{
                array[i]=array[i-2]+array[i-1];
            }
            System.out.print(array[i]+" ");
        }
    }
}
