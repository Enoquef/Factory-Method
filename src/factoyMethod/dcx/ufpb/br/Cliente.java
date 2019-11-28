package factoyMethod.dcx.ufpb.br;

public class Cliente {

	public static void main(String[] args) {
		FabricaDeMoto fabrica = new FabricaHonda();
		Moto moto = fabrica.CriarMoto();
		moto.exibirInfo();
		System.out.println();

		fabrica = new FabricaYamaha();
		moto = fabrica.CriarMoto();
		moto.exibirInfo();
		System.out.println();

		fabrica = new FabricaSuzuki();
		moto = fabrica.CriarMoto();
		moto.exibirInfo();
		System.out.println();

		fabrica = new FabricaKtm();
		moto = fabrica.CriarMoto();
		moto.exibirInfo();
	}

}
