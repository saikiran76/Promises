/*
    Write a function that returns a promise that resolves after n seconds have passed, where n is passed as an argument to the function.
*/


function wait(n) {
    return new Promise(function(resolve){
        setTimeout(resolve, n);
    })
   
}

wait().then(function(){
    console.log('I will resolve it after print is over');
})