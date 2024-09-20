package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;

public class SubjectAssurance extends DEROctetString {
  public SubjectAssurance(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
    if (paramArrayOfbyte.length != 1)
      throw new IllegalArgumentException("length is not 1"); 
  }
  
  private SubjectAssurance(ASN1OctetString paramASN1OctetString) {
    this(paramASN1OctetString.getOctets());
  }
  
  public static SubjectAssurance getInstance(Object paramObject) {
    return (paramObject instanceof SubjectAssurance) ? (SubjectAssurance)paramObject : ((paramObject != null) ? new SubjectAssurance(DEROctetString.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\SubjectAssurance.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */