import java.util.ArrayList;

public class arrayCombine {
    public static String arrayCombine(){
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int length = array1.length + array2.length;
        ArrayList list = new ArrayList();

        for(int s = 0; s < length; s++){
            if(s <= array1.length - 1){
                list.add(array1[s]);
            }
            if(s <= array2.length - 1){
                list.add(array2[s]);
            }
        }
        System.out.println(list);
        return "";
    }
}
