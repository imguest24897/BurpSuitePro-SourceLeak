package org.bouncycastle.jcajce.provider.drbg;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.crypto.prng.EntropySourceProvider;

class IncrementalEntropySourceProvider implements EntropySourceProvider {
  private final SecureRandom random;
  
  private final boolean predictionResistant;
  
  public IncrementalEntropySourceProvider(SecureRandom paramSecureRandom, boolean paramBoolean) {
    this.random = paramSecureRandom;
    this.predictionResistant = paramBoolean;
  }
  
  public EntropySource get(final int bitsRequired) {
    return new IncrementalEntropySource() {
        final int numBytes = (bitsRequired + 7) / 8;
        
        public boolean isPredictionResistant() {
          return IncrementalEntropySourceProvider.this.predictionResistant;
        }
        
        public byte[] getEntropy() {
          try {
            return getEntropy(0L);
          } catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("initial entropy fetch interrupted");
          } 
        }
        
        public byte[] getEntropy(long param1Long) throws InterruptedException {
          byte[] arrayOfByte = new byte[this.numBytes];
          int i;
          for (i = 0; i < this.numBytes / 8; i++) {
            IncrementalEntropySourceProvider.sleep(param1Long);
            byte[] arrayOfByte1 = IncrementalEntropySourceProvider.this.random.generateSeed(8);
            System.arraycopy(arrayOfByte1, 0, arrayOfByte, i * 8, arrayOfByte1.length);
          } 
          i = this.numBytes - this.numBytes / 8 * 8;
          if (i != 0) {
            IncrementalEntropySourceProvider.sleep(param1Long);
            byte[] arrayOfByte1 = IncrementalEntropySourceProvider.this.random.generateSeed(i);
            System.arraycopy(arrayOfByte1, 0, arrayOfByte, arrayOfByte.length - arrayOfByte1.length, arrayOfByte1.length);
          } 
          return arrayOfByte;
        }
        
        public int entropySize() {
          return bitsRequired;
        }
      };
  }
  
  private static void sleep(long paramLong) throws InterruptedException {
    if (paramLong != 0L)
      Thread.sleep(paramLong); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\drbg\IncrementalEntropySourceProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */