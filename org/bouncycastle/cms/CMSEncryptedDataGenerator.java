package org.bouncycastle.cms;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.EncryptedContentInfo;
import org.bouncycastle.asn1.cms.EncryptedData;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.OutputEncryptor;

public class CMSEncryptedDataGenerator extends CMSEncryptedGenerator {
  private CMSEncryptedData doGenerate(CMSTypedData paramCMSTypedData, OutputEncryptor paramOutputEncryptor) throws CMSException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      OutputStream outputStream = paramOutputEncryptor.getOutputStream(byteArrayOutputStream);
      paramCMSTypedData.write(outputStream);
      outputStream.close();
    } catch (IOException iOException) {
      throw new CMSException("");
    } 
    byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
    AlgorithmIdentifier algorithmIdentifier = paramOutputEncryptor.getAlgorithmIdentifier();
    BEROctetString bEROctetString = new BEROctetString(arrayOfByte);
    EncryptedContentInfo encryptedContentInfo = CMSUtils.getEncryptedContentInfo(paramCMSTypedData.getContentType(), algorithmIdentifier, arrayOfByte);
    ASN1Set aSN1Set = CMSUtils.getAttrBERSet(this.unprotectedAttributeGenerator);
    ContentInfo contentInfo = new ContentInfo(CMSObjectIdentifiers.encryptedData, (ASN1Encodable)new EncryptedData(encryptedContentInfo, aSN1Set));
    return new CMSEncryptedData(contentInfo);
  }
  
  public CMSEncryptedData generate(CMSTypedData paramCMSTypedData, OutputEncryptor paramOutputEncryptor) throws CMSException {
    return doGenerate(paramCMSTypedData, paramOutputEncryptor);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSEncryptedDataGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */