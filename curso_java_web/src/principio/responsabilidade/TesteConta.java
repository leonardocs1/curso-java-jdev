package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancaria do Leonardo");
		
		System.out.println(bancaria);
		
		bancaria.diminui100();
		bancaria.diminui100();
		
		System.out.println(bancaria);
		
		bancaria.sacarDinheiro(400);
		
		System.out.println(bancaria);
		
		bancaria.depositoDinheiro(1000);
		
		System.out.println(bancaria);

	}

}
