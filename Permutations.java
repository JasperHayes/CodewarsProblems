import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

class Permutations {

    public static void main(String[] args) {
        System.out.println(singlePermutations("abc"));
    }
    
    public static List<String> singlePermutations(String s) {
        char[] carr = s.toCharArray();
        HashSet<String> HS = new HashSet<>();
        doSwaps(carr, 0, HS);
        return new ArrayList<String>(HS);
    }

    public static void doSwaps(char[] carr, int start, HashSet<String> HS){
        HS.add(new String(carr));
        for(int i = start; i < carr.length; i++){
            char temp = carr[start];
            carr[start] = carr[i];
            carr[i] = temp;
            doSwaps(carr, start+1, HS);
            temp = carr[start];
            carr[start] = carr[i];
            carr[i] = temp;
        }
    }
}