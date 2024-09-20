package org.bouncycastle.its;

import org.bouncycastle.oer.its.ieee1609dot2.PKRecipientInfo;
import org.bouncycastle.oer.its.ieee1609dot2.RecipientInfo;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

public class ETSIRecipientInfoBuilder {
  private final ETSIKeyWrapper keyWrapper;
  
  private final byte[] recipientID;
  
  public ETSIRecipientInfoBuilder(ETSIKeyWrapper paramETSIKeyWrapper, byte[] paramArrayOfbyte) {
    this.keyWrapper = paramETSIKeyWrapper;
    this.recipientID = paramArrayOfbyte;
  }
  
  public RecipientInfo build(byte[] paramArrayOfbyte) {
    try {
      return RecipientInfo.certRecipInfo(PKRecipientInfo.builder().setRecipientId(new HashedId8(this.recipientID)).setEncKey(this.keyWrapper.wrap(paramArrayOfbyte)).createPKRecipientInfo());
    } catch (Exception exception) {
      throw new RuntimeException(exception.getMessage(), exception);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\ETSIRecipientInfoBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */