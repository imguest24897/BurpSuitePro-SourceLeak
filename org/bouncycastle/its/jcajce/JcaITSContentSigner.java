package org.bouncycastle.its.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.its.operator.ITSContentSigner;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import org.bouncycastle.util.Arrays;

public class JcaITSContentSigner implements ITSContentSigner {
  private final ECPrivateKey privateKey;
  
  private final ITSCertificate signerCert;
  
  private final AlgorithmIdentifier digestAlgo;
  
  private final DigestCalculator digest;
  
  private final byte[] parentData;
  
  private final ASN1ObjectIdentifier curveID;
  
  private final byte[] parentDigest;
  
  private final String signer;
  
  private final JcaJceHelper helper;
  
  private JcaITSContentSigner(ECPrivateKey paramECPrivateKey, ITSCertificate paramITSCertificate, JcaJceHelper paramJcaJceHelper) {
    DigestCalculatorProvider digestCalculatorProvider;
    this.privateKey = paramECPrivateKey;
    this.signerCert = paramITSCertificate;
    this.helper = paramJcaJceHelper;
    PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(paramECPrivateKey.getEncoded());
    this.curveID = ASN1ObjectIdentifier.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
    if (this.curveID.equals((ASN1Primitive)SECObjectIdentifiers.secp256r1)) {
      this.digestAlgo = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
      this.signer = "SHA256withECDSA";
    } else if (this.curveID.equals((ASN1Primitive)TeleTrusTObjectIdentifiers.brainpoolP256r1)) {
      this.digestAlgo = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
      this.signer = "SHA256withECDSA";
    } else if (this.curveID.equals((ASN1Primitive)TeleTrusTObjectIdentifiers.brainpoolP384r1)) {
      this.digestAlgo = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384);
      this.signer = "SHA384withECDSA";
    } else {
      throw new IllegalArgumentException("unknown key type");
    } 
    try {
      JcaDigestCalculatorProviderBuilder jcaDigestCalculatorProviderBuilder = (new JcaDigestCalculatorProviderBuilder()).setHelper(paramJcaJceHelper);
      digestCalculatorProvider = jcaDigestCalculatorProviderBuilder.build();
    } catch (Exception exception) {
      throw new IllegalStateException(exception.getMessage(), exception);
    } 
    try {
      this.digest = digestCalculatorProvider.get(this.digestAlgo);
    } catch (OperatorCreationException operatorCreationException) {
      throw new IllegalStateException("cannot recognise digest type: " + this.digestAlgo.getAlgorithm(), operatorCreationException);
    } 
    if (paramITSCertificate != null) {
      try {
        this.parentData = paramITSCertificate.getEncoded();
        OutputStream outputStream = this.digest.getOutputStream();
        outputStream.write(this.parentData, 0, this.parentData.length);
        outputStream.close();
        this.parentDigest = this.digest.getDigest();
      } catch (IOException iOException) {
        throw new IllegalStateException("signer certificate encoding failed: " + iOException.getMessage());
      } 
    } else {
      this.parentData = null;
      this.parentDigest = this.digest.getDigest();
    } 
  }
  
  public OutputStream getOutputStream() {
    return this.digest.getOutputStream();
  }
  
  public byte[] getSignature() {
    byte[] arrayOfByte = this.digest.getDigest();
    try {
      Signature signature = this.helper.createSignature(this.signer);
      signature.initSign(this.privateKey);
      signature.update(arrayOfByte, 0, arrayOfByte.length);
      signature.update(this.parentDigest, 0, this.parentDigest.length);
      return signature.sign();
    } catch (Exception exception) {
      throw new RuntimeException(exception.getMessage(), exception);
    } 
  }
  
  public ITSCertificate getAssociatedCertificate() {
    return this.signerCert;
  }
  
  public byte[] getAssociatedCertificateDigest() {
    return Arrays.clone(this.parentDigest);
  }
  
  public AlgorithmIdentifier getDigestAlgorithm() {
    return this.digestAlgo;
  }
  
  public ASN1ObjectIdentifier getCurveID() {
    return this.curveID;
  }
  
  public boolean isForSelfSigning() {
    return (this.parentData == null);
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
    
    public JcaITSContentSigner build(PrivateKey param1PrivateKey) {
      return new JcaITSContentSigner((ECPrivateKey)param1PrivateKey, null, this.helper);
    }
    
    public JcaITSContentSigner build(PrivateKey param1PrivateKey, ITSCertificate param1ITSCertificate) {
      return new JcaITSContentSigner((ECPrivateKey)param1PrivateKey, param1ITSCertificate, this.helper);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\jcajce\JcaITSContentSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */