package org.bouncycastle.pqc.jcajce.provider.dilithium;

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

public class DilithiumKeyFactorySpi extends BaseKeyFactorySpi {
  private static final Set<ASN1ObjectIdentifier> keyOids = new HashSet<>();
  
  public DilithiumKeyFactorySpi() {
    super(keyOids);
  }
  
  public DilithiumKeyFactorySpi(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    super(paramASN1ObjectIdentifier);
  }
  
  public final KeySpec engineGetKeySpec(Key paramKey, Class<?> paramClass) throws InvalidKeySpecException {
    if (paramKey instanceof BCDilithiumPrivateKey) {
      if (PKCS8EncodedKeySpec.class.isAssignableFrom(paramClass))
        return new PKCS8EncodedKeySpec(paramKey.getEncoded()); 
    } else if (paramKey instanceof BCDilithiumPublicKey) {
      if (X509EncodedKeySpec.class.isAssignableFrom(paramClass))
        return new X509EncodedKeySpec(paramKey.getEncoded()); 
    } else {
      throw new InvalidKeySpecException("Unsupported key type: " + paramKey.getClass() + ".");
    } 
    throw new InvalidKeySpecException("Unknown key specification: " + paramClass + ".");
  }
  
  public final Key engineTranslateKey(Key paramKey) throws InvalidKeyException {
    if (paramKey instanceof BCDilithiumPrivateKey || paramKey instanceof BCDilithiumPublicKey)
      return paramKey; 
    throw new InvalidKeyException("Unsupported key type");
  }
  
  public PrivateKey generatePrivate(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    return (PrivateKey)new BCDilithiumPrivateKey(paramPrivateKeyInfo);
  }
  
  public PublicKey generatePublic(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) throws IOException {
    return (PublicKey)new BCDilithiumPublicKey(paramSubjectPublicKeyInfo);
  }
  
  static {
    keyOids.add(BCObjectIdentifiers.dilithium2);
    keyOids.add(BCObjectIdentifiers.dilithium3);
    keyOids.add(BCObjectIdentifiers.dilithium5);
    keyOids.add(BCObjectIdentifiers.dilithium2_aes);
    keyOids.add(BCObjectIdentifiers.dilithium3_aes);
    keyOids.add(BCObjectIdentifiers.dilithium5_aes);
  }
  
  public static class Base2 extends DilithiumKeyFactorySpi {
    public Base2() {
      super(BCObjectIdentifiers.dilithium2);
    }
  }
  
  public static class Base2_AES extends DilithiumKeyFactorySpi {
    public Base2_AES() {
      super(BCObjectIdentifiers.dilithium2_aes);
    }
  }
  
  public static class Base3 extends DilithiumKeyFactorySpi {
    public Base3() {
      super(BCObjectIdentifiers.dilithium3);
    }
  }
  
  public static class Base3_AES extends DilithiumKeyFactorySpi {
    public Base3_AES() {
      super(BCObjectIdentifiers.dilithium3_aes);
    }
  }
  
  public static class Base5 extends DilithiumKeyFactorySpi {
    public Base5() {
      super(BCObjectIdentifiers.dilithium5);
    }
  }
  
  public static class Base5_AES extends DilithiumKeyFactorySpi {
    public Base5_AES() {
      super(BCObjectIdentifiers.dilithium5_aes);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\dilithium\DilithiumKeyFactorySpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */