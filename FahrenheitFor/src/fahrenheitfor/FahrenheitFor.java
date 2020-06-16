/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheitfor;
import java.util.Scanner;
public class FahrenheitFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      int i = 10;
      double c;
      
      for(i=10;i<=101;i = i + 10)
      {
          c = i * 9 / 5 + 32;
          System.out.println(c);
      }
    }
    
}
