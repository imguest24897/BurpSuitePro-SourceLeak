package org.bouncycastle.jsse.provider;

import java.security.AlgorithmConstraints;
import java.security.AlgorithmParameters;
import java.security.CryptoPrimitive;
import java.security.Key;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.java.security.BCCryptoPrimitive;

abstract class JsseUtils_7 extends JsseUtils {
  static final Set<CryptoPrimitive> KEY_AGREEMENT_CRYPTO_PRIMITIVES = Collections.unmodifiableSet(EnumSet.of(CryptoPrimitive.KEY_AGREEMENT));
  
  static final Set<CryptoPrimitive> KEY_ENCAPSULATION_CRYPTO_PRIMITIVES = Collections.unmodifiableSet(EnumSet.of(CryptoPrimitive.KEY_ENCAPSULATION));
  
  static final Set<CryptoPrimitive> SIGNATURE_CRYPTO_PRIMITIVES = Collections.unmodifiableSet(EnumSet.of(CryptoPrimitive.SIGNATURE));
  
  static final AlgorithmConstraints DEFAULT_ALGORITHM_CONSTRAINTS = new ExportAlgorithmConstraints(ProvAlgorithmConstraints.DEFAULT);
  
  static AlgorithmConstraints exportAlgorithmConstraints(BCAlgorithmConstraints paramBCAlgorithmConstraints) {
    return (ProvAlgorithmConstraints.DEFAULT == paramBCAlgorithmConstraints) ? DEFAULT_ALGORITHM_CONSTRAINTS : ((paramBCAlgorithmConstraints == null) ? null : ((paramBCAlgorithmConstraints instanceof ImportAlgorithmConstraints) ? ((ImportAlgorithmConstraints)paramBCAlgorithmConstraints).unwrap() : new ExportAlgorithmConstraints(paramBCAlgorithmConstraints)));
  }
  
  static Object exportAlgorithmConstraintsDynamic(BCAlgorithmConstraints paramBCAlgorithmConstraints) {
    return exportAlgorithmConstraints(paramBCAlgorithmConstraints);
  }
  
  static CryptoPrimitive exportCryptoPrimitive(BCCryptoPrimitive paramBCCryptoPrimitive) {
    switch (paramBCCryptoPrimitive) {
      case MESSAGE_DIGEST:
        return CryptoPrimitive.MESSAGE_DIGEST;
      case SECURE_RANDOM:
        return CryptoPrimitive.SECURE_RANDOM;
      case BLOCK_CIPHER:
        return CryptoPrimitive.BLOCK_CIPHER;
      case STREAM_CIPHER:
        return CryptoPrimitive.STREAM_CIPHER;
      case MAC:
        return CryptoPrimitive.MAC;
      case KEY_WRAP:
        return CryptoPrimitive.KEY_WRAP;
      case PUBLIC_KEY_ENCRYPTION:
        return CryptoPrimitive.PUBLIC_KEY_ENCRYPTION;
      case SIGNATURE:
        return CryptoPrimitive.SIGNATURE;
      case KEY_ENCAPSULATION:
        return CryptoPrimitive.KEY_ENCAPSULATION;
      case KEY_AGREEMENT:
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
    return (null == paramAlgorithmConstraints) ? null : ((paramAlgorithmConstraints instanceof ExportAlgorithmConstraints) ? ((ExportAlgorithmConstraints)paramAlgorithmConstraints).unwrap() : new ImportAlgorithmConstraints(paramAlgorithmConstraints));
  }
  
  static BCAlgorithmConstraints importAlgorithmConstraintsDynamic(Object paramObject) {
    return importAlgorithmConstraints((AlgorithmConstraints)paramObject);
  }
  
  static BCCryptoPrimitive importCryptoPrimitive(CryptoPrimitive paramCryptoPrimitive) {
    switch (paramCryptoPrimitive) {
      case MESSAGE_DIGEST:
        return BCCryptoPrimitive.MESSAGE_DIGEST;
      case SECURE_RANDOM:
        return BCCryptoPrimitive.SECURE_RANDOM;
      case BLOCK_CIPHER:
        return BCCryptoPrimitive.BLOCK_CIPHER;
      case STREAM_CIPHER:
        return BCCryptoPrimitive.STREAM_CIPHER;
      case MAC:
        return BCCryptoPrimitive.MAC;
      case KEY_WRAP:
        return BCCryptoPrimitive.KEY_WRAP;
      case PUBLIC_KEY_ENCRYPTION:
        return BCCryptoPrimitive.PUBLIC_KEY_ENCRYPTION;
      case SIGNATURE:
        return BCCryptoPrimitive.SIGNATURE;
      case KEY_ENCAPSULATION:
        return BCCryptoPrimitive.KEY_ENCAPSULATION;
      case KEY_AGREEMENT:
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
  
  static class ExportAlgorithmConstraints implements AlgorithmConstraints {
    private final BCAlgorithmConstraints constraints;
    
    ExportAlgorithmConstraints(BCAlgorithmConstraints param1BCAlgorithmConstraints) {
      this.constraints = param1BCAlgorithmConstraints;
    }
    
    public boolean permits(Set<CryptoPrimitive> param1Set, Key param1Key) {
      return this.constraints.permits(JsseUtils_7.importCryptoPrimitives(param1Set), param1Key);
    }
    
    public boolean permits(Set<CryptoPrimitive> param1Set, String param1String, AlgorithmParameters param1AlgorithmParameters) {
      return this.constraints.permits(JsseUtils_7.importCryptoPrimitives(param1Set), param1String, param1AlgorithmParameters);
    }
    
    public boolean permits(Set<CryptoPrimitive> param1Set, String param1String, Key param1Key, AlgorithmParameters param1AlgorithmParameters) {
      return this.constraints.permits(JsseUtils_7.importCryptoPrimitives(param1Set), param1String, param1Key, param1AlgorithmParameters);
    }
    
    BCAlgorithmConstraints unwrap() {
      return this.constraints;
    }
  }
  
  static class ImportAlgorithmConstraints implements BCAlgorithmConstraints {
    private final AlgorithmConstraints constraints;
    
    ImportAlgorithmConstraints(AlgorithmConstraints param1AlgorithmConstraints) {
      this.constraints = param1AlgorithmConstraints;
    }
    
    public boolean permits(Set<BCCryptoPrimitive> param1Set, Key param1Key) {
      return this.constraints.permits(JsseUtils_7.exportCryptoPrimitives(param1Set), param1Key);
    }
    
    public boolean permits(Set<BCCryptoPrimitive> param1Set, String param1String, AlgorithmParameters param1AlgorithmParameters) {
      return this.constraints.permits(JsseUtils_7.exportCryptoPrimitives(param1Set), param1String, param1AlgorithmParameters);
    }
    
    public boolean permits(Set<BCCryptoPrimitive> param1Set, String param1String, Key param1Key, AlgorithmParameters param1AlgorithmParameters) {
      return this.constraints.permits(JsseUtils_7.exportCryptoPrimitives(param1Set), param1String, param1Key, param1AlgorithmParameters);
    }
    
    AlgorithmConstraints unwrap() {
      return this.constraints;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\JsseUtils_7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */