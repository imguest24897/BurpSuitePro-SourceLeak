package org.bouncycastle.pqc.crypto.lms;

public interface LMSContextBasedSigner {
  LMSContext generateLMSContext();
  
  byte[] generateSignature(LMSContext paramLMSContext);
  
  long getUsagesRemaining();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\lms\LMSContextBasedSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */