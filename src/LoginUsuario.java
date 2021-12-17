import java.util.Objects;
import java.util.Scanner;

public class LoginUsuario {
    public static void main(String[] args) {

        Scanner scan_name = new Scanner(System.in);
        Scanner scan_pass = new Scanner(System.in);

        String name;
        String pass;

        do{
            System.out.println("ATENÇÃO! Login e senha precisam ser diferentes!");
            System.out.println("\nDigite o nome para login: ");
            name = scan_name.next();
            System.out.println("Digite uma senha: ");
            pass = scan_pass.next();
        }while(Objects.equals(name, pass));
        System.out.println("\nRegistrado com sucesso!");
    }
}
