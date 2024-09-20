package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class KEMRecipientInfo extends ASN1Object {
  private final ASN1Integer cmsVersion;
  
  private final RecipientIdentifier rid;
  
  private final AlgorithmIdentifier kem;
  
  private final ASN1OctetString kemct;
  
  private final AlgorithmIdentifier kdf;
  
  private final ASN1Integer kekLength;
  
  private final ASN1OctetString ukm;
  
  private final AlgorithmIdentifier wrap;
  
  private final ASN1OctetString encryptedKey;
  
  public KEMRecipientInfo(RecipientIdentifier paramRecipientIdentifier, AlgorithmIdentifier paramAlgorithmIdentifier1, ASN1OctetString paramASN1OctetString1, AlgorithmIdentifier paramAlgorithmIdentifier2, ASN1Integer paramASN1Integer, ASN1OctetString paramASN1OctetString2, AlgorithmIdentifier paramAlgorithmIdentifier3, ASN1OctetString paramASN1OctetString3) {
    if (paramAlgorithmIdentifier1 == null)
      throw new NullPointerException("kem cannot be null"); 
    if (paramAlgorithmIdentifier3 == null)
      throw new NullPointerException("wrap cannot be null"); 
    this.cmsVersion = new ASN1Integer(0L);
    this.rid = paramRecipientIdentifier;
    this.kem = paramAlgorithmIdentifier1;
    this.kemct = paramASN1OctetString1;
    this.kdf = paramAlgorithmIdentifier2;
    this.kekLength = paramASN1Integer;
    this.ukm = paramASN1OctetString2;
    this.wrap = paramAlgorithmIdentifier3;
    this.encryptedKey = paramASN1OctetString3;
  }
  
  public static KEMRecipientInfo getInstance(Object paramObject) {
    return (paramObject instanceof KEMRecipientInfo) ? (KEMRecipientInfo)paramObject : ((paramObject != null) ? new KEMRecipientInfo(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private KEMRecipientInfo(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 3)
      throw new IllegalArgumentException("sequence must consist of 3 elements"); 
    this.cmsVersion = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(0));
    this.rid = RecipientIdentifier.getInstance(paramASN1Sequence.getObjectAt(1));
    this.kem = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(2));
    this.kemct = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(3));
    this.kdf = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(4));
    this.kekLength = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(5));
    byte b = 6;
    if (paramASN1Sequence.getObjectAt(6) instanceof ASN1TaggedObject) {
      this.ukm = ASN1OctetString.getInstance(ASN1TaggedObject.getInstance(paramASN1Sequence.getObjectAt(b++)), true);
    } else {
      this.ukm = null;
    } 
    this.wrap = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(b++));
    this.encryptedKey = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(b++));
  }
  
  public RecipientIdentifier getRecipientIdentifier() {
    return this.rid;
  }
  
  public AlgorithmIdentifier getKem() {
    return this.kem;
  }
  
  public ASN1OctetString getKemct() {
    return this.kemct;
  }
  
  public AlgorithmIdentifier getKdf() {
    return this.kdf;
  }
  
  public AlgorithmIdentifier getWrap() {
    return this.wrap;
  }
  
  public byte[] getUkm() {
    return (this.ukm == null) ? null : this.ukm.getOctets();
  }
  
  public ASN1OctetString getEncryptedKey() {
    return this.encryptedKey;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)this.cmsVersion);
    aSN1EncodableVector.add((ASN1Encodable)this.rid);
    aSN1EncodableVector.add((ASN1Encodable)this.kem);
    aSN1EncodableVector.add((ASN1Encodable)this.kemct);
    aSN1EncodableVector.add((ASN1Encodable)this.kdf);
    aSN1EncodableVector.add((ASN1Encodable)this.kekLength);
    if (this.ukm != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(true, 0, (ASN1Encodable)this.ukm)); 
    aSN1EncodableVector.add((ASN1Encodable)this.wrap);
    aSN1EncodableVector.add((ASN1Encodable)this.encryptedKey);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cms\KEMRecipientInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */