package org.bouncycastle.tls;

import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.util.Arrays;

public class CombinedHash implements TlsHash {
  protected TlsContext context;
  
  protected TlsCrypto crypto;
  
  protected TlsHash md5;
  
  protected TlsHash sha1;
  
  CombinedHash(TlsContext paramTlsContext, TlsHash paramTlsHash1, TlsHash paramTlsHash2) {
    this.context = paramTlsContext;
    this.crypto = paramTlsContext.getCrypto();
    this.md5 = paramTlsHash1;
    this.sha1 = paramTlsHash2;
  }
  
  public CombinedHash(TlsCrypto paramTlsCrypto) {
    this.crypto = paramTlsCrypto;
    this.md5 = paramTlsCrypto.createHash(1);
    this.sha1 = paramTlsCrypto.createHash(2);
  }
  
  public CombinedHash(CombinedHash paramCombinedHash) {
    this.context = paramCombinedHash.context;
    this.crypto = paramCombinedHash.crypto;
    this.md5 = paramCombinedHash.md5.cloneHash();
    this.sha1 = paramCombinedHash.sha1.cloneHash();
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.md5.update(paramArrayOfbyte, paramInt1, paramInt2);
    this.sha1.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public byte[] calculateHash() {
    if (null != this.context && TlsUtils.isSSL(this.context))
      SSL3Utils.completeCombinedHash(this.context, this.md5, this.sha1); 
    return Arrays.concatenate(this.md5.calculateHash(), this.sha1.calculateHash());
  }
  
  public TlsHash cloneHash() {
    return new CombinedHash(this);
  }
  
  public void reset() {
    this.md5.reset();
    this.sha1.reset();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\CombinedHash.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */