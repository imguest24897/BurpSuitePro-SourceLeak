package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class KemOtherInfo extends ASN1Object {
  private static final PKIFreeText DEFAULT_staticString = new PKIFreeText("CMP-KEM");
  
  private final PKIFreeText staticString;
  
  private final ASN1OctetString transactionID;
  
  private final ASN1OctetString senderNonce;
  
  private final ASN1OctetString recipNonce;
  
  private final ASN1Integer len;
  
  private final AlgorithmIdentifier mac;
  
  private final ASN1OctetString ct;
  
  public KemOtherInfo(ASN1OctetString paramASN1OctetString1, ASN1OctetString paramASN1OctetString2, ASN1OctetString paramASN1OctetString3, ASN1Integer paramASN1Integer, AlgorithmIdentifier paramAlgorithmIdentifier, ASN1OctetString paramASN1OctetString4) {
    this.staticString = DEFAULT_staticString;
    this.transactionID = paramASN1OctetString1;
    this.senderNonce = paramASN1OctetString2;
    this.recipNonce = paramASN1OctetString3;
    this.len = paramASN1Integer;
    this.mac = paramAlgorithmIdentifier;
    this.ct = paramASN1OctetString4;
  }
  
  public KemOtherInfo(ASN1OctetString paramASN1OctetString1, ASN1OctetString paramASN1OctetString2, ASN1OctetString paramASN1OctetString3, long paramLong, AlgorithmIdentifier paramAlgorithmIdentifier, ASN1OctetString paramASN1OctetString4) {
    this(paramASN1OctetString1, paramASN1OctetString2, paramASN1OctetString3, new ASN1Integer(paramLong), paramAlgorithmIdentifier, paramASN1OctetString4);
  }
  
  private KemOtherInfo(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() < 4 || paramASN1Sequence.size() > 7)
      throw new IllegalArgumentException("sequence size should be between 4 and 7 inclusive"); 
    byte b = 0;
    this.staticString = PKIFreeText.getInstance(paramASN1Sequence.getObjectAt(b));
    if (!DEFAULT_staticString.equals(this.staticString))
      throw new IllegalArgumentException("staticString field should be " + DEFAULT_staticString); 
    ASN1OctetString aSN1OctetString1 = null;
    ASN1OctetString aSN1OctetString2 = null;
    ASN1OctetString aSN1OctetString3 = null;
    ASN1TaggedObject aSN1TaggedObject = tryGetTagged(paramASN1Sequence, ++b);
    if (aSN1TaggedObject != null) {
      ASN1Primitive aSN1Primitive = ASN1Util.tryGetContextBaseUniversal(aSN1TaggedObject, 0, true, 4);
      if (aSN1Primitive != null) {
        aSN1OctetString1 = (ASN1OctetString)aSN1Primitive;
        aSN1TaggedObject = tryGetTagged(paramASN1Sequence, ++b);
      } 
    } 
    if (aSN1TaggedObject != null) {
      ASN1Primitive aSN1Primitive = ASN1Util.tryGetContextBaseUniversal(aSN1TaggedObject, 1, true, 4);
      if (aSN1Primitive != null) {
        aSN1OctetString2 = (ASN1OctetString)aSN1Primitive;
        aSN1TaggedObject = tryGetTagged(paramASN1Sequence, ++b);
      } 
    } 
    if (aSN1TaggedObject != null) {
      ASN1Primitive aSN1Primitive = ASN1Util.tryGetContextBaseUniversal(aSN1TaggedObject, 2, true, 4);
      if (aSN1Primitive != null) {
        aSN1OctetString3 = (ASN1OctetString)aSN1Primitive;
        aSN1TaggedObject = tryGetTagged(paramASN1Sequence, ++b);
      } 
    } 
    if (aSN1TaggedObject != null)
      throw new IllegalArgumentException("unknown tag: " + ASN1Util.getTagText(aSN1TaggedObject)); 
    this.transactionID = aSN1OctetString1;
    this.senderNonce = aSN1OctetString2;
    this.recipNonce = aSN1OctetString3;
    this.len = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(b));
    this.mac = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(++b));
    this.ct = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(++b));
    if (++b != paramASN1Sequence.size())
      throw new IllegalArgumentException("unexpected data at end of sequence"); 
  }
  
  public static KemOtherInfo getInstance(Object paramObject) {
    return (paramObject instanceof KemOtherInfo) ? (KemOtherInfo)paramObject : ((paramObject != null) ? new KemOtherInfo(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1OctetString getTransactionID() {
    return this.transactionID;
  }
  
  public ASN1OctetString getSenderNonce() {
    return this.senderNonce;
  }
  
  public ASN1OctetString getRecipNonce() {
    return this.recipNonce;
  }
  
  public ASN1Integer getLen() {
    return this.len;
  }
  
  public AlgorithmIdentifier getMac() {
    return this.mac;
  }
  
  public ASN1OctetString getCt() {
    return this.ct;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(7);
    aSN1EncodableVector.add((ASN1Encodable)this.staticString);
    addOptional(aSN1EncodableVector, 0, (ASN1Encodable)this.transactionID);
    addOptional(aSN1EncodableVector, 1, (ASN1Encodable)this.senderNonce);
    addOptional(aSN1EncodableVector, 2, (ASN1Encodable)this.recipNonce);
    aSN1EncodableVector.add((ASN1Encodable)this.len);
    aSN1EncodableVector.add((ASN1Encodable)this.mac);
    aSN1EncodableVector.add((ASN1Encodable)this.ct);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  private static void addOptional(ASN1EncodableVector paramASN1EncodableVector, int paramInt, ASN1Encodable paramASN1Encodable) {
    if (paramASN1Encodable != null)
      paramASN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(true, paramInt, paramASN1Encodable)); 
  }
  
  private static ASN1TaggedObject tryGetTagged(ASN1Sequence paramASN1Sequence, int paramInt) {
    ASN1Encodable aSN1Encodable = paramASN1Sequence.getObjectAt(paramInt);
    return (aSN1Encodable instanceof ASN1TaggedObject) ? (ASN1TaggedObject)aSN1Encodable : null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\KemOtherInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */