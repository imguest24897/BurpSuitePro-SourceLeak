package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.util.Arrays;

public class CMCEPrivateKeyParameters extends CMCEKeyParameters {
  private final byte[] privateKey;
  
  public byte[] getPrivateKey() {
    return Arrays.clone(this.privateKey);
  }
  
  public CMCEPrivateKeyParameters(CMCEParameters paramCMCEParameters, byte[] paramArrayOfbyte) {
    super(true, paramCMCEParameters);
    this.privateKey = Arrays.clone(paramArrayOfbyte);
  }
  
  public CMCEPrivateKeyParameters(CMCEParameters paramCMCEParameters, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5) {
    super(true, paramCMCEParameters);
    int i = paramArrayOfbyte1.length + paramArrayOfbyte2.length + paramArrayOfbyte3.length + paramArrayOfbyte4.length + paramArrayOfbyte5.length;
    this.privateKey = new byte[i];
    int j = 0;
    System.arraycopy(paramArrayOfbyte1, 0, this.privateKey, j, paramArrayOfbyte1.length);
    j += paramArrayOfbyte1.length;
    System.arraycopy(paramArrayOfbyte2, 0, this.privateKey, j, paramArrayOfbyte2.length);
    j += paramArrayOfbyte2.length;
    System.arraycopy(paramArrayOfbyte3, 0, this.privateKey, j, paramArrayOfbyte3.length);
    j += paramArrayOfbyte3.length;
    System.arraycopy(paramArrayOfbyte4, 0, this.privateKey, j, paramArrayOfbyte4.length);
    j += paramArrayOfbyte4.length;
    System.arraycopy(paramArrayOfbyte5, 0, this.privateKey, j, paramArrayOfbyte5.length);
  }
  
  public byte[] reconstructPublicKey() {
    CMCEEngine cMCEEngine = getParameters().getEngine();
    byte[] arrayOfByte = new byte[cMCEEngine.getPublicKeySize()];
    cMCEEngine.generate_public_key_from_private_key(this.privateKey);
    return arrayOfByte;
  }
  
  public byte[] getEncoded() {
    return Arrays.clone(this.privateKey);
  }
  
  public byte[] getDelta() {
    return Arrays.copyOfRange(this.privateKey, 0, 32);
  }
  
  public byte[] getC() {
    return Arrays.copyOfRange(this.privateKey, 32, 40);
  }
  
  public byte[] getG() {
    return Arrays.copyOfRange(this.privateKey, 40, 40 + getParameters().getT() * 2);
  }
  
  public byte[] getAlpha() {
    return Arrays.copyOfRange(this.privateKey, 40 + getParameters().getT() * 2, this.privateKey.length - 32);
  }
  
  public byte[] getS() {
    return Arrays.copyOfRange(this.privateKey, this.privateKey.length - 32, this.privateKey.length);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\cmce\CMCEPrivateKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */