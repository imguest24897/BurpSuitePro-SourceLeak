package org.bouncycastle.jcajce;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.PublicKey;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.bc.ExternalValue;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.util.Arrays;

public class ExternalPublicKey implements PublicKey {
  private final GeneralName location;
  
  private final AlgorithmIdentifier digestAlg;
  
  private final byte[] digest;
  
  public ExternalPublicKey(GeneralName paramGeneralName, AlgorithmIdentifier paramAlgorithmIdentifier, byte[] paramArrayOfbyte) {
    this.location = paramGeneralName;
    this.digestAlg = paramAlgorithmIdentifier;
    this.digest = Arrays.clone(paramArrayOfbyte);
  }
  
  public ExternalPublicKey(PublicKey paramPublicKey, GeneralName paramGeneralName, MessageDigest paramMessageDigest) {
    this(paramGeneralName, MessageDigestUtils.getDigestAlgID(paramMessageDigest.getAlgorithm()), paramMessageDigest.digest(paramPublicKey.getEncoded()));
  }
  
  public ExternalPublicKey(ExternalValue paramExternalValue) {
    this(paramExternalValue.getLocation(), paramExternalValue.getHashAlg(), paramExternalValue.getHashValue());
  }
  
  public String getAlgorithm() {
    return "ExternalKey";
  }
  
  public String getFormat() {
    return "X.509";
  }
  
  public byte[] getEncoded() {
    try {
      return (new SubjectPublicKeyInfo(new AlgorithmIdentifier(BCObjectIdentifiers.external_value), (ASN1Encodable)new ExternalValue(this.location, this.digestAlg, this.digest))).getEncoded("DER");
    } catch (IOException iOException) {
      throw new IllegalStateException("unable to encode composite key: " + iOException.getMessage());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\ExternalPublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */