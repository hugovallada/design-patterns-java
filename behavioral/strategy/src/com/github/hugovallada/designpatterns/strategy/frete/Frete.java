package com.github.hugovallada.designpatterns.strategy.frete;

import java.math.BigDecimal;

public sealed interface Frete permits FreteComun, FreteExpresso {
    BigDecimal calcula(BigDecimal valorPedido);
}
