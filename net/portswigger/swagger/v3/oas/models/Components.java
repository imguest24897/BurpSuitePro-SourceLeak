package net.portswigger.swagger.v3.oas.models;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import net.portswigger.swagger.v3.oas.models.annotations.OpenAPI31;
import net.portswigger.swagger.v3.oas.models.callbacks.Callback;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.oas.models.headers.Header;
import net.portswigger.swagger.v3.oas.models.links.Link;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.oas.models.parameters.RequestBody;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponse;
import net.portswigger.swagger.v3.oas.models.security.SecurityScheme;

public class Components {
  public static final String COMPONENTS_SCHEMAS_REF;
  
  private Map<String, Schema> schemas = null;
  
  private Map<String, ApiResponse> responses = null;
  
  private Map<String, Parameter> parameters = null;
  
  private Map<String, Example> examples = null;
  
  private Map<String, RequestBody> requestBodies = null;
  
  private Map<String, Header> headers = null;
  
  private Map<String, SecurityScheme> securitySchemes = null;
  
  private Map<String, Link> links = null;
  
  private Map<String, Callback> callbacks = null;
  
  private Map<String, Object> extensions = null;
  
  @OpenAPI31
  private Map<String, PathItem> pathItems;
  
  private static String Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Map<String, Schema> getSchemas() {
    return this.schemas;
  }
  
  public void setSchemas(Map<String, Schema> paramMap) {
    this.schemas = paramMap;
  }
  
  public Components schemas(Map<String, Schema> paramMap) {
    this.schemas = paramMap;
    return this;
  }
  
  public Components addSchemas(String paramString, Schema paramSchema) {
    if (this.schemas == null)
      this.schemas = new LinkedHashMap<>(); 
    this.schemas.put(paramString, paramSchema);
    return this;
  }
  
  public Map<String, ApiResponse> getResponses() {
    return this.responses;
  }
  
  public void setResponses(Map<String, ApiResponse> paramMap) {
    this.responses = paramMap;
  }
  
  public Components responses(Map<String, ApiResponse> paramMap) {
    this.responses = paramMap;
    return this;
  }
  
  public Components addResponses(String paramString, ApiResponse paramApiResponse) {
    if (this.responses == null)
      this.responses = new LinkedHashMap<>(); 
    this.responses.put(paramString, paramApiResponse);
    return this;
  }
  
  public Map<String, Parameter> getParameters() {
    return this.parameters;
  }
  
  public void setParameters(Map<String, Parameter> paramMap) {
    this.parameters = paramMap;
  }
  
  public Components parameters(Map<String, Parameter> paramMap) {
    this.parameters = paramMap;
    return this;
  }
  
  public Components addParameters(String paramString, Parameter paramParameter) {
    if (this.parameters == null)
      this.parameters = new LinkedHashMap<>(); 
    this.parameters.put(paramString, paramParameter);
    return this;
  }
  
  public Map<String, Example> getExamples() {
    return this.examples;
  }
  
  public void setExamples(Map<String, Example> paramMap) {
    this.examples = paramMap;
  }
  
  public Components examples(Map<String, Example> paramMap) {
    this.examples = paramMap;
    return this;
  }
  
  public Components addExamples(String paramString, Example paramExample) {
    if (this.examples == null)
      this.examples = new LinkedHashMap<>(); 
    this.examples.put(paramString, paramExample);
    return this;
  }
  
  public Map<String, RequestBody> getRequestBodies() {
    return this.requestBodies;
  }
  
  public void setRequestBodies(Map<String, RequestBody> paramMap) {
    this.requestBodies = paramMap;
  }
  
  public Components requestBodies(Map<String, RequestBody> paramMap) {
    this.requestBodies = paramMap;
    return this;
  }
  
  public Components addRequestBodies(String paramString, RequestBody paramRequestBody) {
    if (this.requestBodies == null)
      this.requestBodies = new LinkedHashMap<>(); 
    this.requestBodies.put(paramString, paramRequestBody);
    return this;
  }
  
  public Map<String, Header> getHeaders() {
    return this.headers;
  }
  
  public void setHeaders(Map<String, Header> paramMap) {
    this.headers = paramMap;
  }
  
  public Components headers(Map<String, Header> paramMap) {
    this.headers = paramMap;
    return this;
  }
  
  public Components addHeaders(String paramString, Header paramHeader) {
    if (this.headers == null)
      this.headers = new LinkedHashMap<>(); 
    this.headers.put(paramString, paramHeader);
    return this;
  }
  
  public Map<String, SecurityScheme> getSecuritySchemes() {
    return this.securitySchemes;
  }
  
  public void setSecuritySchemes(Map<String, SecurityScheme> paramMap) {
    this.securitySchemes = paramMap;
  }
  
  public Components securitySchemes(Map<String, SecurityScheme> paramMap) {
    this.securitySchemes = paramMap;
    return this;
  }
  
  public Components addSecuritySchemes(String paramString, SecurityScheme paramSecurityScheme) {
    if (this.securitySchemes == null)
      this.securitySchemes = new LinkedHashMap<>(); 
    this.securitySchemes.put(paramString, paramSecurityScheme);
    return this;
  }
  
  public Map<String, Link> getLinks() {
    return this.links;
  }
  
  public void setLinks(Map<String, Link> paramMap) {
    this.links = paramMap;
  }
  
  public Components links(Map<String, Link> paramMap) {
    this.links = paramMap;
    return this;
  }
  
  public Components addLinks(String paramString, Link paramLink) {
    if (this.links == null)
      this.links = new LinkedHashMap<>(); 
    this.links.put(paramString, paramLink);
    return this;
  }
  
  public Map<String, Callback> getCallbacks() {
    return this.callbacks;
  }
  
  public void setCallbacks(Map<String, Callback> paramMap) {
    this.callbacks = paramMap;
  }
  
  public Components callbacks(Map<String, Callback> paramMap) {
    this.callbacks = paramMap;
    return this;
  }
  
  public Components addCallbacks(String paramString, Callback paramCallback) {
    if (this.callbacks == null)
      this.callbacks = new LinkedHashMap<>(); 
    this.callbacks.put(paramString, paramCallback);
    return this;
  }
  
  @OpenAPI31
  public Map<String, PathItem> getPathItems() {
    return this.pathItems;
  }
  
  @OpenAPI31
  public void setPathItems(Map<String, PathItem> paramMap) {
    this.pathItems = paramMap;
  }
  
  @OpenAPI31
  public Components pathItems(Map<String, PathItem> paramMap) {
    this.pathItems = paramMap;
    return this;
  }
  
  @OpenAPI31
  public Components addPathItem(String paramString, PathItem paramPathItem) {
    if (this.pathItems == null)
      this.pathItems = new LinkedHashMap<>(); 
    this.pathItems.put(paramString, paramPathItem);
    return this;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Components components = (Components)paramObject;
    return (Objects.equals(this.schemas, components.schemas) && Objects.equals(this.responses, components.responses) && Objects.equals(this.parameters, components.parameters) && Objects.equals(this.examples, components.examples) && Objects.equals(this.requestBodies, components.requestBodies) && Objects.equals(this.headers, components.headers) && Objects.equals(this.securitySchemes, components.securitySchemes) && Objects.equals(this.links, components.links) && Objects.equals(this.callbacks, components.callbacks) && Objects.equals(this.extensions, components.extensions) && Objects.equals(this.pathItems, components.pathItems));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { 
          this.schemas, this.responses, this.parameters, this.examples, this.requestBodies, this.headers, this.securitySchemes, this.links, this.callbacks, this.extensions, 
          this.pathItems });
  }
  
  public Map<String, Object> getExtensions() {
    return this.extensions;
  }
  
  public void addExtension(String paramString, Object paramObject) {
    if (paramString == null || paramString.isEmpty() || !paramString.startsWith(a(-18156, 27007)))
      return; 
    if (this.extensions == null)
      this.extensions = new LinkedHashMap<>(); 
    this.extensions.put(paramString, paramObject);
  }
  
  @OpenAPI31
  public void addExtension31(String paramString, Object paramObject) {
    if (paramString != null && (paramString.startsWith(a(-18145, 16003)) || paramString.startsWith(a(-18150, 2712))))
      return; 
    addExtension(paramString, paramObject);
  }
  
  public void setExtensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
  }
  
  public Components extensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
    return this;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(-18170, 21933));
    stringBuilder.append(a(-18147, -10348)).append(toIndentedString(this.schemas)).append("\n");
    stringBuilder.append(a(-18153, 22009)).append(toIndentedString(this.responses)).append("\n");
    stringBuilder.append(a(-18155, 6371)).append(toIndentedString(this.parameters)).append("\n");
    stringBuilder.append(a(-18151, 8912)).append(toIndentedString(this.examples)).append("\n");
    stringBuilder.append(a(-18154, 25120)).append(toIndentedString(this.requestBodies)).append("\n");
    stringBuilder.append(a(-18160, 16716)).append(toIndentedString(this.headers)).append("\n");
    stringBuilder.append(a(-18157, 31895)).append(toIndentedString(this.securitySchemes)).append("\n");
    stringBuilder.append(a(-18146, 19570)).append(toIndentedString(this.links)).append("\n");
    stringBuilder.append(a(-18152, -16542)).append(toIndentedString(this.callbacks)).append("\n");
    stringBuilder.append(a(-18148, 703)).append(toIndentedString(this.pathItems)).append("\n");
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  private String toIndentedString(Object paramObject) {
    return (paramObject == null) ? a(-18149, 7874) : paramObject.toString().replace("\n", a(-18158, -8815));
  }
  
  public static void Zi(String paramString) {
    Zr = paramString;
  }
  
  public static String ZC() {
    return Zr;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'MPtEÝc^zúÚ®çÕ0%}jDÊ­Tuß¬Ì¥fÆ{þ³1õ±ñÝT¦Dño·.q²(ÑLWJÚ7¨<EE\\rWñ\\ruì:üz/$¾[ê"ð((6³xÆ2¦\\rÉsÆs­1XJÌñ½Ý(©øëà«Ç¯ú\\t,U\t\\rÑðÅl\\f©$0àÃ&ÿDá´ÆW¡üF;îÔ>¥¼Rî¦"'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: aconst_null
    //   19: bipush #19
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic Zi : (Ljava/lang/String;)V
    //   27: bipush #30
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 159
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
    //   72: ldc ',¢¹åV@qlö#l7£eúöACe"¨áRâöó<­'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #14
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #57
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 159
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic net/portswigger/swagger/v3/oas/models/Components.a : [Ljava/lang/String;
    //   136: bipush #17
    //   138: anewarray java/lang/String
    //   141: putstatic net/portswigger/swagger/v3/oas/models/Components.b : [Ljava/lang/String;
    //   144: sipush #-18159
    //   147: sipush #15619
    //   150: invokestatic a : (II)Ljava/lang/String;
    //   153: putstatic net/portswigger/swagger/v3/oas/models/Components.COMPONENTS_SCHEMAS_REF : Ljava/lang/String;
    //   156: goto -> 316
    //   159: dup_x2
    //   160: pop
    //   161: invokevirtual toCharArray : ()[C
    //   164: dup_x1
    //   165: arraylength
    //   166: dup_x2
    //   167: pop
    //   168: iconst_0
    //   169: istore #6
    //   171: dup2_x1
    //   172: pop2
    //   173: dup_x2
    //   174: iconst_1
    //   175: if_icmpgt -> 276
    //   178: dup2
    //   179: swap
    //   180: iload #6
    //   182: dup2_x1
    //   183: caload
    //   184: swap
    //   185: iload #6
    //   187: bipush #7
    //   189: irem
    //   190: tableswitch default -> 258, 0 -> 228, 1 -> 233, 2 -> 238, 3 -> 243, 4 -> 248, 5 -> 253
    //   228: bipush #112
    //   230: goto -> 260
    //   233: bipush #44
    //   235: goto -> 260
    //   238: bipush #40
    //   240: goto -> 260
    //   243: bipush #46
    //   245: goto -> 260
    //   248: bipush #59
    //   250: goto -> 260
    //   253: bipush #123
    //   255: goto -> 260
    //   258: bipush #106
    //   260: ixor
    //   261: ixor
    //   262: i2c
    //   263: castore
    //   264: iinc #6, 1
    //   267: dup
    //   268: ifne -> 276
    //   271: dup2
    //   272: dup_x1
    //   273: goto -> 182
    //   276: dup2_x1
    //   277: pop2
    //   278: dup_x2
    //   279: iload #6
    //   281: if_icmpgt -> 178
    //   284: pop
    //   285: new java/lang/String
    //   288: dup_x1
    //   289: swap
    //   290: invokespecial <init> : ([C)V
    //   293: invokevirtual intern : ()Ljava/lang/String;
    //   296: swap
    //   297: pop
    //   298: swap
    //   299: tableswitch default -> 44, 0 -> 103
    //   316: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB916) & 0xFFFF;
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
      char c = 'ì';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\oas\models\Components.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */