package META-INF.versions.9.org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UniversalType;
import org.bouncycastle.asn1.DERVisibleString;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public abstract class ASN1VisibleString extends ASN1Primitive implements ASN1String {
  static final ASN1UniversalType TYPE = (ASN1UniversalType)new Object(org.bouncycastle.asn1.ASN1VisibleString.class, 26);
  
  final byte[] contents;
  
  public static org.bouncycastle.asn1.ASN1VisibleString getInstance(Object paramObject) {
    if (paramObject == null || paramObject instanceof org.bouncycastle.asn1.ASN1VisibleString)
      return (org.bouncycastle.asn1.ASN1VisibleString)paramObject; 
    if (paramObject instanceof ASN1Encodable) {
      ASN1Primitive aSN1Primitive = ((ASN1Encodable)paramObject).toASN1Primitive();
      if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1VisibleString)
        return (org.bouncycastle.asn1.ASN1VisibleString)aSN1Primitive; 
    } 
    if (paramObject instanceof byte[])
      try {
        return (org.bouncycastle.asn1.ASN1VisibleString)TYPE.fromByteArray((byte[])paramObject);
      } catch (Exception exception) {
        throw new IllegalArgumentException("encoding error in getInstance: " + exception.toString());
      }  
    throw new IllegalArgumentException("illegal object in getInstance: " + paramObject.getClass().getName());
  }
  
  public static org.bouncycastle.asn1.ASN1VisibleString getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return (org.bouncycastle.asn1.ASN1VisibleString)TYPE.getContextInstance(paramASN1TaggedObject, paramBoolean);
  }
  
  ASN1VisibleString(String paramString) {
    this.contents = Strings.toByteArray(paramString);
  }
  
  ASN1VisibleString(byte[] paramArrayOfbyte, boolean paramBoolean) {
    this.contents = paramBoolean ? Arrays.clone(paramArrayOfbyte) : paramArrayOfbyte;
  }
  
  public final String getString() {
    return Strings.fromByteArray(this.contents);
  }
  
  public String toString() {
    return getString();
  }
  
  public final byte[] getOctets() {
    return Arrays.clone(this.contents);
  }
  
  final boolean encodeConstructed() {
    return false;
  }
  
  final int encodedLength(boolean paramBoolean) {
    return ASN1OutputStream.getLengthOfEncodingDL(paramBoolean, this.contents.length);
  }
  
  final void encode(ASN1OutputStream paramASN1OutputStream, boolean paramBoolean) throws IOException {
    paramASN1OutputStream.writeEncodingDL(paramBoolean, 26, this.contents);
  }
  
  final boolean asn1Equals(ASN1Primitive paramASN1Primitive) {
    if (!(paramASN1Primitive instanceof org.bouncycastle.asn1.ASN1VisibleString))
      return false; 
    org.bouncycastle.asn1.ASN1VisibleString aSN1VisibleString = (org.bouncycastle.asn1.ASN1VisibleString)paramASN1Primitive;
    return Arrays.areEqual(this.contents, aSN1VisibleString.contents);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(this.contents);
  }
  
  static org.bouncycastle.asn1.ASN1VisibleString createPrimitive(byte[] paramArrayOfbyte) {
    return (org.bouncycastle.asn1.ASN1VisibleString)new DERVisibleString(paramArrayOfbyte, false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\ASN1VisibleString.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */