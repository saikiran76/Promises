/*
 * Write a function that halts the JS thread (make it busy wait) for a given number of milliseconds.
 * During this time the thread should not be able to do anything else.
 */

function sleep (seconds) {
    setTimeout(seconds, print);
    

}

function print(){
    console.log('I will wait for some time to be called');
}

for(var i = 0; i<100000; i++){
    console.log('running... call stack is busy');
}

console.log(sleep(5000));

