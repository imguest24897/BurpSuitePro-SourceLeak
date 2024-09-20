package org.bouncycastle.its.bc;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.signers.DSADigestSigner;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.its.operator.ITSContentVerifierProvider;
import org.bouncycastle.oer.OEREncoder;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;
import org.bouncycastle.oer.its.ieee1609dot2.VerificationKeyIndicator;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicVerificationKey;
import org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.bc.BcDefaultDigestProvider;
import org.bouncycastle.util.Arrays;

public class BcITSContentVerifierProvider implements ITSContentVerifierProvider {
  private final ITSCertificate issuer;
  
  private final byte[] parentData;
  
  private final AlgorithmIdentifier digestAlgo;
  
  private final ECPublicKeyParameters pubParams;
  
  private final int sigChoice;
  
  public BcITSContentVerifierProvider(ITSCertificate paramITSCertificate) throws IOException {
    this.issuer = paramITSCertificate;
    this.parentData = paramITSCertificate.getEncoded();
    ToBeSignedCertificate toBeSignedCertificate = paramITSCertificate.toASN1Structure().getToBeSigned();
    VerificationKeyIndicator verificationKeyIndicator = toBeSignedCertificate.getVerifyKeyIndicator();
    if (verificationKeyIndicator.getVerificationKeyIndicator() instanceof PublicVerificationKey) {
      PublicVerificationKey publicVerificationKey = PublicVerificationKey.getInstance(verificationKeyIndicator.getVerificationKeyIndicator());
      this.sigChoice = publicVerificationKey.getChoice();
      switch (publicVerificationKey.getChoice()) {
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
          throw new IllegalStateException("unknown key type");
      } 
      this.pubParams = (ECPublicKeyParameters)(new BcITSPublicVerificationKey(publicVerificationKey)).getKey();
    } else {
      throw new IllegalStateException("not public verification key");
    } 
  }
  
  public ITSCertificate getAssociatedCertificate() {
    return this.issuer;
  }
  
  public boolean hasAssociatedCertificate() {
    return (this.issuer != null);
  }
  
  public ContentVerifier get(int paramInt) throws OperatorCreationException {
    if (this.sigChoice != paramInt)
      throw new OperatorCreationException("wrong verifier for algorithm: " + paramInt); 
    final ExtendedDigest digest = BcDefaultDigestProvider.INSTANCE.get(this.digestAlgo);
    final byte[] parentDigest = new byte[extendedDigest.getDigestSize()];
    extendedDigest.update(this.parentData, 0, this.parentData.length);
    extendedDigest.doFinal(arrayOfByte1, 0);
    final byte[] parentTBSDigest = this.issuer.getIssuer().isSelf() ? new byte[extendedDigest.getDigestSize()] : null;
    if (arrayOfByte2 != null) {
      byte[] arrayOfByte = OEREncoder.toByteArray((ASN1Encodable)this.issuer.toASN1Structure().getToBeSigned(), IEEE1609dot2.ToBeSignedCertificate.build());
      extendedDigest.update(arrayOfByte, 0, arrayOfByte.length);
      extendedDigest.doFinal(arrayOfByte2, 0);
    } 
    final OutputStream os = new OutputStream() {
        public void write(int param1Int) throws IOException {
          digest.update((byte)param1Int);
        }
        
        public void write(byte[] param1ArrayOfbyte) throws IOException {
          digest.update(param1ArrayOfbyte, 0, param1ArrayOfbyte.length);
        }
        
        public void write(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) throws IOException {
          digest.update(param1ArrayOfbyte, param1Int1, param1Int2);
        }
      };
    return new ContentVerifier() {
        final DSADigestSigner signer = new DSADigestSigner((DSA)new ECDSASigner(), (Digest)BcDefaultDigestProvider.INSTANCE.get(BcITSContentVerifierProvider.this.digestAlgo));
        
        public AlgorithmIdentifier getAlgorithmIdentifier() {
          return null;
        }
        
        public OutputStream getOutputStream() {
          return os;
        }
        
        public boolean verify(byte[] param1ArrayOfbyte) {
          byte[] arrayOfByte = new byte[digest.getDigestSize()];
          digest.doFinal(arrayOfByte, 0);
          this.signer.init(false, (CipherParameters)BcITSContentVerifierProvider.this.pubParams);
          this.signer.update(arrayOfByte, 0, arrayOfByte.length);
          if (parentTBSDigest != null && Arrays.areEqual(arrayOfByte, parentTBSDigest)) {
            byte[] arrayOfByte1 = new byte[digest.getDigestSize()];
            digest.doFinal(arrayOfByte1, 0);
            this.signer.update(arrayOfByte1, 0, arrayOfByte1.length);
          } else {
            this.signer.update(parentDigest, 0, parentDigest.length);
          } 
          return this.signer.verifySignature(param1ArrayOfbyte);
        }
      };
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\bc\BcITSContentVerifierProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */