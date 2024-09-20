package net.portswigger.swagger.v3.oas.models;

import com.fasterxml.Zyx;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.portswigger.swagger.v3.oas.models.annotations.OpenAPI31;
import net.portswigger.swagger.v3.oas.models.info.Info;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.security.SecurityRequirement;
import net.portswigger.swagger.v3.oas.models.security.SecurityScheme;
import net.portswigger.swagger.v3.oas.models.servers.Server;
import net.portswigger.swagger.v3.oas.models.tags.Tag;

public class OpenAPI {
  private String openapi = a(7778, 16305);
  
  private Info info = null;
  
  private ExternalDocumentation externalDocs = null;
  
  private List<Server> servers = null;
  
  private List<SecurityRequirement> security = null;
  
  private List<Tag> tags = null;
  
  private Paths paths = null;
  
  private Components components = null;
  
  private Map<String, Object> extensions = null;
  
  @OpenAPI31
  private String jsonSchemaDialect;
  
  private SpecVersion specVersion = SpecVersion.V30;
  
  @OpenAPI31
  private Map<String, PathItem> webhooks = null;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public OpenAPI() {}
  
  public OpenAPI(SpecVersion paramSpecVersion) {
    this.specVersion = paramSpecVersion;
  }
  
  @Zyx
  public SpecVersion getSpecVersion() {
    return this.specVersion;
  }
  
  public void setSpecVersion(SpecVersion paramSpecVersion) {
    this.specVersion = paramSpecVersion;
  }
  
  public OpenAPI specVersion(SpecVersion paramSpecVersion) {
    setSpecVersion(paramSpecVersion);
    return this;
  }
  
  public String getOpenapi() {
    return this.openapi;
  }
  
  public void setOpenapi(String paramString) {
    this.openapi = paramString;
  }
  
  public OpenAPI openapi(String paramString) {
    this.openapi = paramString;
    return this;
  }
  
  public Info getInfo() {
    return this.info;
  }
  
  public void setInfo(Info paramInfo) {
    this.info = paramInfo;
  }
  
  public OpenAPI info(Info paramInfo) {
    this.info = paramInfo;
    return this;
  }
  
  public ExternalDocumentation getExternalDocs() {
    return this.externalDocs;
  }
  
  public void setExternalDocs(ExternalDocumentation paramExternalDocumentation) {
    this.externalDocs = paramExternalDocumentation;
  }
  
  public OpenAPI externalDocs(ExternalDocumentation paramExternalDocumentation) {
    this.externalDocs = paramExternalDocumentation;
    return this;
  }
  
  public List<Server> getServers() {
    return this.servers;
  }
  
  public void setServers(List<Server> paramList) {
    this.servers = paramList;
  }
  
  public OpenAPI servers(List<Server> paramList) {
    this.servers = paramList;
    return this;
  }
  
  public OpenAPI addServersItem(Server paramServer) {
    if (this.servers == null)
      this.servers = new ArrayList<>(); 
    this.servers.add(paramServer);
    return this;
  }
  
  public List<SecurityRequirement> getSecurity() {
    return this.security;
  }
  
  public void setSecurity(List<SecurityRequirement> paramList) {
    this.security = paramList;
  }
  
  public OpenAPI security(List<SecurityRequirement> paramList) {
    this.security = paramList;
    return this;
  }
  
  public OpenAPI addSecurityItem(SecurityRequirement paramSecurityRequirement) {
    if (this.security == null)
      this.security = new ArrayList<>(); 
    this.security.add(paramSecurityRequirement);
    return this;
  }
  
  public List<Tag> getTags() {
    return this.tags;
  }
  
  public void setTags(List<Tag> paramList) {
    this.tags = paramList;
  }
  
  public OpenAPI tags(List<Tag> paramList) {
    this.tags = paramList;
    return this;
  }
  
  public OpenAPI addTagsItem(Tag paramTag) {
    if (this.tags == null)
      this.tags = new ArrayList<>(); 
    this.tags.add(paramTag);
    return this;
  }
  
  public Paths getPaths() {
    return this.paths;
  }
  
  public void setPaths(Paths paramPaths) {
    this.paths = paramPaths;
  }
  
  public OpenAPI paths(Paths paramPaths) {
    this.paths = paramPaths;
    return this;
  }
  
  public Components getComponents() {
    return this.components;
  }
  
  public void setComponents(Components paramComponents) {
    this.components = paramComponents;
  }
  
  public OpenAPI components(Components paramComponents) {
    this.components = paramComponents;
    return this;
  }
  
  public OpenAPI path(String paramString, PathItem paramPathItem) {
    if (this.paths == null)
      this.paths = new Paths(); 
    this.paths.addPathItem(paramString, paramPathItem);
    return this;
  }
  
  public OpenAPI schema(String paramString, Schema paramSchema) {
    if (this.components == null)
      this.components = new Components(); 
    this.components.addSchemas(paramString, paramSchema);
    return this;
  }
  
  public OpenAPI schemaRequirement(String paramString, SecurityScheme paramSecurityScheme) {
    if (this.components == null)
      this.components = new Components(); 
    this.components.addSecuritySchemes(paramString, paramSecurityScheme);
    return this;
  }
  
  @OpenAPI31
  public Map<String, PathItem> getWebhooks() {
    return this.webhooks;
  }
  
  @OpenAPI31
  public void setWebhooks(Map<String, PathItem> paramMap) {
    this.webhooks = paramMap;
  }
  
  @OpenAPI31
  public OpenAPI webhooks(Map<String, PathItem> paramMap) {
    this.webhooks = paramMap;
    return this;
  }
  
  @OpenAPI31
  public OpenAPI addWebhooks(String paramString, PathItem paramPathItem) {
    if (this.webhooks == null)
      this.webhooks = new LinkedHashMap<>(); 
    this.webhooks.put(paramString, paramPathItem);
    return this;
  }
  
  @OpenAPI31
  public String getJsonSchemaDialect() {
    return this.jsonSchemaDialect;
  }
  
  @OpenAPI31
  public void setJsonSchemaDialect(String paramString) {
    this.jsonSchemaDialect = paramString;
  }
  
  @OpenAPI31
  public OpenAPI jsonSchemaDialect(String paramString) {
    this.jsonSchemaDialect = paramString;
    return this;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    OpenAPI openAPI = (OpenAPI)paramObject;
    return (Objects.equals(this.openapi, openAPI.openapi) && Objects.equals(this.info, openAPI.info) && Objects.equals(this.externalDocs, openAPI.externalDocs) && Objects.equals(this.servers, openAPI.servers) && Objects.equals(this.security, openAPI.security) && Objects.equals(this.tags, openAPI.tags) && Objects.equals(this.paths, openAPI.paths) && Objects.equals(this.components, openAPI.components) && Objects.equals(this.webhooks, openAPI.webhooks) && Objects.equals(this.extensions, openAPI.extensions) && Objects.equals(this.jsonSchemaDialect, openAPI.jsonSchemaDialect));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { 
          this.openapi, this.info, this.externalDocs, this.servers, this.security, this.tags, this.paths, this.components, this.webhooks, this.extensions, 
          this.jsonSchemaDialect });
  }
  
  public Map<String, Object> getExtensions() {
    return this.extensions;
  }
  
  public void addExtension(String paramString, Object paramObject) {
    if (paramString == null || paramString.isEmpty() || !paramString.startsWith(a(7791, -21250)))
      return; 
    if (this.extensions == null)
      this.extensions = new LinkedHashMap<>(); 
    this.extensions.put(paramString, paramObject);
  }
  
  @OpenAPI31
  public void addExtension31(String paramString, Object paramObject) {
    if (paramString != null && (paramString.startsWith(a(7782, 3897)) || paramString.startsWith(a(7781, -27712))))
      return; 
    addExtension(paramString, paramObject);
  }
  
  public void setExtensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
  }
  
  public OpenAPI extensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
    return this;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(7785, 1737));
    stringBuilder.append(a(7777, 3706)).append(toIndentedString(this.openapi)).append("\n");
    stringBuilder.append(a(7789, 7228)).append(toIndentedString(this.info)).append("\n");
    stringBuilder.append(a(7784, 25328)).append(toIndentedString(this.externalDocs)).append("\n");
    stringBuilder.append(a(7787, -11963)).append(toIndentedString(this.servers)).append("\n");
    stringBuilder.append(a(7786, 853)).append(toIndentedString(this.security)).append("\n");
    stringBuilder.append(a(7779, 24430)).append(toIndentedString(this.tags)).append("\n");
    stringBuilder.append(a(7776, -3831)).append(toIndentedString(this.paths)).append("\n");
    stringBuilder.append(a(7783, 5050)).append(toIndentedString(this.components)).append("\n");
    if (this.specVersion == SpecVersion.V31)
      stringBuilder.append(a(7800, -31894)).append(toIndentedString(this.webhooks)).append("\n"); 
    if (this.specVersion == SpecVersion.V31)
      stringBuilder.append(a(7788, -24282)).append(toIndentedString(this.jsonSchemaDialect)).append("\n"); 
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  private String toIndentedString(Object paramObject) {
    return (paramObject == null) ? a(7780, -2138) : paramObject.toString().replace("\n", a(7801, -26284));
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'HRZÎÂ:&¸éyÏÓ×¾GÑ£Ìö¢ù6¥ÌfV)Â\\rÁ°Àñ»¡@}à2¾ù@°VÔc\\nm¿cÈ-ÂJªÀ^H6NMRgÚÒÄ£ÀD@¿"±3\\r<È¾+ëXÂåjO÷¿Îñ:¥Ë¤öh\\næ­å§[opæUÜC0A¶&Fá7`X0ñæÙÎËLNöä/æ%/|Àp^°'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #82
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc '/&¿ÚHÖ§ïêÎÓAÝH(ç²'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #123
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
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
    //   128: putstatic net/portswigger/swagger/v3/oas/models/OpenAPI.a : [Ljava/lang/String;
    //   131: bipush #18
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/swagger/v3/oas/models/OpenAPI.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #65
    //   214: goto -> 244
    //   217: bipush #25
    //   219: goto -> 244
    //   222: bipush #13
    //   224: goto -> 244
    //   227: bipush #45
    //   229: goto -> 244
    //   232: bipush #14
    //   234: goto -> 244
    //   237: bipush #99
    //   239: goto -> 244
    //   242: bipush #95
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1E69) & 0xFFFF;
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
      char c = 'Ô';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\oas\models\OpenAPI.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */