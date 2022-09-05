public class Main {
    public static void main(String[] args) {

        int [] numbersArray1={20,3,55,8,5};
        int [] numbersArray2={55,40,5,12,58,100,3};
        int [] numbersArray3={28,3,55,88,51,12};

        MergedArray mergedArray = new MergedArray((numbersArray1.length+ numbersArray2.length+ numbersArray3.length));
//        mergedArray.result(numbersArray1,numbersArray2,numbersArray3);

        SortedArray sortedArray = new SortedArray();
        sortedArray.result(mergedArray.result(numbersArray1,numbersArray2,numbersArray3));


    }
}