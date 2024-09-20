package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

public class EncryptedData extends ASN1Object {
  private final SequenceOfRecipientInfo recipients;
  
  private final SymmetricCiphertext ciphertext;
  
  public EncryptedData(SequenceOfRecipientInfo paramSequenceOfRecipientInfo, SymmetricCiphertext paramSymmetricCiphertext) {
    this.recipients = paramSequenceOfRecipientInfo;
    this.ciphertext = paramSymmetricCiphertext;
  }
  
  private EncryptedData(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.recipients = SequenceOfRecipientInfo.getInstance(paramASN1Sequence.getObjectAt(0));
    this.ciphertext = SymmetricCiphertext.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static EncryptedData getInstance(Object paramObject) {
    return (paramObject instanceof EncryptedData) ? (EncryptedData)paramObject : ((paramObject != null) ? new EncryptedData(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.recipients, (ASN1Encodable)this.ciphertext });
  }
  
  public SequenceOfRecipientInfo getRecipients() {
    return this.recipients;
  }
  
  public SymmetricCiphertext getCiphertext() {
    return this.ciphertext;
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private SequenceOfRecipientInfo recipients;
    
    private SymmetricCiphertext ciphertext;
    
    public Builder setRecipients(SequenceOfRecipientInfo param1SequenceOfRecipientInfo) {
      this.recipients = param1SequenceOfRecipientInfo;
      return this;
    }
    
    public Builder setCiphertext(SymmetricCiphertext param1SymmetricCiphertext) {
      this.ciphertext = param1SymmetricCiphertext;
      return this;
    }
    
    public EncryptedData createEncryptedData() {
      return new EncryptedData(this.recipients, this.ciphertext);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\EncryptedData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */