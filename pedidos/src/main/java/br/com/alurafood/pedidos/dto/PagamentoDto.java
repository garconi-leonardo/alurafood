package br.com.alurafood.pedidos.dto;

import br.com.alurafood.pedidos.model.Status;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PagamentoDto {
    private Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private StatusPagamento statusPagamento;
    private Long formaDePagamentoId;
    private Long pedidoId;
}
