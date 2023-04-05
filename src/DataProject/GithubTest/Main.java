package DataProject.GithubTest;

public class Main{
	public static void main(String [] args) {
		if (args.length == 2) {
			Addition A =  new  Addition(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
			System.out.println("Le résultat de l'addition est"+ A.calcul());
		}
		else {
			System.out.println(Addition.error());
		}
	}
}