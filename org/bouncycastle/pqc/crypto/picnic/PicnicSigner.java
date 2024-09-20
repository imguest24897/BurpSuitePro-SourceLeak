package org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class PicnicSigner implements MessageSigner {
  private PicnicPrivateKeyParameters privKey;
  
  private PicnicPublicKeyParameters pubKey;
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    if (paramBoolean) {
      this.privKey = (PicnicPrivateKeyParameters)paramCipherParameters;
    } else {
      this.pubKey = (PicnicPublicKeyParameters)paramCipherParameters;
    } 
  }
  
  public byte[] generateSignature(byte[] paramArrayOfbyte) {
    PicnicEngine picnicEngine = this.privKey.getParameters().getEngine();
    byte[] arrayOfByte1 = new byte[picnicEngine.getSignatureSize(paramArrayOfbyte.length)];
    picnicEngine.crypto_sign(arrayOfByte1, paramArrayOfbyte, this.privKey.getEncoded());
    byte[] arrayOfByte2 = new byte[picnicEngine.getTrueSignatureSize()];
    System.arraycopy(arrayOfByte1, paramArrayOfbyte.length + 4, arrayOfByte2, 0, picnicEngine.getTrueSignatureSize());
    return arrayOfByte2;
  }
  
  public boolean verifySignature(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    PicnicEngine picnicEngine = this.pubKey.getParameters().getEngine();
    byte[] arrayOfByte1 = new byte[paramArrayOfbyte1.length];
    byte[] arrayOfByte2 = Arrays.concatenate(Pack.intToLittleEndian(paramArrayOfbyte2.length), paramArrayOfbyte1, paramArrayOfbyte2);
    boolean bool = picnicEngine.crypto_sign_open(arrayOfByte1, arrayOfByte2, this.pubKey.getEncoded());
    return !Arrays.areEqual(paramArrayOfbyte1, arrayOfByte1) ? false : bool;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\picnic\PicnicSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */