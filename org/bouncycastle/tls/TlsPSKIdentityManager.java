package org.bouncycastle.tls;

public interface TlsPSKIdentityManager {
  byte[] getHint();
  
  byte[] getPSK(byte[] paramArrayOfbyte);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsPSKIdentityManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */