package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class ParametersWithSBox implements CipherParameters {
  private CipherParameters parameters;
  
  private byte[] sBox;
  
  public ParametersWithSBox(CipherParameters paramCipherParameters, byte[] paramArrayOfbyte) {
    this.parameters = paramCipherParameters;
    this.sBox = paramArrayOfbyte;
  }
  
  public byte[] getSBox() {
    return this.sBox;
  }
  
  public CipherParameters getParameters() {
    return this.parameters;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\ParametersWithSBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */