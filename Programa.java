public class Programa {
	public static void main(String[] args) {
		Filme f = new Filme();
		f.setCodigo(468);
		f.setNome("Forest Gump");
		f.setValor(5.50);
		f.devolver();
		
		f.mostra();
		
		f.retirar();
		
		f.mostra();
		
		try {
			f.retirar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}