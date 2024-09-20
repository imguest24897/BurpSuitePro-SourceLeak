package org.bouncycastle.crypto.signers;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.util.Arrays;

public class Ed25519ctxSigner implements Signer {
  private final Buffer buffer = new Buffer();
  
  private final byte[] context;
  
  private boolean forSigning;
  
  private Ed25519PrivateKeyParameters privateKey;
  
  private Ed25519PublicKeyParameters publicKey;
  
  public Ed25519ctxSigner(byte[] paramArrayOfbyte) {
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
    this.buffer.write(paramByte);
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.buffer.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public byte[] generateSignature() {
    if (!this.forSigning || null == this.privateKey)
      throw new IllegalStateException("Ed25519ctxSigner not initialised for signature generation."); 
    return this.buffer.generateSignature(this.privateKey, this.context);
  }
  
  public boolean verifySignature(byte[] paramArrayOfbyte) {
    if (this.forSigning || null == this.publicKey)
      throw new IllegalStateException("Ed25519ctxSigner not initialised for verification"); 
    return this.buffer.verifySignature(this.publicKey, this.context, paramArrayOfbyte);
  }
  
  public void reset() {
    this.buffer.reset();
  }
  
  private static final class Buffer extends ByteArrayOutputStream {
    private Buffer() {}
    
    synchronized byte[] generateSignature(Ed25519PrivateKeyParameters param1Ed25519PrivateKeyParameters, byte[] param1ArrayOfbyte) {
      byte[] arrayOfByte = new byte[64];
      param1Ed25519PrivateKeyParameters.sign(1, param1ArrayOfbyte, this.buf, 0, this.count, arrayOfByte, 0);
      reset();
      return arrayOfByte;
    }
    
    synchronized boolean verifySignature(Ed25519PublicKeyParameters param1Ed25519PublicKeyParameters, byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2) {
      if (64 != param1ArrayOfbyte2.length) {
        reset();
        return false;
      } 
      boolean bool = param1Ed25519PublicKeyParameters.verify(1, param1ArrayOfbyte1, this.buf, 0, this.count, param1ArrayOfbyte2, 0);
      reset();
      return bool;
    }
    
    public synchronized void reset() {
      Arrays.fill(this.buf, 0, this.count, (byte)0);
      this.count = 0;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\signers\Ed25519ctxSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */