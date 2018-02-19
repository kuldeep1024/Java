import java.util.ArrayList;
import java.util.List;

public class GenericsWildCardUooerBound {
	public static void main(String[] args) {
		List<? extends Number> list = new ArrayList<>();

		//list.add((MyCls)12);
		//list.add(new Double(12.9));

		//list.add(new Object());
		list.add(null);
		
		
	}
}
class MyCls extends Number{

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}