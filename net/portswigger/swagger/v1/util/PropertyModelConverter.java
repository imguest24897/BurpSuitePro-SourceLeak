package net.portswigger.swagger.v1.util;

import burp.Zbqc;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import net.portswigger.swagger.v1.models.ArrayModel;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.ModelImpl;
import net.portswigger.swagger.v1.models.RefModel;
import net.portswigger.swagger.v1.models.Xml;
import net.portswigger.swagger.v1.models.properties.AbstractNumericProperty;
import net.portswigger.swagger.v1.models.properties.ArrayProperty;
import net.portswigger.swagger.v1.models.properties.MapProperty;
import net.portswigger.swagger.v1.models.properties.ObjectProperty;
import net.portswigger.swagger.v1.models.properties.Property;
import net.portswigger.swagger.v1.models.properties.PropertyBuilder;
import net.portswigger.swagger.v1.models.properties.RefProperty;
import net.portswigger.swagger.v1.models.properties.StringProperty;

public class PropertyModelConverter {
  public Property modelToProperty(Model paramModel) {
    // Byte code:
    //   0: invokestatic Zu : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: instanceof net/portswigger/swagger/v1/models/ModelImpl
    //   8: ifeq -> 379
    //   11: aload_1
    //   12: checkcast net/portswigger/swagger/v1/models/ModelImpl
    //   15: astore_3
    //   16: aload_3
    //   17: invokevirtual getAdditionalProperties : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   20: ifnull -> 201
    //   23: new net/portswigger/swagger/v1/models/properties/MapProperty
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: astore #4
    //   32: aload #4
    //   34: aload_3
    //   35: invokevirtual getType : ()Ljava/lang/String;
    //   38: invokevirtual setType : (Ljava/lang/String;)V
    //   41: aload #4
    //   43: aload_3
    //   44: invokevirtual getAllowEmptyValue : ()Ljava/lang/Boolean;
    //   47: invokevirtual setAllowEmptyValue : (Ljava/lang/Boolean;)V
    //   50: aload #4
    //   52: aload_3
    //   53: invokevirtual getDefaultValue : ()Ljava/lang/Object;
    //   56: checkcast java/lang/String
    //   59: invokevirtual setDefault : (Ljava/lang/String;)V
    //   62: aload #4
    //   64: aload_3
    //   65: invokevirtual getDescription : ()Ljava/lang/String;
    //   68: invokevirtual setDescription : (Ljava/lang/String;)V
    //   71: aload #4
    //   73: aload_3
    //   74: invokevirtual getExample : ()Ljava/lang/Object;
    //   77: invokevirtual setExample : (Ljava/lang/Object;)V
    //   80: aload #4
    //   82: aload_3
    //   83: invokevirtual getFormat : ()Ljava/lang/String;
    //   86: invokevirtual setFormat : (Ljava/lang/String;)V
    //   89: aload #4
    //   91: aload_3
    //   92: invokevirtual getName : ()Ljava/lang/String;
    //   95: invokevirtual setName : (Ljava/lang/String;)V
    //   98: aload #4
    //   100: aload_3
    //   101: invokevirtual getTitle : ()Ljava/lang/String;
    //   104: invokevirtual setTitle : (Ljava/lang/String;)V
    //   107: aload_3
    //   108: invokevirtual getRequired : ()Ljava/util/List;
    //   111: astore #5
    //   113: aload #5
    //   115: ifnull -> 171
    //   118: aload #5
    //   120: invokeinterface iterator : ()Ljava/util/Iterator;
    //   125: astore #6
    //   127: aload #6
    //   129: invokeinterface hasNext : ()Z
    //   134: ifeq -> 171
    //   137: aload #6
    //   139: invokeinterface next : ()Ljava/lang/Object;
    //   144: checkcast java/lang/String
    //   147: astore #7
    //   149: aload #7
    //   151: aload_3
    //   152: invokevirtual getName : ()Ljava/lang/String;
    //   155: invokevirtual equals : (Ljava/lang/Object;)Z
    //   158: ifeq -> 167
    //   161: aload #4
    //   163: iconst_1
    //   164: invokevirtual setRequired : (Z)V
    //   167: iload_2
    //   168: ifne -> 127
    //   171: aload #4
    //   173: aload_3
    //   174: invokevirtual getXml : ()Lnet/portswigger/swagger/v1/models/Xml;
    //   177: invokevirtual setXml : (Lnet/portswigger/swagger/v1/models/Xml;)V
    //   180: aload #4
    //   182: aload_3
    //   183: invokevirtual getVendorExtensions : ()Ljava/util/Map;
    //   186: invokevirtual setVendorExtensions : (Ljava/util/Map;)V
    //   189: aload #4
    //   191: aload_3
    //   192: invokevirtual getAdditionalProperties : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   195: invokevirtual setAdditionalProperties : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   198: aload #4
    //   200: areturn
    //   201: aload_0
    //   202: aload_3
    //   203: invokevirtual propertyByType : (Lnet/portswigger/swagger/v1/models/ModelImpl;)Lnet/portswigger/swagger/v1/models/properties/Property;
    //   206: astore #4
    //   208: aload #4
    //   210: instanceof net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   213: ifeq -> 248
    //   216: aload #4
    //   218: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   221: astore #5
    //   223: aload #5
    //   225: aload_1
    //   226: invokeinterface getProperties : ()Ljava/util/Map;
    //   231: invokevirtual setProperties : (Ljava/util/Map;)V
    //   234: aload #5
    //   236: aload_1
    //   237: invokeinterface getExample : ()Ljava/lang/Object;
    //   242: invokevirtual setExample : (Ljava/lang/Object;)V
    //   245: aload #5
    //   247: areturn
    //   248: aload #4
    //   250: instanceof net/portswigger/swagger/v1/models/properties/StringProperty
    //   253: ifeq -> 302
    //   256: aload #4
    //   258: checkcast net/portswigger/swagger/v1/models/properties/StringProperty
    //   261: astore #5
    //   263: aload_1
    //   264: checkcast net/portswigger/swagger/v1/models/ModelImpl
    //   267: astore #6
    //   269: aload #5
    //   271: aload #6
    //   273: invokevirtual getPattern : ()Ljava/lang/String;
    //   276: invokevirtual setPattern : (Ljava/lang/String;)V
    //   279: aload #5
    //   281: aload #6
    //   283: invokevirtual getMaxLength : ()Ljava/lang/Integer;
    //   286: invokevirtual setMaxLength : (Ljava/lang/Integer;)V
    //   289: aload #5
    //   291: aload #6
    //   293: invokevirtual getMinLength : ()Ljava/lang/Integer;
    //   296: invokevirtual setMinLength : (Ljava/lang/Integer;)V
    //   299: aload #5
    //   301: areturn
    //   302: aload #4
    //   304: instanceof net/portswigger/swagger/v1/models/properties/AbstractNumericProperty
    //   307: ifeq -> 376
    //   310: aload #4
    //   312: checkcast net/portswigger/swagger/v1/models/properties/AbstractNumericProperty
    //   315: astore #5
    //   317: aload_1
    //   318: checkcast net/portswigger/swagger/v1/models/ModelImpl
    //   321: astore #6
    //   323: aload #5
    //   325: aload #6
    //   327: invokevirtual getMaximum : ()Ljava/math/BigDecimal;
    //   330: invokevirtual setMaximum : (Ljava/math/BigDecimal;)V
    //   333: aload #5
    //   335: aload #6
    //   337: invokevirtual getMinimum : ()Ljava/math/BigDecimal;
    //   340: invokevirtual setMinimum : (Ljava/math/BigDecimal;)V
    //   343: aload #5
    //   345: aload #6
    //   347: invokevirtual getMultipleOf : ()Ljava/math/BigDecimal;
    //   350: invokevirtual setMultipleOf : (Ljava/math/BigDecimal;)V
    //   353: aload #5
    //   355: aload #6
    //   357: invokevirtual getExclusiveMinimum : ()Ljava/lang/Boolean;
    //   360: invokevirtual setExclusiveMinimum : (Ljava/lang/Boolean;)V
    //   363: aload #5
    //   365: aload #6
    //   367: invokevirtual getExclusiveMaximum : ()Ljava/lang/Boolean;
    //   370: invokevirtual setExclusiveMaximum : (Ljava/lang/Boolean;)V
    //   373: aload #5
    //   375: areturn
    //   376: aload #4
    //   378: areturn
    //   379: aload_1
    //   380: instanceof net/portswigger/swagger/v1/models/ArrayModel
    //   383: ifeq -> 479
    //   386: aload_1
    //   387: checkcast net/portswigger/swagger/v1/models/ArrayModel
    //   390: astore_3
    //   391: new net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   394: dup
    //   395: invokespecial <init> : ()V
    //   398: astore #4
    //   400: aload_3
    //   401: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   404: astore #5
    //   406: aload #4
    //   408: aload #5
    //   410: invokevirtual setItems : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   413: aload #4
    //   415: aload_3
    //   416: invokevirtual getExample : ()Ljava/lang/Object;
    //   419: invokevirtual setExample : (Ljava/lang/Object;)V
    //   422: aload #4
    //   424: aload_3
    //   425: invokevirtual getMaxItems : ()Ljava/lang/Integer;
    //   428: invokevirtual setMaxItems : (Ljava/lang/Integer;)V
    //   431: aload #4
    //   433: aload_3
    //   434: invokevirtual getMinItems : ()Ljava/lang/Integer;
    //   437: invokevirtual setMinItems : (Ljava/lang/Integer;)V
    //   440: aload #4
    //   442: aload_3
    //   443: invokevirtual getDescription : ()Ljava/lang/String;
    //   446: invokevirtual setDescription : (Ljava/lang/String;)V
    //   449: aload #4
    //   451: aload_3
    //   452: invokevirtual getTitle : ()Ljava/lang/String;
    //   455: invokevirtual setTitle : (Ljava/lang/String;)V
    //   458: aload #4
    //   460: aload_3
    //   461: invokevirtual getUniqueItems : ()Ljava/lang/Boolean;
    //   464: invokevirtual setUniqueItems : (Ljava/lang/Boolean;)V
    //   467: aload #4
    //   469: aload_3
    //   470: invokevirtual getXml : ()Lnet/portswigger/swagger/v1/models/Xml;
    //   473: invokevirtual setXml : (Lnet/portswigger/swagger/v1/models/Xml;)V
    //   476: aload #4
    //   478: areturn
    //   479: aload_1
    //   480: instanceof net/portswigger/swagger/v1/models/RefModel
    //   483: ifeq -> 511
    //   486: aload_1
    //   487: checkcast net/portswigger/swagger/v1/models/RefModel
    //   490: astore_3
    //   491: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   494: dup
    //   495: aload_3
    //   496: invokevirtual get$ref : ()Ljava/lang/String;
    //   499: aload_3
    //   500: invokevirtual getRefFormat : ()Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   503: invokespecial <init> : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/refs/RefFormat;)V
    //   506: astore #4
    //   508: aload #4
    //   510: areturn
    //   511: aload_1
    //   512: instanceof net/portswigger/swagger/v1/models/ComposedModel
    //   515: ifeq -> 887
    //   518: new net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   521: dup
    //   522: invokespecial <init> : ()V
    //   525: astore_3
    //   526: aload_3
    //   527: aload_1
    //   528: invokeinterface getDescription : ()Ljava/lang/String;
    //   533: invokevirtual setDescription : (Ljava/lang/String;)V
    //   536: aload_3
    //   537: aload_1
    //   538: invokeinterface getTitle : ()Ljava/lang/String;
    //   543: invokevirtual setTitle : (Ljava/lang/String;)V
    //   546: aload_3
    //   547: aload_1
    //   548: invokeinterface getExample : ()Ljava/lang/Object;
    //   553: invokevirtual setExample : (Ljava/lang/Object;)V
    //   556: aload_1
    //   557: checkcast net/portswigger/swagger/v1/models/ComposedModel
    //   560: astore #4
    //   562: new java/util/HashSet
    //   565: dup
    //   566: invokespecial <init> : ()V
    //   569: astore #5
    //   571: aload #4
    //   573: invokevirtual getAllOf : ()Ljava/util/List;
    //   576: invokeinterface iterator : ()Ljava/util/Iterator;
    //   581: astore #6
    //   583: aload #6
    //   585: invokeinterface hasNext : ()Z
    //   590: ifeq -> 792
    //   593: aload #6
    //   595: invokeinterface next : ()Ljava/lang/Object;
    //   600: checkcast net/portswigger/swagger/v1/models/Model
    //   603: astore #7
    //   605: aload_0
    //   606: aload #7
    //   608: invokevirtual modelToProperty : (Lnet/portswigger/swagger/v1/models/Model;)Lnet/portswigger/swagger/v1/models/properties/Property;
    //   611: astore #8
    //   613: aload #8
    //   615: instanceof net/portswigger/swagger/v1/models/properties/RefProperty
    //   618: ifeq -> 644
    //   621: aload #8
    //   623: checkcast net/portswigger/swagger/v1/models/properties/RefProperty
    //   626: astore #9
    //   628: aload_3
    //   629: aload #9
    //   631: invokevirtual getSimpleRef : ()Ljava/lang/String;
    //   634: aload #8
    //   636: invokevirtual property : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v1/models/properties/ObjectProperty;
    //   639: pop
    //   640: iload_2
    //   641: ifne -> 788
    //   644: aload #8
    //   646: instanceof net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   649: ifeq -> 788
    //   652: aload #8
    //   654: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   657: astore #9
    //   659: aload #9
    //   661: invokevirtual getProperties : ()Ljava/util/Map;
    //   664: ifnull -> 732
    //   667: aload #9
    //   669: invokevirtual getProperties : ()Ljava/util/Map;
    //   672: invokeinterface keySet : ()Ljava/util/Set;
    //   677: invokeinterface iterator : ()Ljava/util/Iterator;
    //   682: astore #10
    //   684: aload #10
    //   686: invokeinterface hasNext : ()Z
    //   691: ifeq -> 732
    //   694: aload #10
    //   696: invokeinterface next : ()Ljava/lang/Object;
    //   701: checkcast java/lang/String
    //   704: astore #11
    //   706: aload_3
    //   707: aload #11
    //   709: aload #9
    //   711: invokevirtual getProperties : ()Ljava/util/Map;
    //   714: aload #11
    //   716: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   721: checkcast net/portswigger/swagger/v1/models/properties/Property
    //   724: invokevirtual property : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v1/models/properties/ObjectProperty;
    //   727: pop
    //   728: iload_2
    //   729: ifne -> 684
    //   732: aload #9
    //   734: invokevirtual getRequiredProperties : ()Ljava/util/List;
    //   737: ifnull -> 788
    //   740: aload #9
    //   742: invokevirtual getRequiredProperties : ()Ljava/util/List;
    //   745: invokeinterface iterator : ()Ljava/util/Iterator;
    //   750: astore #10
    //   752: aload #10
    //   754: invokeinterface hasNext : ()Z
    //   759: ifeq -> 788
    //   762: aload #10
    //   764: invokeinterface next : ()Ljava/lang/Object;
    //   769: checkcast java/lang/String
    //   772: astore #11
    //   774: aload #5
    //   776: aload #11
    //   778: invokeinterface add : (Ljava/lang/Object;)Z
    //   783: pop
    //   784: iload_2
    //   785: ifne -> 752
    //   788: iload_2
    //   789: ifne -> 583
    //   792: aload #5
    //   794: invokeinterface size : ()I
    //   799: ifle -> 815
    //   802: aload_3
    //   803: new java/util/ArrayList
    //   806: dup
    //   807: aload #5
    //   809: invokespecial <init> : (Ljava/util/Collection;)V
    //   812: invokevirtual setRequiredProperties : (Ljava/util/List;)V
    //   815: aload #4
    //   817: invokevirtual getVendorExtensions : ()Ljava/util/Map;
    //   820: ifnull -> 885
    //   823: aload #4
    //   825: invokevirtual getVendorExtensions : ()Ljava/util/Map;
    //   828: invokeinterface keySet : ()Ljava/util/Set;
    //   833: invokeinterface iterator : ()Ljava/util/Iterator;
    //   838: astore #6
    //   840: aload #6
    //   842: invokeinterface hasNext : ()Z
    //   847: ifeq -> 885
    //   850: aload #6
    //   852: invokeinterface next : ()Ljava/lang/Object;
    //   857: checkcast java/lang/String
    //   860: astore #7
    //   862: aload_3
    //   863: aload #7
    //   865: aload #4
    //   867: invokevirtual getVendorExtensions : ()Ljava/util/Map;
    //   870: aload #7
    //   872: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   877: invokevirtual vendorExtension : (Ljava/lang/String;Ljava/lang/Object;)Lnet/portswigger/swagger/v1/models/properties/ObjectProperty;
    //   880: pop
    //   881: iload_2
    //   882: ifne -> 840
    //   885: aload_3
    //   886: areturn
    //   887: aconst_null
    //   888: areturn
  }
  
  private Property propertyByType(ModelImpl paramModelImpl) {
    return PropertyBuilder.build(paramModelImpl.getType(), paramModelImpl.getFormat(), argsFromModel(paramModelImpl));
  }
  
  private Map<PropertyBuilder.PropertyId, Object> argsFromModel(ModelImpl paramModelImpl) {
    if (paramModelImpl == null)
      return Collections.emptyMap(); 
    EnumMap<PropertyBuilder.PropertyId, Object> enumMap = new EnumMap<>(PropertyBuilder.PropertyId.class);
    enumMap.put(PropertyBuilder.PropertyId.DESCRIPTION, paramModelImpl.getDescription());
    enumMap.put(PropertyBuilder.PropertyId.EXAMPLE, paramModelImpl.getExample());
    enumMap.put(PropertyBuilder.PropertyId.ENUM, paramModelImpl.getEnum());
    enumMap.put(PropertyBuilder.PropertyId.TITLE, paramModelImpl.getTitle());
    enumMap.put(PropertyBuilder.PropertyId.DEFAULT, paramModelImpl.getDefaultValue());
    enumMap.put(PropertyBuilder.PropertyId.DESCRIMINATOR, paramModelImpl.getDiscriminator());
    enumMap.put(PropertyBuilder.PropertyId.UNIQUE_ITEMS, paramModelImpl.getUniqueItems());
    enumMap.put(PropertyBuilder.PropertyId.VENDOR_EXTENSIONS, paramModelImpl.getVendorExtensions());
    enumMap.put(PropertyBuilder.PropertyId.PATTERN, paramModelImpl.getPattern());
    enumMap.put(PropertyBuilder.PropertyId.MAXIMUM, paramModelImpl.getMaximum());
    enumMap.put(PropertyBuilder.PropertyId.MINIMUM, paramModelImpl.getMinimum());
    enumMap.put(PropertyBuilder.PropertyId.EXCLUSIVE_MAXIMUM, paramModelImpl.getExclusiveMaximum());
    enumMap.put(PropertyBuilder.PropertyId.EXCLUSIVE_MINIMUM, paramModelImpl.getExclusiveMinimum());
    enumMap.put(PropertyBuilder.PropertyId.MULTIPLE_OF, paramModelImpl.getMultipleOf());
    enumMap.put(PropertyBuilder.PropertyId.MIN_LENGTH, paramModelImpl.getMinLength());
    enumMap.put(PropertyBuilder.PropertyId.MAX_LENGTH, paramModelImpl.getMaxLength());
    return enumMap;
  }
  
