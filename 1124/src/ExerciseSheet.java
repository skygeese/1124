import java.util.ArrayList;
import java.util.Random;

class Exercise {
	public ArrayList<BinaryOperation> operationList = new ArrayList<BinaryOperation>();
	private int current = 0;//���ڱ������ݼ�

	public void generateBinaryExercise(int operationCount) {
		// ��������generateOperation����������ɵļӷ����߼�����ʽ���뵽��̬������
		BinaryOperation anOperation;
		while (operationCount > 0) {
			do {
				anOperation = generateOperation();
			} while (Container(anOperation));
			operationList.add(anOperation);// ��anOperation ���뵽Exercise��
			operationCount--;
		}
	}

	public void generateAdditionExercise(int operationCount) {
		BinaryOperation anOperation;
		while (operationCount > 0) {
			do {
				anOperation = additionOperation();
			} while (Container(anOperation));
			operationList.add(anOperation);// ��anOperation ���뵽Exercise��
			operationCount--;
		}
	}
	
	public void generateSubstractExercise(int operationCount) {
		BinaryOperation anOperation;
		while (operationCount > 0) {
			do {
				anOperation = substractOperation();
			} while (Container(anOperation));
			operationList.add(anOperation);// ��anOperation ���뵽Exercise��
			operationCount--;
		}
	}

	private boolean Container(BinaryOperation anOperation) {
		boolean flag = false;
		if (operationList.contains(anOperation)) {
			flag = true;
		}
		return flag;
	}

	private BinaryOperation generateOperation() {
		// �������һ���ӷ����߼�����ʽ������
		Random random = new Random();
		int opValue = random.nextInt(2);
		if (opValue == 1) {
			return new AdditionOperation();
		}
		return new SubstractOperation();
	}
	
	private BinaryOperation additionOperation() {
		return new AdditionOperation();
	}
	
	private BinaryOperation substractOperation() {
		return new SubstractOperation();
	}
	
	

	public boolean hasNext() { // ����Ԫ�أ�����true�����򷵻�false
		return current <= operationList.size() - 1;
	}

	public BinaryOperation next() { // ����Ԫ�أ����ص�ǰԪ�أ��ƶ�����һ��
		return operationList.get(current++);
	}
}



public class ExerciseSheet {
	private static final short COLUMN_NUMBER=5;
	public void formattedDisplay(Exercise ex,int columns) {
		
		int col = columns;
		int num = 0;
		while(ex.hasNext()){
			col--;
			num++;
			System.out.printf("%-5s%-15s",num+".",ex.next());
			if(col==0){
				System.out.println("");
				col = columns;
			}
		}
		System.out.println("");
	}
	
	public void formattedDisplay(Exercise ex) {  //Ĭ�ϣ�ÿ�д�ӡ5����ʽ
		formattedDisplay(ex,COLUMN_NUMBER);
	}
	
	private static void print(String str) {
		System.out.print(str);
	}
	//һ��Ӧ�� 
	public static void main(String[] args) {
		ExerciseSheet sheet = new ExerciseSheet();
		Exercise exercise = new Exercise();
		exercise.generateBinaryExercise(50);
		System.out.println("----generate and display exercises----");
		sheet.formattedDisplay(exercise, 5);
		exercise.generateAdditionExercise(50);
		System.out.println("----generate and display add exercises----");
		sheet.formattedDisplay(exercise, 5);
		exercise.generateSubstractExercise(50);
		System.out.println("----generate and display sub exercises----");
		sheet.formattedDisplay(exercise, 5);
	}
}
