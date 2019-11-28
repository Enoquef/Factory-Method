package factoyMethod.dcx.ufpb.br;

public class FabricaSuzuki implements FabricaDeMoto {

	@Override
	public Moto CriarMoto() {
		
		return new RmZ();
	}

}
