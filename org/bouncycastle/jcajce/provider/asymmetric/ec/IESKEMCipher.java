package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.EphemeralKeyPair;
import org.bouncycastle.crypto.KeyEncoder;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.agreement.ECDHCBasicAgreement;
import org.bouncycastle.crypto.engines.IESEngine;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.spec.IESKEMParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.interfaces.ECKey;
import org.bouncycastle.jce.spec.IESParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

public class IESKEMCipher extends BaseCipherSpi {
  private static final X9IntegerConverter converter = new X9IntegerConverter();
  
  private final JcaJceHelper helper = (JcaJceHelper)new BCJcaJceHelper();
  
  private final ECDHCBasicAgreement agreement;
  
  private final KDF2BytesGenerator kdf;
  
  private final Mac hMac;
  
  private final int macKeyLength;
  
  private final int macLength;
  
  private int ivLength;
  
  private IESEngine engine;
  
  private int state = -1;
  
  private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
  
  private AlgorithmParameters engineParam = null;
  
  private IESKEMParameterSpec engineSpec = null;
  
  private AsymmetricKeyParameter key;
  
  private SecureRandom random;
  
  private boolean dhaesMode = false;
  
  private AsymmetricKeyParameter otherKeyParameter = null;
  
  public IESKEMCipher(ECDHCBasicAgreement paramECDHCBasicAgreement, KDF2BytesGenerator paramKDF2BytesGenerator, Mac paramMac, int paramInt1, int paramInt2) {
    this.agreement = paramECDHCBasicAgreement;
    this.kdf = paramKDF2BytesGenerator;
    this.hMac = paramMac;
    this.macKeyLength = paramInt1;
    this.macLength = paramInt2;
  }
  
  public int engineGetBlockSize() {
    return 0;
  }
  
  public int engineGetKeySize(Key paramKey) {
    if (paramKey instanceof ECKey)
      return ((ECKey)paramKey).getParameters().getCurve().getFieldSize(); 
    throw new IllegalArgumentException("not an EC key");
  }
  
  public byte[] engineGetIV() {
    return null;
  }
  
  public AlgorithmParameters engineGetParameters() {
    if (this.engineParam == null && this.engineSpec != null)
      try {
        this.engineParam = this.helper.createAlgorithmParameters("IES");
        this.engineParam.init((AlgorithmParameterSpec)this.engineSpec);
      } catch (Exception exception) {
        throw new RuntimeException(exception.toString());
      }  
    return this.engineParam;
  }
  
  public void engineSetMode(String paramString) throws NoSuchAlgorithmException {
    throw new NoSuchAlgorithmException("can't support mode " + paramString);
  }
  
  public int engineGetOutputSize(int paramInt) {
    byte b;
    int j;
    if (this.key == null)
      throw new IllegalStateException("cipher not initialised"); 
    int i = this.engine.getMac().getMacSize();
    if (this.otherKeyParameter == null) {
      ECCurve eCCurve = ((ECKeyParameters)this.key).getParameters().getCurve();
      int m = (eCCurve.getFieldSize() + 7) / 8;
      b = 2 * m;
    } else {
      b = 0;
    } 
    int k = this.buffer.size() + paramInt;
    if (this.engine.getCipher() == null) {
      j = k;
    } else if (this.state == 1 || this.state == 3) {
      j = this.engine.getCipher().getOutputSize(k);
    } else if (this.state == 2 || this.state == 4) {
      j = this.engine.getCipher().getOutputSize(k - i - b);
    } else {
      throw new IllegalStateException("cipher not initialised");
    } 
    if (this.state == 1 || this.state == 3)
      return i + b + j; 
    if (this.state == 2 || this.state == 4)
      return j; 
    throw new IllegalStateException("cipher not initialised");
  }
  
  public void engineSetPadding(String paramString) throws NoSuchPaddingException {
    throw new NoSuchPaddingException("padding not available with IESCipher");
  }
  
  public void engineInit(int paramInt, Key paramKey, AlgorithmParameters paramAlgorithmParameters, SecureRandom paramSecureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
    AlgorithmParameterSpec algorithmParameterSpec = null;
    if (paramAlgorithmParameters != null)
      try {
        algorithmParameterSpec = paramAlgorithmParameters.getParameterSpec((Class)IESParameterSpec.class);
      } catch (Exception exception) {
        throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + exception.toString());
      }  
    this.engineParam = paramAlgorithmParameters;
    engineInit(paramInt, paramKey, algorithmParameterSpec, paramSecureRandom);
  }
  
  public void engineInit(int paramInt, Key paramKey, AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidAlgorithmParameterException, InvalidKeyException {
    this.otherKeyParameter = null;
    this.engineSpec = (IESKEMParameterSpec)paramAlgorithmParameterSpec;
    if (paramInt == 1 || paramInt == 3) {
      if (paramKey instanceof PublicKey) {
        this.key = ECUtils.generatePublicKeyParameter((PublicKey)paramKey);
      } else {
        throw new InvalidKeyException("must be passed recipient's public EC key for encryption");
      } 
    } else if (paramInt == 2 || paramInt == 4) {
      if (paramKey instanceof PrivateKey) {
        this.key = ECUtils.generatePrivateKeyParameter((PrivateKey)paramKey);
      } else {
        throw new InvalidKeyException("must be passed recipient's private EC key for decryption");
      } 
    } else {
      throw new InvalidKeyException("must be passed EC key");
    } 
    this.random = paramSecureRandom;
    this.state = paramInt;
    this.buffer.reset();
  }
  
  public void engineInit(int paramInt, Key paramKey, SecureRandom paramSecureRandom) throws InvalidKeyException {
    try {
      engineInit(paramInt, paramKey, (AlgorithmParameterSpec)null, paramSecureRandom);
    } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
      throw new IllegalArgumentException("cannot handle supplied parameter spec: " + invalidAlgorithmParameterException.getMessage());
    } 
  }
  
  public byte[] engineUpdate(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.buffer.write(paramArrayOfbyte, paramInt1, paramInt2);
    return null;
  }
  
  public int engineUpdate(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) {
    this.buffer.write(paramArrayOfbyte1, paramInt1, paramInt2);
    return 0;
  }
  
  public byte[] engineDoFinal(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IllegalBlockSizeException, BadPaddingException {
    if (paramInt2 != 0)
      this.buffer.write(paramArrayOfbyte, paramInt1, paramInt2); 
    byte[] arrayOfByte = this.buffer.toByteArray();
    this.buffer.reset();
    ECDomainParameters eCDomainParameters = ((ECKeyParameters)this.key).getParameters();
    if (this.state == 1 || this.state == 3) {
      ECKeyPairGenerator eCKeyPairGenerator = new ECKeyPairGenerator();
      eCKeyPairGenerator.init((KeyGenerationParameters)new ECKeyGenerationParameters(eCDomainParameters, this.random));
      final boolean usePointCompression = this.engineSpec.hasUsePointCompression();
      EphemeralKeyPairGenerator ephemeralKeyPairGenerator = new EphemeralKeyPairGenerator((AsymmetricCipherKeyPairGenerator)eCKeyPairGenerator, new KeyEncoder() {
            public byte[] getEncoded(AsymmetricKeyParameter param1AsymmetricKeyParameter) {
              return ((ECPublicKeyParameters)param1AsymmetricKeyParameter).getQ().getEncoded(usePointCompression);
            }
          });
      EphemeralKeyPair ephemeralKeyPair = ephemeralKeyPairGenerator.generate();
      this.agreement.init((CipherParameters)ephemeralKeyPair.getKeyPair().getPrivate());
      byte[] arrayOfByte1 = converter.integerToBytes(this.agreement.calculateAgreement((CipherParameters)this.key), converter.getByteLength(eCDomainParameters.getCurve()));
      byte[] arrayOfByte2 = new byte[paramInt2 + this.macKeyLength];
      this.kdf.init((DerivationParameters)new KDFParameters(arrayOfByte1, this.engineSpec.getRecipientInfo()));
      this.kdf.generateBytes(arrayOfByte2, 0, arrayOfByte2.length);
      byte[] arrayOfByte3 = new byte[paramInt2 + this.macLength];
      for (int i = 0; i != paramInt2; i++)
        arrayOfByte3[i] = (byte)(paramArrayOfbyte[paramInt1 + i] ^ arrayOfByte2[i]); 
      KeyParameter keyParameter = new KeyParameter(arrayOfByte2, paramInt2, arrayOfByte2.length - paramInt2);
      this.hMac.init((CipherParameters)keyParameter);
      this.hMac.update(arrayOfByte3, 0, paramInt2);
      byte[] arrayOfByte4 = new byte[this.hMac.getMacSize()];
      this.hMac.doFinal(arrayOfByte4, 0);
      Arrays.clear(keyParameter.getKey());
      Arrays.clear(arrayOfByte2);
      System.arraycopy(arrayOfByte4, 0, arrayOfByte3, paramInt2, this.macLength);
      return Arrays.concatenate(ephemeralKeyPair.getEncodedPublicKey(), arrayOfByte3);
    } 
    if (this.state == 2 || this.state == 4) {
      ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters)this.key;
      ECCurve eCCurve = eCPrivateKeyParameters.getParameters().getCurve();
      int i = (eCCurve.getFieldSize() + 7) / 8;
      if (paramArrayOfbyte[paramInt1] == 4) {
        i = 1 + 2 * i;
      } else {
        i = 1 + i;
      } 
      int j = paramInt2 - i + this.macLength;
      ECPoint eCPoint = eCCurve.decodePoint(Arrays.copyOfRange(paramArrayOfbyte, paramInt1, paramInt1 + i));
      this.agreement.init((CipherParameters)this.key);
      byte[] arrayOfByte1 = converter.integerToBytes(this.agreement.calculateAgreement((CipherParameters)new ECPublicKeyParameters(eCPoint, eCPrivateKeyParameters.getParameters())), converter.getByteLength(eCDomainParameters.getCurve()));
      byte[] arrayOfByte2 = new byte[j + this.macKeyLength];
      this.kdf.init((DerivationParameters)new KDFParameters(arrayOfByte1, this.engineSpec.getRecipientInfo()));
      this.kdf.generateBytes(arrayOfByte2, 0, arrayOfByte2.length);
      byte[] arrayOfByte3 = new byte[j];
      for (byte b = 0; b != arrayOfByte3.length; b++)
        arrayOfByte3[b] = (byte)(paramArrayOfbyte[paramInt1 + i + b] ^ arrayOfByte2[b]); 
      KeyParameter keyParameter = new KeyParameter(arrayOfByte2, j, arrayOfByte2.length - j);
      this.hMac.init((CipherParameters)keyParameter);
      this.hMac.update(paramArrayOfbyte, paramInt1 + i, arrayOfByte3.length);
      byte[] arrayOfByte4 = new byte[this.hMac.getMacSize()];
      this.hMac.doFinal(arrayOfByte4, 0);
      Arrays.clear(keyParameter.getKey());
      Arrays.clear(arrayOfByte2);
      if (!Arrays.constantTimeAreEqual(this.macLength, arrayOfByte4, 0, paramArrayOfbyte, paramInt1 + paramInt2 - this.macLength))
        throw new BadPaddingException("mac field"); 
      return arrayOfByte3;
    } 
    throw new IllegalStateException("cipher not initialised");
  }
  
  public int engineDoFinal(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
    byte[] arrayOfByte = engineDoFinal(paramArrayOfbyte1, paramInt1, paramInt2);
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte2, paramInt3, arrayOfByte.length);
    return arrayOfByte.length;
  }
  
  public static class KEM extends IESKEMCipher {
    public KEM(Digest param1Digest1, Digest param1Digest2, int param1Int1, int param1Int2) {
      super(new ECDHCBasicAgreement(), new KDF2BytesGenerator(param1Digest1), (Mac)new HMac(param1Digest2), param1Int1, param1Int2);
    }
  }
  
  public static class KEMwithSHA256 extends KEM {
    public KEMwithSHA256() {
      super(DigestFactory.createSHA256(), DigestFactory.createSHA256(), 32, 16);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\ec\IESKEMCipher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */