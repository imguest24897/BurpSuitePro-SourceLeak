package org.bouncycastle.operator.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.jcajce.spec.CompositeAlgorithmSpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.RuntimeOperatorException;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.TeeOutputStream;

public class JcaContentSignerBuilder {
  private static final Set isAlgIdFromPrivate = new HashSet();
  
  private final String signatureAlgorithm;
  
  private OperatorHelper helper = new OperatorHelper((JcaJceHelper)new DefaultJcaJceHelper());
  
  private SecureRandom random;
  
  private AlgorithmIdentifier sigAlgId;
  
  private AlgorithmParameterSpec sigAlgSpec;
  
  public JcaContentSignerBuilder(String paramString) {
    this.signatureAlgorithm = paramString;
  }
  
  public JcaContentSignerBuilder(String paramString, AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    this.signatureAlgorithm = paramString;
    if (paramAlgorithmParameterSpec instanceof PSSParameterSpec) {
      PSSParameterSpec pSSParameterSpec = (PSSParameterSpec)paramAlgorithmParameterSpec;
      this.sigAlgSpec = pSSParameterSpec;
      this.sigAlgId = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_RSASSA_PSS, (ASN1Encodable)createPSSParams(pSSParameterSpec));
    } else if (paramAlgorithmParameterSpec instanceof CompositeAlgorithmSpec) {
      CompositeAlgorithmSpec compositeAlgorithmSpec = (CompositeAlgorithmSpec)paramAlgorithmParameterSpec;
      this.sigAlgSpec = (AlgorithmParameterSpec)compositeAlgorithmSpec;
      this.sigAlgId = new AlgorithmIdentifier(MiscObjectIdentifiers.id_alg_composite, (ASN1Encodable)createCompParams(compositeAlgorithmSpec));
    } else {
      throw new IllegalArgumentException("unknown sigParamSpec: " + ((paramAlgorithmParameterSpec == null) ? "null" : paramAlgorithmParameterSpec.getClass().getName()));
    } 
  }
  
  public JcaContentSignerBuilder setProvider(Provider paramProvider) {
    this.helper = new OperatorHelper((JcaJceHelper)new ProviderJcaJceHelper(paramProvider));
    return this;
  }
  
  public JcaContentSignerBuilder setProvider(String paramString) {
    this.helper = new OperatorHelper((JcaJceHelper)new NamedJcaJceHelper(paramString));
    return this;
  }
  
  public JcaContentSignerBuilder setSecureRandom(SecureRandom paramSecureRandom) {
    this.random = paramSecureRandom;
    return this;
  }
  
  public ContentSigner build(PrivateKey paramPrivateKey) throws OperatorCreationException {
    if (paramPrivateKey instanceof CompositePrivateKey && ((CompositePrivateKey)paramPrivateKey).getAlgorithmIdentifier().equals((ASN1Primitive)MiscObjectIdentifiers.id_composite_key))
      return buildComposite((CompositePrivateKey)paramPrivateKey); 
    try {
      if (this.sigAlgSpec == null)
        if (isAlgIdFromPrivate.contains(Strings.toUpperCase(this.signatureAlgorithm))) {
          this.sigAlgId = PrivateKeyInfo.getInstance(paramPrivateKey.getEncoded()).getPrivateKeyAlgorithm();
          this.sigAlgSpec = null;
        } else {
          this.sigAlgId = (new DefaultSignatureAlgorithmIdentifierFinder()).find(this.signatureAlgorithm);
          this.sigAlgSpec = null;
        }  
      final AlgorithmIdentifier signatureAlgId = this.sigAlgId;
      final Signature sig = this.helper.createSignature(this.sigAlgId);
      if (this.random != null) {
        signature.initSign(paramPrivateKey, this.random);
      } else {
        signature.initSign(paramPrivateKey);
      } 
      return new ContentSigner() {
          private OutputStream stream = OutputStreamFactory.createStream(sig);
          
          public AlgorithmIdentifier getAlgorithmIdentifier() {
            return signatureAlgId;
          }
          
          public OutputStream getOutputStream() {
            return this.stream;
          }
          
          public byte[] getSignature() {
            try {
              return sig.sign();
            } catch (SignatureException signatureException) {
              throw new RuntimeOperatorException("exception obtaining signature: " + signatureException.getMessage(), signatureException);
            } 
          }
        };
    } catch (GeneralSecurityException generalSecurityException) {
      throw new OperatorCreationException("cannot create signer: " + generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
  
  private ContentSigner buildComposite(CompositePrivateKey paramCompositePrivateKey) throws OperatorCreationException {
    try {
      TeeOutputStream teeOutputStream1;
      List<PrivateKey> list = paramCompositePrivateKey.getPrivateKeys();
      ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(this.sigAlgId.getParameters());
      final Signature[] sigs = new Signature[aSN1Sequence.size()];
      for (byte b1 = 0; b1 != aSN1Sequence.size(); b1++) {
        arrayOfSignature[b1] = this.helper.createSignature(AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(b1)));
        if (this.random != null) {
          arrayOfSignature[b1].initSign(list.get(b1), this.random);
        } else {
          arrayOfSignature[b1].initSign(list.get(b1));
        } 
      } 
      OutputStream outputStream = OutputStreamFactory.createStream(arrayOfSignature[0]);
      for (byte b2 = 1; b2 != arrayOfSignature.length; b2++)
        teeOutputStream1 = new TeeOutputStream(outputStream, OutputStreamFactory.createStream(arrayOfSignature[b2])); 
      final TeeOutputStream sigStream = teeOutputStream1;
      return new ContentSigner() {
          OutputStream stream = sigStream;
          
          public AlgorithmIdentifier getAlgorithmIdentifier() {
            return JcaContentSignerBuilder.this.sigAlgId;
          }
          
          public OutputStream getOutputStream() {
            return this.stream;
          }
          
          public byte[] getSignature() {
            try {
              ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
              for (byte b = 0; b != sigs.length; b++)
                aSN1EncodableVector.add((ASN1Encodable)new DERBitString(sigs[b].sign())); 
              return (new DERSequence(aSN1EncodableVector)).getEncoded("DER");
            } catch (IOException iOException) {
              throw new RuntimeOperatorException("exception encoding signature: " + iOException.getMessage(), iOException);
            } catch (SignatureException signatureException) {
              throw new RuntimeOperatorException("exception obtaining signature: " + signatureException.getMessage(), signatureException);
            } 
          }
        };
    } catch (GeneralSecurityException generalSecurityException) {
      throw new OperatorCreationException("cannot create signer: " + generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
  
  private static RSASSAPSSparams createPSSParams(PSSParameterSpec paramPSSParameterSpec) {
    DefaultDigestAlgorithmIdentifierFinder defaultDigestAlgorithmIdentifierFinder = new DefaultDigestAlgorithmIdentifierFinder();
    AlgorithmIdentifier algorithmIdentifier1 = defaultDigestAlgorithmIdentifierFinder.find(paramPSSParameterSpec.getDigestAlgorithm());
    if (algorithmIdentifier1.getParameters() == null)
      algorithmIdentifier1 = new AlgorithmIdentifier(algorithmIdentifier1.getAlgorithm(), (ASN1Encodable)DERNull.INSTANCE); 
    AlgorithmIdentifier algorithmIdentifier2 = defaultDigestAlgorithmIdentifierFinder.find(((MGF1ParameterSpec)paramPSSParameterSpec.getMGFParameters()).getDigestAlgorithm());
    if (algorithmIdentifier2.getParameters() == null)
      algorithmIdentifier2 = new AlgorithmIdentifier(algorithmIdentifier2.getAlgorithm(), (ASN1Encodable)DERNull.INSTANCE); 
    return new RSASSAPSSparams(algorithmIdentifier1, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, (ASN1Encodable)algorithmIdentifier2), new ASN1Integer(paramPSSParameterSpec.getSaltLength()), new ASN1Integer(paramPSSParameterSpec.getTrailerField()));
  }
  
  private static ASN1Sequence createCompParams(CompositeAlgorithmSpec paramCompositeAlgorithmSpec) {
    DefaultSignatureAlgorithmIdentifierFinder defaultSignatureAlgorithmIdentifierFinder = new DefaultSignatureAlgorithmIdentifierFinder();
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    List<String> list = paramCompositeAlgorithmSpec.getAlgorithmNames();
    List<AlgorithmParameterSpec> list1 = paramCompositeAlgorithmSpec.getParameterSpecs();
    for (byte b = 0; b != list.size(); b++) {
      AlgorithmParameterSpec algorithmParameterSpec = list1.get(b);
      if (algorithmParameterSpec == null) {
        aSN1EncodableVector.add((ASN1Encodable)defaultSignatureAlgorithmIdentifierFinder.find(list.get(b)));
      } else if (algorithmParameterSpec instanceof PSSParameterSpec) {
        aSN1EncodableVector.add((ASN1Encodable)new AlgorithmIdentifier(PKCSObjectIdentifiers.id_RSASSA_PSS, (ASN1Encodable)createPSSParams((PSSParameterSpec)algorithmParameterSpec)));
      } else {
        throw new IllegalArgumentException("unrecognized parameterSpec");
      } 
    } 
    return (ASN1Sequence)new DERSequence(aSN1EncodableVector);
  }
  
  static {
    isAlgIdFromPrivate.add("DILITHIUM");
    isAlgIdFromPrivate.add("SPHINCS+");
    isAlgIdFromPrivate.add("SPHINCSPlus");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\operator\jcajce\JcaContentSignerBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */