package META-INF.versions.9.org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;

public class DERBitString extends ASN1BitString {
  public static org.bouncycastle.asn1.DERBitString convert(ASN1BitString paramASN1BitString) {
    return (org.bouncycastle.asn1.DERBitString)paramASN1BitString.toDERObject();
  }
  
  public DERBitString(byte[] paramArrayOfbyte) {
    this(paramArrayOfbyte, 0);
  }
  
  public DERBitString(byte paramByte, int paramInt) {
    super(paramByte, paramInt);
  }
  
  public DERBitString(byte[] paramArrayOfbyte, int paramInt) {
    super(paramArrayOfbyte, paramInt);
  }
  
  public DERBitString(int paramInt) {
    super(getBytes(paramInt), getPadBits(paramInt));
  }
  
  public DERBitString(ASN1Encodable paramASN1Encodable) throws IOException {
    super(paramASN1Encodable.toASN1Primitive().getEncoded("DER"), 0);
  }
  
  DERBitString(byte[] paramArrayOfbyte, boolean paramBoolean) {
    super(paramArrayOfbyte, paramBoolean);
  }
  
  boolean encodeConstructed() {
    return false;
  }
  
  int encodedLength(boolean paramBoolean) {
    return ASN1OutputStream.getLengthOfEncodingDL(paramBoolean, this.contents.length);
  }
  
  void encode(ASN1OutputStream paramASN1OutputStream, boolean paramBoolean) throws IOException {
    int i = this.contents[0] & 0xFF;
    int j = this.contents.length;
    int k = j - 1;
    byte b1 = this.contents[k];
    byte b2 = (byte)(this.contents[k] & 255 << i);
    if (b1 == b2) {
      paramASN1OutputStream.writeEncodingDL(paramBoolean, 3, this.contents);
    } else {
      paramASN1OutputStream.writeEncodingDL(paramBoolean, 3, this.contents, 0, k, b2);
    } 
  }
  
  ASN1Primitive toDERObject() {
    return (ASN1Primitive)this;
  }
  
  ASN1Primitive toDLObject() {
    return (ASN1Primitive)this;
  }
  
  static org.bouncycastle.asn1.DERBitString fromOctetString(ASN1OctetString paramASN1OctetString) {
    return new org.bouncycastle.asn1.DERBitString(paramASN1OctetString.getOctets(), true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\DERBitString.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */