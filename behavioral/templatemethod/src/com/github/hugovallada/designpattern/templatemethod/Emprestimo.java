package com.github.hugovallada.designpattern.templatemethod;

import com.github.hugovallada.designpattern.templatemethod.vo.Money;

import java.math.BigDecimal;

public abstract class Emprestimo {
    protected Money valor;

    protected Emprestimo(Money valor) {
        this.valor = valor;
    }


    // HOOK -> Tem uma definição padrão, mas pode ser reescrevido por outros
    protected BigDecimal valorDaTaxa() {
        return BigDecimal.TEN;
    }

    protected abstract void verificarFraude();

    public BigDecimal valorDisponivelParaEmprestimo() {
        verificarFraude();
        return BigDecimal.valueOf(valor.getValue().doubleValue() * valorDaTaxa().doubleValue());
    }
}
