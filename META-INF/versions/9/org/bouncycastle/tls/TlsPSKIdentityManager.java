package META-INF.versions.9.org.bouncycastle.tls;

public interface TlsPSKIdentityManager {
  byte[] getHint();
  
  byte[] getPSK(byte[] paramArrayOfbyte);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsPSKIdentityManager.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */