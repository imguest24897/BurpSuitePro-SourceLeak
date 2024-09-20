package org.bouncycastle.cms;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.AuthEnvelopedData;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.EncryptedContentInfo;
import org.bouncycastle.operator.OutputAEADEncryptor;
import org.bouncycastle.operator.OutputEncryptor;

public class CMSAuthEnvelopedDataGenerator extends CMSAuthEnvelopedGenerator {
  private CMSAuthEnvelopedData doGenerate(CMSTypedData paramCMSTypedData, OutputAEADEncryptor paramOutputAEADEncryptor) throws CMSException {
    ASN1Set aSN1Set1;
    ASN1EncodableVector aSN1EncodableVector = CMSUtils.getRecipentInfos(paramOutputAEADEncryptor.getKey(), this.recipientInfoGenerators);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      OutputStream outputStream = paramOutputAEADEncryptor.getOutputStream(byteArrayOutputStream);
      paramCMSTypedData.write(outputStream);
      aSN1Set1 = CMSUtils.processAuthAttrSet(this.authAttrsGenerator, paramOutputAEADEncryptor);
      outputStream.close();
    } catch (IOException iOException) {
      throw new CMSException("unable to process authenticated content: " + iOException.getMessage(), iOException);
    } 
    byte[] arrayOfByte1 = byteArrayOutputStream.toByteArray();
    byte[] arrayOfByte2 = paramOutputAEADEncryptor.getMAC();
    EncryptedContentInfo encryptedContentInfo = CMSUtils.getEncryptedContentInfo(paramCMSTypedData, (OutputEncryptor)paramOutputAEADEncryptor, arrayOfByte1);
    ASN1Set aSN1Set2 = CMSUtils.getAttrDLSet(this.unauthAttrsGenerator);
    ContentInfo contentInfo = new ContentInfo(CMSObjectIdentifiers.authEnvelopedData, (ASN1Encodable)new AuthEnvelopedData(this.originatorInfo, (ASN1Set)new DERSet(aSN1EncodableVector), encryptedContentInfo, aSN1Set1, (ASN1OctetString)new DEROctetString(arrayOfByte2), aSN1Set2));
    return new CMSAuthEnvelopedData(contentInfo);
  }
  
  public CMSAuthEnvelopedData generate(CMSTypedData paramCMSTypedData, OutputAEADEncryptor paramOutputAEADEncryptor) throws CMSException {
    return doGenerate(paramCMSTypedData, paramOutputAEADEncryptor);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSAuthEnvelopedDataGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */