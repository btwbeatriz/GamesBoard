/*
RM 95246 Beatriz Fernandes
 */

package br.com.fiap.GameBoards.model;

import java.math.BigDecimal;

public class Pedido {
    private String nomeProduto;
    private BigDecimal valorProduto;
    private String urlProduto;
    private String descricaoProduto;
    private String componentesProduto;
    private String urlImagem;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Pedido setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
        return this;
    }

    public BigDecimal getValorProduto() {
        return valorProduto;
    }

    public Pedido setValorProduto(BigDecimal valorProduto) {
        this.valorProduto = valorProduto;
        return this;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public Pedido setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
        return this;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public Pedido setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
        return this;
    }

    public String getComponentesProduto() {
        return componentesProduto;
    }

    public Pedido setComponentesProduto(String componentesProduto) {
        this.componentesProduto = componentesProduto;
        return this;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public Pedido setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
        return this;
    }
}
