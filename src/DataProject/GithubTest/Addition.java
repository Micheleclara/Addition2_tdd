package DataProject.GithubTest;

public class Addition{
	
	private int a;
	private int b;
	
	public Addition (int A, int B) {
		this.a= A;
		this.b= B;
	}

	public int calcul() {
		return this.a + this.b;
	}
	
	public static String error() {
		return "vous n'avez pas renseignez tous les paramètres";
	}
}