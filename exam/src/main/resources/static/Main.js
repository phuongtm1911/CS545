var contextRoot = "/" + window.location.pathname.split('/')[1];
$(document).ready(function(){

    $('#categoryBtn').click(function(event){
        event.preventDefault();
    var dataToSend = JSON.stringify($("#categoryForm").serializeFormJSON());
    $.ajax({
//code to make AJAJ Call
        type: "POST",
        url: "/saveCategory",
        data: dataToSend,
        contentType: "application/json",
        dataType: "json",
        success : function(category) {
            $('#success').html("");
            $('#errors').html("");
            $('#success').append('<H3 align="center"> OKAY!! <H3>');
            $('#result').show();
            var newRow = '<tr><td>' + category.name + '</td><td>'+ category.description + '</td></tr>';
            $('table tbody').append(newRow);
        },
        error : function(XMLHttpRequest) {
            if (XMLHttpRequest.responseJSON.errorType == "CategoryValidationError") {
                $('#success').html("");
                $('#errors').html("");
                $("#errors").append('<H3 align="center"> Error(s)!! <H3>');
                $("#result").append('<p>');
                var errorList = XMLHttpRequest.responseJSON.errors;
//code to loop errorList
                $.each(errorList, function (i, error) {
                    $("#result").append(error.message + '<br>');
                });
                $("#errors").append('</p>');
                $('#result').show();
            } else {
                alert(errorObject.responseJSON.errors(0));
            }
        }
    });
    });});

function exit() {
    document.getElementById('addCategory').style.display = 'none';
    document.getElementById('categoryList').style.display = 'block';
}

function addCategory() {
    document.getElementById('addCategory').style.display = 'block';
    document.getElementById('categoryList').style.display = 'none';
}

(function ($) {
    $.fn.serializeFormJSON = function () {

        var o = {};
        var a = this.serializeArray();
        $.each(a, function () {
            if (o[this.name]) {
                if (!o[this.name].push) {
                    o[this.name] = [o[this.name]];
                }
                o[this.name].push(this.value || '');
            } else {
                o[this.name] = this.value || '';
            }
        });
        return o;
    };
})(jQuery);