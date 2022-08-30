function handleAddproduct(event){
    event.preventDefault();
    fire_ajax();
}
function fire_ajax(){
     $.ajax({
         type: "GET",
         url: "/addProduct",
         processData:false,
         contentType:false,
         cache:false,
         timeout:60000,
         success:function (data){
             $("#app").empty();
         $("#app").append(data);
         },
         error:function (e){
             console.log("Error: ",e);
         }


     });

}
function handleListproduct(event){
    event.preventDefault();
    fire_ajax1();
}
function fire_ajax1(){
    $.ajax({
        type: "GET",
        url: "/Products",
        processData:false,
        contentType:false,
        cache:false,
        timeout:60000,
        success:function (data){
            $("#app").empty();
            $("#app").append(data);
        },
        error:function (e){
            console.log("Error: ",e);
        }


    });



}
function handleAddcategory(event){
    event.preventDefault();
    fire_ajax2();
}
function fire_ajax2(){
    $.ajax({
        type: "GET",
        url: "/addCategory",
        processData:false,
        contentType:false,
        cache:false,
        timeout:60000,
        success:function (data){
            $("#app").empty();
            $("#app").append(data);
        },
        error:function (e){
            console.log("Error: ",e);
        }


    });

}
function handleListcategory(event){
    event.preventDefault();
    fire_ajax3();
}
function fire_ajax3(){
    $.ajax({
        type: "GET",
        url: "/Categories",
        processData:false,
        contentType:false,
        cache:false,
        timeout:60000,
        success:function (data){
            $("#app").empty();
            $("#app").append(data);
        },
        error:function (e){
            console.log("Error: ",e);
        }


    });
}
function handleAddbrand(event){
    event.preventDefault();
    fire_ajax4();
}
function fire_ajax4(){
    $.ajax({
        type: "GET",
        url: "/addBrand",
        processData:false,
        contentType:false,
        cache:false,
        timeout:60000,
        success:function (data){
            $("#app").empty();
            $("#app").append(data);
        },
        error:function (e){
            console.log("Error: ",e);
        }


    });

}
function handleListbrand(event){
    event.preventDefault();
    fire_ajax5();
}
function fire_ajax5(){
    $.ajax({
        type: "GET",
        url: "/Brands",
        processData:false,
        contentType:false,
        cache:false,
        timeout:60000,
        success:function (data){
            $("#app").empty();
            $("#app").append(data);
        },
        error:function (e){
            console.log("Error: ",e);
        }


    });

}

