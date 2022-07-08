class PrintTask implements Runnable {
    int num;
    public PrintTask(int num) {
        this.num = num;
    }
    public void run() {
        for(int i=0 ;i<num ;i++ ) {
            System.out.println(i);
        }
        System.out.println(Thread.currentThread().getName());
    }
}