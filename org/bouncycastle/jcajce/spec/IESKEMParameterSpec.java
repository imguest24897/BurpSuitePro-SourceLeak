package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

public class IESKEMParameterSpec implements AlgorithmParameterSpec {
  private final byte[] recipientInfo;
  
  private final boolean usePointCompression;
  
  public IESKEMParameterSpec(byte[] paramArrayOfbyte) {
    this(paramArrayOfbyte, false);
  }
  
  public IESKEMParameterSpec(byte[] paramArrayOfbyte, boolean paramBoolean) {
    this.recipientInfo = Arrays.clone(paramArrayOfbyte);
    this.usePointCompression = paramBoolean;
  }
  
  public byte[] getRecipientInfo() {
    return Arrays.clone(this.recipientInfo);
  }
  
  public boolean hasUsePointCompression() {
    return this.usePointCompression;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\spec\IESKEMParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */