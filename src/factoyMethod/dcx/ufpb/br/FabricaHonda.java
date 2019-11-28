package factoyMethod.dcx.ufpb.br;

public class FabricaHonda implements FabricaDeMoto{
	
	@Override
	public Moto CriarMoto() {
		return new Crf230();
	}

}
