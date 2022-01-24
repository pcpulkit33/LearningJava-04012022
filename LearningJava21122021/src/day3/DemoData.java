package day3;

public class DemoData {

	public static void main(String[] args) {
		
		Data<String> data = new Data<String>();
		
		data.setDatatype("Setting a String value");
		
		System.out.println(data.getDatatype());
		
		//----------------------------------------

		Data<Integer> intdata = new Data<>();
		
		intdata.setDatatype(5100);
		
		System.out.println(intdata.getDatatype());
		
		
	}

}
