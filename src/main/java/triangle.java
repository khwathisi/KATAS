public class triangle {
    public static String triangle(int Size){
        for (int i = 0; i < Size + 1; i++) {
            for (int j = Size; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        return "";
    }
}
