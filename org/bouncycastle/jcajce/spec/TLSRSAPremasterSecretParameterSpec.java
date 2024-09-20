package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;

public class TLSRSAPremasterSecretParameterSpec implements AlgorithmParameterSpec {
  private final int protocolVersion;
  
  public TLSRSAPremasterSecretParameterSpec(int paramInt) {
    this.protocolVersion = paramInt;
  }
  
  public int getProtocolVersion() {
    return this.protocolVersion;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\spec\TLSRSAPremasterSecretParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */