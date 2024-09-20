package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.Key;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.java.security.BCCryptoPrimitive;
import org.bouncycastle.jsse.provider.AlgorithmDecomposer;
import org.bouncycastle.jsse.provider.JsseUtils;

abstract class AbstractAlgorithmConstraints implements BCAlgorithmConstraints {
  protected final AlgorithmDecomposer decomposer;
  
  AbstractAlgorithmConstraints(AlgorithmDecomposer paramAlgorithmDecomposer) {
    this.decomposer = paramAlgorithmDecomposer;
  }
  
  protected void checkAlgorithmName(String paramString) {
    if (!JsseUtils.isNameSpecified(paramString))
      throw new IllegalArgumentException("No algorithm name specified"); 
  }
  
  protected void checkKey(Key paramKey) {
    if (null == paramKey)
      throw new NullPointerException("'key' cannot be null"); 
  }
  
  protected void checkPrimitives(Set<BCCryptoPrimitive> paramSet) {
    if (!isPrimitivesSpecified(paramSet))
      throw new IllegalArgumentException("No cryptographic primitive specified"); 
  }
  
  protected boolean containsAnyPartIgnoreCase(Set<String> paramSet, String paramString) {
    if (paramSet.isEmpty())
      return false; 
    if (containsIgnoreCase(paramSet, paramString))
      return true; 
    if (null != this.decomposer)
      for (String str : this.decomposer.decompose(paramString)) {
        if (containsIgnoreCase(paramSet, str))
          return true; 
      }  
    return false;
  }
  
  protected boolean containsIgnoreCase(Set<String> paramSet, String paramString) {
    for (String str : paramSet) {
      if (str.equalsIgnoreCase(paramString))
        return true; 
    } 
    return false;
  }
  
  protected boolean isPrimitivesSpecified(Set<BCCryptoPrimitive> paramSet) {
    return (null != paramSet && !paramSet.isEmpty());
  }
  
  protected static Set<String> asUnmodifiableSet(String[] paramArrayOfString) {
    if (null != paramArrayOfString && paramArrayOfString.length > 0) {
      Set<String> set = asSet(paramArrayOfString);
      if (!set.isEmpty())
        return Collections.unmodifiableSet(set); 
    } 
    return Collections.emptySet();
  }
  
  protected static Set<String> asSet(String[] paramArrayOfString) {
    HashSet<String> hashSet = new HashSet();
    if (null != paramArrayOfString)
      for (String str : paramArrayOfString) {
        if (null != str)
          hashSet.add(str); 
      }  
    return hashSet;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\AbstractAlgorithmConstraints.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */