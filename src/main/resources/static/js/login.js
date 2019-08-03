$(function () {
    //鼠标离开账号框异步校验账户是否存在
    $("#accountNo").blur(function () {
        //获取用户账号
        var accountNo = $(this).val();

        //如果输入信息部位空进行异步校验
        if(accountNo != null && accountNo != ''){
            $.ajax({
               url : "exists",
                dataType : "json",
                type : "get",
                data : {account_no : accountNo},
                success : function (data) {
                    if(data.code == 2){
                        alert(data.msg);
                    }else if(data.code == 3){
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