package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.AlgorithmParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import java.util.logging.Logger;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.provider.FipsUtils;
import org.bouncycastle.jsse.provider.JsseUtils;
import org.bouncycastle.jsse.provider.PropertyUtils;
import org.bouncycastle.jsse.provider.ProvSSLParameters;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;

class NamedGroupInfo {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.NamedGroupInfo.class.getName());
  
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
      arrayOfInt = PerContext.access$100(paramPerContext);
    } else {
      arrayOfInt = createCandidates(PerContext.access$200(paramPerContext), arrayOfString, "SSLParameters.namedGroups");
    } 
    BCAlgorithmConstraints bCAlgorithmConstraints = paramProvSSLParameters.getAlgorithmConstraints();
    boolean bool1 = TlsUtils.isTLSv13(paramProtocolVersion2);
    boolean bool = !TlsUtils.isTLSv13(paramProtocolVersion1) ? true : false;
    int i = arrayOfInt.length;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>(i);
    for (byte b = 0; b < i; b++) {
      Integer integer = Integers.valueOf(arrayOfInt[b]);
      org.bouncycastle.jsse.provider.NamedGroupInfo namedGroupInfo = (org.bouncycastle.jsse.provider.NamedGroupInfo)PerContext.access$200(paramPerContext).get(integer);
      if (null != namedGroupInfo && namedGroupInfo.isActive(bCAlgorithmConstraints, bool1, bool))
        linkedHashMap.put(integer, namedGroupInfo); 
    } 
    boolean bool2 = hasAnyECDSA((Map)linkedHashMap);
    return new PerConnection(linkedHashMap, bool2);
  }
  
  static PerContext createPerContext(boolean paramBoolean, JcaTlsCrypto paramJcaTlsCrypto) {
    Map<Integer, org.bouncycastle.jsse.provider.NamedGroupInfo> map = createIndex(paramBoolean, paramJcaTlsCrypto);
    int[] arrayOfInt = createCandidatesFromProperty(map, "jdk.tls.namedGroups");
    return new PerContext(map, arrayOfInt);
  }
  
  static int getMaximumBitsServerECDH(PerConnection paramPerConnection) {
    int i = 0;
    List list = paramPerConnection.getPeer();
    if (list != null) {
      for (org.bouncycastle.jsse.provider.NamedGroupInfo namedGroupInfo : list) {
        int j = namedGroupInfo.getBitsECDH();
        if (j > i && PerConnection.access$300(paramPerConnection).containsKey(Integer.valueOf(namedGroupInfo.getNamedGroup())))
          i = j; 
      } 
    } else {
      for (org.bouncycastle.jsse.provider.NamedGroupInfo namedGroupInfo : PerConnection.access$300(paramPerConnection).values())
        i = Math.max(i, namedGroupInfo.getBitsECDH()); 
    } 
    return i;
  }
  
  static int getMaximumBitsServerFFDHE(PerConnection paramPerConnection) {
    int i = 0;
    boolean bool = false;
    List list = paramPerConnection.getPeer();
    if (list != null)
      for (org.bouncycastle.jsse.provider.NamedGroupInfo namedGroupInfo : list) {
        int j = namedGroupInfo.getNamedGroup();
        bool |= NamedGroup.isFiniteField(j);
        int k = namedGroupInfo.getBitsFFDHE();
        if (k > i && PerConnection.access$300(paramPerConnection).containsKey(Integer.valueOf(j)))
          i = k; 
      }  
    if (!bool)
      for (org.bouncycastle.jsse.provider.NamedGroupInfo namedGroupInfo : PerConnection.access$300(paramPerConnection).values())
        i = Math.max(i, namedGroupInfo.getBitsFFDHE());  
    return i;
  }
  
  static org.bouncycastle.jsse.provider.NamedGroupInfo getNamedGroup(PerContext paramPerContext, int paramInt) {
    return (org.bouncycastle.jsse.provider.NamedGroupInfo)PerContext.access$200(paramPerContext).get(Integer.valueOf(paramInt));
  }
  
  static Vector<Integer> getSupportedGroupsLocalClient(PerConnection paramPerConnection) {
    return new Vector<>(PerConnection.access$300(paramPerConnection).keySet());
  }
  
  static int[] getSupportedGroupsLocalServer(PerConnection paramPerConnection) {
    Set set = PerConnection.access$300(paramPerConnection).keySet();
    int i = set.size();
    byte b = 0;
    int[] arrayOfInt = new int[i];
    for (Integer integer : set)
      arrayOfInt[b++] = integer.intValue(); 
    return arrayOfInt;
  }
  
  static boolean hasAnyECDSALocal(PerConnection paramPerConnection) {
    return PerConnection.access$400(paramPerConnection);
  }
  
  static boolean hasLocal(PerConnection paramPerConnection, int paramInt) {
    return PerConnection.access$300(paramPerConnection).containsKey(Integer.valueOf(paramInt));
  }
  
  static int selectServerECDH(PerConnection paramPerConnection, int paramInt) {
    List list = paramPerConnection.getPeer();
    if (list != null) {
      for (org.bouncycastle.jsse.provider.NamedGroupInfo namedGroupInfo : list) {
        if (namedGroupInfo.getBitsECDH() >= paramInt) {
          int i = namedGroupInfo.getNamedGroup();
          if (PerConnection.access$300(paramPerConnection).containsKey(Integer.valueOf(i)))
            return i; 
        } 
      } 
    } else {
      for (org.bouncycastle.jsse.provider.NamedGroupInfo namedGroupInfo : PerConnection.access$300(paramPerConnection).values()) {
        if (namedGroupInfo.getBitsECDH() >= paramInt)
          return namedGroupInfo.getNamedGroup(); 
      } 
    } 
    return -1;
  }
  
  static int selectServerFFDHE(PerConnection paramPerConnection, int paramInt) {
    boolean bool = false;
    List list = paramPerConnection.getPeer();
    if (list != null)
      for (org.bouncycastle.jsse.provider.NamedGroupInfo namedGroupInfo : list) {
        int i = namedGroupInfo.getNamedGroup();
        bool |= NamedGroup.isFiniteField(i);
        if (namedGroupInfo.getBitsFFDHE() >= paramInt && PerConnection.access$300(paramPerConnection).containsKey(Integer.valueOf(i)))
          return i; 
      }  
    if (!bool)
      for (org.bouncycastle.jsse.provider.NamedGroupInfo namedGroupInfo : PerConnection.access$300(paramPerConnection).values()) {
        if (namedGroupInfo.getBitsFFDHE() >= paramInt)
          return namedGroupInfo.getNamedGroup(); 
      }  
    return -1;
  }
  
  private static void addNamedGroup(boolean paramBoolean1, JcaTlsCrypto paramJcaTlsCrypto, boolean paramBoolean2, boolean paramBoolean3, Map<Integer, org.bouncycastle.jsse.provider.NamedGroupInfo> paramMap, All paramAll) {
    int i = All.access$500(paramAll);
    if (paramBoolean1 && !FipsUtils.isFipsNamedGroup(i))
      return; 
    boolean bool1 = ((paramBoolean2 && All.access$600(paramAll)) || (paramBoolean3 && All.access$700(paramAll) > 0)) ? true : false;
    boolean bool2 = (!bool1 && null != All.access$800(paramAll) && paramJcaTlsCrypto.hasNamedGroup(i)) ? true : false;
    AlgorithmParameters algorithmParameters = null;
    if (bool2)
      try {
        algorithmParameters = paramJcaTlsCrypto.getNamedGroupAlgorithmParameters(i);
      } catch (Exception exception) {
        bool2 = false;
      }  
    org.bouncycastle.jsse.provider.NamedGroupInfo namedGroupInfo = new org.bouncycastle.jsse.provider.NamedGroupInfo(paramAll, algorithmParameters, bool2);
    if (null != paramMap.put(Integer.valueOf(i), namedGroupInfo))
      throw new IllegalStateException("Duplicate entries for NamedGroupInfo"); 
  }
  
  private static int[] createCandidatesFromProperty(Map<Integer, org.bouncycastle.jsse.provider.NamedGroupInfo> paramMap, String paramString) {
    String[] arrayOfString = PropertyUtils.getStringArraySystemProperty(paramString);
    return (null == arrayOfString) ? CANDIDATES_DEFAULT : createCandidates(paramMap, arrayOfString, paramString);
  }
  
  private static int[] createCandidates(Map<Integer, org.bouncycastle.jsse.provider.NamedGroupInfo> paramMap, String[] paramArrayOfString, String paramString) {
    int[] arrayOfInt = new int[paramArrayOfString.length];
    byte b = 0;
    for (String str : paramArrayOfString) {
      int i = getNamedGroupByName(str);
      if (i < 0) {
        LOG.warning("'" + paramString + "' contains unrecognised NamedGroup: " + str);
      } else {
        org.bouncycastle.jsse.provider.NamedGroupInfo namedGroupInfo = paramMap.get(Integer.valueOf(i));
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
  
  private static Map<Integer, org.bouncycastle.jsse.provider.NamedGroupInfo> createIndex(boolean paramBoolean, JcaTlsCrypto paramJcaTlsCrypto) {
    TreeMap<Object, Object> treeMap = new TreeMap<>();
    boolean bool1 = (PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.ec.disableChar2", false) || PropertyUtils.getBooleanSystemProperty("org.bouncycastle.ec.disable_f2m", false)) ? true : false;
    boolean bool2 = !PropertyUtils.getBooleanSystemProperty("jsse.enableFFDHE", true) ? true : false;
    for (All all : All.values())
      addNamedGroup(paramBoolean, paramJcaTlsCrypto, bool1, bool2, (Map)treeMap, all); 
    return (Map)treeMap;
  }
  
  private static int getNamedGroupByName(String paramString) {
    for (All all : All.values()) {
      if (All.access$900(all).equalsIgnoreCase(paramString))
        return All.access$500(all); 
    } 
    return -1;
  }
  
  private static List<org.bouncycastle.jsse.provider.NamedGroupInfo> getNamedGroupInfos(Map<Integer, org.bouncycastle.jsse.provider.NamedGroupInfo> paramMap, int[] paramArrayOfint) {
    if (paramArrayOfint == null)
      return null; 
    if (paramArrayOfint.length < 1)
      return Collections.emptyList(); 
    int i = paramArrayOfint.length;
    ArrayList<org.bouncycastle.jsse.provider.NamedGroupInfo> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      int j = paramArrayOfint[b];
      org.bouncycastle.jsse.provider.NamedGroupInfo namedGroupInfo = paramMap.get(Integer.valueOf(j));
      if (null != namedGroupInfo)
        arrayList.add(namedGroupInfo); 
    } 
    if (arrayList.isEmpty())
      return Collections.emptyList(); 
    arrayList.trimToSize();
    return arrayList;
  }
  
  private static boolean hasAnyECDSA(Map<Integer, org.bouncycastle.jsse.provider.NamedGroupInfo> paramMap) {
    for (org.bouncycastle.jsse.provider.NamedGroupInfo namedGroupInfo : paramMap.values()) {
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
    return All.access$1000(this.all);
  }
  
  int getBitsFFDHE() {
    return All.access$700(this.all);
  }
  
  String getJcaAlgorithm() {
    return All.access$1100(this.all);
  }
  
  String getJcaGroup() {
    return All.access$800(this.all);
  }
  
  int getNamedGroup() {
    return All.access$500(this.all);
  }
  
  boolean isActive(BCAlgorithmConstraints paramBCAlgorithmConstraints, boolean paramBoolean1, boolean paramBoolean2) {
    return (this.enabled && ((paramBoolean1 && isSupportedPost13()) || (paramBoolean2 && isSupportedPre13())) && isPermittedBy(paramBCAlgorithmConstraints));
  }
  
  boolean isEnabled() {
    return this.enabled;
  }
  
  boolean isSupportedPost13() {
    return All.access$1200(this.all);
  }
  
  boolean isSupportedPre13() {
    return All.access$1300(this.all);
  }
  
  public String toString() {
    return All.access$1400(this.all);
  }
  
  private boolean isPermittedBy(BCAlgorithmConstraints paramBCAlgorithmConstraints) {
    Set set = JsseUtils.KEY_AGREEMENT_CRYPTO_PRIMITIVES_BC;
    return (paramBCAlgorithmConstraints.permits(set, getJcaGroup(), null) && paramBCAlgorithmConstraints.permits(set, getJcaAlgorithm(), this.algorithmParameters));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\NamedGroupInfo.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */