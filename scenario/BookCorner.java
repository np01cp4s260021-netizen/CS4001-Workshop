public class BookCorner { 
    public static void main(String[] args) {

        String[] categories = {"Fiction", "Nepali"};

        String[][] titles = {
            {"The Monk who sold his ferarri"},
            {"Asahamati - 5"}
        };

        double[][] prices = {
            {500.0},
            {750.0}
        };

        for (int i = 0; i < 2; i++) {
            System.out.println("Category: " + categories[i]);

            for (int j = 0; j < 1; j++) {
                if (titles[i][j] != null) {
                    System.out.println("Title: " + titles[i][j]);
                }
                System.out.printf("Price: Rs. %.2f\n", prices[i][j]);
            }

            System.out.println();
        }
    }
}
//workshop6