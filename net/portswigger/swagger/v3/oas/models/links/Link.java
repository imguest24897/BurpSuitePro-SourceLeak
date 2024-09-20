package net.portswigger.swagger.v3.oas.models.links;

import burp.Zbqc;
import java.util.LinkedHashMap;
import java.util.Map;
import net.portswigger.swagger.v3.oas.models.annotations.OpenAPI31;
import net.portswigger.swagger.v3.oas.models.headers.Header;
import net.portswigger.swagger.v3.oas.models.servers.Server;

public class Link {
  private String operationRef = null;
  
  private String operationId = null;
  
  private Map<String, String> parameters = null;
  
  private Object requestBody = null;
  
  @Deprecated
  private Map<String, Header> headers = null;
  
  private String description = null;
  
  private String $ref = null;
  
  private Map<String, Object> extensions = null;
  
  private Server server;
  
  private static String Zn;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Server getServer() {
    return this.server;
  }
  
  public void setServer(Server paramServer) {
    this.server = paramServer;
  }
  
  public Link server(Server paramServer) {
    setServer(paramServer);
    return this;
  }
  
  public String getOperationRef() {
    return this.operationRef;
  }
  
  public void setOperationRef(String paramString) {
    this.operationRef = paramString;
  }
  
  public Link operationRef(String paramString) {
    this.operationRef = paramString;
    return this;
  }
  
  public Object getRequestBody() {
    return this.requestBody;
  }
  
  public void setRequestBody(Object paramObject) {
    this.requestBody = paramObject;
  }
  
  public Link requestBody(Object paramObject) {
    this.requestBody = paramObject;
    return this;
  }
  
  public String getOperationId() {
    return this.operationId;
  }
  
  public void setOperationId(String paramString) {
    this.operationId = paramString;
  }
  
  public Link operationId(String paramString) {
    this.operationId = paramString;
    return this;
  }
  
  public Map<String, String> getParameters() {
    return this.parameters;
  }
  
  public void setParameters(Map<String, String> paramMap) {
    this.parameters = paramMap;
  }
  
  @Deprecated
  public Link parameters(String paramString1, String paramString2) {
    return addParameter(paramString1, paramString2);
  }
  
  public Link addParameter(String paramString1, String paramString2) {
    if (this.parameters == null)
      this.parameters = new LinkedHashMap<>(); 
    this.parameters.put(paramString1, paramString2);
    return this;
  }
  
  @Deprecated
  public Map<String, Header> getHeaders() {
    return this.headers;
  }
  
  @Deprecated
  public void setHeaders(Map<String, Header> paramMap) {
    this.headers = paramMap;
  }
  
  @Deprecated
  public Link headers(Map<String, Header> paramMap) {
    this.headers = paramMap;
    return this;
  }
  
  @Deprecated
  public Link addHeaderObject(String paramString, Header paramHeader) {
    if (this.headers == null)
      this.headers = new LinkedHashMap<>(); 
    this.headers.put(paramString, paramHeader);
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public Link description(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof Link))
      return false; 
    Link link = (Link)paramObject;
    return ((this.operationRef != null) ? !this.operationRef.equals(link.operationRef) : (link.operationRef != null)) ? false : (((this.operationId != null) ? !this.operationId.equals(link.operationId) : (link.operationId != null)) ? false : (((this.parameters != null) ? !this.parameters.equals(link.parameters) : (link.parameters != null)) ? false : (((this.requestBody != null) ? !this.requestBody.equals(link.requestBody) : (link.requestBody != null)) ? false : (((this.headers != null) ? !this.headers.equals(link.headers) : (link.headers != null)) ? false : (((this.description != null) ? !this.description.equals(link.description) : (link.description != null)) ? false : (((this.$ref != null) ? !this.$ref.equals(link.$ref) : (link.$ref != null)) ? false : (((this.extensions != null) ? !this.extensions.equals(link.extensions) : (link.extensions != null)) ? false : ((this.server != null) ? this.server.equals(link.server) : ((link.server == null))))))))));
  }
  
  public int hashCode() {
    String str = Zd();
    int i = (this.operationRef != null) ? this.operationRef.hashCode() : 0;
    i = 31 * i + ((this.operationId != null) ? this.operationId.hashCode() : 0);
    i = 31 * i + ((this.parameters != null) ? this.parameters.hashCode() : 0);
    i = 31 * i + ((this.requestBody != null) ? this.requestBody.hashCode() : 0);
    i = 31 * i + ((this.headers != null) ? this.headers.hashCode() : 0);
    i = 31 * i + ((this.description != null) ? this.description.hashCode() : 0);
    i = 31 * i + ((this.$ref != null) ? this.$ref.hashCode() : 0);
    i = 31 * i + ((this.extensions != null) ? this.extensions.hashCode() : 0);
    i = 31 * i + ((this.server != null) ? this.server.hashCode() : 0);
    if (str == null)
      Zbqc.Zr(new Zbqc[5]); 
    return i;
  }
  
  public String get$ref() {
    return this.$ref;
  }
  
  public void set$ref(String paramString) {
    if (paramString != null && paramString.indexOf('.') == -1 && paramString.indexOf('/') == -1)
      paramString = a(18961, -10325) + a(18961, -10325); 
    this.$ref = paramString;
  }
  
  public Link $ref(String paramString) {
    set$ref(paramString);
    return this;
  }
  
  public Map<String, Object> getExtensions() {
    return this.extensions;
  }
  
  public void addExtension(String paramString, Object paramObject) {
    if (paramString == null || paramString.isEmpty() || !paramString.startsWith(a(18967, -18639)))
      return; 
    if (this.extensions == null)
      this.extensions = new LinkedHashMap<>(); 
    this.extensions.put(paramString, paramObject);
  }
  
  @OpenAPI31
  public void addExtension31(String paramString, Object paramObject) {
    if (paramString != null && (paramString.startsWith(a(18962, -11390)) || paramString.startsWith(a(18969, 19073))))
      return; 
    addExtension(paramString, paramObject);
  }
  
  public void setExtensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
  }
  
  public Link extensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
    return this;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(18970, -13229));
    stringBuilder.append(a(18968, 1094)).append(toIndentedString(this.operationRef)).append("\n");
    stringBuilder.append(a(18960, 12163)).append(toIndentedString(this.operationId)).append("\n");
    stringBuilder.append(a(18975, -13432)).append(toIndentedString(this.parameters)).append("\n");
    stringBuilder.append(a(18973, 22799)).append(toIndentedString(this.requestBody)).append("\n");
    stringBuilder.append(a(18966, -5829)).append(toIndentedString(this.headers)).append("\n");
    String str = Zd();
    stringBuilder.append(a(18974, 14241)).append(toIndentedString(this.description)).append("\n");
    stringBuilder.append(a(18971, 16272)).append(toIndentedString(this.$ref)).append("\n");
    stringBuilder.append("}");
    if (Zbqc.Zwu() == null)
      Zn("smYpXc"); 
    return stringBuilder.toString();
  }
  
  private String toIndentedString(Object paramObject) {
    return (paramObject == null) ? a(18972, 14270) : paramObject.toString().replace("\n", a(18963, -27086));
  }
  
  public static void Zn(String paramString) {
    Zn = paramString;
  }
  
  public static String Zd() {
    return Zn;
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: ldc 'XkA8M'
    //   9: iconst_0
    //   10: istore_3
    //   11: ldc '¦QwPöØoÉ^\\r·?ÎÁ`ßûjYÓíaY6Þe¡ÿälJò¦Y.ÙXoÿW²I,eDÔ~@I¼%YxÁ²øÚ.+}¤¼ vô¡ºja7b#uCO«®dÏ­üdÝiÓä¡ÁøB«\\tÊ¶°2OIjò7(=Ï1ºwRzì~ï¥^Î\\t÷o·¯XJÄ­'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: invokestatic Zn : (Ljava/lang/String;)V
    //   23: bipush #10
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #75
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 147
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc 'ý\\rñÅüAiV­É'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: iconst_2
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #110
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
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
    //   133: putstatic net/portswigger/swagger/v3/oas/models/links/Link.a : [Ljava/lang/String;
    //   136: bipush #14
    //   138: anewarray java/lang/String
    //   141: putstatic net/portswigger/swagger/v3/oas/models/links/Link.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #116
    //   218: goto -> 248
    //   221: bipush #82
    //   223: goto -> 248
    //   226: bipush #11
    //   228: goto -> 248
    //   231: bipush #22
    //   233: goto -> 248
    //   236: bipush #91
    //   238: goto -> 248
    //   241: bipush #100
    //   243: goto -> 248
    //   246: bipush #61
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 45, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4A1B) & 0xFFFF;
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
      byte b1 = 20;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\oas\models\links\Link.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */