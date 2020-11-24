package ex3;

import java.util.ArrayList;
import java.util.List;

public class Colecao {
	public static void main(String[] args) {
		

	List<Produtos> prod = new ArrayList<Produtos>();
	
	prod.add(new Produtos("blusa", (float) 12.5));
	prod.add(new Produtos("camiseta", (float) 5.8));
	prod.add(new Produtos("meia", (float) 2.5));
	
	
	System.out.println(prod);
	
	prod.remove(0);
	
	System.out.println(prod);
	
	prod.get(1).setPreco((float) 1.5);
	
	System.out.println(prod);
	
	}
	
}
