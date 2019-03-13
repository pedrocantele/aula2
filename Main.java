class Main{
	public static void main(String args[]){
		Pessoa pedro;
		pedro = new Pessoa();
		pedro.idade = 20;
		pedro.anoNascimento = 1998;
		pedro.altura = 1.83;
		System.out.println(pedro.idade+" "+pedro.anoNascimento+" "+pedro.altura);
	}
}