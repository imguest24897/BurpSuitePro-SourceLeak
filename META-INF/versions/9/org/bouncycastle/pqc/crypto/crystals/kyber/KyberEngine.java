package META-INF.versions.9.org.bouncycastle.pqc.crypto.crystals.kyber;

import java.security.SecureRandom;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberIndCpa;
import org.bouncycastle.pqc.crypto.crystals.kyber.PolyVec;
import org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric;
import org.bouncycastle.util.Arrays;

class KyberEngine {
  private SecureRandom random;
  
  private KyberIndCpa indCpa;
  
  public static final int KyberN = 256;
  
  public static final int KyberQ = 3329;
  
  public static final int KyberQinv = 62209;
  
  public static final int KyberSymBytes = 32;
  
  private static final int KyberSharedSecretBytes = 32;
  
  public static final int KyberPolyBytes = 384;
  
  private static final int KyberEta2 = 2;
  
  private static final int KyberIndCpaMsgBytes = 32;
  
  private final int KyberK;
  
  private final int KyberPolyVecBytes;
  
  private final int KyberPolyCompressedBytes;
  
  private final int KyberPolyVecCompressedBytes;
  
  private final int KyberEta1;
  
  private final int KyberIndCpaPublicKeyBytes;
  
  private final int KyberIndCpaSecretKeyBytes;
  
  private final int KyberIndCpaBytes;
  
  private final int KyberPublicKeyBytes;
  
  private final int KyberSecretKeyBytes;
  
  private final int KyberCipherTextBytes;
  
  private final int CryptoBytes;
  
  private final int CryptoSecretKeyBytes;
  
  private final int CryptoPublicKeyBytes;
  
  private final int CryptoCipherTextBytes;
  
  private final int sessionKeyLength;
  
  private final Symmetric symmetric;
  
  public Symmetric getSymmetric() {
    return this.symmetric;
  }
  
  public static int getKyberEta2() {
    return 2;
  }
  
  public static int getKyberIndCpaMsgBytes() {
    return 32;
  }
  
  public int getCryptoCipherTextBytes() {
    return this.CryptoCipherTextBytes;
  }
  
  public int getCryptoPublicKeyBytes() {
    return this.CryptoPublicKeyBytes;
  }
  
  public int getCryptoSecretKeyBytes() {
    return this.CryptoSecretKeyBytes;
  }
  
  public int getCryptoBytes() {
    return this.CryptoBytes;
  }
  
  public int getKyberCipherTextBytes() {
    return this.KyberCipherTextBytes;
  }
  
  public int getKyberSecretKeyBytes() {
    return this.KyberSecretKeyBytes;
  }
  
  public int getKyberIndCpaPublicKeyBytes() {
    return this.KyberIndCpaPublicKeyBytes;
  }
  
  public int getKyberIndCpaSecretKeyBytes() {
    return this.KyberIndCpaSecretKeyBytes;
  }
  
  public int getKyberIndCpaBytes() {
    return this.KyberIndCpaBytes;
  }
  
  public int getKyberPublicKeyBytes() {
    return this.KyberPublicKeyBytes;
  }
  
  public int getKyberPolyCompressedBytes() {
    return this.KyberPolyCompressedBytes;
  }
  
  public int getKyberK() {
    return this.KyberK;
  }
  
  public int getKyberPolyVecBytes() {
    return this.KyberPolyVecBytes;
  }
  
  public int getKyberPolyVecCompressedBytes() {
    return this.KyberPolyVecCompressedBytes;
  }
  
  public int getKyberEta1() {
    return this.KyberEta1;
  }
  
  public KyberEngine(int paramInt, boolean paramBoolean) {
    this.KyberK = paramInt;
    switch (paramInt) {
      case 2:
        this.KyberEta1 = 3;
        this.KyberPolyCompressedBytes = 128;
        this.KyberPolyVecCompressedBytes = paramInt * 320;
        this.sessionKeyLength = 32;
        break;
      case 3:
        this.KyberEta1 = 2;
        this.KyberPolyCompressedBytes = 128;
        this.KyberPolyVecCompressedBytes = paramInt * 320;
        this.sessionKeyLength = 32;
        break;
      case 4:
        this.KyberEta1 = 2;
        this.KyberPolyCompressedBytes = 160;
        this.KyberPolyVecCompressedBytes = paramInt * 352;
        this.sessionKeyLength = 32;
        break;
      default:
        throw new IllegalArgumentException("K: " + paramInt + " is not supported for Crystals Kyber");
    } 
    this.KyberPolyVecBytes = paramInt * 384;
    this.KyberIndCpaPublicKeyBytes = this.KyberPolyVecBytes + 32;
    this.KyberIndCpaSecretKeyBytes = this.KyberPolyVecBytes;
    this.KyberIndCpaBytes = this.KyberPolyVecCompressedBytes + this.KyberPolyCompressedBytes;
    this.KyberPublicKeyBytes = this.KyberIndCpaPublicKeyBytes;
    this.KyberSecretKeyBytes = this.KyberIndCpaSecretKeyBytes + this.KyberIndCpaPublicKeyBytes + 64;
    this.KyberCipherTextBytes = this.KyberIndCpaBytes;
    this.CryptoBytes = 32;
    this.CryptoSecretKeyBytes = this.KyberSecretKeyBytes;
    this.CryptoPublicKeyBytes = this.KyberPublicKeyBytes;
    this.CryptoCipherTextBytes = this.KyberCipherTextBytes;
    if (paramBoolean) {
      this.symmetric = (Symmetric)new Symmetric.AesSymmetric();
    } else {
      this.symmetric = (Symmetric)new Symmetric.ShakeSymmetric();
    } 
    this.indCpa = new KyberIndCpa(this);
  }
  
  public void init(SecureRandom paramSecureRandom) {
    this.random = paramSecureRandom;
  }
  
  public byte[][] generateKemKeyPair() {
    byte[][] arrayOfByte = this.indCpa.generateKeyPair();
    byte[] arrayOfByte1 = new byte[this.KyberIndCpaSecretKeyBytes];
    System.arraycopy(arrayOfByte[1], 0, arrayOfByte1, 0, this.KyberIndCpaSecretKeyBytes);
    byte[] arrayOfByte2 = new byte[32];
    this.symmetric.hash_h(arrayOfByte2, arrayOfByte[0], 0);
    byte[] arrayOfByte3 = new byte[32];
    this.random.nextBytes(arrayOfByte3);
    byte[] arrayOfByte4 = new byte[this.KyberIndCpaPublicKeyBytes];
    System.arraycopy(arrayOfByte[0], 0, arrayOfByte4, 0, this.KyberIndCpaPublicKeyBytes);
    return new byte[][] { Arrays.copyOfRange(arrayOfByte4, 0, arrayOfByte4.length - 32), Arrays.copyOfRange(arrayOfByte4, arrayOfByte4.length - 32, arrayOfByte4.length), arrayOfByte1, arrayOfByte2, arrayOfByte3 };
  }
  
  public byte[][] kemEncrypt(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != this.KyberIndCpaPublicKeyBytes)
      throw new IllegalArgumentException("Input validation Error: Type check failed for ml-kem encapsulation"); 
    PolyVec polyVec = new PolyVec(this);
    byte[] arrayOfByte1 = this.indCpa.unpackPublicKey(polyVec, paramArrayOfbyte);
    byte[] arrayOfByte2 = this.indCpa.packPublicKey(polyVec, arrayOfByte1);
    if (!Arrays.areEqual(arrayOfByte2, paramArrayOfbyte))
      throw new IllegalArgumentException("Input validation: Modulus check failed for ml-kem encapsulation"); 
    byte[] arrayOfByte4 = new byte[64];
    byte[] arrayOfByte5 = new byte[64];
    byte[] arrayOfByte6 = new byte[32];
    this.random.nextBytes(arrayOfByte6);
    System.arraycopy(arrayOfByte6, 0, arrayOfByte4, 0, 32);
    this.symmetric.hash_h(arrayOfByte4, paramArrayOfbyte, 32);
    this.symmetric.hash_g(arrayOfByte5, arrayOfByte4);
    byte[] arrayOfByte3 = this.indCpa.encrypt(Arrays.copyOfRange(arrayOfByte4, 0, 32), paramArrayOfbyte, Arrays.copyOfRange(arrayOfByte5, 32, arrayOfByte5.length));
    byte[] arrayOfByte7 = new byte[this.sessionKeyLength];
    System.arraycopy(arrayOfByte5, 0, arrayOfByte7, 0, arrayOfByte7.length);
    byte[][] arrayOfByte = new byte[2][];
    arrayOfByte[0] = arrayOfByte7;
    arrayOfByte[1] = arrayOfByte3;
    return arrayOfByte;
  }
  
  public byte[] kemDecrypt(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte1 = new byte[64];
    byte[] arrayOfByte2 = new byte[64];
    byte[] arrayOfByte3 = Arrays.copyOfRange(paramArrayOfbyte2, this.KyberIndCpaSecretKeyBytes, paramArrayOfbyte2.length);
    System.arraycopy(this.indCpa.decrypt(paramArrayOfbyte1, paramArrayOfbyte2), 0, arrayOfByte1, 0, 32);
    System.arraycopy(paramArrayOfbyte2, this.KyberSecretKeyBytes - 64, arrayOfByte1, 32, 32);
    this.symmetric.hash_g(arrayOfByte2, arrayOfByte1);
    byte[] arrayOfByte4 = this.indCpa.encrypt(Arrays.copyOfRange(arrayOfByte1, 0, 32), arrayOfByte3, Arrays.copyOfRange(arrayOfByte2, 32, arrayOfByte2.length));
    boolean bool = !Arrays.constantTimeAreEqual(paramArrayOfbyte1, arrayOfByte4) ? true : false;
    this.symmetric.hash_h(arrayOfByte2, paramArrayOfbyte1, 32);
    cmov(arrayOfByte2, Arrays.copyOfRange(paramArrayOfbyte2, this.KyberSecretKeyBytes - 32, this.KyberSecretKeyBytes), 32, bool);
    return Arrays.copyOfRange(arrayOfByte2, 0, this.sessionKeyLength);
  }
  
  private void cmov(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      System.arraycopy(paramArrayOfbyte2, 0, paramArrayOfbyte1, 0, paramInt);
    } else {
      System.arraycopy(paramArrayOfbyte1, 0, paramArrayOfbyte1, 0, paramInt);
    } 
  }
  
  public void getRandomBytes(byte[] paramArrayOfbyte) {
    this.random.nextBytes(paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\crystals\kyber\KyberEngine.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */