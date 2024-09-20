package net.portswigger.swagger.v3.oas.models.responses;

import burp.Zbqc;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import net.portswigger.swagger.v3.oas.models.annotations.OpenAPI31;
import net.portswigger.swagger.v3.oas.models.headers.Header;
import net.portswigger.swagger.v3.oas.models.links.Link;
import net.portswigger.swagger.v3.oas.models.media.Content;

public class ApiResponse {
  private String description = null;
  
  private Map<String, Header> headers = null;
  
  private Content content = null;
  
  private Map<String, Link> links = null;
  
  private Map<String, Object> extensions = null;
  
  private String $ref = null;
  
  private static int[] ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public ApiResponse description(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public Map<String, Header> getHeaders() {
    return this.headers;
  }
  
  public void setHeaders(Map<String, Header> paramMap) {
    this.headers = paramMap;
  }
  
  public ApiResponse headers(Map<String, Header> paramMap) {
    this.headers = paramMap;
    return this;
  }
  
  public ApiResponse addHeaderObject(String paramString, Header paramHeader) {
    if (this.headers == null)
      this.headers = new LinkedHashMap<>(); 
    this.headers.put(paramString, paramHeader);
    return this;
  }
  
  public Content getContent() {
    return this.content;
  }
  
  public void setContent(Content paramContent) {
    this.content = paramContent;
  }
  
  public ApiResponse content(Content paramContent) {
    this.content = paramContent;
    return this;
  }
  
  public Map<String, Link> getLinks() {
    return this.links;
  }
  
  public void setLinks(Map<String, Link> paramMap) {
    this.links = paramMap;
  }
  
  public ApiResponse links(Map<String, Link> paramMap) {
    this.links = paramMap;
    return this;
  }
  
  public ApiResponse addLink(String paramString, Link paramLink) {
    if (this.links == null)
      this.links = new LinkedHashMap<>(); 
    this.links.put(paramString, paramLink);
    return this;
  }
  
  public ApiResponse link(String paramString, Link paramLink) {
    return addLink(paramString, paramLink);
  }
  
  public String get$ref() {
    return this.$ref;
  }
  
  public void set$ref(String paramString) {
    if (paramString != null && paramString.indexOf('.') == -1 && paramString.indexOf('/') == -1)
      paramString = a(-20043, -2137) + a(-20043, -2137); 
    this.$ref = paramString;
  }
  
  public ApiResponse $ref(String paramString) {
    set$ref(paramString);
    return this;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    ApiResponse apiResponse = (ApiResponse)paramObject;
    return (Objects.equals(this.description, apiResponse.description) && Objects.equals(this.headers, apiResponse.headers) && Objects.equals(this.content, apiResponse.content) && Objects.equals(this.links, apiResponse.links) && Objects.equals(this.extensions, apiResponse.extensions) && Objects.equals(this.$ref, apiResponse.$ref));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.description, this.headers, this.content, this.links, this.extensions, this.$ref });
  }
  
  public Map<String, Object> getExtensions() {
    return this.extensions;
  }
  
  public void addExtension(String paramString, Object paramObject) {
    if (paramString == null || paramString.isEmpty() || !paramString.startsWith(a(-20041, 20571)))
      return; 
    if (this.extensions == null)
      this.extensions = new LinkedHashMap<>(); 
    this.extensions.put(paramString, paramObject);
  }
  
  @OpenAPI31
  public void addExtension31(String paramString, Object paramObject) {
    if (paramString != null && (paramString.startsWith(a(-20034, -12579)) || paramString.startsWith(a(-20033, 19370))))
      return; 
    addExtension(paramString, paramObject);
  }
  
  public void setExtensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
  }
  
  public ApiResponse extensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
    return this;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(-20045, 14277));
    int[] arrayOfInt = Zz();
    stringBuilder.append(a(-20035, 273)).append(toIndentedString(this.description)).append("\n");
    stringBuilder.append(a(-20037, -29843)).append(toIndentedString(this.headers)).append("\n");
    stringBuilder.append(a(-20042, 28323)).append(toIndentedString(this.content)).append("\n");
    stringBuilder.append(a(-20040, -20204)).append(toIndentedString(this.links)).append("\n");
    stringBuilder.append(a(-20036, -2026)).append(toIndentedString(this.extensions)).append("\n");
    stringBuilder.append(a(-20044, -6103)).append(toIndentedString(this.$ref)).append("\n");
    stringBuilder.append("}");
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[3]); 
    return stringBuilder.toString();
  }
  
  private String toIndentedString(Object paramObject) {
    return (paramObject == null) ? a(-20039, 12582) : paramObject.toString().replace("\n", a(-20038, -22003));
  }
  
  public static void Zd(int[] paramArrayOfint) {
    ZG = paramArrayOfint;
  }
  
  public static int[] Zz() {
    return ZG;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_1
    //   8: newarray int
    //   10: iconst_0
    //   11: istore_3
    //   12: invokestatic Zd : ([I)V
    //   15: ldc '?,YAG£¶Kh·a÷´ÝÅÔõ?R3}~´dúû)±vX>mZðmÑr¼\\rÏºÚ8Í=R4÷k×\ÃÙ4h­ÁÐs6åCÛ)ÊL2,òÁ\\rGAË{(}µÒ°Àêe^^5AðtôdaU}C[öNá4Ä®Å'
    //   17: dup
    //   18: astore_2
    //   19: invokevirtual length : ()I
    //   22: istore #4
    //   24: bipush #6
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #96
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 149
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc 'úè  gæJAYôMbü©»QÏöU­f'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #10
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #111
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic net/portswigger/swagger/v3/oas/models/responses/ApiResponse.a : [Ljava/lang/String;
    //   138: bipush #13
    //   140: anewarray java/lang/String
    //   143: putstatic net/portswigger/swagger/v3/oas/models/responses/ApiResponse.b : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 267
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 249, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 234, 4 -> 239, 5 -> 244
    //   220: bipush #66
    //   222: goto -> 251
    //   225: bipush #17
    //   227: goto -> 251
    //   230: iconst_3
    //   231: goto -> 251
    //   234: bipush #25
    //   236: goto -> 251
    //   239: bipush #35
    //   241: goto -> 251
    //   244: bipush #67
    //   246: goto -> 251
    //   249: bipush #54
    //   251: ixor
    //   252: ixor
    //   253: i2c
    //   254: castore
    //   255: iinc #6, 1
    //   258: dup
    //   259: ifne -> 267
    //   262: dup2
    //   263: dup_x1
    //   264: goto -> 172
    //   267: dup2_x1
    //   268: pop2
    //   269: dup_x2
    //   270: iload #6
    //   272: if_icmpgt -> 168
    //   275: pop
    //   276: new java/lang/String
    //   279: dup_x1
    //   280: swap
    //   281: invokespecial <init> : ([C)V
    //   284: invokevirtual intern : ()Ljava/lang/String;
    //   287: swap
    //   288: pop
    //   289: swap
    //   290: tableswitch default -> 46, 0 -> 105
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB1BF) & 0xFFFF;
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
      byte b1 = 54;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\oas\models\responses\ApiResponse.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */