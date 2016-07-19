<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Editar Produto</h1>

            <p class="lead">Por favor, atualize as informa&ccedil;&otilde;es do produto aqui</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/admin/inventarioProdutos/editarProduto" method="post"
                   commandName="produto" enctype="multipart/form-data">

        <form:hidden path="idProduto" value="${produto.idProduto}" />

        <div class="form-group">
            <label for="nome">Nome</label>
            <form:input path="nome" id="nome" class="form-Control" value="${produto.nome}"/>
        </div>

        <div class="form-group">
            <label for="categoria">Categoria</label>
            <label class="checkbox-inline"><form:radiobutton path="categoria" id="categoria"
                                                             value="instrumento" />Instrumento</label>
            <label class="checkbox-inline"><form:radiobutton path="categoria" id="categoria"
                                                             value="gravador" />Gravador</label>
            <label class="checkbox-inline"><form:radiobutton path="categoria" id="categoria"
                                                             value="acessorio" />Acess&oacute;rio</label>

        </div>

        <div class="form-group">
            <label for="descricao">Descri&ccedil;&atilde;o</label>
            <form:textarea path="descricao" id="descricao" class="form-Control" value="${produto.descricao}"/>
        </div>

        <div class="form-group">
            <label for="preco">Pre&ccedil;o</label>
            <form:input path="preco" id="preco" class="form-Control" value="${produto.preco}"/>
        </div>

        <div class="form-group">
            <label for="condicao">Condi&ccedil;&atilde;o</label>
            <label class="checkbox-inline"><form:radiobutton path="condicao" id="condicao"
                                                             value="novo" />Novo</label>
            <label class="checkbox-inline"><form:radiobutton path="condicao" id="condicao"
                                                             value="usado" />Usado</label>
        </div>

        <div class="form-group">
            <label for="status">Status</label>
            <label class="checkbox-inline"><form:radiobutton path="status" id="status"
                                                             value="ativo" />Ativo</label>
            <label class="checkbox-inline"><form:radiobutton path="status" id="statuso"
                                                             value="inativo" />Inativo</label>
        </div>

        <div class="form-group">
            <label for="unidadeEmEstoque">Unidade em Estoque</label>
            <form:input path="unidadeEmEstoque" id="unidadeEmEstoque" class="form-Control" value="${produto.unidadeEmEstoque}"/>
        </div>

        <div class="form-group">
            <label for="manufaturador">Manufaturador</label>
            <form:input path="manufaturador" id="manufaturador" class="form-Control" value="${produto.manufaturador}"/>
        </div>

        <div class="form-group">
            <label class="control-label" for="imagemProduto">Upload de imagens</label>
            <form:input id="imagemProduto" path="imagemProduto" type="file" class="form-input-large"/>

        </div>

        </br> </br>
        <input type="submit" value="submit" class="btn btn-default">
        <a href="<c:url value="/admin/inventarioProdutos" />" class="btn btn-default">Cancelar</a>
        </form:form>

        <%@include file="/WEB-INF/views/template/footer.jsp"%>
