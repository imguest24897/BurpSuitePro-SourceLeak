package burp;

import burp.api.montoya.utilities.json.JsonArrayNode;
import burp.api.montoya.utilities.json.JsonNode;
import burp.api.montoya.utilities.json.JsonObjectNode;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Zl6s extends Zl6n implements JsonObjectNode {
  private final Map<String, JsonNode> ZI;
  
  private static final String c;
  
  Zl6s(Map<String, JsonNode> paramMap) {
    this.ZI = paramMap;
  }
  
  public Map<String, JsonNode> getValue() {
    return this.ZI;
  }
  
  public Map<String, JsonNode> asMap() {
    return this.ZI;
  }
  
  public void put(String paramString, JsonNode paramJsonNode) {
    this.ZI.put(paramString, paramJsonNode);
  }
  
  public void putString(String paramString1, String paramString2) {
    try {
      if (paramString2 == null)
        throw new NullPointerException(c); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.ZI.put(paramString1, Zl63.ZK(paramString2));
  }
  
  public void putBoolean(String paramString, boolean paramBoolean) {
    this.ZI.put(paramString, Zl60.Zw(paramBoolean));
  }
  
  public void putNumber(String paramString, long paramLong) {
    this.ZI.put(paramString, Zl6p.Zh(Long.valueOf(paramLong)));
  }
  
  public void putNumber(String paramString, double paramDouble) {
    this.ZI.put(paramString, Zl6p.Zh(Double.valueOf(paramDouble)));
  }
  
  public void putNumber(String paramString, Number paramNumber) {
    this.ZI.put(paramString, Zl6p.Zh(paramNumber));
  }
  
  public JsonNode get(String paramString) {
    return this.ZI.get(paramString);
  }
  
  public String getString(String paramString) {
    JsonNode jsonNode = this.ZI.get(paramString);
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return jsonNode.isString() ? jsonNode.asString() : null;
  }
  
  public Boolean getBoolean(String paramString) {
    JsonNode jsonNode = this.ZI.get(paramString);
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return jsonNode.isBoolean() ? jsonNode.asBoolean() : null;
  }
  
  public Long getLong(String paramString) {
    JsonNode jsonNode = this.ZI.get(paramString);
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return jsonNode.isNumber() ? jsonNode.asLong() : null;
  }
  
  public Double getDouble(String paramString) {
    JsonNode jsonNode = this.ZI.get(paramString);
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return jsonNode.isNumber() ? jsonNode.asDouble() : null;
  }
  
  public Number getNumber(String paramString) {
    JsonNode jsonNode = this.ZI.get(paramString);
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return jsonNode.isNumber() ? jsonNode.asNumber() : null;
  }
  
  public void remove(String paramString) {
    this.ZI.remove(paramString);
  }
  
  public boolean has(String paramString) {
    return this.ZI.containsKey(paramString);
  }
  
  public boolean hasString(String paramString) {
    try {
      if (this.ZI.containsKey(paramString))
        try {
          if (((JsonNode)this.ZI.get(paramString)).isString());
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean hasBoolean(String paramString) {
    try {
      if (this.ZI.containsKey(paramString))
        try {
          if (((JsonNode)this.ZI.get(paramString)).isBoolean());
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean hasNumber(String paramString) {
    try {
      if (this.ZI.containsKey(paramString))
        try {
          if (((JsonNode)this.ZI.get(paramString)).isNumber());
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean hasArray(String paramString) {
    try {
      if (this.ZI.containsKey(paramString))
        try {
          if (((JsonNode)this.ZI.get(paramString)).isArray());
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean hasObject(String paramString) {
    try {
      if (this.ZI.containsKey(paramString))
        try {
          if (((JsonNode)this.ZI.get(paramString)).isObject());
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public JsonObjectNode asObject() {
    return this;
  }
  
  Zlre ZI() {
    return Zlre.OBJECT;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (paramObject != null)
        try {
          if (getClass() == paramObject.getClass()) {
            Zl6s zl6s = (Zl6s)paramObject;
            return Objects.equals(this.ZI, zl6s.ZI);
          } 
          return false;
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return Objects.hashCode(this.ZI);
  }
  
  public static JsonObjectNode ZH() {
    return new Zl6s(new HashMap<>());
  }
  
  public static JsonObjectNode ZU(Map<String, ? extends JsonNode> paramMap) {
    return new Zl6s(new LinkedHashMap<>(paramMap));
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
  
  static {
    // Byte code:
    //   0: iconst_1
    //   1: ldc 's)sx?fVhqxs'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zl6s.c : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #36
    //   82: goto -> 112
    //   85: bipush #73
    //   87: goto -> 112
    //   90: bipush #30
    //   92: goto -> 112
    //   95: bipush #12
    //   97: goto -> 112
    //   100: bipush #125
    //   102: goto -> 112
    //   105: bipush #30
    //   107: goto -> 112
    //   110: bipush #14
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
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
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl6s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */