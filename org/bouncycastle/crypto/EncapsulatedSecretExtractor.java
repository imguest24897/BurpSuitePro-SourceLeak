package org.bouncycastle.crypto;

public interface EncapsulatedSecretExtractor {
  byte[] extractSecret(byte[] paramArrayOfbyte);
  
  int getEncapsulationLength();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\EncapsulatedSecretExtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */