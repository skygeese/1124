
public class Test {//¼ì²â´úÂë
	public static void main(String[] args) {
		BinaryOperation bop;
		for (int i = 0; i < 50; i++) {
			if (i%5==0) {
				System.out.println();
			}
			bop = new AdditionOperation();
			System.out.print(bop+"\t");
			
		}
		
		System.out.println("\n"+"=================================================");
		System.out.println("=================================================");
		
		for (int i = 0; i < 50; i++) {
			if (i%5==0) {
				System.out.println();
			}
			bop = new SubstractOperation();
			System.out.print(bop+"\t");
			
		}
	}
	
}
