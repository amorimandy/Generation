package teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class teste {
	
	public static void main(String[] args) {
		
		Date data = null;
		String nascimento = "2012/02/21";
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			data = dateFormat.parse(nascimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(data);
	}
}
