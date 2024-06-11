package com.testetecnico.teste.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private BigDecimal salario;
    private String funcao;

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", salario=" + salario +
                ", funcao='" + funcao + '\'' +
                '}';
    }

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal salario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String funcao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public BigDecimal calcularSalariosMinimos(BigDecimal salarioMinimo) {
        if (salario != null) {
            return salario.divide(salarioMinimo, 2, BigDecimal.ROUND_DOWN);
        }
        return BigDecimal.ZERO;
    }

    public void aumentarSalario(BigDecimal percentual) {
        if (salario != null) {
            BigDecimal aumento = salario.multiply(percentual.divide(BigDecimal.valueOf(100)));
            salario = salario.add(aumento);
        }
    }

}
