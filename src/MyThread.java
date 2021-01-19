public class MyThread extends Thread {



    @Override
    public void run() {
        Application.beta=Application.inputNumber();
        int n = Application.beta;
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for(int i = 0;i<n;i++){
            System.out.print(f[i]+" ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
