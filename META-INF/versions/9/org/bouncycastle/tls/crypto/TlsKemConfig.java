package META-INF.versions.9.org.bouncycastle.tls.crypto;

public class TlsKemConfig {
  protected final int namedGroup;
  
  protected final boolean isServer;
  
  public TlsKemConfig(int paramInt, boolean paramBoolean) {
    this.namedGroup = paramInt;
    this.isServer = paramBoolean;
  }
  
  public int getNamedGroup() {
    return this.namedGroup;
  }
  
  public boolean isServer() {
    return this.isServer;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\TlsKemConfig.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */