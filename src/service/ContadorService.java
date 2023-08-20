package service;

import exception.ParametrosInvalidosException;

public interface ContadorService {
  void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException;
}
