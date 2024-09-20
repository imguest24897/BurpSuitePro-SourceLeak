package org.bouncycastle.oer.its.ieee1609dot2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;
import org.bouncycastle.oer.its.etsi103097.extension.EtsiOriginatingHeaderInfoExtension;

public class ContributedExtensionBlock extends ASN1Object {
  private final HeaderInfoContributorId contributorId;
  
  private final List<EtsiOriginatingHeaderInfoExtension> extns;
  
  public ContributedExtensionBlock(HeaderInfoContributorId paramHeaderInfoContributorId, List<EtsiOriginatingHeaderInfoExtension> paramList) {
    this.contributorId = paramHeaderInfoContributorId;
    this.extns = paramList;
  }
  
  private ContributedExtensionBlock(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.contributorId = HeaderInfoContributorId.getInstance(paramASN1Sequence.getObjectAt(0));
    Iterator iterator = ASN1Sequence.getInstance(paramASN1Sequence.getObjectAt(1)).iterator();
    ArrayList<EtsiOriginatingHeaderInfoExtension> arrayList = new ArrayList();
    while (iterator.hasNext())
      arrayList.add(EtsiOriginatingHeaderInfoExtension.getInstance(iterator.next())); 
    this.extns = Collections.unmodifiableList(arrayList);
  }
  
  public static ContributedExtensionBlock getInstance(Object paramObject) {
    return (paramObject instanceof ContributedExtensionBlock) ? (ContributedExtensionBlock)paramObject : ((paramObject != null) ? new ContributedExtensionBlock(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.contributorId, (ASN1Encodable)ItsUtils.toSequence(this.extns) });
  }
  
  public HeaderInfoContributorId getContributorId() {
    return this.contributorId;
  }
  
  public List<EtsiOriginatingHeaderInfoExtension> getExtns() {
    return this.extns;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\ContributedExtensionBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */