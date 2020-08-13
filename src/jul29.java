
public class jul29 {
	public static void main(String[]args) {
		FactoryCreator f1=   FactoryCreator.getInstance(FactoryCreator.type.A);
		
		f1.spuneAltceva();
		f1.spuneCeva();
		FactoryCreator f2=   FactoryCreator.getInstance(FactoryCreator.type.B);

	}
}
