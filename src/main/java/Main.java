public class Main {

    public int[] GetSumArray(int[] ar) {
        int[] result = new int[ar.length];
        int sum;
        int digit;
        for (int i = 0; i < ar.length; i++) {
            sum = 0;
            digit = ar[i] % 2;
//            System.out.println(digit);
            for (int j = 0; j <= i; j++) {
                if (ar[j] % 2 == digit) {
                    sum += ar[j];
                }
                result[i] = sum;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int ar[] = {};
        Main demo = new Main();
        int[] result = demo.GetSumArray(ar);
        for (int i = 0;i < result.length;++i) {
            System.out.printf("%d ", result[i]);
        }
    }
}
