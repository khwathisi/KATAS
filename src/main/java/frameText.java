public class frameText {
    public static String frameText(){
        String[] Names = {"john", "Tom", "Godfrey", "Mphuluseni", "Khwathisi", "Lenovo", "Samsung", "Mphuluseng"};

        int index = 0;
        int elementLength = Names[0].length();
        for(int i=1; i< Names.length; i++) {
            if(Names[i].length() > elementLength) {
                index = i;
                elementLength = Names[i].length();
            }
        }

        int longestSize = Names[index].length();

        System.out.print("*");

        for (int i = 0; i <= longestSize + 1; i++) {
            System.out.print("*");
        }

        System.out.print("*");
        System.out.println();

        for(int i = 0; i < Names.length; i++){
            System.out.print("* " + Names[i]);

            StringBuilder stringBuilder = new StringBuilder();
            int eleLength = Names[i].length();
            int remain = longestSize - eleLength;
            String space = " ";
            int r = 0;

            while( r <= remain ){
                stringBuilder.append(space);
                r++;
            }

            System.out.println(stringBuilder.toString()+"*");
        }

        System.out.print("*");

        for (int i = 0; i <= longestSize + 1; i++) {
            System.out.print("*");
        }

        System.out.print("*");
        System.out.println();
        return "";
    }
}
