package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.util.Arrays;

public class DhSigStatic extends ASN1Object {
  private final IssuerAndSerialNumber issuerAndSerial;
  
  private final ASN1OctetString hashValue;
  
  public DhSigStatic(byte[] paramArrayOfbyte) {
    this(null, paramArrayOfbyte);
  }
  
  public DhSigStatic(IssuerAndSerialNumber paramIssuerAndSerialNumber, byte[] paramArrayOfbyte) {
    this.issuerAndSerial = paramIssuerAndSerialNumber;
    this.hashValue = (ASN1OctetString)new DEROctetString(Arrays.clone(paramArrayOfbyte));
  }
  
  public static DhSigStatic getInstance(Object paramObject) {
    return (paramObject instanceof DhSigStatic) ? (DhSigStatic)paramObject : ((paramObject != null) ? new DhSigStatic(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private DhSigStatic(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() == 1) {
      this.issuerAndSerial = null;
      this.hashValue = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(0));
    } else if (paramASN1Sequence.size() == 2) {
      this.issuerAndSerial = IssuerAndSerialNumber.getInstance(paramASN1Sequence.getObjectAt(0));
      this.hashValue = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1));
    } else {
      throw new IllegalArgumentException("sequence wrong length for DhSigStatic");
    } 
  }
  
  public IssuerAndSerialNumber getIssuerAndSerial() {
    return this.issuerAndSerial;
  }
  
  public byte[] getHashValue() {
    return Arrays.clone(this.hashValue.getOctets());
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    if (this.issuerAndSerial != null)
      aSN1EncodableVector.add((ASN1Encodable)this.issuerAndSerial); 
    aSN1EncodableVector.add((ASN1Encodable)this.hashValue);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\crmf\DhSigStatic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */