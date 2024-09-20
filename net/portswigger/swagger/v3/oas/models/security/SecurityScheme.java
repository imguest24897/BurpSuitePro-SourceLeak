package net.portswigger.swagger.v3.oas.models.security;

import burp.Zbqc;
import java.util.LinkedHashMap;
import java.util.Map;
import net.portswigger.swagger.v3.oas.models.annotations.OpenAPI31;

public class SecurityScheme {
  private SecurityScheme$Type type = null;
  
  private String description = null;
  
  private String name = null;
  
  private String $ref = null;
  
  private SecurityScheme$In in = null;
  
  private String scheme = null;
  
  private String bearerFormat = null;
  
  private OAuthFlows flows = null;
  
  private String openIdConnectUrl = null;
  
  private Map<String, Object> extensions = null;
  
  private static Zbqc[] Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public SecurityScheme$Type getType() {
    return this.type;
  }
  
  public void setType(SecurityScheme$Type paramSecurityScheme$Type) {
    this.type = paramSecurityScheme$Type;
  }
  
  public SecurityScheme type(SecurityScheme$Type paramSecurityScheme$Type) {
    this.type = paramSecurityScheme$Type;
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public SecurityScheme description(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public SecurityScheme name(String paramString) {
    this.name = paramString;
    return this;
  }
  
  public SecurityScheme$In getIn() {
    return this.in;
  }
  
  public void setIn(SecurityScheme$In paramSecurityScheme$In) {
    this.in = paramSecurityScheme$In;
  }
  
  public SecurityScheme in(SecurityScheme$In paramSecurityScheme$In) {
    this.in = paramSecurityScheme$In;
    return this;
  }
  
  public String getScheme() {
    return this.scheme;
  }
  
  public void setScheme(String paramString) {
    this.scheme = paramString;
  }
  
  public SecurityScheme scheme(String paramString) {
    this.scheme = paramString;
    return this;
  }
  
  public String getBearerFormat() {
    return this.bearerFormat;
  }
  
  public void setBearerFormat(String paramString) {
    this.bearerFormat = paramString;
  }
  
  public SecurityScheme bearerFormat(String paramString) {
    this.bearerFormat = paramString;
    return this;
  }
  
  public OAuthFlows getFlows() {
    return this.flows;
  }
  
  public void setFlows(OAuthFlows paramOAuthFlows) {
    this.flows = paramOAuthFlows;
  }
  
  public SecurityScheme flows(OAuthFlows paramOAuthFlows) {
    this.flows = paramOAuthFlows;
    return this;
  }
  
  public String getOpenIdConnectUrl() {
    return this.openIdConnectUrl;
  }
  
  public void setOpenIdConnectUrl(String paramString) {
    this.openIdConnectUrl = paramString;
  }
  
  public SecurityScheme openIdConnectUrl(String paramString) {
    this.openIdConnectUrl = paramString;
    return this;
  }
  
  public Map<String, Object> getExtensions() {
    return this.extensions;
  }
  
  @OpenAPI31
  public void addExtension31(String paramString, Object paramObject) {
    if (paramString != null && (paramString.startsWith(a(3134, 10801)) || paramString.startsWith(a(3124, 4437))))
      return; 
    addExtension(paramString, paramObject);
  }
  
  public void addExtension(String paramString, Object paramObject) {
    if (paramString == null || paramString.isEmpty() || !paramString.startsWith(a(3126, 5094)))
      return; 
    if (this.extensions == null)
      this.extensions = new LinkedHashMap<>(); 
    this.extensions.put(paramString, paramObject);
  }
  
  public void setExtensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
  }
  
  public SecurityScheme extensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
    return this;
  }
  
  public String get$ref() {
    return this.$ref;
  }
  
  public void set$ref(String paramString) {
    if (paramString != null && paramString.indexOf('.') == -1 && paramString.indexOf('/') == -1)
      paramString = a(3121, 24409) + a(3121, 24409); 
    this.$ref = paramString;
  }
  
  public SecurityScheme $ref(String paramString) {
    set$ref(paramString);
    return this;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof SecurityScheme))
      return false; 
    SecurityScheme securityScheme = (SecurityScheme)paramObject;
    return (this.type != securityScheme.type) ? false : (((this.description != null) ? !this.description.equals(securityScheme.description) : (securityScheme.description != null)) ? false : (((this.name != null) ? !this.name.equals(securityScheme.name) : (securityScheme.name != null)) ? false : (((this.$ref != null) ? !this.$ref.equals(securityScheme.$ref) : (securityScheme.$ref != null)) ? false : ((this.in != securityScheme.in) ? false : (((this.scheme != null) ? !this.scheme.equals(securityScheme.scheme) : (securityScheme.scheme != null)) ? false : (((this.bearerFormat != null) ? !this.bearerFormat.equals(securityScheme.bearerFormat) : (securityScheme.bearerFormat != null)) ? false : (((this.flows != null) ? !this.flows.equals(securityScheme.flows) : (securityScheme.flows != null)) ? false : (((this.openIdConnectUrl != null) ? !this.openIdConnectUrl.equals(securityScheme.openIdConnectUrl) : (securityScheme.openIdConnectUrl != null)) ? false : ((this.extensions != null) ? this.extensions.equals(securityScheme.extensions) : ((securityScheme.extensions == null)))))))))));
  }
  
  public int hashCode() {
    Zbqc[] arrayOfZbqc = ZS();
    int i = (this.type != null) ? this.type.hashCode() : 0;
    i = 31 * i + ((this.description != null) ? this.description.hashCode() : 0);
    i = 31 * i + ((this.name != null) ? this.name.hashCode() : 0);
    i = 31 * i + ((this.$ref != null) ? this.$ref.hashCode() : 0);
    i = 31 * i + ((this.in != null) ? this.in.hashCode() : 0);
    i = 31 * i + ((this.scheme != null) ? this.scheme.hashCode() : 0);
    i = 31 * i + ((this.bearerFormat != null) ? this.bearerFormat.hashCode() : 0);
    i = 31 * i + ((this.flows != null) ? this.flows.hashCode() : 0);
    i = 31 * i + ((this.openIdConnectUrl != null) ? this.openIdConnectUrl.hashCode() : 0);
    i = 31 * i + ((this.extensions != null) ? this.extensions.hashCode() : 0);
    if (Zbqc.Zwu() == null)
      Zh(new Zbqc[4]); 
    return i;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(3120, -9922));
    stringBuilder.append(a(3127, -17683)).append(toIndentedString(this.type)).append("\n");
    stringBuilder.append(a(3130, 27869)).append(toIndentedString(this.description)).append("\n");
    stringBuilder.append(a(3128, -9511)).append(toIndentedString(this.name)).append("\n");
    stringBuilder.append(a(3135, 18751)).append(toIndentedString(this.in)).append("\n");
    stringBuilder.append(a(3125, 21190)).append(toIndentedString(this.scheme)).append("\n");
    stringBuilder.append(a(3122, -5390)).append(toIndentedString(this.bearerFormat)).append("\n");
    stringBuilder.append(a(3129, 4717)).append(toIndentedString(this.flows)).append("\n");
    stringBuilder.append(a(3123, 1990)).append(toIndentedString(this.openIdConnectUrl)).append("\n");
    stringBuilder.append(a(3132, 19990)).append(toIndentedString(this.$ref)).append("\n");
    stringBuilder.append("}");
    Zbqc[] arrayOfZbqc = ZS();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[3]); 
    return stringBuilder.toString();
  }
  
  private String toIndentedString(Object paramObject) {
    return (paramObject == null) ? a(3131, -29888) : paramObject.toString().replace("\n", a(3133, 29924));
  }
  
  public static void Zh(Zbqc[] paramArrayOfZbqc) {
    Zv = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZS() {
    return Zv;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ï·\\tH9\\by[Ç8\§÷\\nó¿¤;( ±QPÚTÜÙvó:-îDQ:1ÛD¿Þ³;\\nhcå?H/Ï©üzº!\UÄÀ.@\\n°×þ©fDz´ÐÕîß\\n\\fõ[íÕÍMéõÕíïcP´°û£}ï"H[ZÉõÜ@­#Á\\n¯Ú\\n} Ö õ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_3
    //   22: anewarray burp/Zbqc
    //   25: iconst_m1
    //   26: istore_0
    //   27: invokestatic Zh : ([Lburp/Zbqc;)V
    //   30: bipush #56
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc 'óÞï|¹Ð!SðÆvÛ®rb=3@NsoÑ9½\\nSñ#êÈ5Opã£&'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #23
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #22
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic net/portswigger/swagger/v3/oas/models/security/SecurityScheme.a : [Ljava/lang/String;
    //   139: bipush #16
    //   141: anewarray java/lang/String
    //   144: putstatic net/portswigger/swagger/v3/oas/models/security/SecurityScheme.b : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 267
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 249, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 239, 5 -> 244
    //   220: bipush #127
    //   222: goto -> 251
    //   225: bipush #107
    //   227: goto -> 251
    //   230: bipush #60
    //   232: goto -> 251
    //   235: iconst_5
    //   236: goto -> 251
    //   239: bipush #81
    //   241: goto -> 251
    //   244: bipush #117
    //   246: goto -> 251
    //   249: bipush #23
    //   251: ixor
    //   252: ixor
    //   253: i2c
    //   254: castore
    //   255: iinc #6, 1
    //   258: dup
    //   259: ifne -> 267
    //   262: dup2
    //   263: dup_x1
    //   264: goto -> 173
    //   267: dup2_x1
    //   268: pop2
    //   269: dup_x2
    //   270: iload #6
    //   272: if_icmpgt -> 169
    //   275: pop
    //   276: new java/lang/String
    //   279: dup_x1
    //   280: swap
    //   281: invokespecial <init> : ([C)V
    //   284: invokevirtual intern : ()Ljava/lang/String;
    //   287: swap
    //   288: pop
    //   289: swap
    //   290: tableswitch default -> 47, 0 -> 106
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xC3E) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\oas\models\security\SecurityScheme.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */