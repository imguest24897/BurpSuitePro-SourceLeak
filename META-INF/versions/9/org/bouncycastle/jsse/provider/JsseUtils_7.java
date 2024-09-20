package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.AlgorithmConstraints;
import java.security.CryptoPrimitive;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.java.security.BCCryptoPrimitive;
import org.bouncycastle.jsse.provider.JsseUtils;
import org.bouncycastle.jsse.provider.ProvAlgorithmConstraints;

abstract class JsseUtils_7 extends JsseUtils {
  static final Set<CryptoPrimitive> KEY_AGREEMENT_CRYPTO_PRIMITIVES = Collections.unmodifiableSet(EnumSet.of(CryptoPrimitive.KEY_AGREEMENT));
  
  static final Set<CryptoPrimitive> KEY_ENCAPSULATION_CRYPTO_PRIMITIVES = Collections.unmodifiableSet(EnumSet.of(CryptoPrimitive.KEY_ENCAPSULATION));
  
  static final Set<CryptoPrimitive> SIGNATURE_CRYPTO_PRIMITIVES = Collections.unmodifiableSet(EnumSet.of(CryptoPrimitive.SIGNATURE));
  
  static final AlgorithmConstraints DEFAULT_ALGORITHM_CONSTRAINTS = (AlgorithmConstraints)new ExportAlgorithmConstraints((BCAlgorithmConstraints)ProvAlgorithmConstraints.DEFAULT);
  
  static AlgorithmConstraints exportAlgorithmConstraints(BCAlgorithmConstraints paramBCAlgorithmConstraints) {
    return (AlgorithmConstraints)((ProvAlgorithmConstraints.DEFAULT == paramBCAlgorithmConstraints) ? DEFAULT_ALGORITHM_CONSTRAINTS : ((paramBCAlgorithmConstraints == null) ? null : ((paramBCAlgorithmConstraints instanceof ImportAlgorithmConstraints) ? ((ImportAlgorithmConstraints)paramBCAlgorithmConstraints).unwrap() : new ExportAlgorithmConstraints(paramBCAlgorithmConstraints))));
  }
  
  static Object exportAlgorithmConstraintsDynamic(BCAlgorithmConstraints paramBCAlgorithmConstraints) {
    return exportAlgorithmConstraints(paramBCAlgorithmConstraints);
  }
  
  static CryptoPrimitive exportCryptoPrimitive(BCCryptoPrimitive paramBCCryptoPrimitive) {
    switch (null.$SwitchMap$org$bouncycastle$jsse$java$security$BCCryptoPrimitive[paramBCCryptoPrimitive.ordinal()]) {
      case 1:
        return CryptoPrimitive.MESSAGE_DIGEST;
      case 2:
        return CryptoPrimitive.SECURE_RANDOM;
      case 3:
        return CryptoPrimitive.BLOCK_CIPHER;
      case 4:
        return CryptoPrimitive.STREAM_CIPHER;
      case 5:
        return CryptoPrimitive.MAC;
      case 6:
        return CryptoPrimitive.KEY_WRAP;
      case 7:
        return CryptoPrimitive.PUBLIC_KEY_ENCRYPTION;
      case 8:
        return CryptoPrimitive.SIGNATURE;
      case 9:
        return CryptoPrimitive.KEY_ENCAPSULATION;
      case 10:
        return CryptoPrimitive.KEY_AGREEMENT;
    } 
    return null;
  }
  
  static Set<CryptoPrimitive> exportCryptoPrimitives(Set<BCCryptoPrimitive> paramSet) {
    if (SIGNATURE_CRYPTO_PRIMITIVES_BC == paramSet)
      return SIGNATURE_CRYPTO_PRIMITIVES; 
    if (KEY_AGREEMENT_CRYPTO_PRIMITIVES_BC == paramSet)
      return KEY_AGREEMENT_CRYPTO_PRIMITIVES; 
    if (KEY_ENCAPSULATION_CRYPTO_PRIMITIVES_BC == paramSet)
      return KEY_ENCAPSULATION_CRYPTO_PRIMITIVES; 
    HashSet<CryptoPrimitive> hashSet = new HashSet();
    for (BCCryptoPrimitive bCCryptoPrimitive : paramSet)
      hashSet.add(exportCryptoPrimitive(bCCryptoPrimitive)); 
    return hashSet;
  }
  
  static BCAlgorithmConstraints importAlgorithmConstraints(AlgorithmConstraints paramAlgorithmConstraints) {
    return (BCAlgorithmConstraints)((null == paramAlgorithmConstraints) ? null : ((paramAlgorithmConstraints instanceof ExportAlgorithmConstraints) ? ((ExportAlgorithmConstraints)paramAlgorithmConstraints).unwrap() : new ImportAlgorithmConstraints(paramAlgorithmConstraints)));
  }
  
  static BCAlgorithmConstraints importAlgorithmConstraintsDynamic(Object paramObject) {
    return importAlgorithmConstraints((AlgorithmConstraints)paramObject);
  }
  
  static BCCryptoPrimitive importCryptoPrimitive(CryptoPrimitive paramCryptoPrimitive) {
    switch (null.$SwitchMap$java$security$CryptoPrimitive[paramCryptoPrimitive.ordinal()]) {
      case 1:
        return BCCryptoPrimitive.MESSAGE_DIGEST;
      case 2:
        return BCCryptoPrimitive.SECURE_RANDOM;
      case 3:
        return BCCryptoPrimitive.BLOCK_CIPHER;
      case 4:
        return BCCryptoPrimitive.STREAM_CIPHER;
      case 5:
        return BCCryptoPrimitive.MAC;
      case 6:
        return BCCryptoPrimitive.KEY_WRAP;
      case 7:
        return BCCryptoPrimitive.PUBLIC_KEY_ENCRYPTION;
      case 8:
        return BCCryptoPrimitive.SIGNATURE;
      case 9:
        return BCCryptoPrimitive.KEY_ENCAPSULATION;
      case 10:
        return BCCryptoPrimitive.KEY_AGREEMENT;
    } 
    return null;
  }
  
  static Set<BCCryptoPrimitive> importCryptoPrimitives(Set<CryptoPrimitive> paramSet) {
    if (SIGNATURE_CRYPTO_PRIMITIVES == paramSet)
      return SIGNATURE_CRYPTO_PRIMITIVES_BC; 
    if (KEY_AGREEMENT_CRYPTO_PRIMITIVES == paramSet)
      return KEY_AGREEMENT_CRYPTO_PRIMITIVES_BC; 
    if (KEY_ENCAPSULATION_CRYPTO_PRIMITIVES == paramSet)
      return KEY_ENCAPSULATION_CRYPTO_PRIMITIVES_BC; 
    HashSet<BCCryptoPrimitive> hashSet = new HashSet();
    for (CryptoPrimitive cryptoPrimitive : paramSet)
      hashSet.add(importCryptoPrimitive(cryptoPrimitive)); 
    return hashSet;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\JsseUtils_7.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */