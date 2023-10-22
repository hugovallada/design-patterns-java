package com.github.hugovallada.designpattern.templatemethod;

import com.github.hugovallada.designpattern.templatemethod.vo.Money;

import java.math.BigDecimal;

public class EmpresitmoCref extends Emprestimo {
    public EmpresitmoCref(Money valor) {
        super(valor);
    }

    @Override
    protected BigDecimal valorDaTaxa() {
        return BigDecimal.TWO;
    }

    @Override
    protected void verificarFraude() {
        if (valor.getValue().doubleValue() > 100000) {
            throw new IllegalStateException("Valor muito acima do permitido");
        }
    }
}
