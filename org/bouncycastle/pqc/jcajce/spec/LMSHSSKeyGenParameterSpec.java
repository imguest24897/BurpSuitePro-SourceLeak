package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;

public class LMSHSSKeyGenParameterSpec implements AlgorithmParameterSpec {
  private final LMSKeyGenParameterSpec[] specs;
  
  public LMSHSSKeyGenParameterSpec(LMSKeyGenParameterSpec... paramVarArgs) {
    if (paramVarArgs.length == 0)
      throw new IllegalArgumentException("at least one LMSKeyGenParameterSpec required"); 
    this.specs = (LMSKeyGenParameterSpec[])paramVarArgs.clone();
  }
  
  public LMSKeyGenParameterSpec[] getLMSSpecs() {
    return (LMSKeyGenParameterSpec[])this.specs.clone();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\spec\LMSHSSKeyGenParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */