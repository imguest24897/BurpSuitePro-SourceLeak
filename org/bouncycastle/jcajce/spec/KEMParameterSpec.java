package org.bouncycastle.jcajce.spec;

public class KEMParameterSpec extends KTSParameterSpec {
  public KEMParameterSpec(String paramString) {
    this(paramString, 256);
  }
  
  public KEMParameterSpec(String paramString, int paramInt) {
    super(paramString, paramInt, null, null, null);
  }
  
  public int getKeySizeInBits() {
    return getKeySize();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\spec\KEMParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */