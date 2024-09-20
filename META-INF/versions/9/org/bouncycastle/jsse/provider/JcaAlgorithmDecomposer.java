package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import org.bouncycastle.jsse.provider.AlgorithmDecomposer;

class JcaAlgorithmDecomposer implements AlgorithmDecomposer {
  private static final Pattern PATTERN = Pattern.compile("with|and|(?<!padd)in", 2);
  
  static final org.bouncycastle.jsse.provider.JcaAlgorithmDecomposer INSTANCE_JCA = new org.bouncycastle.jsse.provider.JcaAlgorithmDecomposer();
  
  public Set<String> decompose(String paramString) {
    if (paramString.indexOf('/') < 0)
      return Collections.emptySet(); 
    HashSet<String> hashSet = new HashSet();
    for (String str : paramString.split("/")) {
      if (str.length() > 0)
        for (String str1 : PATTERN.split(str)) {
          if (str1.length() > 0)
            hashSet.add(str1); 
        }  
    } 
    ensureBothIfEither(hashSet, "SHA1", "SHA-1");
    ensureBothIfEither(hashSet, "SHA224", "SHA-224");
    ensureBothIfEither(hashSet, "SHA256", "SHA-256");
    ensureBothIfEither(hashSet, "SHA384", "SHA-384");
    ensureBothIfEither(hashSet, "SHA512", "SHA-512");
    return hashSet;
  }
  
  private static void ensureBothIfEither(Set<String> paramSet, String paramString1, String paramString2) {
    boolean bool1 = paramSet.contains(paramString1);
    boolean bool2 = paramSet.contains(paramString2);
    if (bool1 ^ bool2)
      paramSet.add(bool1 ? paramString2 : paramString1); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\JcaAlgorithmDecomposer.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */