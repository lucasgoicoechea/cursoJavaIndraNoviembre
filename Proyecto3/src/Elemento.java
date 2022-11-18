
public class Elemento implements IElemento{

	protected int size;
	
	
	
	public Elemento(int size) {
		super();
		this.size = size;
	}
	
	public Elemento() {
		super();
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rePainted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
