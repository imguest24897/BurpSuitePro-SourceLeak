package burp;

import burp.api.montoya.utilities.json.JsonArrayNode;
import burp.api.montoya.utilities.json.JsonNode;
import burp.api.montoya.utilities.json.JsonObjectNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Zl6_ extends Zl6n implements JsonArrayNode {
  private final List<JsonNode> Ze;
  
  private static final String c;
  
  Zl6_(List<JsonNode> paramList) {
    this.Ze = paramList;
  }
  
  public List<JsonNode> getValue() {
    return this.Ze;
  }
  
  public List<JsonNode> asList() {
    return this.Ze;
  }
  
  public void add(JsonNode paramJsonNode) {
    this.Ze.add(paramJsonNode);
  }
  
  public void addString(String paramString) {
    try {
      if (paramString == null)
        throw new NullPointerException(c); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.Ze.add(Zl63.ZK(paramString));
  }
  
  public void addBoolean(boolean paramBoolean) {
    this.Ze.add(Zl60.Zw(paramBoolean));
  }
  
  public void addNumber(long paramLong) {
    this.Ze.add(Zl6p.Zh(Long.valueOf(paramLong)));
  }
  
  public void addNumber(double paramDouble) {
    this.Ze.add(Zl6p.Zh(Double.valueOf(paramDouble)));
  }
  
  public void addNumber(Number paramNumber) {
    this.Ze.add(Zl6p.Zh(paramNumber));
  }
  
  public JsonNode get(int paramInt) {
    return this.Ze.get(paramInt);
  }
  
  public String getString(int paramInt) {
    JsonNode jsonNode = this.Ze.get(paramInt);
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return jsonNode.isString() ? jsonNode.asString() : null;
  }
  
  public Boolean getBoolean(int paramInt) {
    JsonNode jsonNode = this.Ze.get(paramInt);
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return jsonNode.isBoolean() ? jsonNode.asBoolean() : null;
  }
  
  public Long getLong(int paramInt) {
    JsonNode jsonNode = this.Ze.get(paramInt);
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return jsonNode.isNumber() ? jsonNode.asLong() : null;
  }
  
  public Double getDouble(int paramInt) {
    JsonNode jsonNode = this.Ze.get(paramInt);
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return jsonNode.isNumber() ? jsonNode.asDouble() : null;
  }
  
  public Number getNumber(int paramInt) {
    JsonNode jsonNode = this.Ze.get(paramInt);
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return jsonNode.isNumber() ? jsonNode.asNumber() : null;
  }
  
  public void remove(int paramInt) {
    this.Ze.remove(paramInt);
  }
  
  public JsonArrayNode asArray() {
    return this;
  }
  
  Zlre ZI() {
    return Zlre.ARRAY;
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
            Zl6_ zl6_ = (Zl6_)paramObject;
            return Objects.equals(this.Ze, zl6_.Ze);
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
    return Objects.hashCode(this.Ze);
  }
  
  public static JsonArrayNode Zn() {
    return new Zl6_(new ArrayList<>());
  }
  
  public static JsonArrayNode Zr(List<? extends JsonNode> paramList) {
    return new Zl6_(new ArrayList<>(paramList));
  }
  
  public static JsonArrayNode ZM(JsonNode... paramVarArgs) {
    return new Zl6_(new ArrayList<>(List.of(paramVarArgs)));
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
  
  static {
    // Byte code:
    //   0: bipush #33
    //   2: ldc 'T<Seb_6q}Qek'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zl6_.c : Ljava/lang/String;
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
    //   80: bipush #35
    //   82: goto -> 112
    //   85: bipush #124
    //   87: goto -> 112
    //   90: bipush #30
    //   92: goto -> 112
    //   95: bipush #49
    //   97: goto -> 112
    //   100: bipush #38
    //   102: goto -> 112
    //   105: bipush #94
    //   107: goto -> 112
    //   110: bipush #126
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl6_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */