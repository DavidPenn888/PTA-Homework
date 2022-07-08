class MyThread extends Thread{
    int i;
    public MyThread(int i){
        this.i=i;
    }
    public void run () {
        for(int r=0;r<i;r++) {
            System.out.println(r);
        }
        System.out.println(Thread.currentThread().getName()+" "+isAlive());
    }
}