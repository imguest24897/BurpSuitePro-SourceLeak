package META-INF.versions.9.org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CryptoServiceConstraintsException;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.internal.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.jce.provider.BouncyCastleProviderConfiguration;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.jcajce.provider.bike.BIKEKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.cmce.CMCEKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.newhope.NHKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.picnic.PicnicKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.sphincs.Sphincs256KeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.xmss.XMSSKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyFactorySpi;
import org.bouncycastle.util.Strings;

public final class BouncyCastleProvider extends Provider implements ConfigurableProvider {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jce.provider.BouncyCastleProvider.class.getName());
  
  private static String info = "BouncyCastle Security Provider v1.78.1";
  
  public static final String PROVIDER_NAME = "BC";
  
  public static final ProviderConfiguration CONFIGURATION = (ProviderConfiguration)new BouncyCastleProviderConfiguration();
  
  private static final Map keyInfoConverters = new HashMap<>();
  
  private static final Class revChkClass = ClassUtil.loadClass(org.bouncycastle.jce.provider.BouncyCastleProvider.class, "java.security.cert.PKIXRevocationChecker");
  
  private static final String SYMMETRIC_PACKAGE = "org.bouncycastle.jcajce.provider.symmetric.";
  
  private static final String[] SYMMETRIC_GENERIC = new String[] { "PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT" };
  
  private static final String[] SYMMETRIC_MACS = new String[] { "SipHash", "SipHash128", "Poly1305" };
  
  private static final CryptoServiceProperties[] SYMMETRIC_CIPHERS = new CryptoServiceProperties[] { 
      service("AES", 256), service("ARC4", 20), service("ARIA", 256), service("Blowfish", 128), service("Camellia", 256), service("CAST5", 128), service("CAST6", 256), service("ChaCha", 128), service("DES", 56), service("DESede", 112), 
      service("GOST28147", 128), service("Grainv1", 128), service("Grain128", 128), service("HC128", 128), service("HC256", 256), service("IDEA", 128), service("Noekeon", 128), service("RC2", 128), service("RC5", 128), service("RC6", 256), 
      service("Rijndael", 256), service("Salsa20", 128), service("SEED", 128), service("Serpent", 256), service("Shacal2", 128), service("Skipjack", 80), service("SM4", 128), service("TEA", 128), service("Twofish", 256), service("Threefish", 128), 
      service("VMPC", 128), service("VMPCKSA3", 128), service("XTEA", 128), service("XSalsa20", 128), service("OpenSSLPBKDF", 128), service("DSTU7624", 256), service("GOST3412_2015", 256), service("Zuc", 128) };
  
  private static final String ASYMMETRIC_PACKAGE = "org.bouncycastle.jcajce.provider.asymmetric.";
  
  private static final String[] ASYMMETRIC_GENERIC = new String[] { "X509", "IES", "COMPOSITE", "EXTERNAL", "CompositeSignatures" };
  
  private static final String[] ASYMMETRIC_CIPHERS = new String[] { 
      "DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC", 
      "LMS", "SPHINCSPlus", "Dilithium", "Falcon", "NTRU" };
  
  private static final String DIGEST_PACKAGE = "org.bouncycastle.jcajce.provider.digest.";
  
  private static final String[] DIGESTS = new String[] { 
      "GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", 
      "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", 
      "Blake2s", "DSTU7564", "Haraka", "Blake3" };
  
  private static final String KEYSTORE_PACKAGE = "org.bouncycastle.jcajce.provider.keystore.";
  
  private static final String[] KEYSTORES = new String[] { "BC", "BCFKS", "PKCS12" };
  
  private static final String SECURE_RANDOM_PACKAGE = "org.bouncycastle.jcajce.provider.drbg.";
  
  private static final String[] SECURE_RANDOMS = new String[] { "DRBG" };
  
  private Map<String, Provider.Service> serviceMap = new ConcurrentHashMap<>();
  
  public BouncyCastleProvider() {
    super("BC", 1.7801D, info);
    AccessController.doPrivileged((PrivilegedAction<?>)new Object(this));
  }
  
  private void setup() {
    loadAlgorithms("org.bouncycastle.jcajce.provider.digest.", DIGESTS);
    loadAlgorithms("org.bouncycastle.jcajce.provider.symmetric.", SYMMETRIC_GENERIC);
    loadAlgorithms("org.bouncycastle.jcajce.provider.symmetric.", SYMMETRIC_MACS);
    loadAlgorithms("org.bouncycastle.jcajce.provider.symmetric.", SYMMETRIC_CIPHERS);
    loadAlgorithms("org.bouncycastle.jcajce.provider.asymmetric.", ASYMMETRIC_GENERIC);
    loadAlgorithms("org.bouncycastle.jcajce.provider.asymmetric.", ASYMMETRIC_CIPHERS);
    loadAlgorithms("org.bouncycastle.jcajce.provider.keystore.", KEYSTORES);
    loadAlgorithms("org.bouncycastle.jcajce.provider.drbg.", SECURE_RANDOMS);
    loadPQCKeys();
    put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
    put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
    put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
    put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
    put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
    put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
    put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
    put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
    put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
    put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
    put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
    put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
    put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
    put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
    put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
    if (revChkClass != null) {
      put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
      put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
      put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
      put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
      put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
      put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
    } else {
      put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
      put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
      put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
      put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
      put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
      put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
    } 
    put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
    put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
    put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
    put("Alg.Alias.CertStore.X509LDAP", "LDAP");
  }
  
  public final Provider.Service getService(String paramString1, String paramString2) {
    String str1 = Strings.toUpperCase(paramString2);
    String str2 = paramString1 + "." + paramString1;
    Provider.Service service = this.serviceMap.get(str2);
    if (service == null)
      synchronized (this) {
        if (!this.serviceMap.containsKey(str2)) {
          service = AccessController.<Provider.Service>doPrivileged((PrivilegedAction<Provider.Service>)new Object(this, paramString1, paramString2, str2));
        } else {
          service = this.serviceMap.get(str2);
        } 
      }  
    return service;
  }
  
  private void loadAlgorithms(String paramString, String[] paramArrayOfString) {
    for (byte b = 0; b != paramArrayOfString.length; b++)
      loadServiceClass(paramString, paramArrayOfString[b]); 
  }
  
  private void loadAlgorithms(String paramString, CryptoServiceProperties[] paramArrayOfCryptoServiceProperties) {
    for (byte b = 0; b != paramArrayOfCryptoServiceProperties.length; b++) {
      CryptoServiceProperties cryptoServiceProperties = paramArrayOfCryptoServiceProperties[b];
      try {
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties);
        loadServiceClass(paramString, cryptoServiceProperties.getServiceName());
      } catch (CryptoServiceConstraintsException cryptoServiceConstraintsException) {
        if (LOG.isLoggable(Level.FINE))
          LOG.fine("service for " + cryptoServiceProperties.getServiceName() + " ignored due to constraints"); 
      } 
    } 
  }
  
  private void loadServiceClass(String paramString1, String paramString2) {
    Class<AlgorithmProvider> clazz = ClassUtil.loadClass(org.bouncycastle.jce.provider.BouncyCastleProvider.class, paramString1 + paramString1 + "$Mappings");
    if (clazz != null)
      try {
        ((AlgorithmProvider)clazz.newInstance()).configure(this);
      } catch (Exception exception) {
        throw new InternalError("cannot create instance of " + paramString1 + paramString2 + "$Mappings : " + exception);
      }  
  }
  
  private void loadPQCKeys() {
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_128s_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_128f_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_128s_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_128f_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_128s_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_128f_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_192s_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_192f_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_192s_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_192f_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_192s_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_192f_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_256s_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_256f_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_256s_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_256f_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_256s_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_256f_r3, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_128s_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_128f_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_128s_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_128f_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_128s_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_128f_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_192s_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_192f_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_192s_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_192f_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_192s_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_192f_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_256s_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_256f_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_256s_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_256f_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_256s_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_256f_r3_simple, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_128s, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_192s, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_256s, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(new ASN1ObjectIdentifier("1.3.9999.6.4.10"), (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_128f, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_192f, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_256f, (AsymmetricKeyInfoConverter)new SPHINCSPlusKeyFactorySpi());
    addKeyInfoConverter(PQCObjectIdentifiers.sphincs256, (AsymmetricKeyInfoConverter)new Sphincs256KeyFactorySpi());
    addKeyInfoConverter(PQCObjectIdentifiers.newHope, (AsymmetricKeyInfoConverter)new NHKeyFactorySpi());
    addKeyInfoConverter(PQCObjectIdentifiers.xmss, (AsymmetricKeyInfoConverter)new XMSSKeyFactorySpi());
    addKeyInfoConverter(IsaraObjectIdentifiers.id_alg_xmss, (AsymmetricKeyInfoConverter)new XMSSKeyFactorySpi());
    addKeyInfoConverter(PQCObjectIdentifiers.xmss_mt, (AsymmetricKeyInfoConverter)new XMSSMTKeyFactorySpi());
    addKeyInfoConverter(IsaraObjectIdentifiers.id_alg_xmssmt, (AsymmetricKeyInfoConverter)new XMSSMTKeyFactorySpi());
    addKeyInfoConverter(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig, (AsymmetricKeyInfoConverter)new LMSKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.picnic_key, (AsymmetricKeyInfoConverter)new PicnicKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.falcon_512, (AsymmetricKeyInfoConverter)new FalconKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.falcon_1024, (AsymmetricKeyInfoConverter)new FalconKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.dilithium2, (AsymmetricKeyInfoConverter)new DilithiumKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.dilithium3, (AsymmetricKeyInfoConverter)new DilithiumKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.dilithium5, (AsymmetricKeyInfoConverter)new DilithiumKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.dilithium2_aes, (AsymmetricKeyInfoConverter)new DilithiumKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.dilithium3_aes, (AsymmetricKeyInfoConverter)new DilithiumKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.dilithium5_aes, (AsymmetricKeyInfoConverter)new DilithiumKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.kyber512, (AsymmetricKeyInfoConverter)new KyberKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.kyber768, (AsymmetricKeyInfoConverter)new KyberKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.kyber1024, (AsymmetricKeyInfoConverter)new KyberKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.mceliece348864_r3, (AsymmetricKeyInfoConverter)new CMCEKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.mceliece460896_r3, (AsymmetricKeyInfoConverter)new CMCEKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.mceliece6688128_r3, (AsymmetricKeyInfoConverter)new CMCEKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.mceliece6960119_r3, (AsymmetricKeyInfoConverter)new CMCEKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.mceliece8192128_r3, (AsymmetricKeyInfoConverter)new CMCEKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.bike128, (AsymmetricKeyInfoConverter)new BIKEKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.bike192, (AsymmetricKeyInfoConverter)new BIKEKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.bike256, (AsymmetricKeyInfoConverter)new BIKEKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.hqc128, (AsymmetricKeyInfoConverter)new HQCKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.hqc192, (AsymmetricKeyInfoConverter)new HQCKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.hqc256, (AsymmetricKeyInfoConverter)new HQCKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.kyber1024, (AsymmetricKeyInfoConverter)new KyberKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.kyber512_aes, (AsymmetricKeyInfoConverter)new KyberKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.kyber768_aes, (AsymmetricKeyInfoConverter)new KyberKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.kyber1024_aes, (AsymmetricKeyInfoConverter)new KyberKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.ntruhps2048509, (AsymmetricKeyInfoConverter)new NTRUKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.ntruhps2048677, (AsymmetricKeyInfoConverter)new NTRUKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.ntruhps4096821, (AsymmetricKeyInfoConverter)new NTRUKeyFactorySpi());
    addKeyInfoConverter(BCObjectIdentifiers.ntruhrss701, (AsymmetricKeyInfoConverter)new NTRUKeyFactorySpi());
  }
  
  public void setParameter(String paramString, Object paramObject) {
    synchronized (CONFIGURATION) {
      ((BouncyCastleProviderConfiguration)CONFIGURATION).setParameter(paramString, paramObject);
    } 
  }
  
  public boolean hasAlgorithm(String paramString1, String paramString2) {
    return (containsKey(paramString1 + "." + paramString1) || containsKey("Alg.Alias." + paramString1 + "." + paramString2));
  }
  
  public void addAlgorithm(String paramString1, String paramString2) {
    if (containsKey(paramString1))
      throw new IllegalStateException("duplicate provider key (" + paramString1 + ") found"); 
    put(paramString1, paramString2);
  }
  
  public void addAlgorithm(String paramString1, String paramString2, Map<String, String> paramMap) {
    addAlgorithm(paramString1, paramString2);
    addAttributes(paramString1, paramMap);
  }
  
  public void addAlgorithm(String paramString1, ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString2) {
    addAlgorithm(paramString1 + "." + paramString1, paramString2);
    addAlgorithm(paramString1 + ".OID." + paramString1, paramString2);
  }
  
  public void addAlgorithm(String paramString1, ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString2, Map<String, String> paramMap) {
    addAlgorithm(paramString1, paramASN1ObjectIdentifier, paramString2);
    addAttributes(paramString1 + "." + paramString1, paramMap);
    addAttributes(paramString1 + ".OID." + paramString1, paramMap);
  }
  
  public void addKeyInfoConverter(ASN1ObjectIdentifier paramASN1ObjectIdentifier, AsymmetricKeyInfoConverter paramAsymmetricKeyInfoConverter) {
    synchronized (keyInfoConverters) {
      keyInfoConverters.put(paramASN1ObjectIdentifier, paramAsymmetricKeyInfoConverter);
    } 
  }
  
  public AsymmetricKeyInfoConverter getKeyInfoConverter(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return (AsymmetricKeyInfoConverter)keyInfoConverters.get(paramASN1ObjectIdentifier);
  }
  
  public void addAttributes(String paramString, Map<String, String> paramMap) {
    put(paramString + " ImplementedIn", "Software");
    for (String str1 : paramMap.keySet()) {
      String str2 = paramString + " " + paramString;
      if (containsKey(str2))
        throw new IllegalStateException("duplicate provider attribute key (" + str2 + ") found"); 
      put(str2, paramMap.get(str1));
    } 
  }
  
  private static AsymmetricKeyInfoConverter getAsymmetricKeyInfoConverter(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    synchronized (keyInfoConverters) {
      return (AsymmetricKeyInfoConverter)keyInfoConverters.get(paramASN1ObjectIdentifier);
    } 
  }
  
  public static PublicKey getPublicKey(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) throws IOException {
    if (paramSubjectPublicKeyInfo.getAlgorithm().getAlgorithm().on(BCObjectIdentifiers.picnic_key))
      return (new PicnicKeyFactorySpi()).generatePublic(paramSubjectPublicKeyInfo); 
    AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(paramSubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
    return (asymmetricKeyInfoConverter == null) ? null : asymmetricKeyInfoConverter.generatePublic(paramSubjectPublicKeyInfo);
  }
  
  public static PrivateKey getPrivateKey(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(paramPrivateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
    return (asymmetricKeyInfoConverter == null) ? null : asymmetricKeyInfoConverter.generatePrivate(paramPrivateKeyInfo);
  }
  
  private static CryptoServiceProperties service(String paramString, int paramInt) {
    return (CryptoServiceProperties)new JcaCryptoService(paramString, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jce\provider\BouncyCastleProvider.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */