<%-- 
    Document   : login
    Created on : 31 Mar, 2023, 1:50:02 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <link rel="stylesheet" href="Css/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
    <title>Ayushi jain</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Poppins', sans-serif;
        }

        /* nav {
            display: flex;
            height: 80px;
            width: 100%;
            background: #1b1b1b;
            align-items: center;
            justify-content: space-between;
            padding: 0 50px 0 100px;
            flex-wrap: wrap;
        }

        nav .logo {
            color:#d1d1d1;
            font-size: 35px;
            font-weight: 600;
        }

        nav ul {
            display: flex;
            flex-wrap: wrap;
            list-style: none;
        }

        nav ul li {
            margin: 0 5px;
        }

        nav ul li a {
            color: #f2f2f2;
            text-decoration: none;
            font-size: 22px;
            font-weight: 500;
            padding: 8px 15px;
            border-radius: 5px;
            letter-spacing: 1px;
            transition: all 0.3s ease;
            font-family: -webkit-body;
            font-weight: bold;
        }

        nav ul li a.active,
        nav ul li a:hover {
            color: #111;
            background: #d1d1d1;
            font-size: x-large;
            font-family: initial;
        }

        nav .menu-btn i {
            color: #d1d1d1;
            font-size: 22px;
            cursor: pointer;
            display: none;
        } */

        input[type="checkbox"] {
            display: none;
        }

        @media (max-width: 1000px) {
            nav {
                padding: 0 40px 0 50px;
            }
        }

        @media (max-width: 920px) {
            nav .menu-btn i {
                display: block;
            }

            #click:checked~.menu-btn i:before {
                content: "\f00d";
            }

            nav ul {
                position: fixed;
                top: 80px;
                left: -100%;
                background: #111;
                height: 100vh;
                width: 100%;
                text-align: center;
                display: block;
                transition: all 0.3s ease;
            }

            #click:checked~ul {
                left: 0;
            }

            nav ul li {
                width: 100%;
                margin: 40px 0;
            }

            nav ul li a {
                width: 100%;
                margin-left: -100%;
                display: block;
                font-size: 20px;
                transition: 0.6s cubic-bezier(0.68, -0.55, 0.265, 1.55);
            }

            #click:checked~ul li a {
                margin-left: 0px;
            }

            nav ul li a.active,
            nav ul li a:hover {
                background: none;
                color: cyan;
            }
        }

        .content {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            text-align: center;
            z-index: -1;
            width: 100%;
            padding: 0 30px;
            color: #1b1b1b;
        }

        .content div {
            font-size: 40px;
            font-weight: 700;
        }

        div.logo {
            color: #d1d1d1;
            font-size: 0px;
            font-weight: 600;
        }

        img.logo {
            filter: brightness(1000%);
        }

        @import url('https://fonts.googleapis.com/css?family=Montserrat|Quicksand');

        * {
            font-family: 'quicksand', Arial, Helvetica, sans-serif;
            box-sizing: border-box;
        }

        body {
            background: d1d1d126;
        }

        .form-modal {
            position: relative;
            width: 450px;
            height: auto;
            margin-top: 4em;
            left: 50%;
            transform: translateX(-50%);
            background: d1d1d126;
            border-radius: 20px;
            border-top-right-radius: 20px;
            border-top-left-radius: 20px;
            border-bottom-right-radius: 20px;
            box-shadow: 0 3px 20px 0px rgba(0, 0, 0, 0.1)
        }

        .form-modal button {
            cursor: pointer;
            position: relative;
            text-transform: capitalize;
            font-size: 1em;
            z-index: 2;
            outline: none;
            background: #fff;
            transition: 0.2s;
        }

        .form-modal .btn {

            border: none;
            font-weight: bold;
            font-size: 1.2em;
            padding: 0.8em 1em 0.8em 1em !important;
            transition: 0.5s;
            border: 1px solid #ebebeb;
            margin-bottom: 0.5em;
            margin-top: 0.5em;
        }

        .form-modal .login,
        .form-modal .signup {
            background: black;
            color: #fff;
        }

        .form-modal .login:hover,
        .form-modal .signup:hover {
            background: #222;
        }

        .form-toggle {
            position: relative;
            width: 100%;
            height: auto;
        }

        .form-toggle button {
            width: 50%;
            float: left;
            padding: 1.5em;
            margin-bottom: 1.5em;
            border: none;
            transition: 0.2s;
            font-size: 1.1em;
            font-weight: bold;

        }




        #login-toggle {
            background: black;
            color: #ffff;
        }

        .form-modal form {
            position: relative;
            width: 90%;
            height: auto;
            left: 50%;
            transform: translateX(-50%);
        }

        #login-form,
        #signup-form {
            background-color: #f6f2f;
            position: relative;
            width: 100%;
            height: auto;
            padding-bottom: 1em;
        }

        #signup-form {
            display: none;
        }


        #login-form button,
        #signup-form button {
            width: 100%;
            margin-top: 0.5em;
            padding: 0.6em;
            border-radius: 20px;
        }

        .form-modal input {
            position: relative;
            width: 100%;
            font-size: 1em;
            padding: 1.2em 1.7em 1.2em 1.7em;
            margin-top: 0.6em;
            margin-bottom: 0.6em;
            border-radius: 20px;
            border: none;
            background: #ebebeb;
            outline: none;
            font-weight: bold;
            transition: 0.4s;
        }

        .form-modal input:focus,
        .form-modal input:active {
            transform: scaleX(1.02);
        }

        .form-modal input::-webkit-input-placeholder {
            color: #222;
        }


        .form-modal p {
            font-size: 16px;
            font-weight: bold;
        }

        /* .form-modal p a {
            color: #57b846;
            text-decoration: none;
            transition: 0.2s;
        }

        .form-modal p a:hover {
            color: #222;
        } */
/* 

        .form-modal i {
            position: absolute;
            left: 10%;
            top: 50%;
            transform: translateX(-10%) translateY(-50%);
        } */

        /* .fa-google {
            color: #dd4b39;
        }

        .fa-linkedin {
            color: #3b5998;
        }

        .fa-windows {
            color: #0072c6;
        } */

        .-box-sd-effect:hover {
            box-shadow: 0 4px 8px hsla(210, 2%, 84%, .2);
        }

        @media only screen and (max-width:500px) {
            .form-modal {
                width: 100%;
            }
        }

        @media only screen and (max-width:400px) {
            i {
                display: none !important;
            }
        }
/* 
        .footer {
            position: inherit;
            left: 0;
            bottom: 0;
            width: 100%;
            background-color: #1b1b1b;
            color: white;
            text-align: center;
            height: 300px;
        } */
/* 
        p {
            padding-top: 3px;
            font-size: x-large;
            font-weight: 600;
        } */

        hr.border {
            border: 1px solid #f12020;
            margin-left: 450px;
            margin-right: 450px;
        }

        .content .fas {
            font-size: 1.4375rem;
            background: #1d1d20;
            height: 45px;
            width: 45px;
            line-height: 45px;
            text-align: center;
            border-radius: 50%;
            transition: 0.3s;
            cursor: pointer;
        }
/* 
        .content .fas:hover {
            background: #f12020;
        } */

        .content .text {
            font-size: 1.0625rem;
            font-weight: 500;
            padding-left: 10px;
        }

        .content .phone {
            margin: 15px 0;
        }
/* 
        .footer .social {
            margin: 20px 0 0 0;
        }

        .footer .social a {
            padding: 0 2px;
        }

        .footer .social a span {
            height: 40px;
            width: 40px;
            background: #302b2b;
            line-height: 40px;
            text-align: center;
            font-size: 18px;
            border-radius: 5px;
            transition: 0.3s;
            color: white;
        }

        .footer .social a span:hover {
            background: #f12020;
        }

        .bottom center {
            padding: 5px;
            font-size: 0.9375rem;
            background: #151515;
        }

        .bottom center span {
            color: #656565;
        }

        .bottom center a {
            color: #f12020;
            text-decoration: none;
        }

        .bottom center a:hover {
            text-decoration: underline;
        }

        .footer .fas {
            font-size: 1.4375rem;
            background: #302b2b;
            height: 45px;
            width: 45px;
            line-height: 45px;
            text-align: center;
            border-radius: 50%;
            transition: 0.3s;
            cursor: pointer;
        }

        .footer .fas:hover {
            background: #f12020;} */

        .back .page-back a{
          
    text-decoration: none;
    color: white;
    background-color: black;
    padding: 10px 10px;
    margin-top: 50px;
    width: fit-content;
}

        .back .page-back{
    text-decoration: none;
    padding: 10px 10px;
    margin-top: 5px;
    
}


        
    </style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
    
      <div class="back">
      <div class="page-back"><a href="index.jsp"><i class="fa fa-backward" aria-hidden="true"></i>
        Back</a></div>
    </div>
    <br><br><br><br> <br><br><br><br>
    <div class="form-modal">

        <div class="form-toggle">
            <button id="login-toggle" onclick="toggleLogin()">Login</button>
            <button id="signup-toggle" onclick="toggleSignup()">signup</button>
        </div>

        <div id="login-form">
            <form action="LoginCheckerServlet" method="post">
                <input type="email" name="email" placeholder="Enter email" />
                <input type="password" name="password" placeholder="Enter password" />
                <button type="submit" class="btn login">Login</button>
            <hr/>

            </form>
        </div>

        <div id="signup-form">
            <form action="RegisterServlet" method="post">
                <input type="text" name="username" placeholder="Enter username" required=""/>
                <input type="email" name="email" placeholder="Enter email" required=""/>
                <input type="" name="phone" placeholder="Enter phone no." required="" />
                <input type="text" name="city" placeholder="Enter city" required=""/>
                <input type="password" name="password" placeholder="Enter password" required=""/>
                <button type="submit" class="btn signup">Signup</button>
                <hr />
            </form>
        </div>

    </div>
    <br><br><br><br> <br><br><br><br>

    <script>
        function toggleSignup() {
            document.getElementById("login-toggle").style.backgroundColor = "#fff";
            document.getElementById("login-toggle").style.color = "#222";
            document.getElementById("signup-toggle").style.backgroundColor = "black";
            document.getElementById("signup-toggle").style.color = "#fff";
            document.getElementById("login-form").style.display = "none";
            document.getElementById("signup-form").style.display = "block";
        }

        function toggleLogin() {
            document.getElementById("login-toggle").style.backgroundColor = "black";
            document.getElementById("login-toggle").style.color = "#fff";
            document.getElementById("signup-toggle").style.backgroundColor = "#fff";
            document.getElementById("signup-toggle").style.color = "#222";
            document.getElementById("signup-form").style.display = "none";
            document.getElementById("login-form").style.display = "block";
        }

    </script>

</body>

</html>