package projetofinal.controller;

import java.util.ArrayList;

import projetofinal.model.Conta;

public class GerenciaConta {
	
	   private ArrayList<Conta> contas;

	    public GerenciaConta() {
	        contas = new ArrayList<>();
	    }

	    public void adicionar(Conta conta) {
	        contas.add(conta);
	    }

	    public String exibir(int numeroConta) {
	        for (int posicao = 0; posicao < contas.size(); posicao++) {
	            if (contas.get(posicao).getNumero() == numeroConta) {
	                return contas.get(posicao).toString();
	            }
	        }
	        return "Conta não localizada";
	    }

	    private int posicao(int numeroConta) {
	        for (int posicao = 0; posicao < contas.size(); posicao++) {
	            if (contas.get(posicao).getNumero() == numeroConta) {
	                return posicao;
	            }
	        }
	        return -1;
	    }

	    public boolean remover(int numeroConta) {
	        int posicao = posicao(numeroConta);
	        if (posicao >= 0) {
	            if (contas.remove(posicao) != null) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public String saca(int numeroConta, double valorDoSaque) {
	        for (int posicao  = 0; posicao < contas.size(); posicao++) {
	            if (contas.get(posicao).getNumero() == numeroConta) {
	                return contas.get(posicao).saca(valorDoSaque);
	            }
	        }
	        return "Saldo insuficiente";
	    }

	    public String deposita(int numeroConta, double valorDoDeposito) {
	        for (int posicao = 0; posicao < contas.size(); posicao++) {
	            if (contas.get(posicao).getNumero() == numeroConta) {
	                return contas.get(posicao).deposita(valorDoDeposito);
	            }
	        }
	        return "Valor inválido para deposito.";
	    }
}
