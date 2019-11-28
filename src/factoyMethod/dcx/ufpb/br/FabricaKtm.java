package factoyMethod.dcx.ufpb.br;

public class FabricaKtm implements FabricaDeMoto {

	@Override
	public Moto CriarMoto() {
	
		return new Exc125();
	}

}
