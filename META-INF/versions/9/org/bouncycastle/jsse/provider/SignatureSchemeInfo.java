package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.AlgorithmParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import java.util.logging.Logger;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.provider.FipsUtils;
import org.bouncycastle.jsse.provider.JsseUtils;
import org.bouncycastle.jsse.provider.NamedGroupInfo;
import org.bouncycastle.jsse.provider.PropertyUtils;
import org.bouncycastle.jsse.provider.ProvSSLParameters;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;

class SignatureSchemeInfo {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.SignatureSchemeInfo.class.getName());
  
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
      arrayOfInt = paramBoolean ? PerContext.access$000(paramPerContext) : PerContext.access$100(paramPerContext);
    } else {
      arrayOfInt = createCandidates(PerContext.access$200(paramPerContext), arrayOfString, "SSLParameters.signatureSchemes");
    } 
    BCAlgorithmConstraints bCAlgorithmConstraints = paramProvSSLParameters.getAlgorithmConstraints();
    boolean bool = TlsUtils.isTLSv13(paramProtocolVersion2);
    boolean bool1 = !TlsUtils.isTLSv13(paramProtocolVersion1) ? true : false;
    int i = arrayOfInt.length;
    ArrayList<org.bouncycastle.jsse.provider.SignatureSchemeInfo> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Integer integer = Integers.valueOf(arrayOfInt[b]);
      org.bouncycastle.jsse.provider.SignatureSchemeInfo signatureSchemeInfo = (org.bouncycastle.jsse.provider.SignatureSchemeInfo)PerContext.access$200(paramPerContext).get(integer);
      if (null != signatureSchemeInfo && signatureSchemeInfo.isActiveCerts(bCAlgorithmConstraints, bool, bool1, paramPerConnection))
        arrayList.add(signatureSchemeInfo); 
    } 
    arrayList.trimToSize();
    return new PerConnection(arrayList);
  }
  
  static PerContext createPerContext(boolean paramBoolean, JcaTlsCrypto paramJcaTlsCrypto, NamedGroupInfo.PerContext paramPerContext) {
    Map<Integer, org.bouncycastle.jsse.provider.SignatureSchemeInfo> map = createIndex(paramBoolean, paramJcaTlsCrypto, paramPerContext);
    int[] arrayOfInt1 = createCandidatesFromProperty(map, "jdk.tls.client.SignatureSchemes");
    int[] arrayOfInt2 = createCandidatesFromProperty(map, "jdk.tls.server.SignatureSchemes");
    return new PerContext(map, arrayOfInt1, arrayOfInt2);
  }
  
  static String[] getJcaSignatureAlgorithms(Collection<org.bouncycastle.jsse.provider.SignatureSchemeInfo> paramCollection) {
    if (null == paramCollection)
      return TlsUtils.EMPTY_STRINGS; 
    ArrayList<String> arrayList = new ArrayList();
    for (org.bouncycastle.jsse.provider.SignatureSchemeInfo signatureSchemeInfo : paramCollection)
      arrayList.add(signatureSchemeInfo.getJcaSignatureAlgorithm()); 
    return arrayList.<String>toArray(TlsUtils.EMPTY_STRINGS);
  }
  
  static String[] getJcaSignatureAlgorithmsBC(Collection<org.bouncycastle.jsse.provider.SignatureSchemeInfo> paramCollection) {
    if (null == paramCollection)
      return TlsUtils.EMPTY_STRINGS; 
    ArrayList<String> arrayList = new ArrayList();
    for (org.bouncycastle.jsse.provider.SignatureSchemeInfo signatureSchemeInfo : paramCollection)
      arrayList.add(signatureSchemeInfo.getJcaSignatureAlgorithmBC()); 
    return arrayList.<String>toArray(TlsUtils.EMPTY_STRINGS);
  }
  
  static SignatureAndHashAlgorithm getSignatureAndHashAlgorithm(int paramInt) {
    if (!TlsUtils.isValidUint16(paramInt))
      throw new IllegalArgumentException(); 
    return SignatureScheme.getSignatureAndHashAlgorithm(paramInt);
  }
  
  static Vector<SignatureAndHashAlgorithm> getSignatureAndHashAlgorithms(List<org.bouncycastle.jsse.provider.SignatureSchemeInfo> paramList) {
    if (null == paramList || paramList.isEmpty())
      return null; 
    int i = paramList.size();
    Vector<SignatureAndHashAlgorithm> vector = new Vector(i);
    for (org.bouncycastle.jsse.provider.SignatureSchemeInfo signatureSchemeInfo : paramList) {
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
  
  static List<org.bouncycastle.jsse.provider.SignatureSchemeInfo> getSignatureSchemes(PerContext paramPerContext, Vector<SignatureAndHashAlgorithm> paramVector) {
    if (null == paramVector || paramVector.isEmpty())
      return null; 
    int i = paramVector.size();
    ArrayList<org.bouncycastle.jsse.provider.SignatureSchemeInfo> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramVector.elementAt(b);
      if (null != signatureAndHashAlgorithm) {
        int j = SignatureScheme.from(signatureAndHashAlgorithm);
        org.bouncycastle.jsse.provider.SignatureSchemeInfo signatureSchemeInfo = (org.bouncycastle.jsse.provider.SignatureSchemeInfo)PerContext.access$200(paramPerContext).get(Integer.valueOf(j));
        if (null != signatureSchemeInfo)
          arrayList.add(signatureSchemeInfo); 
      } 
    } 
    if (arrayList.isEmpty())
      return null; 
    arrayList.trimToSize();
    return Collections.unmodifiableList(arrayList);
  }
  
  private static void addSignatureScheme(boolean paramBoolean, JcaTlsCrypto paramJcaTlsCrypto, NamedGroupInfo.PerContext paramPerContext, Map<Integer, org.bouncycastle.jsse.provider.SignatureSchemeInfo> paramMap, All paramAll) {
    int i = All.access$300(paramAll);
    if (paramBoolean && !FipsUtils.isFipsSignatureScheme(i))
      return; 
    NamedGroupInfo namedGroupInfo = null;
    boolean bool = false;
    int j = All.access$400(paramAll);
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
    org.bouncycastle.jsse.provider.SignatureSchemeInfo signatureSchemeInfo = new org.bouncycastle.jsse.provider.SignatureSchemeInfo(paramAll, algorithmParameters, namedGroupInfo, bool1, bool);
    if (null != paramMap.put(Integer.valueOf(i), signatureSchemeInfo))
      throw new IllegalStateException("Duplicate entries for SignatureSchemeInfo"); 
  }
  
  private static int[] createCandidatesFromProperty(Map<Integer, org.bouncycastle.jsse.provider.SignatureSchemeInfo> paramMap, String paramString) {
    String[] arrayOfString = PropertyUtils.getStringArraySystemProperty(paramString);
    return (null == arrayOfString) ? CANDIDATES_DEFAULT : createCandidates(paramMap, arrayOfString, paramString);
  }
  
  private static int[] createCandidates(Map<Integer, org.bouncycastle.jsse.provider.SignatureSchemeInfo> paramMap, String[] paramArrayOfString, String paramString) {
    int[] arrayOfInt = new int[paramArrayOfString.length];
    byte b = 0;
    for (String str : paramArrayOfString) {
      int i = getSignatureSchemeByName(str);
      if (i < 0) {
        LOG.warning("'" + paramString + "' contains unrecognised SignatureScheme: " + str);
      } else {
        org.bouncycastle.jsse.provider.SignatureSchemeInfo signatureSchemeInfo = paramMap.get(Integer.valueOf(i));
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
      arrayOfInt[b] = All.access$300(arrayOfAll[b]); 
    return arrayOfInt;
  }
  
  private static Map<Integer, org.bouncycastle.jsse.provider.SignatureSchemeInfo> createIndex(boolean paramBoolean, JcaTlsCrypto paramJcaTlsCrypto, NamedGroupInfo.PerContext paramPerContext) {
    TreeMap<Object, Object> treeMap = new TreeMap<>();
    for (All all : All.values())
      addSignatureScheme(paramBoolean, paramJcaTlsCrypto, paramPerContext, (Map)treeMap, all); 
    return (Map)treeMap;
  }
  
  private static int getSignatureSchemeByName(String paramString) {
    for (All all : All.values()) {
      if (All.access$500(all).equalsIgnoreCase(paramString))
        return All.access$300(all); 
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
    return SignatureScheme.getHashAlgorithm(All.access$300(this.all));
  }
  
  String getJcaSignatureAlgorithm() {
    return All.access$600(this.all);
  }
  
  String getJcaSignatureAlgorithmBC() {
    return All.access$700(this.all);
  }
  
  String getKeyType() {
    return All.access$800(this.all);
  }
  
  String getKeyType13() {
    return All.access$900(this.all);
  }
  
  String getName() {
    return All.access$500(this.all);
  }
  
  NamedGroupInfo getNamedGroupInfo() {
    return this.namedGroupInfo;
  }
  
  short getSignatureAlgorithm() {
    return SignatureScheme.getSignatureAlgorithm(All.access$300(this.all));
  }
  
  SignatureAndHashAlgorithm getSignatureAndHashAlgorithm() {
    return getSignatureAndHashAlgorithm(All.access$300(this.all));
  }
  
  int getSignatureScheme() {
    return All.access$300(this.all);
  }
  
  boolean isEnabled() {
    return this.enabled;
  }
  
  boolean isSupportedPost13() {
    return (!this.disabled13 && All.access$1000(this.all));
  }
  
  boolean isSupportedPre13() {
    return All.access$1100(this.all);
  }
  
  boolean isSupportedCerts13() {
    return (!this.disabled13 && All.access$1200(this.all));
  }
  
  public String toString() {
    return All.access$1300(this.all);
  }
  
  private boolean isActiveCerts(BCAlgorithmConstraints paramBCAlgorithmConstraints, boolean paramBoolean1, boolean paramBoolean2, NamedGroupInfo.PerConnection paramPerConnection) {
    if (this.enabled)
      if (isNamedGroupOK((paramBoolean1 && isSupportedCerts13()), (paramBoolean2 && isSupportedPre13()), paramPerConnection) && isPermittedBy(paramBCAlgorithmConstraints)); 
    return false;
  }
  
  private boolean isNamedGroupOK(boolean paramBoolean1, boolean paramBoolean2, NamedGroupInfo.PerConnection paramPerConnection) {
    return (null != this.namedGroupInfo) ? (((paramBoolean1 && NamedGroupInfo.hasLocal(paramPerConnection, this.namedGroupInfo.getNamedGroup())) || (paramBoolean2 && NamedGroupInfo.hasAnyECDSALocal(paramPerConnection)))) : (((paramBoolean1 || paramBoolean2) && (!isECDSA(All.access$300(this.all)) || NamedGroupInfo.hasAnyECDSALocal(paramPerConnection))));
  }
  
  private boolean isPermittedBy(BCAlgorithmConstraints paramBCAlgorithmConstraints) {
    Set set = JsseUtils.SIGNATURE_CRYPTO_PRIMITIVES_BC;
    return (paramBCAlgorithmConstraints.permits(set, All.access$500(this.all), null) && paramBCAlgorithmConstraints.permits(set, All.access$800(this.all), null) && paramBCAlgorithmConstraints.permits(set, All.access$600(this.all), this.algorithmParameters));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\SignatureSchemeInfo.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */