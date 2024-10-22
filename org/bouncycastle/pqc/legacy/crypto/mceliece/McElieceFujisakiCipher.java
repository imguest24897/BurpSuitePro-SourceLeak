package org.bouncycastle.pqc.legacy.crypto.mceliece;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.prng.DigestRandomGenerator;
import org.bouncycastle.pqc.crypto.MessageEncryptor;
import org.bouncycastle.pqc.legacy.math.linearalgebra.ByteUtils;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Vector;

public class McElieceFujisakiCipher implements MessageEncryptor {
  public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.1";
  
  private static final String DEFAULT_PRNG_NAME = "SHA1PRNG";
  
  private Digest messDigest;
  
  private SecureRandom sr;
  
  private int n;
  
  private int k;
  
  private int t;
  
  McElieceCCA2KeyParameters key;
  
  private boolean forEncryption;
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    this.forEncryption = paramBoolean;
    if (paramBoolean) {
      if (paramCipherParameters instanceof ParametersWithRandom) {
        ParametersWithRandom parametersWithRandom = (ParametersWithRandom)paramCipherParameters;
        this.sr = parametersWithRandom.getRandom();
        this.key = (McElieceCCA2PublicKeyParameters)parametersWithRandom.getParameters();
        initCipherEncrypt((McElieceCCA2PublicKeyParameters)this.key);
      } else {
        this.sr = CryptoServicesRegistrar.getSecureRandom();
        this.key = (McElieceCCA2PublicKeyParameters)paramCipherParameters;
        initCipherEncrypt((McElieceCCA2PublicKeyParameters)this.key);
      } 
    } else {
      this.key = (McElieceCCA2PrivateKeyParameters)paramCipherParameters;
      initCipherDecrypt((McElieceCCA2PrivateKeyParameters)this.key);
    } 
  }
  
  public int getKeySize(McElieceCCA2KeyParameters paramMcElieceCCA2KeyParameters) throws IllegalArgumentException {
    if (paramMcElieceCCA2KeyParameters instanceof McElieceCCA2PublicKeyParameters)
      return ((McElieceCCA2PublicKeyParameters)paramMcElieceCCA2KeyParameters).getN(); 
    if (paramMcElieceCCA2KeyParameters instanceof McElieceCCA2PrivateKeyParameters)
      return ((McElieceCCA2PrivateKeyParameters)paramMcElieceCCA2KeyParameters).getN(); 
    throw new IllegalArgumentException("unsupported type");
  }
  
  private void initCipherEncrypt(McElieceCCA2PublicKeyParameters paramMcElieceCCA2PublicKeyParameters) {
    this.messDigest = Utils.getDigest(paramMcElieceCCA2PublicKeyParameters.getDigest());
    this.n = paramMcElieceCCA2PublicKeyParameters.getN();
    this.k = paramMcElieceCCA2PublicKeyParameters.getK();
    this.t = paramMcElieceCCA2PublicKeyParameters.getT();
  }
  
  private void initCipherDecrypt(McElieceCCA2PrivateKeyParameters paramMcElieceCCA2PrivateKeyParameters) {
    this.messDigest = Utils.getDigest(paramMcElieceCCA2PrivateKeyParameters.getDigest());
    this.n = paramMcElieceCCA2PrivateKeyParameters.getN();
    this.t = paramMcElieceCCA2PrivateKeyParameters.getT();
  }
  
  public byte[] messageEncrypt(byte[] paramArrayOfbyte) {
    if (!this.forEncryption)
      throw new IllegalStateException("cipher initialised for decryption"); 
    GF2Vector gF2Vector1 = new GF2Vector(this.k, this.sr);
    byte[] arrayOfByte1 = gF2Vector1.getEncoded();
    byte[] arrayOfByte2 = ByteUtils.concatenate(arrayOfByte1, paramArrayOfbyte);
    this.messDigest.update(arrayOfByte2, 0, arrayOfByte2.length);
    byte[] arrayOfByte3 = new byte[this.messDigest.getDigestSize()];
    this.messDigest.doFinal(arrayOfByte3, 0);
    GF2Vector gF2Vector2 = Conversions.encode(this.n, this.t, arrayOfByte3);
    byte[] arrayOfByte4 = McElieceCCA2Primitives.encryptionPrimitive((McElieceCCA2PublicKeyParameters)this.key, gF2Vector1, gF2Vector2).getEncoded();
    DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator((Digest)new SHA1Digest());
    digestRandomGenerator.addSeedMaterial(arrayOfByte1);
    byte[] arrayOfByte5 = new byte[paramArrayOfbyte.length];
    digestRandomGenerator.nextBytes(arrayOfByte5);
    for (byte b = 0; b < paramArrayOfbyte.length; b++)
      arrayOfByte5[b] = (byte)(arrayOfByte5[b] ^ paramArrayOfbyte[b]); 
    return ByteUtils.concatenate(arrayOfByte4, arrayOfByte5);
  }
  
  public byte[] messageDecrypt(byte[] paramArrayOfbyte) throws InvalidCipherTextException {
    if (this.forEncryption)
      throw new IllegalStateException("cipher initialised for decryption"); 
    int i = this.n + 7 >> 3;
    int j = paramArrayOfbyte.length - i;
    byte[][] arrayOfByte = ByteUtils.split(paramArrayOfbyte, i);
    byte[] arrayOfByte1 = arrayOfByte[0];
    byte[] arrayOfByte2 = arrayOfByte[1];
    GF2Vector gF2Vector1 = GF2Vector.OS2VP(this.n, arrayOfByte1);
    GF2Vector[] arrayOfGF2Vector = McElieceCCA2Primitives.decryptionPrimitive((McElieceCCA2PrivateKeyParameters)this.key, gF2Vector1);
    byte[] arrayOfByte3 = arrayOfGF2Vector[0].getEncoded();
    GF2Vector gF2Vector2 = arrayOfGF2Vector[1];
    DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator((Digest)new SHA1Digest());
    digestRandomGenerator.addSeedMaterial(arrayOfByte3);
    byte[] arrayOfByte4 = new byte[j];
    digestRandomGenerator.nextBytes(arrayOfByte4);
    for (byte b = 0; b < j; b++)
      arrayOfByte4[b] = (byte)(arrayOfByte4[b] ^ arrayOfByte2[b]); 
    byte[] arrayOfByte5 = ByteUtils.concatenate(arrayOfByte3, arrayOfByte4);
    byte[] arrayOfByte6 = new byte[this.messDigest.getDigestSize()];
    this.messDigest.update(arrayOfByte5, 0, arrayOfByte5.length);
    this.messDigest.doFinal(arrayOfByte6, 0);
    gF2Vector1 = Conversions.encode(this.n, this.t, arrayOfByte6);
    if (!gF2Vector1.equals(gF2Vector2))
      throw new InvalidCipherTextException("Bad Padding: invalid ciphertext"); 
    return arrayOfByte4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\mceliece\McElieceFujisakiCipher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */