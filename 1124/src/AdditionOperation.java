

class AdditionOperation extends BinaryOperation{
	AdditionOperation(){
		generateBinaryOperation('+');
	}
	public boolean checkingCalculation(int anInteger){
	//������д��ʹ�������ʽ���Ϲ涨�ļӷ���ʽ��׼
		if(anInteger<=upper)
			return true;
		else
			return false;
	}
	int calculate(int left,int right){
		return left + right;	
	}
}

class SubstractOperation extends BinaryOperation{
	SubstractOperation(){
		generateBinaryOperation('-');
	}
	public boolean checkingCalculation(int anInteger){
	//������д��ʹ�������ʽ���Ϲ涨�ļ�����ʽ��׼
		if(anInteger>=lower)
			return true;
		else
			return false;
	}
	int calculate(int left,int right){
		return left - right;
	}
}
