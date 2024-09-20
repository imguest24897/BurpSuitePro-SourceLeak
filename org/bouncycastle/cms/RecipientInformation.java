package org.bouncycastle.cms;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.io.Streams;

public abstract class RecipientInformation {
  protected RecipientId rid;
  
  protected AlgorithmIdentifier keyEncAlg;
  
  protected AlgorithmIdentifier messageAlgorithm;
  
  protected CMSSecureReadable secureReadable;
  
  private byte[] resultMac;
  
  private RecipientOperator operator;
  
  RecipientInformation(AlgorithmIdentifier paramAlgorithmIdentifier1, AlgorithmIdentifier paramAlgorithmIdentifier2, CMSSecureReadable paramCMSSecureReadable) {
    this.keyEncAlg = paramAlgorithmIdentifier1;
    this.messageAlgorithm = paramAlgorithmIdentifier2;
    this.secureReadable = paramCMSSecureReadable;
  }
  
  public RecipientId getRID() {
    return this.rid;
  }
  
  public AlgorithmIdentifier getKeyEncryptionAlgorithm() {
    return this.keyEncAlg;
  }
  
  public String getKeyEncryptionAlgOID() {
    return this.keyEncAlg.getAlgorithm().getId();
  }
  
  public byte[] getKeyEncryptionAlgParams() {
    try {
      return CMSUtils.encodeObj(this.keyEncAlg.getParameters());
    } catch (Exception exception) {
      throw new RuntimeException("exception getting encryption parameters " + exception);
    } 
  }
  
  public byte[] getContentDigest() {
    return (this.secureReadable instanceof CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable) ? ((CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable)this.secureReadable).getDigest() : null;
  }
  
  public byte[] getMac() {
    if (this.resultMac == null) {
      if (this.operator.isMacBased() && this.secureReadable.hasAdditionalData())
        try {
          Streams.drain(this.operator.getInputStream(new ByteArrayInputStream(this.secureReadable.getAuthAttrSet().getEncoded("DER"))));
        } catch (IOException iOException) {
          throw new IllegalStateException("unable to drain input: " + iOException.getMessage());
        }  
      this.resultMac = this.operator.getMac();
    } 
    return this.resultMac;
  }
  
  public byte[] getContent(Recipient paramRecipient) throws CMSException {
    try {
      return CMSUtils.streamToByteArray(getContentStream(paramRecipient).getContentStream());
    } catch (IOException iOException) {
      throw new CMSException("unable to parse internal stream: " + iOException.getMessage(), iOException);
    } 
  }
  
  public ASN1ObjectIdentifier getContentType() {
    return this.secureReadable.getContentType();
  }
  
  public CMSTypedStream getContentStream(Recipient paramRecipient) throws CMSException, IOException {
    this.operator = getRecipientOperator(paramRecipient);
    if (this.operator.isAEADBased()) {
      ((CMSSecureReadableWithAAD)this.secureReadable).setAADStream(this.operator.getAADStream());
    } else if (this.secureReadable.hasAdditionalData()) {
      return new CMSTypedStream(this.secureReadable.getContentType(), this.secureReadable.getInputStream());
    } 
    return new CMSTypedStream(this.secureReadable.getContentType(), this.operator.getInputStream(this.secureReadable.getInputStream()));
  }
  
  protected abstract RecipientOperator getRecipientOperator(Recipient paramRecipient) throws CMSException, IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\RecipientInformation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */