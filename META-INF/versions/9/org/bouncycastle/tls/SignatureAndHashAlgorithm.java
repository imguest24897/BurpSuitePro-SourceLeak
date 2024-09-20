package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.HashAlgorithm;
import org.bouncycastle.tls.SignatureAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.TlsUtils;

public class SignatureAndHashAlgorithm {
  public static final org.bouncycastle.tls.SignatureAndHashAlgorithm ecdsa_brainpoolP256r1tls13_sha256 = create(2074);
  
  public static final org.bouncycastle.tls.SignatureAndHashAlgorithm ecdsa_brainpoolP384r1tls13_sha384 = create(2075);
  
  public static final org.bouncycastle.tls.SignatureAndHashAlgorithm ecdsa_brainpoolP512r1tls13_sha512 = create(2076);
  
  public static final org.bouncycastle.tls.SignatureAndHashAlgorithm ed25519 = create(2055);
  
  public static final org.bouncycastle.tls.SignatureAndHashAlgorithm ed448 = create(2056);
  
  public static final org.bouncycastle.tls.SignatureAndHashAlgorithm gostr34102012_256 = create((short)8, (short)64);
  
  public static final org.bouncycastle.tls.SignatureAndHashAlgorithm gostr34102012_512 = create((short)8, (short)65);
  
  public static final org.bouncycastle.tls.SignatureAndHashAlgorithm rsa_pss_rsae_sha256 = create(2052);
  
  public static final org.bouncycastle.tls.SignatureAndHashAlgorithm rsa_pss_rsae_sha384 = create(2053);
  
  public static final org.bouncycastle.tls.SignatureAndHashAlgorithm rsa_pss_rsae_sha512 = create(2054);
  
  public static final org.bouncycastle.tls.SignatureAndHashAlgorithm rsa_pss_pss_sha256 = create(2057);
  
  public static final org.bouncycastle.tls.SignatureAndHashAlgorithm rsa_pss_pss_sha384 = create(2058);
  
  public static final org.bouncycastle.tls.SignatureAndHashAlgorithm rsa_pss_pss_sha512 = create(2059);
  
  protected final short hash;
  
  protected final short signature;
  
  public static org.bouncycastle.tls.SignatureAndHashAlgorithm getInstance(short paramShort1, short paramShort2) {
    switch (paramShort1) {
      case 8:
        return getInstanceIntrinsic(paramShort2);
    } 
    return create(paramShort1, paramShort2);
  }
  
  private static org.bouncycastle.tls.SignatureAndHashAlgorithm getInstanceIntrinsic(short paramShort) {
    switch (paramShort) {
      case 7:
        return ed25519;
      case 8:
        return ed448;
      case 64:
        return gostr34102012_256;
      case 65:
        return gostr34102012_512;
      case 4:
        return rsa_pss_rsae_sha256;
      case 5:
        return rsa_pss_rsae_sha384;
      case 6:
        return rsa_pss_rsae_sha512;
      case 9:
        return rsa_pss_pss_sha256;
      case 10:
        return rsa_pss_pss_sha384;
      case 11:
        return rsa_pss_pss_sha512;
      case 26:
        return ecdsa_brainpoolP256r1tls13_sha256;
      case 27:
        return ecdsa_brainpoolP384r1tls13_sha384;
      case 28:
        return ecdsa_brainpoolP512r1tls13_sha512;
    } 
    return create((short)8, paramShort);
  }
  
  private static org.bouncycastle.tls.SignatureAndHashAlgorithm create(int paramInt) {
    short s1 = SignatureScheme.getHashAlgorithm(paramInt);
    short s2 = SignatureScheme.getSignatureAlgorithm(paramInt);
    return create(s1, s2);
  }
  
  private static org.bouncycastle.tls.SignatureAndHashAlgorithm create(short paramShort1, short paramShort2) {
    return new org.bouncycastle.tls.SignatureAndHashAlgorithm(paramShort1, paramShort2);
  }
  
  public SignatureAndHashAlgorithm(short paramShort1, short paramShort2) {
    if ((paramShort1 & 0xFF) != paramShort1)
      throw new IllegalArgumentException("'hash' should be a uint8"); 
    if ((paramShort2 & 0xFF) != paramShort2)
      throw new IllegalArgumentException("'signature' should be a uint8"); 
    this.hash = paramShort1;
    this.signature = paramShort2;
  }
  
  public short getHash() {
    return this.hash;
  }
  
  public short getSignature() {
    return this.signature;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    TlsUtils.writeUint8(getHash(), paramOutputStream);
    TlsUtils.writeUint8(getSignature(), paramOutputStream);
  }
  
  public static org.bouncycastle.tls.SignatureAndHashAlgorithm parse(InputStream paramInputStream) throws IOException {
    short s1 = TlsUtils.readUint8(paramInputStream);
    short s2 = TlsUtils.readUint8(paramInputStream);
    return getInstance(s1, s2);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof org.bouncycastle.tls.SignatureAndHashAlgorithm))
      return false; 
    org.bouncycastle.tls.SignatureAndHashAlgorithm signatureAndHashAlgorithm = (org.bouncycastle.tls.SignatureAndHashAlgorithm)paramObject;
    return (signatureAndHashAlgorithm.getHash() == getHash() && signatureAndHashAlgorithm.getSignature() == getSignature());
  }
  
  public int hashCode() {
    return getHash() << 16 | getSignature();
  }
  
  public String toString() {
    return "{" + HashAlgorithm.getText(this.hash) + "," + SignatureAlgorithm.getText(this.signature) + "}";
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\SignatureAndHashAlgorithm.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */