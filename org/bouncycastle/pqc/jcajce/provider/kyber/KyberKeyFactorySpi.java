package org.bouncycastle.pqc.jcajce.provider.kyber;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.jcajce.provider.util.BaseKeyFactorySpi;

public class KyberKeyFactorySpi extends BaseKeyFactorySpi {
  private static final Set<ASN1ObjectIdentifier> keyOids = new HashSet<>();
  
  public KyberKeyFactorySpi() {
    super(keyOids);
  }
  
  public KyberKeyFactorySpi(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    super(paramASN1ObjectIdentifier);
  }
  
  public final KeySpec engineGetKeySpec(Key paramKey, Class<?> paramClass) throws InvalidKeySpecException {
    if (paramKey instanceof BCKyberPrivateKey) {
      if (PKCS8EncodedKeySpec.class.isAssignableFrom(paramClass))
        return new PKCS8EncodedKeySpec(paramKey.getEncoded()); 
    } else if (paramKey instanceof BCKyberPublicKey) {
      if (X509EncodedKeySpec.class.isAssignableFrom(paramClass))
        return new X509EncodedKeySpec(paramKey.getEncoded()); 
    } else {
      throw new InvalidKeySpecException("Unsupported key type: " + paramKey.getClass() + ".");
    } 
    throw new InvalidKeySpecException("Unknown key specification: " + paramClass + ".");
  }
  
  public final Key engineTranslateKey(Key paramKey) throws InvalidKeyException {
    if (paramKey instanceof BCKyberPrivateKey || paramKey instanceof BCKyberPublicKey)
      return paramKey; 
    throw new InvalidKeyException("Unsupported key type");
  }
  
  public PrivateKey generatePrivate(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    return (PrivateKey)new BCKyberPrivateKey(paramPrivateKeyInfo);
  }
  
  public PublicKey generatePublic(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) throws IOException {
    return (PublicKey)new BCKyberPublicKey(paramSubjectPublicKeyInfo);
  }
  
  static {
    keyOids.add(BCObjectIdentifiers.kyber512);
    keyOids.add(BCObjectIdentifiers.kyber768);
    keyOids.add(BCObjectIdentifiers.kyber1024);
    keyOids.add(BCObjectIdentifiers.kyber512_aes);
    keyOids.add(BCObjectIdentifiers.kyber768_aes);
    keyOids.add(BCObjectIdentifiers.kyber1024_aes);
  }
  
  public static class Kyber1024 extends KyberKeyFactorySpi {
    public Kyber1024() {
      super(BCObjectIdentifiers.kyber1024);
    }
  }
  
  public static class Kyber1024_AES extends KyberKeyFactorySpi {
    public Kyber1024_AES() {
      super(BCObjectIdentifiers.kyber1024_aes);
    }
  }
  
  public static class Kyber512 extends KyberKeyFactorySpi {
    public Kyber512() {
      super(BCObjectIdentifiers.kyber512);
    }
  }
  
  public static class Kyber512_AES extends KyberKeyFactorySpi {
    public Kyber512_AES() {
      super(BCObjectIdentifiers.kyber512_aes);
    }
  }
  
  public static class Kyber768 extends KyberKeyFactorySpi {
    public Kyber768() {
      super(BCObjectIdentifiers.kyber768);
    }
  }
  
  public static class Kyber768_AES extends KyberKeyFactorySpi {
    public Kyber768_AES() {
      super(BCObjectIdentifiers.kyber768_aes);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\kyber\KyberKeyFactorySpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */