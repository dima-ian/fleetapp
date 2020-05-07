$('document').ready(function () {

    $('table #editCountryButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (country, status) {

            $('#idEdit').val(country.id);
            $('#descriptionEdit').val(country.description);
            $('#capitalEdit').val(country.capital);
            $('#codeEdit').val(country.code);
            $('#continentEdit').val(country.continent);
            $('#nationalityEdit').val(country.nationality);

        });
        $('#editCountryModal').modal();
    });


    $('table #deleteCountryButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $('#confirmDeleteButton').attr('href', href);

        $('#deleteCountryModal').modal();



    })


});

// https://www.youtube.com/watch?v=8CrPxnX0hoY&list=PL9l1zUfnZkZkmDvzHCoLlc_nHBc7ZXiRO&index=22