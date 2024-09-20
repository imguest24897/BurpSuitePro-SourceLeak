package org.bouncycastle.crypto.signers;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;

public class Ed25519phSigner implements Signer {
  private final Digest prehash = Ed25519.createPrehash();
  
  private final byte[] context;
  
  private boolean forSigning;
  
  private Ed25519PrivateKeyParameters privateKey;
  
  private Ed25519PublicKeyParameters publicKey;
  
  public Ed25519phSigner(byte[] paramArrayOfbyte) {
    if (null == paramArrayOfbyte)
      throw new NullPointerException("'context' cannot be null"); 
    this.context = Arrays.clone(paramArrayOfbyte);
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    this.forSigning = paramBoolean;
    if (paramBoolean) {
      this.privateKey = (Ed25519PrivateKeyParameters)paramCipherParameters;
      this.publicKey = null;
    } else {
      this.privateKey = null;
      this.publicKey = (Ed25519PublicKeyParameters)paramCipherParameters;
    } 
    CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("Ed25519", 128, paramCipherParameters, paramBoolean));
    reset();
  }
  
  public void update(byte paramByte) {
    this.prehash.update(paramByte);
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.prehash.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public byte[] generateSignature() {
    if (!this.forSigning || null == this.privateKey)
      throw new IllegalStateException("Ed25519phSigner not initialised for signature generation."); 
    byte[] arrayOfByte1 = new byte[64];
    if (64 != this.prehash.doFinal(arrayOfByte1, 0))
      throw new IllegalStateException("Prehash digest failed"); 
    byte[] arrayOfByte2 = new byte[64];
    this.privateKey.sign(2, this.context, arrayOfByte1, 0, 64, arrayOfByte2, 0);
    return arrayOfByte2;
  }
  
  public boolean verifySignature(byte[] paramArrayOfbyte) {
    if (this.forSigning || null == this.publicKey)
      throw new IllegalStateException("Ed25519phSigner not initialised for verification"); 
    if (64 != paramArrayOfbyte.length) {
      this.prehash.reset();
      return false;
    } 
    byte[] arrayOfByte = new byte[64];
    if (64 != this.prehash.doFinal(arrayOfByte, 0))
      throw new IllegalStateException("Prehash digest failed"); 
    return this.publicKey.verify(2, this.context, arrayOfByte, 0, 64, paramArrayOfbyte, 0);
  }
  
  public void reset() {
    this.prehash.reset();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\signers\Ed25519phSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */