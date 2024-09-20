package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.GeneralNames;

public class CRLSource extends ASN1Object implements ASN1Choice {
  private final DistributionPointName dpn;
  
  private final GeneralNames issuer;
  
  private CRLSource(ASN1TaggedObject paramASN1TaggedObject) {
    if (paramASN1TaggedObject.hasContextTag(0)) {
      this.dpn = DistributionPointName.getInstance(paramASN1TaggedObject, true);
      this.issuer = null;
    } else if (paramASN1TaggedObject.hasContextTag(1)) {
      this.dpn = null;
      this.issuer = GeneralNames.getInstance(paramASN1TaggedObject, true);
    } else {
      throw new IllegalArgumentException("unknown tag " + ASN1Util.getTagText(paramASN1TaggedObject));
    } 
  }
  
  public CRLSource(DistributionPointName paramDistributionPointName, GeneralNames paramGeneralNames) {
    if (((paramDistributionPointName == null) ? true : false) == ((paramGeneralNames == null) ? true : false))
      throw new IllegalArgumentException("either dpn or issuer must be set"); 
    this.dpn = paramDistributionPointName;
    this.issuer = paramGeneralNames;
  }
  
  public static CRLSource getInstance(Object paramObject) {
    return (paramObject instanceof CRLSource) ? (CRLSource)paramObject : ((paramObject != null) ? new CRLSource(ASN1TaggedObject.getInstance(paramObject)) : null);
  }
  
  public DistributionPointName getDpn() {
    return this.dpn;
  }
  
  public GeneralNames getIssuer() {
    return this.issuer;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)((this.dpn != null) ? new DERTaggedObject(true, 0, (ASN1Encodable)this.dpn) : new DERTaggedObject(true, 1, (ASN1Encodable)this.issuer));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\CRLSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */