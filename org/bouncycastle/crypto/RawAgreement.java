package org.bouncycastle.crypto;

public interface RawAgreement {
  void init(CipherParameters paramCipherParameters);
  
  int getAgreementSize();
  
  void calculateAgreement(CipherParameters paramCipherParameters, byte[] paramArrayOfbyte, int paramInt);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\RawAgreement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */