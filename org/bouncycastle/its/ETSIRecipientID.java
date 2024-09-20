package org.bouncycastle.its;

import org.bouncycastle.oer.its.ieee1609dot2.PKRecipientInfo;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Selector;

public class ETSIRecipientID implements Selector<ETSIRecipientInfo> {
  private final HashedId8 id;
  
  public ETSIRecipientID(byte[] paramArrayOfbyte) {
    this(new HashedId8(paramArrayOfbyte));
  }
  
  public ETSIRecipientID(HashedId8 paramHashedId8) {
    this.id = paramHashedId8;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    ETSIRecipientID eTSIRecipientID = (ETSIRecipientID)paramObject;
    return (this.id != null) ? this.id.equals(eTSIRecipientID.id) : ((eTSIRecipientID.id == null));
  }
  
  public int hashCode() {
    return (this.id != null) ? this.id.hashCode() : 0;
  }
  
  public boolean match(ETSIRecipientInfo paramETSIRecipientInfo) {
    if (paramETSIRecipientInfo.getRecipientInfo().getChoice() == 2) {
      PKRecipientInfo pKRecipientInfo = PKRecipientInfo.getInstance(paramETSIRecipientInfo.getRecipientInfo().getRecipientInfo());
      return Arrays.areEqual(pKRecipientInfo.getRecipientId().getHashBytes(), this.id.getHashBytes());
    } 
    return false;
  }
  
  public Object clone() {
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\ETSIRecipientID.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */