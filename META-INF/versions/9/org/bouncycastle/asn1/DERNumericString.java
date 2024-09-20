package META-INF.versions.9.org.bouncycastle.asn1;

import org.bouncycastle.asn1.ASN1NumericString;

public class DERNumericString extends ASN1NumericString {
  public DERNumericString(String paramString) {
    this(paramString, false);
  }
  
  public DERNumericString(String paramString, boolean paramBoolean) {
    super(paramString, paramBoolean);
  }
  
  DERNumericString(byte[] paramArrayOfbyte, boolean paramBoolean) {
    super(paramArrayOfbyte, paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\DERNumericString.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */