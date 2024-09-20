package org.bouncycastle.its.operator;

public interface ETSIDataEncryptor {
  byte[] encrypt(byte[] paramArrayOfbyte);
  
  byte[] getKey();
  
  byte[] getNonce();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\operator\ETSIDataEncryptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */