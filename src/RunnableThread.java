public class RunnableThread implements Runnable {

    @Override
    public void run() {
        int n = Application.beta;
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }
        System.out.println("");
        for(int i = n-1;i>-1;i--){
            System.out.print(f[i]+" ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
