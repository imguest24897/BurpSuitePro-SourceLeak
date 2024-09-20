package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.encodings.ISO9796d1Encoding;
import org.bouncycastle.crypto.encodings.OAEPEncoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.tls.TlsRsaKeyExchange;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.spec.TLSRSAPremasterSecretParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.Strings;

public class CipherSpi extends BaseCipherSpi {
  private final JcaJceHelper helper = (JcaJceHelper)new BCJcaJceHelper();
  
  private AsymmetricBlockCipher cipher;
  
  private AlgorithmParameterSpec paramSpec;
  
  private AlgorithmParameters engineParams;
  
  private boolean publicKeyOnly = false;
  
  private boolean privateKeyOnly = false;
  
  private BaseCipherSpi.ErasableOutputStream bOut = new BaseCipherSpi.ErasableOutputStream();
  
  private TLSRSAPremasterSecretParameterSpec tlsRsaSpec = null;
  
  private CipherParameters param = null;
  
  public CipherSpi(AsymmetricBlockCipher paramAsymmetricBlockCipher) {
    this.cipher = paramAsymmetricBlockCipher;
  }
  
  public CipherSpi(OAEPParameterSpec paramOAEPParameterSpec) {
    try {
      initFromSpec(paramOAEPParameterSpec);
    } catch (NoSuchPaddingException noSuchPaddingException) {
      throw new IllegalArgumentException(noSuchPaddingException.getMessage());
    } 
  }
  
  public CipherSpi(boolean paramBoolean1, boolean paramBoolean2, AsymmetricBlockCipher paramAsymmetricBlockCipher) {
    this.publicKeyOnly = paramBoolean1;
    this.privateKeyOnly = paramBoolean2;
    this.cipher = paramAsymmetricBlockCipher;
  }
  
  private void initFromSpec(OAEPParameterSpec paramOAEPParameterSpec) throws NoSuchPaddingException {
    MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec)paramOAEPParameterSpec.getMGFParameters();
    Digest digest = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
    if (digest == null)
      throw new NoSuchPaddingException("no match on OAEP constructor for digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm()); 
    this.cipher = (AsymmetricBlockCipher)new OAEPEncoding((AsymmetricBlockCipher)new RSABlindedEngine(), digest, ((PSource.PSpecified)paramOAEPParameterSpec.getPSource()).getValue());
    this.paramSpec = paramOAEPParameterSpec;
  }
  
  protected int engineGetBlockSize() {
    try {
      return this.cipher.getInputBlockSize();
    } catch (NullPointerException nullPointerException) {
      throw new IllegalStateException("RSA Cipher not initialised");
    } 
  }
  
  protected int engineGetKeySize(Key paramKey) {
    if (paramKey instanceof RSAPrivateKey) {
      RSAPrivateKey rSAPrivateKey = (RSAPrivateKey)paramKey;
      return rSAPrivateKey.getModulus().bitLength();
    } 
    if (paramKey instanceof RSAPublicKey) {
      RSAPublicKey rSAPublicKey = (RSAPublicKey)paramKey;
      return rSAPublicKey.getModulus().bitLength();
    } 
    throw new IllegalArgumentException("not an RSA key!");
  }
  
  protected int engineGetOutputSize(int paramInt) {
    if (this.tlsRsaSpec != null)
      return 48; 
    try {
      return this.cipher.getOutputBlockSize();
    } catch (NullPointerException nullPointerException) {
      throw new IllegalStateException("RSA Cipher not initialised");
    } 
  }
  
  protected AlgorithmParameters engineGetParameters() {
    if (this.engineParams == null && this.paramSpec != null)
      try {
        this.engineParams = this.helper.createAlgorithmParameters("OAEP");
        this.engineParams.init(this.paramSpec);
      } catch (Exception exception) {
        throw new RuntimeException(exception.toString());
      }  
    return this.engineParams;
  }
  
  protected void engineSetMode(String paramString) throws NoSuchAlgorithmException {
    String str = Strings.toUpperCase(paramString);
    if (str.equals("NONE") || str.equals("ECB"))
      return; 
    if (str.equals("1")) {
      this.privateKeyOnly = true;
      this.publicKeyOnly = false;
      return;
    } 
    if (str.equals("2")) {
      this.privateKeyOnly = false;
      this.publicKeyOnly = true;
      return;
    } 
    throw new NoSuchAlgorithmException("can't support mode " + paramString);
  }
  
  protected void engineSetPadding(String paramString) throws NoSuchPaddingException {
    String str = Strings.toUpperCase(paramString);
    if (str.equals("NOPADDING")) {
      this.cipher = (AsymmetricBlockCipher)new RSABlindedEngine();
    } else if (str.equals("PKCS1PADDING")) {
      this.cipher = new CustomPKCS1Encoding((AsymmetricBlockCipher)new RSABlindedEngine());
    } else if (str.equals("ISO9796-1PADDING")) {
      this.cipher = (AsymmetricBlockCipher)new ISO9796d1Encoding((AsymmetricBlockCipher)new RSABlindedEngine());
    } else if (str.equals("OAEPWITHMD5ANDMGF1PADDING")) {
      initFromSpec(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT));
    } else if (str.equals("OAEPPADDING")) {
      initFromSpec(OAEPParameterSpec.DEFAULT);
    } else if (str.equals("OAEPWITHSHA1ANDMGF1PADDING") || str.equals("OAEPWITHSHA-1ANDMGF1PADDING")) {
      initFromSpec(OAEPParameterSpec.DEFAULT);
    } else if (str.equals("OAEPWITHSHA224ANDMGF1PADDING") || str.equals("OAEPWITHSHA-224ANDMGF1PADDING")) {
      initFromSpec(new OAEPParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), PSource.PSpecified.DEFAULT));
    } else if (str.equals("OAEPWITHSHA256ANDMGF1PADDING") || str.equals("OAEPWITHSHA-256ANDMGF1PADDING")) {
      initFromSpec(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
    } else if (str.equals("OAEPWITHSHA384ANDMGF1PADDING") || str.equals("OAEPWITHSHA-384ANDMGF1PADDING")) {
      initFromSpec(new OAEPParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
    } else if (str.equals("OAEPWITHSHA512ANDMGF1PADDING") || str.equals("OAEPWITHSHA-512ANDMGF1PADDING")) {
      initFromSpec(new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
    } else if (str.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
      initFromSpec(new OAEPParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), PSource.PSpecified.DEFAULT));
    } else if (str.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
      initFromSpec(new OAEPParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), PSource.PSpecified.DEFAULT));
    } else if (str.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
      initFromSpec(new OAEPParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), PSource.PSpecified.DEFAULT));
    } else if (str.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
      initFromSpec(new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource.PSpecified.DEFAULT));
    } else {
      throw new NoSuchPaddingException(paramString + " unavailable with RSA.");
    } 
  }
  
  protected void engineInit(int paramInt, Key paramKey, AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
    this.tlsRsaSpec = null;
    if (paramAlgorithmParameterSpec == null || paramAlgorithmParameterSpec instanceof OAEPParameterSpec || paramAlgorithmParameterSpec instanceof TLSRSAPremasterSecretParameterSpec) {
      if (paramKey instanceof RSAPublicKey) {
        if (this.privateKeyOnly && paramInt == 1)
          throw new InvalidKeyException("mode 1 requires RSAPrivateKey"); 
        this.param = (CipherParameters)RSAUtil.generatePublicKeyParameter((RSAPublicKey)paramKey);
      } else if (paramKey instanceof RSAPrivateKey) {
        if (this.publicKeyOnly && paramInt == 1)
          throw new InvalidKeyException("mode 2 requires RSAPublicKey"); 
        this.param = (CipherParameters)RSAUtil.generatePrivateKeyParameter((RSAPrivateKey)paramKey);
      } else {
        throw new InvalidKeyException("unknown key type passed to RSA");
      } 
      if (paramAlgorithmParameterSpec instanceof OAEPParameterSpec) {
        OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec)paramAlgorithmParameterSpec;
        this.paramSpec = paramAlgorithmParameterSpec;
        if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(PKCSObjectIdentifiers.id_mgf1.getId()))
          throw new InvalidAlgorithmParameterException("unknown mask generation function specified"); 
        if (!(oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec))
          throw new InvalidAlgorithmParameterException("unkown MGF parameters"); 
        Digest digest1 = DigestFactory.getDigest(oAEPParameterSpec.getDigestAlgorithm());
        if (digest1 == null)
          throw new InvalidAlgorithmParameterException("no match on digest algorithm: " + oAEPParameterSpec.getDigestAlgorithm()); 
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec)oAEPParameterSpec.getMGFParameters();
        Digest digest2 = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
        if (digest2 == null)
          throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm()); 
        this.cipher = (AsymmetricBlockCipher)new OAEPEncoding((AsymmetricBlockCipher)new RSABlindedEngine(), digest1, digest2, ((PSource.PSpecified)oAEPParameterSpec.getPSource()).getValue());
      } else if (paramAlgorithmParameterSpec instanceof TLSRSAPremasterSecretParameterSpec) {
        if (!(this.param instanceof RSAKeyParameters) || !((RSAKeyParameters)this.param).isPrivate())
          throw new InvalidKeyException("RSA private key required for TLS decryption"); 
        this.tlsRsaSpec = (TLSRSAPremasterSecretParameterSpec)paramAlgorithmParameterSpec;
      } 
    } else {
      throw new InvalidAlgorithmParameterException("unknown parameter type: " + paramAlgorithmParameterSpec.getClass().getName());
    } 
    if (paramSecureRandom != null) {
      this.param = (CipherParameters)new ParametersWithRandom(this.param, paramSecureRandom);
    } else {
      this.param = (CipherParameters)new ParametersWithRandom(this.param, CryptoServicesRegistrar.getSecureRandom());
    } 
    this.bOut.reset();
    switch (paramInt) {
      case 1:
      case 3:
        this.cipher.init(true, this.param);
        return;
      case 2:
      case 4:
        this.cipher.init(false, this.param);
        return;
    } 
    throw new InvalidParameterException("unknown opmode " + paramInt + " passed to RSA");
  }
  
  protected void engineInit(int paramInt, Key paramKey, AlgorithmParameters paramAlgorithmParameters, SecureRandom paramSecureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
    AlgorithmParameterSpec algorithmParameterSpec = null;
    if (paramAlgorithmParameters != null)
      try {
        algorithmParameterSpec = paramAlgorithmParameters.getParameterSpec((Class)OAEPParameterSpec.class);
      } catch (InvalidParameterSpecException invalidParameterSpecException) {
        throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + invalidParameterSpecException.toString(), invalidParameterSpecException);
      }  
    this.engineParams = paramAlgorithmParameters;
    engineInit(paramInt, paramKey, algorithmParameterSpec, paramSecureRandom);
  }
  
  protected void engineInit(int paramInt, Key paramKey, SecureRandom paramSecureRandom) throws InvalidKeyException {
    try {
      engineInit(paramInt, paramKey, (AlgorithmParameterSpec)null, paramSecureRandom);
    } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
      throw new InvalidKeyException("Eeeek! " + invalidAlgorithmParameterException.toString(), invalidAlgorithmParameterException);
    } 
  }
  
  protected byte[] engineUpdate(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt2 > getInputLimit() - this.bOut.size())
      throw new ArrayIndexOutOfBoundsException("too much data for RSA block"); 
    this.bOut.write(paramArrayOfbyte, paramInt1, paramInt2);
    return null;
  }
  
  protected int engineUpdate(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) {
    engineUpdate(paramArrayOfbyte1, paramInt1, paramInt2);
    return 0;
  }
  
  protected byte[] engineDoFinal(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IllegalBlockSizeException, BadPaddingException {
    if (paramArrayOfbyte != null)
      engineUpdate(paramArrayOfbyte, paramInt1, paramInt2); 
    return getOutput();
  }
  
  protected int engineDoFinal(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
    int i = engineGetOutputSize((paramArrayOfbyte1 == null) ? 0 : paramInt2);
    if (paramInt3 > paramArrayOfbyte2.length - i)
      throw new ShortBufferException("output buffer too short for input."); 
    byte[] arrayOfByte = engineDoFinal(paramArrayOfbyte1, paramInt1, paramInt2);
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte2, paramInt3, arrayOfByte.length);
    return arrayOfByte.length;
  }
  
  private int getInputLimit() {
    if (this.tlsRsaSpec != null) {
      ParametersWithRandom parametersWithRandom = (ParametersWithRandom)this.param;
      return TlsRsaKeyExchange.getInputLimit((RSAKeyParameters)parametersWithRandom.getParameters());
    } 
    return (this.cipher instanceof RSABlindedEngine) ? (this.cipher.getInputBlockSize() + 1) : this.cipher.getInputBlockSize();
  }
  
  private byte[] getOutput() throws BadPaddingException {
    try {
      byte[] arrayOfByte;
      if (this.tlsRsaSpec != null) {
        ParametersWithRandom parametersWithRandom = (ParametersWithRandom)this.param;
        return TlsRsaKeyExchange.decryptPreMasterSecret(this.bOut.getBuf(), 0, this.bOut.size(), (RSAKeyParameters)parametersWithRandom.getParameters(), this.tlsRsaSpec.getProtocolVersion(), parametersWithRandom.getRandom());
      } 
      try {
        arrayOfByte = this.cipher.processBlock(this.bOut.getBuf(), 0, this.bOut.size());
      } catch (InvalidCipherTextException invalidCipherTextException) {
        throw new BadBlockException("unable to decrypt block", invalidCipherTextException);
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        throw new BadBlockException("unable to decrypt block", arrayIndexOutOfBoundsException);
      } 
      if (arrayOfByte == null)
        throw new BadBlockException("unable to decrypt block", null); 
      return arrayOfByte;
    } finally {
      this.bOut.erase();
    } 
  }
  
  public static class ISO9796d1Padding extends CipherSpi {
    public ISO9796d1Padding() {
      super((AsymmetricBlockCipher)new ISO9796d1Encoding((AsymmetricBlockCipher)new RSABlindedEngine()));
    }
  }
  
  public static class NoPadding extends CipherSpi {
    public NoPadding() {
      super((AsymmetricBlockCipher)new RSABlindedEngine());
    }
  }
  
  public static class OAEPPadding extends CipherSpi {
    public OAEPPadding() {
      super(OAEPParameterSpec.DEFAULT);
    }
  }
  
  public static class PKCS1v1_5Padding extends CipherSpi {
    public PKCS1v1_5Padding() {
      super(new CustomPKCS1Encoding((AsymmetricBlockCipher)new RSABlindedEngine()));
    }
  }
  
  public static class PKCS1v1_5Padding_PrivateOnly extends CipherSpi {
    public PKCS1v1_5Padding_PrivateOnly() {
      super(false, true, new CustomPKCS1Encoding((AsymmetricBlockCipher)new RSABlindedEngine()));
    }
  }
  
  public static class PKCS1v1_5Padding_PublicOnly extends CipherSpi {
    public PKCS1v1_5Padding_PublicOnly() {
      super(true, false, new CustomPKCS1Encoding((AsymmetricBlockCipher)new RSABlindedEngine()));
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\rsa\CipherSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */