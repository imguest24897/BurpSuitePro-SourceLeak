package org.bouncycastle.jsse.provider;

import java.security.AlgorithmParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
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
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;

class NamedGroupInfo {
  private static final Logger LOG = Logger.getLogger(NamedGroupInfo.class.getName());
  
  private static final String PROPERTY_NAMED_GROUPS = "jdk.tls.namedGroups";
  
  private static final int[] CANDIDATES_DEFAULT = new int[] { 
      29, 30, 23, 24, 25, 31, 32, 33, 256, 257, 
      258 };
  
  private final All all;
  
  private final AlgorithmParameters algorithmParameters;
  
  private final boolean enabled;
  
  static PerConnection createPerConnectionClient(PerContext paramPerContext, ProvSSLParameters paramProvSSLParameters, ProtocolVersion[] paramArrayOfProtocolVersion) {
    ProtocolVersion protocolVersion1 = ProtocolVersion.getLatestTLS(paramArrayOfProtocolVersion);
    ProtocolVersion protocolVersion2 = ProtocolVersion.getEarliestTLS(paramArrayOfProtocolVersion);
    return createPerConnection(paramPerContext, paramProvSSLParameters, protocolVersion2, protocolVersion1);
  }
  
  static PerConnection createPerConnectionServer(PerContext paramPerContext, ProvSSLParameters paramProvSSLParameters, ProtocolVersion paramProtocolVersion) {
    return createPerConnection(paramPerContext, paramProvSSLParameters, paramProtocolVersion, paramProtocolVersion);
  }
  
  private static PerConnection createPerConnection(PerContext paramPerContext, ProvSSLParameters paramProvSSLParameters, ProtocolVersion paramProtocolVersion1, ProtocolVersion paramProtocolVersion2) {
    int[] arrayOfInt;
    String[] arrayOfString = paramProvSSLParameters.getNamedGroups();
    if (arrayOfString == null) {
      arrayOfInt = paramPerContext.candidates;
    } else {
      arrayOfInt = createCandidates(paramPerContext.index, arrayOfString, "SSLParameters.namedGroups");
    } 
    BCAlgorithmConstraints bCAlgorithmConstraints = paramProvSSLParameters.getAlgorithmConstraints();
    boolean bool1 = TlsUtils.isTLSv13(paramProtocolVersion2);
    boolean bool = !TlsUtils.isTLSv13(paramProtocolVersion1) ? true : false;
    int i = arrayOfInt.length;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>(i);
    for (byte b = 0; b < i; b++) {
      Integer integer = Integers.valueOf(arrayOfInt[b]);
      NamedGroupInfo namedGroupInfo = (NamedGroupInfo)paramPerContext.index.get(integer);
      if (null != namedGroupInfo && namedGroupInfo.isActive(bCAlgorithmConstraints, bool1, bool))
        linkedHashMap.put(integer, namedGroupInfo); 
    } 
    boolean bool2 = hasAnyECDSA((Map)linkedHashMap);
    return new PerConnection((LinkedHashMap)linkedHashMap, bool2);
  }
  
  static PerContext createPerContext(boolean paramBoolean, JcaTlsCrypto paramJcaTlsCrypto) {
    Map<Integer, NamedGroupInfo> map = createIndex(paramBoolean, paramJcaTlsCrypto);
    int[] arrayOfInt = createCandidatesFromProperty(map, "jdk.tls.namedGroups");
    return new PerContext(map, arrayOfInt);
  }
  
  static int getMaximumBitsServerECDH(PerConnection paramPerConnection) {
    int i = 0;
    List<NamedGroupInfo> list = paramPerConnection.getPeer();
    if (list != null) {
      for (NamedGroupInfo namedGroupInfo : list) {
        int j = namedGroupInfo.getBitsECDH();
        if (j > i && paramPerConnection.local.containsKey(Integer.valueOf(namedGroupInfo.getNamedGroup())))
          i = j; 
      } 
    } else {
      for (NamedGroupInfo namedGroupInfo : paramPerConnection.local.values())
        i = Math.max(i, namedGroupInfo.getBitsECDH()); 
    } 
    return i;
  }
  
  static int getMaximumBitsServerFFDHE(PerConnection paramPerConnection) {
    int i = 0;
    boolean bool = false;
    List<NamedGroupInfo> list = paramPerConnection.getPeer();
    if (list != null)
      for (NamedGroupInfo namedGroupInfo : list) {
        int j = namedGroupInfo.getNamedGroup();
        bool |= NamedGroup.isFiniteField(j);
        int k = namedGroupInfo.getBitsFFDHE();
        if (k > i && paramPerConnection.local.containsKey(Integer.valueOf(j)))
          i = k; 
      }  
    if (!bool)
      for (NamedGroupInfo namedGroupInfo : paramPerConnection.local.values())
        i = Math.max(i, namedGroupInfo.getBitsFFDHE());  
    return i;
  }
  
  static NamedGroupInfo getNamedGroup(PerContext paramPerContext, int paramInt) {
    return (NamedGroupInfo)paramPerContext.index.get(Integer.valueOf(paramInt));
  }
  
  static Vector<Integer> getSupportedGroupsLocalClient(PerConnection paramPerConnection) {
    return new Vector<>(paramPerConnection.local.keySet());
  }
  
  static int[] getSupportedGroupsLocalServer(PerConnection paramPerConnection) {
    Set set = paramPerConnection.local.keySet();
    int i = set.size();
    byte b = 0;
    int[] arrayOfInt = new int[i];
    for (Integer integer : set)
      arrayOfInt[b++] = integer.intValue(); 
    return arrayOfInt;
  }
  
  static boolean hasAnyECDSALocal(PerConnection paramPerConnection) {
    return paramPerConnection.localECDSA;
  }
  
  static boolean hasLocal(PerConnection paramPerConnection, int paramInt) {
    return paramPerConnection.local.containsKey(Integer.valueOf(paramInt));
  }
  
  static int selectServerECDH(PerConnection paramPerConnection, int paramInt) {
    List<NamedGroupInfo> list = paramPerConnection.getPeer();
    if (list != null) {
      for (NamedGroupInfo namedGroupInfo : list) {
        if (namedGroupInfo.getBitsECDH() >= paramInt) {
          int i = namedGroupInfo.getNamedGroup();
          if (paramPerConnection.local.containsKey(Integer.valueOf(i)))
            return i; 
        } 
      } 
    } else {
      for (NamedGroupInfo namedGroupInfo : paramPerConnection.local.values()) {
        if (namedGroupInfo.getBitsECDH() >= paramInt)
          return namedGroupInfo.getNamedGroup(); 
      } 
    } 
    return -1;
  }
  
  static int selectServerFFDHE(PerConnection paramPerConnection, int paramInt) {
    boolean bool = false;
    List<NamedGroupInfo> list = paramPerConnection.getPeer();
    if (list != null)
      for (NamedGroupInfo namedGroupInfo : list) {
        int i = namedGroupInfo.getNamedGroup();
        bool |= NamedGroup.isFiniteField(i);
        if (namedGroupInfo.getBitsFFDHE() >= paramInt && paramPerConnection.local.containsKey(Integer.valueOf(i)))
          return i; 
      }  
    if (!bool)
      for (NamedGroupInfo namedGroupInfo : paramPerConnection.local.values()) {
        if (namedGroupInfo.getBitsFFDHE() >= paramInt)
          return namedGroupInfo.getNamedGroup(); 
      }  
    return -1;
  }
  
  private static void addNamedGroup(boolean paramBoolean1, JcaTlsCrypto paramJcaTlsCrypto, boolean paramBoolean2, boolean paramBoolean3, Map<Integer, NamedGroupInfo> paramMap, All paramAll) {
    int i = paramAll.namedGroup;
    if (paramBoolean1 && !FipsUtils.isFipsNamedGroup(i))
      return; 
    boolean bool1 = ((paramBoolean2 && paramAll.char2) || (paramBoolean3 && paramAll.bitsFFDHE > 0)) ? true : false;
    boolean bool2 = (!bool1 && null != paramAll.jcaGroup && paramJcaTlsCrypto.hasNamedGroup(i)) ? true : false;
    AlgorithmParameters algorithmParameters = null;
    if (bool2)
      try {
        algorithmParameters = paramJcaTlsCrypto.getNamedGroupAlgorithmParameters(i);
      } catch (Exception exception) {
        bool2 = false;
      }  
    NamedGroupInfo namedGroupInfo = new NamedGroupInfo(paramAll, algorithmParameters, bool2);
    if (null != paramMap.put(Integer.valueOf(i), namedGroupInfo))
      throw new IllegalStateException("Duplicate entries for NamedGroupInfo"); 
  }
  
  private static int[] createCandidatesFromProperty(Map<Integer, NamedGroupInfo> paramMap, String paramString) {
    String[] arrayOfString = PropertyUtils.getStringArraySystemProperty(paramString);
    return (null == arrayOfString) ? CANDIDATES_DEFAULT : createCandidates(paramMap, arrayOfString, paramString);
  }
  
  private static int[] createCandidates(Map<Integer, NamedGroupInfo> paramMap, String[] paramArrayOfString, String paramString) {
    int[] arrayOfInt = new int[paramArrayOfString.length];
    byte b = 0;
    for (String str : paramArrayOfString) {
      int i = getNamedGroupByName(str);
      if (i < 0) {
        LOG.warning("'" + paramString + "' contains unrecognised NamedGroup: " + str);
      } else {
        NamedGroupInfo namedGroupInfo = paramMap.get(Integer.valueOf(i));
        if (null == namedGroupInfo) {
          LOG.warning("'" + paramString + "' contains unsupported NamedGroup: " + str);
        } else if (!namedGroupInfo.isEnabled()) {
          LOG.warning("'" + paramString + "' contains disabled NamedGroup: " + str);
        } else {
          arrayOfInt[b++] = i;
        } 
      } 
    } 
    if (b < arrayOfInt.length)
      arrayOfInt = Arrays.copyOf(arrayOfInt, b); 
    if (arrayOfInt.length < 1)
      LOG.severe("'" + paramString + "' contained no usable NamedGroup values"); 
    return arrayOfInt;
  }
  
  private static Map<Integer, NamedGroupInfo> createIndex(boolean paramBoolean, JcaTlsCrypto paramJcaTlsCrypto) {
    TreeMap<Object, Object> treeMap = new TreeMap<>();
    boolean bool1 = (PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.ec.disableChar2", false) || PropertyUtils.getBooleanSystemProperty("org.bouncycastle.ec.disable_f2m", false)) ? true : false;
    boolean bool2 = !PropertyUtils.getBooleanSystemProperty("jsse.enableFFDHE", true) ? true : false;
    for (All all : All.values())
      addNamedGroup(paramBoolean, paramJcaTlsCrypto, bool1, bool2, (Map)treeMap, all); 
    return (Map)treeMap;
  }
  
  private static int getNamedGroupByName(String paramString) {
    for (All all : All.values()) {
      if (all.name.equalsIgnoreCase(paramString))
        return all.namedGroup; 
    } 
    return -1;
  }
  
  private static List<NamedGroupInfo> getNamedGroupInfos(Map<Integer, NamedGroupInfo> paramMap, int[] paramArrayOfint) {
    if (paramArrayOfint == null)
      return null; 
    if (paramArrayOfint.length < 1)
      return Collections.emptyList(); 
    int i = paramArrayOfint.length;
    ArrayList<NamedGroupInfo> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      int j = paramArrayOfint[b];
      NamedGroupInfo namedGroupInfo = paramMap.get(Integer.valueOf(j));
      if (null != namedGroupInfo)
        arrayList.add(namedGroupInfo); 
    } 
    if (arrayList.isEmpty())
      return Collections.emptyList(); 
    arrayList.trimToSize();
    return arrayList;
  }
  
  private static boolean hasAnyECDSA(Map<Integer, NamedGroupInfo> paramMap) {
    for (NamedGroupInfo namedGroupInfo : paramMap.values()) {
      if (NamedGroup.refersToAnECDSACurve(namedGroupInfo.getNamedGroup()))
        return true; 
    } 
    return false;
  }
  
  NamedGroupInfo(All paramAll, AlgorithmParameters paramAlgorithmParameters, boolean paramBoolean) {
    this.all = paramAll;
    this.algorithmParameters = paramAlgorithmParameters;
    this.enabled = paramBoolean;
  }
  
  int getBitsECDH() {
    return this.all.bitsECDH;
  }
  
  int getBitsFFDHE() {
    return this.all.bitsFFDHE;
  }
  
  String getJcaAlgorithm() {
    return this.all.jcaAlgorithm;
  }
  
  String getJcaGroup() {
    return this.all.jcaGroup;
  }
  
  int getNamedGroup() {
    return this.all.namedGroup;
  }
  
  boolean isActive(BCAlgorithmConstraints paramBCAlgorithmConstraints, boolean paramBoolean1, boolean paramBoolean2) {
    return (this.enabled && ((paramBoolean1 && isSupportedPost13()) || (paramBoolean2 && isSupportedPre13())) && isPermittedBy(paramBCAlgorithmConstraints));
  }
  
  boolean isEnabled() {
    return this.enabled;
  }
  
  boolean isSupportedPost13() {
    return this.all.supportedPost13;
  }
  
  boolean isSupportedPre13() {
    return this.all.supportedPre13;
  }
  
  public String toString() {
    return this.all.text;
  }
  
  private boolean isPermittedBy(BCAlgorithmConstraints paramBCAlgorithmConstraints) {
    Set<BCCryptoPrimitive> set = JsseUtils.KEY_AGREEMENT_CRYPTO_PRIMITIVES_BC;
    return (paramBCAlgorithmConstraints.permits(set, getJcaGroup(), null) && paramBCAlgorithmConstraints.permits(set, getJcaAlgorithm(), this.algorithmParameters));
  }
  
  private enum All {
    sect163k1(1, "EC"),
    sect163r1(2, "EC"),
    sect163r2(3, "EC"),
    sect193r1(4, "EC"),
    sect193r2(5, "EC"),
    sect233k1(6, "EC"),
    sect233r1(7, "EC"),
    sect239k1(8, "EC"),
    sect283k1(9, "EC"),
    sect283r1(10, "EC"),
    sect409k1(11, "EC"),
    sect409r1(12, "EC"),
    sect571k1(13, "EC"),
    sect571r1(14, "EC"),
    secp160k1(15, "EC"),
    secp160r1(16, "EC"),
    secp160r2(17, "EC"),
    secp192k1(18, "EC"),
    secp192r1(19, "EC"),
    secp224k1(20, "EC"),
    secp224r1(21, "EC"),
    secp256k1(22, "EC"),
    secp256r1(23, "EC"),
    secp384r1(24, "EC"),
    secp521r1(25, "EC"),
    brainpoolP256r1(26, "EC"),
    brainpoolP384r1(27, "EC"),
    brainpoolP512r1(28, "EC"),
    x25519(29, "XDH"),
    x448(30, "XDH"),
    brainpoolP256r1tls13(31, "EC"),
    brainpoolP384r1tls13(32, "EC"),
    brainpoolP512r1tls13(33, "EC"),
    curveSM2(41, "EC"),
    ffdhe2048(256, "DiffieHellman"),
    ffdhe3072(257, "DiffieHellman"),
    ffdhe4096(258, "DiffieHellman"),
    ffdhe6144(259, "DiffieHellman"),
    ffdhe8192(260, "DiffieHellman"),
    OQS_mlkem512(583, "ML-KEM"),
    OQS_mlkem768(584, "ML-KEM"),
    OQS_mlkem1024(585, "ML-KEM"),
    DRAFT_mlkem768(1896, "ML-KEM"),
    DRAFT_mlkem1024(4132, "ML-KEM");
    
    private final int namedGroup;
    
    private final String name;
    
    private final String text;
    
    private final String jcaAlgorithm;
    
    private final String jcaGroup;
    
    private final boolean char2;
    
    private final boolean supportedPost13;
    
    private final boolean supportedPre13;
    
    private final int bitsECDH;
    
    private final int bitsFFDHE;
    
    All(int param1Int1, String param1String1) {
      this.namedGroup = param1Int1;
      this.name = NamedGroup.getName(param1Int1);
      this.text = NamedGroup.getText(param1Int1);
      this.jcaAlgorithm = param1String1;
      this.jcaGroup = NamedGroup.getStandardName(param1Int1);
      this.supportedPost13 = NamedGroup.canBeNegotiated(param1Int1, ProtocolVersion.TLSv13);
      this.supportedPre13 = NamedGroup.canBeNegotiated(param1Int1, ProtocolVersion.TLSv12);
      this.char2 = NamedGroup.isChar2Curve(param1Int1);
      this.bitsECDH = NamedGroup.getCurveBits(param1Int1);
      this.bitsFFDHE = NamedGroup.getFiniteFieldBits(param1Int1);
    }
  }
  
  static class PerConnection {
    private final LinkedHashMap<Integer, NamedGroupInfo> local;
    
    private final boolean localECDSA;
    
    private final AtomicReference<List<NamedGroupInfo>> peer;
    
    PerConnection(LinkedHashMap<Integer, NamedGroupInfo> param1LinkedHashMap, boolean param1Boolean) {
      if (param1LinkedHashMap == null)
        throw new NullPointerException("local"); 
      this.local = param1LinkedHashMap;
      this.localECDSA = param1Boolean;
      this.peer = new AtomicReference<>();
    }
    
    List<NamedGroupInfo> getPeer() {
      return this.peer.get();
    }
    
    void notifyPeerData(int[] param1ArrayOfint) {
      List<NamedGroupInfo> list = NamedGroupInfo.getNamedGroupInfos(this.local, param1ArrayOfint);
      this.peer.set(list);
    }
  }
  
  static class PerContext {
    private final Map<Integer, NamedGroupInfo> index;
    
    private final int[] candidates;
    
    PerContext(Map<Integer, NamedGroupInfo> param1Map, int[] param1ArrayOfint) {
      this.index = param1Map;
      this.candidates = param1ArrayOfint;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\NamedGroupInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */