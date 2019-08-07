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

$(document).ready(function(){

    $('#categoryBtn').click(function(event){
        event.preventDefault();

        var data = JSON.stringify($("#categoryForm").serializeFormJSON());

        $.ajax({
            type: 'POST',
            url: '/saveCategory',
            data: data,
            contentType: 'application/json',
            dataType: 'json',
            success: function(category){
                //append to category list
                $('#result').empty();
                $('#result').show();
                $('#result').append(category.id + ', ' + category.name);
                var newRow = '<tr><td>' + category.name + '</td><td>'+ category.description + '</td></tr>';
                $('table tbody').append(newRow);

            },
            error: function (xmlResponse) {
                $('#result').empty();
                var responseJson = xmlResponse.responseJSON;

                if(responseJson.errorType === 'CategoryValidationError'){
                    var errorList = responseJson.fieldErrors;

                    $.each(errorList, function(index, error){
                        $('#result').append('<p>' + error.field + ', ' + error.message + '</p>');
                    });

                }else{
                    alert("other errors");
                }

            }

        });


    });


});

function exit() {
    document.getElementById('addCategory').style.display = 'none';
    document.getElementById('categoryList').style.display = 'block';
}

function addCategory() {
    document.getElementById('addCategory').style.display = 'block';
    document.getElementById('categoryList').style.display = 'none';
}