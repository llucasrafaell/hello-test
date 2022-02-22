package br.com.alura.tdd.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
<<<<<<< HEAD

=======
>>>>>>> refs/remotes/origin/master
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		try {
<<<<<<< HEAD
			service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
			fail("nao deu exception");
		} catch (IllegalArgumentException e) {
			assertEquals("Funcionario com salario maior do que R$1000 nao pode receber bonus!", e.getMessage());
=======
			service.calcularBonus(new Funcionario(
					"Rodrigo", 
					LocalDate.now(), 
					new BigDecimal("25000")));
			fail("Passou pela exeception!");
		} catch (Exception e) {
			assertEquals("Funcionario com salario superior a 10000 nao recebe bonus", e.getMessage());
>>>>>>> refs/remotes/origin/master
		}
	}

	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));
		assertEquals(new BigDecimal("250.00"), bonus);
	}

	@Test
	void bonusDeveriaSerDezPorCentoParaSalarioDeExatamente10000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}
