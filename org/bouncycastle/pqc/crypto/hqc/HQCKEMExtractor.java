package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.util.Arrays;

public class HQCKEMExtractor implements EncapsulatedSecretExtractor {
  private HQCEngine engine;
  
  private HQCKeyParameters key;
  
  public HQCKEMExtractor(HQCPrivateKeyParameters paramHQCPrivateKeyParameters) {
    this.key = paramHQCPrivateKeyParameters;
    initCipher(this.key.getParameters());
  }
  
  private void initCipher(HQCParameters paramHQCParameters) {
    this.engine = paramHQCParameters.getEngine();
  }
  
  public byte[] extractSecret(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = new byte[this.engine.getSessionKeySize()];
    HQCPrivateKeyParameters hQCPrivateKeyParameters = (HQCPrivateKeyParameters)this.key;
    byte[] arrayOfByte2 = hQCPrivateKeyParameters.getPrivateKey();
    this.engine.decaps(arrayOfByte1, paramArrayOfbyte, arrayOfByte2);
    return Arrays.copyOfRange(arrayOfByte1, 0, this.key.getParameters().getK());
  }
  
  public int getEncapsulationLength() {
    return this.key.getParameters().getN_BYTES() + this.key.getParameters().getN1N2_BYTES() + 64 + 16;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\hqc\HQCKEMExtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */