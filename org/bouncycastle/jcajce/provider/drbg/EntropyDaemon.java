package org.bouncycastle.jcajce.provider.drbg;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

class EntropyDaemon implements Runnable {
  private static final Logger LOG = Logger.getLogger(EntropyDaemon.class.getName());
  
  private final LinkedList<Runnable> tasks = new LinkedList<>();
  
  void addTask(Runnable paramRunnable) {
    synchronized (this.tasks) {
      this.tasks.add(paramRunnable);
    } 
  }
  
  public void run() {
    while (!Thread.currentThread().isInterrupted()) {
      Runnable runnable;
      synchronized (this.tasks) {
        runnable = this.tasks.poll();
      } 
      if (runnable != null) {
        try {
          runnable.run();
        } catch (Throwable throwable) {}
        continue;
      } 
      try {
        Thread.sleep(5000L);
      } catch (InterruptedException interruptedException) {
        Thread.currentThread().interrupt();
      } 
    } 
    if (LOG.isLoggable(Level.FINE))
      LOG.fine("entropy thread interrupted - exiting"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\drbg\EntropyDaemon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */