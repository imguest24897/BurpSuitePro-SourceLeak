package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContextSpi;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jsse.BCX509ExtendedKeyManager;
import org.bouncycastle.jsse.BCX509ExtendedTrustManager;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.java.security.BCCryptoPrimitive;
import org.bouncycastle.jsse.provider.CipherSuiteInfo;
import org.bouncycastle.jsse.provider.ContextData;
import org.bouncycastle.jsse.provider.DummyX509KeyManager;
import org.bouncycastle.jsse.provider.DummyX509TrustManager;
import org.bouncycastle.jsse.provider.FipsUtils;
import org.bouncycastle.jsse.provider.JsseUtils;
import org.bouncycastle.jsse.provider.KeyStoreConfig;
import org.bouncycastle.jsse.provider.PropertyUtils;
import org.bouncycastle.jsse.provider.ProvAlgorithmConstraints;
import org.bouncycastle.jsse.provider.ProvKeyManagerFactorySpi;
import org.bouncycastle.jsse.provider.ProvSSLParameters;
import org.bouncycastle.jsse.provider.ProvSSLServerSocketFactory;
import org.bouncycastle.jsse.provider.ProvSSLSocketFactory;
import org.bouncycastle.jsse.provider.ProvTrustManagerFactorySpi;
import org.bouncycastle.jsse.provider.SSLEngineUtil;
import org.bouncycastle.jsse.provider.SSLParametersUtil;
import org.bouncycastle.jsse.provider.X509KeyManagerUtil;
import org.bouncycastle.jsse.provider.X509TrustManagerUtil;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsDHUtils;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCryptoProvider;

class ProvSSLContextSpi extends SSLContextSpi {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.ProvSSLContextSpi.class.getName());
  
  private static final String PROPERTY_CLIENT_CIPHERSUITES = "jdk.tls.client.cipherSuites";
  
  private static final String PROPERTY_SERVER_CIPHERSUITES = "jdk.tls.server.cipherSuites";
  
  private static final String PROPERTY_CLIENT_PROTOCOLS = "jdk.tls.client.protocols";
  
  private static final String PROPERTY_SERVER_PROTOCOLS = "jdk.tls.server.protocols";
  
  private static final Set<BCCryptoPrimitive> TLS_CRYPTO_PRIMITIVES_BC = JsseUtils.KEY_AGREEMENT_CRYPTO_PRIMITIVES_BC;
  
  private static final Map<String, CipherSuiteInfo> SUPPORTED_CIPHERSUITE_MAP = createSupportedCipherSuiteMap();
  
  private static final Map<String, CipherSuiteInfo> SUPPORTED_CIPHERSUITE_MAP_FIPS = createSupportedCipherSuiteMapFips(SUPPORTED_CIPHERSUITE_MAP);
  
  private static final Map<String, ProtocolVersion> SUPPORTED_PROTOCOL_MAP = createSupportedProtocolMap();
  
  private static final Map<String, ProtocolVersion> SUPPORTED_PROTOCOL_MAP_FIPS = createSupportedProtocolMapFips(SUPPORTED_PROTOCOL_MAP);
  
  private static final List<String> DEFAULT_CIPHERSUITE_LIST = createDefaultCipherSuiteList(SUPPORTED_CIPHERSUITE_MAP.keySet());
  
  private static final List<String> DEFAULT_CIPHERSUITE_LIST_FIPS = createDefaultCipherSuiteListFips(DEFAULT_CIPHERSUITE_LIST);
  
  private static final List<String> DEFAULT_PROTOCOL_LIST = createDefaultProtocolList(SUPPORTED_PROTOCOL_MAP.keySet());
  
  private static final List<String> DEFAULT_PROTOCOL_LIST_FIPS = createDefaultProtocolListFips(DEFAULT_PROTOCOL_LIST);
  
  protected final boolean isInFipsMode;
  
  protected final JcaTlsCryptoProvider cryptoProvider;
  
  protected final Map<String, CipherSuiteInfo> supportedCipherSuites;
  
  protected final Map<String, ProtocolVersion> supportedProtocols;
  
  protected final String[] defaultCipherSuitesClient;
  
  protected final String[] defaultCipherSuitesServer;
  
  protected final String[] defaultProtocolsClient;
  
  protected final String[] defaultProtocolsServer;
  
  private ContextData contextData = null;
  
  private static void addCipherSuite(Map<String, CipherSuiteInfo> paramMap, String paramString, int paramInt) {
    CipherSuiteInfo cipherSuiteInfo = CipherSuiteInfo.forCipherSuite(paramInt, paramString);
    if (null != paramMap.put(paramString, cipherSuiteInfo))
      throw new IllegalStateException("Duplicate names in supported-cipher-suites"); 
  }
  
  private static List<String> createDefaultCipherSuiteList(Set<String> paramSet) {
    ArrayList<String> arrayList = new ArrayList();
    arrayList.add("TLS_CHACHA20_POLY1305_SHA256");
    arrayList.add("TLS_AES_256_GCM_SHA384");
    arrayList.add("TLS_AES_128_GCM_SHA256");
    arrayList.add("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    arrayList.add("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
    arrayList.add("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
    arrayList.add("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    arrayList.add("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
    arrayList.add("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
    arrayList.add("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    arrayList.add("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
    arrayList.add("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
    arrayList.add("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
    arrayList.add("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
    arrayList.add("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
    arrayList.add("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
    arrayList.add("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
    arrayList.add("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
    arrayList.add("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
    arrayList.add("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
    arrayList.add("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
    arrayList.add("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
    arrayList.add("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
    arrayList.add("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
    arrayList.add("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
    arrayList.add("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
    arrayList.add("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
    arrayList.add("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
    arrayList.add("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
    arrayList.add("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
    arrayList.retainAll(paramSet);
    arrayList.trimToSize();
    return Collections.unmodifiableList(arrayList);
  }
  
  private static List<String> createDefaultCipherSuiteListFips(List<String> paramList) {
    ArrayList<String> arrayList = new ArrayList<>(paramList);
    FipsUtils.removeNonFipsCipherSuites(arrayList);
    arrayList.trimToSize();
    return Collections.unmodifiableList(arrayList);
  }
  
  private static List<String> createDefaultProtocolList(Set<String> paramSet) {
    ArrayList<String> arrayList = new ArrayList();
    arrayList.add("TLSv1.3");
    arrayList.add("TLSv1.2");
    arrayList.add("TLSv1.1");
    arrayList.add("TLSv1");
    arrayList.retainAll(paramSet);
    arrayList.trimToSize();
    return Collections.unmodifiableList(arrayList);
  }
  
  private static List<String> createDefaultProtocolListFips(List<String> paramList) {
    ArrayList<String> arrayList = new ArrayList<>(paramList);
    FipsUtils.removeNonFipsProtocols(arrayList);
    arrayList.trimToSize();
    return Collections.unmodifiableList(arrayList);
  }
  
  private static Map<String, CipherSuiteInfo> createSupportedCipherSuiteMap() {
    TreeMap<Object, Object> treeMap = new TreeMap<>();
    addCipherSuite((Map)treeMap, "TLS_AES_128_CCM_8_SHA256", 4869);
    addCipherSuite((Map)treeMap, "TLS_AES_128_CCM_SHA256", 4868);
    addCipherSuite((Map)treeMap, "TLS_AES_128_GCM_SHA256", 4865);
    addCipherSuite((Map)treeMap, "TLS_AES_256_GCM_SHA384", 4866);
    addCipherSuite((Map)treeMap, "TLS_CHACHA20_POLY1305_SHA256", 4867);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_ARIA_128_CBC_SHA256", 49222);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_ARIA_128_GCM_SHA256", 49242);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_ARIA_256_CBC_SHA384", 49223);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_ARIA_256_GCM_SHA384", 49243);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA", 70);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256", 191);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_CAMELLIA_128_GCM_SHA256", 49284);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA", 137);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256", 197);
    addCipherSuite((Map)treeMap, "TLS_DH_anon_WITH_CAMELLIA_256_GCM_SHA384", 49285);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_ARIA_128_CBC_SHA256", 49218);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_ARIA_128_GCM_SHA256", 49238);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_ARIA_256_CBC_SHA384", 49219);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_ARIA_256_GCM_SHA384", 49239);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256", 189);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_CAMELLIA_128_GCM_SHA256", 49280);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256", 195);
    addCipherSuite((Map)treeMap, "TLS_DHE_DSS_WITH_CAMELLIA_256_GCM_SHA384", 49281);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_AES_128_CCM", 49310);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_AES_128_CCM_8", 49314);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_AES_256_CCM", 49311);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_AES_256_CCM_8", 49315);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_ARIA_128_CBC_SHA256", 49220);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_ARIA_128_GCM_SHA256", 49234);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_ARIA_256_CBC_SHA384", 49221);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_ARIA_256_GCM_SHA384", 49235);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256", 190);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_CAMELLIA_128_GCM_SHA256", 49276);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256", 196);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_CAMELLIA_256_GCM_SHA384", 49277);
    addCipherSuite((Map)treeMap, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
    addCipherSuite((Map)treeMap, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
    addCipherSuite((Map)treeMap, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
    addCipherSuite((Map)treeMap, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_AES_128_CCM", 49324);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8", 49326);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_AES_256_CCM", 49325);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8", 49327);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_ARIA_128_CBC_SHA256", 49224);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_ARIA_128_GCM_SHA256", 49244);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_ARIA_256_CBC_SHA384", 49225);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_ARIA_256_GCM_SHA384", 49245);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256", 49266);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256", 49286);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384", 49267);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384", 49287);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_ARIA_128_CBC_SHA256", 49228);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_ARIA_128_GCM_SHA256", 49248);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_ARIA_256_CBC_SHA384", 49229);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_ARIA_256_GCM_SHA384", 49249);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256", 49270);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256", 49290);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384", 49271);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384", 49291);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
    addCipherSuite((Map)treeMap, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_3DES_EDE_CBC_SHA", 10);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_AES_128_CCM", 49308);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_AES_128_CCM_8", 49312);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_AES_256_CCM", 49309);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_AES_256_CCM_8", 49313);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_ARIA_128_CBC_SHA256", 49212);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_ARIA_128_GCM_SHA256", 49232);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_ARIA_256_CBC_SHA384", 49213);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_ARIA_256_GCM_SHA384", 49233);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256", 186);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_CAMELLIA_128_GCM_SHA256", 49274);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA256", 192);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_CAMELLIA_256_GCM_SHA384", 49275);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_NULL_SHA", 2);
    addCipherSuite((Map)treeMap, "TLS_RSA_WITH_NULL_SHA256", 59);
    return (Map)Collections.unmodifiableMap(treeMap);
  }
  
  private static Map<String, CipherSuiteInfo> createSupportedCipherSuiteMapFips(Map<String, CipherSuiteInfo> paramMap) {
    LinkedHashMap<String, CipherSuiteInfo> linkedHashMap = new LinkedHashMap<>(paramMap);
    FipsUtils.removeNonFipsCipherSuites(linkedHashMap.keySet());
    return Collections.unmodifiableMap(linkedHashMap);
  }
  
  private static Map<String, ProtocolVersion> createSupportedProtocolMap() {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put("TLSv1.3", ProtocolVersion.TLSv13);
    linkedHashMap.put("TLSv1.2", ProtocolVersion.TLSv12);
    linkedHashMap.put("TLSv1.1", ProtocolVersion.TLSv11);
    linkedHashMap.put("TLSv1", ProtocolVersion.TLSv10);
    linkedHashMap.put("SSLv3", ProtocolVersion.SSLv3);
    return (Map)Collections.unmodifiableMap(linkedHashMap);
  }
  
  private static Map<String, ProtocolVersion> createSupportedProtocolMapFips(Map<String, ProtocolVersion> paramMap) {
    LinkedHashMap<String, ProtocolVersion> linkedHashMap = new LinkedHashMap<>(paramMap);
    FipsUtils.removeNonFipsProtocols(linkedHashMap.keySet());
    return Collections.unmodifiableMap(linkedHashMap);
  }
  
  private static String[] getDefaultEnabledCipherSuites(Map<String, CipherSuiteInfo> paramMap, List<String> paramList, boolean paramBoolean, String paramString) {
    List<String> list = getJdkTlsCipherSuites(paramString, paramList);
    String[] arrayOfString = new String[list.size()];
    byte b = 0;
    for (String str : list) {
      CipherSuiteInfo cipherSuiteInfo = paramMap.get(str);
      if (null == cipherSuiteInfo || (paramBoolean && list == paramList && TlsDHUtils.isDHCipherSuite(cipherSuiteInfo.getCipherSuite())) || !ProvAlgorithmConstraints.DEFAULT.permits(TLS_CRYPTO_PRIMITIVES_BC, str, null))
        continue; 
      arrayOfString[b++] = str;
    } 
    return JsseUtils.resize(arrayOfString, b);
  }
  
  private static String[] getDefaultEnabledCipherSuitesClient(Map<String, CipherSuiteInfo> paramMap, List<String> paramList) {
    boolean bool = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.client.dh.disableDefaultSuites", false);
    return getDefaultEnabledCipherSuites(paramMap, paramList, bool, "jdk.tls.client.cipherSuites");
  }
  
  private static String[] getDefaultEnabledCipherSuitesServer(Map<String, CipherSuiteInfo> paramMap, List<String> paramList) {
    boolean bool = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.server.dh.disableDefaultSuites", false);
    return getDefaultEnabledCipherSuites(paramMap, paramList, bool, "jdk.tls.server.cipherSuites");
  }
  
  private static String[] getDefaultEnabledProtocols(Map<String, ProtocolVersion> paramMap, String paramString, List<String> paramList1, List<String> paramList2) {
    List<String> list = paramList2;
    if (null == list)
      list = getJdkTlsProtocols(paramString, paramList1); 
    String[] arrayOfString = new String[list.size()];
    byte b = 0;
    for (String str : list) {
      if (!paramMap.containsKey(str) || !ProvAlgorithmConstraints.DEFAULT_TLS_ONLY.permits(TLS_CRYPTO_PRIMITIVES_BC, str, null))
        continue; 
      arrayOfString[b++] = str;
    } 
    return JsseUtils.resize(arrayOfString, b);
  }
  
  private static String[] getDefaultEnabledProtocolsClient(Map<String, ProtocolVersion> paramMap, List<String> paramList1, List<String> paramList2) {
    return getDefaultEnabledProtocols(paramMap, "jdk.tls.client.protocols", paramList1, paramList2);
  }
  
  private static String[] getDefaultEnabledProtocolsServer(Map<String, ProtocolVersion> paramMap, List<String> paramList) {
    return getDefaultEnabledProtocols(paramMap, "jdk.tls.server.protocols", paramList, null);
  }
  
  private static List<String> getJdkTlsCipherSuites(String paramString, List<String> paramList) {
    String[] arrayOfString = PropertyUtils.getStringArraySystemProperty(paramString);
    if (null == arrayOfString)
      return paramList; 
    ArrayList<String> arrayList = new ArrayList(arrayOfString.length);
    for (String str : arrayOfString) {
      if (!arrayList.contains(str))
        if (!SUPPORTED_CIPHERSUITE_MAP.containsKey(str)) {
          LOG.warning("'" + paramString + "' contains unsupported cipher suite: " + str);
        } else {
          arrayList.add(str);
        }  
    } 
    if (arrayList.isEmpty()) {
      LOG.severe("'" + paramString + "' contained no supported cipher suites (ignoring)");
      return paramList;
    } 
    return arrayList;
  }
  
  private static List<String> getJdkTlsProtocols(String paramString, List<String> paramList) {
    String[] arrayOfString = PropertyUtils.getStringArraySystemProperty(paramString);
    if (null == arrayOfString)
      return paramList; 
    ArrayList<String> arrayList = new ArrayList(arrayOfString.length);
    for (String str : arrayOfString) {
      if (!arrayList.contains(str))
        if (!SUPPORTED_PROTOCOL_MAP.containsKey(str)) {
          LOG.warning("'" + paramString + "' contains unsupported protocol: " + str);
        } else {
          arrayList.add(str);
        }  
    } 
    if (arrayList.isEmpty()) {
      LOG.severe("'" + paramString + "' contained no supported protocols (ignoring)");
      return paramList;
    } 
    return arrayList;
  }
  
  private static String[] getArray(Collection<String> paramCollection) {
    return paramCollection.<String>toArray(new String[paramCollection.size()]);
  }
  
  private static String[] getKeysArray(Map<String, ?> paramMap) {
    return getArray(paramMap.keySet());
  }
  
  static CipherSuiteInfo getCipherSuiteInfo(String paramString) {
    return SUPPORTED_CIPHERSUITE_MAP.get(paramString);
  }
  
  static String getCipherSuiteName(int paramInt) {
    if (0 == paramInt)
      return "SSL_NULL_WITH_NULL_NULL"; 
    if (255 == paramInt)
      return "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"; 
    if (TlsUtils.isValidUint16(paramInt))
      for (CipherSuiteInfo cipherSuiteInfo : SUPPORTED_CIPHERSUITE_MAP.values()) {
        if (cipherSuiteInfo.getCipherSuite() == paramInt)
          return cipherSuiteInfo.getName(); 
      }  
    return null;
  }
  
  static KeyManager[] getDefaultKeyManagers() throws Exception {
    KeyStoreConfig keyStoreConfig = ProvKeyManagerFactorySpi.getDefaultKeyStore();
    KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
    keyManagerFactory.init(keyStoreConfig.keyStore, keyStoreConfig.password);
    return keyManagerFactory.getKeyManagers();
  }
  
  static TrustManager[] getDefaultTrustManagers() throws Exception {
    KeyStore keyStore = ProvTrustManagerFactorySpi.getDefaultTrustStore();
    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
    trustManagerFactory.init(keyStore);
    return trustManagerFactory.getTrustManagers();
  }
  
  static ProtocolVersion getProtocolVersion(String paramString) {
    return SUPPORTED_PROTOCOL_MAP.get(paramString);
  }
  
  static String getProtocolVersionName(ProtocolVersion paramProtocolVersion) {
    if (null != paramProtocolVersion)
      for (Map.Entry<String, ProtocolVersion> entry : SUPPORTED_PROTOCOL_MAP.entrySet()) {
        if (((ProtocolVersion)entry.getValue()).equals(paramProtocolVersion))
          return (String)entry.getKey(); 
      }  
    return "NONE";
  }
  
  ProvSSLContextSpi(boolean paramBoolean, JcaTlsCryptoProvider paramJcaTlsCryptoProvider, List<String> paramList) {
    this.isInFipsMode = paramBoolean;
    this.cryptoProvider = paramJcaTlsCryptoProvider;
    this.supportedCipherSuites = paramBoolean ? SUPPORTED_CIPHERSUITE_MAP_FIPS : SUPPORTED_CIPHERSUITE_MAP;
    this.supportedProtocols = paramBoolean ? SUPPORTED_PROTOCOL_MAP_FIPS : SUPPORTED_PROTOCOL_MAP;
    List<String> list1 = paramBoolean ? DEFAULT_CIPHERSUITE_LIST_FIPS : DEFAULT_CIPHERSUITE_LIST;
    List<String> list2 = paramBoolean ? DEFAULT_PROTOCOL_LIST_FIPS : DEFAULT_PROTOCOL_LIST;
    this.defaultCipherSuitesClient = getDefaultEnabledCipherSuitesClient(this.supportedCipherSuites, list1);
    this.defaultCipherSuitesServer = getDefaultEnabledCipherSuitesServer(this.supportedCipherSuites, list1);
    this.defaultProtocolsClient = getDefaultEnabledProtocolsClient(this.supportedProtocols, list2, paramList);
    this.defaultProtocolsServer = getDefaultEnabledProtocolsServer(this.supportedProtocols, list2);
  }
  
  int[] getActiveCipherSuites(JcaTlsCrypto paramJcaTlsCrypto, ProvSSLParameters paramProvSSLParameters, ProtocolVersion[] paramArrayOfProtocolVersion) {
    String[] arrayOfString = paramProvSSLParameters.getCipherSuitesArray();
    BCAlgorithmConstraints bCAlgorithmConstraints = paramProvSSLParameters.getAlgorithmConstraints();
    ProtocolVersion protocolVersion1 = ProtocolVersion.getLatestTLS(paramArrayOfProtocolVersion);
    ProtocolVersion protocolVersion2 = ProtocolVersion.getEarliestTLS(paramArrayOfProtocolVersion);
    boolean bool = TlsUtils.isTLSv13(protocolVersion1);
    boolean bool1 = !TlsUtils.isTLSv13(protocolVersion2) ? true : false;
    int[] arrayOfInt1 = new int[arrayOfString.length];
    byte b = 0;
    for (String str : arrayOfString) {
      CipherSuiteInfo cipherSuiteInfo = this.supportedCipherSuites.get(str);
      if (null != cipherSuiteInfo && (cipherSuiteInfo.isTLSv13() ? !bool : !bool1) && bCAlgorithmConstraints.permits(TLS_CRYPTO_PRIMITIVES_BC, str, null))
        arrayOfInt1[b++] = cipherSuiteInfo.getCipherSuite(); 
    } 
    int[] arrayOfInt2 = TlsUtils.getSupportedCipherSuites((TlsCrypto)paramJcaTlsCrypto, arrayOfInt1, 0, b);
    if (arrayOfInt2.length < 1)
      throw new IllegalStateException("No usable cipher suites enabled"); 
    return arrayOfInt2;
  }
  
  ProtocolVersion[] getActiveProtocolVersions(ProvSSLParameters paramProvSSLParameters) {
    String[] arrayOfString = paramProvSSLParameters.getProtocolsArray();
    BCAlgorithmConstraints bCAlgorithmConstraints = paramProvSSLParameters.getAlgorithmConstraints();
    TreeSet<ProtocolVersion> treeSet = new TreeSet((Comparator<?>)new Object(this));
    for (String str : arrayOfString) {
      ProtocolVersion protocolVersion = this.supportedProtocols.get(str);
      if (null != protocolVersion && bCAlgorithmConstraints.permits(TLS_CRYPTO_PRIMITIVES_BC, str, null))
        treeSet.add(protocolVersion); 
    } 
    if (treeSet.isEmpty())
      throw new IllegalStateException("No usable protocols enabled"); 
    return (ProtocolVersion[])treeSet.toArray((Object[])new ProtocolVersion[treeSet.size()]);
  }
  
  String[] getDefaultCipherSuites(boolean paramBoolean) {
    return (String[])implGetDefaultCipherSuites(paramBoolean).clone();
  }
  
  String[] getDefaultProtocols(boolean paramBoolean) {
    return (String[])implGetDefaultProtocols(paramBoolean).clone();
  }
  
  ProvSSLParameters getDefaultSSLParameters(boolean paramBoolean) {
    return new ProvSSLParameters(this, implGetDefaultCipherSuites(paramBoolean), implGetDefaultProtocols(paramBoolean));
  }
  
  String[] getSupportedCipherSuites() {
    return getKeysArray(this.supportedCipherSuites);
  }
  
  String[] getSupportedCipherSuites(String[] paramArrayOfString) {
    if (null == paramArrayOfString)
      throw new NullPointerException("'cipherSuites' cannot be null"); 
    ArrayList<String> arrayList = new ArrayList(paramArrayOfString.length);
    for (String str : paramArrayOfString) {
      if (TlsUtils.isNullOrEmpty(str))
        throw new IllegalArgumentException("'cipherSuites' cannot contain null or empty string elements"); 
      if (this.supportedCipherSuites.containsKey(str))
        arrayList.add(str); 
    } 
    return getArray(arrayList);
  }
  
  String[] getSupportedProtocols() {
    return getKeysArray(this.supportedProtocols);
  }
  
  ProvSSLParameters getSupportedSSLParameters(boolean paramBoolean) {
    return new ProvSSLParameters(this, getSupportedCipherSuites(), getSupportedProtocols());
  }
  
  boolean isFips() {
    return this.isInFipsMode;
  }
  
  boolean isSupportedProtocols(String[] paramArrayOfString) {
    if (paramArrayOfString == null)
      return false; 
    for (String str : paramArrayOfString) {
      if (str == null || !this.supportedProtocols.containsKey(str))
        return false; 
    } 
    return true;
  }
  
  void updateDefaultSSLParameters(ProvSSLParameters paramProvSSLParameters, boolean paramBoolean) {
    if (paramProvSSLParameters.getCipherSuitesArray() == implGetDefaultCipherSuites(!paramBoolean))
      paramProvSSLParameters.setCipherSuitesArray(implGetDefaultCipherSuites(paramBoolean)); 
    if (paramProvSSLParameters.getProtocolsArray() == implGetDefaultProtocols(!paramBoolean))
      paramProvSSLParameters.setProtocolsArray(implGetDefaultProtocols(paramBoolean)); 
  }
  
  String validateNegotiatedCipherSuite(ProvSSLParameters paramProvSSLParameters, int paramInt) {
    String str = getCipherSuiteName(paramInt);
    if (null == str || !JsseUtils.contains(paramProvSSLParameters.getCipherSuitesArray(), str) || !paramProvSSLParameters.getAlgorithmConstraints().permits(TLS_CRYPTO_PRIMITIVES_BC, str, null) || !this.supportedCipherSuites.containsKey(str) || (this.isInFipsMode && !FipsUtils.isFipsCipherSuite(str)))
      throw new IllegalStateException("SSL connection negotiated unsupported ciphersuite: " + paramInt); 
    return str;
  }
  
  String validateNegotiatedProtocol(ProvSSLParameters paramProvSSLParameters, ProtocolVersion paramProtocolVersion) {
    String str = getProtocolVersionName(paramProtocolVersion);
    if (null == str || !JsseUtils.contains(paramProvSSLParameters.getProtocolsArray(), str) || !paramProvSSLParameters.getAlgorithmConstraints().permits(TLS_CRYPTO_PRIMITIVES_BC, str, null) || !this.supportedProtocols.containsKey(str) || (this.isInFipsMode && !FipsUtils.isFipsProtocol(str)))
      throw new IllegalStateException("SSL connection negotiated unsupported protocol: " + paramProtocolVersion); 
    return str;
  }
  
  protected synchronized SSLEngine engineCreateSSLEngine() {
    return (SSLEngine)SSLEngineUtil.create(getContextData());
  }
  
  protected synchronized SSLEngine engineCreateSSLEngine(String paramString, int paramInt) {
    return (SSLEngine)SSLEngineUtil.create(getContextData(), paramString, paramInt);
  }
  
  protected synchronized SSLSessionContext engineGetClientSessionContext() {
    return (SSLSessionContext)getContextData().getClientSessionContext();
  }
  
  protected synchronized SSLSessionContext engineGetServerSessionContext() {
    return (SSLSessionContext)getContextData().getServerSessionContext();
  }
  
  protected SSLServerSocketFactory engineGetServerSocketFactory() {
    return (SSLServerSocketFactory)new ProvSSLServerSocketFactory(getContextData());
  }
  
  protected SSLSocketFactory engineGetSocketFactory() {
    return (SSLSocketFactory)new ProvSSLSocketFactory(getContextData());
  }
  
  protected SSLParameters engineGetDefaultSSLParameters() {
    getContextData();
    return SSLParametersUtil.getSSLParameters(getDefaultSSLParameters(true));
  }
  
  protected SSLParameters engineGetSupportedSSLParameters() {
    getContextData();
    return SSLParametersUtil.getSSLParameters(getSupportedSSLParameters(true));
  }
  
  protected synchronized void engineInit(KeyManager[] paramArrayOfKeyManager, TrustManager[] paramArrayOfTrustManager, SecureRandom paramSecureRandom) throws KeyManagementException {
    this.contextData = null;
    JcaTlsCrypto jcaTlsCrypto = this.cryptoProvider.create(paramSecureRandom);
    JcaJceHelper jcaJceHelper = jcaTlsCrypto.getHelper();
    BCX509ExtendedKeyManager bCX509ExtendedKeyManager = selectX509KeyManager(jcaJceHelper, paramArrayOfKeyManager);
    BCX509ExtendedTrustManager bCX509ExtendedTrustManager = selectX509TrustManager(jcaJceHelper, paramArrayOfTrustManager);
    jcaTlsCrypto.getSecureRandom().nextInt();
    this.contextData = new ContextData(this, jcaTlsCrypto, bCX509ExtendedKeyManager, bCX509ExtendedTrustManager);
  }
  
  protected synchronized ContextData getContextData() {
    if (null == this.contextData)
      throw new IllegalStateException("SSLContext has not been initialized."); 
    return this.contextData;
  }
  
  protected BCX509ExtendedKeyManager selectX509KeyManager(JcaJceHelper paramJcaJceHelper, KeyManager[] paramArrayOfKeyManager) throws KeyManagementException {
    if (paramArrayOfKeyManager != null)
      for (KeyManager keyManager : paramArrayOfKeyManager) {
        if (keyManager instanceof X509KeyManager)
          return X509KeyManagerUtil.importX509KeyManager(paramJcaJceHelper, (X509KeyManager)keyManager); 
      }  
    return DummyX509KeyManager.INSTANCE;
  }
  
  protected BCX509ExtendedTrustManager selectX509TrustManager(JcaJceHelper paramJcaJceHelper, TrustManager[] paramArrayOfTrustManager) throws KeyManagementException {
    if (paramArrayOfTrustManager == null)
      try {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore)null);
        paramArrayOfTrustManager = trustManagerFactory.getTrustManagers();
      } catch (Exception exception) {
        LOG.log(Level.WARNING, "Failed to load default trust managers", exception);
      }  
    if (paramArrayOfTrustManager != null)
      for (TrustManager trustManager : paramArrayOfTrustManager) {
        if (trustManager instanceof X509TrustManager)
          return X509TrustManagerUtil.importX509TrustManager(this.isInFipsMode, paramJcaJceHelper, (X509TrustManager)trustManager); 
      }  
    return DummyX509TrustManager.INSTANCE;
  }
  
  private String[] implGetDefaultCipherSuites(boolean paramBoolean) {
    return paramBoolean ? this.defaultCipherSuitesClient : this.defaultCipherSuitesServer;
  }
  
  private String[] implGetDefaultProtocols(boolean paramBoolean) {
    return paramBoolean ? this.defaultProtocolsClient : this.defaultProtocolsServer;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvSSLContextSpi.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */