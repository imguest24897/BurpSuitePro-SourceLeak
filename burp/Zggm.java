package burp;

import burp.api.montoya.utilities.json.JsonNode;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

final class Zggm extends Zgg7 {
  private final String Zo;
  
  private final boolean Zw;
  
  private static final String a;
  
  Zggm(String paramString, boolean paramBoolean) {
    this.Zo = paramString;
    this.Zw = paramBoolean;
  }
  
  Optional<JsonNode> Zj(JsonNode paramJsonNode, Zslp paramZslp) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   4: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   9: invokevirtual filter : (Ljava/util/function/Predicate;)Ljava/util/Optional;
    //   12: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   17: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   20: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   25: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   28: astore_3
    //   29: aload_0
    //   30: getfield Zw : Z
    //   33: ifne -> 51
    //   36: aload_3
    //   37: aload_0
    //   38: <illegal opcode> apply : (Lburp/Zggm;)Ljava/util/function/Function;
    //   43: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   46: areturn
    //   47: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   50: athrow
    //   51: aload_3
    //   52: aload_0
    //   53: aload_2
    //   54: <illegal opcode> apply : (Lburp/Zggm;Lburp/Zslp;)Ljava/util/function/Function;
    //   59: invokevirtual flatMap : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   62: areturn
    // Exception table:
    //   from	to	target	type
    //   29	47	47	java/lang/MatchException
  }
  
  public String Z_() {
    return this.Zo;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject == this)
        return true; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (paramObject != null)
        try {
          if (paramObject.getClass() == getClass()) {
            Zggm zggm = (Zggm)paramObject;
            return Objects.equals(this.Zo, zggm.Zo);
          } 
          return false;
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.Zo });
  }
  
  public String toString() {
    return a + a + this.Zo;
  }
  
  private Optional lambda$findOrApply$6(Zslp paramZslp, Map paramMap) {
    // Byte code:
    //   0: getstatic burp/Zt2d.ZK : [I
    //   3: aload_1
    //   4: invokevirtual ZE : ()Lburp/Zlkj;
    //   7: invokevirtual ordinal : ()I
    //   10: iaload
    //   11: tableswitch default -> 40, 1 -> 54, 2 -> 81, 3 -> 100, 4 -> 127
    //   40: new java/lang/MatchException
    //   43: dup
    //   44: aconst_null
    //   45: aconst_null
    //   46: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   49: athrow
    //   50: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   53: athrow
    //   54: aload_1
    //   55: invokevirtual ZL : ()Ljava/util/Optional;
    //   58: aload_0
    //   59: aload_2
    //   60: <illegal opcode> test : (Lburp/Zggm;Ljava/util/Map;)Ljava/util/function/Predicate;
    //   65: invokevirtual filter : (Ljava/util/function/Predicate;)Ljava/util/Optional;
    //   68: aload_0
    //   69: aload_2
    //   70: <illegal opcode> apply : (Lburp/Zggm;Ljava/util/Map;)Ljava/util/function/Function;
    //   75: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   78: goto -> 143
    //   81: aload_2
    //   82: aload_0
    //   83: invokevirtual Z_ : ()Ljava/lang/String;
    //   86: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   91: checkcast burp/api/montoya/utilities/json/JsonNode
    //   94: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   97: goto -> 143
    //   100: aload_1
    //   101: invokevirtual ZL : ()Ljava/util/Optional;
    //   104: aload_0
    //   105: aload_2
    //   106: <illegal opcode> test : (Lburp/Zggm;Ljava/util/Map;)Ljava/util/function/Predicate;
    //   111: invokevirtual filter : (Ljava/util/function/Predicate;)Ljava/util/Optional;
    //   114: aload_0
    //   115: aload_2
    //   116: <illegal opcode> apply : (Lburp/Zggm;Ljava/util/Map;)Ljava/util/function/Function;
    //   121: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   124: goto -> 143
    //   127: aload_2
    //   128: aload_0
    //   129: invokevirtual Z_ : ()Ljava/lang/String;
    //   132: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   137: checkcast burp/api/montoya/utilities/json/JsonNode
    //   140: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   143: areturn
    // Exception table:
    //   from	to	target	type
    //   0	50	50	java/lang/MatchException
  }
  
  private JsonNode lambda$findOrApply$5(Map<String, JsonNode> paramMap, JsonNode paramJsonNode) {
    return paramMap.put(Z_(), paramJsonNode);
  }
  
  private boolean lambda$findOrApply$4(Map paramMap, JsonNode paramJsonNode) {
    return paramMap.containsKey(Z_());
  }
  
  private JsonNode lambda$findOrApply$3(Map<String, JsonNode> paramMap, JsonNode paramJsonNode) {
    paramMap.put(Z_(), paramJsonNode);
    return paramJsonNode;
  }
  
  private boolean lambda$findOrApply$2(Map paramMap, JsonNode paramJsonNode) {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return !paramMap.containsKey(Z_());
  }
  
  private JsonNode lambda$findOrApply$1(Map paramMap) {
    return (JsonNode)paramMap.get(Z_());
  }
  
  private static Map lambda$findOrApply$0(Object paramObject) {
    return (Map)paramObject;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    // Byte code:
    //   0: bipush #65
    //   2: ldc 'r}u?',T'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zggm.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #120
    //   82: goto -> 112
    //   85: bipush #89
    //   87: goto -> 112
    //   90: bipush #77
    //   92: goto -> 112
    //   95: bipush #37
    //   97: goto -> 112
    //   100: bipush #13
    //   102: goto -> 112
    //   105: bipush #8
    //   107: goto -> 112
    //   110: bipush #108
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zggm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */