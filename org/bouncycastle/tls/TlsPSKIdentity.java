package org.bouncycastle.tls;

public interface TlsPSKIdentity {
  void skipIdentityHint();
  
  void notifyIdentityHint(byte[] paramArrayOfbyte);
  
  byte[] getPSKIdentity();
  
  byte[] getPSK();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsPSKIdentity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */