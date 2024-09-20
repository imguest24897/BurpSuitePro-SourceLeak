package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.AlgorithmParameters;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Logger;
import org.bouncycastle.jsse.java.security.BCCryptoPrimitive;
import org.bouncycastle.jsse.provider.AbstractAlgorithmConstraints;
import org.bouncycastle.jsse.provider.AlgorithmDecomposer;
import org.bouncycastle.jsse.provider.JsseUtils;
import org.bouncycastle.jsse.provider.PropertyUtils;

class DisabledAlgorithmConstraints extends AbstractAlgorithmConstraints {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.DisabledAlgorithmConstraints.class.getName());
  
  private static final String INCLUDE_PREFIX = "include ";
  
  private static final String KEYWORD_KEYSIZE = "keySize";
  
  private final Set<String> disabledAlgorithms;
  
  private final Map<String, List<Constraint>> constraintsMap;
  
  static org.bouncycastle.jsse.provider.DisabledAlgorithmConstraints create(AlgorithmDecomposer paramAlgorithmDecomposer, String paramString1, String paramString2) {
    String[] arrayOfString = PropertyUtils.getStringArraySecurityProperty(paramString1, paramString2);
    if (null == arrayOfString)
      return null; 
    HashSet<String> hashSet = new HashSet();
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (!addConstraint(hashSet, (Map)hashMap, arrayOfString[b]))
        LOG.warning("Ignoring unsupported entry in '" + paramString1 + "': " + arrayOfString[b]); 
    } 
    return new org.bouncycastle.jsse.provider.DisabledAlgorithmConstraints(paramAlgorithmDecomposer, Collections.unmodifiableSet(hashSet), (Map)Collections.unmodifiableMap(hashMap));
  }
  
  private static boolean addConstraint(Set<String> paramSet, Map<String, List<Constraint>> paramMap, String paramString) {
    if (paramString.regionMatches(true, 0, "include ", 0, "include ".length()))
      return false; 
    int i = paramString.indexOf(' ');
    if (i < 0) {
      String str = getCanonicalAlgorithm(paramString);
      paramSet.add(str);
      addConstraint(paramMap, str, (Constraint)DisabledConstraint.INSTANCE);
      return true;
    } 
    String str1 = getCanonicalAlgorithm(paramString.substring(0, i));
    String str2 = paramString.substring(i + 1).trim();
    int j = str2.indexOf('&');
    if (j >= 0)
      return false; 
    if (str2.startsWith("keySize")) {
      StringTokenizer stringTokenizer = new StringTokenizer(str2);
      if (!"keySize".equals(stringTokenizer.nextToken()))
        return false; 
      BinOp binOp = BinOp.parse(stringTokenizer.nextToken());
      int k = Integer.parseInt(stringTokenizer.nextToken());
      if (stringTokenizer.hasMoreTokens())
        return false; 
      addConstraint(paramMap, str1, (Constraint)new KeySizeConstraint(binOp, k));
      return true;
    } 
    return false;
  }
  
  private static void addConstraint(Map<String, List<Constraint>> paramMap, String paramString, Constraint paramConstraint) {
    List<Constraint> list = paramMap.get(paramString);
    if (null == list) {
      list = new ArrayList(1);
      paramMap.put(paramString, list);
    } 
    list.add(paramConstraint);
  }
  
  private static String getCanonicalAlgorithm(String paramString) {
    return "DiffieHellman".equalsIgnoreCase(paramString) ? "DH" : paramString.toUpperCase(Locale.ENGLISH).replace("SHA-", "SHA");
  }
  
  private static String getConstraintsAlgorithm(String paramString, AlgorithmParameters paramAlgorithmParameters) {
    if (null != paramAlgorithmParameters) {
      String str = paramAlgorithmParameters.getAlgorithm();
      if (null != str) {
        String str1 = getCanonicalAlgorithm(paramString);
        if (str1.equalsIgnoreCase(getCanonicalAlgorithm(str)))
          return str1; 
      } 
    } 
    return null;
  }
  
  private static String getConstraintsAlgorithm(Key paramKey) {
    if (null != paramKey) {
      String str = JsseUtils.getKeyAlgorithm(paramKey);
      if (null != str)
        return getCanonicalAlgorithm(str); 
    } 
    return null;
  }
  
  private DisabledAlgorithmConstraints(AlgorithmDecomposer paramAlgorithmDecomposer, Set<String> paramSet, Map<String, List<Constraint>> paramMap) {
    super(paramAlgorithmDecomposer);
    this.disabledAlgorithms = paramSet;
    this.constraintsMap = paramMap;
  }
  
  public final boolean permits(Set<BCCryptoPrimitive> paramSet, String paramString, AlgorithmParameters paramAlgorithmParameters) {
    checkPrimitives(paramSet);
    checkAlgorithmName(paramString);
    if (containsAnyPartIgnoreCase(this.disabledAlgorithms, paramString))
      return false; 
    for (Constraint constraint : getConstraints(getConstraintsAlgorithm(paramString, paramAlgorithmParameters))) {
      if (!constraint.permits(paramAlgorithmParameters))
        return false; 
    } 
    return true;
  }
  
  public final boolean permits(Set<BCCryptoPrimitive> paramSet, Key paramKey) {
    return checkConstraints(paramSet, null, paramKey, null);
  }
  
  public final boolean permits(Set<BCCryptoPrimitive> paramSet, String paramString, Key paramKey, AlgorithmParameters paramAlgorithmParameters) {
    checkAlgorithmName(paramString);
    return checkConstraints(paramSet, paramString, paramKey, paramAlgorithmParameters);
  }
  
  private boolean checkConstraints(Set<BCCryptoPrimitive> paramSet, String paramString, Key paramKey, AlgorithmParameters paramAlgorithmParameters) {
    checkPrimitives(paramSet);
    checkKey(paramKey);
    if (JsseUtils.isNameSpecified(paramString) && !permits(paramSet, paramString, paramAlgorithmParameters))
      return false; 
    if (!permits(paramSet, JsseUtils.getKeyAlgorithm(paramKey), null))
      return false; 
    for (Constraint constraint : getConstraints(getConstraintsAlgorithm(paramKey))) {
      if (!constraint.permits(paramKey))
        return false; 
    } 
    return true;
  }
  
  private List<Constraint> getConstraints(String paramString) {
    if (null != paramString) {
      List<Constraint> list = this.constraintsMap.get(paramString);
      if (null != list)
        return list; 
    } 
    return Collections.emptyList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\DisabledAlgorithmConstraints.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */