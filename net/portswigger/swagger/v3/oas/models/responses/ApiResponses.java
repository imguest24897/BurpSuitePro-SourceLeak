package net.portswigger.swagger.v3.oas.models.responses;

import burp.Zbqc;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import net.portswigger.swagger.v3.oas.models.annotations.OpenAPI31;

public class ApiResponses extends LinkedHashMap<String, ApiResponse> {
  public static final String DEFAULT;
  
  private Map<String, Object> extensions = null;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public ApiResponses addApiResponse(String paramString, ApiResponse paramApiResponse) {
    put(paramString, paramApiResponse);
    return this;
  }
  
  @Deprecated
  public ApiResponse getDefault() {
    return get(a(11301, -22048));
  }
  
  @Deprecated
  public void setDefault(ApiResponse paramApiResponse) {
    addApiResponse(a(11307, 22069), paramApiResponse);
  }
  
  @Deprecated
  public ApiResponses _default(ApiResponse paramApiResponse) {
    setDefault(paramApiResponse);
    return this;
  }
  
  public Map<String, Object> getExtensions() {
    return this.extensions;
  }
  
  public void addExtension(String paramString, Object paramObject) {
    if (paramString == null || paramString.isEmpty() || !paramString.startsWith(a(11303, -6139)))
      return; 
    if (this.extensions == null)
      this.extensions = new LinkedHashMap<>(); 
    this.extensions.put(paramString, paramObject);
  }
  
  @OpenAPI31
  public void addExtension31(String paramString, Object paramObject) {
    if (paramString != null && (paramString.startsWith(a(11311, 26948)) || paramString.startsWith(a(11308, 6092))))
      return; 
    addExtension(paramString, paramObject);
  }
  
  public void setExtensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
  }
  
  public ApiResponses extensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
    return this;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    if (!super.equals(paramObject))
      return false; 
    ApiResponses apiResponses = (ApiResponses)paramObject;
    return Objects.equals(this.extensions, apiResponses.extensions);
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.extensions });
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(11305, 20233));
    stringBuilder.append(a(11302, -7265)).append(toIndentedString(super.toString())).append("\n");
    stringBuilder.append(a(11309, -18664)).append(toIndentedString(this.extensions)).append("\n");
    int[] arrayOfInt = ApiResponse.Zz();
    stringBuilder.append("}");
    if (Zbqc.Zwu() == null)
      ApiResponse.Zd(new int[1]); 
    return stringBuilder.toString();
  }
  
  private String toIndentedString(Object paramObject) {
    return (paramObject == null) ? a(11306, 11911) : paramObject.toString().replace("\n", a(11304, -25719));
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ê¯jÔzJý¡Z¥,©]gÄ í0ÓÎàÚ8U@)õm\\b#õdeH®[\\t.{=â3\\bmÉ)\\nÈç6* n}csµ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #30
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 154
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc '}¦ñi9dóSÔ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #13
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 154
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic net/portswigger/swagger/v3/oas/models/responses/ApiResponses.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/swagger/v3/oas/models/responses/ApiResponses.b : [Ljava/lang/String;
    //   139: sipush #11310
    //   142: sipush #-27409
    //   145: invokestatic a : (II)Ljava/lang/String;
    //   148: putstatic net/portswigger/swagger/v3/oas/models/responses/ApiResponses.DEFAULT : Ljava/lang/String;
    //   151: goto -> 312
    //   154: dup_x2
    //   155: pop
    //   156: invokevirtual toCharArray : ()[C
    //   159: dup_x1
    //   160: arraylength
    //   161: dup_x2
    //   162: pop
    //   163: iconst_0
    //   164: istore #6
    //   166: dup2_x1
    //   167: pop2
    //   168: dup_x2
    //   169: iconst_1
    //   170: if_icmpgt -> 272
    //   173: dup2
    //   174: swap
    //   175: iload #6
    //   177: dup2_x1
    //   178: caload
    //   179: swap
    //   180: iload #6
    //   182: bipush #7
    //   184: irem
    //   185: tableswitch default -> 254, 0 -> 224, 1 -> 229, 2 -> 234, 3 -> 239, 4 -> 244, 5 -> 249
    //   224: bipush #53
    //   226: goto -> 256
    //   229: bipush #34
    //   231: goto -> 256
    //   234: bipush #80
    //   236: goto -> 256
    //   239: bipush #81
    //   241: goto -> 256
    //   244: bipush #17
    //   246: goto -> 256
    //   249: bipush #71
    //   251: goto -> 256
    //   254: bipush #55
    //   256: ixor
    //   257: ixor
    //   258: i2c
    //   259: castore
    //   260: iinc #6, 1
    //   263: dup
    //   264: ifne -> 272
    //   267: dup2
    //   268: dup_x1
    //   269: goto -> 177
    //   272: dup2_x1
    //   273: pop2
    //   274: dup_x2
    //   275: iload #6
    //   277: if_icmpgt -> 173
    //   280: pop
    //   281: new java/lang/String
    //   284: dup_x1
    //   285: swap
    //   286: invokespecial <init> : ([C)V
    //   289: invokevirtual intern : ()Ljava/lang/String;
    //   292: swap
    //   293: pop
    //   294: swap
    //   295: tableswitch default -> 40, 0 -> 98
    //   312: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2C2F) & 0xFFFF;
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
      byte b1 = 98;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\oas\models\responses\ApiResponses.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */