package org.bouncycastle.pqc.crypto;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;

public interface MessageEncryptor {
  void init(boolean paramBoolean, CipherParameters paramCipherParameters);
  
  byte[] messageEncrypt(byte[] paramArrayOfbyte);
  
  byte[] messageDecrypt(byte[] paramArrayOfbyte) throws InvalidCipherTextException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\MessageEncryptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */