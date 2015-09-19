	/// Bernard Adarkwah and Chiamaka Nwolisa
	/// Calculator assignment code in JAVA

	import java.util.Scanner;
	public class Calculator{

		public static void main(String [] args){

			Scanner inp = new Scanner(System.in);

			System.out.println("WELCOME TO MY CALCULATOR");
			System.out.println("What operation do you want to perform?");
			
			System.out.println("1>>>ADD");
			System.out.println("2>>>MULTIPLY");
			System.out.println("3>>>SUBTRACT");
			System.out.println("4>>>DIVIDE");
			System.out.println("5>>>MODULO");
			System.out.println("6>>>EXPONENT");
			System.out.println("7>>>SQUAREROOT");
			System.out.println("8>>>AVERAGE");


			int sign = inp.nextInt();
			while(sign > 8 || sign < 1){
				System.out.print("Please re-enter operator number 1-8: ");
				sign = inp.nextInt();
			}

			if (sign == 7){
				System.out.println("Enter your number");
				int chi = inp.nextInt();
				squareRoot(chi);
				
			}else if (sign == 6){
					System.out.println("Enter First number");
					int num1 = inp.nextInt();
					System.out.println("Enter Second number");
					int num2 = inp.nextInt();
					 exponent(num1 , num2 );
			}else if (sign == 8){ 
					System.out.println("Enter First number");
					int num1 = inp.nextInt();
					System.out.println("Enter Second number");
					int num2 = inp.nextInt();
					average(num1 , num2 );
				}

			else{

				System.out.println("Enter First number");
				double one = inp.nextDouble();
				System.out.println("Enter Second number");
				double two = inp.nextDouble();

				if (sign == 1){ 
					add(one , two );
				}else if (sign == 3){
				 subtract(one , two );
				}else if (sign == 2){ 
					multiply(one , two);
				}else if (sign == 4){
				 divide(one , two );
				}else if (sign == 5){ 
					modulo(one , two );
				}
			}
		}

		
		public static void add(double a, double b){

			System.out.println("The sum of the numbers is " + (a + b));
		}


		public static void subtract(double a, double b){

			System.out.println("The difference of the numbers is " + (a - b));
		}

		public static void modulo(double a, double b){

			System.out.println("The modulo of the numbers is " + (a % b));
		}


		public static void multiply(double a, double b){

			System.out.println("The product of the numbers is " + (a * b));
		}


		public static void divide(double a, double b){
			if(b == 0){
				System.out.println("Maths Error");
			}
			else {

				System.out.println("The product of the numbers is " + (a / b));
			}
		}
		
		public static void exponent(int one, int two){
			int result = 1;
			for(int i = 0 ; i< two ; i++){
				result *= one;
			}
			System.out.println ("The exponent of the numbers is " + result);
		}

		public static void squareRoot(int a){
			double check;
			double result = a / 2 ;

			do{
				check = result;
				result = (check + ( a / check)) /2;

			}
			   while((check- result) != 0);

			System.out.println("The square root of " + a + " is " + result);
		}

		public static void average(int a, int b){
			float answer = (float)a + (((float)b - (float)a) / 2) ;

			System.out.println("The average of the numbers is " + answer);
		}


	}