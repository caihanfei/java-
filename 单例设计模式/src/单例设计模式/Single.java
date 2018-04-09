package 单例设计模式;

public class Single {
	public static void main(String[] args) {
		ehan e = ehan.getInstance();
		lanhan l = lanhan.getInstance();
	}
}
//饿汉式单例设计模式 只可以创建一个对象
class ehan{
	private static ehan s = new ehan();
	private ehan(){}
	public static ehan getInstance(){
		return s;
	}
}


//懒汉式单例设计模式 只可以创建一个对象  延迟加载 节约内存空间
class lanhan{
	private static lanhan s = null;
	private lanhan(){}
	public static lanhan getInstance(){
		if(s==null)
			s = new lanhan();
			return s;
	}
}