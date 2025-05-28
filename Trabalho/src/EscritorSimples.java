import java.io.FileWriter;
import java.io.IOException;

public class EscritorSimples {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("frase.txt")) {
            fw.write("A prática leva à perfeição!");
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo.");
            e.printStackTrace();
        }
    }
}