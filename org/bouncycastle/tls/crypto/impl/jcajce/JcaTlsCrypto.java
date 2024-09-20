package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.HashAlgorithm;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.TlsDHUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.SRP6Group;
import org.bouncycastle.tls.crypto.Tls13Verifier;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsCryptoUtils;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsDHDomain;
import org.bouncycastle.tls.crypto.TlsECConfig;
import org.bouncycastle.tls.crypto.TlsECDomain;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.tls.crypto.TlsKemConfig;
import org.bouncycastle.tls.crypto.TlsKemDomain;
import org.bouncycastle.tls.crypto.TlsNonceGenerator;
import org.bouncycastle.tls.crypto.TlsSRP6Client;
import org.bouncycastle.tls.crypto.TlsSRP6Server;
import org.bouncycastle.tls.crypto.TlsSRP6VerifierGenerator;
import org.bouncycastle.tls.crypto.TlsSRPConfig;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.tls.crypto.TlsStreamSigner;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;
import org.bouncycastle.tls.crypto.impl.AbstractTlsCrypto;
import org.bouncycastle.tls.crypto.impl.TlsAEADCipher;
import org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl;
import org.bouncycastle.tls.crypto.impl.TlsBlockCipher;
import org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl;
import org.bouncycastle.tls.crypto.impl.TlsImplUtils;
import org.bouncycastle.tls.crypto.impl.TlsNullCipher;
import org.bouncycastle.tls.crypto.impl.jcajce.srp.SRP6Client;
import org.bouncycastle.tls.crypto.impl.jcajce.srp.SRP6Server;
import org.bouncycastle.tls.crypto.impl.jcajce.srp.SRP6VerifierGenerator;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Strings;

public class JcaTlsCrypto extends AbstractTlsCrypto {
  private final JcaJceHelper helper;
  
  private final SecureRandom entropySource;
  
  private final SecureRandom nonceEntropySource;
  
  private final Hashtable supportedEncryptionAlgorithms = new Hashtable<>();
  
  private final Hashtable supportedNamedGroups = new Hashtable<>();
  
  private final Hashtable supportedOther = new Hashtable<>();
  
  protected JcaTlsCrypto(JcaJceHelper paramJcaJceHelper, SecureRandom paramSecureRandom1, SecureRandom paramSecureRandom2) {
    this.helper = paramJcaJceHelper;
    this.entropySource = paramSecureRandom1;
    this.nonceEntropySource = paramSecureRandom2;
  }
  
  JceTlsSecret adoptLocalSecret(byte[] paramArrayOfbyte) {
    return new JceTlsSecret(this, paramArrayOfbyte);
  }
  
  Cipher createRSAEncryptionCipher() throws GeneralSecurityException {
    try {
      return getHelper().createCipher("RSA/NONE/PKCS1Padding");
    } catch (GeneralSecurityException generalSecurityException) {
      return getHelper().createCipher("RSA/ECB/PKCS1Padding");
    } 
  }
  
  public TlsNonceGenerator createNonceGenerator(byte[] paramArrayOfbyte) {
    return new JcaNonceGenerator(this.nonceEntropySource, paramArrayOfbyte);
  }
  
  public SecureRandom getSecureRandom() {
    return this.entropySource;
  }
  
  public byte[] calculateKeyAgreement(String paramString1, PrivateKey paramPrivateKey, PublicKey paramPublicKey, String paramString2) throws GeneralSecurityException {
    KeyAgreement keyAgreement = this.helper.createKeyAgreement(paramString1);
    keyAgreement.init(paramPrivateKey);
    keyAgreement.doPhase(paramPublicKey, true);
    try {
      return keyAgreement.generateSecret(paramString2).getEncoded();
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      if ("X25519".equals(paramString1) || "X448".equals(paramString1))
        return keyAgreement.generateSecret(); 
      throw noSuchAlgorithmException;
    } 
  }
  
  public TlsCertificate createCertificate(byte[] paramArrayOfbyte) throws IOException {
    return createCertificate((short)0, paramArrayOfbyte);
  }
  
  public TlsCertificate createCertificate(short paramShort, byte[] paramArrayOfbyte) throws IOException {
    if (paramShort != 0)
      throw new TlsFatalAlert((short)43); 
    return new JcaTlsCertificate(this, paramArrayOfbyte);
  }
  
  public TlsCipher createCipher(TlsCryptoParameters paramTlsCryptoParameters, int paramInt1, int paramInt2) throws IOException {
    try {
      switch (paramInt1) {
        case 7:
          return createCipher_CBC(paramTlsCryptoParameters, "DESede", 24, paramInt2);
        case 8:
          return createCipher_CBC(paramTlsCryptoParameters, "AES", 16, paramInt2);
        case 15:
          return (TlsCipher)createCipher_AES_CCM(paramTlsCryptoParameters, 16, 16);
        case 16:
          return (TlsCipher)createCipher_AES_CCM(paramTlsCryptoParameters, 16, 8);
        case 10:
          return (TlsCipher)createCipher_AES_GCM(paramTlsCryptoParameters, 16, 16);
        case 9:
          return createCipher_CBC(paramTlsCryptoParameters, "AES", 32, paramInt2);
        case 17:
          return (TlsCipher)createCipher_AES_CCM(paramTlsCryptoParameters, 32, 16);
        case 18:
          return (TlsCipher)createCipher_AES_CCM(paramTlsCryptoParameters, 32, 8);
        case 11:
          return (TlsCipher)createCipher_AES_GCM(paramTlsCryptoParameters, 32, 16);
        case 22:
          return createCipher_CBC(paramTlsCryptoParameters, "ARIA", 16, paramInt2);
        case 24:
          return (TlsCipher)createCipher_ARIA_GCM(paramTlsCryptoParameters, 16, 16);
        case 23:
          return createCipher_CBC(paramTlsCryptoParameters, "ARIA", 32, paramInt2);
        case 25:
          return (TlsCipher)createCipher_ARIA_GCM(paramTlsCryptoParameters, 32, 16);
        case 12:
          return createCipher_CBC(paramTlsCryptoParameters, "Camellia", 16, paramInt2);
        case 19:
          return (TlsCipher)createCipher_Camellia_GCM(paramTlsCryptoParameters, 16, 16);
        case 13:
          return createCipher_CBC(paramTlsCryptoParameters, "Camellia", 32, paramInt2);
        case 20:
          return (TlsCipher)createCipher_Camellia_GCM(paramTlsCryptoParameters, 32, 16);
        case 21:
          return createChaCha20Poly1305(paramTlsCryptoParameters);
        case 0:
          return (TlsCipher)createNullCipher(paramTlsCryptoParameters, paramInt2);
        case 14:
          return createCipher_CBC(paramTlsCryptoParameters, "SEED", 16, paramInt2);
        case 28:
          return createCipher_CBC(paramTlsCryptoParameters, "SM4", 16, paramInt2);
        case 26:
          return (TlsCipher)createCipher_SM4_CCM(paramTlsCryptoParameters);
        case 27:
          return (TlsCipher)createCipher_SM4_GCM(paramTlsCryptoParameters);
      } 
      throw new TlsFatalAlert((short)80);
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsCryptoException("cannot create cipher: " + generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
  
  public TlsHMAC createHMAC(int paramInt) {
    switch (paramInt) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        return createHMACForHash(TlsCryptoUtils.getHashForHMAC(paramInt));
    } 
    throw new IllegalArgumentException("invalid MACAlgorithm: " + paramInt);
  }
  
  public TlsHMAC createHMACForHash(int paramInt) {
    String str = getHMACAlgorithmName(paramInt);
    try {
      return new JceTlsHMAC(paramInt, this.helper.createMac(str), str);
    } catch (GeneralSecurityException generalSecurityException) {
      throw new RuntimeException("cannot create HMAC: " + str, generalSecurityException);
    } 
  }
  
  protected TlsHMAC createHMAC_SSL(int paramInt) throws GeneralSecurityException, IOException {
    switch (paramInt) {
      case 1:
        return new JcaSSL3HMAC(createHash(getDigestName(1)), 16, 64);
      case 2:
        return new JcaSSL3HMAC(createHash(getDigestName(2)), 20, 64);
      case 3:
        return new JcaSSL3HMAC(createHash(getDigestName(4)), 32, 64);
      case 4:
        return new JcaSSL3HMAC(createHash(getDigestName(5)), 48, 128);
      case 5:
        return new JcaSSL3HMAC(createHash(getDigestName(6)), 64, 128);
    } 
    throw new TlsFatalAlert((short)80);
  }
  
  protected TlsHMAC createMAC(TlsCryptoParameters paramTlsCryptoParameters, int paramInt) throws GeneralSecurityException, IOException {
    return TlsImplUtils.isSSL(paramTlsCryptoParameters) ? createHMAC_SSL(paramInt) : createHMAC(paramInt);
  }
  
  public TlsSRP6Client createSRP6Client(TlsSRPConfig paramTlsSRPConfig) {
    final SRP6Client srpClient = new SRP6Client();
    BigInteger[] arrayOfBigInteger = paramTlsSRPConfig.getExplicitNG();
    SRP6Group sRP6Group = new SRP6Group(arrayOfBigInteger[0], arrayOfBigInteger[1]);
    sRP6Client.init(sRP6Group, createHash(2), getSecureRandom());
    return new TlsSRP6Client() {
        public BigInteger calculateSecret(BigInteger param1BigInteger) throws TlsFatalAlert {
          try {
            return srpClient.calculateSecret(param1BigInteger);
          } catch (IllegalArgumentException illegalArgumentException) {
            throw new TlsFatalAlert((short)47, illegalArgumentException);
          } 
        }
        
        public BigInteger generateClientCredentials(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, byte[] param1ArrayOfbyte3) {
          return srpClient.generateClientCredentials(param1ArrayOfbyte1, param1ArrayOfbyte2, param1ArrayOfbyte3);
        }
      };
  }
  
  public TlsSRP6Server createSRP6Server(TlsSRPConfig paramTlsSRPConfig, BigInteger paramBigInteger) {
    final SRP6Server srpServer = new SRP6Server();
    BigInteger[] arrayOfBigInteger = paramTlsSRPConfig.getExplicitNG();
    SRP6Group sRP6Group = new SRP6Group(arrayOfBigInteger[0], arrayOfBigInteger[1]);
    sRP6Server.init(sRP6Group, paramBigInteger, createHash(2), getSecureRandom());
    return new TlsSRP6Server() {
        public BigInteger generateServerCredentials() {
          return srpServer.generateServerCredentials();
        }
        
        public BigInteger calculateSecret(BigInteger param1BigInteger) throws IOException {
          try {
            return srpServer.calculateSecret(param1BigInteger);
          } catch (IllegalArgumentException illegalArgumentException) {
            throw new TlsFatalAlert((short)47, illegalArgumentException);
          } 
        }
      };
  }
  
  public TlsSRP6VerifierGenerator createSRP6VerifierGenerator(TlsSRPConfig paramTlsSRPConfig) {
    BigInteger[] arrayOfBigInteger = paramTlsSRPConfig.getExplicitNG();
    final SRP6VerifierGenerator verifierGenerator = new SRP6VerifierGenerator();
    sRP6VerifierGenerator.init(arrayOfBigInteger[0], arrayOfBigInteger[1], createHash(2));
    return new TlsSRP6VerifierGenerator() {
        public BigInteger generateVerifier(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, byte[] param1ArrayOfbyte3) {
          return verifierGenerator.generateVerifier(param1ArrayOfbyte1, param1ArrayOfbyte2, param1ArrayOfbyte3);
        }
      };
  }
  
  String getHMACAlgorithmName(int paramInt) {
    switch (paramInt) {
      case 1:
        return "HmacMD5";
      case 2:
        return "HmacSHA1";
      case 3:
        return "HmacSHA224";
      case 4:
        return "HmacSHA256";
      case 5:
        return "HmacSHA384";
      case 6:
        return "HmacSHA512";
      case 7:
        return "HmacSM3";
    } 
    throw new IllegalArgumentException("invalid CryptoHashAlgorithm: " + paramInt);
  }
  
  public AlgorithmParameters getNamedGroupAlgorithmParameters(int paramInt) throws GeneralSecurityException {
    if (NamedGroup.refersToAnXDHCurve(paramInt)) {
      switch (paramInt) {
        case 29:
        case 30:
          return null;
      } 
    } else {
      if (NamedGroup.refersToAnECDSACurve(paramInt))
        return ECUtil.getAlgorithmParameters(this, NamedGroup.getCurveName(paramInt)); 
      if (NamedGroup.refersToASpecificFiniteField(paramInt))
        return DHUtil.getAlgorithmParameters(this, TlsDHUtils.getNamedDHGroup(paramInt)); 
      if (NamedGroup.refersToASpecificKem(paramInt))
        switch (paramInt) {
          case 583:
          case 584:
          case 585:
          case 1896:
          case 4132:
            return null;
        }  
    } 
    throw new IllegalArgumentException("NamedGroup not supported: " + NamedGroup.getText(paramInt));
  }
  
  public AlgorithmParameters getSignatureSchemeAlgorithmParameters(int paramInt) throws GeneralSecurityException {
    if (!SignatureScheme.isRSAPSS(paramInt))
      return null; 
    int i = SignatureScheme.getCryptoHashAlgorithm(paramInt);
    if (i < 0)
      return null; 
    String str1 = getDigestName(i);
    String str2 = RSAUtil.getDigestSigAlgName(str1) + "WITHRSAANDMGF1";
    AlgorithmParameterSpec algorithmParameterSpec = RSAUtil.getPSSParameterSpec(i, str1, getHelper());
    Signature signature = getHelper().createSignature(str2);
    signature.setParameter(algorithmParameterSpec);
    return signature.getParameters();
  }
  
  public boolean hasAnyStreamVerifiers(Vector<SignatureAndHashAlgorithm> paramVector) {
    boolean bool = JcaUtils.isSunMSCAPIProviderActive();
    byte b = 0;
    int i = paramVector.size();
    while (b < i) {
      SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramVector.elementAt(b);
      switch (signatureAndHashAlgorithm.getSignature()) {
        case 1:
          if (bool)
            return true; 
          break;
        case 2:
          if (HashAlgorithm.getOutputSize(signatureAndHashAlgorithm.getHash()) != 20)
            return true; 
          break;
      } 
      switch (SignatureScheme.from(signatureAndHashAlgorithm)) {
        case 2052:
        case 2053:
        case 2054:
        case 2055:
        case 2056:
        case 2057:
        case 2058:
        case 2059:
          return true;
      } 
      b++;
    } 
    return false;
  }
  
  public boolean hasAnyStreamVerifiersLegacy(short[] paramArrayOfshort) {
    return false;
  }
  
  public boolean hasCryptoHashAlgorithm(int paramInt) {
    return true;
  }
  
  public boolean hasCryptoSignatureAlgorithm(int paramInt) {
    switch (paramInt) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
        return true;
    } 
    return false;
  }
  
  public boolean hasDHAgreement() {
    return true;
  }
  
  public boolean hasECDHAgreement() {
    return true;
  }
  
  public boolean hasKemAgreement() {
    return true;
  }
  
  public boolean hasEncryptionAlgorithm(int paramInt) {
    Integer integer = Integers.valueOf(paramInt);
    synchronized (this.supportedEncryptionAlgorithms) {
      Boolean bool1 = (Boolean)this.supportedEncryptionAlgorithms.get(integer);
      if (bool1 != null)
        return bool1.booleanValue(); 
    } 
    Boolean bool = isSupportedEncryptionAlgorithm(paramInt);
    if (null == bool)
      return false; 
    synchronized (this.supportedEncryptionAlgorithms) {
      Boolean bool1 = this.supportedEncryptionAlgorithms.put(integer, bool);
      if (null != bool1 && bool != bool1) {
        this.supportedEncryptionAlgorithms.put(integer, bool1);
        bool = bool1;
      } 
    } 
    return bool.booleanValue();
  }
  
  public boolean hasHKDFAlgorithm(int paramInt) {
    switch (paramInt) {
      case 4:
      case 5:
      case 6:
      case 7:
        return true;
    } 
    return false;
  }
  
  public boolean hasMacAlgorithm(int paramInt) {
    switch (paramInt) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        return true;
    } 
    return false;
  }
  
  public boolean hasNamedGroup(int paramInt) {
    Integer integer = Integers.valueOf(paramInt);
    synchronized (this.supportedNamedGroups) {
      Boolean bool1 = (Boolean)this.supportedNamedGroups.get(integer);
      if (null != bool1)
        return bool1.booleanValue(); 
    } 
    Boolean bool = isSupportedNamedGroup(paramInt);
    if (null == bool)
      return false; 
    synchronized (this.supportedNamedGroups) {
      Boolean bool1 = this.supportedNamedGroups.put(integer, bool);
      if (null != bool1 && bool != bool1) {
        this.supportedNamedGroups.put(integer, bool1);
        bool = bool1;
      } 
    } 
    return bool.booleanValue();
  }
  
  public boolean hasRSAEncryption() {
    Boolean bool;
    synchronized (this.supportedOther) {
      Boolean bool1 = (Boolean)this.supportedOther.get("KE_RSA");
      if (bool1 != null)
        return bool1.booleanValue(); 
    } 
    try {
      createRSAEncryptionCipher();
      bool = Boolean.TRUE;
    } catch (GeneralSecurityException generalSecurityException) {
      bool = Boolean.FALSE;
    } 
    synchronized (this.supportedOther) {
      Boolean bool1 = this.supportedOther.put("KE_RSA", bool);
      if (null != bool1 && bool != bool1) {
        this.supportedOther.put("KE_RSA", bool1);
        bool = bool1;
      } 
    } 
    return bool.booleanValue();
  }
  
  public boolean hasSignatureAlgorithm(short paramShort) {
    switch (paramShort) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 26:
      case 27:
      case 28:
        return true;
    } 
    return false;
  }
  
  public boolean hasSignatureAndHashAlgorithm(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    short s = paramSignatureAndHashAlgorithm.getSignature();
    switch (paramSignatureAndHashAlgorithm.getHash()) {
      case 1:
        return (1 == s && hasSignatureAlgorithm(s));
      case 3:
        return (!JcaUtils.isSunMSCAPIProviderActive() && hasSignatureAlgorithm(s));
    } 
    return hasSignatureAlgorithm(s);
  }
  
  public boolean hasSignatureScheme(int paramInt) {
    switch (paramInt) {
      case 1800:
        return false;
    } 
    short s = SignatureScheme.getSignatureAlgorithm(paramInt);
    switch (SignatureScheme.getCryptoHashAlgorithm(paramInt)) {
      case 1:
        return (1 == s && hasSignatureAlgorithm(s));
      case 3:
        return (!JcaUtils.isSunMSCAPIProviderActive() && hasSignatureAlgorithm(s));
    } 
    return hasSignatureAlgorithm(s);
  }
  
  public boolean hasSRPAuthentication() {
    return true;
  }
  
  public TlsSecret createSecret(byte[] paramArrayOfbyte) {
    return (TlsSecret)adoptLocalSecret(Arrays.clone(paramArrayOfbyte));
  }
  
  public TlsSecret generateRSAPreMasterSecret(ProtocolVersion paramProtocolVersion) {
    byte[] arrayOfByte = new byte[48];
    getSecureRandom().nextBytes(arrayOfByte);
    TlsUtils.writeVersion(paramProtocolVersion, arrayOfByte, 0);
    return (TlsSecret)adoptLocalSecret(arrayOfByte);
  }
  
  public TlsHash createHash(int paramInt) {
    try {
      return createHash(getDigestName(paramInt));
    } catch (GeneralSecurityException generalSecurityException) {
      throw Exceptions.illegalArgumentException("unable to create message digest:" + generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
  
  public TlsDHDomain createDHDomain(TlsDHConfig paramTlsDHConfig) {
    return new JceTlsDHDomain(this, paramTlsDHConfig);
  }
  
  public TlsECDomain createECDomain(TlsECConfig paramTlsECConfig) {
    switch (paramTlsECConfig.getNamedGroup()) {
      case 29:
        return new JceX25519Domain(this);
      case 30:
        return new JceX448Domain(this);
    } 
    return new JceTlsECDomain(this, paramTlsECConfig);
  }
  
  public TlsKemDomain createKemDomain(TlsKemConfig paramTlsKemConfig) {
    return new JceTlsMLKemDomain(this, paramTlsKemConfig);
  }
  
  public TlsSecret hkdfInit(int paramInt) {
    return (TlsSecret)adoptLocalSecret(new byte[TlsCryptoUtils.getHashOutputSize(paramInt)]);
  }
  
  protected TlsAEADCipherImpl createAEADCipher(String paramString1, String paramString2, int paramInt, boolean paramBoolean) throws GeneralSecurityException {
    return new JceAEADCipherImpl(this, this.helper, paramString1, paramString2, paramInt, paramBoolean);
  }
  
  protected TlsBlockCipherImpl createBlockCipher(String paramString1, String paramString2, int paramInt, boolean paramBoolean) throws GeneralSecurityException {
    return new JceBlockCipherImpl(this, this.helper.createCipher(paramString1), paramString2, paramInt, paramBoolean);
  }
  
  protected TlsBlockCipherImpl createBlockCipherWithCBCImplicitIV(String paramString1, String paramString2, int paramInt, boolean paramBoolean) throws GeneralSecurityException {
    return new JceBlockCipherWithCBCImplicitIVImpl(this, this.helper.createCipher(paramString1), paramString2, paramBoolean);
  }
  
  protected TlsHash createHash(String paramString) throws GeneralSecurityException {
    return new JcaTlsHash(this.helper.createDigest(paramString));
  }
  
  protected TlsNullCipher createNullCipher(TlsCryptoParameters paramTlsCryptoParameters, int paramInt) throws IOException, GeneralSecurityException {
    return new TlsNullCipher(paramTlsCryptoParameters, createMAC(paramTlsCryptoParameters, paramInt), createMAC(paramTlsCryptoParameters, paramInt));
  }
  
  protected TlsStreamSigner createStreamSigner(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, PrivateKey paramPrivateKey, boolean paramBoolean) throws IOException {
    String str = JcaUtils.getJcaAlgorithmName(paramSignatureAndHashAlgorithm);
    return createStreamSigner(str, null, paramPrivateKey, paramBoolean);
  }
  
  protected TlsStreamSigner createStreamSigner(String paramString, AlgorithmParameterSpec paramAlgorithmParameterSpec, PrivateKey paramPrivateKey, boolean paramBoolean) throws IOException {
    try {
      SecureRandom secureRandom = paramBoolean ? getSecureRandom() : null;
      JcaJceHelper jcaJceHelper = getHelper();
      try {
        ProviderJcaJceHelper providerJcaJceHelper;
        if (null != paramAlgorithmParameterSpec) {
          Signature signature1 = jcaJceHelper.createSignature(paramString);
          signature1.initSign(paramPrivateKey, secureRandom);
          providerJcaJceHelper = new ProviderJcaJceHelper(signature1.getProvider());
        } 
        Signature signature = providerJcaJceHelper.createSignature(paramString);
        if (null != paramAlgorithmParameterSpec)
          signature.setParameter(paramAlgorithmParameterSpec); 
        signature.initSign(paramPrivateKey, secureRandom);
        return new JcaTlsStreamSigner(signature);
      } catch (InvalidKeyException invalidKeyException) {
        String str = Strings.toUpperCase(paramString);
        if (str.endsWith("MGF1")) {
          paramString = str.replace("ANDMGF1", "SSA-PSS");
          return createStreamSigner(paramString, paramAlgorithmParameterSpec, paramPrivateKey, paramBoolean);
        } 
        throw invalidKeyException;
      } 
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsFatalAlert((short)80, generalSecurityException);
    } 
  }
  
  protected TlsStreamVerifier createStreamVerifier(DigitallySigned paramDigitallySigned, PublicKey paramPublicKey) throws IOException {
    String str = JcaUtils.getJcaAlgorithmName(paramDigitallySigned.getAlgorithm());
    return createStreamVerifier(str, null, paramDigitallySigned.getSignature(), paramPublicKey);
  }
  
  protected TlsStreamVerifier createStreamVerifier(String paramString, AlgorithmParameterSpec paramAlgorithmParameterSpec, byte[] paramArrayOfbyte, PublicKey paramPublicKey) throws IOException {
    try {
      ProviderJcaJceHelper providerJcaJceHelper;
      JcaJceHelper jcaJceHelper = getHelper();
      if (null != paramAlgorithmParameterSpec) {
        Signature signature1 = jcaJceHelper.createSignature(paramString);
        signature1.initVerify(paramPublicKey);
        providerJcaJceHelper = new ProviderJcaJceHelper(signature1.getProvider());
      } 
      Signature signature = providerJcaJceHelper.createSignature(paramString);
      if (null != paramAlgorithmParameterSpec)
        signature.setParameter(paramAlgorithmParameterSpec); 
      signature.initVerify(paramPublicKey);
      return new JcaTlsStreamVerifier(signature, paramArrayOfbyte);
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsFatalAlert((short)80, generalSecurityException);
    } 
  }
  
  protected Tls13Verifier createTls13Verifier(String paramString, AlgorithmParameterSpec paramAlgorithmParameterSpec, PublicKey paramPublicKey) throws IOException {
    try {
      ProviderJcaJceHelper providerJcaJceHelper;
      JcaJceHelper jcaJceHelper = getHelper();
      if (null != paramAlgorithmParameterSpec) {
        Signature signature1 = jcaJceHelper.createSignature(paramString);
        signature1.initVerify(paramPublicKey);
        providerJcaJceHelper = new ProviderJcaJceHelper(signature1.getProvider());
      } 
      Signature signature = providerJcaJceHelper.createSignature(paramString);
      if (null != paramAlgorithmParameterSpec)
        signature.setParameter(paramAlgorithmParameterSpec); 
      signature.initVerify(paramPublicKey);
      return new JcaTls13Verifier(signature);
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsFatalAlert((short)80, generalSecurityException);
    } 
  }
  
  protected TlsStreamSigner createVerifyingStreamSigner(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, PrivateKey paramPrivateKey, boolean paramBoolean, PublicKey paramPublicKey) throws IOException {
    String str = JcaUtils.getJcaAlgorithmName(paramSignatureAndHashAlgorithm);
    return createVerifyingStreamSigner(str, null, paramPrivateKey, paramBoolean, paramPublicKey);
  }
  
  protected TlsStreamSigner createVerifyingStreamSigner(String paramString, AlgorithmParameterSpec paramAlgorithmParameterSpec, PrivateKey paramPrivateKey, boolean paramBoolean, PublicKey paramPublicKey) throws IOException {
    try {
      Signature signature1 = getHelper().createSignature(paramString);
      Signature signature2 = getHelper().createSignature(paramString);
      if (null != paramAlgorithmParameterSpec) {
        signature1.setParameter(paramAlgorithmParameterSpec);
        signature2.setParameter(paramAlgorithmParameterSpec);
      } 
      signature1.initSign(paramPrivateKey, paramBoolean ? getSecureRandom() : null);
      signature2.initVerify(paramPublicKey);
      return new JcaVerifyingStreamSigner(signature1, signature2);
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsFatalAlert((short)80, generalSecurityException);
    } 
  }
  
  protected Boolean isSupportedEncryptionAlgorithm(int paramInt) {
    switch (paramInt) {
      case 7:
        return Boolean.valueOf(isUsableCipher("DESede/CBC/NoPadding", 192));
      case 8:
        return Boolean.valueOf(isUsableCipher("AES/CBC/NoPadding", 128));
      case 15:
      case 16:
        return Boolean.valueOf(isUsableCipher("AES/CCM/NoPadding", 128));
      case 10:
        return Boolean.valueOf(isUsableCipher("AES/GCM/NoPadding", 128));
      case 9:
        return Boolean.valueOf(isUsableCipher("AES/CBC/NoPadding", 256));
      case 17:
      case 18:
        return Boolean.valueOf(isUsableCipher("AES/CCM/NoPadding", 256));
      case 11:
        return Boolean.valueOf(isUsableCipher("AES/GCM/NoPadding", 256));
      case 22:
        return Boolean.valueOf(isUsableCipher("ARIA/CBC/NoPadding", 128));
      case 24:
        return Boolean.valueOf(isUsableCipher("ARIA/GCM/NoPadding", 128));
      case 23:
        return Boolean.valueOf(isUsableCipher("ARIA/CBC/NoPadding", 256));
      case 25:
        return Boolean.valueOf(isUsableCipher("ARIA/GCM/NoPadding", 256));
      case 12:
        return Boolean.valueOf(isUsableCipher("Camellia/CBC/NoPadding", 128));
      case 19:
        return Boolean.valueOf(isUsableCipher("Camellia/GCM/NoPadding", 128));
      case 13:
        return Boolean.valueOf(isUsableCipher("Camellia/CBC/NoPadding", 256));
      case 20:
        return Boolean.valueOf(isUsableCipher("Camellia/GCM/NoPadding", 256));
      case 21:
        return Boolean.valueOf((isUsableCipher("ChaCha7539", 256) && isUsableMAC("Poly1305")));
      case 0:
        return Boolean.TRUE;
      case 14:
        return Boolean.valueOf(isUsableCipher("SEED/CBC/NoPadding", 128));
      case 28:
        return Boolean.valueOf(isUsableCipher("SM4/CBC/NoPadding", 128));
      case 26:
        return Boolean.valueOf(isUsableCipher("SM4/CCM/NoPadding", 128));
      case 27:
        return Boolean.valueOf(isUsableCipher("SM4/GCM/NoPadding", 128));
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
        return Boolean.FALSE;
    } 
    return null;
  }
  
  protected Boolean isSupportedNamedGroup(int paramInt) {
    try {
      if (NamedGroup.refersToAnXDHCurve(paramInt)) {
        switch (paramInt) {
          case 29:
            this.helper.createKeyAgreement("X25519");
            return Boolean.TRUE;
          case 30:
            this.helper.createKeyAgreement("X448");
            return Boolean.TRUE;
        } 
      } else {
        if (NamedGroup.refersToASpecificKem(paramInt))
          return Boolean.TRUE; 
        if (NamedGroup.refersToAnECDSACurve(paramInt))
          return Boolean.valueOf(ECUtil.isCurveSupported(this, NamedGroup.getCurveName(paramInt))); 
        if (NamedGroup.refersToASpecificFiniteField(paramInt))
          return Boolean.valueOf(DHUtil.isGroupSupported(this, TlsDHUtils.getNamedDHGroup(paramInt))); 
      } 
    } catch (GeneralSecurityException generalSecurityException) {
      return Boolean.FALSE;
    } 
    return null;
  }
  
  protected boolean isUsableCipher(String paramString, int paramInt) {
    try {
      this.helper.createCipher(paramString);
      return (Cipher.getMaxAllowedKeyLength(paramString) >= paramInt);
    } catch (GeneralSecurityException generalSecurityException) {
      return false;
    } 
  }
  
  protected boolean isUsableMAC(String paramString) {
    try {
      this.helper.createMac(paramString);
      return true;
    } catch (GeneralSecurityException generalSecurityException) {
      return false;
    } 
  }
  
  public JcaJceHelper getHelper() {
    return this.helper;
  }
  
  protected TlsBlockCipherImpl createCBCBlockCipherImpl(TlsCryptoParameters paramTlsCryptoParameters, String paramString, int paramInt, boolean paramBoolean) throws GeneralSecurityException {
    String str = paramString + "/CBC/NoPadding";
    return TlsImplUtils.isTLSv11(paramTlsCryptoParameters) ? createBlockCipher(str, paramString, paramInt, paramBoolean) : createBlockCipherWithCBCImplicitIV(str, paramString, paramInt, paramBoolean);
  }
  
  private TlsCipher createChaCha20Poly1305(TlsCryptoParameters paramTlsCryptoParameters) throws IOException, GeneralSecurityException {
    return (TlsCipher)new TlsAEADCipher(paramTlsCryptoParameters, new JceChaCha20Poly1305(this, this.helper, true), new JceChaCha20Poly1305(this, this.helper, false), 32, 16, 2);
  }
  
  private TlsAEADCipher createCipher_AES_CCM(TlsCryptoParameters paramTlsCryptoParameters, int paramInt1, int paramInt2) throws IOException, GeneralSecurityException {
    return new TlsAEADCipher(paramTlsCryptoParameters, createAEADCipher("AES/CCM/NoPadding", "AES", paramInt1, true), createAEADCipher("AES/CCM/NoPadding", "AES", paramInt1, false), paramInt1, paramInt2, 1);
  }
  
  private TlsAEADCipher createCipher_AES_GCM(TlsCryptoParameters paramTlsCryptoParameters, int paramInt1, int paramInt2) throws IOException, GeneralSecurityException {
    return new TlsAEADCipher(paramTlsCryptoParameters, createAEADCipher("AES/GCM/NoPadding", "AES", paramInt1, true), createAEADCipher("AES/GCM/NoPadding", "AES", paramInt1, false), paramInt1, paramInt2, 3);
  }
  
  private TlsAEADCipher createCipher_ARIA_GCM(TlsCryptoParameters paramTlsCryptoParameters, int paramInt1, int paramInt2) throws IOException, GeneralSecurityException {
    return new TlsAEADCipher(paramTlsCryptoParameters, createAEADCipher("ARIA/GCM/NoPadding", "ARIA", paramInt1, true), createAEADCipher("ARIA/GCM/NoPadding", "ARIA", paramInt1, false), paramInt1, paramInt2, 3);
  }
  
  private TlsAEADCipher createCipher_Camellia_GCM(TlsCryptoParameters paramTlsCryptoParameters, int paramInt1, int paramInt2) throws IOException, GeneralSecurityException {
    return new TlsAEADCipher(paramTlsCryptoParameters, createAEADCipher("Camellia/GCM/NoPadding", "Camellia", paramInt1, true), createAEADCipher("Camellia/GCM/NoPadding", "Camellia", paramInt1, false), paramInt1, paramInt2, 3);
  }
  
  protected TlsCipher createCipher_CBC(TlsCryptoParameters paramTlsCryptoParameters, String paramString, int paramInt1, int paramInt2) throws GeneralSecurityException, IOException {
    TlsBlockCipherImpl tlsBlockCipherImpl1 = createCBCBlockCipherImpl(paramTlsCryptoParameters, paramString, paramInt1, true);
    TlsBlockCipherImpl tlsBlockCipherImpl2 = createCBCBlockCipherImpl(paramTlsCryptoParameters, paramString, paramInt1, false);
    TlsHMAC tlsHMAC1 = createMAC(paramTlsCryptoParameters, paramInt2);
    TlsHMAC tlsHMAC2 = createMAC(paramTlsCryptoParameters, paramInt2);
    return (TlsCipher)new TlsBlockCipher(paramTlsCryptoParameters, tlsBlockCipherImpl1, tlsBlockCipherImpl2, tlsHMAC1, tlsHMAC2, paramInt1);
  }
  
  private TlsAEADCipher createCipher_SM4_CCM(TlsCryptoParameters paramTlsCryptoParameters) throws IOException, GeneralSecurityException {
    byte b1 = 16;
    byte b2 = 16;
    return new TlsAEADCipher(paramTlsCryptoParameters, createAEADCipher("SM4/CCM/NoPadding", "SM4", b1, true), createAEADCipher("SM4/CCM/NoPadding", "SM4", b1, false), b1, b2, 1);
  }
  
  private TlsAEADCipher createCipher_SM4_GCM(TlsCryptoParameters paramTlsCryptoParameters) throws IOException, GeneralSecurityException {
    byte b1 = 16;
    byte b2 = 16;
    return new TlsAEADCipher(paramTlsCryptoParameters, createAEADCipher("SM4/GCM/NoPadding", "SM4", b1, true), createAEADCipher("SM4/GCM/NoPadding", "SM4", b1, false), b1, b2, 3);
  }
  
  String getDigestName(int paramInt) {
    switch (paramInt) {
      case 1:
        return "MD5";
      case 2:
        return "SHA-1";
      case 3:
        return "SHA-224";
      case 4:
        return "SHA-256";
      case 5:
        return "SHA-384";
      case 6:
        return "SHA-512";
      case 7:
        return "SM3";
    } 
    throw new IllegalArgumentException("invalid CryptoHashAlgorithm: " + paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsCrypto.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */