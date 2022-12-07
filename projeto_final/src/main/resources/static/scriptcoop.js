(function(){
    $("#tabcooperadores").on("click",".js-delete", function(){
        let botaoClicado  = $(this);
        $("#btnsim").attr("data-id",botaoClicado.attr("data-id"));
        $("#modalcooperador").modal("show");
    });

    $("#btncancelar").on("click", function(){
        $("#modalcooperador").modal("hide");
    });

    $("#btnsim").on("click",function(){
        let botaoSim = $(this);
        let id = botaoSim.attr("data-id");
        $.ajax({
            url: "/delete/" + id,
            method: "GET",
            success: function(){
                window.location.href="/funcionarios";
            }
        });
    });
})();