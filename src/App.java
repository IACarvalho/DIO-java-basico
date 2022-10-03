public class App {
    public static void main(String[] args) throws Exception {
        // Tipos e variáveis

        // Numéricos

        // Números inteiros
        byte numerico1; // 1 byte de -128 a 127
        short numerico2; // 2 bytes de -32.768 a 32.767
        int numerico3; // 4 bytes de -2.147.483.648 a 2.147.483.647
        long numerico4; // 8 bytes -9.223.327.036.854.775.808 a 9.223.327.036.854.775.807

        // Números fracionarios
        float numerico5; // 4 bytes de -3,4028E + 38 a 3,4028E + 38
        double numerico6; // 8 bytes de -1,7976 + 308 a 1,7976 + 308

        // Tanto long quanto float tem condições especiais. Para identificar que uma variável é do tipo long tem que passar um "L" ao final
        // E para identificar e tipo floata tem que passar um "F" no final

        float pi = 3.14F;
        long estrelasNoUniverso = 9223327036854775807L;

        // O java faz a "converção" automãtica (casting) dos tipos numéricos dos tipos com menos bytes para os tipos com mais
        // Por exemplo converte o tipo byte para int, mas não faz o inverso. Porque o número em uma variável int pode ser maior que o suportado por uma variável byt.

        // Tipos restantes
        boolean booleano; // Representa valores verdareiros e falsos
        char letra; // um char é uma letra

        // Variaveis vs Constantes
        // Variáveis são valores que podem ser mudados com o decorrer da aplicação, já as constantes permanecem com o memso valor até o final da aplicação
        // Para declarar uma constante basta fazer uso da palavra reservada final, mas existe algumas convenções
        // O nome tem que que ser escrito em caixa alta
        // A separação das palavras é feita por um underscore
        final double VALOR_DE_PI = 3.14;


    }
}
/*  */