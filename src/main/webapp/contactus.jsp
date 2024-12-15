<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
    	<meta charset="ISO-8859-1">
        <title>BEST WAY GUIDER'S</title>
        <link rel="stylesheet" href="styles/homecss.css">
        <style>
        main {
    padding: 20px;
    text-align: center;
}
        
.contact-info {
    margin-bottom: 30px;
}

.contact-info p {
    font-size: 18px;
    margin-bottom: 10px;
}

.contact-info ul {
    list-style-type: none;
    padding: 0;
}

.contact-info li {
    margin-bottom: 10px;
}

.contact-info li i {
    margin-right: 10px;
}

.contact-methods {
    display: flex;
    justify-content: center;
}

.contact-method {
    margin: 0 10px;
}

.cmimg {
    width: 100px;
    height: 100px;
    border-radius: 50%;
    margin-bottom: 10px;
}
        </style>
        
    </head>
    <body>
        <img class="homelogo" src="styles\images\bestwayguiderslogo.png" alt="Best Way Guider's" width="600" height="300">

        <ul class="list">
            <li class="item"> <a class="link" href="home.jsp">Home</a> </li>
            <li class="item"> <a class="link" href="#">About Us</a> </li>
            <li class="item"> <a class="link" href="#">Guide Packages</a> </li>
            <li class="item"> <a class="link" href="contactus.jsp">Contact Us</a> </li>
            <li class="btnitem"> <a class="btnlink" href="#">Register</a> </li>
            <li class="btnitem"> <a class="btnlink" href="loginas.jsp">Login</a> </li>
        </ul>
        <main>
        
        <div class="container">
            <div class="contact-info">
                <p>We'd love to hear from you! Feel free to reach out through any of the following methods:</p>
                <ul>
                    <li><i class="fas fa-envelope"></i>Email: info@example.com</li>
                    <li><i class="fas fa-phone"></i>Phone: +1234567890</li>
                    <li><i class="fas fa-map-marker-alt"></i>Address: 123 Main Street, City, Country</li>
                </ul>
            </div>
            <div class="contact-methods">
                <div class="contact-method">
                    <a href="mailto:info@example.com">
                        <img class="cmimg" src="styles\images\mail.png" alt="Email">
                        
                    </a>
                </div>
                <div class="contact-method">
                    <a href="tel:+1234567890">
                        <img class="cmimg" src="styles\images\call.png" alt="Phone">
                        
                    </a>
                </div>
                <div class="contact-method">
                    
                        <img class="cmimg" src="styles\images\location.png" alt="Address">
                        
                </div>
            </div>
        </div>
        </main>

        <footer>
            <p class="parafooter">
                © 2024 BEST WAY GUIDER'S PLC. ALL RIGHTS RESERVED. <br>
		        SOLUTION BY <a class="linkfooter" href="#">S P M C</a> <br>
            </p>
        </footer>
    </body>
</html>