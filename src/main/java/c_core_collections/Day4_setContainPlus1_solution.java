package c_core_collections;

public class Day4_setContainPlus1_solution {

////OPTION 1
/*
    public static int solution(int[] A) {

        // write your code in Java SE 8
        Set<Integer> setA = new HashSet<Integer>();

        for (Integer j : A) {
            setA.add(j);
        }
        for (Integer i = setA.iterator().next(); i <=10000000; i++) {
            if (!setA.contains(i)){
                return i;
            }
            else{
                return i+1;
            }
        }
    return 0;
    }
 */
//OPTION 2
/*
public int solution(int[] A) {
    Set<Integer> set = new HashSet<>();
    // zamieniam tablice na SET
    for (int i : A) {
        set.add(i);
    }
    int element = 1;

    while (true){
        if ( set.contains(element)){
            element++;
        }
        else{
            return element;
        }
    }
}
*/

/*
    public static void main(String[] args) {
        int[] B= {1,2,3,5};
        System.out.println(solution(B));
    }


*/



}
