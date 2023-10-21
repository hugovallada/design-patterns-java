package com.github.hugovallada.designpatterns.strategy;

import com.github.hugovallada.designpatterns.strategy.frete.Frete;
import com.github.hugovallada.designpatterns.strategy.frete.FreteComun;
import com.github.hugovallada.designpatterns.strategy.frete.FreteExpresso;
import com.github.hugovallada.designpatterns.strategy.pedido.Pedido;
import com.github.hugovallada.designpatterns.strategy.pedido.PedidoEletronicos;
import com.github.hugovallada.designpatterns.strategy.pedido.PedidoMoveis;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        final Pedido eletronico = new PedidoEletronicos(BigDecimal.valueOf(100), "Eletronico");
        final Pedido moveis = new PedidoMoveis(BigDecimal.valueOf(200), "Moveis");

        final Frete comum = new FreteComun();
        final Frete expresso = new FreteExpresso();

        eletronico.setTipoFrete(expresso);
        moveis.setTipoFrete(comum);

        final var valorEletronico = eletronico.calculaFrete();
        final var valorMoveis = moveis.calculaFrete();

        System.out.println(valorEletronico);
        System.out.println(valorMoveis);
    }
}