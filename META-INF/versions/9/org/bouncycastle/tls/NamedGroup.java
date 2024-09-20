package META-INF.versions.9.org.bouncycastle.tls;

import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsUtils;

public class NamedGroup {
  public static final int sect163k1 = 1;
  
  public static final int sect163r1 = 2;
  
  public static final int sect163r2 = 3;
  
  public static final int sect193r1 = 4;
  
  public static final int sect193r2 = 5;
  
  public static final int sect233k1 = 6;
  
  public static final int sect233r1 = 7;
  
  public static final int sect239k1 = 8;
  
  public static final int sect283k1 = 9;
  
  public static final int sect283r1 = 10;
  
  public static final int sect409k1 = 11;
  
  public static final int sect409r1 = 12;
  
  public static final int sect571k1 = 13;
  
  public static final int sect571r1 = 14;
  
  public static final int secp160k1 = 15;
  
  public static final int secp160r1 = 16;
  
  public static final int secp160r2 = 17;
  
  public static final int secp192k1 = 18;
  
  public static final int secp192r1 = 19;
  
  public static final int secp224k1 = 20;
  
  public static final int secp224r1 = 21;
  
  public static final int secp256k1 = 22;
  
  public static final int secp256r1 = 23;
  
  public static final int secp384r1 = 24;
  
  public static final int secp521r1 = 25;
  
  public static final int brainpoolP256r1 = 26;
  
  public static final int brainpoolP384r1 = 27;
  
  public static final int brainpoolP512r1 = 28;
  
  public static final int x25519 = 29;
  
  public static final int x448 = 30;
  
  public static final int brainpoolP256r1tls13 = 31;
  
  public static final int brainpoolP384r1tls13 = 32;
  
  public static final int brainpoolP512r1tls13 = 33;
  
  public static final int GC256A = 34;
  
  public static final int GC256B = 35;
  
  public static final int GC256C = 36;
  
  public static final int GC256D = 37;
  
  public static final int GC512A = 38;
  
  public static final int GC512B = 39;
  
  public static final int GC512C = 40;
  
  public static final int curveSM2 = 41;
  
  public static final int ffdhe2048 = 256;
  
  public static final int ffdhe3072 = 257;
  
  public static final int ffdhe4096 = 258;
  
  public static final int ffdhe6144 = 259;
  
  public static final int ffdhe8192 = 260;
  
  public static final int arbitrary_explicit_prime_curves = 65281;
  
  public static final int arbitrary_explicit_char2_curves = 65282;
  
  public static final int OQS_mlkem512 = 583;
  
  public static final int OQS_mlkem768 = 584;
  
  public static final int OQS_mlkem1024 = 585;
  
  public static final int DRAFT_mlkem768 = 1896;
  
  public static final int DRAFT_mlkem1024 = 4132;
  
  private static final String[] CURVE_NAMES = new String[] { 
      "sect163k1", "sect163r1", "sect163r2", "sect193r1", "sect193r2", "sect233k1", "sect233r1", "sect239k1", "sect283k1", "sect283r1", 
      "sect409k1", "sect409r1", "sect571k1", "sect571r1", "secp160k1", "secp160r1", "secp160r2", "secp192k1", "secp192r1", "secp224k1", 
      "secp224r1", "secp256k1", "secp256r1", "secp384r1", "secp521r1", "brainpoolP256r1", "brainpoolP384r1", "brainpoolP512r1", "X25519", "X448", 
      "brainpoolP256r1", "brainpoolP384r1", "brainpoolP512r1", "Tc26-Gost-3410-12-256-paramSetA", "GostR3410-2001-CryptoPro-A", "GostR3410-2001-CryptoPro-B", "GostR3410-2001-CryptoPro-C", "Tc26-Gost-3410-12-512-paramSetA", "Tc26-Gost-3410-12-512-paramSetB", "Tc26-Gost-3410-12-512-paramSetC", 
      "sm2p256v1" };
  
  private static final String[] FINITE_FIELD_NAMES = new String[] { "ffdhe2048", "ffdhe3072", "ffdhe4096", "ffdhe6144", "ffdhe8192" };
  
  public static boolean canBeNegotiated(int paramInt, ProtocolVersion paramProtocolVersion) {
    switch (paramInt) {
      case 23:
      case 24:
      case 25:
      case 29:
      case 30:
        return true;
    } 
    if (refersToASpecificFiniteField(paramInt))
      return true; 
    boolean bool = TlsUtils.isTLSv13(paramProtocolVersion);
    if (refersToASpecificCurve(paramInt)) {
      switch (paramInt) {
        case 31:
        case 32:
        case 33:
        case 41:
          return bool;
      } 
      return !bool;
    } 
    return refersToASpecificKem(paramInt) ? bool : ((paramInt >= 65281 && paramInt <= 65282) ? (!bool) : isPrivate(paramInt));
  }
  
  public static int getCurveBits(int paramInt) {
    switch (paramInt) {
      case 15:
      case 16:
      case 17:
        return 160;
      case 1:
      case 2:
      case 3:
        return 163;
      case 18:
      case 19:
        return 192;
      case 4:
      case 5:
        return 193;
      case 20:
      case 21:
        return 224;
      case 6:
      case 7:
        return 233;
      case 8:
        return 239;
      case 29:
        return 252;
      case 22:
      case 23:
      case 26:
      case 31:
      case 34:
      case 35:
      case 36:
      case 37:
      case 41:
        return 256;
      case 9:
      case 10:
        return 283;
      case 24:
      case 27:
      case 32:
        return 384;
      case 11:
      case 12:
        return 409;
      case 30:
        return 446;
      case 28:
      case 33:
      case 38:
      case 39:
      case 40:
        return 512;
      case 25:
        return 521;
      case 13:
      case 14:
        return 571;
    } 
    return 0;
  }
  
  public static String getCurveName(int paramInt) {
    return refersToASpecificCurve(paramInt) ? CURVE_NAMES[paramInt - 1] : null;
  }
  
  public static int getFiniteFieldBits(int paramInt) {
    switch (paramInt) {
      case 256:
        return 2048;
      case 257:
        return 3072;
      case 258:
        return 4096;
      case 259:
        return 6144;
      case 260:
        return 8192;
    } 
    return 0;
  }
  
  public static String getFiniteFieldName(int paramInt) {
    return refersToASpecificFiniteField(paramInt) ? FINITE_FIELD_NAMES[paramInt - 256] : null;
  }
  
  public static String getKemName(int paramInt) {
    switch (paramInt) {
      case 583:
        return "ML-KEM-512";
      case 584:
      case 1896:
        return "ML-KEM-768";
      case 585:
      case 4132:
        return "ML-KEM-1024";
    } 
    return null;
  }
  
  public static int getMaximumChar2CurveBits() {
    return 571;
  }
  
  public static int getMaximumCurveBits() {
    return 571;
  }
  
  public static int getMaximumFiniteFieldBits() {
    return 8192;
  }
  
  public static int getMaximumPrimeCurveBits() {
    return 521;
  }
  
  public static String getName(int paramInt) {
    if (isPrivate(paramInt))
      return "PRIVATE"; 
    switch (paramInt) {
      case 29:
        return "x25519";
      case 30:
        return "x448";
      case 31:
        return "brainpoolP256r1tls13";
      case 32:
        return "brainpoolP384r1tls13";
      case 33:
        return "brainpoolP512r1tls13";
      case 34:
        return "GC256A";
      case 35:
        return "GC256B";
      case 36:
        return "GC256C";
      case 37:
        return "GC256D";
      case 38:
        return "GC512A";
      case 39:
        return "GC512B";
      case 40:
        return "GC512C";
      case 41:
        return "curveSM2";
      case 583:
        return "OQS_mlkem512";
      case 584:
        return "OQS_mlkem768";
      case 585:
        return "OQS_mlkem1024";
      case 1896:
        return "DRAFT_mlkem768";
      case 4132:
        return "DRAFT_mlkem1024";
      case 65281:
        return "arbitrary_explicit_prime_curves";
      case 65282:
        return "arbitrary_explicit_char2_curves";
    } 
    String str = getStandardName(paramInt);
    return (null != str) ? str : "UNKNOWN";
  }
  
  public static String getStandardName(int paramInt) {
    String str1 = getCurveName(paramInt);
    if (null != str1)
      return str1; 
    String str2 = getFiniteFieldName(paramInt);
    if (null != str2)
      return str2; 
    String str3 = getKemName(paramInt);
    return (null != str3) ? str3 : null;
  }
  
  public static String getText(int paramInt) {
    return getName(paramInt) + "(" + getName(paramInt) + ")";
  }
  
  public static boolean isChar2Curve(int paramInt) {
    return ((paramInt >= 1 && paramInt <= 14) || paramInt == 65282);
  }
  
  public static boolean isFiniteField(int paramInt) {
    return ((paramInt & 0xFFFFFF00) == 256);
  }
  
  public static boolean isPrimeCurve(int paramInt) {
    return ((paramInt >= 15 && paramInt <= 41) || paramInt == 65281);
  }
  
  public static boolean isPrivate(int paramInt) {
    return (paramInt >>> 2 == 127 || paramInt >>> 8 == 254);
  }
  
  public static boolean isValid(int paramInt) {
    return (refersToASpecificGroup(paramInt) || isPrivate(paramInt) || (paramInt >= 65281 && paramInt <= 65282));
  }
  
  public static boolean refersToAnECDHCurve(int paramInt) {
    return refersToASpecificCurve(paramInt);
  }
  
  public static boolean refersToAnECDSACurve(int paramInt) {
    return (refersToASpecificCurve(paramInt) && !refersToAnXDHCurve(paramInt));
  }
  
  public static boolean refersToAnXDHCurve(int paramInt) {
    return (paramInt >= 29 && paramInt <= 30);
  }
  
  public static boolean refersToASpecificCurve(int paramInt) {
    return (paramInt >= 1 && paramInt <= 41);
  }
  
  public static boolean refersToASpecificFiniteField(int paramInt) {
    return (paramInt >= 256 && paramInt <= 260);
  }
  
  public static boolean refersToASpecificGroup(int paramInt) {
    return (refersToASpecificCurve(paramInt) || refersToASpecificFiniteField(paramInt) || refersToASpecificKem(paramInt));
  }
  
  public static boolean refersToASpecificKem(int paramInt) {
    switch (paramInt) {
      case 583:
      case 584:
      case 585:
      case 1896:
      case 4132:
        return true;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\NamedGroup.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */