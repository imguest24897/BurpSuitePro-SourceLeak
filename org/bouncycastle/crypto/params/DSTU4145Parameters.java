package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

public class DSTU4145Parameters extends ECDomainParameters {
  private final byte[] dke;
  
  public DSTU4145Parameters(ECDomainParameters paramECDomainParameters, byte[] paramArrayOfbyte) {
    super(paramECDomainParameters.getCurve(), paramECDomainParameters.getG(), paramECDomainParameters.getN(), paramECDomainParameters.getH(), paramECDomainParameters.getSeed());
    this.dke = Arrays.clone(paramArrayOfbyte);
  }
  
  public byte[] getDKE() {
    return Arrays.clone(this.dke);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\DSTU4145Parameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */