public class TesteWrappers {

	public static void main(String[] args) {
		
		Integer i = Integer.valueOf("10");
		int ii = Integer.parseInt("10");
		byte b = i.byteValue();
		
		byte bb = i.byteValue();
		
		Integer idAluno = 500;
		
		System.out.println( idAluno.intValue() == 500 );
		
	
	}
}
