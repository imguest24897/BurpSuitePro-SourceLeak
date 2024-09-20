package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.util.Exceptions;

public class SignatureSpi extends SignatureSpi {
  private final CompositeSignaturesConstants.CompositeName algorithmIdentifier;
  
  private final ASN1ObjectIdentifier algorithmIdentifierASN1;
  
  private final List<Signature> componentSignatures;
  
  private final Digest digest;
  
  private byte[] OIDBytes;
  
  SignatureSpi(CompositeSignaturesConstants.CompositeName paramCompositeName) {
    this.algorithmIdentifier = paramCompositeName;
    this.algorithmIdentifierASN1 = CompositeSignaturesConstants.compositeNameASN1IdentifierMap.get(this.algorithmIdentifier);
    ArrayList<Signature> arrayList = new ArrayList();
    try {
      switch (this.algorithmIdentifier) {
        case MLDSA44_Ed25519_SHA512:
        case MLDSA65_Ed25519_SHA512:
          arrayList.add(Signature.getInstance("Dilithium", "BC"));
          arrayList.add(Signature.getInstance("Ed25519", "BC"));
          this.digest = DigestFactory.createSHA512();
          break;
        case MLDSA87_Ed448_SHA512:
          arrayList.add(Signature.getInstance("Dilithium", "BC"));
          arrayList.add(Signature.getInstance("Ed448", "BC"));
          this.digest = DigestFactory.createSHA512();
          break;
        case MLDSA44_RSA2048_PSS_SHA256:
          arrayList.add(Signature.getInstance("Dilithium", "BC"));
          arrayList.add(Signature.getInstance("SHA256withRSA/PSS", "BC"));
          this.digest = DigestFactory.createSHA256();
          break;
        case MLDSA65_RSA3072_PSS_SHA512:
          arrayList.add(Signature.getInstance("Dilithium", "BC"));
          arrayList.add(Signature.getInstance("SHA512withRSA/PSS", "BC"));
          this.digest = DigestFactory.createSHA512();
          break;
        case MLDSA44_RSA2048_PKCS15_SHA256:
          arrayList.add(Signature.getInstance("Dilithium", "BC"));
          arrayList.add(Signature.getInstance("SHA256withRSA", "BC"));
          this.digest = DigestFactory.createSHA256();
          break;
        case MLDSA65_RSA3072_PKCS15_SHA512:
          arrayList.add(Signature.getInstance("Dilithium", "BC"));
          arrayList.add(Signature.getInstance("SHA512withRSA", "BC"));
          this.digest = DigestFactory.createSHA512();
          break;
        case MLDSA44_ECDSA_P256_SHA256:
        case MLDSA44_ECDSA_brainpoolP256r1_SHA256:
          arrayList.add(Signature.getInstance("Dilithium", "BC"));
          arrayList.add(Signature.getInstance("SHA256withECDSA", "BC"));
          this.digest = DigestFactory.createSHA256();
          break;
        case MLDSA65_ECDSA_P256_SHA512:
        case MLDSA65_ECDSA_brainpoolP256r1_SHA512:
        case MLDSA87_ECDSA_P384_SHA512:
        case MLDSA87_ECDSA_brainpoolP384r1_SHA512:
          arrayList.add(Signature.getInstance("Dilithium", "BC"));
          arrayList.add(Signature.getInstance("SHA512withECDSA", "BC"));
          this.digest = DigestFactory.createSHA512();
          break;
        case Falcon512_ECDSA_P256_SHA256:
        case Falcon512_ECDSA_brainpoolP256r1_SHA256:
          arrayList.add(Signature.getInstance("Falcon", "BC"));
          arrayList.add(Signature.getInstance("SHA256withECDSA", "BC"));
          this.digest = DigestFactory.createSHA256();
          break;
        case Falcon512_Ed25519_SHA512:
          arrayList.add(Signature.getInstance("Falcon", "BC"));
          arrayList.add(Signature.getInstance("Ed25519", "BC"));
          this.digest = DigestFactory.createSHA512();
          break;
        default:
          throw new IllegalArgumentException("unknown composite algorithm");
      } 
      this.OIDBytes = this.algorithmIdentifierASN1.getEncoded("DER");
    } catch (GeneralSecurityException generalSecurityException) {
      throw Exceptions.illegalStateException(generalSecurityException.getMessage(), generalSecurityException);
    } catch (IOException iOException) {
      throw Exceptions.illegalStateException(iOException.getMessage(), iOException);
    } 
    this.componentSignatures = Collections.unmodifiableList(arrayList);
  }
  
  protected void engineInitVerify(PublicKey paramPublicKey) throws InvalidKeyException {
    if (!(paramPublicKey instanceof CompositePublicKey))
      throw new InvalidKeyException("Public key is not composite."); 
    CompositePublicKey compositePublicKey = (CompositePublicKey)paramPublicKey;
    if (!compositePublicKey.getAlgorithmIdentifier().equals((ASN1Primitive)this.algorithmIdentifierASN1))
      throw new InvalidKeyException("Provided composite public key cannot be used with the composite signature algorithm."); 
    for (byte b = 0; b < this.componentSignatures.size(); b++)
      ((Signature)this.componentSignatures.get(b)).initVerify(compositePublicKey.getPublicKeys().get(b)); 
  }
  
  protected void engineInitSign(PrivateKey paramPrivateKey) throws InvalidKeyException {
    if (!(paramPrivateKey instanceof CompositePrivateKey))
      throw new InvalidKeyException("Private key is not composite."); 
    CompositePrivateKey compositePrivateKey = (CompositePrivateKey)paramPrivateKey;
    if (!compositePrivateKey.getAlgorithmIdentifier().equals((ASN1Primitive)this.algorithmIdentifierASN1))
      throw new InvalidKeyException("Provided composite private key cannot be used with the composite signature algorithm."); 
    for (byte b = 0; b < this.componentSignatures.size(); b++)
      ((Signature)this.componentSignatures.get(b)).initSign(compositePrivateKey.getPrivateKeys().get(b)); 
  }
  
  protected void engineUpdate(byte paramByte) throws SignatureException {
    this.digest.update(paramByte);
  }
  
  protected void engineUpdate(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws SignatureException {
    this.digest.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  protected byte[] engineSign() throws SignatureException {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    try {
      byte[] arrayOfByte = new byte[this.digest.getDigestSize()];
      this.digest.doFinal(arrayOfByte, 0);
      for (byte b = 0; b < this.componentSignatures.size(); b++) {
        ((Signature)this.componentSignatures.get(b)).update(this.OIDBytes);
        ((Signature)this.componentSignatures.get(b)).update(arrayOfByte);
        byte[] arrayOfByte1 = ((Signature)this.componentSignatures.get(b)).sign();
        aSN1EncodableVector.add((ASN1Encodable)new DERBitString(arrayOfByte1));
      } 
      return (new DERSequence(aSN1EncodableVector)).getEncoded("DER");
    } catch (IOException iOException) {
      throw new SignatureException(iOException.getMessage());
    } 
  }
  
  protected boolean engineVerify(byte[] paramArrayOfbyte) throws SignatureException {
    ASN1Sequence aSN1Sequence = DERSequence.getInstance(paramArrayOfbyte);
    if (aSN1Sequence.size() != this.componentSignatures.size())
      return false; 
    byte[] arrayOfByte = new byte[this.digest.getDigestSize()];
    this.digest.doFinal(arrayOfByte, 0);
    boolean bool = false;
    for (byte b = 0; b < this.componentSignatures.size(); b++) {
      ((Signature)this.componentSignatures.get(b)).update(this.OIDBytes);
      ((Signature)this.componentSignatures.get(b)).update(arrayOfByte);
      if (!((Signature)this.componentSignatures.get(b)).verify(ASN1BitString.getInstance(aSN1Sequence.getObjectAt(b)).getOctets()))
        bool = true; 
    } 
    return !bool;
  }
  
  protected void engineSetParameter(String paramString, Object paramObject) throws InvalidParameterException {
    throw new UnsupportedOperationException("engineSetParameter unsupported");
  }
  
  protected Object engineGetParameter(String paramString) throws InvalidParameterException {
    throw new UnsupportedOperationException("engineGetParameter unsupported");
  }
  
  protected AlgorithmParameters engineGetParameters() {
    return null;
  }
  
  public static final class Falcon512_ECDSA_P256_SHA256 extends SignatureSpi {
    public Falcon512_ECDSA_P256_SHA256() {
      super(CompositeSignaturesConstants.CompositeName.Falcon512_ECDSA_P256_SHA256);
    }
  }
  
  public static final class Falcon512_ECDSA_brainpoolP256r1_SHA256 extends SignatureSpi {
    public Falcon512_ECDSA_brainpoolP256r1_SHA256() {
      super(CompositeSignaturesConstants.CompositeName.Falcon512_ECDSA_brainpoolP256r1_SHA256);
    }
  }
  
  public static final class Falcon512_Ed25519_SHA512 extends SignatureSpi {
    public Falcon512_Ed25519_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.Falcon512_Ed25519_SHA512);
    }
  }
  
  public static final class MLDSA44_ECDSA_P256_SHA256 extends SignatureSpi {
    public MLDSA44_ECDSA_P256_SHA256() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA44_ECDSA_P256_SHA256);
    }
  }
  
  public static final class MLDSA44_ECDSA_brainpoolP256r1_SHA256 extends SignatureSpi {
    public MLDSA44_ECDSA_brainpoolP256r1_SHA256() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA44_ECDSA_brainpoolP256r1_SHA256);
    }
  }
  
  public static final class MLDSA44_Ed25519_SHA512 extends SignatureSpi {
    public MLDSA44_Ed25519_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA44_Ed25519_SHA512);
    }
  }
  
  public static final class MLDSA44_RSA2048_PKCS15_SHA256 extends SignatureSpi {
    public MLDSA44_RSA2048_PKCS15_SHA256() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA44_RSA2048_PKCS15_SHA256);
    }
  }
  
  public static final class MLDSA44_RSA2048_PSS_SHA256 extends SignatureSpi {
    public MLDSA44_RSA2048_PSS_SHA256() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA44_RSA2048_PSS_SHA256);
    }
  }
  
  public static final class MLDSA65_ECDSA_P256_SHA512 extends SignatureSpi {
    public MLDSA65_ECDSA_P256_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA65_ECDSA_P256_SHA512);
    }
  }
  
  public static final class MLDSA65_ECDSA_brainpoolP256r1_SHA512 extends SignatureSpi {
    public MLDSA65_ECDSA_brainpoolP256r1_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA65_ECDSA_brainpoolP256r1_SHA512);
    }
  }
  
  public static final class MLDSA65_Ed25519_SHA512 extends SignatureSpi {
    public MLDSA65_Ed25519_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA65_Ed25519_SHA512);
    }
  }
  
  public static final class MLDSA65_RSA3072_PKCS15_SHA512 extends SignatureSpi {
    public MLDSA65_RSA3072_PKCS15_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA65_RSA3072_PKCS15_SHA512);
    }
  }
  
  public static final class MLDSA65_RSA3072_PSS_SHA512 extends SignatureSpi {
    public MLDSA65_RSA3072_PSS_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA65_RSA3072_PSS_SHA512);
    }
  }
  
  public static final class MLDSA87_ECDSA_P384_SHA512 extends SignatureSpi {
    public MLDSA87_ECDSA_P384_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA87_ECDSA_P384_SHA512);
    }
  }
  
  public static final class MLDSA87_ECDSA_brainpoolP384r1_SHA512 extends SignatureSpi {
    public MLDSA87_ECDSA_brainpoolP384r1_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA87_ECDSA_brainpoolP384r1_SHA512);
    }
  }
  
  public static final class MLDSA87_Ed448_SHA512 extends SignatureSpi {
    public MLDSA87_Ed448_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA87_Ed448_SHA512);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\compositesignatures\SignatureSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */