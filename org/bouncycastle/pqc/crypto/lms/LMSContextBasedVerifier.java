package org.bouncycastle.pqc.crypto.lms;

public interface LMSContextBasedVerifier {
  LMSContext generateLMSContext(byte[] paramArrayOfbyte);
  
  boolean verify(LMSContext paramLMSContext);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\lms\LMSContextBasedVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */