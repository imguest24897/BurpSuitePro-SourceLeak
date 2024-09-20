package org.bouncycastle.asn1;

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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\DERNumericString.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */