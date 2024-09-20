package org.bouncycastle.tls.crypto.impl;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.tls.crypto.TlsCryptoUtils;
import org.bouncycastle.util.Arrays;

public class RSAUtil {
  private static final byte[] RSAPSSParams_256_A;
  
  private static final byte[] RSAPSSParams_384_A;
  
  private static final byte[] RSAPSSParams_512_A;
  
  private static final byte[] RSAPSSParams_256_B;
  
  private static final byte[] RSAPSSParams_384_B;
  
  private static final byte[] RSAPSSParams_512_B;
  
  public static boolean supportsPKCS1(AlgorithmIdentifier paramAlgorithmIdentifier) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = paramAlgorithmIdentifier.getAlgorithm();
    return (PKCSObjectIdentifiers.rsaEncryption.equals((ASN1Primitive)aSN1ObjectIdentifier) || X509ObjectIdentifiers.id_ea_rsa.equals((ASN1Primitive)aSN1ObjectIdentifier));
  }
  
  public static boolean supportsPSS_PSS(short paramShort, AlgorithmIdentifier paramAlgorithmIdentifier) {
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    byte[] arrayOfByte3;
    ASN1ObjectIdentifier aSN1ObjectIdentifier = paramAlgorithmIdentifier.getAlgorithm();
    if (!PKCSObjectIdentifiers.id_RSASSA_PSS.equals((ASN1Primitive)aSN1ObjectIdentifier))
      return false; 
    ASN1Encodable aSN1Encodable = paramAlgorithmIdentifier.getParameters();
    if (null == aSN1Encodable || aSN1Encodable instanceof org.bouncycastle.asn1.ASN1Null) {
      switch (paramShort) {
        case 9:
        case 10:
        case 11:
          return true;
      } 
      return false;
    } 
    try {
      arrayOfByte1 = aSN1Encodable.toASN1Primitive().getEncoded("DER");
    } catch (Exception exception) {
      return false;
    } 
    switch (paramShort) {
      case 9:
        arrayOfByte2 = RSAPSSParams_256_A;
        arrayOfByte3 = RSAPSSParams_256_B;
        break;
      case 10:
        arrayOfByte2 = RSAPSSParams_384_A;
        arrayOfByte3 = RSAPSSParams_384_B;
        break;
      case 11:
        arrayOfByte2 = RSAPSSParams_512_A;
        arrayOfByte3 = RSAPSSParams_512_B;
        break;
      default:
        return false;
    } 
    return (Arrays.areEqual(arrayOfByte2, arrayOfByte1) || Arrays.areEqual(arrayOfByte3, arrayOfByte1));
  }
  
  public static boolean supportsPSS_RSAE(AlgorithmIdentifier paramAlgorithmIdentifier) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = paramAlgorithmIdentifier.getAlgorithm();
    return PKCSObjectIdentifiers.rsaEncryption.equals((ASN1Primitive)aSN1ObjectIdentifier);
  }
  
  static {
    AlgorithmIdentifier algorithmIdentifier1 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
    AlgorithmIdentifier algorithmIdentifier2 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384);
    AlgorithmIdentifier algorithmIdentifier3 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512);
    AlgorithmIdentifier algorithmIdentifier4 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256, (ASN1Encodable)DERNull.INSTANCE);
    AlgorithmIdentifier algorithmIdentifier5 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384, (ASN1Encodable)DERNull.INSTANCE);
    AlgorithmIdentifier algorithmIdentifier6 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512, (ASN1Encodable)DERNull.INSTANCE);
    AlgorithmIdentifier algorithmIdentifier7 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, (ASN1Encodable)algorithmIdentifier1);
    AlgorithmIdentifier algorithmIdentifier8 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, (ASN1Encodable)algorithmIdentifier2);
    AlgorithmIdentifier algorithmIdentifier9 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, (ASN1Encodable)algorithmIdentifier3);
    AlgorithmIdentifier algorithmIdentifier10 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, (ASN1Encodable)algorithmIdentifier4);
    AlgorithmIdentifier algorithmIdentifier11 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, (ASN1Encodable)algorithmIdentifier5);
    AlgorithmIdentifier algorithmIdentifier12 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, (ASN1Encodable)algorithmIdentifier6);
    ASN1Integer aSN1Integer1 = new ASN1Integer(TlsCryptoUtils.getHashOutputSize(4));
    ASN1Integer aSN1Integer2 = new ASN1Integer(TlsCryptoUtils.getHashOutputSize(5));
    ASN1Integer aSN1Integer3 = new ASN1Integer(TlsCryptoUtils.getHashOutputSize(6));
    ASN1Integer aSN1Integer4 = new ASN1Integer(1L);
    try {
      RSAPSSParams_256_A = (new RSASSAPSSparams(algorithmIdentifier1, algorithmIdentifier7, aSN1Integer1, aSN1Integer4)).getEncoded("DER");
      RSAPSSParams_384_A = (new RSASSAPSSparams(algorithmIdentifier2, algorithmIdentifier8, aSN1Integer2, aSN1Integer4)).getEncoded("DER");
      RSAPSSParams_512_A = (new RSASSAPSSparams(algorithmIdentifier3, algorithmIdentifier9, aSN1Integer3, aSN1Integer4)).getEncoded("DER");
      RSAPSSParams_256_B = (new RSASSAPSSparams(algorithmIdentifier4, algorithmIdentifier10, aSN1Integer1, aSN1Integer4)).getEncoded("DER");
      RSAPSSParams_384_B = (new RSASSAPSSparams(algorithmIdentifier5, algorithmIdentifier11, aSN1Integer2, aSN1Integer4)).getEncoded("DER");
      RSAPSSParams_512_B = (new RSASSAPSSparams(algorithmIdentifier6, algorithmIdentifier12, aSN1Integer3, aSN1Integer4)).getEncoded("DER");
    } catch (IOException iOException) {
      throw new IllegalStateException(iOException.getMessage());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\RSAUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */