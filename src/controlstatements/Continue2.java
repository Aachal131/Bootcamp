package controlstatements;

public class Continue2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            //inner loop
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    //using continue statement inside inner loop
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
