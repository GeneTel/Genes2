public class myClass {

    public static void main(String[] args) {




        int num = 223;
        int rem = 0;
        int sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
            System.out.println(sum);
        }


    }
}



