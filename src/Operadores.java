public class Operadores {
  public static void main(String[] args) {
    // Operador de atribuição
      // O operador de atribuição é o sinal de igualdade "="
      // Serve para atribuir um valor para uma variável
        String atribuicao = "Atribuição";

    // Operadores aritméticos
      // Operadores para operações matemáticas
      // + -> soma
        int soma = 5 + 3;
        // Caso seja usado em strings irá concatenar, ou seja juntar as duas strings
        String concatenacao = "So" + "ma"; // O valor será: "Soma"
        // A partir do momento que encontrar um caracter junto de números irá realizar a concatenação
      // - -> subtração
        int subtracao = 5 -4;
      // * -> multiplicação
        int multiplicacao = 3 * 5;
      // / -> divisçao
        double divisao = 14 / 4;
      // % -> modulo
        int modulo = 30 % 2; // Irá retorna o resto da divisão
    
    // Operadores unários
      // Operadores de positivo e negativo
      int numero = 10;
      numero = -numero;
      numero = +numero;
      /* São operadores que aplicados juntos com outros operadores incrementam,
      decrementam etc o valor de uma variável */
      int incremento = 1; 
      ++incremento;
      incremento++;
      int decremetno = 1;
      --decremetno;
      decremetno--;
      // Qunado o operador vem a esquerda executa o incremento ou decremento depois executa o restante do codigo
      // caso venha na direita executa a açao depois incremente ou decrementa

      // Além de operador unário é um operador lógico, o operador de negação !
      boolean desistir = !true; // Basicamente é uma negação

    // Operadores relacionais
      // == -> igual
      // != -> diferente
      // < -> menor que
      // > -> maior que
      // <= -> menor igual que
      // >= -> maior que igual que
    // Operadores lógicos
      // && -> and
      // || -> Or
    // Operador ternário
      // O operador ternário(?:) funciona como um if else, mas de forma mais enxuta.
      String continuar = desistir? "Hora de parar" : "Com certeza seguir em frente";
      // Se desistir for true a variavel continuar recebe "Hora de parar", caso contrário
      // recebe "Com certeza seguir em frente"
  } 
  
}
