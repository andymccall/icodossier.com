$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/api/ping"
    }).then(function(data) {
        $('.response').append(data.result[0].response);
    });
});