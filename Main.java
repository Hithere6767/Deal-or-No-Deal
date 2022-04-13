import java.util.Scanner;
class Main {
   public static void JOptionDisplayAlt(String display)
    {
        System.out.println(display);
    }
    public static int JOptionConfirmAlt(String Display)
    {
        Scanner keyb = new Scanner(System.in);
        System.out.println(Display +"Enter Yes or No");
        while(true)
        {
            String Choice = keyb.nextLine();
            if(Choice.toLowerCase().contains("y"))
                return 0;
            else if(Choice.toLowerCase().contains("n"))
                return 1;
        }
    }
    
    
    public static int JOptionOptionDialALT(String CasesLeft[], String ValuesLeft[])
    {
        Scanner keyb = new Scanner(System.in);
        String topline = "";
        String bottomLine = "";
        if(CasesLeft.length!= ValuesLeft.length)
        {
            System.err.println("Lengths dont match");
        }
        for(int i = 0; i< Math.min(CasesLeft.length, ValuesLeft.length); i++)
        {
            String t = CasesLeft[i];
            int lent = Math.max(CasesLeft[i].length(), ValuesLeft[i].length());
            String format = "%"+(lent+1)+"s";
            topline += String.format(format, ValuesLeft[i]);
            bottomLine += String.format(format, CasesLeft[i]);
        }
        System.out.println( topline);
        System.out.println( bottomLine);
        int casepicked = 0;
        while (casepicked == 0)
        {
            System.out.println("What Case do you want");
            String choice = keyb.nextLine();
            for(int i=0; i< CasesLeft.length; i++)
            {
                if(choice.contains(CasesLeft[i]))
                    return i;
            }
            System.out.println("You didn't choose a correct Case");
        }
        return 0;
    }
  public class Cases {
    private int[] cases;

    public Cases() {
      cases = new int[27];
      cases[0] = 0;
      cases[1] = 1;
      cases[2] = 2;
      cases[3] = 5;
      cases[4] = 10;
      cases[5] = 25;
      cases[6] = 50;
      cases[7] = 75;
      cases[8] = 100;
      cases[9] = 200;
      cases[10] = 300;
      cases[11] = 400;
      cases[12] = 500;
      cases[13] = 750;
      cases[14] = 1000;
      cases[15] = 5000;
      cases[16] = 10000;
      cases[17] = 25000;
      cases[18] = 50000;
      cases[19] = 75000;
      cases[20] = 100000;
      cases[21] = 200000;
      cases[22] = 300000;
      cases[23] = 400000;
      cases[24] = 500000;
      cases[25] = 750000;
      cases[26] = 1000000;
    }
    public String toString() {
      String temp = "";
      for (int i = 0; i < cases.length; i++) {
        temp += cases[i];
      }
    }
  }
  public class DealOrNoDealMain {
  public static void DealMain(String[] args) {
    Cases test = new Cases();

    System.out.println(test);
  }
}
  public static void main(String[] args) {
    System.out.println(DealMain);
  }
}