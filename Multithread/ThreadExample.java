package Multithread;

import Multithread.SimpleThread.DownloadTask;
import Multithread.SimpleThread.ProcessDataTask;
import Multithread.SynchronizeThread.BankScenarioThread.BankAccountT;
import Multithread.SynchronizeThread.BankScenarioThread.BankTransactionT;

public class ThreadExample {

    public static void main(String[] args) {
        DownloadTask t1 = new DownloadTask();
        ProcessDataTask t2 = new ProcessDataTask();
        Thread downloadThread = new Thread(t1);
        Thread processThread = new Thread(t2);

        downloadThread.start();
        processThread.start();


        /**
         * Bank Account Scenario
         *
         * **/
        BankAccountT account = new BankAccountT(600);

        Thread depositThread = new Thread(new BankTransactionT(account, true, 500));
        Thread withdrawalThread = new Thread(new BankTransactionT(account, false, 300));

        depositThread.start();
        withdrawalThread.start();

    }
}
