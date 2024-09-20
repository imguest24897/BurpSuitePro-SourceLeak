package org.bouncycastle.pqc.jcajce.provider.util;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.pqc.crypto.util.SubjectPublicKeyInfoFactory;

public class KeyUtil {
  public static byte[] getEncodedSubjectPublicKeyInfo(AlgorithmIdentifier paramAlgorithmIdentifier, ASN1Encodable paramASN1Encodable) {
    try {
      return getEncodedSubjectPublicKeyInfo(new SubjectPublicKeyInfo(paramAlgorithmIdentifier, paramASN1Encodable));
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public static byte[] getEncodedSubjectPublicKeyInfo(AlgorithmIdentifier paramAlgorithmIdentifier, byte[] paramArrayOfbyte) {
    try {
      return getEncodedSubjectPublicKeyInfo(new SubjectPublicKeyInfo(paramAlgorithmIdentifier, paramArrayOfbyte));
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public static byte[] getEncodedSubjectPublicKeyInfo(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) {
    try {
      return paramSubjectPublicKeyInfo.getEncoded("DER");
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public static byte[] getEncodedSubjectPublicKeyInfo(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    if (paramAsymmetricKeyParameter.isPrivate())
      throw new IllegalArgumentException("private key found"); 
    try {
      return getEncodedSubjectPublicKeyInfo(SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(paramAsymmetricKeyParameter));
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public static byte[] getEncodedPrivateKeyInfo(AlgorithmIdentifier paramAlgorithmIdentifier, ASN1Encodable paramASN1Encodable) {
    try {
      PrivateKeyInfo privateKeyInfo = new PrivateKeyInfo(paramAlgorithmIdentifier, (ASN1Encodable)paramASN1Encodable.toASN1Primitive());
      return getEncodedPrivateKeyInfo(privateKeyInfo);
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public static byte[] getEncodedPrivateKeyInfo(PrivateKeyInfo paramPrivateKeyInfo) {
    try {
      return paramPrivateKeyInfo.getEncoded("DER");
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public static byte[] getEncodedPrivateKeyInfo(AsymmetricKeyParameter paramAsymmetricKeyParameter, ASN1Set paramASN1Set) {
    if (!paramAsymmetricKeyParameter.isPrivate())
      throw new IllegalArgumentException("public key found"); 
    try {
      return getEncodedPrivateKeyInfo(PrivateKeyInfoFactory.createPrivateKeyInfo(paramAsymmetricKeyParameter, paramASN1Set));
    } catch (Exception exception) {
      return null;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provide\\util\KeyUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */