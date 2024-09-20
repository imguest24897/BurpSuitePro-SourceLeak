package META-INF.versions.9.org.bouncycastle.asn1;

import org.bouncycastle.asn1.ASN1PrintableString;

public class DERPrintableString extends ASN1PrintableString {
  public DERPrintableString(String paramString) {
    this(paramString, false);
  }
  
  public DERPrintableString(String paramString, boolean paramBoolean) {
    super(paramString, paramBoolean);
  }
  
  DERPrintableString(byte[] paramArrayOfbyte, boolean paramBoolean) {
    super(paramArrayOfbyte, paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\DERPrintableString.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */