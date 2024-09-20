package org.bouncycastle.tls;

import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;

public class BasicTlsPSKExternal implements TlsPSKExternal {
  protected final byte[] identity;
  
  protected final TlsSecret key;
  
  protected final int prfAlgorithm;
  
  public BasicTlsPSKExternal(byte[] paramArrayOfbyte, TlsSecret paramTlsSecret) {
    this(paramArrayOfbyte, paramTlsSecret, 4);
  }
  
  public BasicTlsPSKExternal(byte[] paramArrayOfbyte, TlsSecret paramTlsSecret, int paramInt) {
    this.identity = Arrays.clone(paramArrayOfbyte);
    this.key = paramTlsSecret;
    this.prfAlgorithm = paramInt;
  }
  
  public byte[] getIdentity() {
    return this.identity;
  }
  
  public TlsSecret getKey() {
    return this.key;
  }
  
  public int getPRFAlgorithm() {
    return this.prfAlgorithm;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\BasicTlsPSKExternal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */