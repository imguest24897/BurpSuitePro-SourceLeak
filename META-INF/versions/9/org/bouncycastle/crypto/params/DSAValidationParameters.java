package META-INF.versions.9.org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

public class DSAValidationParameters {
  private int usageIndex;
  
  private byte[] seed;
  
  private int counter;
  
  public DSAValidationParameters(byte[] paramArrayOfbyte, int paramInt) {
    this(paramArrayOfbyte, paramInt, -1);
  }
  
  public DSAValidationParameters(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.seed = Arrays.clone(paramArrayOfbyte);
    this.counter = paramInt1;
    this.usageIndex = paramInt2;
  }
  
  public int getCounter() {
    return this.counter;
  }
  
  public byte[] getSeed() {
    return Arrays.clone(this.seed);
  }
  
  public int getUsageIndex() {
    return this.usageIndex;
  }
  
  public int hashCode() {
    return this.counter ^ Arrays.hashCode(this.seed);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof org.bouncycastle.crypto.params.DSAValidationParameters))
      return false; 
    org.bouncycastle.crypto.params.DSAValidationParameters dSAValidationParameters = (org.bouncycastle.crypto.params.DSAValidationParameters)paramObject;
    return (dSAValidationParameters.counter != this.counter) ? false : Arrays.areEqual(this.seed, dSAValidationParameters.seed);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\crypto\params\DSAValidationParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */