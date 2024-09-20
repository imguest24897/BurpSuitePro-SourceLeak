package org.bouncycastle.jcajce.spec;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;

public class DHExtendedPrivateKeySpec extends DHPrivateKeySpec {
  private final DHParameterSpec params;
  
  public DHExtendedPrivateKeySpec(BigInteger paramBigInteger, DHParameterSpec paramDHParameterSpec) {
    super(paramBigInteger, paramDHParameterSpec.getP(), paramDHParameterSpec.getG());
    this.params = paramDHParameterSpec;
  }
  
  public DHParameterSpec getParams() {
    return this.params;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\spec\DHExtendedPrivateKeySpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */