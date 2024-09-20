package org.bouncycastle.crypto.hpke;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.agreement.ECDHCBasicAgreement;
import org.bouncycastle.crypto.agreement.XDHBasicAgreement;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.generators.X25519KeyPairGenerator;
import org.bouncycastle.crypto.generators.X448KeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.X25519KeyGenerationParameters;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.crypto.params.X448KeyGenerationParameters;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.math.ec.custom.sec.SecP256R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecP384R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Curve;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

class DHKEM {
  private AsymmetricCipherKeyPairGenerator kpGen;
  
  private BasicAgreement agreement;
  
  private final short kemId;
  
  private HKDF hkdf;
  
  private byte bitmask;
  
  private int Nsk;
  
  private int Nsecret;
  
  ECDomainParameters domainParams;
  
  protected DHKEM(short paramShort) {
    SecP256R1Curve secP256R1Curve;
    SecP384R1Curve secP384R1Curve;
    SecP521R1Curve secP521R1Curve;
    this.kemId = paramShort;
    switch (paramShort) {
      case 16:
        this.hkdf = new HKDF((short)1);
        secP256R1Curve = new SecP256R1Curve();
        this.domainParams = new ECDomainParameters((ECCurve)secP256R1Curve, secP256R1Curve.createPoint(new BigInteger(1, Hex.decode("6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296")), new BigInteger(1, Hex.decode("4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5"))), secP256R1Curve.getOrder(), secP256R1Curve.getCofactor(), Hex.decode("c49d360886e704936a6678e1139d26b7819f7e90"));
        this.agreement = (BasicAgreement)new ECDHCBasicAgreement();
        this.bitmask = -1;
        this.Nsk = 32;
        this.Nsecret = 32;
        this.kpGen = (AsymmetricCipherKeyPairGenerator)new ECKeyPairGenerator();
        this.kpGen.init((KeyGenerationParameters)new ECKeyGenerationParameters(this.domainParams, new SecureRandom()));
        return;
      case 17:
        this.hkdf = new HKDF((short)2);
        secP384R1Curve = new SecP384R1Curve();
        this.domainParams = new ECDomainParameters((ECCurve)secP384R1Curve, secP384R1Curve.createPoint(new BigInteger(1, Hex.decode("aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7")), new BigInteger(1, Hex.decode("3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f"))), secP384R1Curve.getOrder(), secP384R1Curve.getCofactor(), Hex.decode("a335926aa319a27a1d00896a6773a4827acdac73"));
        this.agreement = (BasicAgreement)new ECDHCBasicAgreement();
        this.bitmask = -1;
        this.Nsk = 48;
        this.Nsecret = 48;
        this.kpGen = (AsymmetricCipherKeyPairGenerator)new ECKeyPairGenerator();
        this.kpGen.init((KeyGenerationParameters)new ECKeyGenerationParameters(this.domainParams, new SecureRandom()));
        return;
      case 18:
        this.hkdf = new HKDF((short)3);
        secP521R1Curve = new SecP521R1Curve();
        this.domainParams = new ECDomainParameters((ECCurve)secP521R1Curve, secP521R1Curve.createPoint(new BigInteger("c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", 16), new BigInteger("11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650", 16)), secP521R1Curve.getOrder(), secP521R1Curve.getCofactor(), Hex.decode("d09e8800291cb85396cc6717393284aaa0da64ba"));
        this.agreement = (BasicAgreement)new ECDHCBasicAgreement();
        this.bitmask = 1;
        this.Nsk = 66;
        this.Nsecret = 64;
        this.kpGen = (AsymmetricCipherKeyPairGenerator)new ECKeyPairGenerator();
        this.kpGen.init((KeyGenerationParameters)new ECKeyGenerationParameters(this.domainParams, new SecureRandom()));
        return;
      case 32:
        this.hkdf = new HKDF((short)1);
        this.agreement = (BasicAgreement)new XDHBasicAgreement();
        this.Nsecret = 32;
        this.Nsk = 32;
        this.kpGen = (AsymmetricCipherKeyPairGenerator)new X25519KeyPairGenerator();
        this.kpGen.init((KeyGenerationParameters)new X25519KeyGenerationParameters(new SecureRandom()));
        return;
      case 33:
        this.hkdf = new HKDF((short)3);
        this.agreement = (BasicAgreement)new XDHBasicAgreement();
        this.Nsecret = 64;
        this.Nsk = 56;
        this.kpGen = (AsymmetricCipherKeyPairGenerator)new X448KeyPairGenerator();
        this.kpGen.init((KeyGenerationParameters)new X448KeyGenerationParameters(new SecureRandom()));
        return;
    } 
    throw new IllegalArgumentException("invalid kem id");
  }
  
  public byte[] SerializePublicKey(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    switch (this.kemId) {
      case 16:
      case 17:
      case 18:
        return ((ECPublicKeyParameters)paramAsymmetricKeyParameter).getQ().getEncoded(false);
      case 33:
        return ((X448PublicKeyParameters)paramAsymmetricKeyParameter).getEncoded();
      case 32:
        return ((X25519PublicKeyParameters)paramAsymmetricKeyParameter).getEncoded();
    } 
    throw new IllegalStateException("invalid kem id");
  }
  
  public byte[] SerializePrivateKey(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    switch (this.kemId) {
      case 16:
      case 17:
      case 18:
        return formatBigIntegerBytes(((ECPrivateKeyParameters)paramAsymmetricKeyParameter).getD().toByteArray(), this.Nsk);
      case 33:
        return ((X448PrivateKeyParameters)paramAsymmetricKeyParameter).getEncoded();
      case 32:
        return ((X25519PrivateKeyParameters)paramAsymmetricKeyParameter).getEncoded();
    } 
    throw new IllegalStateException("invalid kem id");
  }
  
  public AsymmetricKeyParameter DeserializePublicKey(byte[] paramArrayOfbyte) {
    ECPoint eCPoint;
    switch (this.kemId) {
      case 16:
      case 17:
      case 18:
        eCPoint = this.domainParams.getCurve().decodePoint(paramArrayOfbyte);
        return (AsymmetricKeyParameter)new ECPublicKeyParameters(eCPoint, this.domainParams);
      case 33:
        return (AsymmetricKeyParameter)new X448PublicKeyParameters(paramArrayOfbyte);
      case 32:
        return (AsymmetricKeyParameter)new X25519PublicKeyParameters(paramArrayOfbyte);
    } 
    throw new IllegalStateException("invalid kem id");
  }
  
  public AsymmetricCipherKeyPair DeserializePrivateKey(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    ECPublicKeyParameters eCPublicKeyParameters;
    X448PublicKeyParameters x448PublicKeyParameters;
    X25519PublicKeyParameters x25519PublicKeyParameters;
    BigInteger bigInteger;
    ECPrivateKeyParameters eCPrivateKeyParameters;
    X448PrivateKeyParameters x448PrivateKeyParameters;
    X25519PrivateKeyParameters x25519PrivateKeyParameters;
    AsymmetricKeyParameter asymmetricKeyParameter = null;
    if (paramArrayOfbyte2 != null)
      asymmetricKeyParameter = DeserializePublicKey(paramArrayOfbyte2); 
    switch (this.kemId) {
      case 16:
      case 17:
      case 18:
        bigInteger = new BigInteger(1, paramArrayOfbyte1);
        eCPrivateKeyParameters = new ECPrivateKeyParameters(bigInteger, this.domainParams);
        if (asymmetricKeyParameter == null) {
          ECPoint eCPoint = (new FixedPointCombMultiplier()).multiply(this.domainParams.getG(), eCPrivateKeyParameters.getD());
          eCPublicKeyParameters = new ECPublicKeyParameters(eCPoint, this.domainParams);
        } 
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter)eCPublicKeyParameters, (AsymmetricKeyParameter)eCPrivateKeyParameters);
      case 33:
        x448PrivateKeyParameters = new X448PrivateKeyParameters(paramArrayOfbyte1);
        if (eCPublicKeyParameters == null)
          x448PublicKeyParameters = x448PrivateKeyParameters.generatePublicKey(); 
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter)x448PublicKeyParameters, (AsymmetricKeyParameter)x448PrivateKeyParameters);
      case 32:
        x25519PrivateKeyParameters = new X25519PrivateKeyParameters(paramArrayOfbyte1);
        if (x448PublicKeyParameters == null)
          x25519PublicKeyParameters = x25519PrivateKeyParameters.generatePublicKey(); 
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter)x25519PublicKeyParameters, (AsymmetricKeyParameter)x25519PrivateKeyParameters);
    } 
    throw new IllegalStateException("invalid kem id");
  }
  
  private boolean ValidateSk(BigInteger paramBigInteger) {
    BigInteger bigInteger = this.domainParams.getN();
    int i = bigInteger.bitLength();
    int j = i >>> 2;
    return (paramBigInteger.compareTo(BigInteger.valueOf(1L)) < 0 || paramBigInteger.compareTo(bigInteger) >= 0) ? false : (!(WNafUtil.getNafWeight(paramBigInteger) < j));
  }
  
  public AsymmetricCipherKeyPair GeneratePrivateKey() {
    return this.kpGen.generateKeyPair();
  }
  
  public AsymmetricCipherKeyPair DeriveKeyPair(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte2;
    byte b;
    byte[] arrayOfByte3;
    byte[] arrayOfByte4;
    X448PrivateKeyParameters x448PrivateKeyParameters;
    byte[] arrayOfByte5;
    X25519PrivateKeyParameters x25519PrivateKeyParameters;
    byte[] arrayOfByte1 = Arrays.concatenate(Strings.toByteArray("KEM"), Pack.shortToBigEndian(this.kemId));
    switch (this.kemId) {
      case 16:
      case 17:
      case 18:
        arrayOfByte2 = this.hkdf.LabeledExtract(null, arrayOfByte1, "dkp_prk", paramArrayOfbyte);
        b = 0;
        arrayOfByte3 = new byte[1];
        while (true) {
          if (b > 'ÿ')
            throw new IllegalStateException("DeriveKeyPairError"); 
          arrayOfByte3[0] = (byte)b;
          byte[] arrayOfByte = this.hkdf.LabeledExpand(arrayOfByte2, arrayOfByte1, "candidate", arrayOfByte3, this.Nsk);
          arrayOfByte[0] = (byte)(arrayOfByte[0] & this.bitmask);
          BigInteger bigInteger = new BigInteger(1, arrayOfByte);
          if (ValidateSk(bigInteger)) {
            ECPoint eCPoint = (new FixedPointCombMultiplier()).multiply(this.domainParams.getG(), bigInteger);
            ECPrivateKeyParameters eCPrivateKeyParameters = new ECPrivateKeyParameters(bigInteger, this.domainParams);
            ECPublicKeyParameters eCPublicKeyParameters = new ECPublicKeyParameters(eCPoint, this.domainParams);
            return new AsymmetricCipherKeyPair((AsymmetricKeyParameter)eCPublicKeyParameters, (AsymmetricKeyParameter)eCPrivateKeyParameters);
          } 
          b++;
        } 
      case 33:
        arrayOfByte2 = this.hkdf.LabeledExtract(null, arrayOfByte1, "dkp_prk", paramArrayOfbyte);
        arrayOfByte4 = this.hkdf.LabeledExpand(arrayOfByte2, arrayOfByte1, "sk", null, this.Nsk);
        x448PrivateKeyParameters = new X448PrivateKeyParameters(arrayOfByte4);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter)x448PrivateKeyParameters.generatePublicKey(), (AsymmetricKeyParameter)x448PrivateKeyParameters);
      case 32:
        arrayOfByte2 = this.hkdf.LabeledExtract(null, arrayOfByte1, "dkp_prk", paramArrayOfbyte);
        arrayOfByte5 = this.hkdf.LabeledExpand(arrayOfByte2, arrayOfByte1, "sk", null, this.Nsk);
        x25519PrivateKeyParameters = new X25519PrivateKeyParameters(arrayOfByte5);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter)x25519PrivateKeyParameters.generatePublicKey(), (AsymmetricKeyParameter)x25519PrivateKeyParameters);
    } 
    throw new IllegalStateException("invalid kem id");
  }
  
  protected byte[][] Encap(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    return Encap(paramAsymmetricKeyParameter, this.kpGen.generateKeyPair());
  }
  
  protected byte[][] Encap(AsymmetricKeyParameter paramAsymmetricKeyParameter, AsymmetricCipherKeyPair paramAsymmetricCipherKeyPair) {
    byte[][] arrayOfByte = new byte[2][];
    this.agreement.init((CipherParameters)paramAsymmetricCipherKeyPair.getPrivate());
    byte[] arrayOfByte1 = this.agreement.calculateAgreement((CipherParameters)paramAsymmetricKeyParameter).toByteArray();
    byte[] arrayOfByte2 = formatBigIntegerBytes(arrayOfByte1, this.agreement.getFieldSize());
    byte[] arrayOfByte3 = SerializePublicKey(paramAsymmetricCipherKeyPair.getPublic());
    byte[] arrayOfByte4 = SerializePublicKey(paramAsymmetricKeyParameter);
    byte[] arrayOfByte5 = Arrays.concatenate(arrayOfByte3, arrayOfByte4);
    byte[] arrayOfByte6 = ExtractAndExpand(arrayOfByte2, arrayOfByte5);
    arrayOfByte[0] = arrayOfByte6;
    arrayOfByte[1] = arrayOfByte3;
    return arrayOfByte;
  }
  
  protected byte[] Decap(byte[] paramArrayOfbyte, AsymmetricCipherKeyPair paramAsymmetricCipherKeyPair) {
    AsymmetricKeyParameter asymmetricKeyParameter = DeserializePublicKey(paramArrayOfbyte);
    this.agreement.init((CipherParameters)paramAsymmetricCipherKeyPair.getPrivate());
    byte[] arrayOfByte1 = this.agreement.calculateAgreement((CipherParameters)asymmetricKeyParameter).toByteArray();
    byte[] arrayOfByte2 = formatBigIntegerBytes(arrayOfByte1, this.agreement.getFieldSize());
    byte[] arrayOfByte3 = SerializePublicKey(paramAsymmetricCipherKeyPair.getPublic());
    byte[] arrayOfByte4 = Arrays.concatenate(paramArrayOfbyte, arrayOfByte3);
    return ExtractAndExpand(arrayOfByte2, arrayOfByte4);
  }
  
  protected byte[][] AuthEncap(AsymmetricKeyParameter paramAsymmetricKeyParameter, AsymmetricCipherKeyPair paramAsymmetricCipherKeyPair) {
    byte[][] arrayOfByte = new byte[2][];
    AsymmetricCipherKeyPair asymmetricCipherKeyPair = this.kpGen.generateKeyPair();
    this.agreement.init((CipherParameters)asymmetricCipherKeyPair.getPrivate());
    byte[] arrayOfByte1 = this.agreement.calculateAgreement((CipherParameters)paramAsymmetricKeyParameter).toByteArray();
    byte[] arrayOfByte2 = formatBigIntegerBytes(arrayOfByte1, this.agreement.getFieldSize());
    this.agreement.init((CipherParameters)paramAsymmetricCipherKeyPair.getPrivate());
    arrayOfByte1 = this.agreement.calculateAgreement((CipherParameters)paramAsymmetricKeyParameter).toByteArray();
    byte[] arrayOfByte3 = formatBigIntegerBytes(arrayOfByte1, this.agreement.getFieldSize());
    byte[] arrayOfByte4 = Arrays.concatenate(arrayOfByte2, arrayOfByte3);
    byte[] arrayOfByte5 = SerializePublicKey(asymmetricCipherKeyPair.getPublic());
    byte[] arrayOfByte6 = SerializePublicKey(paramAsymmetricKeyParameter);
    byte[] arrayOfByte7 = SerializePublicKey(paramAsymmetricCipherKeyPair.getPublic());
    byte[] arrayOfByte8 = Arrays.concatenate(arrayOfByte5, arrayOfByte6, arrayOfByte7);
    byte[] arrayOfByte9 = ExtractAndExpand(arrayOfByte4, arrayOfByte8);
    arrayOfByte[0] = arrayOfByte9;
    arrayOfByte[1] = arrayOfByte5;
    return arrayOfByte;
  }
  
  protected byte[] AuthDecap(byte[] paramArrayOfbyte, AsymmetricCipherKeyPair paramAsymmetricCipherKeyPair, AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    AsymmetricKeyParameter asymmetricKeyParameter = DeserializePublicKey(paramArrayOfbyte);
    this.agreement.init((CipherParameters)paramAsymmetricCipherKeyPair.getPrivate());
    byte[] arrayOfByte1 = this.agreement.calculateAgreement((CipherParameters)asymmetricKeyParameter).toByteArray();
    byte[] arrayOfByte2 = formatBigIntegerBytes(arrayOfByte1, this.agreement.getFieldSize());
    this.agreement.init((CipherParameters)paramAsymmetricCipherKeyPair.getPrivate());
    arrayOfByte1 = this.agreement.calculateAgreement((CipherParameters)paramAsymmetricKeyParameter).toByteArray();
    byte[] arrayOfByte3 = formatBigIntegerBytes(arrayOfByte1, this.agreement.getFieldSize());
    byte[] arrayOfByte4 = Arrays.concatenate(arrayOfByte2, arrayOfByte3);
    byte[] arrayOfByte5 = SerializePublicKey(paramAsymmetricCipherKeyPair.getPublic());
    byte[] arrayOfByte6 = SerializePublicKey(paramAsymmetricKeyParameter);
    byte[] arrayOfByte7 = Arrays.concatenate(paramArrayOfbyte, arrayOfByte5, arrayOfByte6);
    return ExtractAndExpand(arrayOfByte4, arrayOfByte7);
  }
  
  private byte[] ExtractAndExpand(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte1 = Arrays.concatenate(Strings.toByteArray("KEM"), Pack.shortToBigEndian(this.kemId));
    byte[] arrayOfByte2 = this.hkdf.LabeledExtract(null, arrayOfByte1, "eae_prk", paramArrayOfbyte1);
    return this.hkdf.LabeledExpand(arrayOfByte2, arrayOfByte1, "shared_secret", paramArrayOfbyte2, this.Nsecret);
  }
  
  private byte[] formatBigIntegerBytes(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    if (paramArrayOfbyte.length <= paramInt) {
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, paramInt - paramArrayOfbyte.length, paramArrayOfbyte.length);
    } else {
      System.arraycopy(paramArrayOfbyte, paramArrayOfbyte.length - paramInt, arrayOfByte, 0, paramInt);
    } 
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\hpke\DHKEM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */