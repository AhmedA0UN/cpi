
class Somme{
	public static <T1 extends Number, T2 extends Number> void calculer(T1 a, T2 b) {
		System.out.println(a.doubleValue()+b.doubleValue());
	}
}

public class TestSomme {
	public static void main(String[] args) {
		Somme.calculer(4, 7);
		Somme.calculer(4.1, 7.6);

	}

}
