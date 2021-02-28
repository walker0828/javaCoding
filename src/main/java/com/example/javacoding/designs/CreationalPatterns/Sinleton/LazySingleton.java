public class LazySinleton {
     private static volatile Sinleton instance = null;

     private LazySinleton() {}

     public static synchronized LazySinleton getInstance() {
         if(instance == null) {
             instance = new LazySinleton();
         }
         return instance;
     }
}