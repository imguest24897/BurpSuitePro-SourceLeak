package net.portswigger.swagger.v3.oas.models.examples;

import burp.Zbqc;
import java.util.LinkedHashMap;
import java.util.Map;
import net.portswigger.swagger.v3.oas.models.annotations.OpenAPI31;

public class Example {
  private String summary = null;
  
  private String description = null;
  
  private Object value = null;
  
  private String externalValue = null;
  
  private String $ref = null;
  
  private Map<String, Object> extensions = null;
  
  private boolean valueSetFlag;
  
  private static boolean Zk;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public String getSummary() {
    return this.summary;
  }
  
  public void setSummary(String paramString) {
    this.summary = paramString;
  }
  
  public Example summary(String paramString) {
    this.summary = paramString;
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public Example description(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public Object getValue() {
    return this.value;
  }
  
  public void setValue(Object paramObject) {
    this.value = paramObject;
    this.valueSetFlag = true;
  }
  
  public Example value(Object paramObject) {
    setValue(paramObject);
    return this;
  }
  
  public String getExternalValue() {
    return this.externalValue;
  }
  
  public void setExternalValue(String paramString) {
    this.externalValue = paramString;
  }
  
  public Example externalValue(String paramString) {
    this.externalValue = paramString;
    return this;
  }
  
  public String get$ref() {
    return this.$ref;
  }
  
  public void set$ref(String paramString) {
    if (paramString != null && paramString.indexOf('.') == -1 && paramString.indexOf('/') == -1)
      paramString = a(5693, 4099) + a(5693, 4099); 
    this.$ref = paramString;
  }
  
  public Example $ref(String paramString) {
    set$ref(paramString);
    return this;
  }
  
  public Map<String, Object> getExtensions() {
    return this.extensions;
  }
  
  public void addExtension(String paramString, Object paramObject) {
    if (paramString == null || paramString.isEmpty() || !paramString.startsWith(a(5695, -2016)))
      return; 
    if (this.extensions == null)
      this.extensions = new LinkedHashMap<>(); 
    this.extensions.put(paramString, paramObject);
  }
  
  @OpenAPI31
  public void addExtension31(String paramString, Object paramObject) {
    if (paramString != null && (paramString.startsWith(a(5685, 23780)) || paramString.startsWith(a(5684, 8057))))
      return; 
    addExtension(paramString, paramObject);
  }
  
  public void setExtensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
  }
  
  public Example extensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
    return this;
  }
  
  public boolean getValueSetFlag() {
    return this.valueSetFlag;
  }
  
  public void setValueSetFlag(boolean paramBoolean) {
    this.valueSetFlag = paramBoolean;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof Example))
      return false; 
    Example example = (Example)paramObject;
    return ((this.summary != null) ? !this.summary.equals(example.summary) : (example.summary != null)) ? false : (((this.description != null) ? !this.description.equals(example.description) : (example.description != null)) ? false : (((this.value != null) ? !this.value.equals(example.value) : (example.value != null)) ? false : (((this.externalValue != null) ? !this.externalValue.equals(example.externalValue) : (example.externalValue != null)) ? false : (((this.$ref != null) ? !this.$ref.equals(example.$ref) : (example.$ref != null)) ? false : ((this.extensions != null) ? this.extensions.equals(example.extensions) : ((example.extensions == null)))))));
  }
  
  public int hashCode() {
    boolean bool = Zh();
    int i = (this.summary != null) ? this.summary.hashCode() : 0;
    i = 31 * i + ((this.description != null) ? this.description.hashCode() : 0);
    i = 31 * i + ((this.value != null) ? this.value.hashCode() : 0);
    i = 31 * i + ((this.externalValue != null) ? this.externalValue.hashCode() : 0);
    i = 31 * i + ((this.$ref != null) ? this.$ref.hashCode() : 0);
    i = 31 * i + ((this.extensions != null) ? this.extensions.hashCode() : 0);
    if (Zbqc.Zwu() == null)
      Z_(!bool); 
    return i;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(5691, -6461));
    stringBuilder.append(a(5690, -25008)).append(toIndentedString(this.summary)).append("\n");
    boolean bool = Zh();
    stringBuilder.append(a(5692, 12666)).append(toIndentedString(this.description)).append("\n");
    stringBuilder.append(a(5688, 24652)).append(toIndentedString(this.value)).append("\n");
    stringBuilder.append(a(5694, 25756)).append(toIndentedString(this.externalValue)).append("\n");
    stringBuilder.append(a(5689, 2431)).append(toIndentedString(this.$ref)).append("\n");
    stringBuilder.append("}");
    if (!bool)
      Zbqc.Zr(new Zbqc[3]); 
    return stringBuilder.toString();
  }
  
  private String toIndentedString(Object paramObject) {
    return (paramObject == null) ? a(5686, -29116) : paramObject.toString().replace("\n", a(5687, 4674));
  }
  
  public static void Z_(boolean paramBoolean) {
    Zk = paramBoolean;
  }
  
  public static boolean Zh() {
    return Zk;
  }
  
  public static boolean ZY() {
    boolean bool = Zh();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_1
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'ògªÅY2SÑ«6ý>Tïñ= YGêï/iu\\f'öÀ¢FèÜôÖª¹µ¯>Ý®mnäc\\nßg¸-PÀ&dÜAå÷ÿ?ê`,c#@©XbrBÿ2ëU9>â\\r!ágýüÝ+ SQk¨29ðtÁ<g«@&'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Z_ : (Z)V
    //   22: bipush #22
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #61
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'x\\fðø7ËÈ'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_5
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #6
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic net/portswigger/swagger/v3/oas/models/examples/Example.a : [Ljava/lang/String;
    //   135: bipush #12
    //   137: anewarray java/lang/String
    //   140: putstatic net/portswigger/swagger/v3/oas/models/examples/Example.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #93
    //   218: goto -> 248
    //   221: bipush #83
    //   223: goto -> 248
    //   226: bipush #118
    //   228: goto -> 248
    //   231: bipush #53
    //   233: goto -> 248
    //   236: bipush #19
    //   238: goto -> 248
    //   241: bipush #15
    //   243: goto -> 248
    //   246: bipush #17
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x163D) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 71;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\oas\models\examples\Example.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */