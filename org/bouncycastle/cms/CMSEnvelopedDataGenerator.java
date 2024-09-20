package org.bouncycastle.cms;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.EncryptedContentInfo;
import org.bouncycastle.asn1.cms.EnvelopedData;
import org.bouncycastle.operator.OutputAEADEncryptor;
import org.bouncycastle.operator.OutputEncryptor;

public class CMSEnvelopedDataGenerator extends CMSEnvelopedGenerator {
  private CMSEnvelopedData doGenerate(CMSTypedData paramCMSTypedData, OutputEncryptor paramOutputEncryptor) throws CMSException {
    ASN1EncodableVector aSN1EncodableVector = CMSUtils.getRecipentInfos(paramOutputEncryptor.getKey(), this.recipientInfoGenerators);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      OutputStream outputStream = paramOutputEncryptor.getOutputStream(byteArrayOutputStream);
      paramCMSTypedData.write(outputStream);
      outputStream.close();
      if (paramOutputEncryptor instanceof OutputAEADEncryptor) {
        byte[] arrayOfByte1 = ((OutputAEADEncryptor)paramOutputEncryptor).getMAC();
        byteArrayOutputStream.write(arrayOfByte1, 0, arrayOfByte1.length);
      } 
    } catch (IOException iOException) {
      throw new CMSException("");
    } 
    byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
    EncryptedContentInfo encryptedContentInfo = CMSUtils.getEncryptedContentInfo(paramCMSTypedData, paramOutputEncryptor, arrayOfByte);
    ASN1Set aSN1Set = CMSUtils.getAttrBERSet(this.unprotectedAttributeGenerator);
    ContentInfo contentInfo = new ContentInfo(CMSObjectIdentifiers.envelopedData, (ASN1Encodable)new EnvelopedData(this.originatorInfo, (ASN1Set)new DERSet(aSN1EncodableVector), encryptedContentInfo, aSN1Set));
    return new CMSEnvelopedData(contentInfo);
  }
  
  public CMSEnvelopedData generate(CMSTypedData paramCMSTypedData, OutputEncryptor paramOutputEncryptor) throws CMSException {
    return doGenerate(paramCMSTypedData, paramOutputEncryptor);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSEnvelopedDataGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */