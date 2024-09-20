package org.bouncycastle.crypto.signers;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

public class Ed448Signer implements Signer {
  private final Buffer buffer = new Buffer();
  
  private final byte[] context;
  
  private boolean forSigning;
  
  private Ed448PrivateKeyParameters privateKey;
  
  private Ed448PublicKeyParameters publicKey;
  
  public Ed448Signer(byte[] paramArrayOfbyte) {
    if (null == paramArrayOfbyte)
      throw new NullPointerException("'context' cannot be null"); 
    this.context = Arrays.clone(paramArrayOfbyte);
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    this.forSigning = paramBoolean;
    if (paramCipherParameters instanceof ParametersWithRandom)
      paramCipherParameters = ((ParametersWithRandom)paramCipherParameters).getParameters(); 
    if (paramBoolean) {
      this.privateKey = (Ed448PrivateKeyParameters)paramCipherParameters;
      this.publicKey = null;
    } else {
      this.privateKey = null;
      this.publicKey = (Ed448PublicKeyParameters)paramCipherParameters;
    } 
    CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("Ed448", 224, paramCipherParameters, paramBoolean));
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
      throw new IllegalStateException("Ed448Signer not initialised for signature generation."); 
    return this.buffer.generateSignature(this.privateKey, this.context);
  }
  
  public boolean verifySignature(byte[] paramArrayOfbyte) {
    if (this.forSigning || null == this.publicKey)
      throw new IllegalStateException("Ed448Signer not initialised for verification"); 
    return this.buffer.verifySignature(this.publicKey, this.context, paramArrayOfbyte);
  }
  
  public void reset() {
    this.buffer.reset();
  }
  
  private static final class Buffer extends ByteArrayOutputStream {
    private Buffer() {}
    
    synchronized byte[] generateSignature(Ed448PrivateKeyParameters param1Ed448PrivateKeyParameters, byte[] param1ArrayOfbyte) {
      byte[] arrayOfByte = new byte[114];
      param1Ed448PrivateKeyParameters.sign(0, param1ArrayOfbyte, this.buf, 0, this.count, arrayOfByte, 0);
      reset();
      return arrayOfByte;
    }
    
    synchronized boolean verifySignature(Ed448PublicKeyParameters param1Ed448PublicKeyParameters, byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2) {
      if (114 != param1ArrayOfbyte2.length) {
        reset();
        return false;
      } 
      boolean bool = param1Ed448PublicKeyParameters.verify(0, param1ArrayOfbyte1, this.buf, 0, this.count, param1ArrayOfbyte2, 0);
      reset();
      return bool;
    }
    
    public synchronized void reset() {
      Arrays.fill(this.buf, 0, this.count, (byte)0);
      this.count = 0;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\signers\Ed448Signer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */