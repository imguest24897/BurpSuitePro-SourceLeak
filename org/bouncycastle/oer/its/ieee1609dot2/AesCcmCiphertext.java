package org.bouncycastle.oer.its.ieee1609dot2;

import java.util.Iterator;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.oer.its.ItsUtils;
import org.bouncycastle.util.Arrays;

public class AesCcmCiphertext extends ASN1Object {
  private final ASN1OctetString nonce;
  
  private final Opaque ccmCiphertext;
  
  public AesCcmCiphertext(ASN1OctetString paramASN1OctetString, Opaque paramOpaque) {
    this.nonce = paramASN1OctetString;
    this.ccmCiphertext = paramOpaque;
  }
  
  private AesCcmCiphertext(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    Iterator iterator = paramASN1Sequence.iterator();
    this.nonce = ASN1OctetString.getInstance(iterator.next());
    this.ccmCiphertext = Opaque.getInstance(iterator.next());
  }
  
  public static AesCcmCiphertext getInstance(Object paramObject) {
    return (paramObject instanceof AesCcmCiphertext) ? (AesCcmCiphertext)paramObject : ((paramObject != null) ? new AesCcmCiphertext(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1OctetString getNonce() {
    return this.nonce;
  }
  
  public Opaque getCcmCiphertext() {
    return this.ccmCiphertext;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.nonce, (ASN1Encodable)this.ccmCiphertext });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private ASN1OctetString nonce;
    
    private Opaque opaque;
    
    public Builder setNonce(ASN1OctetString param1ASN1OctetString) {
      this.nonce = param1ASN1OctetString;
      return this;
    }
    
    public Builder setNonce(byte[] param1ArrayOfbyte) {
      return setNonce((ASN1OctetString)new DEROctetString(Arrays.clone(param1ArrayOfbyte)));
    }
    
    public Builder setCcmCiphertext(Opaque param1Opaque) {
      this.opaque = param1Opaque;
      return this;
    }
    
    public Builder setCcmCiphertext(byte[] param1ArrayOfbyte) {
      return setCcmCiphertext(new Opaque(param1ArrayOfbyte));
    }
    
    public AesCcmCiphertext createAesCcmCiphertext() {
      return new AesCcmCiphertext(this.nonce, this.opaque);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\AesCcmCiphertext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */