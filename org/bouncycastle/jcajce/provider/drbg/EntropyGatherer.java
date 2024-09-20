package org.bouncycastle.jcajce.provider.drbg;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.util.Properties;

class EntropyGatherer implements Runnable {
  private static final Logger LOG = Logger.getLogger(EntropyGatherer.class.getName());
  
  private final long pause;
  
  private final AtomicBoolean seedAvailable;
  
  private final AtomicReference<byte[]> entropy;
  
  private final IncrementalEntropySource baseRandom;
  
  EntropyGatherer(IncrementalEntropySource paramIncrementalEntropySource, AtomicBoolean paramAtomicBoolean, AtomicReference<byte[]> paramAtomicReference) {
    this.baseRandom = paramIncrementalEntropySource;
    this.seedAvailable = paramAtomicBoolean;
    this.entropy = paramAtomicReference;
    this.pause = getPause();
  }
  
  public void run() {
    try {
      this.entropy.set(this.baseRandom.getEntropy(this.pause));
      this.seedAvailable.set(true);
    } catch (InterruptedException interruptedException) {
      if (LOG.isLoggable(Level.FINE))
        LOG.fine("entropy request interrupted - exiting"); 
      Thread.currentThread().interrupt();
    } 
  }
  
  private static long getPause() {
    String str = Properties.getPropertyValue("org.bouncycastle.drbg.gather_pause_secs");
    if (str != null)
      try {
        return Long.parseLong(str) * 1000L;
      } catch (Exception exception) {
        return 5000L;
      }  
    return 5000L;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\drbg\EntropyGatherer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */