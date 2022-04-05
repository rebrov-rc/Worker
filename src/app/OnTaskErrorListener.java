package app;

@FunctionalInterface
interface OnTaskErrorListener {
    void onError(String str);
}
