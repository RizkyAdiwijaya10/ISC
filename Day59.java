package informatic_study_club;

public class Day59 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                } else if ((i + j) == 4) {
                    break;
                }

            }
            System.out.print("\n");
        }
    }
}
