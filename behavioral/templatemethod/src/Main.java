import com.github.hugovallada.designpattern.templatemethod.EmpresitmoCref;
import com.github.hugovallada.designpattern.templatemethod.vo.Money;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        final var money = new Money(BigDecimal.valueOf(200000));
        final var emprestimo = new EmpresitmoCref(money);
        final var disponivelParaEmprestimo = emprestimo.valorDisponivelParaEmprestimo();
        System.out.println(disponivelParaEmprestimo);
    }
}