package org.bouncycastle.operator.jcajce;

import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.RawContentVerifier;
import org.bouncycastle.operator.RuntimeOperatorException;
import org.bouncycastle.util.io.TeeOutputStream;

public class JcaContentVerifierProviderBuilder {
  private OperatorHelper helper = new OperatorHelper((JcaJceHelper)new DefaultJcaJceHelper());
  
  public JcaContentVerifierProviderBuilder setProvider(Provider paramProvider) {
    this.helper = new OperatorHelper((JcaJceHelper)new ProviderJcaJceHelper(paramProvider));
    return this;
  }
  
  public JcaContentVerifierProviderBuilder setProvider(String paramString) {
    this.helper = new OperatorHelper((JcaJceHelper)new NamedJcaJceHelper(paramString));
    return this;
  }
  
  public ContentVerifierProvider build(X509CertificateHolder paramX509CertificateHolder) throws OperatorCreationException, CertificateException {
    return build(this.helper.convertCertificate(paramX509CertificateHolder));
  }
  
  public ContentVerifierProvider build(final X509Certificate certificate) throws OperatorCreationException {
    final JcaX509CertificateHolder certHolder;
    try {
      jcaX509CertificateHolder = new JcaX509CertificateHolder(certificate);
    } catch (CertificateEncodingException certificateEncodingException) {
      throw new OperatorCreationException("cannot process certificate: " + certificateEncodingException.getMessage(), certificateEncodingException);
    } 
    return new ContentVerifierProvider() {
        public boolean hasAssociatedCertificate() {
          return true;
        }
        
        public X509CertificateHolder getAssociatedCertificate() {
          return certHolder;
        }
        
        public ContentVerifier get(AlgorithmIdentifier param1AlgorithmIdentifier) throws OperatorCreationException {
          Signature signature1;
          if (param1AlgorithmIdentifier.getAlgorithm().equals((ASN1Primitive)MiscObjectIdentifiers.id_alg_composite))
            return JcaContentVerifierProviderBuilder.this.createCompositeVerifier(param1AlgorithmIdentifier, certificate.getPublicKey()); 
          try {
            signature1 = JcaContentVerifierProviderBuilder.this.helper.createSignature(param1AlgorithmIdentifier);
            signature1.initVerify(certificate.getPublicKey());
          } catch (GeneralSecurityException generalSecurityException) {
            throw new OperatorCreationException("exception on setup: " + generalSecurityException, generalSecurityException);
          } 
          Signature signature2 = JcaContentVerifierProviderBuilder.this.createRawSig(param1AlgorithmIdentifier, certificate.getPublicKey());
          return (signature2 != null) ? new JcaContentVerifierProviderBuilder.RawSigVerifier(param1AlgorithmIdentifier, signature1, signature2) : new JcaContentVerifierProviderBuilder.SigVerifier(param1AlgorithmIdentifier, signature1);
        }
      };
  }
  
  public ContentVerifierProvider build(final PublicKey publicKey) throws OperatorCreationException {
    return new ContentVerifierProvider() {
        public boolean hasAssociatedCertificate() {
          return false;
        }
        
        public X509CertificateHolder getAssociatedCertificate() {
          return null;
        }
        
        public ContentVerifier get(AlgorithmIdentifier param1AlgorithmIdentifier) throws OperatorCreationException {
          if (param1AlgorithmIdentifier.getAlgorithm().equals((ASN1Primitive)MiscObjectIdentifiers.id_alg_composite))
            return JcaContentVerifierProviderBuilder.this.createCompositeVerifier(param1AlgorithmIdentifier, publicKey); 
          if (publicKey instanceof CompositePublicKey && ((CompositePublicKey)publicKey).getAlgorithmIdentifier().equals((ASN1Primitive)MiscObjectIdentifiers.id_composite_key)) {
            List<PublicKey> list = ((CompositePublicKey)publicKey).getPublicKeys();
            byte b = 0;
            while (b != list.size()) {
              try {
                Signature signature3 = JcaContentVerifierProviderBuilder.this.createSignature(param1AlgorithmIdentifier, list.get(b));
                Signature signature4 = JcaContentVerifierProviderBuilder.this.createRawSig(param1AlgorithmIdentifier, list.get(b));
                return (signature4 != null) ? new JcaContentVerifierProviderBuilder.RawSigVerifier(param1AlgorithmIdentifier, signature3, signature4) : new JcaContentVerifierProviderBuilder.SigVerifier(param1AlgorithmIdentifier, signature3);
              } catch (OperatorCreationException operatorCreationException) {
                b++;
              } 
            } 
            throw new OperatorCreationException("no matching algorithm found for key");
          } 
          Signature signature1 = JcaContentVerifierProviderBuilder.this.createSignature(param1AlgorithmIdentifier, publicKey);
          Signature signature2 = JcaContentVerifierProviderBuilder.this.createRawSig(param1AlgorithmIdentifier, publicKey);
          return (signature2 != null) ? new JcaContentVerifierProviderBuilder.RawSigVerifier(param1AlgorithmIdentifier, signature1, signature2) : new JcaContentVerifierProviderBuilder.SigVerifier(param1AlgorithmIdentifier, signature1);
        }
      };
  }
  
  public ContentVerifierProvider build(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) throws OperatorCreationException {
    return build(this.helper.convertPublicKey(paramSubjectPublicKeyInfo));
  }
  
