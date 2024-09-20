package org.bouncycastle.pqc.jcajce.provider.util;

import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

public abstract class BaseKeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
  private final Set<ASN1ObjectIdentifier> keyOids;
  
  private final ASN1ObjectIdentifier keyOid = null;
  
  protected BaseKeyFactorySpi(Set<ASN1ObjectIdentifier> paramSet) {
    this.keyOids = paramSet;
  }
  
  protected BaseKeyFactorySpi(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this.keyOids = null;
  }
  
  public PrivateKey engineGeneratePrivate(KeySpec paramKeySpec) throws InvalidKeySpecException {
    if (paramKeySpec instanceof PKCS8EncodedKeySpec) {
      byte[] arrayOfByte = ((PKCS8EncodedKeySpec)paramKeySpec).getEncoded();
      try {
        PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(arrayOfByte);
        checkAlgorithm(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
        return generatePrivate(privateKeyInfo);
      } catch (Exception exception) {
        throw new InvalidKeySpecException(exception.toString());
      } 
    } 
    throw new InvalidKeySpecException("Unsupported key specification: " + paramKeySpec.getClass() + ".");
  }
  
  public PublicKey engineGeneratePublic(KeySpec paramKeySpec) throws InvalidKeySpecException {
    if (paramKeySpec instanceof X509EncodedKeySpec) {
      byte[] arrayOfByte = ((X509EncodedKeySpec)paramKeySpec).getEncoded();
      try {
        SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(arrayOfByte);
        checkAlgorithm(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        return generatePublic(subjectPublicKeyInfo);
      } catch (Exception exception) {
        throw new InvalidKeySpecException(exception.toString());
      } 
    } 
    throw new InvalidKeySpecException("Unknown key specification: " + paramKeySpec + ".");
  }
  
  private void checkAlgorithm(ASN1ObjectIdentifier paramASN1ObjectIdentifier) throws InvalidKeySpecException {
    if (this.keyOid != null) {
      if (!this.keyOid.equals((ASN1Primitive)paramASN1ObjectIdentifier))
        throw new InvalidKeySpecException("incorrect algorithm OID for key: " + paramASN1ObjectIdentifier); 
    } else if (!this.keyOids.contains(paramASN1ObjectIdentifier)) {
      throw new InvalidKeySpecException("incorrect algorithm OID for key: " + paramASN1ObjectIdentifier);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provide\\util\BaseKeyFactorySpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */