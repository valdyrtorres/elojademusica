<%--
  Created by IntelliJ IDEA.
  User: valdirborges
  Date: 12/07/2016
  Time: 09:42
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>P&aacute;gina de Administra&ccedil;&atilde;o</h1>

            <p class="lead">Esta &eacute; a P&aacute;gina de Administra&ccedil;&atilde;o</p>
        </div>

        <H3>
            <a href="<c:url value="/admin/inventarioProdutos" />" >Invent&aacute;rio de Produtos</a>
        </H3>

        <p> Aqui voc&ecirc; pode ver, verificar e modificar o invent&aacute;rio de produtos!</p>

        <%@include file="/WEB-INF/views/template/footer.jsp"%>
