<%-- 
    Document   : index
    Created on : 30 Mar, 2023, 6:23:14 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ayushi jain</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="Css/style.css">
    <style>
        body {
            color: #ffffff;
            background: #000000;
        }

        .loading {
            color: #d1d1d1;
            padding: 20px;
            font-family: Arial, Helvetica, sans-serif;
            position: absolute;
            bottom: 0
        }

        .main {
            opacity: 1;
            transition: opacity .2s ease-in-out
        }

        .main.not-loaded {
            opacity: 0
        }

        [data-name=corner-bottom-right],
        [data-name=corner-top-left] {
            opacity: 1;
            width: 100px;
            height: 100px;
            transition: all ease-in-out;
            position: absolute
        }

        [data-name=corner-top-left] {
            top: 0;
            left: 0
        }

        [data-name=corner-bottom-right] {
            opacity: 0;
            bottom: 0;
            right: 0
        }

        .not-loaded [data-name=corner-top-left],
        .not-loaded [data-name=corner-bottom-right] {
            opacity: 0 !important;
            width: 0 !important;
            height: 0 !important
        }

        @media screen and (min-width:500px) {

            [data-name=corner-bottom-right],
            [data-name=corner-top-left] {
                width: 300px;
                height: 300px;
                opacity: 1
            }
        }

        .gradient1 {
            stop-color: var(--grad-1);
            transition: all .3s ease-in-out
        }

        .gradient2 {
            stop-color: var(--grad-2);
            transition: all .3s ease-in-out
        }

        .hover .gradient1 {
            stop-color: var(--grad-2)
        }

        .hover .gradient2 {
            stop-color: var(--grad-1)
        }
    </style>
    <link rel="stylesheet" href="media.css">
    <script src="/index.28a0c5dd.js" defer></script>
</head>

<body>
    <header>
        <div class="navigation">
            <div class="logo">
                <img src="logo-removebg-preview (1).png" alt="">
            </div>
            <div class="navbar">
                <a href="https://github.com/Ayushi-jain13" class="nav-logo logo1"><i class="fa fa-github"></i></a>
                <a href="ayushij1304@gmail.com" class="nav-logo logo2"><i class="fa fa-envelope"></i></a>
                <a href="login.jsp" class="nav-logo logo3"><i class="fa fa-user"></i></a>
            </div>
        </div>
    </header>

    <div class="row">
        <div class="column left">
            <h1>Welcome.</h1>
            <div class="content">
                <p>My name is Ayushi Jain. I am a Web developer based in Indore , Madhya Pradesh. I have developed
                    projects to
                    enhance my skills.</p>
                <p>I'm passionate about learning new things everyday.</p>
            </div>
        </div>
        <div class="column right">
            <img src="images/vector.jpg">
        </div>
    </div>
    <br>
    <div class="container">
        <span>My Projects</span>

        <!-- blogs section starts  -->

        <section class="blogs" id="blogs">

            <div class="heading">
            </div>

            <div class="box-container">

                <div class="box">
                    
                    <div class="content">
                        
                        <h3>Meals On Wheels</h3>
                        <p>Meals on wheels is a web based application developed on netbeans. The main aim of this website is to keep the neighbourhood hunger free.....</p>
                        <a href="https://github.com/Ayushi-jain13" class="btn" onclick="alert('Please Login !')">Github </a>
                    </div>
                </div>

                <div class="box">
                    
                    <div class="content">
                        <!-- <div class="tags">
                            <a href="#"> <i class="fas fa-tag"></i> young adult fiction / </a>
                            <a href="#"> <i class="fas fa-tag"></i> romance </a>
                        </div> -->
                        <h3>Epic Food</h3>
                        <p>Different spices for different tastes. A food ordering website where one has to login before adding items to cart or adding them to favourites .....

                        </p>
                        <a href="https://github.com/Ayushi-jain13" class="btn" onclick="alert('Please Login !')">Github</a>
                    </div>
                </div>

                <div class="box">
                    <!-- <div class="image">
                        <h3> <i class="fas fa-calendar"></i> 2nd april, 2022 </h3>
                        <img src="image/blog-3.jpg" alt="">
                    </div> -->
                    <div class="content">
                        <!-- <div class="tags">
                            <a href="#"> <i class="fas fa-tag"></i> young adult / </a>
                            <a href="#"> <i class="fas fa-tag"></i> thriller</a>
                        </div> -->
                        <h3>My Portfolio</h3>
                        <p>A website where one can find my resume, contact me , view my proejcts and also visit my github account and view the skills I have....</p>
                        <a href="https://github.com/Ayushi-jain13" class="btn" onclick="alert('Please Login !')">Github</a>
                    </div>
                </div>

            </div>

        </section>
        <section class="blogs" id="blogs">

            <div class="heading">
            </div>

            <div class="box-container">

                <div class="box">
                    <!-- <div class="image">
                        <h3> <i class="fas fa-calendar"></i> 2nd april, 2022 </h3>
                        <img src="image/blog-1.jpg" alt="">
                    </div> -->
                    <div class="content">
                        <!-- <div class="tags">
                            <a href="#"> <i class="fas fa-tag"></i> self help </a>
                        </div> -->
                        <h3>Notepad Clone</h3>
                        <p>As the name itself suggests that it is clone of notepad, it has similar interface as original notepad and basic functionalities of notepad like new, save, Open a file etc. </p>
                        <a href="https://github.com/Ayushi-jain13" class="btn" onclick="alert('Please Login !')">Github</a>
                    </div>
                </div>

                <div class="box">
                    <!-- <div class="image">
                        <h3> <i class="fas fa-calendar"></i> 2nd april, 2022 </h3>
                        <img src="image/blog-2.jpg" alt="">
                    </div> -->
                    <div class="content">
                        <!-- <div class="tags">
                            <a href="#"> <i class="fas fa-tag"></i> young adult fiction / </a>
                            <a href="#"> <i class="fas fa-tag"></i> romance </a>
                        </div> -->
                        <h3>E-notes</h3>
                        <p>Clone of notes app , but this is in website form where one can register and login, and then write notes delete them ,edit them, save etc......
                        </p>
                        <a href="https://github.com/Ayushi-jain13" class="btn" onclick="alert('Please Login !')">Github</a>
                    </div>
                </div>

                <div class="box">
                    <!-- <div class="image">
                        <h3> <i class="fas fa-calendar"></i> 2nd april, 2022 </h3>
                        <img src="image/blog-3.jpg" alt="">
                    </div> -->
                    <div class="content">
                        <!-- <div class="tags">
                            <a href="#"> <i class="fas fa-tag"></i> young adult / </a>
                            <a href="#"> <i class="fas fa-tag"></i> thriller</a>
                        </div> -->
                        <h3>Book Rent</h3>
                        <p>Different fictions , all the genres like romance, horror, sci-fi, thriller, comedy etc. can be found on this website for renting. It works 24*7.... </p>
                        <a href="https://github.com/Ayushi-jain13" class="btn" onclick="alert('Please Login !')">Github</a>
                    </div>
                </div>

            </div>

        </section>

        <!-- blogs section ends-->


        <!--<div>
    <img src="images/vector.jpg">
</div> -->
    </div>

    <div class="tech">
        <span>Skills</span>
        <br><br>
        <div class="skillContainer">
            <div class="set">
                <ul class="vl"> Java </ul><div class="rectangle cl-1"></div> 95%
                <!-- <ul class="vl"> MySql </ul><div class="rectangle cl-2"></div> -->
            </div>
            <div class="set"><ul class="vl">  MySql </ul><div class="rectangle cl-2"></div>90%
        </div>
            <div class="set">
                <ul class="vl"> C </ul><div class="rectangle cl-3"></div>85%
                <!-- <ul class="vl"> C++ </ul><div class="rectangle cl-4"></div> -->
            </div>
            <div class="set"><ul class="vl">  C++   </ul><div class="rectangle cl-4"></div>75%</div>
            <div class="set">
                <ul class="vl"> Html </ul><div class="rectangle cl-5"></div>95%
                <!-- <ul class="vl"> Css </ul><div class="rectangle cl-6"></div> -->
            </div>
            <div class="set"><ul class="vl">  Css   </ul><div class="rectangle cl-6"></div> 90%</div>
        </div>
    </div>

    <div class="container-1">
        <span>Resume</span><br>
        <div class="resume">
            <a href="/RESUME_2023_Ayushi.pdf" target="_blank"><button class="btn"> Download CV</button></a>
        </div>
    </div>
    <footer>
        <p> ©2023 ayushij1304.com</p>
    </footer>
</body>

</html>