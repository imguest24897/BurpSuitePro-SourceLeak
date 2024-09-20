package net.portswigger.swagger.v1.models;

import com.fasterxml.Zv8;
import com.fasterxml.Zyi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.swagger.v1.models.parameters.Parameter;

public class Operation {
  private Map<String, Object> vendorExtensions = new LinkedHashMap<>();
  
  private List<String> tags;
  
  private String summary;
  
  private String description;
  
  private String operationId;
  
  private List<Scheme> schemes;
  
  private List<String> consumes;
  
  private List<String> produces;
  
  private List<Parameter> parameters = new ArrayList<>();
  
  private Map<String, Response> responses;
  
  private Responses responsesObject;
  
  private List<Map<String, List<String>>> security;
  
  private ExternalDocs externalDocs;
  
  private Boolean deprecated;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Operation summary(String paramString) {
    setSummary(paramString);
    return this;
  }
  
  public Operation description(String paramString) {
    setDescription(paramString);
    return this;
  }
  
  public Operation operationId(String paramString) {
    setOperationId(paramString);
    return this;
  }
  
  public Operation schemes(List<Scheme> paramList) {
    setSchemes(paramList);
    return this;
  }
  
  public Operation scheme(Scheme paramScheme) {
    addScheme(paramScheme);
    return this;
  }
  
  public Operation consumes(List<String> paramList) {
    setConsumes(paramList);
    return this;
  }
  
  public Operation consumes(String paramString) {
    addConsumes(paramString);
    return this;
  }
  
  public Operation produces(List<String> paramList) {
    setProduces(paramList);
    return this;
  }
  
  public Operation produces(String paramString) {
    addProduces(paramString);
    return this;
  }
  
  public Operation security(SecurityRequirement paramSecurityRequirement) {
    addSecurity(paramSecurityRequirement.getName(), paramSecurityRequirement.getScopes());
    return this;
  }
  
  public Operation parameter(Parameter paramParameter) {
    addParameter(paramParameter);
    return this;
  }
  
  public Operation response(int paramInt, Response paramResponse) {
    addResponse(String.valueOf(paramInt), paramResponse);
    return this;
  }
  
  public Operation defaultResponse(Response paramResponse) {
    addResponse(a(-5621, 25156), paramResponse);
    return this;
  }
  
  public Operation tags(List<String> paramList) {
    setTags(paramList);
    return this;
  }
  
  public Operation tag(String paramString) {
    addTag(paramString);
    return this;
  }
  
  public Operation externalDocs(ExternalDocs paramExternalDocs) {
    setExternalDocs(paramExternalDocs);
    return this;
  }
  
  public Operation deprecated(Boolean paramBoolean) {
    setDeprecated(paramBoolean);
    return this;
  }
  
  public List<String> getTags() {
    return this.tags;
  }
  
  public void setTags(List<String> paramList) {
    this.tags = paramList;
  }
  
  public void addTag(String paramString) {
    if (this.tags == null)
      this.tags = new ArrayList<>(); 
    this.tags.add(paramString);
  }
  
  public String getSummary() {
    return this.summary;
  }
  
  public void setSummary(String paramString) {
    this.summary = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public String getOperationId() {
    return this.operationId;
  }
  
  public void setOperationId(String paramString) {
    this.operationId = paramString;
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
  
  public List<String> getConsumes() {
    return this.consumes;
  }
  
  public void setConsumes(List<String> paramList) {
    this.consumes = paramList;
  }
  
  public void addConsumes(String paramString) {
    if (this.consumes == null)
      this.consumes = new ArrayList<>(); 
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
    this.produces.add(paramString);
  }
  
  public List<Parameter> getParameters() {
    return this.parameters;
  }
  
  public void setParameters(List<Parameter> paramList) {
    this.parameters = paramList;
  }
  
  public void addParameter(Parameter paramParameter) {
    if (this.parameters == null)
      this.parameters = new ArrayList<>(); 
    this.parameters.add(paramParameter);
  }
  
  public Map<String, Response> getResponses() {
    if (this.responses == null && this.responsesObject != null) {
      this.responses = new Responses();
      this.responses.putAll(this.responsesObject);
    } 
    if (this.responsesObject != null)
      this.responses.putAll(this.responsesObject); 
    return this.responses;
  }
  
  public Responses getResponsesObject() {
    if (this.responsesObject == null && this.responses != null) {
      this.responsesObject = new Responses();
      this.responsesObject.putAll(this.responses);
    } 
    return this.responsesObject;
  }
  
  public void setResponses(Map<String, Response> paramMap) {
    this.responses = paramMap;
  }
  
  public void setResponsesObject(Responses paramResponses) {
    this.responsesObject = paramResponses;
  }
  
  public void addResponse(String paramString, Response paramResponse) {
    if (this.responsesObject == null)
      this.responsesObject = new Responses(); 
    this.responsesObject.put(paramString, paramResponse);
  }
  
  public List<Map<String, List<String>>> getSecurity() {
    return this.security;
  }
  
  public void setSecurity(List<Map<String, List<String>>> paramList) {
    this.security = paramList;
  }
  
  public void addSecurity(String paramString, List<String> paramList) {
    if (this.security == null)
      this.security = new ArrayList<>(); 
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    if (paramList == null)
      paramList = new ArrayList<>(); 
    linkedHashMap.put(paramString, paramList);
    this.security.add(linkedHashMap);
  }
  
  public ExternalDocs getExternalDocs() {
    return this.externalDocs;
  }
  
  public void setExternalDocs(ExternalDocs paramExternalDocs) {
    this.externalDocs = paramExternalDocs;
  }
  
  public Boolean isDeprecated() {
    return this.deprecated;
  }
  
  public void setDeprecated(Boolean paramBoolean) {
    this.deprecated = paramBoolean;
  }
  
  @Zyi
  public Map<String, Object> getVendorExtensions() {
    return this.vendorExtensions;
  }
  
  @Zv8
  public void setVendorExtension(String paramString, Object paramObject) {
    if (paramString.startsWith(a(-5622, 21557)))
      this.vendorExtensions.put(paramString, paramObject); 
  }
  
  public void setVendorExtensions(Map<String, Object> paramMap) {
    this.vendorExtensions = paramMap;
  }
  
  public int hashCode() {
    byte b = 31;
    null = 1;
    null = 31 * null + ((this.consumes == null) ? 0 : this.consumes.hashCode());
    null = 31 * null + ((this.deprecated == null) ? 0 : this.deprecated.hashCode());
    null = 31 * null + ((this.description == null) ? 0 : this.description.hashCode());
    null = 31 * null + ((this.externalDocs == null) ? 0 : this.externalDocs.hashCode());
    null = 31 * null + ((this.operationId == null) ? 0 : this.operationId.hashCode());
    null = 31 * null + ((this.parameters == null) ? 0 : this.parameters.hashCode());
    null = 31 * null + ((this.produces == null) ? 0 : this.produces.hashCode());
    null = 31 * null + ((this.responses == null) ? 0 : this.responses.hashCode());
    null = 31 * null + ((this.responsesObject == null) ? 0 : this.responsesObject.hashCode());
    null = 31 * null + ((this.schemes == null) ? 0 : this.schemes.hashCode());
    null = 31 * null + ((this.security == null) ? 0 : this.security.hashCode());
    null = 31 * null + ((this.summary == null) ? 0 : this.summary.hashCode());
    null = 31 * null + ((this.tags == null) ? 0 : this.tags.hashCode());
    return 31 * null + ((this.vendorExtensions == null) ? 0 : this.vendorExtensions.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    Operation operation = (Operation)paramObject;
    if (this.consumes == null) {
      if (operation.consumes != null)
        return false; 
    } else if (!this.consumes.equals(operation.consumes)) {
      return false;
    } 
    if (this.deprecated == null) {
      if (operation.deprecated != null)
        return false; 
    } else if (!this.deprecated.equals(operation.deprecated)) {
      return false;
    } 
    if (this.description == null) {
      if (operation.description != null)
        return false; 
    } else if (!this.description.equals(operation.description)) {
      return false;
    } 
    if (this.externalDocs == null) {
      if (operation.externalDocs != null)
        return false; 
    } else if (!this.externalDocs.equals(operation.externalDocs)) {
      return false;
    } 
    if (this.operationId == null) {
      if (operation.operationId != null)
        return false; 
    } else if (!this.operationId.equals(operation.operationId)) {
      return false;
    } 
    if (this.parameters == null) {
      if (operation.parameters != null)
        return false; 
    } else if (!this.parameters.equals(operation.parameters)) {
      return false;
    } 
    if (this.produces == null) {
      if (operation.produces != null)
        return false; 
    } else if (!this.produces.equals(operation.produces)) {
      return false;
    } 
    if (this.responses == null) {
      if (operation.responses != null)
        return false; 
    } else if (!this.responses.equals(operation.responses)) {
      return false;
    } 
    if (this.responsesObject == null) {
      if (operation.responsesObject != null)
        return false; 
    } else if (!this.responsesObject.equals(operation.responsesObject)) {
      return false;
    } 
    if (this.schemes == null) {
      if (operation.schemes != null)
        return false; 
    } else if (!this.schemes.equals(operation.schemes)) {
      return false;
    } 
    if (this.security == null) {
      if (operation.security != null)
        return false; 
    } else if (!this.security.equals(operation.security)) {
      return false;
    } 
    if (this.summary == null) {
      if (operation.summary != null)
        return false; 
    } else if (!this.summary.equals(operation.summary)) {
      return false;
    } 
    if (this.tags == null) {
      if (operation.tags != null)
        return false; 
    } else if (!this.tags.equals(operation.tags)) {
      return false;
    } 
    if (this.vendorExtensions == null) {
      if (operation.vendorExtensions != null)
        return false; 
    } else if (!this.vendorExtensions.equals(operation.vendorExtensions)) {
      return false;
    } 
    return true;
  }
  
  public Operation vendorExtensions(Map<String, Object> paramMap) {
    this.vendorExtensions.putAll(paramMap);
    return this;
  }
  
  public String toString() {
    return super.toString() + "[" + super.toString() + "]";
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '¦Tp\\nãÚ¿'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #7
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #29
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: aload #5
    //   69: putstatic net/portswigger/swagger/v1/models/Operation.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic net/portswigger/swagger/v1/models/Operation.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #60
    //   154: goto -> 184
    //   157: bipush #45
    //   159: goto -> 184
    //   162: bipush #19
    //   164: goto -> 184
    //   167: bipush #51
    //   169: goto -> 184
    //   172: bipush #8
    //   174: goto -> 184
    //   177: bipush #91
    //   179: goto -> 184
    //   182: bipush #37
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
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
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEA0B) & 0xFFFF;
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
      byte b1 = 79;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\Operation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */