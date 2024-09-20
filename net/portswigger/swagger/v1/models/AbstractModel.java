package net.portswigger.swagger.v1.models;

import burp.Zbqc;
import com.fasterxml.Zv8;
import com.fasterxml.Zyi;
import com.fasterxml.Zyx;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.swagger.v1.models.properties.Property;

public abstract class AbstractModel implements Model {
  private ExternalDocs externalDocs;
  
  private String reference;
  
  private String title;
  
  private Map<String, Object> vendorExtensions = new LinkedHashMap<>();
  
  private Xml xml;
  
  private BigDecimal minimum;
  
  private BigDecimal maximum;
  
  private BigDecimal multipleOf;
  
  private Boolean exclusiveMinimum;
  
  private Boolean exclusiveMaximum;
  
  private Integer minLength;
  
  private Integer maxLength;
  
  private String pattern;
  
  protected Map<String, Property> properties;
  
  protected List<String> required;
  
  protected Boolean booleanValue;
  
  private static int Zi;
  
  private static final String a;
  
  @Zyx
  public Boolean getBooleanValue() {
    return this.booleanValue;
  }
  
  public void setBooleanValue(Boolean paramBoolean) {
    this.booleanValue = paramBoolean;
  }
  
  public ExternalDocs getExternalDocs() {
    return this.externalDocs;
  }
  
  public void setExternalDocs(ExternalDocs paramExternalDocs) {
    this.externalDocs = paramExternalDocs;
  }
  
  public String getTitle() {
    return this.title;
  }
  
  public void setTitle(String paramString) {
    this.title = paramString;
  }
  
  @Zyi
  public Map<String, Object> getVendorExtensions() {
    return this.vendorExtensions;
  }
  
  @Zv8
  public void setVendorExtension(String paramString, Object paramObject) {
    if (paramString.startsWith(a))
      this.vendorExtensions.put(paramString, paramObject); 
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
  
  public BigDecimal getMultipleOf() {
    return this.multipleOf;
  }
  
  public void setMultipleOf(BigDecimal paramBigDecimal) {
    this.multipleOf = paramBigDecimal;
  }
  
  public Boolean getExclusiveMinimum() {
    return this.exclusiveMinimum;
  }
  
  public void setExclusiveMinimum(Boolean paramBoolean) {
    this.exclusiveMinimum = paramBoolean;
  }
  
  public Boolean getExclusiveMaximum() {
    return this.exclusiveMaximum;
  }
  
  public void setExclusiveMaximum(Boolean paramBoolean) {
    this.exclusiveMaximum = paramBoolean;
  }
  
  public Integer getMinLength() {
    return this.minLength;
  }
  
  public void setMinLength(Integer paramInteger) {
    this.minLength = paramInteger;
  }
  
  public Integer getMaxLength() {
    return this.maxLength;
  }
  
  public void setMaxLength(Integer paramInteger) {
    this.maxLength = paramInteger;
  }
  
  public String getPattern() {
    return this.pattern;
  }
  
  public void setPattern(String paramString) {
    this.pattern = paramString;
  }
  
  public void setVendorExtensions(Map<String, Object> paramMap) {
    this.vendorExtensions = paramMap;
  }
  
  public Map<String, Property> getProperties() {
    return this.properties;
  }
  
  public void setProperties(Map<String, Property> paramMap) {
    int i = Zg();
    if (paramMap != null)
      for (String str : paramMap.keySet()) {
        addProperty(str, paramMap.get(str));
        if (i == 0)
          break; 
      }  
  }
  
  public void addProperty(String paramString, Property paramProperty) {
    int i = Zg();
    if (paramProperty == null)
      return; 
    if (this.properties == null)
      this.properties = new LinkedHashMap<>(); 
    if (this.required != null)
      for (String str : this.required) {
        if (paramString.equals(str))
          paramProperty.setRequired(true); 
        if (i == 0)
          break; 
      }  
    this.properties.put(paramString, paramProperty);
  }
  
  public List<String> getRequired() {
    ArrayList<String> arrayList = new ArrayList();
    int i = Zx();
    if (this.properties != null)
      for (String str : this.properties.keySet()) {
        Property property = this.properties.get(str);
        if (property != null && property.getRequired())
          arrayList.add(str); 
        if (i != 0)
          break; 
      }  
    Collections.sort(arrayList);
    return (arrayList.size() > 0) ? arrayList : null;
  }
  
  public void setRequired(List<String> paramList) {
    this.required = paramList;
    int i = Zx();
    if (paramList != null && this.properties != null)
      for (String str : paramList) {
        Property property = this.properties.get(str);
        if (property != null)
          property.setRequired(true); 
        if (i != 0)
          break; 
      }  
  }
  
  public void cloneTo(Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast net/portswigger/swagger/v1/models/AbstractModel
    //   4: astore_3
    //   5: aload_3
    //   6: aload_0
    //   7: getfield externalDocs : Lnet/portswigger/swagger/v1/models/ExternalDocs;
    //   10: putfield externalDocs : Lnet/portswigger/swagger/v1/models/ExternalDocs;
    //   13: invokestatic Zg : ()I
    //   16: aload_3
    //   17: aload_0
    //   18: getfield reference : Ljava/lang/String;
    //   21: putfield reference : Ljava/lang/String;
    //   24: istore_2
    //   25: aload_3
    //   26: aload_0
    //   27: getfield title : Ljava/lang/String;
    //   30: putfield title : Ljava/lang/String;
    //   33: aload_3
    //   34: aload_0
    //   35: getfield minimum : Ljava/math/BigDecimal;
    //   38: putfield minimum : Ljava/math/BigDecimal;
    //   41: aload_3
    //   42: aload_0
    //   43: getfield maximum : Ljava/math/BigDecimal;
    //   46: putfield maximum : Ljava/math/BigDecimal;
    //   49: aload_3
    //   50: aload_0
    //   51: getfield minLength : Ljava/lang/Integer;
    //   54: putfield minLength : Ljava/lang/Integer;
    //   57: aload_3
    //   58: aload_0
    //   59: getfield maxLength : Ljava/lang/Integer;
    //   62: putfield maxLength : Ljava/lang/Integer;
    //   65: aload_3
    //   66: aload_0
    //   67: getfield exclusiveMinimum : Ljava/lang/Boolean;
    //   70: putfield exclusiveMinimum : Ljava/lang/Boolean;
    //   73: aload_3
    //   74: aload_0
    //   75: getfield exclusiveMaximum : Ljava/lang/Boolean;
    //   78: putfield exclusiveMaximum : Ljava/lang/Boolean;
    //   81: aload_3
    //   82: aload_0
    //   83: getfield pattern : Ljava/lang/String;
    //   86: putfield pattern : Ljava/lang/String;
    //   89: aload_3
    //   90: aload_0
    //   91: getfield multipleOf : Ljava/math/BigDecimal;
    //   94: putfield multipleOf : Ljava/math/BigDecimal;
    //   97: aload_3
    //   98: aload_0
    //   99: getfield pattern : Ljava/lang/String;
    //   102: putfield pattern : Ljava/lang/String;
    //   105: aload_0
    //   106: getfield properties : Ljava/util/Map;
    //   109: ifnull -> 127
    //   112: aload_3
    //   113: new java/util/LinkedHashMap
    //   116: dup
    //   117: aload_0
    //   118: getfield properties : Ljava/util/Map;
    //   121: invokespecial <init> : (Ljava/util/Map;)V
    //   124: putfield properties : Ljava/util/Map;
    //   127: aload_3
    //   128: aload_0
    //   129: getfield required : Ljava/util/List;
    //   132: putfield required : Ljava/util/List;
    //   135: aload_0
    //   136: getfield vendorExtensions : Ljava/util/Map;
    //   139: ifnonnull -> 154
    //   142: aload_3
    //   143: aload_0
    //   144: getfield vendorExtensions : Ljava/util/Map;
    //   147: putfield vendorExtensions : Ljava/util/Map;
    //   150: iload_2
    //   151: ifne -> 213
    //   154: aload_0
    //   155: getfield vendorExtensions : Ljava/util/Map;
    //   158: invokeinterface keySet : ()Ljava/util/Set;
    //   163: invokeinterface iterator : ()Ljava/util/Iterator;
    //   168: astore #4
    //   170: aload #4
    //   172: invokeinterface hasNext : ()Z
    //   177: ifeq -> 213
    //   180: aload #4
    //   182: invokeinterface next : ()Ljava/lang/Object;
    //   187: checkcast java/lang/String
    //   190: astore #5
    //   192: aload_3
    //   193: aload #5
    //   195: aload_0
    //   196: getfield vendorExtensions : Ljava/util/Map;
    //   199: aload #5
    //   201: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   206: invokevirtual setVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   209: iload_2
    //   210: ifne -> 170
    //   213: aload_0
    //   214: getfield xml : Lnet/portswigger/swagger/v1/models/Xml;
    //   217: ifnonnull -> 232
    //   220: aload_3
    //   221: aload_0
    //   222: getfield xml : Lnet/portswigger/swagger/v1/models/Xml;
    //   225: putfield xml : Lnet/portswigger/swagger/v1/models/Xml;
    //   228: iload_2
    //   229: ifne -> 246
    //   232: aload_3
    //   233: aload_0
    //   234: getfield xml : Lnet/portswigger/swagger/v1/models/Xml;
    //   237: invokevirtual clone : ()Ljava/lang/Object;
    //   240: checkcast net/portswigger/swagger/v1/models/Xml
    //   243: putfield xml : Lnet/portswigger/swagger/v1/models/Xml;
    //   246: aload_3
    //   247: aload_0
    //   248: getfield booleanValue : Ljava/lang/Boolean;
    //   251: putfield booleanValue : Ljava/lang/Boolean;
    //   254: return
  }
  
  public Object clone() {
    return null;
  }
  
  public int hashCode() {
    byte b = 31;
    int j = 1;
    int i = Zx();
    j = 31 * j + ((this.externalDocs == null) ? 0 : this.externalDocs.hashCode());
    j = 31 * j + ((this.vendorExtensions == null) ? 0 : this.vendorExtensions.hashCode());
    j = 31 * j + ((this.reference == null) ? 0 : this.reference.hashCode());
    j = 31 * j + ((this.title == null) ? 0 : this.title.hashCode());
    j = 31 * j + ((this.xml == null) ? 0 : this.xml.hashCode());
    j = 31 * j + ((this.minimum != null) ? this.minimum.hashCode() : 0);
    j = 31 * j + ((this.maximum != null) ? this.maximum.hashCode() : 0);
    j = 31 * j + ((this.minLength != null) ? this.minLength.hashCode() : 0);
    j = 31 * j + ((this.maxLength != null) ? this.maxLength.hashCode() : 0);
    j = 31 * j + ((this.exclusiveMinimum != null) ? this.exclusiveMinimum.hashCode() : 0);
    j = 31 * j + ((this.exclusiveMaximum != null) ? this.exclusiveMaximum.hashCode() : 0);
    j = 31 * j + ((this.pattern != null) ? this.pattern.hashCode() : 0);
    j = 31 * j + ((this.multipleOf != null) ? this.multipleOf.hashCode() : 0);
    j = 31 * j + ((this.pattern != null) ? this.pattern.hashCode() : 0);
    j = 31 * j + ((this.properties != null) ? this.properties.hashCode() : 0);
    j = 31 * j + ((this.required != null) ? this.required.hashCode() : 0);
    j = 31 * j + ((this.booleanValue != null) ? this.booleanValue.hashCode() : 0);
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
    return j;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    AbstractModel abstractModel = (AbstractModel)paramObject;
    if (this.externalDocs == null) {
      if (abstractModel.externalDocs != null)
        return false; 
    } else if (!this.externalDocs.equals(abstractModel.externalDocs)) {
      return false;
    } 
    if (this.vendorExtensions == null) {
      if (abstractModel.vendorExtensions != null)
        return false; 
    } else if (!this.vendorExtensions.equals(abstractModel.vendorExtensions)) {
      return false;
    } 
    if (this.title == null) {
      if (abstractModel.title != null)
        return false; 
    } else if (!this.title.equals(abstractModel.title)) {
      return false;
    } 
    if (this.reference == null) {
      if (abstractModel.reference != null)
        return false; 
    } else if (!this.reference.equals(abstractModel.reference)) {
      return false;
    } 
    if (this.xml == null) {
      if (abstractModel.xml != null)
        return false; 
    } else if (!this.xml.equals(abstractModel.xml)) {
      return false;
    } 
    return ((this.exclusiveMaximum != null) ? !this.exclusiveMaximum.equals(abstractModel.exclusiveMaximum) : (abstractModel.exclusiveMaximum != null)) ? false : (((this.exclusiveMinimum != null) ? !this.exclusiveMinimum.equals(abstractModel.exclusiveMinimum) : (abstractModel.exclusiveMinimum != null)) ? false : (((this.minimum != null) ? !this.minimum.equals(abstractModel.minimum) : (abstractModel.minimum != null)) ? false : (((this.minLength != null) ? !this.minLength.equals(abstractModel.minLength) : (abstractModel.minLength != null)) ? false : (((this.maxLength != null) ? !this.maxLength.equals(abstractModel.maxLength) : (abstractModel.maxLength != null)) ? false : (((this.pattern != null) ? !this.pattern.equals(abstractModel.pattern) : (abstractModel.pattern != null)) ? false : (((this.multipleOf != null) ? !this.multipleOf.equals(abstractModel.multipleOf) : (abstractModel.multipleOf != null)) ? false : (((this.pattern != null) ? !this.pattern.equals(abstractModel.pattern) : (abstractModel.pattern != null)) ? false : (((this.required != null) ? !this.required.equals(abstractModel.required) : (abstractModel.required != null)) ? false : (((this.properties != null) ? !this.properties.equals(abstractModel.properties) : (abstractModel.properties != null)) ? false : (((this.booleanValue != null) ? !this.booleanValue.equals(abstractModel.booleanValue) : (abstractModel.booleanValue != null)) ? false : ((this.maximum != null) ? this.maximum.equals(abstractModel.maximum) : ((abstractModel.maximum == null)))))))))))));
  }
  
  @Zyx
  public String getReference() {
    return this.reference;
  }
  
  public void setReference(String paramString) {
    this.reference = paramString;
  }
  
  public Xml getXml() {
    return this.xml;
  }
  
  public void setXml(Xml paramXml) {
    this.xml = paramXml;
  }
  
  public static void ZK(int paramInt) {
    Zi = paramInt;
  }
  
  public static int Zg() {
    return Zi;
  }
  
  public static int Zx() {
    int i = Zg();
    return (i == 0) ? 43 : 0;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zx : ()I
    //   3: ifeq -> 11
    //   6: bipush #68
    //   8: invokestatic ZK : (I)V
    //   11: bipush #22
    //   13: ldc ''
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic net/portswigger/swagger/v1/models/AbstractModel.a : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #97
    //   94: goto -> 124
    //   97: bipush #35
    //   99: goto -> 124
    //   102: bipush #84
    //   104: goto -> 124
    //   107: bipush #120
    //   109: goto -> 124
    //   112: bipush #60
    //   114: goto -> 124
    //   117: bipush #41
    //   119: goto -> 124
    //   122: bipush #77
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\AbstractModel.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */