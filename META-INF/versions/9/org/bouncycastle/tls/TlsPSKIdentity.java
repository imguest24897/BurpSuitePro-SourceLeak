package META-INF.versions.9.org.bouncycastle.tls;

public interface TlsPSKIdentity {
  void skipIdentityHint();
  
  void notifyIdentityHint(byte[] paramArrayOfbyte);
  
  byte[] getPSKIdentity();
  
  byte[] getPSK();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsPSKIdentity.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */