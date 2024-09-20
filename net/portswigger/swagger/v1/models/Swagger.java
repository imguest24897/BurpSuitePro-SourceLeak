package net.portswigger.swagger.v1.models;

import burp.Zbqc;
import com.fasterxml.Zv8;
import com.fasterxml.Zyi;
import com.fasterxml.Zyx;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.swagger.v1.models.auth.SecuritySchemeDefinition;
import net.portswigger.swagger.v1.models.parameters.Parameter;

public class Swagger {
  protected String swagger = a(18273, 1040);
  
  protected Info info;
  
  protected String host;
  
  protected String basePath;
  
  protected List<Tag> tags;
  
  protected List<Scheme> schemes;
  
  protected List<String> consumes;
  
  protected List<String> produces;
  
  protected List<SecurityRequirement> security;
  
  protected Map<String, Path> paths;
  
  protected Map<String, SecuritySchemeDefinition> securityDefinitions;
  
  protected Map<String, Model> definitions;
  
  protected Map<String, Parameter> parameters;
  
  protected Map<String, Response> responses;
  
  protected ExternalDocs externalDocs;
  
  protected Map<String, Object> vendorExtensions;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Swagger info(Info paramInfo) {
    setInfo(paramInfo);
    return this;
  }
  
  public Swagger host(String paramString) {
    setHost(paramString);
    return this;
  }
  
  public Swagger basePath(String paramString) {
    setBasePath(paramString);
    return this;
  }
  
  public Swagger externalDocs(ExternalDocs paramExternalDocs) {
    setExternalDocs(paramExternalDocs);
    return this;
  }
  
  public Swagger tags(List<Tag> paramList) {
    setTags(paramList);
    return this;
  }
  
  public Swagger tag(Tag paramTag) {
    addTag(paramTag);
    return this;
  }
  
  public Swagger schemes(List<Scheme> paramList) {
    setSchemes(paramList);
    return this;
  }
  
  public Swagger scheme(Scheme paramScheme) {
    addScheme(paramScheme);
    return this;
  }
  
  public Swagger consumes(List<String> paramList) {
    setConsumes(paramList);
    return this;
  }
  
  public Swagger consumes(String paramString) {
    addConsumes(paramString);
    return this;
  }
  
  public Swagger produces(List<String> paramList) {
    setProduces(paramList);
    return this;
  }
  
  public Swagger produces(String paramString) {
    addProduces(paramString);
    return this;
  }
  
  public Swagger paths(Map<String, Path> paramMap) {
    setPaths(paramMap);
    return this;
  }
  
  public Swagger path(String paramString, Path paramPath) {
    if (this.paths == null)
      this.paths = new LinkedHashMap<>(); 
    this.paths.put(paramString, paramPath);
    return this;
  }
  
  public Swagger responses(Map<String, Response> paramMap) {
    this.responses = paramMap;
    return this;
  }
  
  public Swagger response(String paramString, Response paramResponse) {
    if (this.responses == null)
      this.responses = new LinkedHashMap<>(); 
    this.responses.put(paramString, paramResponse);
    return this;
  }
  
  public Swagger parameter(String paramString, Parameter paramParameter) {
    addParameter(paramString, paramParameter);
    return this;
  }
  
  public Swagger securityDefinition(String paramString, SecuritySchemeDefinition paramSecuritySchemeDefinition) {
    addSecurityDefinition(paramString, paramSecuritySchemeDefinition);
    return this;
  }
  
  public Swagger model(String paramString, Model paramModel) {
    addDefinition(paramString, paramModel);
    return this;
  }
  
  public Swagger security(SecurityRequirement paramSecurityRequirement) {
    addSecurity(paramSecurityRequirement);
    return this;
  }
  
  public Swagger vendorExtension(String paramString, Object paramObject) {
    if (this.vendorExtensions == null)
      this.vendorExtensions = new LinkedHashMap<>(); 
    this.vendorExtensions.put(paramString, paramObject);
    return this;
  }
  
  public String getSwagger() {
    return this.swagger;
  }
  
  public void setSwagger(String paramString) {
    this.swagger = paramString;
  }
  
  public Info getInfo() {
    return this.info;
  }
  
  public void setInfo(Info paramInfo) {
    this.info = paramInfo;
  }
  
  public String getHost() {
    return this.host;
  }
  
  public void setHost(String paramString) {
    this.host = paramString;
  }
  
  public String getBasePath() {
    return this.basePath;
  }
  
  public void setBasePath(String paramString) {
    this.basePath = paramString;
  }
  
  public List<Scheme> getSchemes() {
    return this.schemes;
  }
  
  public void setSchemes(List<Scheme> paramList) {
    this.schemes = paramList;
  }
  
  public void addScheme(Scheme paramScheme) {
    if (this.schemes == null)
      this.schemes = new ArrayList<>(); 
    if (!this.schemes.contains(paramScheme))
      this.schemes.add(paramScheme); 
  }
  
  public List<Tag> getTags() {
    return this.tags;
  }
  
  public void setTags(List<Tag> paramList) {
    this.tags = paramList;
  }
  
  public Tag getTag(String paramString) {
    Tag tag = null;
    if (this.tags != null && paramString != null)
      for (Tag tag1 : this.tags) {
        if (tag1.getName().equals(paramString)) {
          tag = tag1;
          break;
        } 
      }  
    return tag;
  }
  
  public void addTag(Tag paramTag) {
    if (this.tags == null)
      this.tags = new ArrayList<>(); 
    if (paramTag != null && paramTag.getName() != null && getTag(paramTag.getName()) == null)
      this.tags.add(paramTag); 
  }
  
  public List<String> getConsumes() {
    return this.consumes;
  }
  
  public void setConsumes(List<String> paramList) {
    this.consumes = paramList;
  }
  
  public void addConsumes(String paramString) {
    if (this.consumes == null)
      this.consumes = new ArrayList<>(); 
    if (!this.consumes.contains(paramString))
      this.consumes.add(paramString); 
  }
  
  public List<String> getProduces() {
    return this.produces;
  }
  
  public void setProduces(List<String> paramList) {
    this.produces = paramList;
  }
  
  public void addProduces(String paramString) {
    if (this.produces == null)
      this.produces = new ArrayList<>(); 
    if (!this.produces.contains(paramString))
      this.produces.add(paramString); 
  }
  
  public Map<String, Path> getPaths() {
    return this.paths;
  }
  
  public void setPaths(Map<String, Path> paramMap) {
    this.paths = paramMap;
  }
  
  public Path getPath(String paramString) {
    return (this.paths == null) ? null : this.paths.get(paramString);
  }
  
  public Map<String, SecuritySchemeDefinition> getSecurityDefinitions() {
    return this.securityDefinitions;
  }
  
  public void setSecurityDefinitions(Map<String, SecuritySchemeDefinition> paramMap) {
    this.securityDefinitions = paramMap;
  }
  
  public void addSecurityDefinition(String paramString, SecuritySchemeDefinition paramSecuritySchemeDefinition) {
    if (this.securityDefinitions == null)
      this.securityDefinitions = new LinkedHashMap<>(); 
    this.securityDefinitions.put(paramString, paramSecuritySchemeDefinition);
  }
  
  @Zyx
  @Deprecated
  public List<SecurityRequirement> getSecurityRequirement() {
    return this.security;
  }
  
  @Zyx
  @Deprecated
  public void setSecurityRequirement(List<SecurityRequirement> paramList) {
    this.security = paramList;
  }
  
  @Zyx
  @Deprecated
  public void addSecurityDefinition(SecurityRequirement paramSecurityRequirement) {
    addSecurity(paramSecurityRequirement);
  }
  
  public List<SecurityRequirement> getSecurity() {
    return this.security;
  }
  
  public void setSecurity(List<SecurityRequirement> paramList) {
    this.security = paramList;
  }
  
  public void addSecurity(SecurityRequirement paramSecurityRequirement) {
    if (this.security == null)
      this.security = new ArrayList<>(); 
    this.security.add(paramSecurityRequirement);
  }
  
  public Map<String, Model> getDefinitions() {
    return this.definitions;
  }
  
  public void setDefinitions(Map<String, Model> paramMap) {
    this.definitions = paramMap;
  }
  
  public void addDefinition(String paramString, Model paramModel) {
    if (this.definitions == null)
      this.definitions = new LinkedHashMap<>(); 
    this.definitions.put(paramString, paramModel);
  }
  
  public Map<String, Parameter> getParameters() {
    return this.parameters;
  }
  
  public void setParameters(Map<String, Parameter> paramMap) {
    this.parameters = paramMap;
  }
  
  public Parameter getParameter(String paramString) {
    return (this.parameters == null) ? null : this.parameters.get(paramString);
  }
  
  public void addParameter(String paramString, Parameter paramParameter) {
    if (this.parameters == null)
      this.parameters = new LinkedHashMap<>(); 
    this.parameters.put(paramString, paramParameter);
  }
  
  public Map<String, Response> getResponses() {
    return this.responses;
  }
  
  public void setResponses(Map<String, Response> paramMap) {
    this.responses = paramMap;
  }
  
  public ExternalDocs getExternalDocs() {
    return this.externalDocs;
  }
  
  public void setExternalDocs(ExternalDocs paramExternalDocs) {
    this.externalDocs = paramExternalDocs;
  }
  
  @Zyi
  public Map<String, Object> getVendorExtensions() {
    return this.vendorExtensions;
  }
  
  @Zv8
  public void setVendorExtension(String paramString, Object paramObject) {
    if (paramString.startsWith(a(18272, 16795)))
      vendorExtension(paramString, paramObject); 
  }
  
  public int hashCode() {
    byte b = 31;
    int j = 1;
    int i = AbstractModel.Zg();
    j = 31 * j + ((this.basePath == null) ? 0 : this.basePath.hashCode());
    j = 31 * j + ((this.consumes == null) ? 0 : this.consumes.hashCode());
    j = 31 * j + ((this.definitions == null) ? 0 : this.definitions.hashCode());
    j = 31 * j + ((this.externalDocs == null) ? 0 : this.externalDocs.hashCode());
    j = 31 * j + ((this.host == null) ? 0 : this.host.hashCode());
    j = 31 * j + ((this.info == null) ? 0 : this.info.hashCode());
    j = 31 * j + ((this.parameters == null) ? 0 : this.parameters.hashCode());
    j = 31 * j + ((this.paths == null) ? 0 : this.paths.hashCode());
    j = 31 * j + ((this.produces == null) ? 0 : this.produces.hashCode());
    j = 31 * j + ((this.responses == null) ? 0 : this.responses.hashCode());
    j = 31 * j + ((this.schemes == null) ? 0 : this.schemes.hashCode());
    j = 31 * j + ((this.security == null) ? 0 : this.security.hashCode());
    j = 31 * j + ((this.securityDefinitions == null) ? 0 : this.securityDefinitions.hashCode());
    j = 31 * j + ((this.swagger == null) ? 0 : this.swagger.hashCode());
    j = 31 * j + ((this.tags == null) ? 0 : this.tags.hashCode());
    j = 31 * j + ((this.vendorExtensions == null) ? 0 : this.vendorExtensions.hashCode());
    if (Zbqc.Zwu() == null)
      AbstractModel.ZK(++i); 
    return j;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    Swagger swagger = (Swagger)paramObject;
    if (this.basePath == null) {
      if (swagger.basePath != null)
        return false; 
    } else if (!this.basePath.equals(swagger.basePath)) {
      return false;
    } 
    if (this.consumes == null) {
      if (swagger.consumes != null)
        return false; 
    } else if (!this.consumes.equals(swagger.consumes)) {
      return false;
    } 
    if (this.definitions == null) {
      if (swagger.definitions != null)
        return false; 
    } else if (!this.definitions.equals(swagger.definitions)) {
      return false;
    } 
    if (this.externalDocs == null) {
      if (swagger.externalDocs != null)
        return false; 
    } else if (!this.externalDocs.equals(swagger.externalDocs)) {
      return false;
    } 
    if (this.host == null) {
      if (swagger.host != null)
        return false; 
    } else if (!this.host.equals(swagger.host)) {
      return false;
    } 
    if (this.info == null) {
      if (swagger.info != null)
        return false; 
    } else if (!this.info.equals(swagger.info)) {
      return false;
    } 
    if (this.parameters == null) {
      if (swagger.parameters != null)
        return false; 
    } else if (!this.parameters.equals(swagger.parameters)) {
      return false;
    } 
    if (this.paths == null) {
      if (swagger.paths != null)
        return false; 
    } else if (!this.paths.equals(swagger.paths)) {
      return false;
    } 
    if (this.produces == null) {
      if (swagger.produces != null)
        return false; 
    } else if (!this.produces.equals(swagger.produces)) {
      return false;
    } 
    if (this.responses == null) {
      if (swagger.responses != null)
        return false; 
    } else if (!this.responses.equals(swagger.responses)) {
      return false;
    } 
    if (this.schemes == null) {
      if (swagger.schemes != null)
        return false; 
    } else if (!this.schemes.equals(swagger.schemes)) {
      return false;
    } 
    if (this.security == null) {
      if (swagger.security != null)
        return false; 
    } else if (!this.security.equals(swagger.security)) {
      return false;
    } 
    if (this.securityDefinitions == null) {
      if (swagger.securityDefinitions != null)
        return false; 
    } else if (!this.securityDefinitions.equals(swagger.securityDefinitions)) {
      return false;
    } 
    if (this.swagger == null) {
      if (swagger.swagger != null)
        return false; 
    } else if (!this.swagger.equals(swagger.swagger)) {
      return false;
    } 
    if (this.tags == null) {
      if (swagger.tags != null)
        return false; 
    } else if (!this.tags.equals(swagger.tags)) {
      return false;
    } 
    if (this.vendorExtensions == null) {
      if (swagger.vendorExtensions != null)
        return false; 
    } else if (!this.vendorExtensions.equals(swagger.vendorExtensions)) {
      return false;
    } 
    return true;
  }
  
  public Swagger vendorExtensions(Map<String, Object> paramMap) {
    if (paramMap == null)
      return this; 
    if (this.vendorExtensions == null)
      this.vendorExtensions = new LinkedHashMap<>(); 
    this.vendorExtensions.putAll(paramMap);
    return this;
  }
  
  public void setVendorExtensions(Map<String, Object> paramMap) {
    this.vendorExtensions = paramMap;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '4Üg'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_2
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #48
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic net/portswigger/swagger/v1/models/Swagger.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic net/portswigger/swagger/v1/models/Swagger.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #46
    //   154: goto -> 184
    //   157: bipush #57
    //   159: goto -> 184
    //   162: bipush #77
    //   164: goto -> 184
    //   167: bipush #87
    //   169: goto -> 184
    //   172: bipush #82
    //   174: goto -> 184
    //   177: bipush #120
    //   179: goto -> 184
    //   182: bipush #29
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 38
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4760) & 0xFFFF;
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
      byte b1 = 114;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\Swagger.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */