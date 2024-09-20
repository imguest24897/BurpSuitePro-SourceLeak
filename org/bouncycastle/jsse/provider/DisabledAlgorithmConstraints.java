package org.bouncycastle.jsse.provider;

import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.interfaces.DSAKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
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
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHKey;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jsse.java.security.BCCryptoPrimitive;

class DisabledAlgorithmConstraints extends AbstractAlgorithmConstraints {
  private static final Logger LOG = Logger.getLogger(DisabledAlgorithmConstraints.class.getName());
  
  private static final String INCLUDE_PREFIX = "include ";
  
  private static final String KEYWORD_KEYSIZE = "keySize";
  
  private final Set<String> disabledAlgorithms;
  
  private final Map<String, List<Constraint>> constraintsMap;
  
  static DisabledAlgorithmConstraints create(AlgorithmDecomposer paramAlgorithmDecomposer, String paramString1, String paramString2) {
    String[] arrayOfString = PropertyUtils.getStringArraySecurityProperty(paramString1, paramString2);
    if (null == arrayOfString)
      return null; 
    HashSet<String> hashSet = new HashSet();
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (!addConstraint(hashSet, (Map)hashMap, arrayOfString[b]))
        LOG.warning("Ignoring unsupported entry in '" + paramString1 + "': " + arrayOfString[b]); 
    } 
    return new DisabledAlgorithmConstraints(paramAlgorithmDecomposer, Collections.unmodifiableSet(hashSet), (Map)Collections.unmodifiableMap(hashMap));
  }
  
  private static boolean addConstraint(Set<String> paramSet, Map<String, List<Constraint>> paramMap, String paramString) {
    if (paramString.regionMatches(true, 0, "include ", 0, "include ".length()))
      return false; 
    int i = paramString.indexOf(' ');
    if (i < 0) {
      String str = getCanonicalAlgorithm(paramString);
      paramSet.add(str);
      addConstraint(paramMap, str, DisabledConstraint.INSTANCE);
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
      addConstraint(paramMap, str1, new KeySizeConstraint(binOp, k));
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
    return checkConstraints(paramSet, (String)null, paramKey, (AlgorithmParameters)null);
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
    if (!permits(paramSet, JsseUtils.getKeyAlgorithm(paramKey), (AlgorithmParameters)null))
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
  
  private enum BinOp {
    EQ("=="),
    GE(">="),
    GT(">"),
    LE("<="),
    LT("<"),
    NE("!=");
    
    private final String s;
    
    static boolean eval(BinOp param1BinOp, int param1Int1, int param1Int2) {
      // Byte code:
      //   0: getstatic org/bouncycastle/jsse/provider/DisabledAlgorithmConstraints$1.$SwitchMap$org$bouncycastle$jsse$provider$DisabledAlgorithmConstraints$BinOp : [I
      //   3: aload_0
      //   4: invokevirtual ordinal : ()I
      //   7: iaload
      //   8: tableswitch default -> 114, 1 -> 48, 2 -> 59, 3 -> 70, 4 -> 81, 5 -> 92, 6 -> 103
      //   48: iload_1
      //   49: iload_2
      //   50: if_icmpne -> 57
      //   53: iconst_1
      //   54: goto -> 58
      //   57: iconst_0
      //   58: ireturn
      //   59: iload_1
      //   60: iload_2
      //   61: if_icmplt -> 68
      //   64: iconst_1
      //   65: goto -> 69
      //   68: iconst_0
      //   69: ireturn
      //   70: iload_1
      //   71: iload_2
      //   72: if_icmple -> 79
      //   75: iconst_1
      //   76: goto -> 80
      //   79: iconst_0
      //   80: ireturn
      //   81: iload_1
      //   82: iload_2
      //   83: if_icmpgt -> 90
      //   86: iconst_1
      //   87: goto -> 91
      //   90: iconst_0
      //   91: ireturn
      //   92: iload_1
      //   93: iload_2
      //   94: if_icmpge -> 101
      //   97: iconst_1
      //   98: goto -> 102
      //   101: iconst_0
      //   102: ireturn
      //   103: iload_1
      //   104: iload_2
      //   105: if_icmpeq -> 112
      //   108: iconst_1
      //   109: goto -> 113
      //   112: iconst_0
      //   113: ireturn
      //   114: iconst_1
      //   115: ireturn
    }
    
    static BinOp parse(String param1String) {
      for (BinOp binOp : values()) {
        if (binOp.s.equals(param1String))
          return binOp; 
      } 
      throw new IllegalArgumentException("'s' is not a valid operator: " + param1String);
    }
    
    BinOp(String param1String1) {
      this.s = param1String1;
    }
  }
  
  private static abstract class Constraint {
    private Constraint() {}
    
    boolean permits(AlgorithmParameters param1AlgorithmParameters) {
      return true;
    }
    
    boolean permits(Key param1Key) {
      return true;
    }
  }
  
  private static class DisabledConstraint extends Constraint {
    static final DisabledConstraint INSTANCE = new DisabledConstraint();
    
    public boolean permits(Key param1Key) {
      return false;
    }
  }
  
  private static class KeySizeConstraint extends Constraint {
    private final DisabledAlgorithmConstraints.BinOp op;
    
    private final int constraint;
    
    private static int getKeySize(AlgorithmParameters param1AlgorithmParameters) {
      String str = param1AlgorithmParameters.getAlgorithm();
      if ("EC".equals(str)) {
        try {
          ECParameterSpec eCParameterSpec = param1AlgorithmParameters.<ECParameterSpec>getParameterSpec(ECParameterSpec.class);
          if (null != eCParameterSpec)
            return eCParameterSpec.getOrder().bitLength(); 
        } catch (InvalidParameterSpecException invalidParameterSpecException) {}
      } else if ("DiffieHellman".equals(str)) {
        try {
          DHParameterSpec dHParameterSpec = param1AlgorithmParameters.<DHParameterSpec>getParameterSpec(DHParameterSpec.class);
          if (null != dHParameterSpec)
            return dHParameterSpec.getP().bitLength(); 
        } catch (InvalidParameterSpecException invalidParameterSpecException) {}
      } 
      return -1;
    }
    
    private static int getKeySize(Key param1Key) {
      if (param1Key instanceof RSAKey) {
        RSAKey rSAKey = (RSAKey)param1Key;
        return rSAKey.getModulus().bitLength();
      } 
      if (param1Key instanceof ECKey) {
        ECKey eCKey = (ECKey)param1Key;
        return eCKey.getParams().getOrder().bitLength();
      } 
      if (param1Key instanceof DSAKey) {
        DSAKey dSAKey = (DSAKey)param1Key;
        DSAParams dSAParams = dSAKey.getParams();
        if (null != dSAParams)
          return dSAParams.getP().bitLength(); 
      } else {
        if (param1Key instanceof DHKey) {
          DHKey dHKey = (DHKey)param1Key;
          return dHKey.getParams().getP().bitLength();
        } 
        if (param1Key instanceof SecretKey) {
          SecretKey secretKey = (SecretKey)param1Key;
          String str = secretKey.getFormat();
          if ("RAW".equals(str)) {
            byte[] arrayOfByte = secretKey.getEncoded();
            if (null != arrayOfByte) {
              int i = arrayOfByte.length;
              return (i > 268435455) ? 0 : (8 * arrayOfByte.length);
            } 
          } 
        } 
      } 
      return -1;
    }
    
    KeySizeConstraint(DisabledAlgorithmConstraints.BinOp param1BinOp, int param1Int) {
      this.op = param1BinOp;
      this.constraint = param1Int;
    }
    
    boolean permits(AlgorithmParameters param1AlgorithmParameters) {
      return checkKeySize(getKeySize(param1AlgorithmParameters));
    }
    
    boolean permits(Key param1Key) {
      return checkKeySize(getKeySize(param1Key));
    }
    
    private boolean checkKeySize(int param1Int) {
      return (param1Int < 1) ? ((param1Int < 0)) : (!DisabledAlgorithmConstraints.BinOp.eval(this.op, param1Int, this.constraint));
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\DisabledAlgorithmConstraints.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */