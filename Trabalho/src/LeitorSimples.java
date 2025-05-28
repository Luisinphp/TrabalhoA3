import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class LeitorSimples {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("frase.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(">> " + linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}