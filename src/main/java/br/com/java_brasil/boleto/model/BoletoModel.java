package br.com.java_brasil.boleto.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
//TODO Refatorar campos realmente necessarios
public class BoletoModel implements Serializable {

    protected BigDecimal valorBoleto = BigDecimal.ZERO;
    protected BigDecimal valorDescontos = BigDecimal.ZERO;
    protected BigDecimal valorDeducoes = BigDecimal.ZERO;
    protected BigDecimal valorMulta = BigDecimal.ZERO;
    protected BigDecimal valorAcrescimos = BigDecimal.ZERO;
    protected BigDecimal percentualJuros;
    protected BigDecimal percentualMulta;
    protected int diasJuros;
    protected int diasMulta;
    protected LocalDate dataEmissao;
    protected LocalDate dataVencimento;
    protected String especieMoeda;
    protected int codigoEspecieMoeda;
    protected String especieDocumento;
    protected String numeroDocumento;
    protected Pagador pagador;
    protected boolean aceite;
    protected Beneficiario beneficiario;
    protected List<String> instrucoes = Collections.emptyList();
    protected List<String> descricoes = Collections.emptyList();
    protected List<String> locaisDePagamento = Collections.emptyList();
    protected String codigoBarras;
    protected String codRetorno;
    protected String mensagemRetorno;

}
