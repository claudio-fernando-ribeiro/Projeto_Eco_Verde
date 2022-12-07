(function(){
    $("#modalcadastro").on("click",".js-cadastro", function(){
        let botaoClicado  = $(this);
        $("#btnsim").attr("data-id",botaoClicado.attr("data-id"));
        $("#modalnovo").modal("show");
    });

    $("#btncancelar").on("click", function(){
        $("#modalnovo").modal("hide");
    });
})();