  public Model propertyToModel(Property paramProperty) {
    String str1 = paramProperty.getDescription();
    String str2 = paramProperty.getType();
    int i = Json.ZQ();
    String str3 = paramProperty.getFormat();
    Object object = null;
    Boolean bool = paramProperty.getAllowEmptyValue();
    if (paramProperty instanceof RefProperty) {
      RefProperty refProperty = (RefProperty)paramProperty;
      return (Model)new RefModel(refProperty.getOriginalRef(), refProperty.getRefFormat());
    } 
    Map map1 = paramProperty.getVendorExtensions();
    Property property = null;
    if (paramProperty instanceof MapProperty)
      property = ((MapProperty)paramProperty).getAdditionalProperties(); 
    String str4 = paramProperty.getName();
    Xml xml = paramProperty.getXml();
    Map map2 = null;
    if (paramProperty instanceof ObjectProperty) {
      ObjectProperty objectProperty = (ObjectProperty)paramProperty;
      map2 = objectProperty.getProperties();
    } 
    if (paramProperty instanceof ArrayProperty) {
      ArrayProperty arrayProperty = (ArrayProperty)paramProperty;
      ArrayModel arrayModel = new ArrayModel();
      arrayModel.setItems(arrayProperty.getItems());
      arrayModel.setDescription(str1);
      arrayModel.setExample(object);
      arrayModel.setUniqueItems(arrayProperty.getUniqueItems());
      if (map1 != null)
        arrayModel.setVendorExtensions(map1); 
      if (map2 != null)
        arrayModel.setProperties(map2); 
      return (Model)arrayModel;
    } 
    ModelImpl modelImpl = new ModelImpl();
    modelImpl.setDescription(str1);
    modelImpl.setExample(paramProperty.getExample());
    modelImpl.setName(str4);
    modelImpl.setXml(xml);
    modelImpl.setType(str2);
    modelImpl.setFormat(str3);
    modelImpl.setAllowEmptyValue(bool);
    if (paramProperty instanceof StringProperty) {
      StringProperty stringProperty = (StringProperty)paramProperty;
      modelImpl.setPattern(stringProperty.getPattern());
      modelImpl.setMinLength(stringProperty.getMinLength());
      modelImpl.setMaxLength(stringProperty.getMaxLength());
      modelImpl.setEnum(stringProperty.getEnum());
    } 
    if (paramProperty instanceof AbstractNumericProperty) {
      AbstractNumericProperty abstractNumericProperty = (AbstractNumericProperty)paramProperty;
      modelImpl.setMaximum(abstractNumericProperty.getMaximum());
      modelImpl.setMinimum(abstractNumericProperty.getMinimum());
      modelImpl.setExclusiveMaximum(abstractNumericProperty.getExclusiveMaximum());
      modelImpl.setExclusiveMinimum(abstractNumericProperty.getExclusiveMinimum());
      modelImpl.setMultipleOf(abstractNumericProperty.getMultipleOf());
    } 
    if (map1 != null)
      modelImpl.setVendorExtensions(map1); 
    if (property != null)
      modelImpl.setAdditionalProperties(property); 
    if (map2 != null)
      modelImpl.setProperties(map2); 
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
    return (Model)modelImpl;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\PropertyModelConverter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */