package �������ģʽ;

public class Single {
	public static void main(String[] args) {
		ehan e = ehan.getInstance();
		lanhan l = lanhan.getInstance();
	}
}
//����ʽ�������ģʽ ֻ���Դ���һ������
class ehan{
	private static ehan s = new ehan();
	private ehan(){}
	public static ehan getInstance(){
		return s;
	}
}


//����ʽ�������ģʽ ֻ���Դ���һ������  �ӳټ��� ��Լ�ڴ�ռ�
class lanhan{
	private static lanhan s = null;
	private lanhan(){}
	public static lanhan getInstance(){
		if(s==null)
			s = new lanhan();
			return s;
	}
}