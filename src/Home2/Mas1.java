package Home2;

public class Mas1 {
    public static void main(String[] args) {
        int array[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int chet[];
        int nechet[];
        int count= 0;
        for(int i = 0;i< array.length;i++){
            if(array[i] % 2 ==0 ){
                count++;
            }
        }
        nechet = new int[array.length-count];
        chet = new int[count];
        int count1=0;
        int count2=0;
        for(int i =0;i< array.length;i++){
            if(array[i]%2 == 0){
                count1++;
                chet[count1-1]=array[i];
            }else{
                count2++;
                nechet[count2-1]=array[i];
            }
        }
        System.out.print("Четные:");
        for(int i = 0;i< chet.length;i++){
            System.out.print(chet[i]+" ");
        }
        System.out.println(" ");
        System.out.print("Нечетные:");
        for(int i = 0;i< nechet.length;i++){
            System.out.print(nechet[i]+" ");

        }

    }
}
