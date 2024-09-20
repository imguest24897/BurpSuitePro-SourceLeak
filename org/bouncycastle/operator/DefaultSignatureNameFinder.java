package org.bouncycastle.operator;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.bsi.BSIObjectIdentifiers;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;

public class DefaultSignatureNameFinder implements AlgorithmNameFinder {
  private static final Map oids = new HashMap<>();
  
  private static final Map digests = new HashMap<>();
  
  public boolean hasAlgorithmName(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return oids.containsKey(paramASN1ObjectIdentifier);
  }
  
  public String getAlgorithmName(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    String str = (String)oids.get(paramASN1ObjectIdentifier);
    return (str != null) ? str : paramASN1ObjectIdentifier.getId();
  }
  
  public String getAlgorithmName(AlgorithmIdentifier paramAlgorithmIdentifier) {
    ASN1Encodable aSN1Encodable = paramAlgorithmIdentifier.getParameters();
    if (aSN1Encodable != null && !DERNull.INSTANCE.equals(aSN1Encodable) && paramAlgorithmIdentifier.getAlgorithm().equals((ASN1Primitive)PKCSObjectIdentifiers.id_RSASSA_PSS)) {
      RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(aSN1Encodable);
      AlgorithmIdentifier algorithmIdentifier = rSASSAPSSparams.getMaskGenAlgorithm();
      if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive)PKCSObjectIdentifiers.id_mgf1)) {
        AlgorithmIdentifier algorithmIdentifier1 = rSASSAPSSparams.getHashAlgorithm();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = AlgorithmIdentifier.getInstance(algorithmIdentifier.getParameters()).getAlgorithm();
        return aSN1ObjectIdentifier.equals((ASN1Primitive)algorithmIdentifier1.getAlgorithm()) ? (getDigestName(algorithmIdentifier1.getAlgorithm()) + "WITHRSAANDMGF1") : (getDigestName(algorithmIdentifier1.getAlgorithm()) + "WITHRSAANDMGF1USING" + getDigestName(aSN1ObjectIdentifier));
      } 
      return getDigestName(rSASSAPSSparams.getHashAlgorithm().getAlgorithm()) + "WITHRSAAND" + algorithmIdentifier.getAlgorithm().getId();
    } 
    return oids.containsKey(paramAlgorithmIdentifier.getAlgorithm()) ? (String)oids.get(paramAlgorithmIdentifier.getAlgorithm()) : paramAlgorithmIdentifier.getAlgorithm().getId();
  }
  
  private static String getDigestName(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    String str = (String)digests.get(paramASN1ObjectIdentifier);
    return (str != null) ? str : paramASN1ObjectIdentifier.getId();
  }
  
  static {
    oids.put(PKCSObjectIdentifiers.id_RSASSA_PSS, "RSASSA-PSS");
    oids.put(EdECObjectIdentifiers.id_Ed25519, "ED25519");
    oids.put(EdECObjectIdentifiers.id_Ed448, "ED448");
    oids.put(new ASN1ObjectIdentifier("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
    oids.put(PKCSObjectIdentifiers.sha224WithRSAEncryption, "SHA224WITHRSA");
    oids.put(PKCSObjectIdentifiers.sha256WithRSAEncryption, "SHA256WITHRSA");
    oids.put(PKCSObjectIdentifiers.sha384WithRSAEncryption, "SHA384WITHRSA");
    oids.put(PKCSObjectIdentifiers.sha512WithRSAEncryption, "SHA512WITHRSA");
    oids.put(CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE128, "SHAKE128WITHRSAPSS");
    oids.put(CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE256, "SHAKE256WITHRSAPSS");
    oids.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, "GOST3411WITHGOST3410");
    oids.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, "GOST3411WITHECGOST3410");
    oids.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, "GOST3411-2012-256WITHECGOST3410-2012-256");
    oids.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, "GOST3411-2012-512WITHECGOST3410-2012-512");
    oids.put(BSIObjectIdentifiers.ecdsa_plain_SHA1, "SHA1WITHPLAIN-ECDSA");
    oids.put(BSIObjectIdentifiers.ecdsa_plain_SHA224, "SHA224WITHPLAIN-ECDSA");
    oids.put(BSIObjectIdentifiers.ecdsa_plain_SHA256, "SHA256WITHPLAIN-ECDSA");
    oids.put(BSIObjectIdentifiers.ecdsa_plain_SHA384, "SHA384WITHPLAIN-ECDSA");
    oids.put(BSIObjectIdentifiers.ecdsa_plain_SHA512, "SHA512WITHPLAIN-ECDSA");
    oids.put(BSIObjectIdentifiers.ecdsa_plain_SHA3_224, "SHA3-224WITHPLAIN-ECDSA");
    oids.put(BSIObjectIdentifiers.ecdsa_plain_SHA3_256, "SHA3-256WITHPLAIN-ECDSA");
    oids.put(BSIObjectIdentifiers.ecdsa_plain_SHA3_384, "SHA3-384WITHPLAIN-ECDSA");
    oids.put(BSIObjectIdentifiers.ecdsa_plain_SHA3_512, "SHA3-512WITHPLAIN-ECDSA");
    oids.put(BSIObjectIdentifiers.ecdsa_plain_RIPEMD160, "RIPEMD160WITHPLAIN-ECDSA");
    oids.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, "SHA1WITHCVC-ECDSA");
    oids.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, "SHA224WITHCVC-ECDSA");
    oids.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, "SHA256WITHCVC-ECDSA");
    oids.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, "SHA384WITHCVC-ECDSA");
    oids.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, "SHA512WITHCVC-ECDSA");
    oids.put(IsaraObjectIdentifiers.id_alg_xmss, "XMSS");
    oids.put(IsaraObjectIdentifiers.id_alg_xmssmt, "XMSSMT");
    oids.put(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128, "RIPEMD128WITHRSA");
    oids.put(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160, "RIPEMD160WITHRSA");
    oids.put(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256, "RIPEMD256WITHRSA");
    oids.put(new ASN1ObjectIdentifier("1.2.840.113549.1.1.4"), "MD5WITHRSA");
    oids.put(new ASN1ObjectIdentifier("1.2.840.113549.1.1.2"), "MD2WITHRSA");
    oids.put(new ASN1ObjectIdentifier("1.2.840.10040.4.3"), "SHA1WITHDSA");
    oids.put(X9ObjectIdentifiers.ecdsa_with_SHA1, "SHA1WITHECDSA");
    oids.put(X9ObjectIdentifiers.ecdsa_with_SHA224, "SHA224WITHECDSA");
    oids.put(X9ObjectIdentifiers.ecdsa_with_SHA256, "SHA256WITHECDSA");
    oids.put(X9ObjectIdentifiers.ecdsa_with_SHA384, "SHA384WITHECDSA");
    oids.put(X9ObjectIdentifiers.ecdsa_with_SHA512, "SHA512WITHECDSA");
    oids.put(CMSObjectIdentifiers.id_ecdsa_with_shake128, "SHAKE128WITHECDSA");
    oids.put(CMSObjectIdentifiers.id_ecdsa_with_shake256, "SHAKE256WITHECDSA");
    oids.put(OIWObjectIdentifiers.sha1WithRSA, "SHA1WITHRSA");
    oids.put(OIWObjectIdentifiers.dsaWithSHA1, "SHA1WITHDSA");
    oids.put(NISTObjectIdentifiers.dsa_with_sha224, "SHA224WITHDSA");
    oids.put(NISTObjectIdentifiers.dsa_with_sha256, "SHA256WITHDSA");
    digests.put(OIWObjectIdentifiers.idSHA1, "SHA1");
    digests.put(NISTObjectIdentifiers.id_sha224, "SHA224");
    digests.put(NISTObjectIdentifiers.id_sha256, "SHA256");
    digests.put(NISTObjectIdentifiers.id_sha384, "SHA384");
    digests.put(NISTObjectIdentifiers.id_sha512, "SHA512");
    digests.put(NISTObjectIdentifiers.id_sha3_224, "SHA3-224");
    digests.put(NISTObjectIdentifiers.id_sha3_256, "SHA3-256");
    digests.put(NISTObjectIdentifiers.id_sha3_384, "SHA3-384");
    digests.put(NISTObjectIdentifiers.id_sha3_512, "SHA3-512");
    digests.put(TeleTrusTObjectIdentifiers.ripemd128, "RIPEMD128");
    digests.put(TeleTrusTObjectIdentifiers.ripemd160, "RIPEMD160");
    digests.put(TeleTrusTObjectIdentifiers.ripemd256, "RIPEMD256");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\operator\DefaultSignatureNameFinder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */