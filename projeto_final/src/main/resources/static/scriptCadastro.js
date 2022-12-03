(function(){
    $("#tabcadastro").on("click", ".js-sucesso", function(){
        let botaoClicado  = $(this);
        $("#btnsim").attr("data-id",botaoClicado.attr("data-id"));
        $("#modal-sucesso").modal("show");
    });

})();