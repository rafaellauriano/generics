package servico;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	private List<T> list = new ArrayList<>();
	
	public void addValor(T valor) {
		list.add(valor);
	}
	
	public T primeiro() {
		if(list.isEmpty()) {
			throw new IllegalStateException("Lista está vazia");
		}
		return list.get(0);
	}
	
	public void imprimir() {
		System.out.print("[");
		//se lista não estiver vazia 
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for(int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
	

}
