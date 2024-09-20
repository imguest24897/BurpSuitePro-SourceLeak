package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.util.Arrays;

public class BIKEKEMExtractor implements EncapsulatedSecretExtractor {
  private BIKEEngine engine;
  
  private BIKEKeyParameters key;
  
  public BIKEKEMExtractor(BIKEPrivateKeyParameters paramBIKEPrivateKeyParameters) {
    this.key = paramBIKEPrivateKeyParameters;
    initCipher(this.key.getParameters());
  }
  
  private void initCipher(BIKEParameters paramBIKEParameters) {
    this.engine = paramBIKEParameters.getEngine();
  }
  
  public byte[] extractSecret(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = new byte[this.engine.getSessionKeySize()];
    BIKEPrivateKeyParameters bIKEPrivateKeyParameters = (BIKEPrivateKeyParameters)this.key;
    byte[] arrayOfByte2 = Arrays.copyOfRange(paramArrayOfbyte, 0, bIKEPrivateKeyParameters.getParameters().getRByte());
    byte[] arrayOfByte3 = Arrays.copyOfRange(paramArrayOfbyte, bIKEPrivateKeyParameters.getParameters().getRByte(), paramArrayOfbyte.length);
    byte[] arrayOfByte4 = bIKEPrivateKeyParameters.getH0();
    byte[] arrayOfByte5 = bIKEPrivateKeyParameters.getH1();
    byte[] arrayOfByte6 = bIKEPrivateKeyParameters.getSigma();
    this.engine.decaps(arrayOfByte1, arrayOfByte4, arrayOfByte5, arrayOfByte6, arrayOfByte2, arrayOfByte3);
    return Arrays.copyOfRange(arrayOfByte1, 0, this.key.getParameters().getSessionKeySize() / 8);
  }
  
  public int getEncapsulationLength() {
    return this.key.getParameters().getRByte() + this.key.getParameters().getLByte();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\bike\BIKEKEMExtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */