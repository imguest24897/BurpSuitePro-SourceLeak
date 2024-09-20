package META-INF.versions.9.org.bouncycastle.tls;

import java.math.BigInteger;
import org.bouncycastle.tls.crypto.TlsSRPConfig;
import org.bouncycastle.util.Arrays;

public class TlsSRPLoginParameters {
  protected byte[] identity;
  
  protected TlsSRPConfig srpConfig;
  
  protected BigInteger verifier;
  
  protected byte[] salt;
  
  public TlsSRPLoginParameters(byte[] paramArrayOfbyte1, TlsSRPConfig paramTlsSRPConfig, BigInteger paramBigInteger, byte[] paramArrayOfbyte2) {
    this.identity = Arrays.clone(paramArrayOfbyte1);
    this.srpConfig = paramTlsSRPConfig;
    this.verifier = paramBigInteger;
    this.salt = Arrays.clone(paramArrayOfbyte2);
  }
  
  public TlsSRPConfig getConfig() {
    return this.srpConfig;
  }
  
  public byte[] getIdentity() {
    return this.identity;
  }
  
  public byte[] getSalt() {
    return this.salt;
  }
  
  public BigInteger getVerifier() {
    return this.verifier;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsSRPLoginParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */