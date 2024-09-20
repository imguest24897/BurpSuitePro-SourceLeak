package net.portswigger.swagger.v3.oas.models;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.swagger.v3.oas.models.annotations.OpenAPI31;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.oas.models.servers.Server;

public class PathItem {
  private String summary = null;
  
  private String description = null;
  
  private Operation get = null;
  
  private Operation put = null;
  
  private Operation post = null;
  
  private Operation delete = null;
  
  private Operation options = null;
  
  private Operation head = null;
  
  private Operation patch = null;
  
  private Operation trace = null;
  
  private List<Server> servers = null;
  
  private List<Parameter> parameters = null;
  
  private String $ref = null;
  
  private Map<String, Object> extensions = null;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public String getSummary() {
    return this.summary;
  }
  
  public void setSummary(String paramString) {
    this.summary = paramString;
  }
  
  public PathItem summary(String paramString) {
    this.summary = paramString;
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public PathItem description(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public Operation getGet() {
    return this.get;
  }
  
  public void setGet(Operation paramOperation) {
    this.get = paramOperation;
  }
  
  public PathItem get(Operation paramOperation) {
    this.get = paramOperation;
    return this;
  }
  
  public Operation getPut() {
    return this.put;
  }
  
  public void setPut(Operation paramOperation) {
    this.put = paramOperation;
  }
  
  public PathItem put(Operation paramOperation) {
    this.put = paramOperation;
    return this;
  }
  
  public Operation getPost() {
    return this.post;
  }
  
  public void setPost(Operation paramOperation) {
    this.post = paramOperation;
  }
  
  public PathItem post(Operation paramOperation) {
    this.post = paramOperation;
    return this;
  }
  
  public Operation getDelete() {
    return this.delete;
  }
  
  public void setDelete(Operation paramOperation) {
    this.delete = paramOperation;
  }
  
  public PathItem delete(Operation paramOperation) {
    this.delete = paramOperation;
    return this;
  }
  
  public Operation getOptions() {
    return this.options;
  }
  
  public void setOptions(Operation paramOperation) {
    this.options = paramOperation;
  }
  
  public PathItem options(Operation paramOperation) {
    this.options = paramOperation;
    return this;
  }
  
  public Operation getHead() {
    return this.head;
  }
  
  public void setHead(Operation paramOperation) {
    this.head = paramOperation;
  }
  
  public PathItem head(Operation paramOperation) {
    this.head = paramOperation;
    return this;
  }
  
  public Operation getPatch() {
    return this.patch;
  }
  
  public void setPatch(Operation paramOperation) {
    this.patch = paramOperation;
  }
  
  public PathItem patch(Operation paramOperation) {
    this.patch = paramOperation;
    return this;
  }
  
  public Operation getTrace() {
    return this.trace;
  }
  
  public void setTrace(Operation paramOperation) {
    this.trace = paramOperation;
  }
  
  public PathItem trace(Operation paramOperation) {
    this.trace = paramOperation;
    return this;
  }
  
  public List<Operation> readOperations() {
    ArrayList<Operation> arrayList = new ArrayList();
    if (this.get != null)
      arrayList.add(this.get); 
    if (this.put != null)
      arrayList.add(this.put); 
    if (this.head != null)
      arrayList.add(this.head); 
    if (this.post != null)
      arrayList.add(this.post); 
    if (this.delete != null)
      arrayList.add(this.delete); 
    if (this.patch != null)
      arrayList.add(this.patch); 
    if (this.options != null)
      arrayList.add(this.options); 
    if (this.trace != null)
      arrayList.add(this.trace); 
    return arrayList;
  }
  
  public void operation(PathItem$HttpMethod paramPathItem$HttpMethod, Operation paramOperation) {
    // Byte code:
    //   0: invokestatic ZC : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: invokevirtual ordinal : ()I
    //   8: tableswitch default -> 127, 0 -> 65, 1 -> 83, 2 -> 74, 3 -> 56, 4 -> 119, 5 -> 110, 6 -> 92, 7 -> 101
    //   56: aload_0
    //   57: aload_2
    //   58: putfield patch : Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   61: aload_3
    //   62: ifnull -> 127
    //   65: aload_0
    //   66: aload_2
    //   67: putfield post : Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   70: aload_3
    //   71: ifnull -> 127
    //   74: aload_0
    //   75: aload_2
    //   76: putfield put : Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   79: aload_3
    //   80: ifnull -> 127
    //   83: aload_0
    //   84: aload_2
    //   85: putfield get : Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   88: aload_3
    //   89: ifnull -> 127
    //   92: aload_0
    //   93: aload_2
    //   94: putfield options : Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   97: aload_3
    //   98: ifnull -> 127
    //   101: aload_0
    //   102: aload_2
    //   103: putfield trace : Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   106: aload_3
    //   107: ifnull -> 127
    //   110: aload_0
    //   111: aload_2
    //   112: putfield head : Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   115: aload_3
    //   116: ifnull -> 127
    //   119: aload_0
    //   120: aload_2
    //   121: putfield delete : Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   124: goto -> 127
    //   127: return
  }
  
  public Map<PathItem$HttpMethod, Operation> readOperationsMap() {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    if (this.get != null)
      linkedHashMap.put(PathItem$HttpMethod.GET, this.get); 
    if (this.put != null)
      linkedHashMap.put(PathItem$HttpMethod.PUT, this.put); 
    if (this.post != null)
      linkedHashMap.put(PathItem$HttpMethod.POST, this.post); 
    if (this.delete != null)
      linkedHashMap.put(PathItem$HttpMethod.DELETE, this.delete); 
    if (this.patch != null)
      linkedHashMap.put(PathItem$HttpMethod.PATCH, this.patch); 
    if (this.head != null)
      linkedHashMap.put(PathItem$HttpMethod.HEAD, this.head); 
    if (this.options != null)
      linkedHashMap.put(PathItem$HttpMethod.OPTIONS, this.options); 
    if (this.trace != null)
      linkedHashMap.put(PathItem$HttpMethod.TRACE, this.trace); 
    return (Map)linkedHashMap;
  }
  
  public List<Server> getServers() {
    return this.servers;
  }
  
  public void setServers(List<Server> paramList) {
    this.servers = paramList;
  }
  
  public PathItem servers(List<Server> paramList) {
    this.servers = paramList;
    return this;
  }
  
  public PathItem addServersItem(Server paramServer) {
    if (this.servers == null)
      this.servers = new ArrayList<>(); 
    this.servers.add(paramServer);
    return this;
  }
  
  public List<Parameter> getParameters() {
    return this.parameters;
  }
  
  public void setParameters(List<Parameter> paramList) {
    this.parameters = paramList;
  }
  
  public PathItem parameters(List<Parameter> paramList) {
    this.parameters = paramList;
    return this;
  }
  
  public PathItem addParametersItem(Parameter paramParameter) {
    if (this.parameters == null)
      this.parameters = new ArrayList<>(); 
    this.parameters.add(paramParameter);
    return this;
  }
  
  public Map<String, Object> getExtensions() {
    return this.extensions;
  }
  
  public void addExtension(String paramString, Object paramObject) {
    if (paramString == null || paramString.isEmpty() || !paramString.startsWith(a(-27175, 24161)))
      return; 
    if (this.extensions == null)
      this.extensions = new LinkedHashMap<>(); 
    this.extensions.put(paramString, paramObject);
  }
  
  @OpenAPI31
  public void addExtension31(String paramString, Object paramObject) {
    if (paramString != null && (paramString.startsWith(a(-27177, -24267)) || paramString.startsWith(a(-27171, -16183))))
      return; 
    addExtension(paramString, paramObject);
  }
  
  public void setExtensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
  }
  
  public PathItem extensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
    return this;
  }
  
  public String get$ref() {
    return this.$ref;
  }
  
  public void set$ref(String paramString) {
    this.$ref = paramString;
  }
  
  public PathItem $ref(String paramString) {
    set$ref(paramString);
    return this;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof PathItem))
      return false; 
    PathItem pathItem = (PathItem)paramObject;
    return ((this.summary != null) ? !this.summary.equals(pathItem.summary) : (pathItem.summary != null)) ? false : (((this.description != null) ? !this.description.equals(pathItem.description) : (pathItem.description != null)) ? false : (((this.get != null) ? !this.get.equals(pathItem.get) : (pathItem.get != null)) ? false : (((this.put != null) ? !this.put.equals(pathItem.put) : (pathItem.put != null)) ? false : (((this.post != null) ? !this.post.equals(pathItem.post) : (pathItem.post != null)) ? false : (((this.delete != null) ? !this.delete.equals(pathItem.delete) : (pathItem.delete != null)) ? false : (((this.options != null) ? !this.options.equals(pathItem.options) : (pathItem.options != null)) ? false : (((this.head != null) ? !this.head.equals(pathItem.head) : (pathItem.head != null)) ? false : (((this.patch != null) ? !this.patch.equals(pathItem.patch) : (pathItem.patch != null)) ? false : (((this.trace != null) ? !this.trace.equals(pathItem.trace) : (pathItem.trace != null)) ? false : (((this.servers != null) ? !this.servers.equals(pathItem.servers) : (pathItem.servers != null)) ? false : (((this.parameters != null) ? !this.parameters.equals(pathItem.parameters) : (pathItem.parameters != null)) ? false : (((this.$ref != null) ? !this.$ref.equals(pathItem.$ref) : (pathItem.$ref != null)) ? false : ((this.extensions != null) ? this.extensions.equals(pathItem.extensions) : ((pathItem.extensions == null)))))))))))))));
  }
  
  public int hashCode() {
    String str = Components.ZC();
    int i = (this.summary != null) ? this.summary.hashCode() : 0;
    i = 31 * i + ((this.description != null) ? this.description.hashCode() : 0);
    i = 31 * i + ((this.get != null) ? this.get.hashCode() : 0);
    i = 31 * i + ((this.put != null) ? this.put.hashCode() : 0);
    i = 31 * i + ((this.post != null) ? this.post.hashCode() : 0);
    i = 31 * i + ((this.delete != null) ? this.delete.hashCode() : 0);
    i = 31 * i + ((this.options != null) ? this.options.hashCode() : 0);
    i = 31 * i + ((this.head != null) ? this.head.hashCode() : 0);
    i = 31 * i + ((this.patch != null) ? this.patch.hashCode() : 0);
    i = 31 * i + ((this.trace != null) ? this.trace.hashCode() : 0);
    i = 31 * i + ((this.servers != null) ? this.servers.hashCode() : 0);
    i = 31 * i + ((this.parameters != null) ? this.parameters.hashCode() : 0);
    i = 31 * i + ((this.$ref != null) ? this.$ref.hashCode() : 0);
    i = 31 * i + ((this.extensions != null) ? this.extensions.hashCode() : 0);
    if (Zbqc.Zwu() == null)
      Components.Zi("DI5Eyc"); 
    return i;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(-27179, 28455));
    stringBuilder.append(a(-27172, -9895)).append(toIndentedString(this.summary)).append("\n");
    stringBuilder.append(a(-27194, -26754)).append(toIndentedString(this.description)).append("\n");
    stringBuilder.append(a(-27169, 4284)).append(toIndentedString(this.get)).append("\n");
    stringBuilder.append(a(-27181, -5762)).append(toIndentedString(this.put)).append("\n");
    stringBuilder.append(a(-27173, -32471)).append(toIndentedString(this.post)).append("\n");
    String str = Components.ZC();
    stringBuilder.append(a(-27183, 18253)).append(toIndentedString(this.delete)).append("\n");
    stringBuilder.append(a(-27170, -4129)).append(toIndentedString(this.options)).append("\n");
    stringBuilder.append(a(-27176, 29258)).append(toIndentedString(this.head)).append("\n");
    stringBuilder.append(a(-27178, -30788)).append(toIndentedString(this.patch)).append("\n");
    stringBuilder.append(a(-27182, -27056)).append(toIndentedString(this.trace)).append("\n");
    stringBuilder.append(a(-27180, -20151)).append(toIndentedString(this.servers)).append("\n");
    stringBuilder.append(a(-27184, -8151)).append(toIndentedString(this.parameters)).append("\n");
    stringBuilder.append(a(-27174, 30074)).append(toIndentedString(this.$ref)).append("\n");
    stringBuilder.append("}");
    if (str != null)
      Zbqc.Zr(new Zbqc[4]); 
    return stringBuilder.toString();
  }
  
  private String toIndentedString(Object paramObject) {
    return (paramObject == null) ? a(-27196, 3820) : paramObject.toString().replace("\n", a(-27193, -23367));
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ''!+s]Ý¨~ítöf@´\\rG¤-©ahÅû¿O}OìQâòãrÎ­êk^O?PÊÙðù§ú \\twQj¦u¨ååwHW *:ôFù2«ÝÙ\\fNp¯ÊChlQð¾\\rÜoIÛø¿óh2éþ\\t|c{ÕQ~ç¡·\\rø3ëßW/¨Î%-\\bV°¡þ`Ié\\n¸øã¦×'\\nåÖHc ¢;?ÑÍ\\nähI<í±Ðåôb¸»*³ìAc¾!ô·'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #25
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
    //   68: ldc 'üÕyzÄ¡C'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #46
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
    //   128: putstatic net/portswigger/swagger/v3/oas/models/PathItem.a : [Ljava/lang/String;
    //   131: bipush #19
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/swagger/v3/oas/models/PathItem.b : [Ljava/lang/String;
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
    //   212: bipush #77
    //   214: goto -> 244
    //   217: bipush #6
    //   219: goto -> 244
    //   222: bipush #99
    //   224: goto -> 244
    //   227: bipush #71
    //   229: goto -> 244
    //   232: bipush #43
    //   234: goto -> 244
    //   237: bipush #87
    //   239: goto -> 244
    //   242: bipush #109
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
    int i = (paramInt1 ^ 0xFFFF95D6) & 0xFFFF;
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
      byte b1 = 26;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\oas\models\PathItem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */