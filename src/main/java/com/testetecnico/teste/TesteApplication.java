package com.testetecnico.teste;

import com.testetecnico.teste.models.Funcionario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);

		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
		funcionarios.add(new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
		funcionarios.add(new Funcionario("Caio", LocalDate.of(1961, 05, 2), new BigDecimal("9836.14"), "Coordenador"));
		funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
		funcionarios.add(new Funcionario("Alice", LocalDate.of(1995, 01, 05), new BigDecimal("2234.68"), "Recepcionista"));
		funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
		funcionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 03, 31), new BigDecimal("4071.84"), "Contador"));
		funcionarios.add(new Funcionario("Laura", LocalDate.of(1994, 07, 8), new BigDecimal("3017.45"), "Gerente"));
		funcionarios.add(new Funcionario("Heloísa", LocalDate.of(2003, 05, 24), new BigDecimal("1606.85"), "Eletricista"));
		funcionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));

		funcionarios.removeIf(funcionario -> funcionario.nome().equals("João"));

		System.out.println("Funcionários:");
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}

		for (Funcionario funcionario : funcionarios) {
			funcionario.aumentarSalario(BigDecimal.TEN);
		}

		Map<String, List<Funcionario>> funcionariosPorFuncao = new HashMap<>();
		for (Funcionario funcionario : funcionarios) {
			funcionariosPorFuncao.computeIfAbsent(funcionario.funcao(), k -> new ArrayList<>()).add(funcionario);
		}

		System.out.println("\nFuncionários agrupados por função:");
		for (Map.Entry<String, List<Funcionario>> entry : funcionariosPorFuncao.entrySet()) {
			System.out.println(entry.getKey() + ":");
			for (Funcionario funcionario : entry.getValue()) {
				System.out.println("   " + funcionario);
			}
		}

		System.out.println("\nFuncionários que fazem aniversário em outubro (10) e dezembro (12):");
		for (Funcionario funcionario : funcionarios) {
			int mesAniversario = funcionario.dataNascimento().getMonthValue();
			if (mesAniversario == 10 || mesAniversario == 12) {
				System.out.println(funcionario);
			}
		}

		System.out.println("\nFuncionário mais velho:");
		Funcionario maisVelho = funcionarios.get(0);
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.dataNascimento().isBefore(maisVelho.dataNascimento())) {
				maisVelho = funcionario;
			}
		}

		System.out.println(maisVelho.nome() + " - Idade: " + (LocalDate.now().getYear() - maisVelho.dataNascimento().getYear()));

		funcionarios.sort((f1, f2) -> f1.nome().compareTo(f2.nome()));
		System.out.println("\nFuncionários em ordem alfabética:");
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}

		BigDecimal totalSalarios = BigDecimal.ZERO;
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.salario() != null) {
				totalSalarios = totalSalarios.add(funcionario.salario());
			}
		}

		System.out.println("\nTotal dos salários dos funcionários: " + totalSalarios);

		BigDecimal salarioMinimo = new BigDecimal("1212.00");
		System.out.println("\nSalários mínimos dos funcionários:");
		for (Funcionario funcionario : funcionarios) {
			BigDecimal salariosMinimos = funcionario.calcularSalariosMinimos(salarioMinimo);
			System.out.println(funcionario.nome() + ": " + salariosMinimos);
		}
	}
}


