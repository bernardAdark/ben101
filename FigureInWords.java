//This program converts figures to words. created by MEGYEWODI

import java.util.Scanner;
public class FigureInWords {
    
    static int figAmount;
	static String []below20 = new String[]{"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "Eleven", 
                                  "twelve", "thirteen", "fourteen", "fifteen", "sixteen","seventeen", "eighteen", "nineteen",};
	static String []twoFigure = new String[]{"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};  

	public static void main(String [] args){
		System.out.println("\n            WELCOME TO MY FIGURE TO WORDS CONVERTER ");
		prompt();
	}

    public static void prompt(){
         System.out.print("Enter a number to convert to words (or 'done' to quit):");
         Scanner inp = new Scanner(System.in);
         check(inp.nextLine());
         System.out.println(convert(figAmount));
         prompt();     
    }

    private static void check(String s){
        if (s.equalsIgnoreCase("done")) {
            exit("Thank You for using our Service");}
        else{
            try{
              figAmount = Integer.parseInt(s);
            }
            catch(NumberFormatException err){
                exit("You entered a wrong value");
            }
         if(figAmount < 0){
               System.out.print("Negative ");
               figAmount = Math.abs(figAmount); 
               }
            
        }
    }

   private static String convert(int value){ 
   if(within(value, 0, 19)){
      		return below20[value];
		}else if((value >= 20) && (value <= 90) && (value %10 == 0)){
      		return twoFigure[(value / 10) - 2];
		}
      	else if(within(value,20,99)){
	      int bin = (value  / 10) * 10;
	      int uni = value  %  10;
	      return convert(bin) + "-" + convert(uni);
	  	}
    	else if(within(value,100,999)){
    		return(goOver(value,100,"hundred"));	
    	}	
    	else if(within(value,1000,999999)){
      		return goOver(value,1000,"thousand");
    	}
    	else if(within(value,1000000,999999999)){
      		return goOver(value,1000000,"million");
    	}
    	else if(within(value,1000000000, 2147483647)){
      		return goOver(value,1000000000,"billion");
    	}else{return "";}
	 }

    private static void exit(String x){
     System.out.println(x);
     System.exit(0);
    }

    private static String goOver(int val, int chk, String word){
	    int range = val / chk;
	    int overflow = val % chk;
	    if (overflow > 0)
	      return convert(range) + " "  + word +" " + ((chk == 100) || (overflow < 100)? "and ":"")  + convert(overflow);
	    else
	      return convert(range) + " " + word;
    }
	private static boolean within(int x, int lower, int upper){
		return (lower <= x) && (x <= upper);
	}
}
     
    
    
    
    

