package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

class DigestUtil {
  static Digest getDigest(LMOtsParameters paramLMOtsParameters) {
    return createDigest(paramLMOtsParameters.getDigestOID(), paramLMOtsParameters.getN());
  }
  
  static Digest getDigest(LMSigParameters paramLMSigParameters) {
    return createDigest(paramLMSigParameters.getDigestOID(), paramLMSigParameters.getM());
  }
  
  private static Digest createDigest(ASN1ObjectIdentifier paramASN1ObjectIdentifier, int paramInt) {
    Digest digest = createDigest(paramASN1ObjectIdentifier);
    return (NISTObjectIdentifiers.id_shake256_len.equals((ASN1Primitive)paramASN1ObjectIdentifier) || digest.getDigestSize() != paramInt) ? new WrapperDigest(digest, paramInt) : digest;
  }
  
  private static Digest createDigest(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_sha256))
      return (Digest)new SHA256Digest(); 
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_shake256_len))
      return (Digest)new SHAKEDigest(256); 
    throw new IllegalArgumentException("unrecognized digest OID: " + paramASN1ObjectIdentifier);
  }
  
  static class WrapperDigest implements Digest {
    private final Digest digest;
    
    private final int length;
    
    WrapperDigest(Digest param1Digest, int param1Int) {
      this.digest = param1Digest;
      this.length = param1Int;
    }
    
    public String getAlgorithmName() {
      return this.digest.getAlgorithmName() + "/" + (this.length * 8);
    }
    
    public int getDigestSize() {
      return this.length;
    }
    
    public void update(byte param1Byte) {
      this.digest.update(param1Byte);
    }
    
    public void update(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      this.digest.update(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    public int doFinal(byte[] param1ArrayOfbyte, int param1Int) {
      byte[] arrayOfByte = new byte[this.digest.getDigestSize()];
      this.digest.doFinal(arrayOfByte, 0);
      System.arraycopy(arrayOfByte, 0, param1ArrayOfbyte, param1Int, this.length);
      return this.length;
    }
    
    public void reset() {
      this.digest.reset();
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\lms\DigestUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */