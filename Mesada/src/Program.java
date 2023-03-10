import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        
        try (Scanner leitor = new Scanner(System.in)) {
            int mesada = 50;
            int entrada = leitor.nextInt();

      Calcula.calculaMes(mesada, entrada);
        }
    }
}
