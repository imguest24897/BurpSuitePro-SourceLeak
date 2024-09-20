package org.bouncycastle.jsse.java.security;

import java.security.AlgorithmParameters;
import java.security.Key;
import java.util.Set;

public interface BCAlgorithmConstraints {
  boolean permits(Set<BCCryptoPrimitive> paramSet, String paramString, AlgorithmParameters paramAlgorithmParameters);
  
  boolean permits(Set<BCCryptoPrimitive> paramSet, Key paramKey);
  
  boolean permits(Set<BCCryptoPrimitive> paramSet, String paramString, Key paramKey, AlgorithmParameters paramAlgorithmParameters);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\java\security\BCAlgorithmConstraints.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */