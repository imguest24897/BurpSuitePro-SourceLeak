package META-INF.versions.9.org.bouncycastle.tls;

import org.bouncycastle.tls.HashAlgorithm;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsCryptoUtils;

public class SignatureScheme {
  public static final int rsa_pkcs1_sha1 = 513;
  
  public static final int ecdsa_sha1 = 515;
  
  public static final int rsa_pkcs1_sha256 = 1025;
  
  public static final int rsa_pkcs1_sha384 = 1281;
  
  public static final int rsa_pkcs1_sha512 = 1537;
  
  public static final int ecdsa_secp256r1_sha256 = 1027;
  
  public static final int ecdsa_secp384r1_sha384 = 1283;
  
  public static final int ecdsa_secp521r1_sha512 = 1539;
  
  public static final int rsa_pss_rsae_sha256 = 2052;
  
  public static final int rsa_pss_rsae_sha384 = 2053;
  
  public static final int rsa_pss_rsae_sha512 = 2054;
  
  public static final int ed25519 = 2055;
  
  public static final int ed448 = 2056;
  
  public static final int rsa_pss_pss_sha256 = 2057;
  
  public static final int rsa_pss_pss_sha384 = 2058;
  
  public static final int rsa_pss_pss_sha512 = 2059;
  
  public static final int ecdsa_brainpoolP256r1tls13_sha256 = 2074;
  
  public static final int ecdsa_brainpoolP384r1tls13_sha384 = 2075;
  
  public static final int ecdsa_brainpoolP512r1tls13_sha512 = 2076;
  
  public static final int sm2sig_sm3 = 1800;
  
  public static int from(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    if (null == paramSignatureAndHashAlgorithm)
      throw new NullPointerException(); 
    return from(paramSignatureAndHashAlgorithm.getHash(), paramSignatureAndHashAlgorithm.getSignature());
  }
  
  public static int from(short paramShort1, short paramShort2) {
    return (paramShort1 & 0xFF) << 8 | paramShort2 & 0xFF;
  }
  
  public static int getCryptoHashAlgorithm(int paramInt) {
    switch (paramInt) {
      case 2055:
      case 2056:
        return -1;
      case 2052:
      case 2057:
      case 2074:
        return 4;
      case 2053:
      case 2058:
      case 2075:
        return 5;
      case 2054:
      case 2059:
      case 2076:
        return 6;
      case 1800:
        return 7;
    } 
    short s = getHashAlgorithm(paramInt);
    return (8 == s || !HashAlgorithm.isRecognized(s)) ? -1 : TlsCryptoUtils.getHash(s);
  }
  
  public static int getCryptoHashAlgorithm(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    return getCryptoHashAlgorithm(from(paramSignatureAndHashAlgorithm));
  }
  
  public static String getName(int paramInt) {
    switch (paramInt) {
      case 513:
        return "rsa_pkcs1_sha1";
      case 515:
        return "ecdsa_sha1";
      case 1025:
        return "rsa_pkcs1_sha256";
      case 1281:
        return "rsa_pkcs1_sha384";
      case 1537:
        return "rsa_pkcs1_sha512";
      case 1027:
        return "ecdsa_secp256r1_sha256";
      case 1283:
        return "ecdsa_secp384r1_sha384";
      case 1539:
        return "ecdsa_secp521r1_sha512";
      case 2052:
        return "rsa_pss_rsae_sha256";
      case 2053:
        return "rsa_pss_rsae_sha384";
      case 2054:
        return "rsa_pss_rsae_sha512";
      case 2055:
        return "ed25519";
      case 2056:
        return "ed448";
      case 2057:
        return "rsa_pss_pss_sha256";
      case 2058:
        return "rsa_pss_pss_sha384";
      case 2059:
        return "rsa_pss_pss_sha512";
      case 2074:
        return "ecdsa_brainpoolP256r1tls13_sha256";
      case 2075:
        return "ecdsa_brainpoolP384r1tls13_sha384";
      case 2076:
        return "ecdsa_brainpoolP512r1tls13_sha512";
      case 1800:
        return "sm2sig_sm3";
    } 
    return "UNKNOWN";
  }
  
  public static int getNamedGroup(int paramInt) {
    switch (paramInt) {
      case 2074:
        return 31;
      case 2075:
        return 32;
      case 2076:
        return 33;
      case 1027:
        return 23;
      case 1283:
        return 24;
      case 1539:
        return 25;
      case 1800:
        return 41;
    } 
    return -1;
  }
  
  public static int getRSAPSSCryptoHashAlgorithm(int paramInt) {
    switch (paramInt) {
      case 2052:
      case 2057:
        return 4;
      case 2053:
      case 2058:
        return 5;
      case 2054:
      case 2059:
        return 6;
    } 
    return -1;
  }
  
  public static short getHashAlgorithm(int paramInt) {
    return (short)(paramInt >>> 8 & 0xFF);
  }
  
  public static short getSignatureAlgorithm(int paramInt) {
    return (short)(paramInt & 0xFF);
  }
  
  public static SignatureAndHashAlgorithm getSignatureAndHashAlgorithm(int paramInt) {
    return SignatureAndHashAlgorithm.getInstance(getHashAlgorithm(paramInt), getSignatureAlgorithm(paramInt));
  }
  
  public static String getText(int paramInt) {
    return getName(paramInt) + "(0x" + getName(paramInt) + ")";
  }
  
  public static boolean isPrivate(int paramInt) {
    return (paramInt >>> 9 == 254);
  }
  
  public static boolean isECDSA(int paramInt) {
    switch (paramInt) {
      case 2074:
      case 2075:
      case 2076:
        return true;
    } 
    return (3 == getSignatureAlgorithm(paramInt));
  }
  
  public static boolean isRSAPSS(int paramInt) {
    switch (paramInt) {
      case 2052:
      case 2053:
      case 2054:
      case 2057:
      case 2058:
      case 2059:
        return true;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\SignatureScheme.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */