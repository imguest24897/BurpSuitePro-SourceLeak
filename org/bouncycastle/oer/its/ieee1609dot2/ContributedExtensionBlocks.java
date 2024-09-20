package org.bouncycastle.oer.its.ieee1609dot2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class ContributedExtensionBlocks extends ASN1Object {
  private final List<ContributedExtensionBlock> contributedExtensionBlocks;
  
  public ContributedExtensionBlocks(List<ContributedExtensionBlock> paramList) {
    this.contributedExtensionBlocks = Collections.unmodifiableList(paramList);
  }
  
  private ContributedExtensionBlocks(ASN1Sequence paramASN1Sequence) {
    ArrayList<ContributedExtensionBlock> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(ContributedExtensionBlock.getInstance(iterator.next())); 
    this.contributedExtensionBlocks = Collections.unmodifiableList(arrayList);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public List<ContributedExtensionBlock> getContributedExtensionBlocks() {
    return this.contributedExtensionBlocks;
  }
  
  public int size() {
    return this.contributedExtensionBlocks.size();
  }
  
  public static ContributedExtensionBlocks getInstance(Object paramObject) {
    return (paramObject instanceof ContributedExtensionBlocks) ? (ContributedExtensionBlocks)paramObject : ((paramObject != null) ? new ContributedExtensionBlocks(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence((ASN1Encodable[])this.contributedExtensionBlocks.toArray((Object[])new ContributedExtensionBlock[0]));
  }
  
  public static class Builder {
    private final List<ContributedExtensionBlock> extensionBlocks = new ArrayList<>();
    
    public Builder add(ContributedExtensionBlock... param1VarArgs) {
      this.extensionBlocks.addAll(Arrays.asList(param1VarArgs));
      return this;
    }
    
    public ContributedExtensionBlocks build() {
      return new ContributedExtensionBlocks(this.extensionBlocks);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\ContributedExtensionBlocks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */