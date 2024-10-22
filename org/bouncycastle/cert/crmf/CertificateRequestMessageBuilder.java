package org.bouncycastle.cert.crmf;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.crmf.AttributeTypeAndValue;
import org.bouncycastle.asn1.crmf.CertReqMsg;
import org.bouncycastle.asn1.crmf.CertRequest;
import org.bouncycastle.asn1.crmf.CertTemplate;
import org.bouncycastle.asn1.crmf.CertTemplateBuilder;
import org.bouncycastle.asn1.crmf.OptionalValidity;
import org.bouncycastle.asn1.crmf.PKMACValue;
import org.bouncycastle.asn1.crmf.POPOPrivKey;
import org.bouncycastle.asn1.crmf.ProofOfPossession;
import org.bouncycastle.asn1.crmf.SubsequentMessage;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.operator.ContentSigner;

public class CertificateRequestMessageBuilder {
  private final BigInteger certReqId;
  
  private ExtensionsGenerator extGenerator;
  
  private CertTemplateBuilder templateBuilder;
  
  private List controls;
  
  private ContentSigner popSigner;
  
  private PKMACBuilder pkmacBuilder;
  
  private char[] password;
  
  private GeneralName sender;
  
  private int popoType = 2;
  
  private POPOPrivKey popoPrivKey;
  
  private ASN1Null popRaVerified;
  
  private PKMACValue agreeMAC;
  
  private AttributeTypeAndValue[] regInfo;
  
  public CertificateRequestMessageBuilder(BigInteger paramBigInteger) {
    this.certReqId = paramBigInteger;
    this.extGenerator = new ExtensionsGenerator();
    this.templateBuilder = new CertTemplateBuilder();
    this.controls = new ArrayList();
    this.regInfo = null;
  }
  
  public CertificateRequestMessageBuilder setRegInfo(AttributeTypeAndValue[] paramArrayOfAttributeTypeAndValue) {
    this.regInfo = paramArrayOfAttributeTypeAndValue;
    return this;
  }
  
  public CertificateRequestMessageBuilder setPublicKey(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) {
    if (paramSubjectPublicKeyInfo != null)
      this.templateBuilder.setPublicKey(paramSubjectPublicKeyInfo); 
    return this;
  }
  
  public CertificateRequestMessageBuilder setIssuer(X500Name paramX500Name) {
    if (paramX500Name != null)
      this.templateBuilder.setIssuer(paramX500Name); 
    return this;
  }
  
  public CertificateRequestMessageBuilder setSubject(X500Name paramX500Name) {
    if (paramX500Name != null)
      this.templateBuilder.setSubject(paramX500Name); 
    return this;
  }
  
  public CertificateRequestMessageBuilder setSerialNumber(BigInteger paramBigInteger) {
    if (paramBigInteger != null)
      this.templateBuilder.setSerialNumber(new ASN1Integer(paramBigInteger)); 
    return this;
  }
  
  public CertificateRequestMessageBuilder setSerialNumber(ASN1Integer paramASN1Integer) {
    if (paramASN1Integer != null)
      this.templateBuilder.setSerialNumber(paramASN1Integer); 
    return this;
  }
  
  public CertificateRequestMessageBuilder setValidity(Date paramDate1, Date paramDate2) {
    this.templateBuilder.setValidity(new OptionalValidity(createTime(paramDate1), createTime(paramDate2)));
    return this;
  }
  
  private Time createTime(Date paramDate) {
    return (paramDate != null) ? new Time(paramDate) : null;
  }
  
  public CertificateRequestMessageBuilder addExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier, boolean paramBoolean, ASN1Encodable paramASN1Encodable) throws CertIOException {
    CRMFUtil.addExtension(this.extGenerator, paramASN1ObjectIdentifier, paramBoolean, paramASN1Encodable);
    return this;
  }
  
  public CertificateRequestMessageBuilder addExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier, boolean paramBoolean, byte[] paramArrayOfbyte) {
    this.extGenerator.addExtension(paramASN1ObjectIdentifier, paramBoolean, paramArrayOfbyte);
    return this;
  }
  
  public CertificateRequestMessageBuilder addControl(Control paramControl) {
    this.controls.add(paramControl);
    return this;
  }
  
  public CertificateRequestMessageBuilder setProofOfPossessionSigningKeySigner(ContentSigner paramContentSigner) {
    if (this.popoPrivKey != null || this.popRaVerified != null || this.agreeMAC != null)
      throw new IllegalStateException("only one proof of possession allowed"); 
    this.popSigner = paramContentSigner;
    return this;
  }
  
  public CertificateRequestMessageBuilder setProofOfPossessionSubsequentMessage(SubsequentMessage paramSubsequentMessage) {
    if (this.popSigner != null || this.popRaVerified != null || this.agreeMAC != null)
      throw new IllegalStateException("only one proof of possession allowed"); 
    this.popoType = 2;
    this.popoPrivKey = new POPOPrivKey(paramSubsequentMessage);
    return this;
  }
  
  public CertificateRequestMessageBuilder setProofOfPossessionSubsequentMessage(int paramInt, SubsequentMessage paramSubsequentMessage) {
    if (this.popSigner != null || this.popRaVerified != null || this.agreeMAC != null)
      throw new IllegalStateException("only one proof of possession allowed"); 
    if (paramInt != 2 && paramInt != 3)
      throw new IllegalArgumentException("type must be ProofOfPossession.TYPE_KEY_ENCIPHERMENT or ProofOfPossession.TYPE_KEY_AGREEMENT"); 
    this.popoType = paramInt;
    this.popoPrivKey = new POPOPrivKey(paramSubsequentMessage);
    return this;
  }
  
  public CertificateRequestMessageBuilder setProofOfPossessionAgreeMAC(PKMACValue paramPKMACValue) {
    if (this.popSigner != null || this.popRaVerified != null || this.popoPrivKey != null)
      throw new IllegalStateException("only one proof of possession allowed"); 
    this.agreeMAC = paramPKMACValue;
    return this;
  }
  
  public CertificateRequestMessageBuilder setProofOfPossessionRaVerified() {
    if (this.popSigner != null || this.popoPrivKey != null)
      throw new IllegalStateException("only one proof of possession allowed"); 
    this.popRaVerified = (ASN1Null)DERNull.INSTANCE;
    return this;
  }
  
  public CertificateRequestMessageBuilder setAuthInfoPKMAC(PKMACBuilder paramPKMACBuilder, char[] paramArrayOfchar) {
    this.pkmacBuilder = paramPKMACBuilder;
    this.password = paramArrayOfchar;
    return this;
  }
  
  public CertificateRequestMessageBuilder setAuthInfoSender(X500Name paramX500Name) {
    return setAuthInfoSender(new GeneralName(paramX500Name));
  }
  
  public CertificateRequestMessageBuilder setAuthInfoSender(GeneralName paramGeneralName) {
    this.sender = paramGeneralName;
    return this;
  }
  
  public CertificateRequestMessage build() throws CRMFException {
    ProofOfPossession proofOfPossession;
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
    aSN1EncodableVector.add((ASN1Encodable)new ASN1Integer(this.certReqId));
    if (!this.extGenerator.isEmpty())
      this.templateBuilder.setExtensions(this.extGenerator.generate()); 
    aSN1EncodableVector.add((ASN1Encodable)this.templateBuilder.build());
    if (!this.controls.isEmpty()) {
      ASN1EncodableVector aSN1EncodableVector1 = new ASN1EncodableVector();
      for (Control control : this.controls)
        aSN1EncodableVector1.add((ASN1Encodable)new AttributeTypeAndValue(control.getType(), control.getValue())); 
      aSN1EncodableVector.add((ASN1Encodable)new DERSequence(aSN1EncodableVector1));
    } 
    CertRequest certRequest = CertRequest.getInstance(new DERSequence(aSN1EncodableVector));
    if (this.popSigner != null) {
      ProofOfPossessionSigningKeyBuilder proofOfPossessionSigningKeyBuilder;
      CertTemplate certTemplate = certRequest.getCertTemplate();
      if (certTemplate.getSubject() == null || certTemplate.getPublicKey() == null) {
        SubjectPublicKeyInfo subjectPublicKeyInfo = certRequest.getCertTemplate().getPublicKey();
        proofOfPossessionSigningKeyBuilder = new ProofOfPossessionSigningKeyBuilder(subjectPublicKeyInfo);
        if (this.sender != null) {
          proofOfPossessionSigningKeyBuilder.setSender(this.sender);
        } else {
          proofOfPossessionSigningKeyBuilder.setPublicKeyMac(this.pkmacBuilder, this.password);
        } 
      } else {
        proofOfPossessionSigningKeyBuilder = new ProofOfPossessionSigningKeyBuilder(certRequest);
      } 
      proofOfPossession = new ProofOfPossession(proofOfPossessionSigningKeyBuilder.build(this.popSigner));
    } else if (this.popoPrivKey != null) {
      proofOfPossession = new ProofOfPossession(this.popoType, this.popoPrivKey);
    } else if (this.agreeMAC != null) {
      proofOfPossession = new ProofOfPossession(3, new POPOPrivKey(this.agreeMAC));
    } else if (this.popRaVerified != null) {
      proofOfPossession = new ProofOfPossession();
    } else {
      proofOfPossession = new ProofOfPossession();
    } 
    CertReqMsg certReqMsg = new CertReqMsg(certRequest, proofOfPossession, this.regInfo);
    return new CertificateRequestMessage(certReqMsg);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\CertificateRequestMessageBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */