import java.util.Objects;
import java.util.Scanner;

public class LoginUsuario {
    public static void main(String[] args) {

        Scanner scan_name = new Scanner(System.in);
        Scanner scan_pass = new Scanner(System.in);

        String name;
        String pass;

        while(true){
            System.out.println("\nDigite o nome para login: ");
            name = scan_name.next();
            System.out.println("Digite uma senha: ");
            pass = scan_pass.next();
            if(name.equals(pass)){
                System.out.println("\nNome e login não podem ser iguais!");
            }else{
                System.out.println("\nConseguiu.");
                break;
            }
        }
    }
}
