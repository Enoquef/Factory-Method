package factoyMethod.dcx.ufpb.br;

public class FabricaYamaha implements FabricaDeMoto {

	@Override
	public Moto CriarMoto() {
		return new Yz125();
	}

}
