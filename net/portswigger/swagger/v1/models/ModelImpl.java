package net.portswigger.swagger.v1.models;

import com.fasterxml.Zva;
import com.fasterxml.Zy1;
import com.fasterxml.Zyx;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.swagger.v1.models.properties.Property;

@Zva({"type", "required", "discriminator", "properties"})
public class ModelImpl extends AbstractModel {
  public static final String OBJECT;
  
  private String type;
  
  private String format;
  
  private String name;
  
  private Boolean allowEmptyValue;
  
  private Boolean uniqueItems;
  
  private boolean isSimple = false;
  
  private String description;
  
  private Object example;
  
  private Property additionalProperties;
  
  private String discriminator;
  
  @Zy1("default")
  private String defaultValue;
  
  private List<String> _enum;
  
  private BigDecimal minimum;
  
  private BigDecimal maximum;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public ModelImpl _enum(List<String> paramList) {
    this._enum = paramList;
    return this;
  }
  
  public ModelImpl _enum(String paramString) {
    if (this._enum == null)
      this._enum = new ArrayList<>(); 
    this._enum.add(paramString);
    return this;
  }
  
  public List<String> getEnum() {
    return this._enum;
  }
  
  public void setEnum(List<String> paramList) {
    this._enum = paramList;
  }
  
  public ModelImpl discriminator(String paramString) {
    setDiscriminator(paramString);
    return this;
  }
  
  public ModelImpl type(String paramString) {
    setType(paramString);
    return this;
  }
  
  public ModelImpl format(String paramString) {
    setFormat(paramString);
    return this;
  }
  
  public ModelImpl name(String paramString) {
    setName(paramString);
    return this;
  }
  
  public ModelImpl uniqueItems(Boolean paramBoolean) {
    setUniqueItems(paramBoolean);
    return this;
  }
  
  public ModelImpl allowEmptyValue(Boolean paramBoolean) {
    setAllowEmptyValue(paramBoolean);
    return this;
  }
  
  public ModelImpl description(String paramString) {
    setDescription(paramString);
    return this;
  }
  
  public ModelImpl property(String paramString, Property paramProperty) {
    addProperty(paramString, paramProperty);
    return this;
  }
  
  public ModelImpl example(Object paramObject) {
    setExample(paramObject);
    return this;
  }
  
  public ModelImpl additionalProperties(Property paramProperty) {
    setAdditionalProperties(paramProperty);
    return this;
  }
  
  public ModelImpl required(String paramString) {
    addRequired(paramString);
    return this;
  }
  
  public ModelImpl xml(Xml paramXml) {
    setXml(paramXml);
    return this;
  }
  
  public ModelImpl minimum(BigDecimal paramBigDecimal) {
    this.minimum = paramBigDecimal;
    return this;
  }
  
  public ModelImpl maximum(BigDecimal paramBigDecimal) {
    this.maximum = paramBigDecimal;
    return this;
  }
  
  public String getDiscriminator() {
    return this.discriminator;
  }
  
  public void setDiscriminator(String paramString) {
    this.discriminator = paramString;
  }
  
  @Zyx
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  @Zyx
  public boolean isSimple() {
    return this.isSimple;
  }
  
  public void setSimple(boolean paramBoolean) {
    this.isSimple = paramBoolean;
  }
  
  public Property getAdditionalProperties() {
    return this.additionalProperties;
  }
  
  public void setAdditionalProperties(Property paramProperty) {
    type(a(25352, -31834));
    this.additionalProperties = paramProperty;
  }
  
  public Boolean getAllowEmptyValue() {
    return this.allowEmptyValue;
  }
  
  public void setAllowEmptyValue(Boolean paramBoolean) {
    if (paramBoolean != null)
      this.allowEmptyValue = paramBoolean; 
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getFormat() {
    return this.format;
  }
  
  public void setFormat(String paramString) {
    this.format = paramString;
  }
  
  public void addRequired(String paramString) {
    if (this.required == null)
      this.required = new ArrayList<>(); 
    this.required.add(paramString);
    Property property = this.properties.get(paramString);
    if (property != null)
      property.setRequired(true); 
  }
  
  public Object getExample() {
    return this.example;
  }
  
  public void setExample(Object paramObject) {
    this.example = paramObject;
  }
  
  public Object getDefaultValue() {
    try {
      if (this.defaultValue == null)
        return null; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (a(25353, -12256).equals(this.type))
        return Integer.valueOf(this.defaultValue); 
      if (a(25355, 11591).equals(this.type))
        return new BigDecimal(this.defaultValue); 
    } catch (Exception exception) {
      return null;
    } 
    return this.defaultValue;
  }
  
  public void setDefaultValue(String paramString) {
    this.defaultValue = paramString;
  }
  
  public BigDecimal getMinimum() {
    return this.minimum;
  }
  
  public void setMinimum(BigDecimal paramBigDecimal) {
    this.minimum = paramBigDecimal;
  }
  
  public BigDecimal getMaximum() {
    return this.maximum;
  }
  
  public void setMaximum(BigDecimal paramBigDecimal) {
    this.maximum = paramBigDecimal;
  }
  
  public Boolean getUniqueItems() {
    return this.uniqueItems;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof ModelImpl))
      return false; 
    if (!super.equals(paramObject))
      return false; 
    ModelImpl modelImpl = (ModelImpl)paramObject;
    return (this.isSimple != modelImpl.isSimple) ? false : (((this.type != null) ? !this.type.equals(modelImpl.type) : (modelImpl.type != null)) ? false : (((this.format != null) ? !this.format.equals(modelImpl.format) : (modelImpl.format != null)) ? false : (((this.name != null) ? !this.name.equals(modelImpl.name) : (modelImpl.name != null)) ? false : (((this.allowEmptyValue != null) ? !this.allowEmptyValue.equals(modelImpl.allowEmptyValue) : (modelImpl.allowEmptyValue != null)) ? false : (((this.uniqueItems != null) ? !this.uniqueItems.equals(modelImpl.uniqueItems) : (modelImpl.uniqueItems != null)) ? false : (((this.description != null) ? !this.description.equals(modelImpl.description) : (modelImpl.description != null)) ? false : (((this.example != null) ? !this.example.equals(modelImpl.example) : (modelImpl.example != null)) ? false : (((this.additionalProperties != null) ? !this.additionalProperties.equals(modelImpl.additionalProperties) : (modelImpl.additionalProperties != null)) ? false : (((this.discriminator != null) ? !this.discriminator.equals(modelImpl.discriminator) : (modelImpl.discriminator != null)) ? false : (((this.defaultValue != null) ? !this.defaultValue.equals(modelImpl.defaultValue) : (modelImpl.defaultValue != null)) ? false : (((this._enum != null) ? !this._enum.equals(modelImpl._enum) : (modelImpl._enum != null)) ? false : (((this.minimum != null) ? !this.minimum.equals(modelImpl.minimum) : (modelImpl.minimum != null)) ? false : ((this.maximum != null) ? this.maximum.equals(modelImpl.maximum) : ((modelImpl.maximum == null)))))))))))))));
  }
  
  public int hashCode() {
    null = super.hashCode();
    null = 31 * null + ((this.type != null) ? this.type.hashCode() : 0);
    null = 31 * null + ((this.format != null) ? this.format.hashCode() : 0);
    null = 31 * null + ((this.name != null) ? this.name.hashCode() : 0);
    null = 31 * null + ((this.allowEmptyValue != null) ? this.allowEmptyValue.hashCode() : 0);
    null = 31 * null + ((this.uniqueItems != null) ? this.uniqueItems.hashCode() : 0);
    null = 31 * null + (this.isSimple ? 1 : 0);
    null = 31 * null + ((this.description != null) ? this.description.hashCode() : 0);
    null = 31 * null + ((this.example != null) ? this.example.hashCode() : 0);
    null = 31 * null + ((this.additionalProperties != null) ? this.additionalProperties.hashCode() : 0);
    null = 31 * null + ((this.discriminator != null) ? this.discriminator.hashCode() : 0);
    null = 31 * null + ((this.defaultValue != null) ? this.defaultValue.hashCode() : 0);
    null = 31 * null + ((this._enum != null) ? this._enum.hashCode() : 0);
    null = 31 * null + ((this.minimum != null) ? this.minimum.hashCode() : 0);
    return 31 * null + ((this.maximum != null) ? this.maximum.hashCode() : 0);
  }
  
  public void setUniqueItems(Boolean paramBoolean) {
    this.uniqueItems = paramBoolean;
  }
  
  public Object clone() {
    ModelImpl modelImpl = new ModelImpl();
    cloneTo(modelImpl);
    modelImpl.type = this.type;
    modelImpl.name = this.name;
    modelImpl.isSimple = this.isSimple;
    modelImpl.description = this.description;
    modelImpl.example = this.example;
    modelImpl.additionalProperties = this.additionalProperties;
    modelImpl.discriminator = this.discriminator;
    modelImpl.defaultValue = this.defaultValue;
    modelImpl.minimum = this.minimum;
    modelImpl.maximum = this.maximum;
    return modelImpl;
  }
  
  @Zyx
  public List<String> getSpecSpecifiedRequired() {
    return this.required;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '¶Ó!ÛGz¨UýÐ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #7
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #119
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 153
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
    //   67: ldc '©®è.gì©sÎgB$'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #27
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 153
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
    //   128: putstatic net/portswigger/swagger/v1/models/ModelImpl.b : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/swagger/v1/models/ModelImpl.c : [Ljava/lang/String;
    //   138: sipush #25354
    //   141: sipush #-7352
    //   144: invokestatic a : (II)Ljava/lang/String;
    //   147: putstatic net/portswigger/swagger/v1/models/ModelImpl.OBJECT : Ljava/lang/String;
    //   150: goto -> 312
    //   153: dup_x2
    //   154: pop
    //   155: invokevirtual toCharArray : ()[C
    //   158: dup_x1
    //   159: arraylength
    //   160: dup_x2
    //   161: pop
    //   162: iconst_0
    //   163: istore #6
    //   165: dup2_x1
    //   166: pop2
    //   167: dup_x2
    //   168: iconst_1
    //   169: if_icmpgt -> 272
    //   172: dup2
    //   173: swap
    //   174: iload #6
    //   176: dup2_x1
    //   177: caload
    //   178: swap
    //   179: iload #6
    //   181: bipush #7
    //   183: irem
    //   184: tableswitch default -> 254, 0 -> 224, 1 -> 229, 2 -> 234, 3 -> 239, 4 -> 244, 5 -> 249
    //   224: bipush #120
    //   226: goto -> 256
    //   229: bipush #74
    //   231: goto -> 256
    //   234: bipush #100
    //   236: goto -> 256
    //   239: bipush #115
    //   241: goto -> 256
    //   244: bipush #43
    //   246: goto -> 256
    //   249: bipush #99
    //   251: goto -> 256
    //   254: bipush #102
    //   256: ixor
    //   257: ixor
    //   258: i2c
    //   259: castore
    //   260: iinc #6, 1
    //   263: dup
    //   264: ifne -> 272
    //   267: dup2
    //   268: dup_x1
    //   269: goto -> 176
    //   272: dup2_x1
    //   273: pop2
    //   274: dup_x2
    //   275: iload #6
    //   277: if_icmpgt -> 172
    //   280: pop
    //   281: new java/lang/String
    //   284: dup_x1
    //   285: swap
    //   286: invokespecial <init> : ([C)V
    //   289: invokevirtual intern : ()Ljava/lang/String;
    //   292: swap
    //   293: pop
    //   294: swap
    //   295: tableswitch default -> 39, 0 -> 98
    //   312: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6309) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      char c = 'Å';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\ModelImpl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */