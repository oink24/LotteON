$(function(){
    $(window).scroll(function(){
        
        let top = $(this).scrollTop();
        if(top > 10){
            $('#wrapper > header').css('background', 'white');
            $('#wrapper > header a').css('color', '#222');
            $('#wrapper > header img').attr('src', '../images/header_logo.png');
        }else{
            $('#wrapper > header').css('background', 'transparent');
            $('#wrapper > header a').css('color', '#fff');
            $('#wrapper > header img').attr('src', '../images/header_logo.png');
        }

    });
});