import java.util.Arrays;

public class SortedArray {
    private int max;
    private int count=0;

    public void result (int[] array) {

        int[] sorted = new int[array.length];
        int[] check = new int[array.length];


        for (int i = 0; i <array.length ; i++) {

            if(array[i]>max){
                for (int j = 0; j < array.length; j++) {

                }
                max=array[i];

            }
        }

        for (int j = 0; j <array.length; j++) {

            int min = max+1;

            for (int i =0; i < array.length; i++) {

                boolean alreadyExist=false;
                for (int k = 0; k <sorted.length; k++) {
//
                    if(sorted[k]==array[i]){
                        alreadyExist= true;
                    }
                }

                if(alreadyExist==true){
                    continue;
                }

                if(array[i]<min){
                    min=array[i];

                }
            }

            for (int i = 0; i < array.length; i++) {

                if(array[i]==min){

                    sorted[count]=min;
                    count++;

                }
            }



        }
        System.out.println("Sorted Array : " + Arrays.toString(sorted));


    }
}
