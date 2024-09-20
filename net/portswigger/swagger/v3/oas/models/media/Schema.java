package net.portswigger.swagger.v3.oas.models.media;

import burp.Zbqc;
import com.fasterxml.Zyx;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.portswigger.swagger.v3.oas.models.ExternalDocumentation;
import net.portswigger.swagger.v3.oas.models.SpecVersion;
import net.portswigger.swagger.v3.oas.models.annotations.OpenAPI30;
import net.portswigger.swagger.v3.oas.models.annotations.OpenAPI31;

public class Schema<T> {
  public static final String BIND_TYPE_AND_TYPES;
  
  public static final String BINARY_STRING_CONVERSION_PROPERTY;
  
  protected T _default;
  
  private String name;
  
  private String title = null;
  
  private BigDecimal multipleOf = null;
  
  private BigDecimal maximum = null;
  
  @OpenAPI30
  private Boolean exclusiveMaximum = null;
  
  private BigDecimal minimum = null;
  
  @OpenAPI30
  private Boolean exclusiveMinimum = null;
  
  private Integer maxLength = null;
  
  private Integer minLength = null;
  
  private String pattern = null;
  
  private Integer maxItems = null;
  
  private Integer minItems = null;
  
  private Boolean uniqueItems = null;
  
  private Integer maxProperties = null;
  
  private Integer minProperties = null;
  
  private List<String> required = null;
  
  @OpenAPI30
  private String type = null;
  
  private Schema not = null;
  
  private Map<String, Schema> properties = null;
  
  private Object additionalProperties = null;
  
  private String description = null;
  
  private String format = null;
  
  private String $ref = null;
  
  @OpenAPI30
  private Boolean nullable = null;
  
  private Boolean readOnly = null;
  
  private Boolean writeOnly = null;
  
  protected T example = null;
  
  private ExternalDocumentation externalDocs = null;
  
  private Boolean deprecated = null;
  
  private XML xml = null;
  
  private Map<String, Object> extensions = null;
  
  protected List<T> _enum = null;
  
  private Discriminator discriminator = null;
  
  private boolean exampleSetFlag;
  
  @OpenAPI31
  private List<Schema> prefixItems = null;
  
  private List<Schema> allOf = null;
  
  private List<Schema> anyOf = null;
  
  private List<Schema> oneOf = null;
  
  private Schema<?> items = null;
  
  protected T _const;
  
  private SpecVersion specVersion = SpecVersion.V30;
  
  @OpenAPI31
  private Set<String> types;
  
  @OpenAPI31
  private Map<String, Schema> patternProperties = null;
  
  @OpenAPI31
  private BigDecimal exclusiveMaximumValue = null;
  
  @OpenAPI31
  private BigDecimal exclusiveMinimumValue = null;
  
  @OpenAPI31
  private Schema contains = null;
  
  @OpenAPI31
  private String $id;
  
  @OpenAPI31
  private String $schema;
  
  @OpenAPI31
  private String $anchor;
  
  @OpenAPI31
  private String $vocabulary;
  
  @OpenAPI31
  private String $dynamicAnchor;
  
  @OpenAPI31
  private String contentEncoding;
  
  @OpenAPI31
  private String contentMediaType;
  
  @OpenAPI31
  private Schema contentSchema;
  
  @OpenAPI31
  private Schema propertyNames;
  
  @OpenAPI31
  private Schema unevaluatedProperties;
  
  @OpenAPI31
  private Integer maxContains;
  
  @OpenAPI31
  private Integer minContains;
  
  @OpenAPI31
  private Schema additionalItems;
  
  @OpenAPI31
  private Schema unevaluatedItems;
  
  @OpenAPI31
  private Schema _if;
  
  @OpenAPI31
  private Schema _else;
  
  @OpenAPI31
  private Schema then;
  
  @OpenAPI31
  private Map<String, Schema> dependentSchemas;
  
  @OpenAPI31
  private Map<String, List<String>> dependentRequired;
  
  @OpenAPI31
  private String $comment;
  
  @OpenAPI31
  private List<T> examples;
  
  @OpenAPI31
  private Boolean booleanSchemaValue;
  
  @OpenAPI31
  protected Map<String, Object> jsonSchema = null;
  
  @OpenAPI31
  protected transient Object jsonSchemaImpl = null;
  
  private static boolean Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  @Zyx
  public SpecVersion getSpecVersion() {
    return this.specVersion;
  }
  
  public void setSpecVersion(SpecVersion paramSpecVersion) {
    this.specVersion = paramSpecVersion;
  }
  
  public Schema specVersion(SpecVersion paramSpecVersion) {
    setSpecVersion(paramSpecVersion);
    return this;
  }
  
  @OpenAPI31
  public Schema getContains() {
    return this.contains;
  }
  
  @OpenAPI31
  public void setContains(Schema paramSchema) {
    this.contains = paramSchema;
  }
  
  @OpenAPI31
  public String get$id() {
    return this.$id;
  }
  
  @OpenAPI31
  public void set$id(String paramString) {
    this.$id = paramString;
  }
  
  @OpenAPI31
  public String get$schema() {
    return this.$schema;
  }
  
  @OpenAPI31
  public void set$schema(String paramString) {
    this.$schema = paramString;
  }
  
  @OpenAPI31
  public String get$anchor() {
    return this.$anchor;
  }
  
  @OpenAPI31
  public void set$anchor(String paramString) {
    this.$anchor = paramString;
  }
  
  @OpenAPI31
  public BigDecimal getExclusiveMaximumValue() {
    return this.exclusiveMaximumValue;
  }
  
  @OpenAPI31
  public void setExclusiveMaximumValue(BigDecimal paramBigDecimal) {
    this.exclusiveMaximumValue = paramBigDecimal;
  }
  
  @OpenAPI31
  public Schema exclusiveMaximumValue(BigDecimal paramBigDecimal) {
    this.exclusiveMaximumValue = paramBigDecimal;
    return this;
  }
  
  @OpenAPI31
  public BigDecimal getExclusiveMinimumValue() {
    return this.exclusiveMinimumValue;
  }
  
  @OpenAPI31
  public void setExclusiveMinimumValue(BigDecimal paramBigDecimal) {
    this.exclusiveMinimumValue = paramBigDecimal;
  }
  
  @OpenAPI31
  public Schema exclusiveMinimumValue(BigDecimal paramBigDecimal) {
    this.exclusiveMinimumValue = paramBigDecimal;
    return this;
  }
  
  @OpenAPI31
  public Map<String, Schema> getPatternProperties() {
    return this.patternProperties;
  }
  
  @OpenAPI31
  public void setPatternProperties(Map<String, Schema> paramMap) {
    this.patternProperties = paramMap;
  }
  
  @OpenAPI31
  public Schema patternProperties(Map<String, Schema> paramMap) {
    this.patternProperties = paramMap;
    return this;
  }
  
  @OpenAPI31
  public Schema addPatternProperty(String paramString, Schema paramSchema) {
    try {
      if (this.patternProperties == null)
        this.patternProperties = new LinkedHashMap<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.patternProperties.put(paramString, paramSchema);
    return this;
  }
  
  @OpenAPI31
  public Schema contains(Schema paramSchema) {
    this.contains = paramSchema;
    return this;
  }
  
  @OpenAPI31
  public Schema $id(String paramString) {
    this.$id = paramString;
    return this;
  }
  
  @OpenAPI31
  public Set<String> getTypes() {
    return this.types;
  }
  
  @OpenAPI31
  public void setTypes(Set<String> paramSet) {
    this.types = paramSet;
  }
  
  @OpenAPI31
  public boolean addType(String paramString) {
    try {
      if (this.types == null)
        this.types = new LinkedHashSet<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.types.add(paramString);
  }
  
  @OpenAPI31
  public Schema $schema(String paramString) {
    this.$schema = paramString;
    return this;
  }
  
  @OpenAPI31
  public String get$vocabulary() {
    return this.$vocabulary;
  }
  
  @OpenAPI31
  public void set$vocabulary(String paramString) {
    this.$vocabulary = paramString;
  }
  
  @OpenAPI31
  public Schema $vocabulary(String paramString) {
    this.$vocabulary = paramString;
    return this;
  }
  
  @OpenAPI31
  public String get$dynamicAnchor() {
    return this.$dynamicAnchor;
  }
  
  @OpenAPI31
  public void set$dynamicAnchor(String paramString) {
    this.$dynamicAnchor = paramString;
  }
  
  @OpenAPI31
  public Schema $dynamicAnchor(String paramString) {
    this.$dynamicAnchor = paramString;
    return this;
  }
  
  @OpenAPI31
  public Schema $anchor(String paramString) {
    this.$anchor = paramString;
    return this;
  }
  
  @OpenAPI31
  public Schema types(Set<String> paramSet) {
    this.types = paramSet;
    return this;
  }
  
  @OpenAPI31
  public Map<String, Object> getJsonSchema() {
    return this.jsonSchema;
  }
  
  @OpenAPI31
  public void setJsonSchema(Map<String, Object> paramMap) {
    this.jsonSchema = paramMap;
  }
  
  @OpenAPI31
  public Schema jsonSchema(Map<String, Object> paramMap) {
    this.jsonSchema = paramMap;
    return this;
  }
  
  @OpenAPI31
  public Object getJsonSchemaImpl() {
    return this.jsonSchemaImpl;
  }
  
  @OpenAPI31
  public void setJsonSchemaImpl(Object paramObject) {
    this.jsonSchemaImpl = paramObject;
  }
  
  @OpenAPI31
  public Schema jsonSchemaImpl(Object paramObject) {
    setJsonSchemaImpl(paramObject);
    return this;
  }
  
  public Schema() {}
  
  protected Schema(String paramString1, String paramString2) {
    this.type = paramString1;
    addType(paramString1);
    this.format = paramString2;
  }
  
  public Schema(SpecVersion paramSpecVersion) {
    this.specVersion = paramSpecVersion;
  }
  
  protected Schema(String paramString1, String paramString2, SpecVersion paramSpecVersion) {
    this.type = paramString1;
    addType(paramString1);
    this.format = paramString2;
    this.specVersion = paramSpecVersion;
  }
  
  public List<Schema> getAllOf() {
    return this.allOf;
  }
  
  public void setAllOf(List<Schema> paramList) {
    this.allOf = paramList;
  }
  
  public Schema allOf(List<Schema> paramList) {
    this.allOf = paramList;
    return this;
  }
  
  public Schema addAllOfItem(Schema paramSchema) {
    try {
      if (this.allOf == null)
        this.allOf = new ArrayList<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.allOf.add(paramSchema);
    return this;
  }
  
  public List<Schema> getAnyOf() {
    return this.anyOf;
  }
  
  public void setAnyOf(List<Schema> paramList) {
    this.anyOf = paramList;
  }
  
  public Schema anyOf(List<Schema> paramList) {
    this.anyOf = paramList;
    return this;
  }
  
  public Schema addAnyOfItem(Schema paramSchema) {
    try {
      if (this.anyOf == null)
        this.anyOf = new ArrayList<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.anyOf.add(paramSchema);
    return this;
  }
  
  public List<Schema> getOneOf() {
    return this.oneOf;
  }
  
  public void setOneOf(List<Schema> paramList) {
    this.oneOf = paramList;
  }
  
  public Schema oneOf(List<Schema> paramList) {
    this.oneOf = paramList;
    return this;
  }
  
  public Schema addOneOfItem(Schema paramSchema) {
    try {
      if (this.oneOf == null)
        this.oneOf = new ArrayList<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.oneOf.add(paramSchema);
    return this;
  }
  
  public Schema<?> getItems() {
    return this.items;
  }
  
  public void setItems(Schema<?> paramSchema) {
    this.items = paramSchema;
  }
  
  public Schema items(Schema<?> paramSchema) {
    this.items = paramSchema;
    return this;
  }
  
  @Zyx
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public Schema name(String paramString) {
    setName(paramString);
    return this;
  }
  
  public Discriminator getDiscriminator() {
    return this.discriminator;
  }
  
  public void setDiscriminator(Discriminator paramDiscriminator) {
    this.discriminator = paramDiscriminator;
  }
  
  public Schema discriminator(Discriminator paramDiscriminator) {
    this.discriminator = paramDiscriminator;
    return this;
  }
  
  public String getTitle() {
    return this.title;
  }
  
  public void setTitle(String paramString) {
    this.title = paramString;
  }
  
  public Schema title(String paramString) {
    this.title = paramString;
    return this;
  }
  
  public T getDefault() {
    return this._default;
  }
  
  public void setDefault(Object paramObject) {
    this._default = cast(paramObject);
  }
  
  protected T cast(Object paramObject) {
    return (T)paramObject;
  }
  
  public List<T> getEnum() {
    return this._enum;
  }
  
  public void setEnum(List<T> paramList) {
    this._enum = paramList;
  }
  
  public void addEnumItemObject(T paramT) {
    try {
      if (this._enum == null)
        this._enum = new ArrayList<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this._enum.add(cast(paramT));
  }
  
  public BigDecimal getMultipleOf() {
    return this.multipleOf;
  }
  
  public void setMultipleOf(BigDecimal paramBigDecimal) {
    this.multipleOf = paramBigDecimal;
  }
  
  public Schema multipleOf(BigDecimal paramBigDecimal) {
    this.multipleOf = paramBigDecimal;
    return this;
  }
  
  public BigDecimal getMaximum() {
    return this.maximum;
  }
  
  public void setMaximum(BigDecimal paramBigDecimal) {
    this.maximum = paramBigDecimal;
  }
  
  public Schema maximum(BigDecimal paramBigDecimal) {
    this.maximum = paramBigDecimal;
    return this;
  }
  
  @OpenAPI30
  public Boolean getExclusiveMaximum() {
    return this.exclusiveMaximum;
  }
  
  @OpenAPI30
  public void setExclusiveMaximum(Boolean paramBoolean) {
    this.exclusiveMaximum = paramBoolean;
  }
  
  @OpenAPI30
  public Schema exclusiveMaximum(Boolean paramBoolean) {
    this.exclusiveMaximum = paramBoolean;
    return this;
  }
  
  public BigDecimal getMinimum() {
    return this.minimum;
  }
  
  public void setMinimum(BigDecimal paramBigDecimal) {
    this.minimum = paramBigDecimal;
  }
  
  public Schema minimum(BigDecimal paramBigDecimal) {
    this.minimum = paramBigDecimal;
    return this;
  }
  
  public Boolean getExclusiveMinimum() {
    return this.exclusiveMinimum;
  }
  
  public void setExclusiveMinimum(Boolean paramBoolean) {
    this.exclusiveMinimum = paramBoolean;
  }
  
  public Schema exclusiveMinimum(Boolean paramBoolean) {
    this.exclusiveMinimum = paramBoolean;
    return this;
  }
  
  public Integer getMaxLength() {
    return this.maxLength;
  }
  
  public void setMaxLength(Integer paramInteger) {
    this.maxLength = paramInteger;
  }
  
  public Schema maxLength(Integer paramInteger) {
    this.maxLength = paramInteger;
    return this;
  }
  
  public Integer getMinLength() {
    return this.minLength;
  }
  
  public void setMinLength(Integer paramInteger) {
    this.minLength = paramInteger;
  }
  
  public Schema minLength(Integer paramInteger) {
    this.minLength = paramInteger;
    return this;
  }
  
  public String getPattern() {
    return this.pattern;
  }
  
  public void setPattern(String paramString) {
    this.pattern = paramString;
  }
  
  public Schema pattern(String paramString) {
    this.pattern = paramString;
    return this;
  }
  
  public Integer getMaxItems() {
    return this.maxItems;
  }
  
  public void setMaxItems(Integer paramInteger) {
    this.maxItems = paramInteger;
  }
  
  public Schema maxItems(Integer paramInteger) {
    this.maxItems = paramInteger;
    return this;
  }
  
  public Integer getMinItems() {
    return this.minItems;
  }
  
  public void setMinItems(Integer paramInteger) {
    this.minItems = paramInteger;
  }
  
  public Schema minItems(Integer paramInteger) {
    this.minItems = paramInteger;
    return this;
  }
  
  public Boolean getUniqueItems() {
    return this.uniqueItems;
  }
  
  public void setUniqueItems(Boolean paramBoolean) {
    this.uniqueItems = paramBoolean;
  }
  
  public Schema uniqueItems(Boolean paramBoolean) {
    this.uniqueItems = paramBoolean;
    return this;
  }
  
  public Integer getMaxProperties() {
    return this.maxProperties;
  }
  
  public void setMaxProperties(Integer paramInteger) {
    this.maxProperties = paramInteger;
  }
  
  public Schema maxProperties(Integer paramInteger) {
    this.maxProperties = paramInteger;
    return this;
  }
  
  public Integer getMinProperties() {
    return this.minProperties;
  }
  
  public void setMinProperties(Integer paramInteger) {
    this.minProperties = paramInteger;
  }
  
  public Schema minProperties(Integer paramInteger) {
    this.minProperties = paramInteger;
    return this;
  }
  
  public List<String> getRequired() {
    return this.required;
  }
  
  public void setRequired(List<String> paramList) {
    // Byte code:
    //   0: invokestatic ZR : ()Z
    //   3: new java/util/ArrayList
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_3
    //   11: istore_2
    //   12: aload_1
    //   13: ifnull -> 94
    //   16: aload_1
    //   17: invokeinterface iterator : ()Ljava/util/Iterator;
    //   22: astore #4
    //   24: aload #4
    //   26: invokeinterface hasNext : ()Z
    //   31: ifeq -> 94
    //   34: aload #4
    //   36: invokeinterface next : ()Ljava/lang/Object;
    //   41: checkcast java/lang/String
    //   44: astore #5
    //   46: aload_0
    //   47: getfield properties : Ljava/util/Map;
    //   50: ifnull -> 74
    //   53: aload_0
    //   54: getfield properties : Ljava/util/Map;
    //   57: aload #5
    //   59: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   64: ifeq -> 90
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   73: athrow
    //   74: aload_3
    //   75: aload #5
    //   77: invokeinterface add : (Ljava/lang/Object;)Z
    //   82: pop
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   89: athrow
    //   90: iload_2
    //   91: ifeq -> 24
    //   94: aload_3
    //   95: invokestatic sort : (Ljava/util/List;)V
    //   98: aload_3
    //   99: invokeinterface isEmpty : ()Z
    //   104: ifeq -> 109
    //   107: aconst_null
    //   108: astore_3
    //   109: aload_0
    //   110: aload_3
    //   111: putfield required : Ljava/util/List;
    //   114: return
    // Exception table:
    //   from	to	target	type
    //   46	67	70	java/lang/IllegalArgumentException
    //   53	83	86	java/lang/IllegalArgumentException
  }
  
  public Schema required(List<String> paramList) {
    this.required = paramList;
    return this;
  }
  
  public Schema addRequiredItem(String paramString) {
    try {
      if (this.required == null)
        this.required = new ArrayList<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.required.add(paramString);
    Collections.sort(this.required);
    return this;
  }
  
  public String getType() {
    boolean bool = Boolean.valueOf(System.getProperty(a(14820, 16120), a(14790, -32633))).booleanValue();
    try {
      if (bool)
        try {
          if (this.type == null)
            try {
              if (this.types != null)
                try {
                  if (this.types.size() == 1)
                    return this.types.iterator().next(); 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                }  
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public Schema type(String paramString) {
    this.type = paramString;
    return this;
  }
  
  public Schema getNot() {
    return this.not;
  }
  
  public void setNot(Schema paramSchema) {
    this.not = paramSchema;
  }
  
  public Schema not(Schema paramSchema) {
    this.not = paramSchema;
    return this;
  }
  
  public Map<String, Schema> getProperties() {
    return this.properties;
  }
  
  public void setProperties(Map<String, Schema> paramMap) {
    this.properties = paramMap;
  }
  
  public Schema properties(Map<String, Schema> paramMap) {
    this.properties = paramMap;
    return this;
  }
  
  @Deprecated
  public Schema addProperties(String paramString, Schema paramSchema) {
    return addProperty(paramString, paramSchema);
  }
  
  public Schema addProperty(String paramString, Schema paramSchema) {
    try {
      if (this.properties == null)
        this.properties = new LinkedHashMap<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.properties.put(paramString, paramSchema);
    return this;
  }
  
  public Object getAdditionalProperties() {
    return this.additionalProperties;
  }
  
  public void setAdditionalProperties(Object paramObject) {
    try {
      if (paramObject != null)
        try {
          if (!(paramObject instanceof Boolean))
            try {
              if (!(paramObject instanceof Schema))
                throw new IllegalArgumentException(a(14791, -156)); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.additionalProperties = paramObject;
  }
  
  public Schema additionalProperties(Object paramObject) {
    setAdditionalProperties(paramObject);
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public Schema description(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public String getFormat() {
    return this.format;
  }
  
  public void setFormat(String paramString) {
    this.format = paramString;
  }
  
  public Schema format(String paramString) {
    this.format = paramString;
    return this;
  }
  
  public String get$ref() {
    return this.$ref;
  }
  
  public void set$ref(String paramString) {
    try {
      if (paramString != null)
        try {
          if (!paramString.startsWith("#"))
            try {
              if (paramString.indexOf('.') == -1 && paramString.indexOf('/') == -1)
                paramString = a(14814, -8593) + a(14814, -8593); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.$ref = paramString;
  }
  
  public Schema $ref(String paramString) {
    set$ref(paramString);
    return this;
  }
  
  public Schema raw$ref(String paramString) {
    this.$ref = paramString;
    return this;
  }
  
  @OpenAPI30
  public Boolean getNullable() {
    return this.nullable;
  }
  
  @OpenAPI30
  public void setNullable(Boolean paramBoolean) {
    this.nullable = paramBoolean;
  }
  
  @OpenAPI30
  public Schema nullable(Boolean paramBoolean) {
    this.nullable = paramBoolean;
    return this;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public void setReadOnly(Boolean paramBoolean) {
    this.readOnly = paramBoolean;
  }
  
  public Schema readOnly(Boolean paramBoolean) {
    this.readOnly = paramBoolean;
    return this;
  }
  
  public Boolean getWriteOnly() {
    return this.writeOnly;
  }
  
  public void setWriteOnly(Boolean paramBoolean) {
    this.writeOnly = paramBoolean;
  }
  
  public Schema writeOnly(Boolean paramBoolean) {
    this.writeOnly = paramBoolean;
    return this;
  }
  
  public Object getExample() {
    return this.example;
  }
  
  public void setExample(Object paramObject) {
    try {
      this.example = cast(paramObject);
      if (paramObject != null) {
        try {
          if (this.example != null) {
            this.exampleSetFlag = true;
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.exampleSetFlag = true;
  }
  
  public Schema example(Object paramObject) {
    setExample(paramObject);
    return this;
  }
  
  public ExternalDocumentation getExternalDocs() {
    return this.externalDocs;
  }
  
  public void setExternalDocs(ExternalDocumentation paramExternalDocumentation) {
    this.externalDocs = paramExternalDocumentation;
  }
  
  public Schema externalDocs(ExternalDocumentation paramExternalDocumentation) {
    this.externalDocs = paramExternalDocumentation;
    return this;
  }
  
  public Boolean getDeprecated() {
    return this.deprecated;
  }
  
  public void setDeprecated(Boolean paramBoolean) {
    this.deprecated = paramBoolean;
  }
  
  public Schema deprecated(Boolean paramBoolean) {
    this.deprecated = paramBoolean;
    return this;
  }
  
  public XML getXml() {
    return this.xml;
  }
  
  public void setXml(XML paramXML) {
    this.xml = paramXML;
  }
  
  public Schema xml(XML paramXML) {
    this.xml = paramXML;
    return this;
  }
  
  public boolean getExampleSetFlag() {
    return this.exampleSetFlag;
  }
  
  public void setExampleSetFlag(boolean paramBoolean) {
    this.exampleSetFlag = paramBoolean;
  }
  
  @OpenAPI31
  public List<Schema> getPrefixItems() {
    return this.prefixItems;
  }
  
  @OpenAPI31
  public void setPrefixItems(List<Schema> paramList) {
    this.prefixItems = paramList;
  }
  
  @OpenAPI31
  public Schema prefixItems(List<Schema> paramList) {
    this.prefixItems = paramList;
    return this;
  }
  
  @OpenAPI31
  public Schema addPrefixItem(Schema paramSchema) {
    try {
      if (this.prefixItems == null)
        this.prefixItems = new ArrayList<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.prefixItems.add(paramSchema);
    return this;
  }
  
  @OpenAPI31
  public String getContentEncoding() {
    return this.contentEncoding;
  }
  
  @OpenAPI31
  public void setContentEncoding(String paramString) {
    this.contentEncoding = paramString;
  }
  
  @OpenAPI31
  public Schema contentEncoding(String paramString) {
    this.contentEncoding = paramString;
    return this;
  }
  
  @OpenAPI31
  public String getContentMediaType() {
    return this.contentMediaType;
  }
  
  @OpenAPI31
  public void setContentMediaType(String paramString) {
    this.contentMediaType = paramString;
  }
  
  @OpenAPI31
  public Schema contentMediaType(String paramString) {
    this.contentMediaType = paramString;
    return this;
  }
  
  @OpenAPI31
  public Schema getContentSchema() {
    return this.contentSchema;
  }
  
  @OpenAPI31
  public void setContentSchema(Schema paramSchema) {
    this.contentSchema = paramSchema;
  }
  
  @OpenAPI31
  public Schema contentSchema(Schema paramSchema) {
    this.contentSchema = paramSchema;
    return this;
  }
  
  @OpenAPI31
  public Schema getPropertyNames() {
    return this.propertyNames;
  }
  
  @OpenAPI31
  public void setPropertyNames(Schema paramSchema) {
    this.propertyNames = paramSchema;
  }
  
  @OpenAPI31
  public Schema propertyNames(Schema paramSchema) {
    this.propertyNames = paramSchema;
    return this;
  }
  
  @OpenAPI31
  public Schema getUnevaluatedProperties() {
    return this.unevaluatedProperties;
  }
  
  @OpenAPI31
  public void setUnevaluatedProperties(Schema paramSchema) {
    this.unevaluatedProperties = paramSchema;
  }
  
  @OpenAPI31
  public Schema unevaluatedProperties(Schema paramSchema) {
    this.unevaluatedProperties = paramSchema;
    return this;
  }
  
  @OpenAPI31
  public Integer getMaxContains() {
    return this.maxContains;
  }
  
  @OpenAPI31
  public void setMaxContains(Integer paramInteger) {
    this.maxContains = paramInteger;
  }
  
  @OpenAPI31
  public Schema maxContains(Integer paramInteger) {
    this.maxContains = paramInteger;
    return this;
  }
  
  @OpenAPI31
  public Integer getMinContains() {
    return this.minContains;
  }
  
  @OpenAPI31
  public void setMinContains(Integer paramInteger) {
    this.minContains = paramInteger;
  }
  
  @OpenAPI31
  public Schema minContains(Integer paramInteger) {
    this.minContains = paramInteger;
    return this;
  }
  
  @OpenAPI31
  public Schema getAdditionalItems() {
    return this.additionalItems;
  }
  
  @OpenAPI31
  public void setAdditionalItems(Schema paramSchema) {
    this.additionalItems = paramSchema;
  }
  
  @OpenAPI31
  public Schema additionalItems(Schema paramSchema) {
    this.additionalItems = paramSchema;
    return this;
  }
  
  @OpenAPI31
  public Schema getUnevaluatedItems() {
    return this.unevaluatedItems;
  }
  
  @OpenAPI31
  public void setUnevaluatedItems(Schema paramSchema) {
    this.unevaluatedItems = paramSchema;
  }
  
  @OpenAPI31
  public Schema unevaluatedItems(Schema paramSchema) {
    this.unevaluatedItems = paramSchema;
    return this;
  }
  
  @OpenAPI31
  public Schema getIf() {
    return this._if;
  }
  
  @OpenAPI31
  public void setIf(Schema paramSchema) {
    this._if = paramSchema;
  }
  
  @OpenAPI31
  public Schema _if(Schema paramSchema) {
    this._if = paramSchema;
    return this;
  }
  
  @OpenAPI31
  public Schema getElse() {
    return this._else;
  }
  
  @OpenAPI31
  public void setElse(Schema paramSchema) {
    this._else = paramSchema;
  }
  
  @OpenAPI31
  public Schema _else(Schema paramSchema) {
    this._else = paramSchema;
    return this;
  }
  
  @OpenAPI31
  public Schema getThen() {
    return this.then;
  }
  
  @OpenAPI31
  public void setThen(Schema paramSchema) {
    this.then = paramSchema;
  }
  
  @OpenAPI31
  public Schema then(Schema paramSchema) {
    this.then = paramSchema;
    return this;
  }
  
  @OpenAPI31
  public Map<String, Schema> getDependentSchemas() {
    return this.dependentSchemas;
  }
  
  @OpenAPI31
  public void setDependentSchemas(Map<String, Schema> paramMap) {
    this.dependentSchemas = paramMap;
  }
  
  @OpenAPI31
  public Schema dependentSchemas(Map<String, Schema> paramMap) {
    this.dependentSchemas = paramMap;
    return this;
  }
  
  @OpenAPI31
  public Map<String, List<String>> getDependentRequired() {
    return this.dependentRequired;
  }
  
  @OpenAPI31
  public void setDependentRequired(Map<String, List<String>> paramMap) {
    this.dependentRequired = paramMap;
  }
  
  @OpenAPI31
  public Schema dependentRequired(Map<String, List<String>> paramMap) {
    this.dependentRequired = paramMap;
    return this;
  }
  
  @OpenAPI31
  public String get$comment() {
    return this.$comment;
  }
  
  @OpenAPI31
  public void set$comment(String paramString) {
    this.$comment = paramString;
  }
  
  @OpenAPI31
  public Schema $comment(String paramString) {
    this.$comment = paramString;
    return this;
  }
  
  @OpenAPI31
  public List<T> getExamples() {
    return this.examples;
  }
  
  @OpenAPI31
  public void setExamples(List<T> paramList) {
    this.examples = paramList;
  }
  
  @OpenAPI31
  public Schema<T> examples(List<T> paramList) {
    this.examples = paramList;
    return this;
  }
  
  @OpenAPI31
  public void addExample(T paramT) {
    try {
      if (this.examples == null)
        this.examples = new ArrayList<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.examples.add(paramT);
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject != null) {
        try {
          if (getClass() != paramObject.getClass())
            return false; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Schema schema = (Schema)paramObject;
    try {
      if (Objects.equals(this.title, schema.title))
        try {
          if (Objects.equals(this.multipleOf, schema.multipleOf))
            try {
              if (Objects.equals(this.maximum, schema.maximum))
                try {
                  if (Objects.equals(this.exclusiveMaximum, schema.exclusiveMaximum))
                    try {
                      if (Objects.equals(this.exclusiveMaximumValue, schema.exclusiveMaximumValue))
                        try {
                          if (Objects.equals(this.minimum, schema.minimum))
                            try {
                              if (Objects.equals(this.exclusiveMinimum, schema.exclusiveMinimum))
                                try {
                                  if (Objects.equals(this.exclusiveMinimumValue, schema.exclusiveMinimumValue))
                                    try {
                                      if (Objects.equals(this.maxLength, schema.maxLength))
                                        try {
                                          if (Objects.equals(this.minLength, schema.minLength))
                                            try {
                                              if (Objects.equals(this.pattern, schema.pattern))
                                                try {
                                                  if (Objects.equals(this.maxItems, schema.maxItems))
                                                    try {
                                                      if (Objects.equals(this.minItems, schema.minItems))
                                                        try {
                                                          if (Objects.equals(this.uniqueItems, schema.uniqueItems))
                                                            try {
                                                              if (Objects.equals(this.maxProperties, schema.maxProperties))
                                                                try {
                                                                  if (Objects.equals(this.minProperties, schema.minProperties))
                                                                    try {
                                                                      if (Objects.equals(this.required, schema.required))
                                                                        try {
                                                                          if (Objects.equals(this.type, schema.type))
                                                                            try {
                                                                              if (Objects.equals(this.not, schema.not))
                                                                                try {
                                                                                  if (Objects.equals(this.properties, schema.properties))
                                                                                    try {
                                                                                      if (Objects.equals(this.additionalProperties, schema.additionalProperties))
                                                                                        try {
                                                                                          if (Objects.equals(this.description, schema.description))
                                                                                            try {
                                                                                              if (Objects.equals(this.format, schema.format))
                                                                                                try {
                                                                                                  if (Objects.equals(this.$ref, schema.$ref))
                                                                                                    try {
                                                                                                      if (Objects.equals(this.nullable, schema.nullable))
                                                                                                        try {
                                                                                                          if (Objects.equals(this.readOnly, schema.readOnly))
                                                                                                            try {
                                                                                                              if (Objects.equals(this.writeOnly, schema.writeOnly))
                                                                                                                try {
                                                                                                                  if (Objects.equals(this.example, schema.example))
                                                                                                                    try {
                                                                                                                      if (Objects.equals(this.externalDocs, schema.externalDocs))
                                                                                                                        try {
                                                                                                                          if (Objects.equals(this.deprecated, schema.deprecated))
                                                                                                                            try {
                                                                                                                              if (Objects.equals(this.xml, schema.xml))
                                                                                                                                try {
                                                                                                                                  if (Objects.equals(this.extensions, schema.extensions))
                                                                                                                                    try {
                                                                                                                                      if (Objects.equals(this.discriminator, schema.discriminator))
                                                                                                                                        try {
                                                                                                                                          if (Objects.equals(this._enum, schema._enum))
                                                                                                                                            try {
                                                                                                                                              if (Objects.equals(this.contains, schema.contains))
                                                                                                                                                try {
                                                                                                                                                  if (Objects.equals(this.patternProperties, schema.patternProperties))
                                                                                                                                                    try {
                                                                                                                                                      if (Objects.equals(this.$id, schema.$id))
                                                                                                                                                        try {
                                                                                                                                                          if (Objects.equals(this.$anchor, schema.$anchor))
                                                                                                                                                            try {
                                                                                                                                                              if (Objects.equals(this.$schema, schema.$schema))
                                                                                                                                                                try {
                                                                                                                                                                  if (Objects.equals(this.$vocabulary, schema.$vocabulary))
                                                                                                                                                                    try {
                                                                                                                                                                      if (Objects.equals(this.$dynamicAnchor, schema.$dynamicAnchor))
                                                                                                                                                                        try {
                                                                                                                                                                          if (Objects.equals(this.types, schema.types))
                                                                                                                                                                            try {
                                                                                                                                                                              if (Objects.equals(this.allOf, schema.allOf))
                                                                                                                                                                                try {
                                                                                                                                                                                  if (Objects.equals(this.anyOf, schema.anyOf))
                                                                                                                                                                                    try {
                                                                                                                                                                                      if (Objects.equals(this.oneOf, schema.oneOf))
                                                                                                                                                                                        try {
                                                                                                                                                                                          if (Objects.equals(this._const, schema._const))
                                                                                                                                                                                            try {
                                                                                                                                                                                              if (Objects.equals(this._default, schema._default))
                                                                                                                                                                                                try {
                                                                                                                                                                                                  if (Objects.equals(this.contentEncoding, schema.contentEncoding))
                                                                                                                                                                                                    try {
                                                                                                                                                                                                      if (Objects.equals(this.contentMediaType, schema.contentMediaType))
                                                                                                                                                                                                        try {
                                                                                                                                                                                                          if (Objects.equals(this.contentSchema, schema.contentSchema))
                                                                                                                                                                                                            try {
                                                                                                                                                                                                              if (Objects.equals(this.propertyNames, schema.propertyNames))
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                  if (Objects.equals(this.unevaluatedProperties, schema.unevaluatedProperties))
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                      if (Objects.equals(this.maxContains, schema.maxContains))
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                          if (Objects.equals(this.minContains, schema.minContains))
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                              if (Objects.equals(this.additionalItems, schema.additionalItems))
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                  if (Objects.equals(this.unevaluatedItems, schema.unevaluatedItems))
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                      if (Objects.equals(this._if, schema._if))
                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                          if (Objects.equals(this._else, schema._else))
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                              if (Objects.equals(this.then, schema.then))
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                  if (Objects.equals(this.dependentRequired, schema.dependentRequired))
                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                      if (Objects.equals(this.dependentSchemas, schema.dependentSchemas))
                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                          if (Objects.equals(this.$comment, schema.$comment))
                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                              if (Objects.equals(this.examples, schema.examples))
                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                  if (Objects.equals(this.prefixItems, schema.prefixItems))
                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                      if (Objects.equals(this.items, schema.items));
                                                                                                                                                                                                                                                                    } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                                                                                      throw a(null);
                                                                                                                                                                                                                                                                    }  
                                                                                                                                                                                                                                                                } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                                                                                  throw a(null);
                                                                                                                                                                                                                                                                }  
                                                                                                                                                                                                                                                            } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                                                                              throw a(null);
                                                                                                                                                                                                                                                            }  
                                                                                                                                                                                                                                                        } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                                                                          throw a(null);
                                                                                                                                                                                                                                                        }  
                                                                                                                                                                                                                                                    } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                                                                      throw a(null);
                                                                                                                                                                                                                                                    }  
                                                                                                                                                                                                                                                } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                                                                  throw a(null);
                                                                                                                                                                                                                                                }  
                                                                                                                                                                                                                                            } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                                                              throw a(null);
                                                                                                                                                                                                                                            }  
                                                                                                                                                                                                                                        } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                                                          throw a(null);
                                                                                                                                                                                                                                        }  
                                                                                                                                                                                                                                    } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                                                      throw a(null);
                                                                                                                                                                                                                                    }  
                                                                                                                                                                                                                                } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                                                  throw a(null);
                                                                                                                                                                                                                                }  
                                                                                                                                                                                                                            } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                                              throw a(null);
                                                                                                                                                                                                                            }  
                                                                                                                                                                                                                        } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                                          throw a(null);
                                                                                                                                                                                                                        }  
                                                                                                                                                                                                                    } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                                      throw a(null);
                                                                                                                                                                                                                    }  
                                                                                                                                                                                                                } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                                  throw a(null);
                                                                                                                                                                                                                }  
                                                                                                                                                                                                            } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                              throw a(null);
                                                                                                                                                                                                            }  
                                                                                                                                                                                                        } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                          throw a(null);
                                                                                                                                                                                                        }  
                                                                                                                                                                                                    } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                      throw a(null);
                                                                                                                                                                                                    }  
                                                                                                                                                                                                } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                                  throw a(null);
                                                                                                                                                                                                }  
                                                                                                                                                                                            } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                              throw a(null);
                                                                                                                                                                                            }  
                                                                                                                                                                                        } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                          throw a(null);
                                                                                                                                                                                        }  
                                                                                                                                                                                    } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                      throw a(null);
                                                                                                                                                                                    }  
                                                                                                                                                                                } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                                  throw a(null);
                                                                                                                                                                                }  
                                                                                                                                                                            } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                              throw a(null);
                                                                                                                                                                            }  
                                                                                                                                                                        } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                          throw a(null);
                                                                                                                                                                        }  
                                                                                                                                                                    } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                      throw a(null);
                                                                                                                                                                    }  
                                                                                                                                                                } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                  throw a(null);
                                                                                                                                                                }  
                                                                                                                                                            } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                              throw a(null);
                                                                                                                                                            }  
                                                                                                                                                        } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                          throw a(null);
                                                                                                                                                        }  
                                                                                                                                                    } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                      throw a(null);
                                                                                                                                                    }  
                                                                                                                                                } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                  throw a(null);
                                                                                                                                                }  
                                                                                                                                            } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                              throw a(null);
                                                                                                                                            }  
                                                                                                                                        } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                          throw a(null);
                                                                                                                                        }  
                                                                                                                                    } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                      throw a(null);
                                                                                                                                    }  
                                                                                                                                } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                  throw a(null);
                                                                                                                                }  
                                                                                                                            } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                              throw a(null);
                                                                                                                            }  
                                                                                                                        } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                          throw a(null);
                                                                                                                        }  
                                                                                                                    } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                      throw a(null);
                                                                                                                    }  
                                                                                                                } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                  throw a(null);
                                                                                                                }  
                                                                                                            } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                              throw a(null);
                                                                                                            }  
                                                                                                        } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                          throw a(null);
                                                                                                        }  
                                                                                                    } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                      throw a(null);
                                                                                                    }  
                                                                                                } catch (IllegalArgumentException illegalArgumentException) {
                                                                                                  throw a(null);
                                                                                                }  
                                                                                            } catch (IllegalArgumentException illegalArgumentException) {
                                                                                              throw a(null);
                                                                                            }  
                                                                                        } catch (IllegalArgumentException illegalArgumentException) {
                                                                                          throw a(null);
                                                                                        }  
                                                                                    } catch (IllegalArgumentException illegalArgumentException) {
                                                                                      throw a(null);
                                                                                    }  
                                                                                } catch (IllegalArgumentException illegalArgumentException) {
                                                                                  throw a(null);
                                                                                }  
                                                                            } catch (IllegalArgumentException illegalArgumentException) {
                                                                              throw a(null);
                                                                            }  
                                                                        } catch (IllegalArgumentException illegalArgumentException) {
                                                                          throw a(null);
                                                                        }  
                                                                    } catch (IllegalArgumentException illegalArgumentException) {
                                                                      throw a(null);
                                                                    }  
                                                                } catch (IllegalArgumentException illegalArgumentException) {
                                                                  throw a(null);
                                                                }  
                                                            } catch (IllegalArgumentException illegalArgumentException) {
                                                              throw a(null);
                                                            }  
                                                        } catch (IllegalArgumentException illegalArgumentException) {
                                                          throw a(null);
                                                        }  
                                                    } catch (IllegalArgumentException illegalArgumentException) {
                                                      throw a(null);
                                                    }  
                                                } catch (IllegalArgumentException illegalArgumentException) {
                                                  throw a(null);
                                                }  
                                            } catch (IllegalArgumentException illegalArgumentException) {
                                              throw a(null);
                                            }  
                                        } catch (IllegalArgumentException illegalArgumentException) {
                                          throw a(null);
                                        }  
                                    } catch (IllegalArgumentException illegalArgumentException) {
                                      throw a(null);
                                    }  
                                } catch (IllegalArgumentException illegalArgumentException) {
                                  throw a(null);
                                }  
                            } catch (IllegalArgumentException illegalArgumentException) {
                              throw a(null);
                            }  
                        } catch (IllegalArgumentException illegalArgumentException) {
                          throw a(null);
                        }  
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    }  
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                }  
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    boolean bool = ZR();
    try {
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        ZJ(!bool);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Objects.hash(new Object[] { 
          this.title, this.multipleOf, this.maximum, this.exclusiveMaximum, this.exclusiveMaximumValue, this.minimum, this.exclusiveMinimum, this.exclusiveMinimumValue, this.maxLength, this.minLength, 
          this.pattern, this.maxItems, this.minItems, this.uniqueItems, this.maxProperties, this.minProperties, this.required, this.type, this.not, this.properties, 
          this.additionalProperties, this.description, this.format, this.$ref, this.nullable, this.readOnly, this.writeOnly, this.example, this.externalDocs, this.deprecated, 
          this.xml, this.extensions, this.discriminator, this._enum, this._default, this.patternProperties, this.$id, this.$anchor, this.$schema, this.$vocabulary, 
          this.$dynamicAnchor, this.types, this.allOf, this.anyOf, this.oneOf, this._const, this.contentEncoding, this.contentMediaType, this.contentSchema, this.propertyNames, 
          this.unevaluatedProperties, this.maxContains, this.minContains, this.additionalItems, this.unevaluatedItems, this._if, this._else, this.then, this.dependentRequired, this.dependentSchemas, 
          this.$comment, this.examples, this.prefixItems, this.items });
  }
  
  public Map<String, Object> getExtensions() {
    return this.extensions;
  }
  
  public void addExtension(String paramString, Object paramObject) {
    try {
      if (paramString != null) {
        try {
          if (!paramString.isEmpty()) {
            try {
              if (this.specVersion == SpecVersion.V30)
                try {
                  if (!paramString.startsWith(a(14837, 11581)))
                    return; 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                }  
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } else {
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.extensions == null)
        this.extensions = new LinkedHashMap<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.extensions.put(paramString, paramObject);
  }
  
  public void setExtensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
  }
  
  public Schema extensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
    return this;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool = ZR();
    try {
      stringBuilder.append(a(14827, -5324));
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Object object1 = (this.specVersion == SpecVersion.V30) ? this.type : this.types;
    try {
      stringBuilder.append(a(14806, -16866)).append(toIndentedString(object1)).append("\n");
      stringBuilder.append(a(14843, -7392)).append(toIndentedString(this.format)).append("\n");
      stringBuilder.append(a(14810, -30149)).append(toIndentedString(this.$ref)).append("\n");
      stringBuilder.append(a(14835, 18564)).append(toIndentedString(this.description)).append("\n");
      stringBuilder.append(a(14840, 29405)).append(toIndentedString(this.title)).append("\n");
      stringBuilder.append(a(14799, -11149)).append(toIndentedString(this.multipleOf)).append("\n");
      stringBuilder.append(a(14845, 7292)).append(toIndentedString(this.maximum)).append("\n");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Object object2 = (this.specVersion == SpecVersion.V30) ? this.exclusiveMaximum : this.exclusiveMaximumValue;
    try {
      stringBuilder.append(a(14824, 13526)).append(toIndentedString(object2)).append("\n");
      stringBuilder.append(a(14847, 4504)).append(toIndentedString(this.minimum)).append("\n");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Object object3 = (this.specVersion == SpecVersion.V30) ? this.exclusiveMinimum : this.exclusiveMinimumValue;
    try {
      stringBuilder.append(a(14792, 5340)).append(toIndentedString(object3)).append("\n");
      stringBuilder.append(a(14833, 11202)).append(toIndentedString(this.maxLength)).append("\n");
      stringBuilder.append(a(14809, -23788)).append(toIndentedString(this.minLength)).append("\n");
      stringBuilder.append(a(14821, 26256)).append(toIndentedString(this.pattern)).append("\n");
      stringBuilder.append(a(14787, 13913)).append(toIndentedString(this.maxItems)).append("\n");
      stringBuilder.append(a(14816, 26693)).append(toIndentedString(this.minItems)).append("\n");
      stringBuilder.append(a(14800, 19229)).append(toIndentedString(this.uniqueItems)).append("\n");
      stringBuilder.append(a(14812, 27357)).append(toIndentedString(this.maxProperties)).append("\n");
      stringBuilder.append(a(14828, 19313)).append(toIndentedString(this.minProperties)).append("\n");
      stringBuilder.append(a(14801, -21744)).append(toIndentedString(this.required)).append("\n");
      stringBuilder.append(a(14802, 13024)).append(toIndentedString(this.not)).append("\n");
      stringBuilder.append(a(14819, -10202)).append(toIndentedString(this.properties)).append("\n");
      stringBuilder.append(a(14815, -29961)).append(toIndentedString(this.additionalProperties)).append("\n");
      stringBuilder.append(a(14786, -27359)).append(toIndentedString(this.nullable)).append("\n");
      stringBuilder.append(a(14803, -24312)).append(toIndentedString(this.readOnly)).append("\n");
      stringBuilder.append(a(14789, -26239)).append(toIndentedString(this.writeOnly)).append("\n");
      stringBuilder.append(a(14834, 14208)).append(toIndentedString(this.example)).append("\n");
      stringBuilder.append(a(14813, -23856)).append(toIndentedString(this.externalDocs)).append("\n");
      stringBuilder.append(a(14805, -17287)).append(toIndentedString(this.deprecated)).append("\n");
      stringBuilder.append(a(14826, -6648)).append(toIndentedString(this.discriminator)).append("\n");
      stringBuilder.append(a(14785, -24554)).append(toIndentedString(this.xml)).append("\n");
      if (this.specVersion == SpecVersion.V31) {
        stringBuilder.append(a(14796, 10318)).append(toIndentedString(this.patternProperties)).append("\n");
        stringBuilder.append(a(14794, -675)).append(toIndentedString(this.contains)).append("\n");
        stringBuilder.append(a(14811, 11500)).append(toIndentedString(this.$id)).append("\n");
        stringBuilder.append(a(14832, -14499)).append(toIndentedString(this.$anchor)).append("\n");
        stringBuilder.append(a(14831, -12974)).append(toIndentedString(this.$schema)).append("\n");
        stringBuilder.append(a(14846, 21865)).append(toIndentedString(this.$vocabulary)).append("\n");
        stringBuilder.append(a(14817, 29923)).append(toIndentedString(this.$dynamicAnchor)).append("\n");
        stringBuilder.append(a(14841, -27483)).append(toIndentedString(this._const)).append("\n");
        stringBuilder.append(a(14839, 2557)).append(toIndentedString(this.contentEncoding)).append("\n");
        stringBuilder.append(a(14784, 21001)).append(toIndentedString(this.contentMediaType)).append("\n");
        stringBuilder.append(a(14844, -6097)).append(toIndentedString(this.contentSchema)).append("\n");
        stringBuilder.append(a(14804, 12393)).append(toIndentedString(this.propertyNames)).append("\n");
        stringBuilder.append(a(14825, -3289)).append(toIndentedString(this.unevaluatedProperties)).append("\n");
        stringBuilder.append(a(14838, -2298)).append(toIndentedString(this.maxContains)).append("\n");
        stringBuilder.append(a(14836, 29968)).append(toIndentedString(this.minContains)).append("\n");
        stringBuilder.append(a(14829, 30207)).append(toIndentedString(this.additionalItems)).append("\n");
        stringBuilder.append(a(14798, -8332)).append(toIndentedString(this.unevaluatedItems)).append("\n");
        stringBuilder.append(a(14818, 1389)).append(toIndentedString(this._if)).append("\n");
        stringBuilder.append(a(14807, -22156)).append(toIndentedString(this._else)).append("\n");
        stringBuilder.append(a(14822, 31999)).append(toIndentedString(this.then)).append("\n");
        stringBuilder.append(a(14830, 19967)).append(toIndentedString(this.dependentRequired)).append("\n");
        stringBuilder.append(a(14842, -17339)).append(toIndentedString(this.dependentSchemas)).append("\n");
        stringBuilder.append(a(14793, 23153)).append(toIndentedString(this.$comment)).append("\n");
        stringBuilder.append(a(14823, 30702)).append(toIndentedString(this.prefixItems)).append("\n");
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      stringBuilder.append("}");
      if (bool)
        Zbqc.Zr(new Zbqc[4]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return stringBuilder.toString();
  }
  
  protected String toIndentedString(Object paramObject) {
    try {
      if (paramObject == null)
        return a(14788, 10687); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramObject.toString().replace("\n", a(14797, 32062));
  }
  
  public Schema _default(T paramT) {
    this._default = paramT;
    return this;
  }
  
  public Schema _enum(List<T> paramList) {
    this._enum = paramList;
    return this;
  }
  
  public Schema exampleSetFlag(boolean paramBoolean) {
    this.exampleSetFlag = paramBoolean;
    return this;
  }
  
  @OpenAPI31
  public T getConst() {
    return this._const;
  }
  
  @OpenAPI31
  public void setConst(Object paramObject) {
    this._const = cast(paramObject);
  }
  
  @OpenAPI31
  public Schema _const(Object paramObject) {
    this._const = cast(paramObject);
    return this;
  }
  
  @OpenAPI31
  public Boolean getBooleanSchemaValue() {
    return this.booleanSchemaValue;
  }
  
  @OpenAPI31
  public void setBooleanSchemaValue(Boolean paramBoolean) {
    this.booleanSchemaValue = paramBoolean;
  }
  
  @OpenAPI31
  public Schema booleanSchemaValue(Boolean paramBoolean) {
    this.booleanSchemaValue = paramBoolean;
    return this;
  }
  
  public static void ZJ(boolean paramBoolean) {
    Zc = paramBoolean;
  }
  
  public static boolean ZR() {
    return Zc;
  }
  
  public static boolean Zd() {
    boolean bool = ZR();
    try {
      if (!bool)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #64
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '0mEÀÛØÍ`5Q]¿ÿS¦_§rª#õìÉy)ê0ØE@¹q¾ÒtÕÐiû:¨±¾QÐÑÒ#²9,ôkJUÃ¡t§W (/_iiöfÆv?×ûû¶ÏüÇ*õ²dGc\\r©k,=ÂGÊ[L/Ë­e¼µGe¤H4V¯TGÌÂÝvÇ×gêaz¾;Ò+BJW\\tF; ¤leÿX±Þ®¨ç¾ÂÆ\\t5²g²{avÄ?ðjôCÒ½DRS{Ò\\n  ú×áÒ~·Ý@q1\\nvÌ×qGþõÑ+Ò)\\tXÜê }°ò5~\\tg±ý Ò­°\\râh´áö ä×\\f\3XoY¦âdv²V´8áã,êÑ\\fêD*r+µm2Ýâ-(MíÁ÷D8¶Ï;\\t7^Üý¡â-´áO Óp®ôJ.8\\r;~>J«^YrY¹2ß¹u£±ýg÷P@E}\\r¬3`±õ1g)\\rÞ>Â/¡¿n|ì~éKÕÞç©\½¹úAÁ\\r+þ|77s^Ë8î52ÆÝ>pqLAOËK%½JF)SÌ«ÁoB[H»IW¨jý²Ñ+ìâÃíÕ\\b$kÑkiÜÃ× à~ªÏ¹~d+´|~p¡L%*ÊGîy@Ê+¯ó\qµR®4:õHcujW4czÏÀ§Ëð¯Y¦öêVÍe­µ]É-¼/0àºå\\nX;â\\bÁ3I¯ýÍ5²ßz\\b`Õ\\tz¾wX¦ZCËzõ4íªÏLeBöG<Fc\\f}ÐB \ oÍÏÛE¿îk/\\tsxðÂí¦wê¬cé?Üù\\fú·ìßäÉÍoN'éë+kc\\tV{"(I1±ËäEBðg*a8ÊiÜZ$qQö`\\nÝ>ý¥VÁiÇÌü@#H©\\tl\\fòaäñýhð4' kö2­±nl²_\\rSsh~c`¤ÙæÄ$\\t\\n\Ðòê-»]\\tH7º©°¬\\t:ùóuÇ|e@ìuÓÆ÷7áP~e\\tO8jN~4ñVo¢íÊI4huç·çk(c|þI3Ó,R%<ÁJ'Ì÷ç\\r:êuÓñS ØR1U£4eD\\nñßËªÃä°L^¡ãå\\t½|®g'P8cï&&_â¢d#"}¬FúYjÃjHà½A\\bÑiÒÃ>-'hÛk\\noðôöv¦g qô\\nÀXðÈzâx%'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_0
    //   19: bipush #19
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic ZJ : (Z)V
    //   27: bipush #96
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 171
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc '¾Ø2VnB¾åÖÑ2ËK+oùæ§TM4¹Óv#'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #19
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #127
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 171
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
    //   133: putstatic net/portswigger/swagger/v3/oas/models/media/Schema.a : [Ljava/lang/String;
    //   136: bipush #64
    //   138: anewarray java/lang/String
    //   141: putstatic net/portswigger/swagger/v3/oas/models/media/Schema.b : [Ljava/lang/String;
    //   144: sipush #14795
    //   147: sipush #25122
    //   150: invokestatic a : (II)Ljava/lang/String;
    //   153: putstatic net/portswigger/swagger/v3/oas/models/media/Schema.BINARY_STRING_CONVERSION_PROPERTY : Ljava/lang/String;
    //   156: sipush #14808
    //   159: sipush #15979
    //   162: invokestatic a : (II)Ljava/lang/String;
    //   165: putstatic net/portswigger/swagger/v3/oas/models/media/Schema.BIND_TYPE_AND_TYPES : Ljava/lang/String;
    //   168: goto -> 328
    //   171: dup_x2
    //   172: pop
    //   173: invokevirtual toCharArray : ()[C
    //   176: dup_x1
    //   177: arraylength
    //   178: dup_x2
    //   179: pop
    //   180: iconst_0
    //   181: istore #6
    //   183: dup2_x1
    //   184: pop2
    //   185: dup_x2
    //   186: iconst_1
    //   187: if_icmpgt -> 287
    //   190: dup2
    //   191: swap
    //   192: iload #6
    //   194: dup2_x1
    //   195: caload
    //   196: swap
    //   197: iload #6
    //   199: bipush #7
    //   201: irem
    //   202: tableswitch default -> 270, 0 -> 240, 1 -> 245, 2 -> 250, 3 -> 255, 4 -> 260, 5 -> 265
    //   240: bipush #42
    //   242: goto -> 271
    //   245: bipush #21
    //   247: goto -> 271
    //   250: bipush #52
    //   252: goto -> 271
    //   255: bipush #34
    //   257: goto -> 271
    //   260: bipush #82
    //   262: goto -> 271
    //   265: bipush #13
    //   267: goto -> 271
    //   270: iconst_5
    //   271: ixor
    //   272: ixor
    //   273: i2c
    //   274: castore
    //   275: iinc #6, 1
    //   278: dup
    //   279: ifne -> 287
    //   282: dup2
    //   283: dup_x1
    //   284: goto -> 194
    //   287: dup2_x1
    //   288: pop2
    //   289: dup_x2
    //   290: iload #6
    //   292: if_icmpgt -> 190
    //   295: pop
    //   296: new java/lang/String
    //   299: dup_x1
    //   300: swap
    //   301: invokespecial <init> : ([C)V
    //   304: invokevirtual intern : ()Ljava/lang/String;
    //   307: swap
    //   308: pop
    //   309: swap
    //   310: tableswitch default -> 44, 0 -> 103
    //   328: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x39EA) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\oas\models\media\Schema.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */