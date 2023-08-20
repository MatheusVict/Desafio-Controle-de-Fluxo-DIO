import exception.ParametrosInvalidosException;
import service.ContadorService;
import service.impl.ContadorServiceImpl;

import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);

    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();

    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();

    ContadorService contadorService = new ContadorServiceImpl();

    try {
      contadorService.contar(parametroUm, parametroDois);
    } catch (ParametrosInvalidosException exception) {
      System.out.println("Erro: " + exception.getMessage());
    }
  }

}
