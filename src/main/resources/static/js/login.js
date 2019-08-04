$(function () {

    //获取项目根路径
    var ctxPath=[[${#httpServletRequest.getContextPath()}]];
    alert(ctxPath);
    //鼠标离开账号框异步校验账户是否存在
    $("#accountNo").blur(function () {
        //获取用户账号
        var accountNo = $(this).val();

        //如果输入信息部位空进行异步校验
        if(accountNo != null && accountNo != ''){
            $.ajax({
               url : "/user/exists",
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
        //获取用户名
        var accountNo = $("#accountNo").val();
        //获取密码
        var password = $("#password").val();
        if(accountNo == null || accountNo == ''){
            alert("请输入您的账号！");
            return;
        }
        if(password == null || password == ''){
            alert("请输入密码！");
            return;
        }

        //验证通过发送异步请求，到后台进行用户身份验证
        $.ajax({
            url : "user/login",
            dataType : "json",
            type : "post",
            data : {account_no : accountNo,password : password},
            success : function (data) {
                if(data.code == 2){
                    alert(data.msg);
                }else if(data.code == 3){
                    alert(data.msg);
                }else{
                    //history.go(-1);
                    location.href = "sys/index";
                }
            },
            error : function () {
                alert("您的网络有问题，请稍后重试。");
            }
        });
    });
});