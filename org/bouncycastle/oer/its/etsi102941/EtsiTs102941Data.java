package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.its.etsi102941.basetypes.Version;
import org.bouncycastle.oer.its.ieee1609dot2.Opaque;

public class EtsiTs102941Data extends ASN1Object {
  private final Version version;
  
  private final EtsiTs102941DataContent content;
  
  public EtsiTs102941Data(Version paramVersion, EtsiTs102941DataContent paramEtsiTs102941DataContent) {
    this.version = paramVersion;
    this.content = paramEtsiTs102941DataContent;
  }
  
  private EtsiTs102941Data(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.version = Version.getInstance(paramASN1Sequence.getObjectAt(0));
    this.content = EtsiTs102941DataContent.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static EtsiTs102941Data getInstance(Object paramObject) {
    return (paramObject instanceof EtsiTs102941Data) ? (EtsiTs102941Data)paramObject : ((paramObject != null) ? ((paramObject instanceof Opaque) ? new EtsiTs102941Data(ASN1Sequence.getInstance(((Opaque)paramObject).getContent())) : new EtsiTs102941Data(ASN1Sequence.getInstance(paramObject))) : null);
  }
  
  public Version getVersion() {
    return this.version;
  }
  
  public EtsiTs102941DataContent getContent() {
    return this.content;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.version, (ASN1Encodable)this.content });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\EtsiTs102941Data.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */