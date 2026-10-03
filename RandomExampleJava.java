
package randomexample.java;
import java.util.Random;
public class RandomExampleJava {

   
    public static void main(String[] args) {
      Random random = new Random(1000);
      for(int i=0;i<50;i++){
          System.out.println(random.nextInt(100));
      }
    }
    
}
