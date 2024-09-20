package org.bouncycastle.its;

import org.bouncycastle.its.operator.ETSIDataDecryptor;
import org.bouncycastle.oer.its.ieee1609dot2.AesCcmCiphertext;
import org.bouncycastle.oer.its.ieee1609dot2.EncryptedData;
import org.bouncycastle.oer.its.ieee1609dot2.EncryptedDataEncryptionKey;
import org.bouncycastle.oer.its.ieee1609dot2.PKRecipientInfo;
import org.bouncycastle.oer.its.ieee1609dot2.RecipientInfo;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP256CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EciesP256EncryptedKey;
import org.bouncycastle.util.Arrays;

public class ETSIRecipientInfo {
  private final RecipientInfo recipientInfo;
  
  private final EncryptedData encryptedData;
  
  public ETSIRecipientInfo(EncryptedData paramEncryptedData, RecipientInfo paramRecipientInfo) {
    this.recipientInfo = paramRecipientInfo;
    this.encryptedData = paramEncryptedData;
  }
  
  public ETSIRecipientInfo(RecipientInfo paramRecipientInfo) {
    this.recipientInfo = paramRecipientInfo;
    this.encryptedData = null;
  }
  
  public RecipientInfo getRecipientInfo() {
    return this.recipientInfo;
  }
  
  public EncryptedData getEncryptedData() {
    return this.encryptedData;
  }
  
  public byte[] getContent(ETSIDataDecryptor paramETSIDataDecryptor) {
    if (0 != this.encryptedData.getCiphertext().getChoice())
      throw new IllegalArgumentException("Encrypted data is no AES 128 CCM"); 
    AesCcmCiphertext aesCcmCiphertext = AesCcmCiphertext.getInstance(this.encryptedData.getCiphertext().getSymmetricCiphertext());
    PKRecipientInfo pKRecipientInfo = PKRecipientInfo.getInstance(this.recipientInfo.getRecipientInfo());
    EncryptedDataEncryptionKey encryptedDataEncryptionKey = pKRecipientInfo.getEncKey();
    EciesP256EncryptedKey eciesP256EncryptedKey = EciesP256EncryptedKey.getInstance(encryptedDataEncryptionKey.getEncryptedDataEncryptionKey());
    EccP256CurvePoint eccP256CurvePoint = EccP256CurvePoint.getInstance(eciesP256EncryptedKey.getV());
    byte[] arrayOfByte = Arrays.concatenate(eccP256CurvePoint.getEncodedPoint(), eciesP256EncryptedKey.getC().getOctets(), eciesP256EncryptedKey.getT().getOctets());
    return paramETSIDataDecryptor.decrypt(arrayOfByte, aesCcmCiphertext.getCcmCiphertext().getContent(), aesCcmCiphertext.getNonce().getOctets());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\ETSIRecipientInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */