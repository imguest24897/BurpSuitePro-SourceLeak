package org.bouncycastle.asn1.cmp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;

public class PKIFreeText extends ASN1Object {
  ASN1Sequence strings;
  
  private PKIFreeText(ASN1Sequence paramASN1Sequence) {
    Enumeration enumeration = paramASN1Sequence.getObjects();
    while (enumeration.hasMoreElements()) {
      if (!(enumeration.nextElement() instanceof ASN1UTF8String))
        throw new IllegalArgumentException("attempt to insert non UTF8 STRING into PKIFreeText"); 
    } 
    this.strings = paramASN1Sequence;
  }
  
  public PKIFreeText(ASN1UTF8String paramASN1UTF8String) {
    this.strings = (ASN1Sequence)new DERSequence((ASN1Encodable)paramASN1UTF8String);
  }
  
  public PKIFreeText(String paramString) {
    this((ASN1UTF8String)new DERUTF8String(paramString));
  }
  
  public PKIFreeText(ASN1UTF8String[] paramArrayOfASN1UTF8String) {
    this.strings = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfASN1UTF8String);
  }
  
  public PKIFreeText(String[] paramArrayOfString) {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(paramArrayOfString.length);
    for (byte b = 0; b < paramArrayOfString.length; b++)
      aSN1EncodableVector.add((ASN1Encodable)new DERUTF8String(paramArrayOfString[b])); 
    this.strings = (ASN1Sequence)new DERSequence(aSN1EncodableVector);
  }
  
  public static PKIFreeText getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return getInstance(ASN1Sequence.getInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  public static PKIFreeText getInstance(Object paramObject) {
    return (paramObject instanceof PKIFreeText) ? (PKIFreeText)paramObject : ((paramObject != null) ? new PKIFreeText(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public int size() {
    return this.strings.size();
  }
  
  public DERUTF8String getStringAt(int paramInt) {
    ASN1UTF8String aSN1UTF8String = getStringAtUTF8(paramInt);
    return (null == aSN1UTF8String || aSN1UTF8String instanceof DERUTF8String) ? (DERUTF8String)aSN1UTF8String : new DERUTF8String(aSN1UTF8String.getString());
  }
  
  public ASN1UTF8String getStringAtUTF8(int paramInt) {
    return (ASN1UTF8String)this.strings.getObjectAt(paramInt);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.strings;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\PKIFreeText.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */