package org.bouncycastle.cert.crmf;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.crmf.AttributeTypeAndValue;
import org.bouncycastle.asn1.crmf.CRMFObjectIdentifiers;
import org.bouncycastle.asn1.crmf.CertReqMsg;
import org.bouncycastle.asn1.crmf.CertRequest;
import org.bouncycastle.asn1.crmf.CertTemplate;
import org.bouncycastle.asn1.crmf.Controls;
import org.bouncycastle.asn1.crmf.PKIArchiveOptions;
import org.bouncycastle.asn1.crmf.PKMACValue;
import org.bouncycastle.asn1.crmf.POPOSigningKey;
import org.bouncycastle.asn1.crmf.POPOSigningKeyInput;
import org.bouncycastle.asn1.crmf.ProofOfPossession;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Encodable;

public class CertificateRequestMessage implements Encodable {
  public static final int popRaVerified = 0;
  
  public static final int popSigningKey = 1;
  
  public static final int popKeyEncipherment = 2;
  
  public static final int popKeyAgreement = 3;
  
  private final CertReqMsg certReqMsg;
  
  private final Controls controls;
  
  private static CertReqMsg parseBytes(byte[] paramArrayOfbyte) throws IOException {
    try {
      return CertReqMsg.getInstance(paramArrayOfbyte);
    } catch (ClassCastException classCastException) {
      throw new CertIOException("malformed data: " + classCastException.getMessage(), classCastException);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new CertIOException("malformed data: " + illegalArgumentException.getMessage(), illegalArgumentException);
    } 
  }
  
  public CertificateRequestMessage(byte[] paramArrayOfbyte) throws IOException {
    this(parseBytes(paramArrayOfbyte));
  }
  
  public CertificateRequestMessage(CertReqMsg paramCertReqMsg) {
    this.certReqMsg = paramCertReqMsg;
    this.controls = paramCertReqMsg.getCertReq().getControls();
  }
  
  public CertReqMsg toASN1Structure() {
    return this.certReqMsg;
  }
  
  public ASN1Integer getCertReqId() {
    return this.certReqMsg.getCertReq().getCertReqId();
  }
  
  public CertTemplate getCertTemplate() {
    return this.certReqMsg.getCertReq().getCertTemplate();
  }
  
  public boolean hasControls() {
    return (this.controls != null);
  }
  
  public boolean hasControl(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return (findControl(paramASN1ObjectIdentifier) != null);
  }
  
  public Control getControl(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    AttributeTypeAndValue attributeTypeAndValue = findControl(paramASN1ObjectIdentifier);
    if (attributeTypeAndValue != null) {
      if (attributeTypeAndValue.getType().equals((ASN1Primitive)CRMFObjectIdentifiers.id_regCtrl_pkiArchiveOptions))
        return new PKIArchiveControl(PKIArchiveOptions.getInstance(attributeTypeAndValue.getValue())); 
      if (attributeTypeAndValue.getType().equals((ASN1Primitive)CRMFObjectIdentifiers.id_regCtrl_regToken))
        return new RegTokenControl(ASN1UTF8String.getInstance(attributeTypeAndValue.getValue())); 
      if (attributeTypeAndValue.getType().equals((ASN1Primitive)CRMFObjectIdentifiers.id_regCtrl_authenticator))
        return new AuthenticatorControl(ASN1UTF8String.getInstance(attributeTypeAndValue.getValue())); 
    } 
    return null;
  }
  
  private AttributeTypeAndValue findControl(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    if (this.controls == null)
      return null; 
    AttributeTypeAndValue[] arrayOfAttributeTypeAndValue = this.controls.toAttributeTypeAndValueArray();
    AttributeTypeAndValue attributeTypeAndValue = null;
    for (byte b = 0; b != arrayOfAttributeTypeAndValue.length; b++) {
      if (arrayOfAttributeTypeAndValue[b].getType().equals((ASN1Primitive)paramASN1ObjectIdentifier)) {
        attributeTypeAndValue = arrayOfAttributeTypeAndValue[b];
        break;
      } 
    } 
    return attributeTypeAndValue;
  }
  
  public boolean hasProofOfPossession() {
    return (this.certReqMsg.getPop() != null);
  }
  
  public int getProofOfPossessionType() {
    return this.certReqMsg.getPop().getType();
  }
  
  public boolean hasSigningKeyProofOfPossessionWithPKMAC() {
    ProofOfPossession proofOfPossession = this.certReqMsg.getPop();
    if (proofOfPossession.getType() != 1)
      return false; 
    POPOSigningKey pOPOSigningKey = POPOSigningKey.getInstance(proofOfPossession.getObject());
    return (pOPOSigningKey.getPoposkInput().getPublicKeyMAC() != null);
  }
  
  public boolean isValidSigningKeyPOP(ContentVerifierProvider paramContentVerifierProvider) throws CRMFException, IllegalStateException {
    ProofOfPossession proofOfPossession = this.certReqMsg.getPop();
    if (proofOfPossession.getType() != 1)
      throw new IllegalStateException("not Signing Key type of proof of possession"); 
    POPOSigningKey pOPOSigningKey = POPOSigningKey.getInstance(proofOfPossession.getObject());
    if (pOPOSigningKey.getPoposkInput() != null && pOPOSigningKey.getPoposkInput().getPublicKeyMAC() != null)
      throw new IllegalStateException("verification requires password check"); 
    return verifySignature(paramContentVerifierProvider, pOPOSigningKey);
  }
  
  public boolean isValidSigningKeyPOP(ContentVerifierProvider paramContentVerifierProvider, PKMACBuilder paramPKMACBuilder, char[] paramArrayOfchar) throws CRMFException, IllegalStateException {
    ProofOfPossession proofOfPossession = this.certReqMsg.getPop();
    if (proofOfPossession.getType() != 1)
      throw new IllegalStateException("not Signing Key type of proof of possession"); 
    POPOSigningKey pOPOSigningKey = POPOSigningKey.getInstance(proofOfPossession.getObject());
    if (pOPOSigningKey.getPoposkInput() == null || pOPOSigningKey.getPoposkInput().getSender() != null)
      throw new IllegalStateException("no PKMAC present in proof of possession"); 
    PKMACValue pKMACValue = pOPOSigningKey.getPoposkInput().getPublicKeyMAC();
    PKMACValueVerifier pKMACValueVerifier = new PKMACValueVerifier(paramPKMACBuilder);
    return (pKMACValueVerifier.isValid(pKMACValue, paramArrayOfchar, getCertTemplate().getPublicKey()) && verifySignature(paramContentVerifierProvider, pOPOSigningKey));
  }
  
  private boolean verifySignature(ContentVerifierProvider paramContentVerifierProvider, POPOSigningKey paramPOPOSigningKey) throws CRMFException {
    ContentVerifier contentVerifier;
    CertRequest certRequest;
    try {
      contentVerifier = paramContentVerifierProvider.get(paramPOPOSigningKey.getAlgorithmIdentifier());
    } catch (OperatorCreationException operatorCreationException) {
      throw new CRMFException("unable to create verifier: " + operatorCreationException.getMessage(), operatorCreationException);
    } 
    POPOSigningKeyInput pOPOSigningKeyInput = paramPOPOSigningKey.getPoposkInput();
    if (pOPOSigningKeyInput == null)
      certRequest = this.certReqMsg.getCertReq(); 
    CRMFUtil.derEncodeToStream((ASN1Object)certRequest, contentVerifier.getOutputStream());
    return contentVerifier.verify(paramPOPOSigningKey.getSignature().getOctets());
  }
  
  public byte[] getEncoded() throws IOException {
    return this.certReqMsg.getEncoded();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\CertificateRequestMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */