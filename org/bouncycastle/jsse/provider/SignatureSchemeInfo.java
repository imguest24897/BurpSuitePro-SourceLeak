package org.bouncycastle.jsse.provider;

import java.security.AlgorithmParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.java.security.BCCryptoPrimitive;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;

class SignatureSchemeInfo {
  private static final Logger LOG = Logger.getLogger(SignatureSchemeInfo.class.getName());
  
  static final int historical_dsa_sha1 = 514;
  
  static final int historical_dsa_sha224 = 770;
  
  static final int historical_dsa_sha256 = 1026;
  
  static final int historical_ecdsa_sha224 = 771;
  
  static final int historical_rsa_md5 = 257;
  
  static final int historical_rsa_sha224 = 769;
  
  private static final String PROPERTY_CLIENT_SIGNATURE_SCHEMES = "jdk.tls.client.SignatureSchemes";
  
  private static final String PROPERTY_SERVER_SIGNATURE_SCHEMES = "jdk.tls.server.SignatureSchemes";
  
  private static final int[] CANDIDATES_DEFAULT = createCandidatesDefault();
  
  private final All all;
  
  private final AlgorithmParameters algorithmParameters;
  
  private final NamedGroupInfo namedGroupInfo;
  
  private final boolean enabled;
  
  private final boolean disabled13;
  
  static PerConnection createPerConnectionClient(PerContext paramPerContext, ProvSSLParameters paramProvSSLParameters, ProtocolVersion[] paramArrayOfProtocolVersion, NamedGroupInfo.PerConnection paramPerConnection) {
    ProtocolVersion protocolVersion1 = ProtocolVersion.getLatestTLS(paramArrayOfProtocolVersion);
    if (!TlsUtils.isSignatureAlgorithmsExtensionAllowed(protocolVersion1))
      return new PerConnection(null); 
    ProtocolVersion protocolVersion2 = ProtocolVersion.getEarliestTLS(paramArrayOfProtocolVersion);
    return createPerConnection(paramPerContext, false, paramProvSSLParameters, protocolVersion2, protocolVersion1, paramPerConnection);
  }
  
  static PerConnection createPerConnectionServer(PerContext paramPerContext, ProvSSLParameters paramProvSSLParameters, ProtocolVersion paramProtocolVersion, NamedGroupInfo.PerConnection paramPerConnection) {
    return !TlsUtils.isSignatureAlgorithmsExtensionAllowed(paramProtocolVersion) ? new PerConnection(null) : createPerConnection(paramPerContext, true, paramProvSSLParameters, paramProtocolVersion, paramProtocolVersion, paramPerConnection);
  }
  
  private static PerConnection createPerConnection(PerContext paramPerContext, boolean paramBoolean, ProvSSLParameters paramProvSSLParameters, ProtocolVersion paramProtocolVersion1, ProtocolVersion paramProtocolVersion2, NamedGroupInfo.PerConnection paramPerConnection) {
    int[] arrayOfInt;
    String[] arrayOfString = paramProvSSLParameters.getSignatureSchemes();
    if (arrayOfString == null) {
      arrayOfInt = paramBoolean ? paramPerContext.candidatesServer : paramPerContext.candidatesClient;
    } else {
      arrayOfInt = createCandidates(paramPerContext.index, arrayOfString, "SSLParameters.signatureSchemes");
    } 
    BCAlgorithmConstraints bCAlgorithmConstraints = paramProvSSLParameters.getAlgorithmConstraints();
    boolean bool = TlsUtils.isTLSv13(paramProtocolVersion2);
    boolean bool1 = !TlsUtils.isTLSv13(paramProtocolVersion1) ? true : false;
    int i = arrayOfInt.length;
    ArrayList<SignatureSchemeInfo> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Integer integer = Integers.valueOf(arrayOfInt[b]);
      SignatureSchemeInfo signatureSchemeInfo = (SignatureSchemeInfo)paramPerContext.index.get(integer);
      if (null != signatureSchemeInfo && signatureSchemeInfo.isActiveCerts(bCAlgorithmConstraints, bool, bool1, paramPerConnection))
        arrayList.add(signatureSchemeInfo); 
    } 
    arrayList.trimToSize();
    return new PerConnection(arrayList);
  }
  
  static PerContext createPerContext(boolean paramBoolean, JcaTlsCrypto paramJcaTlsCrypto, NamedGroupInfo.PerContext paramPerContext) {
    Map<Integer, SignatureSchemeInfo> map = createIndex(paramBoolean, paramJcaTlsCrypto, paramPerContext);
    int[] arrayOfInt1 = createCandidatesFromProperty(map, "jdk.tls.client.SignatureSchemes");
    int[] arrayOfInt2 = createCandidatesFromProperty(map, "jdk.tls.server.SignatureSchemes");
    return new PerContext(map, arrayOfInt1, arrayOfInt2);
  }
  
  static String[] getJcaSignatureAlgorithms(Collection<SignatureSchemeInfo> paramCollection) {
    if (null == paramCollection)
      return TlsUtils.EMPTY_STRINGS; 
    ArrayList<String> arrayList = new ArrayList();
    for (SignatureSchemeInfo signatureSchemeInfo : paramCollection)
      arrayList.add(signatureSchemeInfo.getJcaSignatureAlgorithm()); 
    return arrayList.<String>toArray(TlsUtils.EMPTY_STRINGS);
  }
  
  static String[] getJcaSignatureAlgorithmsBC(Collection<SignatureSchemeInfo> paramCollection) {
    if (null == paramCollection)
      return TlsUtils.EMPTY_STRINGS; 
    ArrayList<String> arrayList = new ArrayList();
    for (SignatureSchemeInfo signatureSchemeInfo : paramCollection)
      arrayList.add(signatureSchemeInfo.getJcaSignatureAlgorithmBC()); 
    return arrayList.<String>toArray(TlsUtils.EMPTY_STRINGS);
  }
  
  static SignatureAndHashAlgorithm getSignatureAndHashAlgorithm(int paramInt) {
    if (!TlsUtils.isValidUint16(paramInt))
      throw new IllegalArgumentException(); 
    return SignatureScheme.getSignatureAndHashAlgorithm(paramInt);
  }
  
  static Vector<SignatureAndHashAlgorithm> getSignatureAndHashAlgorithms(List<SignatureSchemeInfo> paramList) {
    if (null == paramList || paramList.isEmpty())
      return null; 
    int i = paramList.size();
    Vector<SignatureAndHashAlgorithm> vector = new Vector(i);
    for (SignatureSchemeInfo signatureSchemeInfo : paramList) {
      if (null != signatureSchemeInfo) {
        SignatureAndHashAlgorithm signatureAndHashAlgorithm = signatureSchemeInfo.getSignatureAndHashAlgorithm();
        vector.add(signatureAndHashAlgorithm);
      } 
    } 
    if (vector.isEmpty())
      return null; 
    vector.trimToSize();
    return vector;
  }
  
  static List<SignatureSchemeInfo> getSignatureSchemes(PerContext paramPerContext, Vector<SignatureAndHashAlgorithm> paramVector) {
    if (null == paramVector || paramVector.isEmpty())
      return null; 
    int i = paramVector.size();
    ArrayList<SignatureSchemeInfo> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramVector.elementAt(b);
      if (null != signatureAndHashAlgorithm) {
        int j = SignatureScheme.from(signatureAndHashAlgorithm);
        SignatureSchemeInfo signatureSchemeInfo = (SignatureSchemeInfo)paramPerContext.index.get(Integer.valueOf(j));
        if (null != signatureSchemeInfo)
          arrayList.add(signatureSchemeInfo); 
      } 
    } 
    if (arrayList.isEmpty())
      return null; 
    arrayList.trimToSize();
    return Collections.unmodifiableList(arrayList);
  }
  
  private static void addSignatureScheme(boolean paramBoolean, JcaTlsCrypto paramJcaTlsCrypto, NamedGroupInfo.PerContext paramPerContext, Map<Integer, SignatureSchemeInfo> paramMap, All paramAll) {
    int i = paramAll.signatureScheme;
    if (paramBoolean && !FipsUtils.isFipsSignatureScheme(i))
      return; 
    NamedGroupInfo namedGroupInfo = null;
    boolean bool = false;
    int j = paramAll.namedGroup13;
    if (j >= 0) {
      namedGroupInfo = NamedGroupInfo.getNamedGroup(paramPerContext, j);
      if (null == namedGroupInfo || !namedGroupInfo.isEnabled() || !namedGroupInfo.isSupportedPost13())
        bool = true; 
    } 
    boolean bool1 = paramJcaTlsCrypto.hasSignatureScheme(i);
    AlgorithmParameters algorithmParameters = null;
    if (bool1)
      try {
        algorithmParameters = paramJcaTlsCrypto.getSignatureSchemeAlgorithmParameters(i);
      } catch (Exception exception) {
        bool1 = false;
      }  
    SignatureSchemeInfo signatureSchemeInfo = new SignatureSchemeInfo(paramAll, algorithmParameters, namedGroupInfo, bool1, bool);
    if (null != paramMap.put(Integer.valueOf(i), signatureSchemeInfo))
      throw new IllegalStateException("Duplicate entries for SignatureSchemeInfo"); 
  }
  
  private static int[] createCandidatesFromProperty(Map<Integer, SignatureSchemeInfo> paramMap, String paramString) {
    String[] arrayOfString = PropertyUtils.getStringArraySystemProperty(paramString);
    return (null == arrayOfString) ? CANDIDATES_DEFAULT : createCandidates(paramMap, arrayOfString, paramString);
  }
  
  private static int[] createCandidates(Map<Integer, SignatureSchemeInfo> paramMap, String[] paramArrayOfString, String paramString) {
    int[] arrayOfInt = new int[paramArrayOfString.length];
    byte b = 0;
    for (String str : paramArrayOfString) {
      int i = getSignatureSchemeByName(str);
      if (i < 0) {
        LOG.warning("'" + paramString + "' contains unrecognised SignatureScheme: " + str);
      } else {
        SignatureSchemeInfo signatureSchemeInfo = paramMap.get(Integer.valueOf(i));
        if (null == signatureSchemeInfo) {
          LOG.warning("'" + paramString + "' contains unsupported SignatureScheme: " + str);
        } else if (!signatureSchemeInfo.isEnabled()) {
          LOG.warning("'" + paramString + "' contains disabled SignatureScheme: " + str);
        } else {
          arrayOfInt[b++] = i;
        } 
      } 
    } 
    if (b < arrayOfInt.length)
      arrayOfInt = Arrays.copyOf(arrayOfInt, b); 
    if (arrayOfInt.length < 1)
      LOG.severe("'" + paramString + "' contained no usable SignatureScheme values"); 
    return arrayOfInt;
  }
  
  private static int[] createCandidatesDefault() {
    All[] arrayOfAll = All.values();
    int[] arrayOfInt = new int[arrayOfAll.length];
    for (byte b = 0; b < arrayOfAll.length; b++)
      arrayOfInt[b] = (arrayOfAll[b]).signatureScheme; 
    return arrayOfInt;
  }
  
  private static Map<Integer, SignatureSchemeInfo> createIndex(boolean paramBoolean, JcaTlsCrypto paramJcaTlsCrypto, NamedGroupInfo.PerContext paramPerContext) {
    TreeMap<Object, Object> treeMap = new TreeMap<>();
    for (All all : All.values())
      addSignatureScheme(paramBoolean, paramJcaTlsCrypto, paramPerContext, (Map)treeMap, all); 
    return (Map)treeMap;
  }
  
  private static int getSignatureSchemeByName(String paramString) {
    for (All all : All.values()) {
      if (all.name.equalsIgnoreCase(paramString))
        return all.signatureScheme; 
    } 
    return -1;
  }
  
  private static boolean isECDSA(int paramInt) {
    switch (paramInt) {
      case 515:
      case 771:
      case 1027:
      case 1283:
      case 1539:
      case 2074:
      case 2075:
      case 2076:
        return true;
    } 
    return false;
  }
  
  SignatureSchemeInfo(All paramAll, AlgorithmParameters paramAlgorithmParameters, NamedGroupInfo paramNamedGroupInfo, boolean paramBoolean1, boolean paramBoolean2) {
    this.all = paramAll;
    this.algorithmParameters = paramAlgorithmParameters;
    this.namedGroupInfo = paramNamedGroupInfo;
    this.enabled = paramBoolean1;
    this.disabled13 = paramBoolean2;
  }
  
  short getHashAlgorithm() {
    return SignatureScheme.getHashAlgorithm(this.all.signatureScheme);
  }
  
  String getJcaSignatureAlgorithm() {
    return this.all.jcaSignatureAlgorithm;
  }
  
  String getJcaSignatureAlgorithmBC() {
    return this.all.jcaSignatureAlgorithmBC;
  }
  
  String getKeyType() {
    return this.all.keyAlgorithm;
  }
  
  String getKeyType13() {
    return this.all.keyType13;
  }
  
  String getName() {
    return this.all.name;
  }
  
  NamedGroupInfo getNamedGroupInfo() {
    return this.namedGroupInfo;
  }
  
  short getSignatureAlgorithm() {
    return SignatureScheme.getSignatureAlgorithm(this.all.signatureScheme);
  }
  
  SignatureAndHashAlgorithm getSignatureAndHashAlgorithm() {
    return getSignatureAndHashAlgorithm(this.all.signatureScheme);
  }
  
  int getSignatureScheme() {
    return this.all.signatureScheme;
  }
  
  boolean isEnabled() {
    return this.enabled;
  }
  
  boolean isSupportedPost13() {
    return (!this.disabled13 && this.all.supportedPost13);
  }
  
  boolean isSupportedPre13() {
    return this.all.supportedPre13;
  }
  
  boolean isSupportedCerts13() {
    return (!this.disabled13 && this.all.supportedCerts13);
  }
  
  public String toString() {
    return this.all.text;
  }
  
  private boolean isActiveCerts(BCAlgorithmConstraints paramBCAlgorithmConstraints, boolean paramBoolean1, boolean paramBoolean2, NamedGroupInfo.PerConnection paramPerConnection) {
    if (this.enabled)
      if (isNamedGroupOK((paramBoolean1 && isSupportedCerts13()), (paramBoolean2 && isSupportedPre13()), paramPerConnection) && isPermittedBy(paramBCAlgorithmConstraints)); 
    return false;
  }
  
  private boolean isNamedGroupOK(boolean paramBoolean1, boolean paramBoolean2, NamedGroupInfo.PerConnection paramPerConnection) {
    return (null != this.namedGroupInfo) ? (((paramBoolean1 && NamedGroupInfo.hasLocal(paramPerConnection, this.namedGroupInfo.getNamedGroup())) || (paramBoolean2 && NamedGroupInfo.hasAnyECDSALocal(paramPerConnection)))) : (((paramBoolean1 || paramBoolean2) && (!isECDSA(this.all.signatureScheme) || NamedGroupInfo.hasAnyECDSALocal(paramPerConnection))));
  }
  
  private boolean isPermittedBy(BCAlgorithmConstraints paramBCAlgorithmConstraints) {
    Set<BCCryptoPrimitive> set = JsseUtils.SIGNATURE_CRYPTO_PRIMITIVES_BC;
    return (paramBCAlgorithmConstraints.permits(set, this.all.name, null) && paramBCAlgorithmConstraints.permits(set, this.all.keyAlgorithm, null) && paramBCAlgorithmConstraints.permits(set, this.all.jcaSignatureAlgorithm, this.algorithmParameters));
  }
  
  private enum All {
    ed25519(2055, "Ed25519", "Ed25519"),
    ed448(2056, "Ed448", "Ed448"),
    ecdsa_secp256r1_sha256(1027, "SHA256withECDSA", "EC"),
    ecdsa_secp384r1_sha384(1283, "SHA384withECDSA", "EC"),
    ecdsa_secp521r1_sha512(1539, "SHA512withECDSA", "EC"),
    ecdsa_brainpoolP256r1tls13_sha256(2074, "SHA256withECDSA", "EC"),
    ecdsa_brainpoolP384r1tls13_sha384(2075, "SHA384withECDSA", "EC"),
    ecdsa_brainpoolP512r1tls13_sha512(2076, "SHA512withECDSA", "EC"),
    rsa_pss_pss_sha256(2057, "SHA256withRSAandMGF1", "RSASSA-PSS"),
    rsa_pss_pss_sha384(2058, "SHA384withRSAandMGF1", "RSASSA-PSS"),
    rsa_pss_pss_sha512(2059, "SHA512withRSAandMGF1", "RSASSA-PSS"),
    rsa_pss_rsae_sha256(2052, "SHA256withRSAandMGF1", "RSA"),
    rsa_pss_rsae_sha384(2053, "SHA384withRSAandMGF1", "RSA"),
    rsa_pss_rsae_sha512(2054, "SHA512withRSAandMGF1", "RSA"),
    rsa_pkcs1_sha256(1025, "SHA256withRSA", "RSA", true),
    rsa_pkcs1_sha384(1281, "SHA384withRSA", "RSA", true),
    rsa_pkcs1_sha512(1537, "SHA512withRSA", "RSA", true),
    sm2sig_sm3(1800, "SM3withSM2", "EC"),
    dsa_sha256(1026, "dsa_sha256", "SHA256withDSA", "DSA"),
    ecdsa_sha224(771, "ecdsa_sha224", "SHA224withECDSA", "EC"),
    rsa_sha224(769, "rsa_sha224", "SHA224withRSA", "RSA"),
    dsa_sha224(770, "dsa_sha224", "SHA224withDSA", "DSA"),
    ecdsa_sha1(515, "SHA1withECDSA", "EC", true),
    rsa_pkcs1_sha1(513, "SHA1withRSA", "RSA", true),
    dsa_sha1(514, "dsa_sha1", "SHA1withDSA", "DSA"),
    rsa_md5(257, "rsa_md5", "MD5withRSA", "RSA");
    
    private final int signatureScheme;
    
    private final String name;
    
    private final String text;
    
    private final String jcaSignatureAlgorithm;
    
    private final String jcaSignatureAlgorithmBC;
    
    private final String keyAlgorithm;
    
    private final String keyType13;
    
    private final boolean supportedPost13;
    
    private final boolean supportedPre13;
    
    private final boolean supportedCerts13;
    
    private final int namedGroup13;
    
    All(int param1Int1, String param1String1, String param1String2, String param1String3, boolean param1Boolean1, boolean param1Boolean2, int param1Int2) {
      String str1 = JsseUtils.getKeyType13(param1String3, param1Int2);
      String str2 = JsseUtils.getJcaSignatureAlgorithmBC(param1String2, param1String3);
      this.signatureScheme = param1Int1;
      this.name = param1String1;
      this.text = param1String1 + "(0x" + Integer.toHexString(param1Int1) + ")";
      this.jcaSignatureAlgorithm = param1String2;
      this.jcaSignatureAlgorithmBC = str2;
      this.keyAlgorithm = param1String3;
      this.keyType13 = str1;
      this.supportedPost13 = param1Boolean1;
      this.supportedPre13 = (param1Int2 < 0 || NamedGroup.canBeNegotiated(param1Int2, ProtocolVersion.TLSv12));
      this.supportedCerts13 = param1Boolean2;
      this.namedGroup13 = param1Int2;
    }
  }
  
  static class PerConnection {
    private final List<SignatureSchemeInfo> localSigSchemes;
    
    private final List<SignatureSchemeInfo> localSigSchemesCert;
    
    private final AtomicReference<List<SignatureSchemeInfo>> peerSigSchemes;
    
    private final AtomicReference<List<SignatureSchemeInfo>> peerSigSchemesCert;
    
    PerConnection(List<SignatureSchemeInfo> param1List) {
      this.localSigSchemes = param1List;
      this.localSigSchemesCert = null;
      this.peerSigSchemes = new AtomicReference<>();
      this.peerSigSchemesCert = new AtomicReference<>();
    }
    
    String[] getLocalJcaSignatureAlgorithms() {
      return SignatureSchemeInfo.getJcaSignatureAlgorithms(getLocalJcaSigSchemesCert());
    }
    
    String[] getLocalJcaSignatureAlgorithmsBC() {
      return SignatureSchemeInfo.getJcaSignatureAlgorithmsBC(getLocalJcaSigSchemesCert());
    }
    
    Vector<SignatureAndHashAlgorithm> getLocalSignatureAndHashAlgorithms() {
      return SignatureSchemeInfo.getSignatureAndHashAlgorithms(this.localSigSchemes);
    }
    
    Vector<SignatureAndHashAlgorithm> getLocalSignatureAndHashAlgorithmsCert() {
      return SignatureSchemeInfo.getSignatureAndHashAlgorithms(this.localSigSchemesCert);
    }
    
    String[] getPeerJcaSignatureAlgorithms() {
      return SignatureSchemeInfo.getJcaSignatureAlgorithms(getPeerJcaSigSchemesCert());
    }
    
    String[] getPeerJcaSignatureAlgorithmsBC() {
      return SignatureSchemeInfo.getJcaSignatureAlgorithmsBC(getPeerJcaSigSchemesCert());
    }
    
    Iterable<SignatureSchemeInfo> getPeerSigSchemes() {
      return this.peerSigSchemes.get();
    }
    
    boolean hasLocalSignatureScheme(SignatureSchemeInfo param1SignatureSchemeInfo) {
      return this.localSigSchemes.contains(param1SignatureSchemeInfo);
    }
    
    void notifyPeerData(List<SignatureSchemeInfo> param1List1, List<SignatureSchemeInfo> param1List2) {
      this.peerSigSchemes.set(param1List1);
      this.peerSigSchemesCert.set(param1List2);
    }
    
    private List<SignatureSchemeInfo> getLocalJcaSigSchemesCert() {
      return (this.localSigSchemesCert == null) ? this.localSigSchemes : this.localSigSchemesCert;
    }
    
    private List<SignatureSchemeInfo> getPeerJcaSigSchemesCert() {
      List<SignatureSchemeInfo> list = this.peerSigSchemesCert.get();
      return (list == null) ? this.peerSigSchemes.get() : list;
    }
  }
  
  static class PerContext {
    private final Map<Integer, SignatureSchemeInfo> index;
    
    private final int[] candidatesClient;
    
    private final int[] candidatesServer;
    
    PerContext(Map<Integer, SignatureSchemeInfo> param1Map, int[] param1ArrayOfint1, int[] param1ArrayOfint2) {
      this.index = param1Map;
      this.candidatesClient = param1ArrayOfint1;
      this.candidatesServer = param1ArrayOfint2;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\SignatureSchemeInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */