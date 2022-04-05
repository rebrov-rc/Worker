package app;

@FunctionalInterface
interface OnTaskDoneListener {
    void onDone(String result);
}
