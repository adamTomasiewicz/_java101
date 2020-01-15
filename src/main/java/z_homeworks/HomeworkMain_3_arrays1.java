package z_homeworks;

class HomeworkMain_3_arrays1 {

//todo: exe1_Wyświetl sumę, min, max amplitudę, średnią arytmetyczną elementów z tablicy
    /*public static void main(String[] args) {
        int array[] = {1,3,4,5,6,7,8}; }
    static int sumArrayElements (int[] array) {
        int sum=0;
        for (int i: array) {
            sum+=i; }
        return sum; }
    static int minArrayElement (int[] array) {
        int min = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i]<min) min=array[i]; }
        return min; }
    static int maxArrayElement (int[] array) {
        int max = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>max) max=array[i]; }
        return max; }
    static int amplitudeArrayElements (int[] array) {
        return maxArrayElement(array) - minArrayElement(array); }
*/
//todo: exe2_zlicz sumę cyfr dowolnej liczby
public static void main(String[] args) {
    System.out.println(sumUpEveryDigitInNumber(573));
}
static int sumUpEveryDigitInNumber (int number) {
    String stringNumber = String.valueOf(number);
    int sum = 0;
    for (int i = 0; i <stringNumber.length() ; i++) {
        sum=sum+Character.getNumericValue(stringNumber.charAt(i)); }
    return sum; }

//todo: exe3_wyświetl komunikat czy w konkretnym String jest więcej małych
// czy dużych liter (edited)
 static void isThereMoreCharsDigitsOrUppercaseChars (String string) {
    int countLowercase = 0;
    int countUppercase = 0;
     for (int i = 0; i < string.length() ; i++) {
         if (Character.isUpperCase(string.charAt(i))) countUppercase++;
         if (Character.isLowerCase(string.charAt(i))) countLowercase++;
     }
        if (countLowercase>countUppercase) System.out.println("There is more LowCase Chars in  this string");
        if (countLowercase<countUppercase)  System.out.println("There is more UpperCase Chars in  this string");
        if (countLowercase==countUppercase)  System.out.println("There is equal number of LowerCase and UpperCase Chars in  this string");
 }

}
