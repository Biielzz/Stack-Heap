package Controller;

class Estouro {
		int [][] arr = new int [100000][10000];
		public Estouro proximo;
}		
public class Heap {
public static void main(String[] args) {
		
		Estouro raiz = new Estouro();
		Estouro e = raiz;
		int cont = 0;
		while (true) {
			System.out.println(cont++);
		e.proximo = new Estouro();
		e = e.proximo;
		
			}
	
		}
	}
