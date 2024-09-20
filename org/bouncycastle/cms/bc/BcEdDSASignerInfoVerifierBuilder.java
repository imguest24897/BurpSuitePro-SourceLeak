package org.bouncycastle.cms.bc;

import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator;
import org.bouncycastle.cms.SignerInformationVerifier;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.SignatureAlgorithmIdentifierFinder;
import org.bouncycastle.operator.bc.BcEdDSAContentVerifierProviderBuilder;

public class BcEdDSASignerInfoVerifierBuilder {
  private BcEdDSAContentVerifierProviderBuilder contentVerifierProviderBuilder;
  
  private DigestCalculatorProvider digestCalculatorProvider;
  
  private CMSSignatureAlgorithmNameGenerator sigAlgNameGen;
  
  private SignatureAlgorithmIdentifierFinder sigAlgIdFinder;
  
  public BcEdDSASignerInfoVerifierBuilder(CMSSignatureAlgorithmNameGenerator paramCMSSignatureAlgorithmNameGenerator, SignatureAlgorithmIdentifierFinder paramSignatureAlgorithmIdentifierFinder, DigestAlgorithmIdentifierFinder paramDigestAlgorithmIdentifierFinder, DigestCalculatorProvider paramDigestCalculatorProvider) {
    this.sigAlgNameGen = paramCMSSignatureAlgorithmNameGenerator;
    this.sigAlgIdFinder = paramSignatureAlgorithmIdentifierFinder;
    this.contentVerifierProviderBuilder = new BcEdDSAContentVerifierProviderBuilder();
    this.digestCalculatorProvider = paramDigestCalculatorProvider;
  }
  
  public SignerInformationVerifier build(X509CertificateHolder paramX509CertificateHolder) throws OperatorCreationException {
    return new SignerInformationVerifier(this.sigAlgNameGen, this.sigAlgIdFinder, this.contentVerifierProviderBuilder.build(paramX509CertificateHolder), this.digestCalculatorProvider);
  }
  
  public SignerInformationVerifier build(AsymmetricKeyParameter paramAsymmetricKeyParameter) throws OperatorCreationException {
    return new SignerInformationVerifier(this.sigAlgNameGen, this.sigAlgIdFinder, this.contentVerifierProviderBuilder.build(paramAsymmetricKeyParameter), this.digestCalculatorProvider);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\bc\BcEdDSASignerInfoVerifierBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */