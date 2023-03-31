<%-- 
    Document   : Admin
    Created on : 31 Mar, 2023, 1:45:39 PM
    Author     : DELL
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="db.DBConnector"%>
<%@page import="db.DBConnector"%>
<%@ page import="java.sql.*" %>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Admin Page</title>
        <!-- META TAGS -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- FAV ICON(BROWSER TAB ICON) -->
        <link rel="shortcut icon" href="images/fav.ico" type="image/x-icon">
        <!-- GOOGLE FONT -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700%7CJosefin+Sans:600,700"
              rel="stylesheet">
        <!-- FONTAWESOME ICONS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <!-- ALL CSS FILES -->
        <link href="Css/materialize.css" rel="stylesheet">
        <link href="Css/bootstrap.css" rel="stylesheet" />
        <link href="Css/admin_style.css" rel="stylesheet" />
        <!-- RESPONSIVE.CSS ONLY FOR MOBILE AND TABLET VIEWS -->
        <link href="Css/style-mob.css" rel="stylesheet" />
        <style>
            @import url('https://fonts.googleapis.com/css?family=Muli&display=swap');
            @import url('https://fonts.googleapis.com/css?family=Quicksand&display=swap');
        </style>


    </head>

    <body>
        <!--== MAIN CONTRAINER ==-->
        <div class="container-fluid sb1">
            <div class="row">
                <!--== LOGO ==-->
                <div class="col-md-2 col-sm-3 col-xs-6 sb1-1">
                    <a href="#" class="btn-close-menu"><i class="fa fa-times" aria-hidden="true"></i></a>
                    <a href="#" class="atab-menu"><i class="fa fa-bars tab-menu" aria-hidden="true"></i></a>
                    <a href="index.jsp" class="logo"><img src="" alt="" />
                    </a>
                </div>

                <a class='waves-effect dropdown-button top-user-pro' href='#' data-activates='top-menu'><img
                        src="user/6.png" alt="" />My Account <i class="fa fa-angle-down" aria-hidden="true"></i>
                </a>

                <!-- Dropdown Structure -->
                <ul id='top-menu' class='dropdown-content top-menu-sty'>

                    <li class="divider"></li>
                    <li><a href="logout.jsp" class="ho-dr-con-last waves-effect"><i class="fa fa-sign-in"
                                                                                    aria-hidden="true"></i> Logout</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>

    <!--== BODY CONTNAINER ==-->
    <div class="container-fluid sb2">
        <div class="row">
            <div class="sb2-1">

                <!--== USER INFO ==-->
                <div class="sb2-12">
                    <ul>
                        <li><img src="images/placeholder.jpg" alt="">
                        </li>
                        <li>
                            <h5>Ayushi Jain<span> India</span></h5>
                        </li>
                        <li></li>
                    </ul>
                </div>
                <!--== LEFT MENU ==-->
                <div class="sb2-13">
                    <ul class="collapsible" data-collapsible="accordion">
                        <li><a href="javascript:void(0)" class="collapsible-header"><i class="fa fa-user"aria-hidden="true"></i> Admin</a></li>
                        <li><a href="javascript:void(0)" class="collapsible-header"><i class="fa fa-graduation-cap"aria-hidden="true"></i> Dashboard</a></li>
                        <li><a href="index.jsp" class="collapsible-header"><i class="fa fa-users" aria-hidden="true"></i>My Portfolio</a></li>
                        <li><a href="logout.jsp" class="collapsible-header"><i class="fa fa-commenting-o"aria-hidden="true"></i>Logout</a></li>
                    </ul>
                </div>
            </div>

            <!--== BODY INNER CONTAINER ==-->
            <div class="sb2-2">
                <!--== breadcrumbs ==-->
                <div class="sb2-2-2">
                    <ul>
                        <li><a href="Admin.jsp"><i class="fa fa-home" aria-hidden="true"></i> Home</a>
                        </li>
                        <li class="active-bre"><a href="Admin.jsp"> Dashboard</a>
                        </li>
                    </ul>
                </div>
                <!--== DASHBOARD INFO ==-->



                <div class="sb2-2-1">
                    <h2>Admin Dashboard</h2>
                    <!--== Connection ==-->

                    <div class="db-2">
                        <ul>
                            <li>
                                <div class="dash-book dash-b-1">
                                    <h5>All Visitors</h5>

                                    <h4>18</h4>
                                    <!--<a href="#">View more</a>-->
                                </div>
                            </li>
                            <li>
                                <div class="dash-book dash-b-2">
                                    <h5>Enquiry</h5>
                                    <h4>10</h4>
                                    <!--<a href="#">View more</a>-->
                                </div>
                            </li>
                            <li>
                                <div class="dash-book dash-b-3">
                                    <h5>Registered</h5>
                                    <h4>12</h4>
                                    <!--<a href="#">View more</a>-->
                                </div>
                            </li>
                            <li>
                                <div class="dash-book dash-b-4">
                                    <h5>View More</h5>
                                    <h4>2</h4>
                                    <!--<a href="#">View more</a>-->
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>

                
                <div class="sb2-2-3">
                    <div class="row">
                        <!--== Country Campaigns ==-->
                        <div class="col-md-100">
                            <div class="box-inn-sp">
                                <div class="inn-title">
                                    <h4>Visitors</h4>
                                </div>
                                <div class="tab-inn">
                                    <div class="table-responsive table-desi">
                                        <table class="table table-hover">
                                            <thead>
                                                <tr>
                                                    <th>Name</th>
                                                    <th>Email</th>
                                                    <th>Phone</th>
                                                    <th>City</th>
                                                    

                                                </tr>
                                            </thead>
                                            <tbody>
                                                
                                                <tr>
                                                    <td><span class="txt-dark weight-500">Ravina</span></td>
                                                    <td>ravinaj111@gmail.com</td>
                                                    <td>7879448064</td>
                                                    <td>Indore</td>
                                                    <td></td>

                                                </tr> 
                                                
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--Import jQuery before materialize.js-->
                        <script src="js/main.min.js"></script>
                        <script src="js/bootstrap.min.js"></script>
                        <script src="js/materialize.min.js"></script>
                        <script src="js/custom.js"></script>
                        </body>
                        </html>