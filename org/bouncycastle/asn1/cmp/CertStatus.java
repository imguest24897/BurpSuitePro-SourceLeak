package org.bouncycastle.asn1.cmp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class CertStatus extends ASN1Object {
  private final ASN1OctetString certHash;
  
  private final ASN1Integer certReqId;
  
  private final PKIStatusInfo statusInfo;
  
  private final AlgorithmIdentifier hashAlg;
  
  private CertStatus(ASN1Sequence paramASN1Sequence) {
    this.certHash = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(0));
    this.certReqId = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(1));
    PKIStatusInfo pKIStatusInfo = null;
    AlgorithmIdentifier algorithmIdentifier = null;
    if (paramASN1Sequence.size() > 2)
      for (byte b = 2; b < paramASN1Sequence.size(); b++) {
        ASN1Primitive aSN1Primitive = paramASN1Sequence.getObjectAt(b).toASN1Primitive();
        if (aSN1Primitive instanceof ASN1Sequence)
          pKIStatusInfo = PKIStatusInfo.getInstance(aSN1Primitive); 
        if (aSN1Primitive instanceof ASN1TaggedObject) {
          ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject)aSN1Primitive;
          if (!aSN1TaggedObject.hasContextTag(0))
            throw new IllegalArgumentException("unknown tag " + ASN1Util.getTagText(aSN1TaggedObject)); 
          algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
        } 
      }  
    this.statusInfo = pKIStatusInfo;
    this.hashAlg = algorithmIdentifier;
  }
  
  public CertStatus(byte[] paramArrayOfbyte, BigInteger paramBigInteger) {
    this(paramArrayOfbyte, new ASN1Integer(paramBigInteger));
  }
  
  public CertStatus(byte[] paramArrayOfbyte, ASN1Integer paramASN1Integer) {
    this.certHash = (ASN1OctetString)new DEROctetString(paramArrayOfbyte);
    this.certReqId = paramASN1Integer;
    this.statusInfo = null;
    this.hashAlg = null;
  }
  
  public CertStatus(byte[] paramArrayOfbyte, BigInteger paramBigInteger, PKIStatusInfo paramPKIStatusInfo) {
    this.certHash = (ASN1OctetString)new DEROctetString(paramArrayOfbyte);
    this.certReqId = new ASN1Integer(paramBigInteger);
    this.statusInfo = paramPKIStatusInfo;
    this.hashAlg = null;
  }
  
  public CertStatus(byte[] paramArrayOfbyte, BigInteger paramBigInteger, PKIStatusInfo paramPKIStatusInfo, AlgorithmIdentifier paramAlgorithmIdentifier) {
    this.certHash = (ASN1OctetString)new DEROctetString(paramArrayOfbyte);
    this.certReqId = new ASN1Integer(paramBigInteger);
    this.statusInfo = paramPKIStatusInfo;
    this.hashAlg = paramAlgorithmIdentifier;
  }
  
  public static CertStatus getInstance(Object paramObject) {
    return (paramObject instanceof CertStatus) ? (CertStatus)paramObject : ((paramObject != null) ? new CertStatus(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1OctetString getCertHash() {
    return this.certHash;
  }
  
  public ASN1Integer getCertReqId() {
    return this.certReqId;
  }
  
  public PKIStatusInfo getStatusInfo() {
    return this.statusInfo;
  }
  
  public AlgorithmIdentifier getHashAlg() {
    return this.hashAlg;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
    aSN1EncodableVector.add((ASN1Encodable)this.certHash);
    aSN1EncodableVector.add((ASN1Encodable)this.certReqId);
    if (this.statusInfo != null)
      aSN1EncodableVector.add((ASN1Encodable)this.statusInfo); 
    if (this.hashAlg != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(true, 0, (ASN1Encodable)this.hashAlg)); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\CertStatus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */