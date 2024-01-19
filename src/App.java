public class App {
    public static void main(String[] args) {
        int num = 5;

        for (int i = 1; i <= num; i++) {
            StringBuilder pyramid = new StringBuilder();

            for (int aux = 1; aux <= i; aux++) {
                pyramid.append(i);
            }

            System.out.println(pyramid);
        }
    }
}
