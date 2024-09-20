package org.bouncycastle.pqc.jcajce.provider.mceliece;

import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;

class Utils {
  static Digest getDigest(AlgorithmIdentifier paramAlgorithmIdentifier) {
    if (paramAlgorithmIdentifier.getAlgorithm().equals((ASN1Primitive)OIWObjectIdentifiers.idSHA1))
      return DigestFactory.createSHA1(); 
    if (paramAlgorithmIdentifier.getAlgorithm().equals((ASN1Primitive)NISTObjectIdentifiers.id_sha224))
      return DigestFactory.createSHA224(); 
    if (paramAlgorithmIdentifier.getAlgorithm().equals((ASN1Primitive)NISTObjectIdentifiers.id_sha256))
      return DigestFactory.createSHA256(); 
    if (paramAlgorithmIdentifier.getAlgorithm().equals((ASN1Primitive)NISTObjectIdentifiers.id_sha384))
      return DigestFactory.createSHA384(); 
    if (paramAlgorithmIdentifier.getAlgorithm().equals((ASN1Primitive)NISTObjectIdentifiers.id_sha512))
      return DigestFactory.createSHA512(); 
    throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + paramAlgorithmIdentifier.getAlgorithm());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\mceliece\Utils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */