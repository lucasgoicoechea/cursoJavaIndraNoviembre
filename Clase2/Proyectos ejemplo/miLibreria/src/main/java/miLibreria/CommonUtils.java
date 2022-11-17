package miLibreria;


/*CLASE SINGLETON O PATRON SINGLETON*/ 
public class CommonUtils {
	
	public static CommonUtils instances = new CommonUtils();
	
	public CommonUtils() {
		if (CommonUtils.instances != null) {
			return;
		}
		CommonUtils.instances = new CommonUtils();
	}
	
	public int sumaCien(int nro) {
		return nro + 100;
	}

}
