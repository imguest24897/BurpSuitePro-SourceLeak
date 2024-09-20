package org.bouncycastle.its.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.its.ITSPublicVerificationKey;
import org.bouncycastle.its.operator.ITSContentVerifierProvider;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.oer.OEREncoder;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;
import org.bouncycastle.oer.its.ieee1609dot2.VerificationKeyIndicator;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicVerificationKey;
import org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import org.bouncycastle.util.Arrays;

public class JcaITSContentVerifierProvider implements ITSContentVerifierProvider {
  private final ITSCertificate issuer;
  
  private final byte[] parentData;
  
  private final JcaJceHelper helper;
  
  private AlgorithmIdentifier digestAlgo;
  
  private ECPublicKey pubParams;
  
  private int sigChoice;
  
  private JcaITSContentVerifierProvider(ITSCertificate paramITSCertificate, JcaJceHelper paramJcaJceHelper) {
    this.issuer = paramITSCertificate;
    this.helper = paramJcaJceHelper;
    try {
      this.parentData = paramITSCertificate.getEncoded();
    } catch (IOException iOException) {
      throw new IllegalStateException("unable to extract parent data: " + iOException.getMessage());
    } 
    ToBeSignedCertificate toBeSignedCertificate = paramITSCertificate.toASN1Structure().getToBeSigned();
    VerificationKeyIndicator verificationKeyIndicator = toBeSignedCertificate.getVerifyKeyIndicator();
    if (verificationKeyIndicator.getVerificationKeyIndicator() instanceof PublicVerificationKey) {
      PublicVerificationKey publicVerificationKey = PublicVerificationKey.getInstance(verificationKeyIndicator.getVerificationKeyIndicator());
      initForPvi(publicVerificationKey, paramJcaJceHelper);
    } else {
      throw new IllegalArgumentException("not public verification key");
    } 
  }
  
  private JcaITSContentVerifierProvider(ITSPublicVerificationKey paramITSPublicVerificationKey, JcaJceHelper paramJcaJceHelper) {
    this.issuer = null;
    this.parentData = null;
    this.helper = paramJcaJceHelper;
    initForPvi(paramITSPublicVerificationKey.toASN1Structure(), paramJcaJceHelper);
  }
  
  private void initForPvi(PublicVerificationKey paramPublicVerificationKey, JcaJceHelper paramJcaJceHelper) {
    this.sigChoice = paramPublicVerificationKey.getChoice();
    switch (paramPublicVerificationKey.getChoice()) {
      case 0:
        this.digestAlgo = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        break;
      case 1:
        this.digestAlgo = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        break;
      case 2:
        this.digestAlgo = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384);
        break;
      default:
        throw new IllegalArgumentException("unknown key type");
    } 
    this.pubParams = (ECPublicKey)(new JcaITSPublicVerificationKey(paramPublicVerificationKey, paramJcaJceHelper)).getKey();
  }
  
  public boolean hasAssociatedCertificate() {
    return (this.issuer != null);
  }
  
  public ITSCertificate getAssociatedCertificate() {
    return this.issuer;
  }
  
  public ContentVerifier get(int paramInt) throws OperatorCreationException {
    DigestCalculatorProvider digestCalculatorProvider;
    if (this.sigChoice != paramInt)
      throw new OperatorCreationException("wrong verifier for algorithm: " + paramInt); 
    try {
      JcaDigestCalculatorProviderBuilder jcaDigestCalculatorProviderBuilder = (new JcaDigestCalculatorProviderBuilder()).setHelper(this.helper);
      digestCalculatorProvider = jcaDigestCalculatorProviderBuilder.build();
    } catch (Exception exception) {
      throw new IllegalStateException(exception.getMessage(), exception);
    } 
    final DigestCalculator calculator = digestCalculatorProvider.get(this.digestAlgo);
    try {
      final byte[] parentTBSDigest;
      final Signature signature;
      final OutputStream os = digestCalculator.getOutputStream();
      if (this.parentData != null)
        outputStream.write(this.parentData, 0, this.parentData.length); 
      final byte[] parentDigest = digestCalculator.getDigest();
      if (this.issuer != null && this.issuer.getIssuer().isSelf()) {
        byte[] arrayOfByte = OEREncoder.toByteArray((ASN1Encodable)this.issuer.toASN1Structure().getToBeSigned(), IEEE1609dot2.ToBeSignedCertificate.build());
        outputStream.write(arrayOfByte, 0, arrayOfByte.length);
        arrayOfByte2 = digestCalculator.getDigest();
      } else {
        arrayOfByte2 = null;
      } 
      switch (this.sigChoice) {
        case 0:
        case 1:
          signature = this.helper.createSignature("SHA256withECDSA");
          return new ContentVerifier() {
              public AlgorithmIdentifier getAlgorithmIdentifier() {
                return null;
              }
              
              public OutputStream getOutputStream() {
                return os;
              }
              
              public boolean verify(byte[] param1ArrayOfbyte) {
                byte[] arrayOfByte = calculator.getDigest();
                try {
                  signature.initVerify(JcaITSContentVerifierProvider.this.pubParams);
                  signature.update(arrayOfByte);
                  if (parentTBSDigest != null && Arrays.areEqual(arrayOfByte, parentTBSDigest)) {
                    byte[] arrayOfByte1 = calculator.getDigest();
                    signature.update(arrayOfByte1);
                  } else {
                    signature.update(parentDigest);
                  } 
                  return signature.verify(param1ArrayOfbyte);
                } catch (Exception exception) {
                  throw new RuntimeException(exception.getMessage(), exception);
                } 
              }
            };
        case 2:
          signature = this.helper.createSignature("SHA384withECDSA");
          return new ContentVerifier() {
              public AlgorithmIdentifier getAlgorithmIdentifier() {
                return null;
              }
              
              public OutputStream getOutputStream() {
                return os;
              }
              
              public boolean verify(byte[] param1ArrayOfbyte) {
                byte[] arrayOfByte = calculator.getDigest();
                try {
                  signature.initVerify(JcaITSContentVerifierProvider.this.pubParams);
                  signature.update(arrayOfByte);
                  if (parentTBSDigest != null && Arrays.areEqual(arrayOfByte, parentTBSDigest)) {
                    byte[] arrayOfByte1 = calculator.getDigest();
                    signature.update(arrayOfByte1);
                  } else {
                    signature.update(parentDigest);
                  } 
                  return signature.verify(param1ArrayOfbyte);
                } catch (Exception exception) {
                  throw new RuntimeException(exception.getMessage(), exception);
                } 
              }
            };
      } 
      throw new IllegalArgumentException("choice " + this.sigChoice + " not supported");
    } catch (Exception exception) {
      throw new IllegalStateException(exception.getMessage(), exception);
    } 
  }
  
  public static class Builder {
    private JcaJceHelper helper = (JcaJceHelper)new DefaultJcaJceHelper();
    
    public Builder setProvider(Provider param1Provider) {
      this.helper = (JcaJceHelper)new ProviderJcaJceHelper(param1Provider);
      return this;
    }
    
    public Builder setProvider(String param1String) {
      this.helper = (JcaJceHelper)new NamedJcaJceHelper(param1String);
      return this;
    }
    
    public JcaITSContentVerifierProvider build(ITSCertificate param1ITSCertificate) {
      return new JcaITSContentVerifierProvider(param1ITSCertificate, this.helper);
    }
    
    public JcaITSContentVerifierProvider build(ITSPublicVerificationKey param1ITSPublicVerificationKey) {
      return new JcaITSContentVerifierProvider(param1ITSPublicVerificationKey, this.helper);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\jcajce\JcaITSContentVerifierProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */