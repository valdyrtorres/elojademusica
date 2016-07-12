<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Adicionar Produto</h1>

            <p class="lead">Preencha abaixo para adicionar o Produto</p>
        </div>

        <form:form action="#" method="post" commandName="produto">
        <div class="form-group">
            <label for="nome">Nome</label>
            <form:input path="nome" id="nome" class="form-Control" />
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
        </form:form>

        <%@include file="/WEB-INF/views/template/footer.jsp"%>
