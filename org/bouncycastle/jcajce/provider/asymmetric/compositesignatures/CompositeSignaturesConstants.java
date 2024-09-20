package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;

public abstract class CompositeSignaturesConstants {
  public static final ASN1ObjectIdentifier[] supportedIdentifiers = new ASN1ObjectIdentifier[] { 
      MiscObjectIdentifiers.id_MLDSA44_RSA2048_PSS_SHA256, MiscObjectIdentifiers.id_MLDSA44_RSA2048_PKCS15_SHA256, MiscObjectIdentifiers.id_MLDSA44_Ed25519_SHA512, MiscObjectIdentifiers.id_MLDSA44_ECDSA_P256_SHA256, MiscObjectIdentifiers.id_MLDSA44_ECDSA_brainpoolP256r1_SHA256, MiscObjectIdentifiers.id_MLDSA65_RSA3072_PSS_SHA512, MiscObjectIdentifiers.id_MLDSA65_RSA3072_PKCS15_SHA512, MiscObjectIdentifiers.id_MLDSA65_ECDSA_P256_SHA512, MiscObjectIdentifiers.id_MLDSA65_ECDSA_brainpoolP256r1_SHA512, MiscObjectIdentifiers.id_MLDSA65_Ed25519_SHA512, 
      MiscObjectIdentifiers.id_MLDSA87_ECDSA_P384_SHA512, MiscObjectIdentifiers.id_MLDSA87_ECDSA_brainpoolP384r1_SHA512, MiscObjectIdentifiers.id_MLDSA87_Ed448_SHA512, MiscObjectIdentifiers.id_Falcon512_ECDSA_P256_SHA256, MiscObjectIdentifiers.id_Falcon512_ECDSA_brainpoolP256r1_SHA256, MiscObjectIdentifiers.id_Falcon512_Ed25519_SHA512 };
  
  public static final HashMap<CompositeName, ASN1ObjectIdentifier> compositeNameASN1IdentifierMap = new HashMap<>();
  
  public static final HashMap<ASN1ObjectIdentifier, CompositeName> ASN1IdentifierCompositeNameMap = new HashMap<>();
  
  public static final HashMap<ASN1ObjectIdentifier, CompositeName> ASN1IdentifierAlgorithmNameMap = new HashMap<>();
  
  static {
    for (ASN1ObjectIdentifier aSN1ObjectIdentifier : supportedIdentifiers) {
      CompositeName compositeName = ASN1IdentifierCompositeNameMap.get(aSN1ObjectIdentifier);
      ASN1IdentifierAlgorithmNameMap.put(aSN1ObjectIdentifier, compositeName);
    } 
  }
  
  static {
    compositeNameASN1IdentifierMap.put(CompositeName.MLDSA44_RSA2048_PSS_SHA256, MiscObjectIdentifiers.id_MLDSA44_RSA2048_PSS_SHA256);
    compositeNameASN1IdentifierMap.put(CompositeName.MLDSA44_RSA2048_PKCS15_SHA256, MiscObjectIdentifiers.id_MLDSA44_RSA2048_PKCS15_SHA256);
    compositeNameASN1IdentifierMap.put(CompositeName.MLDSA44_ECDSA_P256_SHA256, MiscObjectIdentifiers.id_MLDSA44_ECDSA_P256_SHA256);
    compositeNameASN1IdentifierMap.put(CompositeName.MLDSA44_ECDSA_brainpoolP256r1_SHA256, MiscObjectIdentifiers.id_MLDSA44_ECDSA_brainpoolP256r1_SHA256);
    compositeNameASN1IdentifierMap.put(CompositeName.MLDSA44_Ed25519_SHA512, MiscObjectIdentifiers.id_MLDSA44_Ed25519_SHA512);
    compositeNameASN1IdentifierMap.put(CompositeName.MLDSA65_RSA3072_PSS_SHA512, MiscObjectIdentifiers.id_MLDSA65_RSA3072_PSS_SHA512);
    compositeNameASN1IdentifierMap.put(CompositeName.MLDSA65_RSA3072_PKCS15_SHA512, MiscObjectIdentifiers.id_MLDSA65_RSA3072_PKCS15_SHA512);
    compositeNameASN1IdentifierMap.put(CompositeName.MLDSA65_ECDSA_P256_SHA512, MiscObjectIdentifiers.id_MLDSA65_ECDSA_P256_SHA512);
    compositeNameASN1IdentifierMap.put(CompositeName.MLDSA65_ECDSA_brainpoolP256r1_SHA512, MiscObjectIdentifiers.id_MLDSA65_ECDSA_brainpoolP256r1_SHA512);
    compositeNameASN1IdentifierMap.put(CompositeName.MLDSA65_Ed25519_SHA512, MiscObjectIdentifiers.id_MLDSA65_Ed25519_SHA512);
    compositeNameASN1IdentifierMap.put(CompositeName.MLDSA87_ECDSA_P384_SHA512, MiscObjectIdentifiers.id_MLDSA87_ECDSA_P384_SHA512);
    compositeNameASN1IdentifierMap.put(CompositeName.MLDSA87_ECDSA_brainpoolP384r1_SHA512, MiscObjectIdentifiers.id_MLDSA87_ECDSA_brainpoolP384r1_SHA512);
    compositeNameASN1IdentifierMap.put(CompositeName.MLDSA87_Ed448_SHA512, MiscObjectIdentifiers.id_MLDSA87_Ed448_SHA512);
    compositeNameASN1IdentifierMap.put(CompositeName.Falcon512_ECDSA_P256_SHA256, MiscObjectIdentifiers.id_Falcon512_ECDSA_P256_SHA256);
    compositeNameASN1IdentifierMap.put(CompositeName.Falcon512_ECDSA_brainpoolP256r1_SHA256, MiscObjectIdentifiers.id_Falcon512_ECDSA_brainpoolP256r1_SHA256);
    compositeNameASN1IdentifierMap.put(CompositeName.Falcon512_Ed25519_SHA512, MiscObjectIdentifiers.id_Falcon512_Ed25519_SHA512);
  }
  
  static {
    for (Map.Entry<CompositeName, ASN1ObjectIdentifier> entry : compositeNameASN1IdentifierMap.entrySet())
      ASN1IdentifierCompositeNameMap.put((ASN1ObjectIdentifier)entry.getValue(), (CompositeName)entry.getKey()); 
  }
  
  public enum CompositeName {
    MLDSA44_RSA2048_PSS_SHA256("MLDSA44-RSA2048-PSS-SHA256"),
    MLDSA44_RSA2048_PKCS15_SHA256("MLDSA44-RSA2048-PKCS15-SHA256"),
    MLDSA44_Ed25519_SHA512("MLDSA44-Ed25519-SHA512"),
    MLDSA44_ECDSA_P256_SHA256("MLDSA44-ECDSA-P256-SHA256"),
    MLDSA44_ECDSA_brainpoolP256r1_SHA256("MLDSA44-ECDSA-brainpoolP256r1-SHA256"),
    MLDSA65_RSA3072_PSS_SHA512("MLDSA65-RSA3072-PSS-SHA512"),
    MLDSA65_RSA3072_PKCS15_SHA512("MLDSA65-RSA3072-PKCS15-SHA512"),
    MLDSA65_ECDSA_brainpoolP256r1_SHA512("MLDSA65-ECDSA-brainpoolP256r1-SHA512"),
    MLDSA65_ECDSA_P256_SHA512("MLDSA65-ECDSA-P256-SHA512"),
    MLDSA65_Ed25519_SHA512("MLDSA65-Ed25519-SHA512"),
    MLDSA87_ECDSA_P384_SHA512("MLDSA87-ECDSA-P384-SHA512"),
    MLDSA87_ECDSA_brainpoolP384r1_SHA512("MLDSA87-ECDSA-brainpoolP384r1-SHA512"),
    MLDSA87_Ed448_SHA512("MLDSA87-Ed448-SHA512"),
    Falcon512_ECDSA_P256_SHA256("Falcon512-ECDSA-P256-SHA256"),
    Falcon512_ECDSA_brainpoolP256r1_SHA256("Falcon512-ECDSA-brainpoolP256r1-SHA256"),
    Falcon512_Ed25519_SHA512("Falcon512-Ed25519-SHA512");
    
    private final String id;
    
    CompositeName(String param1String1) {
      this.id = param1String1;
    }
    
    public String getId() {
      return this.id;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\compositesignatures\CompositeSignaturesConstants.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */