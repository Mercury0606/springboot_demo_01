public class Recursion {
    public static void main(String[] args) {
        System.out.println(interativeFactorila(5));
    }
    public  static int interativeFactorila(int num){
        if (num==0){
            return  0;
        }
        int factorial=1;
        for (int i = 1; i < num; i++) {
            factorial*=i;
        }
        return  factorial;
    }
}
