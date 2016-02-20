package triangles;

 * @author Wendy
 */
public class Triangles {

    
    public static void main(String[] args) {
        System.out.println("(a)");
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
          System.out.println("");      
        }
        System.out.println("(b)");
        for (int i = 0; i < 10; i++){
            for (int j = 10; j > i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
