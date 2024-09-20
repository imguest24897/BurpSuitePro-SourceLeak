package org.bouncycastle.jsse.provider;

import java.lang.ref.SoftReference;
import java.net.Socket;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.KeyPurposeId;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSNIHostName;
import org.bouncycastle.jsse.BCX509ExtendedKeyManager;
import org.bouncycastle.jsse.BCX509Key;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsUtils;

class ProvX509KeyManager extends BCX509ExtendedKeyManager {
  private static final Logger LOG = Logger.getLogger(ProvX509KeyManager.class.getName());
  
  private static final boolean provKeyManagerCheckEKU = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.keyManager.checkEKU", true);
  
  private final AtomicLong versions = new AtomicLong();
  
  private final boolean isInFipsMode;
  
  private final JcaJceHelper helper;
  
  private final List<KeyStore.Builder> builders;
  
  private final Map<String, SoftReference<KeyStore.PrivateKeyEntry>> cachedEntries = Collections.synchronizedMap(new LinkedHashMap<String, SoftReference<KeyStore.PrivateKeyEntry>>(16, 0.75F, true) {
        protected boolean removeEldestEntry(Map.Entry<String, SoftReference<KeyStore.PrivateKeyEntry>> param1Entry) {
          return (size() > 16);
        }
      });
  
  private static final Map<String, PublicKeyFilter> FILTERS_CLIENT = createFiltersClient();
  
  private static final Map<String, PublicKeyFilter> FILTERS_SERVER = createFiltersServer();
  
  private static void addECFilter13(Map<String, PublicKeyFilter> paramMap, int paramInt) {
    if (!NamedGroup.canBeNegotiated(paramInt, ProtocolVersion.TLSv13))
      throw new IllegalStateException("Invalid named group for TLS 1.3 EC filter"); 
    String str = NamedGroup.getCurveName(paramInt);
    if (null != str) {
      ASN1ObjectIdentifier aSN1ObjectIdentifier = ECNamedCurveTable.getOID(str);
      if (null != aSN1ObjectIdentifier) {
        String str1 = JsseUtils.getKeyType13("EC", paramInt);
        ECPublicKeyFilter13 eCPublicKeyFilter13 = new ECPublicKeyFilter13(aSN1ObjectIdentifier);
        addFilterToMap(paramMap, str1, eCPublicKeyFilter13);
        return;
      } 
    } 
    LOG.warning("Failed to register public key filter for EC with " + NamedGroup.getText(paramInt));
  }
  
  private static void addFilter(Map<String, PublicKeyFilter> paramMap, String paramString) {
    String str = paramString;
    addFilter(paramMap, 0, str, null, new String[] { paramString });
  }
  
  private static void addFilter(Map<String, PublicKeyFilter> paramMap, Class<? extends PublicKey> paramClass, String... paramVarArgs) {
    addFilter(paramMap, 0, null, paramClass, paramVarArgs);
  }
  
  private static void addFilter(Map<String, PublicKeyFilter> paramMap, int paramInt, String paramString, Class<? extends PublicKey> paramClass, String... paramVarArgs) {
    DefaultPublicKeyFilter defaultPublicKeyFilter = new DefaultPublicKeyFilter(paramString, paramClass, paramInt);
    for (String str : paramVarArgs)
      addFilterToMap(paramMap, str, defaultPublicKeyFilter); 
  }
  
  private static void addFilterLegacyServer(Map<String, PublicKeyFilter> paramMap, String paramString, int... paramVarArgs) {
    addFilterLegacyServer(paramMap, 0, paramString, paramVarArgs);
  }
  
  private static void addFilterLegacyServer(Map<String, PublicKeyFilter> paramMap, int paramInt, String paramString, int... paramVarArgs) {
    addFilterLegacyServer(paramMap, paramInt, paramString, null, paramVarArgs);
  }
  
  private static void addFilterLegacyServer(Map<String, PublicKeyFilter> paramMap, Class<? extends PublicKey> paramClass, int... paramVarArgs) {
    addFilterLegacyServer(paramMap, 0, null, paramClass, paramVarArgs);
  }
  
  private static void addFilterLegacyServer(Map<String, PublicKeyFilter> paramMap, int paramInt, String paramString, Class<? extends PublicKey> paramClass, int... paramVarArgs) {
    addFilter(paramMap, paramInt, paramString, paramClass, getKeyTypesLegacyServer(paramVarArgs));
  }
  
  private static void addFilterToMap(Map<String, PublicKeyFilter> paramMap, String paramString, PublicKeyFilter paramPublicKeyFilter) {
    if (null != paramMap.put(paramString, paramPublicKeyFilter))
      throw new IllegalStateException("Duplicate keys in filters"); 
  }
  
  private static Map<String, PublicKeyFilter> createFiltersClient() {
    HashMap<Object, Object> hashMap = new HashMap<>();
    addFilter((Map)hashMap, "Ed25519");
    addFilter((Map)hashMap, "Ed448");
    addECFilter13((Map)hashMap, 31);
    addECFilter13((Map)hashMap, 32);
    addECFilter13((Map)hashMap, 33);
    addECFilter13((Map)hashMap, 23);
    addECFilter13((Map)hashMap, 24);
    addECFilter13((Map)hashMap, 25);
    addFilter((Map)hashMap, "RSA");
    addFilter((Map)hashMap, "RSASSA-PSS");
    addFilter((Map)hashMap, (Class)DSAPublicKey.class, new String[] { "DSA" });
    addFilter((Map)hashMap, (Class)ECPublicKey.class, new String[] { "EC" });
    return (Map)Collections.unmodifiableMap(hashMap);
  }
  
  private static Map<String, PublicKeyFilter> createFiltersServer() {
    HashMap<Object, Object> hashMap = new HashMap<>();
    addFilter((Map)hashMap, "Ed25519");
    addFilter((Map)hashMap, "Ed448");
    addECFilter13((Map)hashMap, 31);
    addECFilter13((Map)hashMap, 32);
    addECFilter13((Map)hashMap, 33);
    addECFilter13((Map)hashMap, 23);
    addECFilter13((Map)hashMap, 24);
    addECFilter13((Map)hashMap, 25);
    addFilter((Map)hashMap, "RSA");
    addFilter((Map)hashMap, "RSASSA-PSS");
    addFilterLegacyServer((Map)hashMap, (Class)DSAPublicKey.class, new int[] { 3, 22 });
    addFilterLegacyServer((Map)hashMap, (Class)ECPublicKey.class, new int[] { 17 });
    addFilterLegacyServer((Map)hashMap, "RSA", new int[] { 5, 19, 23 });
    addFilterLegacyServer((Map)hashMap, 2, "RSA", new int[] { 1 });
    return (Map)Collections.unmodifiableMap(hashMap);
  }
  
  private static String[] getKeyTypesLegacyServer(int... paramVarArgs) {
    int i = paramVarArgs.length;
    String[] arrayOfString = new String[i];
    for (byte b = 0; b < i; b++)
      arrayOfString[b] = JsseUtils.getKeyTypeLegacyServer(paramVarArgs[b]); 
    return arrayOfString;
  }
  
  ProvX509KeyManager(boolean paramBoolean, JcaJceHelper paramJcaJceHelper, List<KeyStore.Builder> paramList) {
    this.isInFipsMode = paramBoolean;
    this.helper = paramJcaJceHelper;
    this.builders = paramList;
  }
  
  public String chooseClientAlias(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return chooseAlias(getKeyTypes(paramArrayOfString), paramArrayOfPrincipal, TransportData.from(paramSocket), false);
  }
  
  public BCX509Key chooseClientKeyBC(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return chooseKeyBC(getKeyTypes(paramArrayOfString), paramArrayOfPrincipal, TransportData.from(paramSocket), false);
  }
  
  public String chooseEngineClientAlias(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, SSLEngine paramSSLEngine) {
    return chooseAlias(getKeyTypes(paramArrayOfString), paramArrayOfPrincipal, TransportData.from(paramSSLEngine), false);
  }
  
  public BCX509Key chooseEngineClientKeyBC(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, SSLEngine paramSSLEngine) {
    return chooseKeyBC(getKeyTypes(paramArrayOfString), paramArrayOfPrincipal, TransportData.from(paramSSLEngine), false);
  }
  
  public String chooseEngineServerAlias(String paramString, Principal[] paramArrayOfPrincipal, SSLEngine paramSSLEngine) {
    return chooseAlias(getKeyTypes(new String[] { paramString }, ), paramArrayOfPrincipal, TransportData.from(paramSSLEngine), true);
  }
  
  public BCX509Key chooseEngineServerKeyBC(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, SSLEngine paramSSLEngine) {
    return chooseKeyBC(getKeyTypes(paramArrayOfString), paramArrayOfPrincipal, TransportData.from(paramSSLEngine), true);
  }
  
  public String chooseServerAlias(String paramString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return chooseAlias(getKeyTypes(new String[] { paramString }, ), paramArrayOfPrincipal, TransportData.from(paramSocket), true);
  }
  
  public BCX509Key chooseServerKeyBC(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return chooseKeyBC(getKeyTypes(paramArrayOfString), paramArrayOfPrincipal, TransportData.from(paramSocket), true);
  }
  
  public X509Certificate[] getCertificateChain(String paramString) {
    KeyStore.PrivateKeyEntry privateKeyEntry = getPrivateKeyEntry(paramString);
    return (null == privateKeyEntry) ? null : (X509Certificate[])privateKeyEntry.getCertificateChain();
  }
  
  public String[] getClientAliases(String paramString, Principal[] paramArrayOfPrincipal) {
    return getAliases(getKeyTypes(new String[] { paramString }, ), paramArrayOfPrincipal, null, false);
  }
  
  public PrivateKey getPrivateKey(String paramString) {
    KeyStore.PrivateKeyEntry privateKeyEntry = getPrivateKeyEntry(paramString);
    return (null == privateKeyEntry) ? null : privateKeyEntry.getPrivateKey();
  }
  
  public String[] getServerAliases(String paramString, Principal[] paramArrayOfPrincipal) {
    return getAliases(getKeyTypes(new String[] { paramString }, ), paramArrayOfPrincipal, null, true);
  }
  
  protected BCX509Key getKeyBC(String paramString1, String paramString2) {
    KeyStore.PrivateKeyEntry privateKeyEntry = getPrivateKeyEntry(paramString2);
    if (null == privateKeyEntry)
      return null; 
    PrivateKey privateKey = privateKeyEntry.getPrivateKey();
    if (null == privateKey)
      return null; 
    X509Certificate[] arrayOfX509Certificate = JsseUtils.getX509CertificateChain(privateKeyEntry.getCertificateChain());
    return TlsUtils.isNullOrEmpty((Object[])arrayOfX509Certificate) ? null : new ProvX509Key(paramString1, privateKey, arrayOfX509Certificate);
  }
  
  private String chooseAlias(List<String> paramList, Principal[] paramArrayOfPrincipal, TransportData paramTransportData, boolean paramBoolean) {
    Match match = getBestMatch(paramList, paramArrayOfPrincipal, paramTransportData, paramBoolean);
    if (match.compareTo(Match.NOTHING) < 0) {
      String str1 = paramList.get(match.keyTypeIndex);
      String str2 = getAlias(match, getNextVersionSuffix());
      if (LOG.isLoggable(Level.FINE))
        LOG.fine("Found matching key of type: " + str1 + ", returning alias: " + str2); 
      return str2;
    } 
    LOG.fine("No matching key found");
    return null;
  }
  
  private BCX509Key chooseKeyBC(List<String> paramList, Principal[] paramArrayOfPrincipal, TransportData paramTransportData, boolean paramBoolean) {
    Match match = getBestMatch(paramList, paramArrayOfPrincipal, paramTransportData, paramBoolean);
    if (match.compareTo(Match.NOTHING) < 0)
      try {
        String str = paramList.get(match.keyTypeIndex);
        BCX509Key bCX509Key = createKeyBC(str, match.builderIndex, match.localAlias, match.cachedKeyStore, match.cachedCertificateChain);
        if (null != bCX509Key) {
          if (LOG.isLoggable(Level.FINE))
            LOG.fine("Found matching key of type: " + str + ", from alias: " + match.builderIndex + "." + match.localAlias); 
          return bCX509Key;
        } 
      } catch (Exception exception) {
        LOG.log(Level.FINER, "Failed to load private key", exception);
      }  
    LOG.fine("No matching key found");
    return null;
  }
  
  private BCX509Key createKeyBC(String paramString1, int paramInt, String paramString2, KeyStore paramKeyStore, X509Certificate[] paramArrayOfX509Certificate) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
    KeyStore.Builder builder = this.builders.get(paramInt);
    KeyStore.ProtectionParameter protectionParameter = builder.getProtectionParameter(paramString2);
    Key key = KeyStoreUtil.getKey(paramKeyStore, paramString2, protectionParameter);
    return (key instanceof PrivateKey) ? new ProvX509Key(paramString1, (PrivateKey)key, paramArrayOfX509Certificate) : null;
  }
  
  private String[] getAliases(List<String> paramList, Principal[] paramArrayOfPrincipal, TransportData paramTransportData, boolean paramBoolean) {
    if (!this.builders.isEmpty() && !paramList.isEmpty()) {
      int i = paramList.size();
      Set<Principal> set = getUniquePrincipals(paramArrayOfPrincipal);
      BCAlgorithmConstraints bCAlgorithmConstraints = TransportData.getAlgorithmConstraints(paramTransportData, true);
      Date date = new Date();
      String str = getRequestedHostName(paramTransportData, paramBoolean);
      List<Match> list = null;
      byte b = 0;
      int j = this.builders.size();
      while (b < j) {
        try {
          KeyStore.Builder builder = this.builders.get(b);
          KeyStore keyStore = builder.getKeyStore();
          if (null != keyStore) {
            Enumeration<String> enumeration = keyStore.aliases();
            while (enumeration.hasMoreElements()) {
              String str1 = enumeration.nextElement();
              Match match = getPotentialMatch(b, builder, keyStore, str1, paramList, i, set, bCAlgorithmConstraints, paramBoolean, date, str);
              if (match.compareTo(Match.NOTHING) < 0)
                list = addToMatches(list, match); 
            } 
          } 
        } catch (KeyStoreException keyStoreException) {
          LOG.log(Level.WARNING, "Failed to fully process KeyStore.Builder at index " + b, keyStoreException);
        } 
        b++;
      } 
      if (null != list && !list.isEmpty()) {
        Collections.sort(list);
        return getAliases(list, getNextVersionSuffix());
      } 
    } 
    return null;
  }
  
  private Match getBestMatch(List<String> paramList, Principal[] paramArrayOfPrincipal, TransportData paramTransportData, boolean paramBoolean) {
    Match match = Match.NOTHING;
    if (!this.builders.isEmpty() && !paramList.isEmpty()) {
      int i = paramList.size();
      Set<Principal> set = getUniquePrincipals(paramArrayOfPrincipal);
      BCAlgorithmConstraints bCAlgorithmConstraints = TransportData.getAlgorithmConstraints(paramTransportData, true);
      Date date = new Date();
      String str = getRequestedHostName(paramTransportData, paramBoolean);
      byte b = 0;
      int j = this.builders.size();
      while (b < j) {
        try {
          KeyStore.Builder builder = this.builders.get(b);
          KeyStore keyStore = builder.getKeyStore();
          if (null != keyStore) {
            Enumeration<String> enumeration = keyStore.aliases();
            while (enumeration.hasMoreElements()) {
              String str1 = enumeration.nextElement();
              Match match1 = getPotentialMatch(b, builder, keyStore, str1, paramList, i, set, bCAlgorithmConstraints, paramBoolean, date, str);
              if (match1.compareTo(match) < 0) {
                match = match1;
                if (match.isIdeal())
                  return match; 
                if (match.isValid())
                  i = Math.min(i, match.keyTypeIndex + 1); 
              } 
            } 
          } 
        } catch (KeyStoreException keyStoreException) {
          LOG.log(Level.WARNING, "Failed to fully process KeyStore.Builder at index " + b, keyStoreException);
        } 
        b++;
      } 
    } 
    return match;
  }
  
  private String getNextVersionSuffix() {
    return "." + this.versions.incrementAndGet();
  }
  
  private Match getPotentialMatch(int paramInt1, KeyStore.Builder paramBuilder, KeyStore paramKeyStore, String paramString1, List<String> paramList, int paramInt2, Set<Principal> paramSet, BCAlgorithmConstraints paramBCAlgorithmConstraints, boolean paramBoolean, Date paramDate, String paramString2) throws KeyStoreException {
    if (paramKeyStore.isKeyEntry(paramString1)) {
      X509Certificate[] arrayOfX509Certificate = JsseUtils.getX509CertificateChain(paramKeyStore.getCertificateChain(paramString1));
      int i = getPotentialKeyType(paramList, paramInt2, paramSet, paramBCAlgorithmConstraints, paramBoolean, arrayOfX509Certificate);
      if (i >= 0) {
        MatchQuality matchQuality = getKeyTypeQuality(this.isInFipsMode, this.helper, paramList, paramBCAlgorithmConstraints, paramBoolean, paramDate, paramString2, arrayOfX509Certificate, i);
        if (MatchQuality.NONE != matchQuality)
          return new Match(matchQuality, i, paramInt1, paramString1, paramKeyStore, arrayOfX509Certificate); 
      } 
    } 
    return Match.NOTHING;
  }
  
  private KeyStore.PrivateKeyEntry getPrivateKeyEntry(String paramString) {
    if (null == paramString)
      return null; 
    SoftReference<KeyStore.PrivateKeyEntry> softReference = this.cachedEntries.get(paramString);
    if (null != softReference) {
      KeyStore.PrivateKeyEntry privateKeyEntry1 = softReference.get();
      if (null != privateKeyEntry1)
        return privateKeyEntry1; 
    } 
    KeyStore.PrivateKeyEntry privateKeyEntry = loadPrivateKeyEntry(paramString);
    if (null != privateKeyEntry)
      this.cachedEntries.put(paramString, new SoftReference<>(privateKeyEntry)); 
    return privateKeyEntry;
  }
  
  private KeyStore.PrivateKeyEntry loadPrivateKeyEntry(String paramString) {
    try {
      byte b = 0;
      int i = paramString.indexOf('.', b);
      if (i > b) {
        int j = i + 1;
        int k = paramString.lastIndexOf('.');
        if (k > j) {
          int m = Integer.parseInt(paramString.substring(b, i));
          if (0 <= m && m < this.builders.size()) {
            KeyStore.Builder builder = this.builders.get(m);
            String str = paramString.substring(j, k);
            KeyStore keyStore = builder.getKeyStore();
            if (null != keyStore) {
              KeyStore.ProtectionParameter protectionParameter = builder.getProtectionParameter(str);
              KeyStore.Entry entry = keyStore.getEntry(str, protectionParameter);
              if (entry instanceof KeyStore.PrivateKeyEntry)
                return (KeyStore.PrivateKeyEntry)entry; 
            } 
          } 
        } 
      } 
    } catch (Exception exception) {
      LOG.log(Level.FINER, "Failed to load PrivateKeyEntry: " + paramString, exception);
    } 
    return null;
  }
  
  static MatchQuality getKeyTypeQuality(boolean paramBoolean1, JcaJceHelper paramJcaJceHelper, List<String> paramList, BCAlgorithmConstraints paramBCAlgorithmConstraints, boolean paramBoolean2, Date paramDate, String paramString, X509Certificate[] paramArrayOfX509Certificate, int paramInt) {
    String str = paramList.get(paramInt);
    LOG.finer("EE cert potentially usable for key type: " + str);
    if (!isSuitableChain(paramBoolean1, paramJcaJceHelper, paramArrayOfX509Certificate, paramBCAlgorithmConstraints, paramBoolean2)) {
      LOG.finer("Unsuitable chain for key type: " + str);
      return MatchQuality.NONE;
    } 
    return getCertificateQuality(paramArrayOfX509Certificate[0], paramDate, paramString);
  }
  
  static List<String> getKeyTypes(String... paramVarArgs) {
    if (null != paramVarArgs && paramVarArgs.length > 0) {
      ArrayList<String> arrayList = new ArrayList(paramVarArgs.length);
      for (String str : paramVarArgs) {
        if (null == str)
          throw new IllegalArgumentException("Key types cannot be null"); 
        if (!arrayList.contains(str))
          arrayList.add(str); 
      } 
      return Collections.unmodifiableList(arrayList);
    } 
    return Collections.emptyList();
  }
  
  static int getPotentialKeyType(List<String> paramList, int paramInt, Set<Principal> paramSet, BCAlgorithmConstraints paramBCAlgorithmConstraints, boolean paramBoolean, X509Certificate[] paramArrayOfX509Certificate) {
    return !isSuitableChainForIssuers(paramArrayOfX509Certificate, paramSet) ? -1 : getSuitableKeyTypeForEECert(paramArrayOfX509Certificate[0], paramList, paramInt, paramBCAlgorithmConstraints, paramBoolean);
  }
  
  static String getRequestedHostName(TransportData paramTransportData, boolean paramBoolean) {
    if (null != paramTransportData && paramBoolean) {
      BCExtendedSSLSession bCExtendedSSLSession = paramTransportData.getHandshakeSession();
      if (null != bCExtendedSSLSession) {
        BCSNIHostName bCSNIHostName = JsseUtils.getSNIHostName(bCExtendedSSLSession.getRequestedServerNames());
        if (null != bCSNIHostName)
          return bCSNIHostName.getAsciiName(); 
      } 
    } 
    return null;
  }
  
  static Set<Principal> getUniquePrincipals(Principal[] paramArrayOfPrincipal) {
    if (null == paramArrayOfPrincipal)
      return null; 
    if (paramArrayOfPrincipal.length > 0) {
      HashSet<Principal> hashSet = new HashSet();
      for (byte b = 0; b < paramArrayOfPrincipal.length; b++) {
        Principal principal = paramArrayOfPrincipal[b];
        if (null != principal)
          hashSet.add(principal); 
      } 
      if (!hashSet.isEmpty())
        return Collections.unmodifiableSet(hashSet); 
    } 
    return Collections.emptySet();
  }
  
  static boolean isSuitableKeyType(boolean paramBoolean, String paramString, X509Certificate paramX509Certificate, TransportData paramTransportData) {
    Map<String, PublicKeyFilter> map = paramBoolean ? FILTERS_SERVER : FILTERS_CLIENT;
    PublicKeyFilter publicKeyFilter = map.get(paramString);
    if (null == publicKeyFilter)
      return false; 
    PublicKey publicKey = paramX509Certificate.getPublicKey();
    boolean[] arrayOfBoolean = paramX509Certificate.getKeyUsage();
    BCAlgorithmConstraints bCAlgorithmConstraints = TransportData.getAlgorithmConstraints(paramTransportData, true);
    return publicKeyFilter.accepts(publicKey, arrayOfBoolean, bCAlgorithmConstraints);
  }
  
  private static List<Match> addToMatches(List<Match> paramList, Match paramMatch) {
    if (null == paramList)
      paramList = new ArrayList<>(); 
    paramList.add(paramMatch);
    return paramList;
  }
  
  private static String getAlias(Match paramMatch, String paramString) {
    return paramMatch.builderIndex + "." + paramMatch.localAlias + paramString;
  }
  
  private static String[] getAliases(List<Match> paramList, String paramString) {
    int i = paramList.size();
    byte b = 0;
    String[] arrayOfString = new String[i];
    for (Match match : paramList)
      arrayOfString[b++] = getAlias(match, paramString); 
    return arrayOfString;
  }
  
  private static MatchQuality getCertificateQuality(X509Certificate paramX509Certificate, Date paramDate, String paramString) {
    try {
      paramX509Certificate.checkValidity(paramDate);
    } catch (CertificateException certificateException) {
      return MatchQuality.EXPIRED;
    } 
    if (null != paramString)
      try {
        ProvX509TrustManager.checkEndpointID(paramString, paramX509Certificate, "HTTPS");
      } catch (CertificateException certificateException) {
        return MatchQuality.MISMATCH_SNI;
      }  
    if ("RSA".equalsIgnoreCase(JsseUtils.getPublicKeyAlgorithm(paramX509Certificate.getPublicKey()))) {
      boolean[] arrayOfBoolean = paramX509Certificate.getKeyUsage();
      if (ProvAlgorithmChecker.supportsKeyUsage(arrayOfBoolean, 0) && ProvAlgorithmChecker.supportsKeyUsage(arrayOfBoolean, 2))
        return MatchQuality.RSA_MULTI_USE; 
    } 
    return MatchQuality.OK;
  }
  
  private static KeyPurposeId getRequiredExtendedKeyUsage(boolean paramBoolean) {
    return !provKeyManagerCheckEKU ? null : (paramBoolean ? KeyPurposeId.id_kp_serverAuth : KeyPurposeId.id_kp_clientAuth);
  }
  
  private static int getSuitableKeyTypeForEECert(X509Certificate paramX509Certificate, List<String> paramList, int paramInt, BCAlgorithmConstraints paramBCAlgorithmConstraints, boolean paramBoolean) {
    Map<String, PublicKeyFilter> map = paramBoolean ? FILTERS_SERVER : FILTERS_CLIENT;
    PublicKey publicKey = paramX509Certificate.getPublicKey();
    boolean[] arrayOfBoolean = paramX509Certificate.getKeyUsage();
    for (byte b = 0; b < paramInt; b++) {
      String str = paramList.get(b);
      PublicKeyFilter publicKeyFilter = map.get(str);
      if (null != publicKeyFilter && publicKeyFilter.accepts(publicKey, arrayOfBoolean, paramBCAlgorithmConstraints))
        return b; 
    } 
    return -1;
  }
  
  private static boolean isSuitableChain(boolean paramBoolean1, JcaJceHelper paramJcaJceHelper, X509Certificate[] paramArrayOfX509Certificate, BCAlgorithmConstraints paramBCAlgorithmConstraints, boolean paramBoolean2) {
    try {
      Set<?> set = Collections.emptySet();
      KeyPurposeId keyPurposeId = getRequiredExtendedKeyUsage(paramBoolean2);
      byte b = -1;
      ProvAlgorithmChecker.checkChain(paramBoolean1, paramJcaJceHelper, paramBCAlgorithmConstraints, (Set)set, paramArrayOfX509Certificate, keyPurposeId, b);
      return true;
    } catch (CertPathValidatorException certPathValidatorException) {
      LOG.log(Level.FINEST, "Certificate chain check failed", certPathValidatorException);
      return false;
    } 
  }
  
  private static boolean isSuitableChainForIssuers(X509Certificate[] paramArrayOfX509Certificate, Set<Principal> paramSet) {
    if (TlsUtils.isNullOrEmpty((Object[])paramArrayOfX509Certificate))
      return false; 
    if (null == paramSet || paramSet.isEmpty())
      return true; 
    int i = paramArrayOfX509Certificate.length;
    while (--i >= 0) {
      if (paramSet.contains(paramArrayOfX509Certificate[i].getIssuerX500Principal()))
        return true; 
    } 
    X509Certificate x509Certificate = paramArrayOfX509Certificate[0];
    return (x509Certificate.getBasicConstraints() >= 0 && paramSet.contains(x509Certificate.getSubjectX500Principal()));
  }
  
  private static final class DefaultPublicKeyFilter implements PublicKeyFilter {
    final String algorithm;
    
    final Class<? extends PublicKey> clazz;
    
    final int keyUsageBit;
    
    DefaultPublicKeyFilter(String param1String, Class<? extends PublicKey> param1Class, int param1Int) {
      this.algorithm = param1String;
      this.clazz = param1Class;
      this.keyUsageBit = param1Int;
    }
    
    public boolean accepts(PublicKey param1PublicKey, boolean[] param1ArrayOfboolean, BCAlgorithmConstraints param1BCAlgorithmConstraints) {
      return (appliesTo(param1PublicKey) && ProvAlgorithmChecker.permitsKeyUsage(param1PublicKey, param1ArrayOfboolean, this.keyUsageBit, param1BCAlgorithmConstraints));
    }
    
    private boolean appliesTo(PublicKey param1PublicKey) {
      return ((null != this.algorithm && this.algorithm.equalsIgnoreCase(JsseUtils.getPublicKeyAlgorithm(param1PublicKey))) || (null != this.clazz && this.clazz.isInstance(param1PublicKey)));
    }
  }
  
  private static final class ECPublicKeyFilter13 implements PublicKeyFilter {
    final ASN1ObjectIdentifier standardOID;
    
    ECPublicKeyFilter13(ASN1ObjectIdentifier param1ASN1ObjectIdentifier) {
      this.standardOID = param1ASN1ObjectIdentifier;
    }
    
    public boolean accepts(PublicKey param1PublicKey, boolean[] param1ArrayOfboolean, BCAlgorithmConstraints param1BCAlgorithmConstraints) {
      return (appliesTo(param1PublicKey) && ProvAlgorithmChecker.permitsKeyUsage(param1PublicKey, param1ArrayOfboolean, 0, param1BCAlgorithmConstraints));
    }
    
    private boolean appliesTo(PublicKey param1PublicKey) {
      if ("EC".equalsIgnoreCase(JsseUtils.getPublicKeyAlgorithm(param1PublicKey)) || ECPublicKey.class.isInstance(param1PublicKey)) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = JsseUtils.getNamedCurveOID(param1PublicKey);
        if (this.standardOID.equals((ASN1Primitive)aSN1ObjectIdentifier))
          return true; 
      } 
      return false;
    }
  }
  
  private static final class Match implements Comparable<Match> {
    static final ProvX509KeyManager.MatchQuality INVALID = ProvX509KeyManager.MatchQuality.MISMATCH_SNI;
    
    static final Match NOTHING = new Match(ProvX509KeyManager.MatchQuality.NONE, 2147483647, -1, null, null, null);
    
    final ProvX509KeyManager.MatchQuality quality;
    
    final int keyTypeIndex;
    
    final int builderIndex;
    
    final String localAlias;
    
    final KeyStore cachedKeyStore;
    
    final X509Certificate[] cachedCertificateChain;
    
    Match(ProvX509KeyManager.MatchQuality param1MatchQuality, int param1Int1, int param1Int2, String param1String, KeyStore param1KeyStore, X509Certificate[] param1ArrayOfX509Certificate) {
      this.quality = param1MatchQuality;
      this.keyTypeIndex = param1Int1;
      this.builderIndex = param1Int2;
      this.localAlias = param1String;
      this.cachedKeyStore = param1KeyStore;
      this.cachedCertificateChain = param1ArrayOfX509Certificate;
    }
    
    public int compareTo(Match param1Match) {
      boolean bool1 = isValid();
      boolean bool2 = param1Match.isValid();
      return (bool1 != bool2) ? (bool1 ? -1 : 1) : ((this.keyTypeIndex != param1Match.keyTypeIndex) ? ((this.keyTypeIndex < param1Match.keyTypeIndex) ? -1 : 1) : this.quality.compareTo(param1Match.quality));
    }
    
    boolean isIdeal() {
      return (ProvX509KeyManager.MatchQuality.OK == this.quality && 0 == this.keyTypeIndex);
    }
    
    boolean isValid() {
      return (this.quality.compareTo(INVALID) < 0);
    }
  }
  
  enum MatchQuality {
    OK, RSA_MULTI_USE, MISMATCH_SNI, EXPIRED, NONE;
  }
  
  static interface PublicKeyFilter {
    boolean accepts(PublicKey param1PublicKey, boolean[] param1ArrayOfboolean, BCAlgorithmConstraints param1BCAlgorithmConstraints);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvX509KeyManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */