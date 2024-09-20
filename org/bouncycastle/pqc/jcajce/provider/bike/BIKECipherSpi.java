package org.bouncycastle.pqc.jcajce.provider.bike;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.jcajce.spec.KEMParameterSpec;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.pqc.crypto.bike.BIKEKEMExtractor;
import org.bouncycastle.pqc.crypto.bike.BIKEKEMGenerator;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.pqc.jcajce.provider.util.WrapUtil;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;
import org.bouncycastle.util.Strings;

class BIKECipherSpi extends CipherSpi {
  private final String algorithmName;
  
  private BIKEKEMGenerator kemGen;
  
  private KTSParameterSpec kemParameterSpec;
  
  private BCBIKEPublicKey wrapKey;
  
  private BCBIKEPrivateKey unwrapKey;
  
  private AlgorithmParameters engineParams;
  
  private BIKEParameters bikeParameters = null;
  
  BIKECipherSpi(String paramString) throws NoSuchAlgorithmException {
    this.algorithmName = paramString;
  }
  
  BIKECipherSpi(BIKEParameters paramBIKEParameters) {
    this.algorithmName = Strings.toUpperCase(paramBIKEParameters.getName());
  }
  
  protected void engineSetMode(String paramString) throws NoSuchAlgorithmException {
    throw new NoSuchAlgorithmException("Cannot support mode " + paramString);
  }
  
  protected void engineSetPadding(String paramString) throws NoSuchPaddingException {
    throw new NoSuchPaddingException("Padding " + paramString + " unknown");
  }
  
  protected int engineGetKeySize(Key paramKey) {
    return 2048;
  }
  
  protected int engineGetBlockSize() {
    return 0;
  }
  
  protected int engineGetOutputSize(int paramInt) {
    return -1;
  }
  
  protected byte[] engineGetIV() {
    return null;
  }
  
  protected AlgorithmParameters engineGetParameters() {
    if (this.engineParams == null)
      try {
        this.engineParams = AlgorithmParameters.getInstance(this.algorithmName, "BCPQC");
        this.engineParams.init((AlgorithmParameterSpec)this.kemParameterSpec);
      } catch (Exception exception) {
        throw Exceptions.illegalStateException(exception.toString(), exception);
      }  
    return this.engineParams;
  }
  
  protected void engineInit(int paramInt, Key paramKey, SecureRandom paramSecureRandom) throws InvalidKeyException {
    try {
      engineInit(paramInt, paramKey, (AlgorithmParameterSpec)null, paramSecureRandom);
    } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
      throw Exceptions.illegalArgumentException(invalidAlgorithmParameterException.getMessage(), invalidAlgorithmParameterException);
    } 
  }
  
  protected void engineInit(int paramInt, Key paramKey, AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
    if (paramAlgorithmParameterSpec == null) {
      this.kemParameterSpec = (KTSParameterSpec)new KEMParameterSpec("AES-KWP");
    } else {
      if (!(paramAlgorithmParameterSpec instanceof KTSParameterSpec))
        throw new InvalidAlgorithmParameterException(this.algorithmName + " can only accept KTSParameterSpec"); 
      this.kemParameterSpec = (KTSParameterSpec)paramAlgorithmParameterSpec;
    } 
    if (paramInt == 3) {
      if (paramKey instanceof BCBIKEPublicKey) {
        this.wrapKey = (BCBIKEPublicKey)paramKey;
        this.kemGen = new BIKEKEMGenerator(CryptoServicesRegistrar.getSecureRandom(paramSecureRandom));
      } else {
        throw new InvalidKeyException("Only a " + this.algorithmName + " public key can be used for wrapping");
      } 
    } else if (paramInt == 4) {
      if (paramKey instanceof BCBIKEPrivateKey) {
        this.unwrapKey = (BCBIKEPrivateKey)paramKey;
      } else {
        throw new InvalidKeyException("Only a " + this.algorithmName + " private key can be used for unwrapping");
      } 
    } else {
      throw new InvalidParameterException("Cipher only valid for wrapping/unwrapping");
    } 
    if (this.bikeParameters != null) {
      String str = Strings.toUpperCase(this.bikeParameters.getName());
      if (!str.equals(paramKey.getAlgorithm()))
        throw new InvalidKeyException("cipher locked to " + str + " " + paramKey.getAlgorithm()); 
    } 
  }
  
  protected void engineInit(int paramInt, Key paramKey, AlgorithmParameters paramAlgorithmParameters, SecureRandom paramSecureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
    AlgorithmParameterSpec algorithmParameterSpec = null;
    if (paramAlgorithmParameters != null)
      try {
        algorithmParameterSpec = paramAlgorithmParameters.getParameterSpec((Class)KEMParameterSpec.class);
      } catch (Exception exception) {
        throw new InvalidAlgorithmParameterException("can't handle parameter " + paramAlgorithmParameters.toString());
      }  
    engineInit(paramInt, paramKey, algorithmParameterSpec, paramSecureRandom);
  }
  
  protected byte[] engineUpdate(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    throw new IllegalStateException("Not supported in a wrapping mode");
  }
  
  protected int engineUpdate(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws ShortBufferException {
    throw new IllegalStateException("Not supported in a wrapping mode");
  }
  
  protected byte[] engineDoFinal(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IllegalBlockSizeException, BadPaddingException {
    throw new IllegalStateException("Not supported in a wrapping mode");
  }
  
  protected int engineDoFinal(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
    throw new IllegalStateException("Not supported in a wrapping mode");
  }
  
  protected byte[] engineWrap(Key paramKey) throws IllegalBlockSizeException, InvalidKeyException {
    byte[] arrayOfByte = paramKey.getEncoded();
    if (arrayOfByte == null)
      throw new InvalidKeyException("Cannot wrap key, null encoding."); 
    try {
      SecretWithEncapsulation secretWithEncapsulation = this.kemGen.generateEncapsulated((AsymmetricKeyParameter)this.wrapKey.getKeyParams());
      Wrapper wrapper = WrapUtil.getWrapper(this.kemParameterSpec.getKeyAlgorithmName());
      KeyParameter keyParameter = new KeyParameter(secretWithEncapsulation.getSecret());
      wrapper.init(true, (CipherParameters)keyParameter);
      byte[] arrayOfByte1 = secretWithEncapsulation.getEncapsulation();
      secretWithEncapsulation.destroy();
      byte[] arrayOfByte2 = paramKey.getEncoded();
      byte[] arrayOfByte3 = Arrays.concatenate(arrayOfByte1, wrapper.wrap(arrayOfByte2, 0, arrayOfByte2.length));
      Arrays.clear(arrayOfByte2);
      return arrayOfByte3;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new IllegalBlockSizeException("unable to generate KTS secret: " + illegalArgumentException.getMessage());
    } catch (DestroyFailedException destroyFailedException) {
      throw new IllegalBlockSizeException("unable to destroy interim values: " + destroyFailedException.getMessage());
    } 
  }
  
  protected Key engineUnwrap(byte[] paramArrayOfbyte, String paramString, int paramInt) throws InvalidKeyException, NoSuchAlgorithmException {
    if (paramInt != 3)
      throw new InvalidKeyException("only SECRET_KEY supported"); 
    try {
      BIKEKEMExtractor bIKEKEMExtractor = new BIKEKEMExtractor(this.unwrapKey.getKeyParams());
      byte[] arrayOfByte1 = bIKEKEMExtractor.extractSecret(Arrays.copyOfRange(paramArrayOfbyte, 0, bIKEKEMExtractor.getEncapsulationLength()));
      Wrapper wrapper = WrapUtil.getWrapper(this.kemParameterSpec.getKeyAlgorithmName());
      KeyParameter keyParameter = new KeyParameter(arrayOfByte1);
      Arrays.clear(arrayOfByte1);
      wrapper.init(false, (CipherParameters)keyParameter);
      byte[] arrayOfByte2 = Arrays.copyOfRange(paramArrayOfbyte, bIKEKEMExtractor.getEncapsulationLength(), paramArrayOfbyte.length);
      SecretKeySpec secretKeySpec = new SecretKeySpec(wrapper.unwrap(arrayOfByte2, 0, arrayOfByte2.length), paramString);
      Arrays.clear(keyParameter.getKey());
      return secretKeySpec;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new NoSuchAlgorithmException("unable to extract KTS secret: " + illegalArgumentException.getMessage());
    } catch (InvalidCipherTextException invalidCipherTextException) {
      throw new InvalidKeyException("unable to extract KTS secret: " + invalidCipherTextException.getMessage());
    } 
  }
  
  public static class BIKE128 extends BIKECipherSpi {
    public BIKE128() {
      super(BIKEParameters.bike128);
    }
  }
  
  public static class BIKE192 extends BIKECipherSpi {
    public BIKE192() {
      super(BIKEParameters.bike192);
    }
  }
  
  public static class BIKE256 extends BIKECipherSpi {
    public BIKE256() {
      super(BIKEParameters.bike256);
    }
  }
  
  public static class Base extends BIKECipherSpi {
    public Base() throws NoSuchAlgorithmException {
      super("BIKE");
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\bike\BIKECipherSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */