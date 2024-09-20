package org.bouncycastle.tsp;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.tsp.MessageImprint;
import org.bouncycastle.asn1.tsp.TimeStampReq;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;

public class TimeStampRequestGenerator {
  private static final DefaultDigestAlgorithmIdentifierFinder dgstAlgFinder = new DefaultDigestAlgorithmIdentifierFinder();
  
  private ASN1ObjectIdentifier reqPolicy;
  
  private ASN1Boolean certReq;
  
  private ExtensionsGenerator extGenerator = new ExtensionsGenerator();
  
  public void setReqPolicy(String paramString) {
    this.reqPolicy = new ASN1ObjectIdentifier(paramString);
  }
  
  public void setReqPolicy(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this.reqPolicy = paramASN1ObjectIdentifier;
  }
  
  public void setCertReq(boolean paramBoolean) {
    this.certReq = ASN1Boolean.getInstance(paramBoolean);
  }
  
  public void addExtension(String paramString, boolean paramBoolean, ASN1Encodable paramASN1Encodable) throws IOException {
    addExtension(paramString, paramBoolean, paramASN1Encodable.toASN1Primitive().getEncoded());
  }
  
  public void addExtension(String paramString, boolean paramBoolean, byte[] paramArrayOfbyte) {
    this.extGenerator.addExtension(new ASN1ObjectIdentifier(paramString), paramBoolean, paramArrayOfbyte);
  }
  
  public void addExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier, boolean paramBoolean, ASN1Encodable paramASN1Encodable) throws TSPIOException {
    TSPUtil.addExtension(this.extGenerator, paramASN1ObjectIdentifier, paramBoolean, paramASN1Encodable);
  }
  
  public void addExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier, boolean paramBoolean, byte[] paramArrayOfbyte) {
    this.extGenerator.addExtension(paramASN1ObjectIdentifier, paramBoolean, paramArrayOfbyte);
  }
  
  public TimeStampRequest generate(String paramString, byte[] paramArrayOfbyte) {
    return generate(paramString, paramArrayOfbyte, (BigInteger)null);
  }
  
  public TimeStampRequest generate(String paramString, byte[] paramArrayOfbyte, BigInteger paramBigInteger) {
    if (paramString == null)
      throw new IllegalArgumentException("No digest algorithm specified"); 
    ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(paramString);
    AlgorithmIdentifier algorithmIdentifier = dgstAlgFinder.find(aSN1ObjectIdentifier);
    MessageImprint messageImprint = new MessageImprint(algorithmIdentifier, paramArrayOfbyte);
    Extensions extensions = null;
    if (!this.extGenerator.isEmpty())
      extensions = this.extGenerator.generate(); 
    return (paramBigInteger != null) ? new TimeStampRequest(new TimeStampReq(messageImprint, this.reqPolicy, new ASN1Integer(paramBigInteger), this.certReq, extensions)) : new TimeStampRequest(new TimeStampReq(messageImprint, this.reqPolicy, null, this.certReq, extensions));
  }
  
  public TimeStampRequest generate(ASN1ObjectIdentifier paramASN1ObjectIdentifier, byte[] paramArrayOfbyte) {
    return generate(dgstAlgFinder.find(paramASN1ObjectIdentifier), paramArrayOfbyte);
  }
  
  public TimeStampRequest generate(ASN1ObjectIdentifier paramASN1ObjectIdentifier, byte[] paramArrayOfbyte, BigInteger paramBigInteger) {
    return generate(dgstAlgFinder.find(paramASN1ObjectIdentifier), paramArrayOfbyte, paramBigInteger);
  }
  
  public TimeStampRequest generate(AlgorithmIdentifier paramAlgorithmIdentifier, byte[] paramArrayOfbyte) {
    return generate(paramAlgorithmIdentifier, paramArrayOfbyte, (BigInteger)null);
  }
  
  public TimeStampRequest generate(AlgorithmIdentifier paramAlgorithmIdentifier, byte[] paramArrayOfbyte, BigInteger paramBigInteger) {
    if (paramAlgorithmIdentifier == null)
      throw new IllegalArgumentException("digest algorithm not specified"); 
    MessageImprint messageImprint = new MessageImprint(paramAlgorithmIdentifier, paramArrayOfbyte);
    Extensions extensions = null;
    if (!this.extGenerator.isEmpty())
      extensions = this.extGenerator.generate(); 
    return (paramBigInteger != null) ? new TimeStampRequest(new TimeStampReq(messageImprint, this.reqPolicy, new ASN1Integer(paramBigInteger), this.certReq, extensions)) : new TimeStampRequest(new TimeStampReq(messageImprint, this.reqPolicy, null, this.certReq, extensions));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\TimeStampRequestGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */