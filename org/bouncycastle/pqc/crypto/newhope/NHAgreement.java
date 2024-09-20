package org.bouncycastle.pqc.crypto.newhope;

import org.bouncycastle.crypto.CipherParameters;

public class NHAgreement {
  private NHPrivateKeyParameters privKey;
  
  public void init(CipherParameters paramCipherParameters) {
    this.privKey = (NHPrivateKeyParameters)paramCipherParameters;
  }
  
  public byte[] calculateAgreement(CipherParameters paramCipherParameters) {
    NHPublicKeyParameters nHPublicKeyParameters = (NHPublicKeyParameters)paramCipherParameters;
    byte[] arrayOfByte = new byte[32];
    NewHope.sharedA(arrayOfByte, this.privKey.secData, nHPublicKeyParameters.pubData);
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\newhope\NHAgreement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */