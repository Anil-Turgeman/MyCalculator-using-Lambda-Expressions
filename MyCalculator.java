package Q3;
import java.util.Scanner;
import java.util.function.*;

public class MyCalculator {

	interface ComplexCalc {
		double calc(double re1, double im1, double re2, double im2);
	}

	void menu(){
		while(true){
			System.out.print("Enter type of variable : I (int), D (double), C (complex) or E for exit\n");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			switch ( input ) {
			case "I":
				intCalc();
				break;
			case "D":
				doubleCalc();
				break;
			case "C":
				complexCalc();
				break;
			case "E":
				System.out.print("\nEND\n") ;
				System.exit(0);
				break;
			default:
				System.out.print("Enter I, D, C or E\n") ;
				break;
			}
		}
	}

	private void complexCalc() {
		System.out.println("Enter operation :\n+ (addition)\n- (subtraction)\n* (multiplication)\n/ (division)");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String real1;
		String img1;
		String real2;
		String img2;
		Scanner sc1;
		switch ( input ) {
		case "+":
			System.out.println("please enter a real1: ");
			sc1 = new Scanner(System.in);
			real1 = sc1.nextLine();
			System.out.println("please enter a img1: ");
			sc1 = new Scanner(System.in);
			img1 = sc1.nextLine();
			System.out.println(String.format("the first number is (%s)+(%s)i",real1,img1));
			System.out.println("please enter a real2: ");
			sc1 = new Scanner(System.in);
			real2 = sc1.nextLine();
			System.out.println("please enter a img2: ");
			sc1 = new Scanner(System.in);
			img2 = sc1.nextLine();
			System.out.println(String.format("the first number is (%s)+(%s)i",real2,img2));
			System.out.println(String.format("addition: (%f)+(%f)i",Double.parseDouble(real1)+Double.parseDouble(real2),Double.parseDouble(img1)+Double.parseDouble(img2)));
		case "-":
			System.out.println("please enter a real1: ");
			sc1 = new Scanner(System.in);
			real1 = sc1.nextLine();
			System.out.println("please enter a img1: ");
			sc1 = new Scanner(System.in);
			img1 = sc1.nextLine();
			System.out.println(String.format("the first number is (%s)+(%s)i",real1,img1));
			System.out.println("please enter a real2: ");
			sc1 = new Scanner(System.in);
			real2 = sc1.nextLine();
			System.out.println("please enter a img2: ");
			sc1 = new Scanner(System.in);
			img2 = sc1.nextLine();
			System.out.println(String.format("the first number is (%s)+(%s)i",real2,img2));
			System.out.println(String.format("subtraction: (%f)+(%f)i",Double.parseDouble(real1)-Double.parseDouble(real2),Double.parseDouble(img1)-Double.parseDouble(img2)));
		case "*":
			System.out.println("please enter a real1: ");
			sc1 = new Scanner(System.in);
			real1 = sc1.nextLine();
			System.out.println("please enter a img1: ");
			sc1 = new Scanner(System.in);
			img1 = sc1.nextLine();
			System.out.println(String.format("the first number is (%s)+(%s)i",real1,img1));
			System.out.println("please enter a real2: ");
			sc1 = new Scanner(System.in);
			real2 = sc1.nextLine();
			System.out.println("please enter a img2: ");
			sc1 = new Scanner(System.in);
			img2 = sc1.nextLine();
			System.out.println(String.format("the first number is (%s)+(%s)i",real2,img2));
			System.out.println(String.format("subtraction: (%f)+(%f)i",(Double.parseDouble(real1)*Double.parseDouble(real2)-(Double.parseDouble(img1)*Double.parseDouble(img2))),(Double.parseDouble(real1)*Double.parseDouble(img2))+(Double.parseDouble(img1)*Double.parseDouble(real2))));
		case "/":
			System.out.println("please enter a real1: ");
			sc1 = new Scanner(System.in);
			real1 = sc1.nextLine();
			System.out.println("please enter a img1: ");
			sc1 = new Scanner(System.in);
			img1 = sc1.nextLine();
			System.out.println(String.format("the first number is (%s)+(%s)i",real1,img1));
			System.out.println("please enter a real2: ");
			sc1 = new Scanner(System.in);
			real2 = sc1.nextLine();
			System.out.println("please enter a img2: ");
			sc1 = new Scanner(System.in);
			img2 = sc1.nextLine();
			System.out.println(String.format("the first number is (%s)+(%s)i",real2,img2));
			Double a = Double.parseDouble(real1);
			Double c = Double.parseDouble(real2);
			Double b = Double.parseDouble(img1);
			Double d = Double.parseDouble(img2);
			System.out.println(String.format("subtraction: (%f)+(%f)i",(((a*c)+(b*d))/((c*c)+(d*d))),(((b*c)-(a*d))/((c*c)+(d*d)))));
		}


	}

	private void doubleCalc() {
		System.out.println("Enter operation :\n+ (addition)\n- (subtraction)\n* (multiplication)\n/ (division)\nSR (square root(n))\nS  (square n²)\nCOS (cos(n))\nSIN (sin(n))\nLOG ( log(n))");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String a1;
		String b1;
		Scanner sc1;
		switch ( input ) {
		case "+":
			BinaryOperator<Double> bo1=(a,b)->a+b;
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			b1 = sc1.nextLine();
			System.out.println(bo1.apply(Double.parseDouble(a1), Double.parseDouble(b1)));
			break;
		case "-":
			BinaryOperator<Double> bo2=(a,b)->a-b;
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			b1 = sc1.nextLine();
			System.out.println(bo2.apply(Double.parseDouble(a1), Double.parseDouble(b1)));
			break;
		case "*":
			BinaryOperator<Double> bo3=(a,b)->a*b;
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			b1 = sc1.nextLine();
			System.out.println(bo3.apply(Double.parseDouble(a1), Double.parseDouble(b1)));
			break;
		case "/":
			BinaryOperator<Double> bo4=(a,b)->a/b;
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			b1 = sc1.nextLine();
			System.out.println(bo4.apply(Double.parseDouble(a1), Double.parseDouble(b1)));
			break;
		case "S":
			UnaryOperator<Double> bo8=(a)->a*a;
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println(bo8.apply(Double.parseDouble(a1)));
			break;
		case "SR":
			UnaryOperator<Double> bo11=(a)->Math.sqrt(a);
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println(bo11.apply(Double.parseDouble(a1)));
			break;
		case "COS":
			UnaryOperator<Double> bo9=(a)->Math.cos(a);
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println(bo9.apply(Double.parseDouble(a1)));
			break;
		case "SIN":
			UnaryOperator<Double> bo13=(a)->Math.sin(a);
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println(bo13.apply(Double.parseDouble(a1)));
			break;
		case "LOG":
			UnaryOperator<Double> bo14=(a)->Math.log10(a);
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println(bo14.apply(Double.parseDouble(a1)));
			break;
		default:
			System.out.print("Enter operation :\n+ (addition)\n- (subtraction)\n* (multiplication)\n/ (division)\n% (remainder)\nMAX (maximum)\nMIN (minimum)\nS square (n²)\nF (factorial)") ;
			break;
		}
	}

	private void intCalc() {
		System.out.println("Enter operation :\n+ (addition)\n- (subtraction)\n* (multiplication)\n/ (division)\n% (remainder)\nMAX (maximum)\nMIN (minimum)\nS square (n²)\nF (factorial)\nFI (fibonaci)");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String a1;
		String b1;
		Scanner sc1;
		switch ( input ) {
		case "+":
			BinaryOperator<Integer> bo1=(a,b)->a+b;
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			b1 = sc1.nextLine();
			System.out.println(bo1.apply(Integer.parseInt(a1), Integer.parseInt(b1)));
			break;
		case "-":
			BinaryOperator<Integer> bo2=(a,b)->a-b;
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			b1 = sc1.nextLine();
			System.out.println(bo2.apply(Integer.parseInt(a1), Integer.parseInt(b1)));
			break;
		case "*":
			BinaryOperator<Integer> bo3=(a,b)->a*b;
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			b1 = sc1.nextLine();
			System.out.println(bo3.apply(Integer.parseInt(a1), Integer.parseInt(b1)));
			break;
		case "/":
			BinaryOperator<Integer> bo4=(a,b)->a/b;
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			b1 = sc1.nextLine();
			System.out.println(bo4.apply(Integer.parseInt(a1), Integer.parseInt(b1)));
			break;
		case "%":
			BinaryOperator<Integer> bo5=(a,b)->a%b;
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			b1 = sc1.nextLine();
			System.out.println(bo5.apply(Integer.parseInt(a1), Integer.parseInt(b1)));
			break;
		case "MAX":
			BinaryOperator<Integer> bo6=(a,b)->Math.max(a, b);
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			b1 = sc1.nextLine();
			System.out.println(bo6.apply(Integer.parseInt(a1), Integer.parseInt(b1)));
			break;
		case "MIN":
			BinaryOperator<Integer> bo7=(a,b)->Math.min(a, b);
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			b1 = sc1.nextLine();
			System.out.println(bo7.apply(Integer.parseInt(a1), Integer.parseInt(b1)));
			break;
		case "S":
			UnaryOperator<Integer> bo8=(a)->a*a;
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println(bo8.apply(Integer.parseInt(a1)));
			break;
		case "F":
			UnaryOperator<Integer> bo9=(a)->{
				int result = 1;
				for(int i = 1; i <= a; i++){
					result *= i;
				}
				return result;
			};
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println(bo9.apply(Integer.parseInt(a1)));
			break;
		case "FI":
			UnaryOperator<Integer> bo10=(a)->{
				int result = 1;
				int result1 = 1;
				for(int i = 1; i < 11; i++){
					int temp = result1;
					result1 = result;
					result += temp;
				}
				return result;
			};
			System.out.println("please enter a number: ");
			sc1 = new Scanner(System.in);
			a1 = sc1.nextLine();
			System.out.println(bo10.apply(Integer.parseInt(a1)));
			break;
		default:
			System.out.print("Enter operation :\n+ (addition)\n- (subtraction)\n* (multiplication)\n/ (division)\n% (remainder)\nMAX (maximum)\nMIN (minimum)\nS square (n²)\nF (factorial)") ;
			break;
		}
	}

	public static void main(String[] args) {
		System.out.println(Math.sin(Math.PI/2));
		MyCalculator mc = new MyCalculator();
		mc.menu();	
	}
}