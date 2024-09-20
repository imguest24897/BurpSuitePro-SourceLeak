package net.portswigger.swagger.v3.oas.models.parameters;

import burp.Zbqc;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import net.portswigger.swagger.v3.oas.models.annotations.OpenAPI31;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.oas.models.media.Content;
import net.portswigger.swagger.v3.oas.models.media.Schema;

public class Parameter {
  private String name = null;
  
  private String in = null;
  
  private String description = null;
  
  private Boolean required = null;
  
  private Boolean deprecated = null;
  
  private Boolean allowEmptyValue = null;
  
  private String $ref = null;
  
  private Parameter$StyleEnum style = null;
  
  private Boolean explode = null;
  
  private Boolean allowReserved = null;
  
  private Schema schema = null;
  
  private Map<String, Example> examples = null;
  
  private Object example = null;
  
  private Content content = null;
  
  private Map<String, Object> extensions = null;
  
  private static Zbqc[] Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public Parameter name(String paramString) {
    this.name = paramString;
    return this;
  }
  
  public String getIn() {
    return this.in;
  }
  
  public void setIn(String paramString) {
    if (a(1195, 29204).equals(paramString))
      this.required = Boolean.valueOf(true); 
    this.in = paramString;
  }
  
  public Parameter in(String paramString) {
    setIn(paramString);
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public Parameter description(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public Boolean getRequired() {
    return this.required;
  }
  
  public void setRequired(Boolean paramBoolean) {
    this.required = paramBoolean;
  }
  
  public Parameter required(Boolean paramBoolean) {
    this.required = paramBoolean;
    return this;
  }
  
  public Boolean getDeprecated() {
    return this.deprecated;
  }
  
  public void setDeprecated(Boolean paramBoolean) {
    this.deprecated = paramBoolean;
  }
  
  public Parameter deprecated(Boolean paramBoolean) {
    this.deprecated = paramBoolean;
    return this;
  }
  
  public Boolean getAllowEmptyValue() {
    return this.allowEmptyValue;
  }
  
  public void setAllowEmptyValue(Boolean paramBoolean) {
    this.allowEmptyValue = paramBoolean;
  }
  
  public Parameter allowEmptyValue(Boolean paramBoolean) {
    this.allowEmptyValue = paramBoolean;
    return this;
  }
  
  public Parameter$StyleEnum getStyle() {
    return this.style;
  }
  
  public void setStyle(Parameter$StyleEnum paramParameter$StyleEnum) {
    this.style = paramParameter$StyleEnum;
  }
  
  public Parameter style(Parameter$StyleEnum paramParameter$StyleEnum) {
    this.style = paramParameter$StyleEnum;
    return this;
  }
  
  public Boolean getExplode() {
    return this.explode;
  }
  
  public void setExplode(Boolean paramBoolean) {
    this.explode = paramBoolean;
  }
  
  public Parameter explode(Boolean paramBoolean) {
    this.explode = paramBoolean;
    return this;
  }
  
  public Boolean getAllowReserved() {
    return this.allowReserved;
  }
  
  public void setAllowReserved(Boolean paramBoolean) {
    this.allowReserved = paramBoolean;
  }
  
  public Parameter allowReserved(Boolean paramBoolean) {
    this.allowReserved = paramBoolean;
    return this;
  }
  
  public Schema getSchema() {
    return this.schema;
  }
  
  public void setSchema(Schema paramSchema) {
    this.schema = paramSchema;
  }
  
  public Parameter schema(Schema paramSchema) {
    this.schema = paramSchema;
    return this;
  }
  
  public Map<String, Example> getExamples() {
    return this.examples;
  }
  
  public void setExamples(Map<String, Example> paramMap) {
    this.examples = paramMap;
  }
  
  public Parameter examples(Map<String, Example> paramMap) {
    this.examples = paramMap;
    return this;
  }
  
  public Parameter addExample(String paramString, Example paramExample) {
    if (this.examples == null)
      this.examples = new LinkedHashMap<>(); 
    this.examples.put(paramString, paramExample);
    return this;
  }
  
  public Object getExample() {
    return this.example;
  }
  
  public void setExample(Object paramObject) {
    this.example = paramObject;
  }
  
  public Parameter example(Object paramObject) {
    this.example = paramObject;
    return this;
  }
  
  public Content getContent() {
    return this.content;
  }
  
  public void setContent(Content paramContent) {
    this.content = paramContent;
  }
  
  public Parameter content(Content paramContent) {
    this.content = paramContent;
    return this;
  }
  
  public String get$ref() {
    return this.$ref;
  }
  
  public void set$ref(String paramString) {
    if (paramString != null && paramString.indexOf('.') == -1 && paramString.indexOf('/') == -1)
      paramString = a(1185, 31870) + a(1185, 31870); 
    this.$ref = paramString;
  }
  
  public Parameter $ref(String paramString) {
    set$ref(paramString);
    return this;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Parameter parameter = (Parameter)paramObject;
    return (Objects.equals(this.name, parameter.name) && Objects.equals(this.in, parameter.in) && Objects.equals(this.description, parameter.description) && Objects.equals(this.required, parameter.required) && Objects.equals(this.deprecated, parameter.deprecated) && Objects.equals(this.allowEmptyValue, parameter.allowEmptyValue) && Objects.equals(this.style, parameter.style) && Objects.equals(this.explode, parameter.explode) && Objects.equals(this.allowReserved, parameter.allowReserved) && Objects.equals(this.schema, parameter.schema) && Objects.equals(this.examples, parameter.examples) && Objects.equals(this.example, parameter.example) && Objects.equals(this.content, parameter.content) && Objects.equals(this.$ref, parameter.$ref) && Objects.equals(this.extensions, parameter.extensions));
  }
  
  public int hashCode() {
    Zbqc[] arrayOfZbqc = ZY();
    if (Zbqc.Zwu() == null)
      Zx(new Zbqc[4]); 
    return Objects.hash(new Object[] { 
          this.name, this.in, this.description, this.required, this.deprecated, this.allowEmptyValue, this.style, this.explode, this.allowReserved, this.schema, 
          this.examples, this.example, this.content, this.$ref, this.extensions });
  }
  
  public Map<String, Object> getExtensions() {
    return this.extensions;
  }
  
  public void addExtension(String paramString, Object paramObject) {
    if (paramString == null || paramString.isEmpty() || !paramString.startsWith(a(1200, -4466)))
      return; 
    if (this.extensions == null)
      this.extensions = new LinkedHashMap<>(); 
    this.extensions.put(paramString, paramObject);
  }
  
  @OpenAPI31
  public void addExtension31(String paramString, Object paramObject) {
    if (paramString != null && (paramString.startsWith(a(1197, 4044)) || paramString.startsWith(a(1184, -6925))))
      return; 
    addExtension(paramString, paramObject);
  }
  
  public void setExtensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
  }
  
  public Parameter extensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
    return this;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(1204, -23648));
    stringBuilder.append(a(1196, 19295)).append(toIndentedString(this.name)).append("\n");
    stringBuilder.append(a(1202, 29325)).append(toIndentedString(this.in)).append("\n");
    stringBuilder.append(a(1187, -24148)).append(toIndentedString(this.description)).append("\n");
    stringBuilder.append(a(1188, 10157)).append(toIndentedString(this.required)).append("\n");
    stringBuilder.append(a(1186, -10953)).append(toIndentedString(this.deprecated)).append("\n");
    stringBuilder.append(a(1203, 20283)).append(toIndentedString(this.allowEmptyValue)).append("\n");
    stringBuilder.append(a(1198, -8573)).append(toIndentedString(this.style)).append("\n");
    stringBuilder.append(a(1190, -4296)).append(toIndentedString(this.explode)).append("\n");
    stringBuilder.append(a(1201, 11384)).append(toIndentedString(this.allowReserved)).append("\n");
    stringBuilder.append(a(1193, 6982)).append(toIndentedString(this.schema)).append("\n");
    stringBuilder.append(a(1205, -18755)).append(toIndentedString(this.examples)).append("\n");
    stringBuilder.append(a(1194, 23673)).append(toIndentedString(this.example)).append("\n");
    stringBuilder.append(a(1199, 18335)).append(toIndentedString(this.content)).append("\n");
    stringBuilder.append(a(1192, -5417)).append(toIndentedString(this.$ref)).append("\n");
    stringBuilder.append("}");
    Zbqc[] arrayOfZbqc = ZY();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[5]); 
    return stringBuilder.toString();
  }
  
  static String toIndentedString(Object paramObject) {
    return (paramObject == null) ? a(1189, -32243) : paramObject.toString().replace("\n", a(1191, 29599));
  }
  
  public static void Zx(Zbqc[] paramArrayOfZbqc) {
    Zv = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZY() {
    return Zv;
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_5
    //   10: anewarray burp/Zbqc
    //   13: ldc 'ì"¡i~zªØÈëGÅ«É¾'h¡aÖµJ¯yÈÝ\\f!ñ¬Ô{¯ÿÛ8ãzegB¹yfµ`HÆQöûF×ÖçØ#1I\\rOj\\rRoÚÃýï¾Ños\\féÀ­6eX<ÃÝDkb\\nÚSËDþÿ^,µ¹\\ruf>âÙmÂHiUb\ýH\\n§-dAí7È\\rÐ¿ÚeßøozýL];ü·wö2:iÒ¼»34óÛcp$×ËÒQö´N¸¥üpÌÐwà7xô\\f¦\\bîýMc¡÷'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: invokestatic Zx : ([Lburp/Zbqc;)V
    //   25: bipush #24
    //   27: istore_1
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #22
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
    //   75: ldc '+b<×*y¸í'RÐKO)æ·eÖ){ç<Çk'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #14
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #114
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
    //   136: putstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter.a : [Ljava/lang/String;
    //   139: bipush #22
    //   141: anewarray java/lang/String
    //   144: putstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter.b : [Ljava/lang/String;
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
    //   181: tableswitch default -> 249, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 234, 4 -> 239, 5 -> 244
    //   220: bipush #26
    //   222: goto -> 251
    //   225: bipush #108
    //   227: goto -> 251
    //   230: iconst_3
    //   231: goto -> 251
    //   234: bipush #115
    //   236: goto -> 251
    //   239: bipush #51
    //   241: goto -> 251
    //   244: bipush #99
    //   246: goto -> 251
    //   249: bipush #87
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
    int i = (paramInt1 ^ 0x4A1) & 0xFFFF;
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
      char c = 'Ù';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\oas\models\parameters\Parameter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */