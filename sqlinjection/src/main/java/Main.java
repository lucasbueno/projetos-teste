
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		UtilBD.initBD();

		Scanner in = new Scanner(System.in);
		String op = "";
		do {
			System.out.println("(S)air");
			System.out.println("Cadastrar o (g)ênero de um jogo");
			System.out.println("Cadastrar um (j)ogo");
			op = in.nextLine();

			if (op.toLowerCase().contentEquals("g")) {
				System.out.println("------------------------");
				System.out.println("Digite o nome do gênero: ");
				String nome = in.nextLine();
				UtilBD.alterarBD("INSERT INTO Genero VALUES ('" + nome + "')");
			}

		} while (!op.toLowerCase().contentEquals("s"));

		UtilBD.fecharConexao();
	}

}
