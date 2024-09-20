package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyPairGeneratorSpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.FalconParameterSpec;

public class KeyPairGeneratorSpi extends KeyPairGeneratorSpi {
  private final CompositeSignaturesConstants.CompositeName algorithmIdentifier;
  
  private final ASN1ObjectIdentifier algorithmIdentifierASN1;
  
  private List<KeyPairGenerator> generators;
  
  private SecureRandom secureRandom;
  
  private boolean parametersInitialized = false;
  
  KeyPairGeneratorSpi(CompositeSignaturesConstants.CompositeName paramCompositeName) {
    this.algorithmIdentifier = paramCompositeName;
    this.algorithmIdentifierASN1 = CompositeSignaturesConstants.compositeNameASN1IdentifierMap.get(this.algorithmIdentifier);
  }
  
  private void initializeParameters() {
    if (this.secureRandom == null)
      this.secureRandom = new SecureRandom(); 
    ArrayList<KeyPairGenerator> arrayList = new ArrayList();
    try {
      switch (this.algorithmIdentifier) {
        case MLDSA44_Ed25519_SHA512:
          arrayList.add(KeyPairGenerator.getInstance("Dilithium", "BC"));
          arrayList.add(KeyPairGenerator.getInstance("Ed25519", "BC"));
          ((KeyPairGenerator)arrayList.get(0)).initialize((AlgorithmParameterSpec)DilithiumParameterSpec.dilithium2, this.secureRandom);
          ((KeyPairGenerator)arrayList.get(1)).initialize(256, this.secureRandom);
          break;
        case MLDSA65_Ed25519_SHA512:
          arrayList.add(KeyPairGenerator.getInstance("Dilithium", "BC"));
          arrayList.add(KeyPairGenerator.getInstance("Ed25519", "BC"));
          ((KeyPairGenerator)arrayList.get(0)).initialize((AlgorithmParameterSpec)DilithiumParameterSpec.dilithium3, this.secureRandom);
          ((KeyPairGenerator)arrayList.get(1)).initialize(256, this.secureRandom);
          break;
        case MLDSA87_Ed448_SHA512:
          arrayList.add(KeyPairGenerator.getInstance("Dilithium", "BC"));
          arrayList.add(KeyPairGenerator.getInstance("Ed448", "BC"));
          ((KeyPairGenerator)arrayList.get(0)).initialize((AlgorithmParameterSpec)DilithiumParameterSpec.dilithium5, this.secureRandom);
          ((KeyPairGenerator)arrayList.get(1)).initialize(448, this.secureRandom);
          break;
        case MLDSA44_RSA2048_PSS_SHA256:
        case MLDSA44_RSA2048_PKCS15_SHA256:
          arrayList.add(KeyPairGenerator.getInstance("Dilithium", "BC"));
          arrayList.add(KeyPairGenerator.getInstance("RSA", "BC"));
          ((KeyPairGenerator)arrayList.get(0)).initialize((AlgorithmParameterSpec)DilithiumParameterSpec.dilithium2, this.secureRandom);
          ((KeyPairGenerator)arrayList.get(1)).initialize(2048, this.secureRandom);
          break;
        case MLDSA65_RSA3072_PSS_SHA512:
        case MLDSA65_RSA3072_PKCS15_SHA512:
          arrayList.add(KeyPairGenerator.getInstance("Dilithium", "BC"));
          arrayList.add(KeyPairGenerator.getInstance("RSA", "BC"));
          ((KeyPairGenerator)arrayList.get(0)).initialize((AlgorithmParameterSpec)DilithiumParameterSpec.dilithium3, this.secureRandom);
          ((KeyPairGenerator)arrayList.get(1)).initialize(3072, this.secureRandom);
          break;
        case MLDSA44_ECDSA_P256_SHA256:
          arrayList.add(KeyPairGenerator.getInstance("Dilithium", "BC"));
          arrayList.add(KeyPairGenerator.getInstance("ECDSA", "BC"));
          ((KeyPairGenerator)arrayList.get(0)).initialize((AlgorithmParameterSpec)DilithiumParameterSpec.dilithium2, this.secureRandom);
          ((KeyPairGenerator)arrayList.get(1)).initialize(new ECGenParameterSpec("P-256"), this.secureRandom);
          break;
        case MLDSA44_ECDSA_brainpoolP256r1_SHA256:
          arrayList.add(KeyPairGenerator.getInstance("Dilithium", "BC"));
          arrayList.add(KeyPairGenerator.getInstance("ECDSA", "BC"));
          ((KeyPairGenerator)arrayList.get(0)).initialize((AlgorithmParameterSpec)DilithiumParameterSpec.dilithium2, this.secureRandom);
          ((KeyPairGenerator)arrayList.get(1)).initialize(new ECGenParameterSpec("brainpoolP256r1"), this.secureRandom);
          break;
        case MLDSA65_ECDSA_P256_SHA512:
          arrayList.add(KeyPairGenerator.getInstance("Dilithium", "BC"));
          arrayList.add(KeyPairGenerator.getInstance("ECDSA", "BC"));
          ((KeyPairGenerator)arrayList.get(0)).initialize((AlgorithmParameterSpec)DilithiumParameterSpec.dilithium3, this.secureRandom);
          ((KeyPairGenerator)arrayList.get(1)).initialize(new ECGenParameterSpec("P-256"), this.secureRandom);
          break;
        case MLDSA65_ECDSA_brainpoolP256r1_SHA512:
          arrayList.add(KeyPairGenerator.getInstance("Dilithium", "BC"));
          arrayList.add(KeyPairGenerator.getInstance("ECDSA", "BC"));
          ((KeyPairGenerator)arrayList.get(0)).initialize((AlgorithmParameterSpec)DilithiumParameterSpec.dilithium3, this.secureRandom);
          ((KeyPairGenerator)arrayList.get(1)).initialize(new ECGenParameterSpec("brainpoolP256r1"), this.secureRandom);
          break;
        case MLDSA87_ECDSA_P384_SHA512:
          arrayList.add(KeyPairGenerator.getInstance("Dilithium", "BC"));
          arrayList.add(KeyPairGenerator.getInstance("ECDSA", "BC"));
          ((KeyPairGenerator)arrayList.get(0)).initialize((AlgorithmParameterSpec)DilithiumParameterSpec.dilithium5, this.secureRandom);
          ((KeyPairGenerator)arrayList.get(1)).initialize(new ECGenParameterSpec("P-384"), this.secureRandom);
          break;
        case MLDSA87_ECDSA_brainpoolP384r1_SHA512:
          arrayList.add(KeyPairGenerator.getInstance("Dilithium", "BC"));
          arrayList.add(KeyPairGenerator.getInstance("ECDSA", "BC"));
          ((KeyPairGenerator)arrayList.get(0)).initialize((AlgorithmParameterSpec)DilithiumParameterSpec.dilithium5, this.secureRandom);
          ((KeyPairGenerator)arrayList.get(1)).initialize(new ECGenParameterSpec("brainpoolP384r1"), this.secureRandom);
          break;
        case Falcon512_ECDSA_P256_SHA256:
          arrayList.add(KeyPairGenerator.getInstance("Falcon", "BC"));
          arrayList.add(KeyPairGenerator.getInstance("ECDSA", "BC"));
          ((KeyPairGenerator)arrayList.get(0)).initialize((AlgorithmParameterSpec)FalconParameterSpec.falcon_512, this.secureRandom);
          ((KeyPairGenerator)arrayList.get(1)).initialize(new ECGenParameterSpec("P-256"), this.secureRandom);
          break;
        case Falcon512_ECDSA_brainpoolP256r1_SHA256:
          arrayList.add(KeyPairGenerator.getInstance("Falcon", "BC"));
          arrayList.add(KeyPairGenerator.getInstance("ECDSA", "BC"));
          ((KeyPairGenerator)arrayList.get(0)).initialize((AlgorithmParameterSpec)FalconParameterSpec.falcon_512, this.secureRandom);
          ((KeyPairGenerator)arrayList.get(1)).initialize(new ECGenParameterSpec("brainpoolP256r1"), this.secureRandom);
          break;
        case Falcon512_Ed25519_SHA512:
          arrayList.add(KeyPairGenerator.getInstance("Falcon", "BC"));
          arrayList.add(KeyPairGenerator.getInstance("Ed25519", "BC"));
          ((KeyPairGenerator)arrayList.get(0)).initialize((AlgorithmParameterSpec)FalconParameterSpec.falcon_512, this.secureRandom);
          ((KeyPairGenerator)arrayList.get(1)).initialize(256, this.secureRandom);
          break;
        default:
          throw new IllegalStateException("Generators not correctly initialized. Unsupported composite algorithm.");
      } 
    } catch (GeneralSecurityException generalSecurityException) {
      throw new RuntimeException(generalSecurityException);
    } 
    this.generators = Collections.unmodifiableList(arrayList);
    this.parametersInitialized = true;
  }
  
  public void initialize(int paramInt, SecureRandom paramSecureRandom) {
    throw new IllegalArgumentException("use AlgorithmParameterSpec");
  }
  
  public void initialize(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException {
    if (paramAlgorithmParameterSpec != null)
      throw new IllegalArgumentException("Use initialize only for custom SecureRandom. AlgorithmParameterSpec must be null because it is determined by algorithm name."); 
    this.secureRandom = paramSecureRandom;
    initializeParameters();
  }
  
  public KeyPair generateKeyPair() {
    if (!this.parametersInitialized)
      initializeParameters(); 
    return getCompositeKeyPair();
  }
  
  private KeyPair getCompositeKeyPair() {
    PublicKey[] arrayOfPublicKey = new PublicKey[this.generators.size()];
    PrivateKey[] arrayOfPrivateKey = new PrivateKey[this.generators.size()];
    for (byte b = 0; b < this.generators.size(); b++) {
      KeyPair keyPair = ((KeyPairGenerator)this.generators.get(b)).generateKeyPair();
      arrayOfPublicKey[b] = keyPair.getPublic();
      arrayOfPrivateKey[b] = keyPair.getPrivate();
    } 
    CompositePublicKey compositePublicKey = new CompositePublicKey(this.algorithmIdentifierASN1, arrayOfPublicKey);
    CompositePrivateKey compositePrivateKey = new CompositePrivateKey(this.algorithmIdentifierASN1, arrayOfPrivateKey);
    return new KeyPair((PublicKey)compositePublicKey, (PrivateKey)compositePrivateKey);
  }
  
  public static final class Falcon512_ECDSA_P256_SHA256 extends KeyPairGeneratorSpi {
    public Falcon512_ECDSA_P256_SHA256() {
      super(CompositeSignaturesConstants.CompositeName.Falcon512_ECDSA_P256_SHA256);
    }
  }
  
  public static final class Falcon512_ECDSA_brainpoolP256r1_SHA256 extends KeyPairGeneratorSpi {
    public Falcon512_ECDSA_brainpoolP256r1_SHA256() {
      super(CompositeSignaturesConstants.CompositeName.Falcon512_ECDSA_brainpoolP256r1_SHA256);
    }
  }
  
  public static final class Falcon512_Ed25519_SHA512 extends KeyPairGeneratorSpi {
    public Falcon512_Ed25519_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.Falcon512_Ed25519_SHA512);
    }
  }
  
  public static final class MLDSA44_ECDSA_P256_SHA256 extends KeyPairGeneratorSpi {
    public MLDSA44_ECDSA_P256_SHA256() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA44_ECDSA_P256_SHA256);
    }
  }
  
  public static final class MLDSA44_ECDSA_brainpoolP256r1_SHA256 extends KeyPairGeneratorSpi {
    public MLDSA44_ECDSA_brainpoolP256r1_SHA256() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA44_ECDSA_brainpoolP256r1_SHA256);
    }
  }
  
  public static final class MLDSA44_Ed25519_SHA512 extends KeyPairGeneratorSpi {
    public MLDSA44_Ed25519_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA44_Ed25519_SHA512);
    }
  }
  
  public static final class MLDSA44_RSA2048_PKCS15_SHA256 extends KeyPairGeneratorSpi {
    public MLDSA44_RSA2048_PKCS15_SHA256() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA44_RSA2048_PKCS15_SHA256);
    }
  }
  
  public static final class MLDSA44_RSA2048_PSS_SHA256 extends KeyPairGeneratorSpi {
    public MLDSA44_RSA2048_PSS_SHA256() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA44_RSA2048_PSS_SHA256);
    }
  }
  
  public static final class MLDSA65_ECDSA_P256_SHA512 extends KeyPairGeneratorSpi {
    public MLDSA65_ECDSA_P256_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA65_ECDSA_P256_SHA512);
    }
  }
  
  public static final class MLDSA65_ECDSA_brainpoolP256r1_SHA512 extends KeyPairGeneratorSpi {
    public MLDSA65_ECDSA_brainpoolP256r1_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA65_ECDSA_brainpoolP256r1_SHA512);
    }
  }
  
  public static final class MLDSA65_Ed25519_SHA512 extends KeyPairGeneratorSpi {
    public MLDSA65_Ed25519_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA65_Ed25519_SHA512);
    }
  }
  
  public static final class MLDSA65_RSA3072_PKCS15_SHA512 extends KeyPairGeneratorSpi {
    public MLDSA65_RSA3072_PKCS15_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA65_RSA3072_PKCS15_SHA512);
    }
  }
  
  public static final class MLDSA65_RSA3072_PSS_SHA512 extends KeyPairGeneratorSpi {
    public MLDSA65_RSA3072_PSS_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA65_RSA3072_PSS_SHA512);
    }
  }
  
  public static final class MLDSA87_ECDSA_P384_SHA512 extends KeyPairGeneratorSpi {
    public MLDSA87_ECDSA_P384_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA87_ECDSA_P384_SHA512);
    }
  }
  
  public static final class MLDSA87_ECDSA_brainpoolP384r1_SHA512 extends KeyPairGeneratorSpi {
    public MLDSA87_ECDSA_brainpoolP384r1_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA87_ECDSA_brainpoolP384r1_SHA512);
    }
  }
  
  public static final class MLDSA87_Ed448_SHA512 extends KeyPairGeneratorSpi {
    public MLDSA87_Ed448_SHA512() {
      super(CompositeSignaturesConstants.CompositeName.MLDSA87_Ed448_SHA512);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\compositesignatures\KeyPairGeneratorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */