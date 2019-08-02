$(function () {
    //鼠标离开账号框异步校验账户是否存在
    $("#accountNo").blur(function () {
        alert("bb");
        //获取用户账号
        var accountNo = $(this).val();

        if(accountNo != null && accountNo != ''){
            alert("异步校验");
            $.ajax({
               url : "exists",
                dataType : JSON,
                type : "get",
                data : {accountNo : accountNo},
                success : function (data) {
                    if(data.cod == 404){
                        alert(data.msg);
                    }else if(data.code == 500){
                        alert(data.msg);
                    }
                },
                error : function () {
                    alert("请求失败，请稍后重试！");
                }
            });
        }
    });

    //点击登录事件
    $(".submit").click(function () {

    });
});