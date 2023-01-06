public class Test {
    public static void main(String[] args) {
        int[] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 8;
        intArray[5] = 56;
        intArray[6] = 45;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7){
                System.out.println(i);
            }
        }
    }
}
