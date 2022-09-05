import java.util.Arrays;


public class MergedArray {

    public MergedArray(int lengthMerged) {
        this.lengthMerged = lengthMerged;
    }
    private int lengthMerged;

    public int getLengthMerged() {
        return lengthMerged;
    }

    public void setLengthMerged(int lengthMerged) {
        this.lengthMerged = lengthMerged;
    }

    public int[] result(int[] array1,int[] array2,int[] array3) {

        int[] mergedArray=new int[lengthMerged];


        for (int i = 0; i < array1.length; i++) {
            mergedArray[i]=array1[i];
        }

        for (int i = array1.length; i < (array1.length+array2.length); i++) {
            mergedArray[i]=array2[(i-array1.length)];
        }


        for (int i = (array1.length+array2.length); i < (array1.length+array2.length+array3.length); i++) {
            mergedArray[i]=array3[(i-array1.length-array2.length)];
        }


        System.out.println("Merged Array : " + Arrays.toString(mergedArray));
        return mergedArray;
    }
}
