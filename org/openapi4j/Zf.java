package org.openapi4j;

import burp.Zbqc;
import com.fasterxml.Zb.Za;
import com.fasterxml.Zb.Zmt;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zy1;
import com.fasterxml.Zyj;
import com.fasterxml.Zyx;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zf extends Zk<Zf> {
  @Zyx
  private Zf additionalProperties;
  
  @Zyx
  private Boolean additionalPropertiesAllowed;
  
  @Zy1("default")
  private Object defaultValue;
  
  private String description;
  
  private Boolean deprecated;
  
  private Zp6 discriminator;
  
  @Zy1("enum")
  private List<Object> enums;
  
  private Object example;
  
  private Boolean exclusiveMaximum;
  
  private Boolean exclusiveMinimum;
  
  private Zb externalDocs;
  
  private String format;
  
  @Zy1("items")
  private Zf itemsSchema;
  
  private Number maximum;
  
  private Number minimum;
  
  private Integer maxItems;
  
  private Integer minItems;
  
  private Integer maxLength;
  
  private Integer minLength;
  
  private Integer maxProperties;
  
  private Integer minProperties;
  
  private Number multipleOf;
  
  @Zy1("not")
  private Zf notSchema;
  
  private Boolean nullable;
  
  private String pattern;
  
  private Map<String, Zf> properties;
  
  @Zy1("required")
  private List<String> requiredFields;
  
  @Zy1("allOf")
  private List<Zf> allOfSchemas;
  
  @Zy1("anyOf")
  private List<Zf> anyOfSchemas;
  
  @Zy1("oneOf")
  private List<Zf> oneOfSchemas;
  
  private Boolean readOnly;
  
  private Boolean writeOnly;
  
  private String type;
  
  private String title;
  
  private Boolean uniqueItems;
  
  private Zph xml;
  
  static final boolean $assertionsDisabled;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public String getTitle() {
    return this.title;
  }
  
  public Zf setTitle(String paramString) {
    this.title = paramString;
    return this;
  }
  
  public Number getMultipleOf() {
    return this.multipleOf;
  }
  
  public Zf setMultipleOf(Number paramNumber) {
    this.multipleOf = paramNumber;
    return this;
  }
  
  public Number getMaximum() {
    return this.maximum;
  }
  
  public Zf setMaximum(Number paramNumber) {
    this.maximum = paramNumber;
    return this;
  }
  
  public Boolean getExclusiveMaximum() {
    return this.exclusiveMaximum;
  }
  
  public boolean isExclusiveMaximum() {
    return Boolean.TRUE.equals(this.exclusiveMaximum);
  }
  
  public Zf setExclusiveMaximum(Boolean paramBoolean) {
    this.exclusiveMaximum = paramBoolean;
    return this;
  }
  
  public Number getMinimum() {
    return this.minimum;
  }
  
  public Zf setMinimum(Number paramNumber) {
    this.minimum = paramNumber;
    return this;
  }
  
  public Boolean getExclusiveMinimum() {
    return this.exclusiveMinimum;
  }
  
  public boolean isExclusiveMinimum() {
    return Boolean.TRUE.equals(this.exclusiveMinimum);
  }
  
  public Zf setExclusiveMinimum(Boolean paramBoolean) {
    this.exclusiveMinimum = paramBoolean;
    return this;
  }
  
  public Integer getMaxLength() {
    return this.maxLength;
  }
  
  public Zf setMaxLength(Integer paramInteger) {
    this.maxLength = paramInteger;
    return this;
  }
  
  public Integer getMinLength() {
    return this.minLength;
  }
  
  public Zf setMinLength(Integer paramInteger) {
    this.minLength = paramInteger;
    return this;
  }
  
  public String getPattern() {
    return this.pattern;
  }
  
  public Zf setPattern(String paramString) {
    this.pattern = paramString;
    return this;
  }
  
  public Integer getMaxItems() {
    return this.maxItems;
  }
  
  public Zf setMaxItems(Integer paramInteger) {
    this.maxItems = paramInteger;
    return this;
  }
  
  public Integer getMinItems() {
    return this.minItems;
  }
  
  public Zf setMinItems(Integer paramInteger) {
    this.minItems = paramInteger;
    return this;
  }
  
  public Boolean getUniqueItems() {
    return this.uniqueItems;
  }
  
  public boolean isUniqueItems() {
    return Boolean.TRUE.equals(this.uniqueItems);
  }
  
  public Zf setUniqueItems(Boolean paramBoolean) {
    this.uniqueItems = paramBoolean;
    return this;
  }
  
  public Integer getMaxProperties() {
    return this.maxProperties;
  }
  
  public Zf setMaxProperties(Integer paramInteger) {
    this.maxProperties = paramInteger;
    return this;
  }
  
  public Integer getMinProperties() {
    return this.minProperties;
  }
  
  public Zf setMinProperties(Integer paramInteger) {
    this.minProperties = paramInteger;
    return this;
  }
  
  public List<String> getRequiredFields() {
    return this.requiredFields;
  }
  
  public Zf setRequiredFields(List<String> paramList) {
    this.requiredFields = paramList;
    return this;
  }
  
  public boolean hasRequiredFields() {
    return (this.requiredFields != null);
  }
  
  public Zf addRequiredField(String paramString) {
    this.requiredFields = listAdd(this.requiredFields, paramString);
    return this;
  }
  
  public Zf insertRequiredField(int paramInt, String paramString) {
    this.requiredFields = listAdd(this.requiredFields, paramInt, paramString);
    return this;
  }
  
  public Zf removeRequiredField(String paramString) {
    listRemove(this.requiredFields, paramString);
    return this;
  }
  
  public List<Object> getEnums() {
    return this.enums;
  }
  
  public Zf setEnums(List<Object> paramList) {
    this.enums = paramList;
    return this;
  }
  
  public boolean hasEnums() {
    return (this.enums != null);
  }
  
  public Zf addEnum(Object paramObject) {
    this.enums = listAdd(this.enums, paramObject);
    return this;
  }
  
  public Zf insertEnum(int paramInt, Object paramObject) {
    this.enums = listAdd(this.enums, paramInt, paramObject);
    return this;
  }
  
  public Zf removeEnum(Object paramObject) {
    listRemove(this.enums, paramObject);
    return this;
  }
  
  public String getType() {
    return this.type;
  }
  
  @Zyx
  public String getSupposedType(Zx paramZx) {
    // Byte code:
    //   0: invokestatic ZL : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: aload_1
    //   5: invokevirtual getFlatSchema : (Lorg/openapi4j/Zx;)Lorg/openapi4j/Zf;
    //   8: astore_3
    //   9: astore_2
    //   10: getstatic org/openapi4j/Zf.$assertionsDisabled : Z
    //   13: ifne -> 28
    //   16: aload_3
    //   17: ifnonnull -> 28
    //   20: new java/lang/AssertionError
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: athrow
    //   28: aload_3
    //   29: getfield type : Ljava/lang/String;
    //   32: ifnull -> 40
    //   35: aload_3
    //   36: getfield type : Ljava/lang/String;
    //   39: areturn
    //   40: aload_3
    //   41: invokevirtual getProperties : ()Ljava/util/Map;
    //   44: ifnull -> 57
    //   47: sipush #14346
    //   50: sipush #-15253
    //   53: invokestatic b : (II)Ljava/lang/String;
    //   56: areturn
    //   57: aload_3
    //   58: invokevirtual getItemsSchema : ()Lorg/openapi4j/Zf;
    //   61: ifnull -> 74
    //   64: sipush #14348
    //   67: sipush #-19212
    //   70: invokestatic b : (II)Ljava/lang/String;
    //   73: areturn
    //   74: aload_3
    //   75: invokevirtual getFormat : ()Ljava/lang/String;
    //   78: ifnull -> 290
    //   81: aload_3
    //   82: invokevirtual getFormat : ()Ljava/lang/String;
    //   85: astore #4
    //   87: iconst_m1
    //   88: istore #5
    //   90: aload #4
    //   92: invokevirtual hashCode : ()I
    //   95: lookupswitch default -> 228, -1325958191 -> 208, 97526364 -> 184, 100359822 -> 136, 100359917 -> 160
    //   136: aload #4
    //   138: sipush #14345
    //   141: sipush #-31377
    //   144: invokestatic b : (II)Ljava/lang/String;
    //   147: invokevirtual equals : (Ljava/lang/Object;)Z
    //   150: ifeq -> 228
    //   153: iconst_0
    //   154: istore #5
    //   156: aload_2
    //   157: ifnull -> 228
    //   160: aload #4
    //   162: sipush #14347
    //   165: sipush #-11827
    //   168: invokestatic b : (II)Ljava/lang/String;
    //   171: invokevirtual equals : (Ljava/lang/Object;)Z
    //   174: ifeq -> 228
    //   177: iconst_1
    //   178: istore #5
    //   180: aload_2
    //   181: ifnull -> 228
    //   184: aload #4
    //   186: sipush #14351
    //   189: sipush #-10742
    //   192: invokestatic b : (II)Ljava/lang/String;
    //   195: invokevirtual equals : (Ljava/lang/Object;)Z
    //   198: ifeq -> 228
    //   201: iconst_2
    //   202: istore #5
    //   204: aload_2
    //   205: ifnull -> 228
    //   208: aload #4
    //   210: sipush #14350
    //   213: sipush #11635
    //   216: invokestatic b : (II)Ljava/lang/String;
    //   219: invokevirtual equals : (Ljava/lang/Object;)Z
    //   222: ifeq -> 228
    //   225: iconst_3
    //   226: istore #5
    //   228: iload #5
    //   230: tableswitch default -> 280, 0 -> 260, 1 -> 260, 2 -> 270, 3 -> 270
    //   260: sipush #14337
    //   263: sipush #25954
    //   266: invokestatic b : (II)Ljava/lang/String;
    //   269: areturn
    //   270: sipush #14349
    //   273: sipush #22760
    //   276: invokestatic b : (II)Ljava/lang/String;
    //   279: areturn
    //   280: sipush #14344
    //   283: sipush #-8410
    //   286: invokestatic b : (II)Ljava/lang/String;
    //   289: areturn
    //   290: aconst_null
    //   291: areturn
  }
  
  @Zyx
  public Zf getFlatSchema(Zx paramZx) {
    try {
      if (isRef())
        try {
          if (paramZx != null)
            try {
              return getReference(paramZx).<Zf>Zg(Zf.class);
            } catch (Zau zau) {
              return null;
            }  
          return this;
        } catch (Zau zau) {
          throw b(null);
        }  
    } catch (Zau zau) {
      throw b(null);
    } 
    return this;
  }
  
  public Zf setType(String paramString) {
    this.type = paramString;
    return this;
  }
  
  public List<Zf> getAllOfSchemas() {
    return this.allOfSchemas;
  }
  
  public Zf setAllOfSchemas(List<Zf> paramList) {
    this.allOfSchemas = paramList;
    return this;
  }
  
  public boolean hasAllOfSchemas() {
    return (this.allOfSchemas != null && !this.allOfSchemas.isEmpty());
  }
  
  public Zf addAllOfSchema(Zf paramZf) {
    this.allOfSchemas = listAdd(this.allOfSchemas, paramZf);
    return this;
  }
  
  public Zf insertAllOfSchema(int paramInt, Zf paramZf) {
    this.allOfSchemas = listAdd(this.allOfSchemas, paramInt, paramZf);
    return this;
  }
  
  public Zf removeAllOfSchema(Zf paramZf) {
    listRemove(this.allOfSchemas, paramZf);
    return this;
  }
  
  public List<Zf> getOneOfSchemas() {
    return this.oneOfSchemas;
  }
  
  public Zf setOneOfSchemas(List<Zf> paramList) {
    this.oneOfSchemas = paramList;
    return this;
  }
  
  public boolean hasOneOfSchemas() {
    return (this.oneOfSchemas != null && !this.oneOfSchemas.isEmpty());
  }
  
  public Zf addOneOfSchema(Zf paramZf) {
    this.oneOfSchemas = listAdd(this.oneOfSchemas, paramZf);
    return this;
  }
  
  public Zf insertOneOfSchema(int paramInt, Zf paramZf) {
    this.oneOfSchemas = listAdd(this.oneOfSchemas, paramInt, paramZf);
    return this;
  }
  
  public Zf removeOneOfSchema(Zf paramZf) {
    listRemove(this.oneOfSchemas, paramZf);
    return this;
  }
  
  public List<Zf> getAnyOfSchemas() {
    return this.anyOfSchemas;
  }
  
  public Zf setAnyOfSchemas(List<Zf> paramList) {
    this.anyOfSchemas = paramList;
    return this;
  }
  
  public boolean hasAnyOfSchemas() {
    return (this.anyOfSchemas != null && !this.anyOfSchemas.isEmpty());
  }
  
  public Zf addAnyOfSchema(Zf paramZf) {
    this.anyOfSchemas = listAdd(this.anyOfSchemas, paramZf);
    return this;
  }
  
  public Zf insertAnyOfSchema(int paramInt, Zf paramZf) {
    this.anyOfSchemas = listAdd(this.anyOfSchemas, paramInt, paramZf);
    return this;
  }
  
  public Zf removeAnyOfSchema(Zf paramZf) {
    listRemove(this.anyOfSchemas, paramZf);
    return this;
  }
  
  public Zf getNotSchema() {
    return this.notSchema;
  }
  
  public Zf setNotSchema(Zf paramZf) {
    this.notSchema = paramZf;
    return this;
  }
  
  public Zf getItemsSchema() {
    return this.itemsSchema;
  }
  
  public Zf setItemsSchema(Zf paramZf) {
    this.itemsSchema = paramZf;
    return this;
  }
  
  public Map<String, Zf> getProperties() {
    return this.properties;
  }
  
  public Zf setProperties(Map<String, Zf> paramMap) {
    this.properties = paramMap;
    return this;
  }
  
  public boolean hasProperty(String paramString) {
    return mapHas(this.properties, paramString);
  }
  
  public Zf getProperty(String paramString) {
    return (Zf)mapGet(this.properties, paramString);
  }
  
  public Zf setProperty(String paramString, Zf paramZf) {
    if (this.properties == null)
      this.properties = new HashMap<>(); 
    this.properties.put(paramString, paramZf);
    return this;
  }
  
  public Zf removeProperty(String paramString) {
    mapRemove(this.properties, paramString);
    return this;
  }
  
  public Zf getAdditionalProperties() {
    return this.additionalProperties;
  }
  
  public Zf setAdditionalProperties(Zf paramZf) {
    this.additionalProperties = paramZf;
    this.additionalPropertiesAllowed = Boolean.valueOf((paramZf == null));
    return this;
  }
  
  @Zy1(value = "additionalProperties", Zk = Zyj.WRITE_ONLY)
  private void setMappedAdditionalProperties(Zb paramZb) throws Zmt {
    Zbqc[] arrayOfZbqc = Zc.ZL();
    try {
      if (paramZb.ZL()) {
        try {
          setAdditionalPropertiesAllowed(Boolean.valueOf(paramZb.ZY()));
          if (arrayOfZbqc != null) {
            try {
              if (paramZb.ZB())
                setAdditionalProperties((Zf)Zpl.Zo.Zi((Za)paramZb, Zf.class)); 
            } catch (Zmt zmt) {
              throw b(null);
            } 
            return;
          } 
        } catch (Zmt zmt) {
          throw b(null);
        } 
        return;
      } 
    } catch (Zmt zmt) {
      throw b(null);
    } 
    try {
      if (paramZb.ZB())
        setAdditionalProperties((Zf)Zpl.Zo.Zi((Za)paramZb, Zf.class)); 
    } catch (Zmt zmt) {
      throw b(null);
    } 
  }
  
  @Zy1(value = "additionalProperties", Zk = Zyj.READ_ONLY)
  private Object getMappedAdditionalProperties() {
    return hasAdditionalProperties() ? getAdditionalProperties() : ((getAdditionalPropertiesAllowed() != null) ? getAdditionalPropertiesAllowed() : null);
  }
  
  public boolean hasAdditionalProperties() {
    return (this.additionalProperties != null);
  }
  
  public Boolean getAdditionalPropertiesAllowed() {
    return this.additionalPropertiesAllowed;
  }
  
  public boolean isAdditionalPropertiesAllowed() {
    return (this.additionalPropertiesAllowed == null || Boolean.TRUE.equals(this.additionalPropertiesAllowed));
  }
  
  public Zf setAdditionalPropertiesAllowed(Boolean paramBoolean) {
    this.additionalPropertiesAllowed = paramBoolean;
    this.additionalProperties = null;
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public Zf setDescription(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public String getFormat() {
    return this.format;
  }
  
  public Zf setFormat(String paramString) {
    this.format = paramString;
    return this;
  }
  
  public Object getDefault() {
    return this.defaultValue;
  }
  
  public Zf setDefault(Object paramObject) {
    this.defaultValue = paramObject;
    return this;
  }
  
  public Boolean getNullable() {
    return this.nullable;
  }
  
  public boolean isNullable() {
    return Boolean.TRUE.equals(this.nullable);
  }
  
  public Zf setNullable(Boolean paramBoolean) {
    this.nullable = paramBoolean;
    return this;
  }
  
  public Zp6 getDiscriminator() {
    return this.discriminator;
  }
  
  public Zf setDiscriminator(Zp6 paramZp6) {
    this.discriminator = paramZp6;
    return this;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public boolean isReadOnly() {
    return Boolean.TRUE.equals(this.readOnly);
  }
  
  public Zf setReadOnly(Boolean paramBoolean) {
    this.readOnly = paramBoolean;
    return this;
  }
  
  public Boolean getWriteOnly() {
    return this.writeOnly;
  }
  
  public boolean isWriteOnly() {
    return Boolean.TRUE.equals(this.writeOnly);
  }
  
  public Zf setWriteOnly(Boolean paramBoolean) {
    this.writeOnly = paramBoolean;
    return this;
  }
  
  public Zph getXml() {
    return this.xml;
  }
  
  public Zf setXml(Zph paramZph) {
    this.xml = paramZph;
    return this;
  }
  
  public Zb getExternalDocs() {
    return this.externalDocs;
  }
  
  public Zf setExternalDocs(Zb paramZb) {
    this.externalDocs = paramZb;
    return this;
  }
  
  public Object getExample() {
    return this.example;
  }
  
  public Zf setExample(Object paramObject) {
    this.example = paramObject;
    return this;
  }
  
  public Boolean getDeprecated() {
    return this.deprecated;
  }
  
  public boolean isDeprecated() {
    return Boolean.TRUE.equals(this.deprecated);
  }
  
  public Zf setDeprecated(Boolean paramBoolean) {
    this.deprecated = paramBoolean;
    return this;
  }
  
  public Zf copy() {
    // Byte code:
    //   0: invokestatic ZL : ()[Lburp/Zbqc;
    //   3: new org/openapi4j/Zf
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_2
    //   11: astore_1
    //   12: aload_0
    //   13: invokevirtual isRef : ()Z
    //   16: ifeq -> 39
    //   19: aload_2
    //   20: aload_0
    //   21: invokevirtual getRef : ()Ljava/lang/String;
    //   24: invokevirtual setRef : (Ljava/lang/String;)V
    //   27: aload_2
    //   28: aload_0
    //   29: invokevirtual getCanonicalRef : ()Ljava/lang/String;
    //   32: invokevirtual setCanonicalRef : (Ljava/lang/String;)V
    //   35: aload_1
    //   36: ifnull -> 459
    //   39: aload_2
    //   40: aload_0
    //   41: invokevirtual getTitle : ()Ljava/lang/String;
    //   44: invokevirtual setTitle : (Ljava/lang/String;)Lorg/openapi4j/Zf;
    //   47: pop
    //   48: aload_2
    //   49: aload_0
    //   50: invokevirtual getMultipleOf : ()Ljava/lang/Number;
    //   53: invokevirtual setMultipleOf : (Ljava/lang/Number;)Lorg/openapi4j/Zf;
    //   56: pop
    //   57: aload_2
    //   58: aload_0
    //   59: invokevirtual getMaximum : ()Ljava/lang/Number;
    //   62: invokevirtual setMaximum : (Ljava/lang/Number;)Lorg/openapi4j/Zf;
    //   65: pop
    //   66: aload_2
    //   67: aload_0
    //   68: invokevirtual getExclusiveMaximum : ()Ljava/lang/Boolean;
    //   71: invokevirtual setExclusiveMaximum : (Ljava/lang/Boolean;)Lorg/openapi4j/Zf;
    //   74: pop
    //   75: aload_2
    //   76: aload_0
    //   77: invokevirtual getMinimum : ()Ljava/lang/Number;
    //   80: invokevirtual setMinimum : (Ljava/lang/Number;)Lorg/openapi4j/Zf;
    //   83: pop
    //   84: aload_2
    //   85: aload_0
    //   86: invokevirtual getExclusiveMinimum : ()Ljava/lang/Boolean;
    //   89: invokevirtual setExclusiveMinimum : (Ljava/lang/Boolean;)Lorg/openapi4j/Zf;
    //   92: pop
    //   93: aload_2
    //   94: aload_0
    //   95: invokevirtual getMaxLength : ()Ljava/lang/Integer;
    //   98: invokevirtual setMaxLength : (Ljava/lang/Integer;)Lorg/openapi4j/Zf;
    //   101: pop
    //   102: aload_2
    //   103: aload_0
    //   104: invokevirtual getMinLength : ()Ljava/lang/Integer;
    //   107: invokevirtual setMinLength : (Ljava/lang/Integer;)Lorg/openapi4j/Zf;
    //   110: pop
    //   111: aload_2
    //   112: aload_0
    //   113: invokevirtual getPattern : ()Ljava/lang/String;
    //   116: invokevirtual setPattern : (Ljava/lang/String;)Lorg/openapi4j/Zf;
    //   119: pop
    //   120: aload_2
    //   121: aload_0
    //   122: invokevirtual getMaxItems : ()Ljava/lang/Integer;
    //   125: invokevirtual setMaxItems : (Ljava/lang/Integer;)Lorg/openapi4j/Zf;
    //   128: pop
    //   129: aload_2
    //   130: aload_0
    //   131: invokevirtual getMinItems : ()Ljava/lang/Integer;
    //   134: invokevirtual setMinItems : (Ljava/lang/Integer;)Lorg/openapi4j/Zf;
    //   137: pop
    //   138: aload_2
    //   139: aload_0
    //   140: invokevirtual getUniqueItems : ()Ljava/lang/Boolean;
    //   143: invokevirtual setUniqueItems : (Ljava/lang/Boolean;)Lorg/openapi4j/Zf;
    //   146: pop
    //   147: aload_2
    //   148: aload_0
    //   149: invokevirtual getMaxProperties : ()Ljava/lang/Integer;
    //   152: invokevirtual setMaxProperties : (Ljava/lang/Integer;)Lorg/openapi4j/Zf;
    //   155: pop
    //   156: aload_2
    //   157: aload_0
    //   158: invokevirtual getMinProperties : ()Ljava/lang/Integer;
    //   161: invokevirtual setMinProperties : (Ljava/lang/Integer;)Lorg/openapi4j/Zf;
    //   164: pop
    //   165: aload_2
    //   166: aload_0
    //   167: aload_0
    //   168: invokevirtual getRequiredFields : ()Ljava/util/List;
    //   171: invokevirtual copySimpleList : (Ljava/util/List;)Ljava/util/List;
    //   174: invokevirtual setRequiredFields : (Ljava/util/List;)Lorg/openapi4j/Zf;
    //   177: pop
    //   178: aload_2
    //   179: aload_0
    //   180: aload_0
    //   181: invokevirtual getEnums : ()Ljava/util/List;
    //   184: invokevirtual copySimpleList : (Ljava/util/List;)Ljava/util/List;
    //   187: invokevirtual setEnums : (Ljava/util/List;)Lorg/openapi4j/Zf;
    //   190: pop
    //   191: aload_2
    //   192: aload_0
    //   193: invokevirtual getType : ()Ljava/lang/String;
    //   196: invokevirtual setType : (Ljava/lang/String;)Lorg/openapi4j/Zf;
    //   199: pop
    //   200: aload_2
    //   201: aload_0
    //   202: aload_0
    //   203: invokevirtual getAllOfSchemas : ()Ljava/util/List;
    //   206: invokevirtual copyList : (Ljava/util/List;)Ljava/util/List;
    //   209: invokevirtual setAllOfSchemas : (Ljava/util/List;)Lorg/openapi4j/Zf;
    //   212: pop
    //   213: aload_2
    //   214: aload_0
    //   215: aload_0
    //   216: invokevirtual getOneOfSchemas : ()Ljava/util/List;
    //   219: invokevirtual copyList : (Ljava/util/List;)Ljava/util/List;
    //   222: invokevirtual setOneOfSchemas : (Ljava/util/List;)Lorg/openapi4j/Zf;
    //   225: pop
    //   226: aload_2
    //   227: aload_0
    //   228: aload_0
    //   229: invokevirtual getAnyOfSchemas : ()Ljava/util/List;
    //   232: invokevirtual copyList : (Ljava/util/List;)Ljava/util/List;
    //   235: invokevirtual setAnyOfSchemas : (Ljava/util/List;)Lorg/openapi4j/Zf;
    //   238: pop
    //   239: aload_2
    //   240: aload_0
    //   241: aload_0
    //   242: invokevirtual getNotSchema : ()Lorg/openapi4j/Zf;
    //   245: invokevirtual copyField : (Lorg/openapi4j/Zpk;)Lorg/openapi4j/Zpk;
    //   248: checkcast org/openapi4j/Zf
    //   251: invokevirtual setNotSchema : (Lorg/openapi4j/Zf;)Lorg/openapi4j/Zf;
    //   254: pop
    //   255: aload_2
    //   256: aload_0
    //   257: aload_0
    //   258: invokevirtual getItemsSchema : ()Lorg/openapi4j/Zf;
    //   261: invokevirtual copyField : (Lorg/openapi4j/Zpk;)Lorg/openapi4j/Zpk;
    //   264: checkcast org/openapi4j/Zf
    //   267: invokevirtual setItemsSchema : (Lorg/openapi4j/Zf;)Lorg/openapi4j/Zf;
    //   270: pop
    //   271: aload_2
    //   272: aload_0
    //   273: aload_0
    //   274: invokevirtual getProperties : ()Ljava/util/Map;
    //   277: invokevirtual copyMap : (Ljava/util/Map;)Ljava/util/Map;
    //   280: invokevirtual setProperties : (Ljava/util/Map;)Lorg/openapi4j/Zf;
    //   283: pop
    //   284: aload_0
    //   285: invokevirtual hasAdditionalProperties : ()Z
    //   288: ifeq -> 311
    //   291: aload_2
    //   292: aload_0
    //   293: aload_0
    //   294: invokevirtual getAdditionalProperties : ()Lorg/openapi4j/Zf;
    //   297: invokevirtual copyField : (Lorg/openapi4j/Zpk;)Lorg/openapi4j/Zpk;
    //   300: checkcast org/openapi4j/Zf
    //   303: invokevirtual setAdditionalProperties : (Lorg/openapi4j/Zf;)Lorg/openapi4j/Zf;
    //   306: pop
    //   307: aload_1
    //   308: ifnull -> 327
    //   311: aload_0
    //   312: invokevirtual getAdditionalPropertiesAllowed : ()Ljava/lang/Boolean;
    //   315: ifnull -> 327
    //   318: aload_2
    //   319: aload_0
    //   320: invokevirtual getAdditionalPropertiesAllowed : ()Ljava/lang/Boolean;
    //   323: invokevirtual setAdditionalPropertiesAllowed : (Ljava/lang/Boolean;)Lorg/openapi4j/Zf;
    //   326: pop
    //   327: aload_2
    //   328: aload_0
    //   329: invokevirtual getDescription : ()Ljava/lang/String;
    //   332: invokevirtual setDescription : (Ljava/lang/String;)Lorg/openapi4j/Zf;
    //   335: pop
    //   336: aload_2
    //   337: aload_0
    //   338: invokevirtual getFormat : ()Ljava/lang/String;
    //   341: invokevirtual setFormat : (Ljava/lang/String;)Lorg/openapi4j/Zf;
    //   344: pop
    //   345: aload_2
    //   346: aload_0
    //   347: invokevirtual getDefault : ()Ljava/lang/Object;
    //   350: invokevirtual setDefault : (Ljava/lang/Object;)Lorg/openapi4j/Zf;
    //   353: pop
    //   354: aload_2
    //   355: aload_0
    //   356: invokevirtual getNullable : ()Ljava/lang/Boolean;
    //   359: invokevirtual setNullable : (Ljava/lang/Boolean;)Lorg/openapi4j/Zf;
    //   362: pop
    //   363: aload_2
    //   364: aload_0
    //   365: aload_0
    //   366: invokevirtual getDiscriminator : ()Lorg/openapi4j/Zp6;
    //   369: invokevirtual copyField : (Lorg/openapi4j/Zpk;)Lorg/openapi4j/Zpk;
    //   372: checkcast org/openapi4j/Zp6
    //   375: invokevirtual setDiscriminator : (Lorg/openapi4j/Zp6;)Lorg/openapi4j/Zf;
    //   378: pop
    //   379: aload_2
    //   380: aload_0
    //   381: invokevirtual getReadOnly : ()Ljava/lang/Boolean;
    //   384: invokevirtual setReadOnly : (Ljava/lang/Boolean;)Lorg/openapi4j/Zf;
    //   387: pop
    //   388: aload_2
    //   389: aload_0
    //   390: invokevirtual getWriteOnly : ()Ljava/lang/Boolean;
    //   393: invokevirtual setWriteOnly : (Ljava/lang/Boolean;)Lorg/openapi4j/Zf;
    //   396: pop
    //   397: aload_2
    //   398: aload_0
    //   399: aload_0
    //   400: invokevirtual getXml : ()Lorg/openapi4j/Zph;
    //   403: invokevirtual copyField : (Lorg/openapi4j/Zpk;)Lorg/openapi4j/Zpk;
    //   406: checkcast org/openapi4j/Zph
    //   409: invokevirtual setXml : (Lorg/openapi4j/Zph;)Lorg/openapi4j/Zf;
    //   412: pop
    //   413: aload_2
    //   414: aload_0
    //   415: aload_0
    //   416: invokevirtual getExternalDocs : ()Lorg/openapi4j/Zb;
    //   419: invokevirtual copyField : (Lorg/openapi4j/Zpk;)Lorg/openapi4j/Zpk;
    //   422: checkcast org/openapi4j/Zb
    //   425: invokevirtual setExternalDocs : (Lorg/openapi4j/Zb;)Lorg/openapi4j/Zf;
    //   428: pop
    //   429: aload_2
    //   430: aload_0
    //   431: invokevirtual getExample : ()Ljava/lang/Object;
    //   434: invokevirtual setExample : (Ljava/lang/Object;)Lorg/openapi4j/Zf;
    //   437: pop
    //   438: aload_2
    //   439: aload_0
    //   440: invokevirtual getDeprecated : ()Ljava/lang/Boolean;
    //   443: invokevirtual setDeprecated : (Ljava/lang/Boolean;)Lorg/openapi4j/Zf;
    //   446: pop
    //   447: aload_2
    //   448: aload_0
    //   449: aload_0
    //   450: invokevirtual getExtensions : ()Ljava/util/Map;
    //   453: invokevirtual copySimpleMap : (Ljava/util/Map;)Ljava/util/Map;
    //   456: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   459: aload_2
    //   460: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ',,Ií\\tK\\bæKÄí153½F{câ;_ÞkËµáêø'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #85
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc '*AöÅ-N`×Ç\\rH'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #64
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
    //   128: putstatic org/openapi4j/Zf.c : [Ljava/lang/String;
    //   131: bipush #9
    //   133: anewarray java/lang/String
    //   136: putstatic org/openapi4j/Zf.d : [Ljava/lang/String;
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
    //   212: bipush #115
    //   214: goto -> 244
    //   217: bipush #89
    //   219: goto -> 244
    //   222: bipush #8
    //   224: goto -> 244
    //   227: bipush #110
    //   229: goto -> 244
    //   232: bipush #35
    //   234: goto -> 244
    //   237: bipush #91
    //   239: goto -> 244
    //   242: bipush #60
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: ldc org/openapi4j/Zf
    //   302: invokevirtual desiredAssertionStatus : ()Z
    //   305: ifne -> 312
    //   308: iconst_1
    //   309: goto -> 313
    //   312: iconst_0
    //   313: putstatic org/openapi4j/Zf.$assertionsDisabled : Z
    //   316: return
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3809) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      byte b1 = 32;
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */