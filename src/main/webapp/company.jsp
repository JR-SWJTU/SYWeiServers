<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    company

    <script>
        var company = sessionStorage.getItem('company');
        company = JSON.parse(company);
        console.log(company);
    </script>
</body>
</html>