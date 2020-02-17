import java.util.ArrayList;

public class longString {
    public static String longString(){
        ArrayList list = new ArrayList();
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

        for(int l = 0; l < Names.length; l++){
            if(Names[l].length() == longestSize){
                list.add(Names[l]);
            }
        }

        for(int s = 0; s < list.size(); s++){
            System.out.println(list.get(s));
        }

        return "";
    }
}
