var owl = $('#minhaLista');
owl.owlCarousel({
    loop:true,
    nav:true,
    margin:10,
    responsive:{
        0:{
            items:1
        },
        600:{
            items:3
        },            
        960:{
            items:6
        },
        1200:{
            items:9
        }
    }
});
var owl2 = $('#acao');
owl2.owlCarousel({
    loop:true,
    nav:true,
    margin:10,
    responsive:{
        0:{
            items:1
        },
        600:{
            items:3
        },            
        960:{
            items:6
        },
        1200:{
            items:9
        }
    }
});

var owl3 = $('#drama');
owl3.owlCarousel({
    loop:true,
    nav:true,
    margin:10,
    responsive:{
        0:{
            items:1
        },
        600:{
            items:3
        },            
        960:{
            items:6
        },
        1200:{
            items:9
        }
    }
});
var owl4 = $('#crime');
owl4.owlCarousel({
    loop:true,
    nav:true,
    margin:10,
    responsive:{
        0:{
            items:1
        },
        600:{
            items:3
        },            
        960:{
            items:6
        },
        1200:{
            items:9
        }
    }
});

owl.on('mousewheel', '.owl-stage', function (e) {
    if (e.deltaY>0) {
        owl.trigger('next.owl');
    } else {
        owl.trigger('prev.owl');
    }
    e.preventDefault();
});
owl2.on('mousewheel', '.owl-stage', function (e) {
    if (e.deltaY>0) {
        owl2.trigger('next.owl');
    } else {
        owl2.trigger('prev.owl');
    }
    e.preventDefault();
});
owl3.on('mousewheel', '.owl-stage', function (e) {
    if (e.deltaY>0) {
        owl3.trigger('next.owl');
    } else {
        owl3.trigger('prev.owl');
    }
    e.preventDefault();
});
owl4.on('mousewheel', '.owl-stage', function (e) {
    if (e.deltaY>0) {
        owl4.trigger('next.owl');
    } else {
        owl4.trigger('prev.owl');
    }
    e.preventDefault();
});