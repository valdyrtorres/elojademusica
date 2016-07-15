<%--
  Created by IntelliJ IDEA.
  User: valdirborges
  Date: 12/07/2016
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>P&aacute;gina do Invent&aacute;rio de Produtos</h1>

            <p class="lead">Esta &eacute; a P&aacute;gina do Invent&aacute;rio de Produtos</p>
        </div>

        <table class="table table-striped table-hover">
            <thead>
            <tr class="bg-success">
                <th>Galeria de Fotos</th>
                <th>Nome do Produto</th>
                <th>Categoria</th>
                <th>Condi&ccedil;&atilde;o</th>
                <th>Pre&ccedil;o</th>
                <th></th>
            </tr>
            </thead>
            <c:forEach items="${produtos}" var="produto">
                <tr>
                    <td><img src="<c:url value="/resources/imagens/${produto.idProduto}.png" /> " alt="image"
                             style="width:100%"/></td>
                    <td>${produto.nome}</td>
                    <td>${produto.categoria}</td>
                    <td>${produto.condicao}</td>
                    <td>R$ ${produto.preco}</td>
                    <td><a href="<spring:url value="/listaProdutos/visaoProduto/${produto.idProduto}" />">
                        <span class="glyphicon glyphicon-info-sign"></span></a>
                        <a href="<spring:url value="/admin/inventarioProdutos/deleteProduto/${produto.idProduto}" />">
                            <span class="glyphicon glyphicon-remove"></span></a>
                        <a href="<spring:url value="/admin/inventarioProdutos/editarProduto/${produto.idProduto}" />">
                            <span class="glyphicon glyphicon-pencil"></span></a>
                    </td>
                </tr>
            </c:forEach>
        </table>

        <a href="<spring:url value="/admin/inventarioProdutos/adicionarProduto"/>" class="btn btn-primary">Adicionar produto</a>

        <%@include file="/WEB-INF/views/template/footer.jsp"%>
