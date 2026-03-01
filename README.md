Servlet Login Application
📌 Project Description

This is a simple Java Servlet Login Application built using Jakarta Servlet API.

The application:

Displays a login form

Accepts a username

Stores the username in an HTTP Session

Redirects the user to a Welcome page

🛠 Technologies Used

Java

Jakarta Servlet API

Apache Tomcat Server

HTML (generated via Servlet)


🚀 How It Works
1️⃣ Access Login Page

Open browser:

http://localhost:8080/HttpSession/login
2️⃣ Enter Username

User enters name

Clicks Login

3️⃣ Session Created
HttpSession session = request.getSession();
session.setAttribute("user", name);

The username is stored in session.

4️⃣ Redirect to Welcome Page
response.sendRedirect("Welcome");

User is redirected to another servlet named Welcome.

🧠 Key Concepts Used

HttpServlet

doGet() method

doPost() method

HttpSession

sendRedirect()

🔐 Session Handling

The application uses:

HttpSession session = request.getSession
