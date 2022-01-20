 class Main2 {
    static int count = 0;

     public static void main(String[] args) {
         if(count <3){
             count++;
             main(null);
         } else {
             return;
         }
         System.out.println("Hello World");
         test2();
     }

     public  static void test2(){
         char  x = '1', y = '2';
         System.out.println(x-y+x);
     }
}
