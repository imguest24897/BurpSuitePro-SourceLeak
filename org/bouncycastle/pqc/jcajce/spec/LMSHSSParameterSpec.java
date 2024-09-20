package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;

public class LMSHSSParameterSpec implements AlgorithmParameterSpec {
  private final LMSParameterSpec[] specs;
  
  public LMSHSSParameterSpec(LMSParameterSpec[] paramArrayOfLMSParameterSpec) {
    this.specs = (LMSParameterSpec[])paramArrayOfLMSParameterSpec.clone();
  }
  
  public LMSParameterSpec[] getLMSSpecs() {
    return (LMSParameterSpec[])this.specs.clone();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\spec\LMSHSSParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */