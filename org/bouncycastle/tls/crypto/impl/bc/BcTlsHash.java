package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.tls.crypto.TlsHash;

final class BcTlsHash implements TlsHash {
  private final BcTlsCrypto crypto;
  
  private final int cryptoHashAlgorithm;
  
  private final Digest digest;
  
  BcTlsHash(BcTlsCrypto paramBcTlsCrypto, int paramInt) {
    this(paramBcTlsCrypto, paramInt, paramBcTlsCrypto.createDigest(paramInt));
  }
  
  private BcTlsHash(BcTlsCrypto paramBcTlsCrypto, int paramInt, Digest paramDigest) {
    this.crypto = paramBcTlsCrypto;
    this.cryptoHashAlgorithm = paramInt;
    this.digest = paramDigest;
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.digest.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public byte[] calculateHash() {
    byte[] arrayOfByte = new byte[this.digest.getDigestSize()];
    this.digest.doFinal(arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public TlsHash cloneHash() {
    return new BcTlsHash(this.crypto, this.cryptoHashAlgorithm, this.crypto.cloneDigest(this.cryptoHashAlgorithm, this.digest));
  }
  
  public void reset() {
    this.digest.reset();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsHash.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */