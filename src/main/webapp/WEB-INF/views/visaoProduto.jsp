<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Detalhe do Produto</h1>

            <p class="lead">Informa&ccedil;&atilde;o detalhada do Produto</p>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <img src="#" alt="image" style="width:100% height: 300pt" />
                </div>

                <div class="col-md-5">
                    <h3>${produto.nome}</h3>
                    <p>${produto.descricao}</p>
                    <p>
                        <strong>Manufaturador</strong> : ${produto.manufaturador}
                    </p>
                    <p>
                        <strong>Categoria</strong> : ${produto.categoria}
                    </p>
                    <p>
                        <strong>Condi&ccedil;&atilde;o</strong> : ${produto.condicao}
                    </p>
                    <h4>R$ ${produto.preco}</h4>
                </div>
            </div>
        </div>


<%@include file="/WEB-INF/views/template/footer.jsp"%>
