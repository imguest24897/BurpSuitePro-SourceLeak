package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.bouncycastle.crypto.agreement.srp.SRP6Server;
import org.bouncycastle.crypto.agreement.srp.SRP6VerifierGenerator;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.ARIAEngine;
import org.bouncycastle.crypto.engines.CamelliaEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.SEEDEngine;
import org.bouncycastle.crypto.engines.SM4Engine;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.params.SRP6GroupParameters;
import org.bouncycastle.crypto.prng.DigestRandomGenerator;
import org.bouncycastle.crypto.prng.RandomGenerator;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsCipher;
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
import org.bouncycastle.tls.crypto.impl.AbstractTlsCrypto;
import org.bouncycastle.tls.crypto.impl.TlsAEADCipher;
import org.bouncycastle.tls.crypto.impl.TlsBlockCipher;
import org.bouncycastle.tls.crypto.impl.TlsImplUtils;
import org.bouncycastle.tls.crypto.impl.TlsNullCipher;
import org.bouncycastle.util.Arrays;

public class BcTlsCrypto extends AbstractTlsCrypto {
  private final SecureRandom entropySource;
  
  public BcTlsCrypto() {
    this(new SecureRandom());
  }
  
  public BcTlsCrypto(SecureRandom paramSecureRandom) {
    this.entropySource = paramSecureRandom;
  }
  
  BcTlsSecret adoptLocalSecret(byte[] paramArrayOfbyte) {
    return new BcTlsSecret(this, paramArrayOfbyte);
  }
  
  public SecureRandom getSecureRandom() {
    return this.entropySource;
  }
  
  public TlsCertificate createCertificate(byte[] paramArrayOfbyte) throws IOException {
    return createCertificate((short)0, paramArrayOfbyte);
  }
  
  public TlsCertificate createCertificate(short paramShort, byte[] paramArrayOfbyte) throws IOException {
    switch (paramShort) {
      case 0:
        return new BcTlsCertificate(this, paramArrayOfbyte);
      case 2:
        return new BcTlsRawKeyCertificate(this, paramArrayOfbyte);
    } 
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsCipher createCipher(TlsCryptoParameters paramTlsCryptoParameters, int paramInt1, int paramInt2) throws IOException {
    switch (paramInt1) {
      case 8:
      case 12:
      case 14:
      case 22:
      case 28:
        return createCipher_CBC(paramTlsCryptoParameters, paramInt1, 16, paramInt2);
      case 7:
        return createCipher_CBC(paramTlsCryptoParameters, paramInt1, 24, paramInt2);
      case 9:
      case 13:
      case 23:
        return createCipher_CBC(paramTlsCryptoParameters, paramInt1, 32, paramInt2);
      case 15:
        return (TlsCipher)createCipher_AES_CCM(paramTlsCryptoParameters, 16, 16);
      case 16:
        return (TlsCipher)createCipher_AES_CCM(paramTlsCryptoParameters, 16, 8);
      case 10:
        return (TlsCipher)createCipher_AES_GCM(paramTlsCryptoParameters, 16, 16);
      case 17:
        return (TlsCipher)createCipher_AES_CCM(paramTlsCryptoParameters, 32, 16);
      case 18:
        return (TlsCipher)createCipher_AES_CCM(paramTlsCryptoParameters, 32, 8);
      case 11:
        return (TlsCipher)createCipher_AES_GCM(paramTlsCryptoParameters, 32, 16);
      case 24:
        return (TlsCipher)createCipher_ARIA_GCM(paramTlsCryptoParameters, 16, 16);
      case 25:
        return (TlsCipher)createCipher_ARIA_GCM(paramTlsCryptoParameters, 32, 16);
      case 19:
        return (TlsCipher)createCipher_Camellia_GCM(paramTlsCryptoParameters, 16, 16);
      case 20:
        return (TlsCipher)createCipher_Camellia_GCM(paramTlsCryptoParameters, 32, 16);
      case 21:
        return createChaCha20Poly1305(paramTlsCryptoParameters);
      case 0:
        return (TlsCipher)createNullCipher(paramTlsCryptoParameters, paramInt2);
      case 26:
        return (TlsCipher)createCipher_SM4_CCM(paramTlsCryptoParameters);
      case 27:
        return (TlsCipher)createCipher_SM4_GCM(paramTlsCryptoParameters);
    } 
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsDHDomain createDHDomain(TlsDHConfig paramTlsDHConfig) {
    return new BcTlsDHDomain(this, paramTlsDHConfig);
  }
  
  public TlsECDomain createECDomain(TlsECConfig paramTlsECConfig) {
    switch (paramTlsECConfig.getNamedGroup()) {
      case 29:
        return new BcX25519Domain(this);
      case 30:
        return new BcX448Domain(this);
    } 
    return new BcTlsECDomain(this, paramTlsECConfig);
  }
  
  public TlsKemDomain createKemDomain(TlsKemConfig paramTlsKemConfig) {
    return new BcTlsMLKemDomain(this, paramTlsKemConfig);
  }
  
  public TlsNonceGenerator createNonceGenerator(byte[] paramArrayOfbyte) {
    byte b = 4;
    Digest digest = createDigest(b);
    byte[] arrayOfByte = new byte[TlsCryptoUtils.getHashOutputSize(b)];
    getSecureRandom().nextBytes(arrayOfByte);
    DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(digest);
    digestRandomGenerator.addSeedMaterial(paramArrayOfbyte);
    digestRandomGenerator.addSeedMaterial(arrayOfByte);
    return new BcTlsNonceGenerator((RandomGenerator)digestRandomGenerator);
  }
  
  public boolean hasAnyStreamVerifiers(Vector<SignatureAndHashAlgorithm> paramVector) {
    byte b = 0;
    int i = paramVector.size();
    while (b < i) {
      SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramVector.elementAt(b);
      switch (SignatureScheme.from(signatureAndHashAlgorithm)) {
        case 2055:
        case 2056:
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
    switch (paramInt) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
        return true;
    } 
    return false;
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
    switch (paramInt) {
      case 0:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
        return true;
    } 
    return false;
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
    return NamedGroup.refersToASpecificGroup(paramInt);
  }
  
  public boolean hasRSAEncryption() {
    return true;
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
  
  public Digest cloneDigest(int paramInt, Digest paramDigest) {
    switch (paramInt) {
      case 1:
        return (Digest)new MD5Digest((MD5Digest)paramDigest);
      case 2:
        return (Digest)new SHA1Digest((SHA1Digest)paramDigest);
      case 3:
        return (Digest)new SHA224Digest((SHA224Digest)paramDigest);
      case 4:
        return (Digest)SHA256Digest.newInstance(paramDigest);
      case 5:
        return (Digest)new SHA384Digest((SHA384Digest)paramDigest);
      case 6:
        return (Digest)new SHA512Digest((SHA512Digest)paramDigest);
      case 7:
        return (Digest)new SM3Digest((SM3Digest)paramDigest);
    } 
    throw new IllegalArgumentException("invalid CryptoHashAlgorithm: " + paramInt);
  }
  
  public Digest createDigest(int paramInt) {
    switch (paramInt) {
      case 1:
        return (Digest)new MD5Digest();
      case 2:
        return (Digest)new SHA1Digest();
      case 3:
        return (Digest)new SHA224Digest();
      case 4:
        return (Digest)new SHA256Digest();
      case 5:
        return (Digest)new SHA384Digest();
      case 6:
        return (Digest)new SHA512Digest();
      case 7:
        return (Digest)new SM3Digest();
    } 
    throw new IllegalArgumentException("invalid CryptoHashAlgorithm: " + paramInt);
  }
  
  public TlsHash createHash(int paramInt) {
    return new BcTlsHash(this, paramInt);
  }
  
  protected BlockCipher createBlockCipher(int paramInt) throws IOException {
    switch (paramInt) {
      case 7:
        return createDESedeEngine();
      case 8:
      case 9:
        return createAESEngine();
      case 22:
      case 23:
        return createARIAEngine();
      case 12:
      case 13:
        return createCamelliaEngine();
      case 14:
        return createSEEDEngine();
      case 28:
        return createSM4Engine();
    } 
    throw new TlsFatalAlert((short)80);
  }
  
  protected BlockCipher createCBCBlockCipher(BlockCipher paramBlockCipher) {
    return (BlockCipher)CBCBlockCipher.newInstance(paramBlockCipher);
  }
  
  protected BlockCipher createCBCBlockCipher(int paramInt) throws IOException {
    return createCBCBlockCipher(createBlockCipher(paramInt));
  }
  
  protected TlsCipher createChaCha20Poly1305(TlsCryptoParameters paramTlsCryptoParameters) throws IOException {
    return (TlsCipher)new TlsAEADCipher(paramTlsCryptoParameters, new BcChaCha20Poly1305(true), new BcChaCha20Poly1305(false), 32, 16, 2);
  }
  
  protected TlsAEADCipher createCipher_AES_CCM(TlsCryptoParameters paramTlsCryptoParameters, int paramInt1, int paramInt2) throws IOException {
    BcTlsAEADCipherImpl bcTlsAEADCipherImpl1 = new BcTlsAEADCipherImpl(createAEADBlockCipher_AES_CCM(), true);
    BcTlsAEADCipherImpl bcTlsAEADCipherImpl2 = new BcTlsAEADCipherImpl(createAEADBlockCipher_AES_CCM(), false);
    return new TlsAEADCipher(paramTlsCryptoParameters, bcTlsAEADCipherImpl1, bcTlsAEADCipherImpl2, paramInt1, paramInt2, 1);
  }
  
  protected TlsAEADCipher createCipher_AES_GCM(TlsCryptoParameters paramTlsCryptoParameters, int paramInt1, int paramInt2) throws IOException {
    BcTlsAEADCipherImpl bcTlsAEADCipherImpl1 = new BcTlsAEADCipherImpl(createAEADBlockCipher_AES_GCM(), true);
    BcTlsAEADCipherImpl bcTlsAEADCipherImpl2 = new BcTlsAEADCipherImpl(createAEADBlockCipher_AES_GCM(), false);
    return new TlsAEADCipher(paramTlsCryptoParameters, bcTlsAEADCipherImpl1, bcTlsAEADCipherImpl2, paramInt1, paramInt2, 3);
  }
  
  protected TlsAEADCipher createCipher_ARIA_GCM(TlsCryptoParameters paramTlsCryptoParameters, int paramInt1, int paramInt2) throws IOException {
    BcTlsAEADCipherImpl bcTlsAEADCipherImpl1 = new BcTlsAEADCipherImpl(createAEADBlockCipher_ARIA_GCM(), true);
    BcTlsAEADCipherImpl bcTlsAEADCipherImpl2 = new BcTlsAEADCipherImpl(createAEADBlockCipher_ARIA_GCM(), false);
    return new TlsAEADCipher(paramTlsCryptoParameters, bcTlsAEADCipherImpl1, bcTlsAEADCipherImpl2, paramInt1, paramInt2, 3);
  }
  
  protected TlsAEADCipher createCipher_Camellia_GCM(TlsCryptoParameters paramTlsCryptoParameters, int paramInt1, int paramInt2) throws IOException {
    BcTlsAEADCipherImpl bcTlsAEADCipherImpl1 = new BcTlsAEADCipherImpl(createAEADBlockCipher_Camellia_GCM(), true);
    BcTlsAEADCipherImpl bcTlsAEADCipherImpl2 = new BcTlsAEADCipherImpl(createAEADBlockCipher_Camellia_GCM(), false);
    return new TlsAEADCipher(paramTlsCryptoParameters, bcTlsAEADCipherImpl1, bcTlsAEADCipherImpl2, paramInt1, paramInt2, 3);
  }
  
  protected TlsCipher createCipher_CBC(TlsCryptoParameters paramTlsCryptoParameters, int paramInt1, int paramInt2, int paramInt3) throws IOException {
    BcTlsBlockCipherImpl bcTlsBlockCipherImpl1 = new BcTlsBlockCipherImpl(createCBCBlockCipher(paramInt1), true);
    BcTlsBlockCipherImpl bcTlsBlockCipherImpl2 = new BcTlsBlockCipherImpl(createCBCBlockCipher(paramInt1), false);
    TlsHMAC tlsHMAC1 = createMAC(paramTlsCryptoParameters, paramInt3);
    TlsHMAC tlsHMAC2 = createMAC(paramTlsCryptoParameters, paramInt3);
    return (TlsCipher)new TlsBlockCipher(paramTlsCryptoParameters, bcTlsBlockCipherImpl1, bcTlsBlockCipherImpl2, tlsHMAC1, tlsHMAC2, paramInt2);
  }
  
  protected TlsAEADCipher createCipher_SM4_CCM(TlsCryptoParameters paramTlsCryptoParameters) throws IOException {
    BcTlsAEADCipherImpl bcTlsAEADCipherImpl1 = new BcTlsAEADCipherImpl(createAEADBlockCipher_SM4_CCM(), true);
    BcTlsAEADCipherImpl bcTlsAEADCipherImpl2 = new BcTlsAEADCipherImpl(createAEADBlockCipher_SM4_CCM(), false);
    return new TlsAEADCipher(paramTlsCryptoParameters, bcTlsAEADCipherImpl1, bcTlsAEADCipherImpl2, 16, 16, 1);
  }
  
  protected TlsAEADCipher createCipher_SM4_GCM(TlsCryptoParameters paramTlsCryptoParameters) throws IOException {
    BcTlsAEADCipherImpl bcTlsAEADCipherImpl1 = new BcTlsAEADCipherImpl(createAEADBlockCipher_SM4_GCM(), true);
    BcTlsAEADCipherImpl bcTlsAEADCipherImpl2 = new BcTlsAEADCipherImpl(createAEADBlockCipher_SM4_GCM(), false);
    return new TlsAEADCipher(paramTlsCryptoParameters, bcTlsAEADCipherImpl1, bcTlsAEADCipherImpl2, 16, 16, 3);
  }
  
  protected TlsNullCipher createNullCipher(TlsCryptoParameters paramTlsCryptoParameters, int paramInt) throws IOException {
    return new TlsNullCipher(paramTlsCryptoParameters, createMAC(paramTlsCryptoParameters, paramInt), createMAC(paramTlsCryptoParameters, paramInt));
  }
  
  protected BlockCipher createAESEngine() {
    return (BlockCipher)AESEngine.newInstance();
  }
  
  protected BlockCipher createARIAEngine() {
    return (BlockCipher)new ARIAEngine();
  }
  
  protected BlockCipher createCamelliaEngine() {
    return (BlockCipher)new CamelliaEngine();
  }
  
  protected BlockCipher createDESedeEngine() {
    return (BlockCipher)new DESedeEngine();
  }
  
  protected BlockCipher createSEEDEngine() {
    return (BlockCipher)new SEEDEngine();
  }
  
  protected BlockCipher createSM4Engine() {
    return (BlockCipher)new SM4Engine();
  }
  
  protected AEADBlockCipher createCCMMode(BlockCipher paramBlockCipher) {
    return (AEADBlockCipher)new CCMBlockCipher(paramBlockCipher);
  }
  
  protected AEADBlockCipher createGCMMode(BlockCipher paramBlockCipher) {
    return (AEADBlockCipher)GCMBlockCipher.newInstance(paramBlockCipher);
  }
  
  protected AEADBlockCipher createAEADBlockCipher_AES_CCM() {
    return createCCMMode(createAESEngine());
  }
  
  protected AEADBlockCipher createAEADBlockCipher_AES_GCM() {
    return createGCMMode(createAESEngine());
  }
  
  protected AEADBlockCipher createAEADBlockCipher_ARIA_GCM() {
    return createGCMMode(createARIAEngine());
  }
  
  protected AEADBlockCipher createAEADBlockCipher_Camellia_GCM() {
    return createGCMMode(createCamelliaEngine());
  }
  
  protected AEADBlockCipher createAEADBlockCipher_SM4_CCM() {
    return createCCMMode(createSM4Engine());
  }
  
  protected AEADBlockCipher createAEADBlockCipher_SM4_GCM() {
    return createGCMMode(createSM4Engine());
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
    return new BcTlsHMAC(new HMac(createDigest(paramInt)));
  }
  
  protected TlsHMAC createHMAC_SSL(int paramInt) throws IOException {
    switch (paramInt) {
      case 1:
        return new BcSSL3HMAC(createDigest(1));
      case 2:
        return new BcSSL3HMAC(createDigest(2));
      case 3:
        return new BcSSL3HMAC(createDigest(4));
      case 4:
        return new BcSSL3HMAC(createDigest(5));
      case 5:
        return new BcSSL3HMAC(createDigest(6));
    } 
    throw new TlsFatalAlert((short)80);
  }
  
  protected TlsHMAC createMAC(TlsCryptoParameters paramTlsCryptoParameters, int paramInt) throws IOException {
    return TlsImplUtils.isSSL(paramTlsCryptoParameters) ? createHMAC_SSL(paramInt) : createHMAC(paramInt);
  }
  
  public TlsSRP6Client createSRP6Client(TlsSRPConfig paramTlsSRPConfig) {
    BigInteger[] arrayOfBigInteger = paramTlsSRPConfig.getExplicitNG();
    SRP6GroupParameters sRP6GroupParameters = new SRP6GroupParameters(arrayOfBigInteger[0], arrayOfBigInteger[1]);
    SRP6Client sRP6Client = new SRP6Client();
    sRP6Client.init(sRP6GroupParameters, createDigest(2), getSecureRandom());
    return new BcTlsSRP6Client(sRP6Client);
  }
  
  public TlsSRP6Server createSRP6Server(TlsSRPConfig paramTlsSRPConfig, BigInteger paramBigInteger) {
    BigInteger[] arrayOfBigInteger = paramTlsSRPConfig.getExplicitNG();
    SRP6GroupParameters sRP6GroupParameters = new SRP6GroupParameters(arrayOfBigInteger[0], arrayOfBigInteger[1]);
    SRP6Server sRP6Server = new SRP6Server();
    sRP6Server.init(sRP6GroupParameters, paramBigInteger, createDigest(2), getSecureRandom());
    return new BcTlsSRP6Server(sRP6Server);
  }
  
  public TlsSRP6VerifierGenerator createSRP6VerifierGenerator(TlsSRPConfig paramTlsSRPConfig) {
    BigInteger[] arrayOfBigInteger = paramTlsSRPConfig.getExplicitNG();
    SRP6VerifierGenerator sRP6VerifierGenerator = new SRP6VerifierGenerator();
    sRP6VerifierGenerator.init(arrayOfBigInteger[0], arrayOfBigInteger[1], createDigest(2));
    return new BcTlsSRP6VerifierGenerator(sRP6VerifierGenerator);
  }
  
  public TlsSecret hkdfInit(int paramInt) {
    return (TlsSecret)adoptLocalSecret(new byte[TlsCryptoUtils.getHashOutputSize(paramInt)]);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsCrypto.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */