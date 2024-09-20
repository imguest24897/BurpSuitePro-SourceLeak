package org.bouncycastle.asn1.bc;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.util.Arrays;

public class ExternalValue extends ASN1Object {
  private final GeneralNames location;
  
  private final AlgorithmIdentifier hashAlg;
  
  private final byte[] hashValue;
  
  public ExternalValue(GeneralName paramGeneralName, AlgorithmIdentifier paramAlgorithmIdentifier, byte[] paramArrayOfbyte) {
    this.location = new GeneralNames(paramGeneralName);
    this.hashAlg = paramAlgorithmIdentifier;
    this.hashValue = Arrays.clone(paramArrayOfbyte);
  }
  
  private ExternalValue(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() == 3) {
      this.location = GeneralNames.getInstance(paramASN1Sequence.getObjectAt(0));
      this.hashAlg = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(1));
      if (paramASN1Sequence.getObjectAt(2) instanceof ASN1BitString) {
        this.hashValue = ASN1BitString.getInstance(paramASN1Sequence.getObjectAt(2)).getOctets();
      } else {
        this.hashValue = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(2)).getOctets();
      } 
    } else {
      throw new IllegalArgumentException("unknown sequence");
    } 
  }
  
  public static ExternalValue getInstance(Object paramObject) {
    return (paramObject instanceof ExternalValue) ? (ExternalValue)paramObject : ((paramObject != null) ? new ExternalValue(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public GeneralName getLocation() {
    return this.location.getNames()[0];
  }
  
  public GeneralName[] getLocations() {
    return this.location.getNames();
  }
  
  public AlgorithmIdentifier getHashAlg() {
    return this.hashAlg;
  }
  
  public byte[] getHashValue() {
    return Arrays.clone(this.hashValue);
  }
  
  public ASN1BitString getHashVal() {
    return (ASN1BitString)new DERBitString(this.hashValue);
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)this.location);
    aSN1EncodableVector.add((ASN1Encodable)this.hashAlg);
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.hashValue));
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\bc\ExternalValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */