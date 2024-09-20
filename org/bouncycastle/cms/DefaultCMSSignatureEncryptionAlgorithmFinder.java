package org.bouncycastle.cms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class DefaultCMSSignatureEncryptionAlgorithmFinder implements CMSSignatureEncryptionAlgorithmFinder {
  protected static final Set RSA_PKCS1d5 = new HashSet();
  
  protected static final Map GOST_ENC = new HashMap<>();
  
  public AlgorithmIdentifier findEncryptionAlgorithm(AlgorithmIdentifier paramAlgorithmIdentifier) {
    return RSA_PKCS1d5.contains(paramAlgorithmIdentifier.getAlgorithm()) ? new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, (ASN1Encodable)DERNull.INSTANCE) : (GOST_ENC.containsKey(paramAlgorithmIdentifier.getAlgorithm()) ? (AlgorithmIdentifier)GOST_ENC.get(paramAlgorithmIdentifier.getAlgorithm()) : paramAlgorithmIdentifier);
  }
  
  static {
    RSA_PKCS1d5.add(PKCSObjectIdentifiers.md2WithRSAEncryption);
    RSA_PKCS1d5.add(PKCSObjectIdentifiers.md4WithRSAEncryption);
    RSA_PKCS1d5.add(PKCSObjectIdentifiers.md5WithRSAEncryption);
    RSA_PKCS1d5.add(PKCSObjectIdentifiers.sha1WithRSAEncryption);
    RSA_PKCS1d5.add(OIWObjectIdentifiers.md4WithRSAEncryption);
    RSA_PKCS1d5.add(OIWObjectIdentifiers.md4WithRSA);
    RSA_PKCS1d5.add(OIWObjectIdentifiers.md5WithRSA);
    RSA_PKCS1d5.add(OIWObjectIdentifiers.sha1WithRSA);
    RSA_PKCS1d5.add(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
    RSA_PKCS1d5.add(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
    RSA_PKCS1d5.add(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
    GOST_ENC.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_2001, (ASN1Encodable)DERNull.INSTANCE));
    GOST_ENC.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, new AlgorithmIdentifier(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256, (ASN1Encodable)DERNull.INSTANCE));
    GOST_ENC.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, new AlgorithmIdentifier(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512, (ASN1Encodable)DERNull.INSTANCE));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\DefaultCMSSignatureEncryptionAlgorithmFinder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */