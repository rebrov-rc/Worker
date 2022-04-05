package app;

class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener error;

    Worker(OnTaskDoneListener cb, OnTaskErrorListener er){
        this.callback = cb;
        this.error = er;
    }


    void start(int i){

        while (i != 0) {
            if ((i%2) == 0){
                callback.onDone("True: " + i);
            }
            if (i == 33){
                this.error.onError("Error: this number is " + i);
            }
            --i;
        }
    }
}
