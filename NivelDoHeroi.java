import java.util.Scanner;

public class NivelDoHeroi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Armazenar o nome e a quantidade de experiência (XP) do herói
        System.out.print("Digite o nome do herói: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade de experiência (XP) do herói: ");
        int xp = scanner.nextInt();

        // Inicializar a variável de nível
        String nivel;

        // Estrutura de decisão para determinar o nível do herói com base na XP
        if (xp < 1000) {
            nivel = "Ferro";
        } else if (xp >= 1001 && xp <= 2000) {
            nivel = "Bronze";
        } else if (xp >= 2001 && xp <= 5000) {
            nivel = "Prata";
        } else if (xp >= 5001 && xp <= 7000) {
            nivel = "Ouro";
        } else if (xp >= 7001 && xp <= 8000) {
            nivel = "Platina";
        } else if (xp >= 8001 && xp <= 9000) {
            nivel = "Ascendente";
        } else if (xp >= 9001 && xp <= 10000) {
            nivel = "Imortal";
        } else {  // xp > 10000
            nivel = "Radiante";
        }

        // Saída final
        System.out.println("O Herói de nome " + nome + " está no nível de " + nivel + ".");

        scanner.close();
    }
}