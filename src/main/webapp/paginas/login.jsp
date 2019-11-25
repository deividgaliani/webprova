<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <link rel="shortcut icon" type="image/x-icon" href="https://static.codepen.io/assets/favicon/favicon-aec34940fbc1a6e787974dcd360f2c6b63348d4b1f4e06c77743096d55480f33.ico" />
    <link rel="mask-icon" type="" href="https://static.codepen.io/assets/favicon/logo-pin-8f3771b1072e3c38bd662872f6b673a722f4b3ca2421637d5596661b4e2132cc.svg" color="#111" />
    <title>Login - Prova Digital</title>
    <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>
    <style>
        @import url(https://fonts.googleapis.com/css?family=Open+Sans);

        body{
            background-color: #263238;
            padding-top:50px;
            font-family: 'Open Sans', sans-serif;
        }

        h3{
            color:#ecf0f1;
        }

        p{
            padding-top:10px;
            color:#ecf0f1;
            font-size:1.0em;
        }


        a{
            color:#f1c40f;
        }


        a:hover {
            color: #efa039;
            text-decoration: none;
        }

        label {
            color:#ecf0f1;
            padding-top:10px;
            font-size:1.6rem;
            font-weight: 300;
        }

        .label-register{
            color:rgba(0, 109, 128, 0.52);
        }

        button{
            margin-top:20px;
        }

        .border-login{
            border-right:1px solid #fff;
            min-height:450px;
            float:right;
        }

        .space-top{
            padding-top:50px;
        }

        .modal-header {
            min-height: 16.42857143px;
            padding: 9px;
            border-bottom: 1px solid #e5e5e5;
            background: #263238;
            color: #fff;
            border-top: 1px solid #e65100;
            border-radius: 0;
        }

        .modal-footer {
            padding: 9px;
            text-align: right;
            border-top: 1px solid #607D8B;
        }

        .modal-content {
            position: relative;
            background-color: #CFD8DC;
            -webkit-background-clip: padding-box;
            background-clip: padding-box;
            border-left: 1px solid #e65100;
            border-right: 1px solid #e65100;
            border-bottom: 1px solid #e65100;
            border-radius: 0;
            outline: 0;
        }

        .btn {
            display: inline-block;
            padding: 6px 12px;
            margin-bottom: 0;
            font-size: 14px;
            font-weight: normal;
            line-height: 1.42857143;
            text-align: center;
            white-space: nowrap;
            vertical-align: middle;
            -ms-touch-action: manipulation;
            touch-action: manipulation;
            cursor: pointer;
            -webkit-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none;
            user-select: none;
            background-image: none;
            /* border: 1px solid transparent; */
            border-radius: 0;
        }
    </style>
</head>
<body translate="no">
<div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-5 hidden-xs hidden-sm">
            <img src="https://i.imgur.com/JulMgBN.png" alt="" class="center-block img-responsive" />
        </div>
        <div class="col-md-1 hidden-xs hidden-sm">
            <div class="border-login"></div>
        </div>
        <div class="col-sm-12 col-xs-12 col-md-4">
            <div class="space-top">
                <h3 class="text-center">PD - Prova Digital</h3>
                <form method="POST" action="/login" class="form-signin" class="form-horizontal">
                    <label class=""> Usuário </label>
                    <input name="username"  type="text" class="form-control" placeholder="" required autofocus>
                    <label class=""> Senha </label>
                    <input name="password"  type="password" class="form-control" placeholder="" required>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">
                        Entrar
                    </button>
                </form>
            </div>

        </div>
    </div>
</div>
<script src='https://code.jquery.com/jquery-2.2.4.min.js'></script>
<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js'></script>
</body>
</html>
