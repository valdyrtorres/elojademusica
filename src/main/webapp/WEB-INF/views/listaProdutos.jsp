<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Todos Produtos</h1>

            <p class="lead">Confira os incr&iacute;veis produtos dispon&iacute;veis no momento</p>
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
                   <td><img src="#" alt="image" /></td>
                   <td>${produto.nome}</td>
                   <td>${produto.categoria}</td>
                   <td>${produto.condicao}</td>
                   <td>R$ ${produto.preco}</td>
                   <td><a href="<spring:url value="/listaProdutos/visaoProduto/${produto.id}" />">
                       <span class="glyphicon glyphicon-info-sign"></span></a></td>
                </tr>
            </c:forEach>
        </table>

<%@include file="/WEB-INF/views/template/footer.jsp"%>