  private ContentVerifier createCompositeVerifier(AlgorithmIdentifier paramAlgorithmIdentifier, PublicKey paramPublicKey) throws OperatorCreationException {
    if (paramPublicKey instanceof CompositePublicKey) {
      List<PublicKey> list = ((CompositePublicKey)paramPublicKey).getPublicKeys();
      ASN1Sequence aSN1Sequence1 = ASN1Sequence.getInstance(paramAlgorithmIdentifier.getParameters());
      Signature[] arrayOfSignature1 = new Signature[aSN1Sequence1.size()];
      for (byte b1 = 0; b1 != aSN1Sequence1.size(); b1++) {
        AlgorithmIdentifier algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1Sequence1.getObjectAt(b1));
        if (list.get(b1) != null) {
          arrayOfSignature1[b1] = createSignature(algorithmIdentifier, list.get(b1));
        } else {
          arrayOfSignature1[b1] = null;
        } 
      } 
      return new CompositeVerifier(arrayOfSignature1);
    } 
    ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(paramAlgorithmIdentifier.getParameters());
    Signature[] arrayOfSignature = new Signature[aSN1Sequence.size()];
    for (byte b = 0; b != aSN1Sequence.size(); b++) {
      AlgorithmIdentifier algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(b));
      try {
        arrayOfSignature[b] = createSignature(algorithmIdentifier, paramPublicKey);
      } catch (Exception exception) {
        arrayOfSignature[b] = null;
      } 
    } 
    return new CompositeVerifier(arrayOfSignature);
  }
  
  private Signature createSignature(AlgorithmIdentifier paramAlgorithmIdentifier, PublicKey paramPublicKey) throws OperatorCreationException {
    try {
      Signature signature = this.helper.createSignature(paramAlgorithmIdentifier);
      signature.initVerify(paramPublicKey);
      return signature;
    } catch (GeneralSecurityException generalSecurityException) {
      throw new OperatorCreationException("exception on setup: " + generalSecurityException, generalSecurityException);
    } 
  }
  
  private Signature createRawSig(AlgorithmIdentifier paramAlgorithmIdentifier, PublicKey paramPublicKey) {
    Signature signature;
    try {
      signature = this.helper.createRawSignature(paramAlgorithmIdentifier);
      if (signature != null)
        signature.initVerify(paramPublicKey); 
    } catch (Exception exception) {
      signature = null;
    } 
    return signature;
  }
  
  private static class CompositeVerifier implements ContentVerifier {
    private Signature[] sigs;
    
    private OutputStream stream;
    
    public CompositeVerifier(Signature[] param1ArrayOfSignature) throws OperatorCreationException {
      this.sigs = param1ArrayOfSignature;
      byte b;
      for (b = 0; b < param1ArrayOfSignature.length && param1ArrayOfSignature[b] == null; b++);
      if (b == param1ArrayOfSignature.length)
        throw new OperatorCreationException("no matching signature found in composite"); 
      this.stream = OutputStreamFactory.createStream(param1ArrayOfSignature[b]);
      for (int i = b + 1; i != param1ArrayOfSignature.length; i++) {
        if (param1ArrayOfSignature[i] != null)
          this.stream = (OutputStream)new TeeOutputStream(this.stream, OutputStreamFactory.createStream(param1ArrayOfSignature[i])); 
      } 
    }
    
    public AlgorithmIdentifier getAlgorithmIdentifier() {
      return new AlgorithmIdentifier(MiscObjectIdentifiers.id_alg_composite);
    }
    
    public OutputStream getOutputStream() {
      return this.stream;
    }
    
    public boolean verify(byte[] param1ArrayOfbyte) {
      try {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(param1ArrayOfbyte);
        boolean bool = false;
        for (byte b = 0; b != aSN1Sequence.size(); b++) {
          if (this.sigs[b] != null && !this.sigs[b].verify(ASN1BitString.getInstance(aSN1Sequence.getObjectAt(b)).getOctets()))
            bool = true; 
        } 
        return !bool;
      } catch (SignatureException signatureException) {
        throw new RuntimeOperatorException("exception obtaining signature: " + signatureException.getMessage(), signatureException);
      } 
    }
  }
  
  private static class RawSigVerifier extends SigVerifier implements RawContentVerifier {
    private Signature rawSignature;
    
    RawSigVerifier(AlgorithmIdentifier param1AlgorithmIdentifier, Signature param1Signature1, Signature param1Signature2) {
      super(param1AlgorithmIdentifier, param1Signature1);
      this.rawSignature = param1Signature2;
    }
    
    public boolean verify(byte[] param1ArrayOfbyte) {
      try {
        return super.verify(param1ArrayOfbyte);
      } finally {
        try {
          this.rawSignature.verify(param1ArrayOfbyte);
        } catch (Exception exception) {}
      } 
    }
    
    public boolean verify(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2) {
      try {
        this.rawSignature.update(param1ArrayOfbyte1);
        return this.rawSignature.verify(param1ArrayOfbyte2);
      } catch (SignatureException signatureException) {
        throw new RuntimeOperatorException("exception obtaining raw signature: " + signatureException.getMessage(), signatureException);
      } finally {
        try {
          this.rawSignature.verify(param1ArrayOfbyte2);
        } catch (Exception exception) {}
      } 
    }
  }
  
  private static class SigVerifier implements ContentVerifier {
    private final AlgorithmIdentifier algorithm;
    
    private final Signature signature;
    
    protected final OutputStream stream;
    
    SigVerifier(AlgorithmIdentifier param1AlgorithmIdentifier, Signature param1Signature) {
      this.algorithm = param1AlgorithmIdentifier;
      this.signature = param1Signature;
      this.stream = OutputStreamFactory.createStream(param1Signature);
    }
    
    public AlgorithmIdentifier getAlgorithmIdentifier() {
      return this.algorithm;
    }
    
    public OutputStream getOutputStream() {
      if (this.stream == null)
        throw new IllegalStateException("verifier not initialised"); 
      return this.stream;
    }
    
    public boolean verify(byte[] param1ArrayOfbyte) {
      try {
        return this.signature.verify(param1ArrayOfbyte);
      } catch (SignatureException signatureException) {
        throw new RuntimeOperatorException("exception obtaining signature: " + signatureException.getMessage(), signatureException);
      } 
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\operator\jcajce\JcaContentVerifierProviderBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */