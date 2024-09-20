package org.bouncycastle.asn1;

import java.io.IOException;

public class ASN1Absent extends ASN1Primitive {
  public static final ASN1Absent INSTANCE = new ASN1Absent();
  
  public int hashCode() {
    return 0;
  }
  
  boolean encodeConstructed() {
    return false;
  }
  
  int encodedLength(boolean paramBoolean) throws IOException {
    return 0;
  }
  
  void encode(ASN1OutputStream paramASN1OutputStream, boolean paramBoolean) throws IOException {}
  
  boolean asn1Equals(ASN1Primitive paramASN1Primitive) {
    return (paramASN1Primitive == this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\ASN1Absent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */