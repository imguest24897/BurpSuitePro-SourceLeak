package META-INF.versions.9.org.bouncycastle.asn1;

import org.bouncycastle.asn1.ASN1UniversalString;

public class DERUniversalString extends ASN1UniversalString {
  public DERUniversalString(byte[] paramArrayOfbyte) {
    this(paramArrayOfbyte, true);
  }
  
  DERUniversalString(byte[] paramArrayOfbyte, boolean paramBoolean) {
    super(paramArrayOfbyte, paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\DERUniversalString.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */