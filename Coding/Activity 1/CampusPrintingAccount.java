
package campusprintingaccount;

public class CampusPrintingAccount {

    public static void main(String[] args) {
 CMPA Mia=new CMPA("Mia", 10);
       CMPA Luis=new CMPA("Luis", -4);

        System.out.println("Starting cred ni Mia: "+Mia.getCreds());
        System.out.println("Startingt cred ni Luis: "+Luis.getCreds());
        System.out.println("Mia prints 4 pages: "+Mia.pages(4));
        System.out.println("Mias new cred: "+Mia.getCreds());
        System.out.println("Mia prints 7 pages: "+Mia.pages(7));
        System.out.println("Mias new cred: "+Mia.getCreds());
        System.out.println("Mia added -3 Credits "+Mia.addCredits(-3));
        System.out.println("Mias new cred: "+Mia.getCreds());
        System.out.println("Mia added 4 Credits "+Mia.addCredits(4));
        System.out.println("Mias new cred: "+Mia.getCreds());
        System.out.println("Luis new cred: "+Luis.getCreds());
        
        /*
 * - Prompt used: "is this correct?" 
     (after writing my initial PrintAccount fields, constructor, and addCredits method, 
      and later checking my Main.java test cases).
        
 * - Accepted: Added the missing int credits parameter to the PrintAccount constructor, 
     removed the stray semicolon after if (amount <= 0) in addCredits.
        
 * - Rejected: Kept my own variable naming style and print message 
     formatting in Main.java instead of copying the AI's print labels verbatim.
        
 * - How I checked it: Compiled and ran both PrintAccount.java and Main.java, 
     then verified each line of console output against the expected values on Page 3 (10, 0, true/6, false/6, false/6, true/10).
 */
    }
    
}
