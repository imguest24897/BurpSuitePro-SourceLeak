package META-INF.versions.9.org.bouncycastle.jsse.java.security;

import java.security.AlgorithmParameters;
import java.security.Key;
import java.util.Set;
import org.bouncycastle.jsse.java.security.BCCryptoPrimitive;

public interface BCAlgorithmConstraints {
  boolean permits(Set<BCCryptoPrimitive> paramSet, String paramString, AlgorithmParameters paramAlgorithmParameters);
  
  boolean permits(Set<BCCryptoPrimitive> paramSet, Key paramKey);
  
  boolean permits(Set<BCCryptoPrimitive> paramSet, String paramString, Key paramKey, AlgorithmParameters paramAlgorithmParameters);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\java\security\BCAlgorithmConstraints.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */