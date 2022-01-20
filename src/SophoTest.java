public class SophoTest {
    public static void main(String[] args) {
        int[] myArray = {1,2,2,5,4,6,7,8,8,8};
        int n = myArray.length;
        int longest = 0;
        int number = 0;
        for (int i = 0; i <n - 1 ; i++) {
            if(myArray[i] == myArray[i + 1]){
                longest++;
                number = myArray[i];
            }
        }
        System.out.println("Numero con mayor concurrencias seguidas es " + number);
        System.out.println("Cantidad de veces que aparece en la secuencia " + longest);
    }
}
