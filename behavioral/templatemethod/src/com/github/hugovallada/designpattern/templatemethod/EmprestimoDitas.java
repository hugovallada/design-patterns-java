package com.github.hugovallada.designpattern.templatemethod;

import com.github.hugovallada.designpattern.templatemethod.vo.Money;

public class EmprestimoDitas extends Emprestimo {
    public EmprestimoDitas(Money valor) {
        super(valor);
    }

    @Override
    protected void verificarFraude() {
        if (valor.getValue().doubleValue() > 10000) {
            throw new RuntimeException("O valor é acima do esperado");
        }
    }
}
