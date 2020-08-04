/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploslabextra1;

/**
 *
 * @author ingri
 */
public class AA19_BreakContinue {

    public static void main(String[] args) {
        System.out.println("Break en for");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        
        System.out.println("\nContinue en for");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        //En el while
        System.out.println("\nBreak en while");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        System.out.println("\nContinue en while");
        int j = 0;
        while (j < 10) {
            if (j == 4) {
                i++;
                continue;
            }
            System.out.println(j);
            j++;
        }
    }
}
