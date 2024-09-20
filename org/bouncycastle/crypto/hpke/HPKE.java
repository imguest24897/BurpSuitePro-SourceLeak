package org.bouncycastle.crypto.hpke;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;

public class HPKE {
  public static final byte mode_base = 0;
  
  public static final byte mode_psk = 1;
  
  public static final byte mode_auth = 2;
  
  public static final byte mode_auth_psk = 3;
  
  public static final short kem_P256_SHA256 = 16;
  
  public static final short kem_P384_SHA348 = 17;
  
  public static final short kem_P521_SHA512 = 18;
  
  public static final short kem_X25519_SHA256 = 32;
  
  public static final short kem_X448_SHA512 = 33;
  
  public static final short kdf_HKDF_SHA256 = 1;
  
  public static final short kdf_HKDF_SHA384 = 2;
  
  public static final short kdf_HKDF_SHA512 = 3;
  
  public static final short aead_AES_GCM128 = 1;
  
  public static final short aead_AES_GCM256 = 2;
  
  public static final short aead_CHACHA20_POLY1305 = 3;
  
  public static final short aead_EXPORT_ONLY = -1;
  
  private final byte[] default_psk = null;
  
  private final byte[] default_psk_id = null;
  
  private final byte mode;
  
  private final short kemId;
  
  private final short kdfId;
  
  private final short aeadId;
  
  private final DHKEM dhkem;
  
  private final HKDF hkdf;
  
  short Nk;
  
  public HPKE(byte paramByte, short paramShort1, short paramShort2, short paramShort3) {
    this.mode = paramByte;
    this.kemId = paramShort1;
    this.kdfId = paramShort2;
    this.aeadId = paramShort3;
    this.hkdf = new HKDF(paramShort2);
    this.dhkem = new DHKEM(paramShort1);
    if (paramShort3 == 1) {
      this.Nk = 16;
    } else {
      this.Nk = 32;
    } 
  }
  
  public int getEncSize() {
    switch (this.kemId) {
      case 16:
        return 65;
      case 17:
        return 97;
      case 18:
        return 133;
      case 32:
        return 32;
      case 33:
        return 56;
    } 
    throw new IllegalArgumentException("invalid kem id");
  }
  
  public short getAeadId() {
    return this.aeadId;
  }
  
  private void VerifyPSKInputs(byte paramByte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    boolean bool1 = !Arrays.areEqual(paramArrayOfbyte1, this.default_psk) ? true : false;
    boolean bool2 = !Arrays.areEqual(paramArrayOfbyte2, this.default_psk_id) ? true : false;
    if (bool1 != bool2)
      throw new IllegalArgumentException("Inconsistent PSK inputs"); 
    if (bool1 && paramByte % 2 == 0)
      throw new IllegalArgumentException("PSK input provided when not needed"); 
    if (!bool1 && paramByte % 2 == 1)
      throw new IllegalArgumentException("Missing required PSK input"); 
  }
  
  private HPKEContext keySchedule(byte paramByte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    VerifyPSKInputs(paramByte, paramArrayOfbyte3, paramArrayOfbyte4);
    byte[] arrayOfByte1 = Arrays.concatenate(Strings.toByteArray("HPKE"), Pack.shortToBigEndian(this.kemId), Pack.shortToBigEndian(this.kdfId), Pack.shortToBigEndian(this.aeadId));
    byte[] arrayOfByte2 = this.hkdf.LabeledExtract(null, arrayOfByte1, "psk_id_hash", paramArrayOfbyte4);
    byte[] arrayOfByte3 = this.hkdf.LabeledExtract(null, arrayOfByte1, "info_hash", paramArrayOfbyte2);
    byte[] arrayOfByte4 = new byte[1];
    arrayOfByte4[0] = paramByte;
    byte[] arrayOfByte5 = Arrays.concatenate(arrayOfByte4, arrayOfByte2, arrayOfByte3);
    byte[] arrayOfByte6 = this.hkdf.LabeledExtract(paramArrayOfbyte1, arrayOfByte1, "secret", paramArrayOfbyte3);
    byte[] arrayOfByte7 = this.hkdf.LabeledExpand(arrayOfByte6, arrayOfByte1, "key", arrayOfByte5, this.Nk);
    byte[] arrayOfByte8 = this.hkdf.LabeledExpand(arrayOfByte6, arrayOfByte1, "base_nonce", arrayOfByte5, 12);
    byte[] arrayOfByte9 = this.hkdf.LabeledExpand(arrayOfByte6, arrayOfByte1, "exp", arrayOfByte5, this.hkdf.getHashSize());
    return new HPKEContext(new AEAD(this.aeadId, arrayOfByte7, arrayOfByte8), this.hkdf, arrayOfByte9, arrayOfByte1);
  }
  
  public AsymmetricCipherKeyPair generatePrivateKey() {
    return this.dhkem.GeneratePrivateKey();
  }
  
  public byte[] serializePublicKey(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    return this.dhkem.SerializePublicKey(paramAsymmetricKeyParameter);
  }
  
  public byte[] serializePrivateKey(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    return this.dhkem.SerializePrivateKey(paramAsymmetricKeyParameter);
  }
  
  public AsymmetricKeyParameter deserializePublicKey(byte[] paramArrayOfbyte) {
    return this.dhkem.DeserializePublicKey(paramArrayOfbyte);
  }
  
  public AsymmetricCipherKeyPair deserializePrivateKey(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return this.dhkem.DeserializePrivateKey(paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  public AsymmetricCipherKeyPair deriveKeyPair(byte[] paramArrayOfbyte) {
    return this.dhkem.DeriveKeyPair(paramArrayOfbyte);
  }
  
  public byte[][] sendExport(AsymmetricKeyParameter paramAsymmetricKeyParameter, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, AsymmetricCipherKeyPair paramAsymmetricCipherKeyPair) {
    HPKEContextWithEncapsulation hPKEContextWithEncapsulation;
    byte[][] arrayOfByte = new byte[2][];
    switch (this.mode) {
      case 0:
        hPKEContextWithEncapsulation = setupBaseS(paramAsymmetricKeyParameter, paramArrayOfbyte1);
        arrayOfByte[0] = hPKEContextWithEncapsulation.encapsulation;
        arrayOfByte[1] = hPKEContextWithEncapsulation.export(paramArrayOfbyte2, paramInt);
        return arrayOfByte;
      case 2:
        hPKEContextWithEncapsulation = setupAuthS(paramAsymmetricKeyParameter, paramArrayOfbyte1, paramAsymmetricCipherKeyPair);
        arrayOfByte[0] = hPKEContextWithEncapsulation.encapsulation;
        arrayOfByte[1] = hPKEContextWithEncapsulation.export(paramArrayOfbyte2, paramInt);
        return arrayOfByte;
      case 1:
        hPKEContextWithEncapsulation = SetupPSKS(paramAsymmetricKeyParameter, paramArrayOfbyte1, paramArrayOfbyte3, paramArrayOfbyte4);
        arrayOfByte[0] = hPKEContextWithEncapsulation.encapsulation;
        arrayOfByte[1] = hPKEContextWithEncapsulation.export(paramArrayOfbyte2, paramInt);
        return arrayOfByte;
      case 3:
        hPKEContextWithEncapsulation = setupAuthPSKS(paramAsymmetricKeyParameter, paramArrayOfbyte1, paramArrayOfbyte3, paramArrayOfbyte4, paramAsymmetricCipherKeyPair);
        arrayOfByte[0] = hPKEContextWithEncapsulation.encapsulation;
        arrayOfByte[1] = hPKEContextWithEncapsulation.export(paramArrayOfbyte2, paramInt);
        return arrayOfByte;
    } 
    throw new IllegalStateException("Unknown mode");
  }
  
  public byte[] receiveExport(byte[] paramArrayOfbyte1, AsymmetricCipherKeyPair paramAsymmetricCipherKeyPair, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int paramInt, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5, AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    HPKEContext hPKEContext;
    switch (this.mode) {
      case 0:
        hPKEContext = setupBaseR(paramArrayOfbyte1, paramAsymmetricCipherKeyPair, paramArrayOfbyte2);
        return hPKEContext.export(paramArrayOfbyte3, paramInt);
      case 2:
        hPKEContext = setupAuthR(paramArrayOfbyte1, paramAsymmetricCipherKeyPair, paramArrayOfbyte2, paramAsymmetricKeyParameter);
        return hPKEContext.export(paramArrayOfbyte3, paramInt);
      case 1:
        hPKEContext = setupPSKR(paramArrayOfbyte1, paramAsymmetricCipherKeyPair, paramArrayOfbyte2, paramArrayOfbyte4, paramArrayOfbyte5);
        return hPKEContext.export(paramArrayOfbyte3, paramInt);
      case 3:
        hPKEContext = setupAuthPSKR(paramArrayOfbyte1, paramAsymmetricCipherKeyPair, paramArrayOfbyte2, paramArrayOfbyte4, paramArrayOfbyte5, paramAsymmetricKeyParameter);
        return hPKEContext.export(paramArrayOfbyte3, paramInt);
    } 
    throw new IllegalStateException("Unknown mode");
  }
  
  public byte[][] seal(AsymmetricKeyParameter paramAsymmetricKeyParameter, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5, AsymmetricCipherKeyPair paramAsymmetricCipherKeyPair) throws InvalidCipherTextException {
    HPKEContextWithEncapsulation hPKEContextWithEncapsulation;
    byte[][] arrayOfByte = new byte[2][];
    switch (this.mode) {
      case 0:
        hPKEContextWithEncapsulation = setupBaseS(paramAsymmetricKeyParameter, paramArrayOfbyte1);
        arrayOfByte[0] = hPKEContextWithEncapsulation.seal(paramArrayOfbyte2, paramArrayOfbyte3);
        arrayOfByte[1] = hPKEContextWithEncapsulation.getEncapsulation();
        return arrayOfByte;
      case 2:
        hPKEContextWithEncapsulation = setupAuthS(paramAsymmetricKeyParameter, paramArrayOfbyte1, paramAsymmetricCipherKeyPair);
        arrayOfByte[0] = hPKEContextWithEncapsulation.seal(paramArrayOfbyte2, paramArrayOfbyte3);
        arrayOfByte[1] = hPKEContextWithEncapsulation.getEncapsulation();
        return arrayOfByte;
      case 1:
        hPKEContextWithEncapsulation = SetupPSKS(paramAsymmetricKeyParameter, paramArrayOfbyte1, paramArrayOfbyte4, paramArrayOfbyte5);
        arrayOfByte[0] = hPKEContextWithEncapsulation.seal(paramArrayOfbyte2, paramArrayOfbyte3);
        arrayOfByte[1] = hPKEContextWithEncapsulation.getEncapsulation();
        return arrayOfByte;
      case 3:
        hPKEContextWithEncapsulation = setupAuthPSKS(paramAsymmetricKeyParameter, paramArrayOfbyte1, paramArrayOfbyte4, paramArrayOfbyte5, paramAsymmetricCipherKeyPair);
        arrayOfByte[0] = hPKEContextWithEncapsulation.seal(paramArrayOfbyte2, paramArrayOfbyte3);
        arrayOfByte[1] = hPKEContextWithEncapsulation.getEncapsulation();
        return arrayOfByte;
    } 
    throw new IllegalStateException("Unknown mode");
  }
  
  public byte[] open(byte[] paramArrayOfbyte1, AsymmetricCipherKeyPair paramAsymmetricCipherKeyPair, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5, byte[] paramArrayOfbyte6, AsymmetricKeyParameter paramAsymmetricKeyParameter) throws InvalidCipherTextException {
    HPKEContext hPKEContext;
    switch (this.mode) {
      case 0:
        hPKEContext = setupBaseR(paramArrayOfbyte1, paramAsymmetricCipherKeyPair, paramArrayOfbyte2);
        return hPKEContext.open(paramArrayOfbyte3, paramArrayOfbyte4);
      case 2:
        hPKEContext = setupAuthR(paramArrayOfbyte1, paramAsymmetricCipherKeyPair, paramArrayOfbyte2, paramAsymmetricKeyParameter);
        return hPKEContext.open(paramArrayOfbyte3, paramArrayOfbyte4);
      case 1:
        hPKEContext = setupPSKR(paramArrayOfbyte1, paramAsymmetricCipherKeyPair, paramArrayOfbyte2, paramArrayOfbyte5, paramArrayOfbyte6);
        return hPKEContext.open(paramArrayOfbyte3, paramArrayOfbyte4);
      case 3:
        hPKEContext = setupAuthPSKR(paramArrayOfbyte1, paramAsymmetricCipherKeyPair, paramArrayOfbyte2, paramArrayOfbyte5, paramArrayOfbyte6, paramAsymmetricKeyParameter);
        return hPKEContext.open(paramArrayOfbyte3, paramArrayOfbyte4);
    } 
    throw new IllegalStateException("Unknown mode");
  }
  
  public HPKEContextWithEncapsulation setupBaseS(AsymmetricKeyParameter paramAsymmetricKeyParameter, byte[] paramArrayOfbyte) {
    byte[][] arrayOfByte = this.dhkem.Encap(paramAsymmetricKeyParameter);
    HPKEContext hPKEContext = keySchedule((byte)0, arrayOfByte[0], paramArrayOfbyte, this.default_psk, this.default_psk_id);
    return new HPKEContextWithEncapsulation(hPKEContext, arrayOfByte[1]);
  }
  
  public HPKEContextWithEncapsulation setupBaseS(AsymmetricKeyParameter paramAsymmetricKeyParameter, byte[] paramArrayOfbyte, AsymmetricCipherKeyPair paramAsymmetricCipherKeyPair) {
    byte[][] arrayOfByte = this.dhkem.Encap(paramAsymmetricKeyParameter, paramAsymmetricCipherKeyPair);
    HPKEContext hPKEContext = keySchedule((byte)0, arrayOfByte[0], paramArrayOfbyte, this.default_psk, this.default_psk_id);
    return new HPKEContextWithEncapsulation(hPKEContext, arrayOfByte[1]);
  }
  
  public HPKEContext setupBaseR(byte[] paramArrayOfbyte1, AsymmetricCipherKeyPair paramAsymmetricCipherKeyPair, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte = this.dhkem.Decap(paramArrayOfbyte1, paramAsymmetricCipherKeyPair);
    return keySchedule((byte)0, arrayOfByte, paramArrayOfbyte2, this.default_psk, this.default_psk_id);
  }
  
  public HPKEContextWithEncapsulation SetupPSKS(AsymmetricKeyParameter paramAsymmetricKeyParameter, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    byte[][] arrayOfByte = this.dhkem.Encap(paramAsymmetricKeyParameter);
    HPKEContext hPKEContext = keySchedule((byte)1, arrayOfByte[0], paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3);
    return new HPKEContextWithEncapsulation(hPKEContext, arrayOfByte[1]);
  }
  
  public HPKEContext setupPSKR(byte[] paramArrayOfbyte1, AsymmetricCipherKeyPair paramAsymmetricCipherKeyPair, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    byte[] arrayOfByte = this.dhkem.Decap(paramArrayOfbyte1, paramAsymmetricCipherKeyPair);
    return keySchedule((byte)1, arrayOfByte, paramArrayOfbyte2, paramArrayOfbyte3, paramArrayOfbyte4);
  }
  
  public HPKEContextWithEncapsulation setupAuthS(AsymmetricKeyParameter paramAsymmetricKeyParameter, byte[] paramArrayOfbyte, AsymmetricCipherKeyPair paramAsymmetricCipherKeyPair) {
    byte[][] arrayOfByte = this.dhkem.AuthEncap(paramAsymmetricKeyParameter, paramAsymmetricCipherKeyPair);
    HPKEContext hPKEContext = keySchedule((byte)2, arrayOfByte[0], paramArrayOfbyte, this.default_psk, this.default_psk_id);
    return new HPKEContextWithEncapsulation(hPKEContext, arrayOfByte[1]);
  }
  
  public HPKEContext setupAuthR(byte[] paramArrayOfbyte1, AsymmetricCipherKeyPair paramAsymmetricCipherKeyPair, byte[] paramArrayOfbyte2, AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    byte[] arrayOfByte = this.dhkem.AuthDecap(paramArrayOfbyte1, paramAsymmetricCipherKeyPair, paramAsymmetricKeyParameter);
    return keySchedule((byte)2, arrayOfByte, paramArrayOfbyte2, this.default_psk, this.default_psk_id);
  }
  
  public HPKEContextWithEncapsulation setupAuthPSKS(AsymmetricKeyParameter paramAsymmetricKeyParameter, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, AsymmetricCipherKeyPair paramAsymmetricCipherKeyPair) {
    byte[][] arrayOfByte = this.dhkem.AuthEncap(paramAsymmetricKeyParameter, paramAsymmetricCipherKeyPair);
    HPKEContext hPKEContext = keySchedule((byte)3, arrayOfByte[0], paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3);
    return new HPKEContextWithEncapsulation(hPKEContext, arrayOfByte[1]);
  }
  
  public HPKEContext setupAuthPSKR(byte[] paramArrayOfbyte1, AsymmetricCipherKeyPair paramAsymmetricCipherKeyPair, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    byte[] arrayOfByte = this.dhkem.AuthDecap(paramArrayOfbyte1, paramAsymmetricCipherKeyPair, paramAsymmetricKeyParameter);
    return keySchedule((byte)3, arrayOfByte, paramArrayOfbyte2, paramArrayOfbyte3, paramArrayOfbyte4);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\hpke\HPKE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */