package META-INF.versions.9.org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;

class DigestUtil {
  static Digest getDigest(LMOtsParameters paramLMOtsParameters) {
    return createDigest(paramLMOtsParameters.getDigestOID(), paramLMOtsParameters.getN());
  }
  
  static Digest getDigest(LMSigParameters paramLMSigParameters) {
    return createDigest(paramLMSigParameters.getDigestOID(), paramLMSigParameters.getM());
  }
  
  private static Digest createDigest(ASN1ObjectIdentifier paramASN1ObjectIdentifier, int paramInt) {
    Digest digest = createDigest(paramASN1ObjectIdentifier);
    return (Digest)((NISTObjectIdentifiers.id_shake256_len.equals((ASN1Primitive)paramASN1ObjectIdentifier) || digest.getDigestSize() != paramInt) ? new WrapperDigest(digest, paramInt) : digest);
  }
  
  private static Digest createDigest(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_sha256))
      return (Digest)new SHA256Digest(); 
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_shake256_len))
      return (Digest)new SHAKEDigest(256); 
    throw new IllegalArgumentException("unrecognized digest OID: " + paramASN1ObjectIdentifier);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\lms\DigestUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */