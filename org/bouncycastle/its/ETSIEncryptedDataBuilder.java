package org.bouncycastle.its;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.its.operator.ETSIDataEncryptor;
import org.bouncycastle.oer.its.ieee1609dot2.AesCcmCiphertext;
import org.bouncycastle.oer.its.ieee1609dot2.EncryptedData;
import org.bouncycastle.oer.its.ieee1609dot2.RecipientInfo;
import org.bouncycastle.oer.its.ieee1609dot2.SequenceOfRecipientInfo;
import org.bouncycastle.oer.its.ieee1609dot2.SymmetricCiphertext;

public class ETSIEncryptedDataBuilder {
  private final List<ETSIRecipientInfoBuilder> recipientInfoBuilders = new ArrayList<>();
  
  public void addRecipientInfoBuilder(ETSIRecipientInfoBuilder paramETSIRecipientInfoBuilder) {
    this.recipientInfoBuilders.add(paramETSIRecipientInfoBuilder);
  }
  
  public ETSIEncryptedData build(ETSIDataEncryptor paramETSIDataEncryptor, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = paramETSIDataEncryptor.encrypt(paramArrayOfbyte);
    byte[] arrayOfByte2 = paramETSIDataEncryptor.getKey();
    byte[] arrayOfByte3 = paramETSIDataEncryptor.getNonce();
    SequenceOfRecipientInfo.Builder builder = SequenceOfRecipientInfo.builder();
    for (ETSIRecipientInfoBuilder eTSIRecipientInfoBuilder : this.recipientInfoBuilders) {
      builder.addRecipients(new RecipientInfo[] { eTSIRecipientInfoBuilder.build(arrayOfByte2) });
    } 
    return new ETSIEncryptedData(EncryptedData.builder().setRecipients(builder.createSequenceOfRecipientInfo()).setCiphertext(SymmetricCiphertext.aes128ccm(AesCcmCiphertext.builder().setCcmCiphertext(arrayOfByte1).setNonce(arrayOfByte3).createAesCcmCiphertext())).createEncryptedData());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\ETSIEncryptedDataBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */