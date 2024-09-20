package net.portswigger.swagger.v1.models.parameters;

import burp.Zbqc;
import com.fasterxml.Zva;
import com.fasterxml.Zy1;
import com.fasterxml.Zyx;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.portswigger.swagger.v1.models.properties.ArrayProperty;
import net.portswigger.swagger.v1.models.properties.Property;

@Zva({"name", "in", "description", "required", "type", "items", "collectionFormat", "default", "maximum", "exclusiveMaximum", "minimum", "exclusiveMinimum", "maxLength", "minLength", "pattern", "maxItems", "minItems", "uniqueItems", "multipleOf"})
public abstract class AbstractSerializableParameter<T extends AbstractSerializableParameter<T>> extends AbstractParameter implements SerializableParameter {
  protected String type;
  
  protected String format;
  
  protected String collectionFormat;
  
  protected Property items;
  
  protected Boolean exclusiveMaximum;
  
  protected BigDecimal maximum;
  
  protected Boolean exclusiveMinimum;
  
  protected BigDecimal minimum;
  
  protected String example;
  
  private Integer maxItems;
  
  private Integer minItems;
  
  protected Boolean allowEmptyValue;
  
  @Zyx
  protected List<String> _enum;
  
  public Integer maxLength;
  
  public Integer minLength;
  
  public String pattern;
  
  public Boolean uniqueItems;
  
  public Number multipleOf;
  
  @Zyx
  protected String defaultValue;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public T property(Property paramProperty) {
    setProperty(paramProperty);
    return castThis();
  }
  
  public T type(String paramString) {
    setType(paramString);
    return castThis();
  }
  
  public T format(String paramString) {
    setFormat(paramString);
    return castThis();
  }
  
  public T description(String paramString) {
    setDescription(paramString);
    return castThis();
  }
  
  public T name(String paramString) {
    setName(paramString);
    return castThis();
  }
  
  public T required(boolean paramBoolean) {
    setRequired(paramBoolean);
    return castThis();
  }
  
  public T collectionFormat(String paramString) {
    setCollectionFormat(paramString);
    return castThis();
  }
  
  public T example(String paramString) {
    setExample(paramString);
    return castThis();
  }
  
  public T allowEmptyValue(Boolean paramBoolean) {
    setAllowEmptyValue(paramBoolean);
    return castThis();
  }
  
  public T readOnly(Boolean paramBoolean) {
    setReadOnly(paramBoolean);
    return castThis();
  }
  
  @Zyx
  protected String getDefaultCollectionFormat() {
    return a(-30515, -14937);
  }
  
  public T items(Property paramProperty) {
    this.items = paramProperty;
    return castThis();
  }
  
  public T _enum(List<String> paramList) {
    this._enum = paramList;
    return castThis();
  }
  
  @Zyx
  public List<String> getEnum() {
    return this._enum;
  }
  
  public void setEnum(List<String> paramList) {
    this._enum = paramList;
  }
  
  @Zy1("enum")
  public List<Object> getEnumValue() {
    // Byte code:
    //   0: invokestatic Zz : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield _enum : Ljava/util/List;
    //   8: ifnonnull -> 17
    //   11: aconst_null
    //   12: areturn
    //   13: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   16: athrow
    //   17: aload_0
    //   18: getfield _enum : Ljava/util/List;
    //   21: invokeinterface isEmpty : ()Z
    //   26: ifeq -> 37
    //   29: invokestatic emptyList : ()Ljava/util/List;
    //   32: areturn
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: new java/util/ArrayList
    //   40: dup
    //   41: aload_0
    //   42: getfield _enum : Ljava/util/List;
    //   45: invokeinterface size : ()I
    //   50: invokespecial <init> : (I)V
    //   53: astore_2
    //   54: sipush #-30519
    //   57: sipush #3204
    //   60: invokestatic a : (II)Ljava/lang/String;
    //   63: aload_0
    //   64: getfield type : Ljava/lang/String;
    //   67: invokevirtual equals : (Ljava/lang/Object;)Z
    //   70: ifne -> 99
    //   73: sipush #-30520
    //   76: sipush #29402
    //   79: invokestatic a : (II)Ljava/lang/String;
    //   82: aload_0
    //   83: getfield type : Ljava/lang/String;
    //   86: invokevirtual equals : (Ljava/lang/Object;)Z
    //   89: ifeq -> 434
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: aload_0
    //   100: getfield _enum : Ljava/util/List;
    //   103: invokeinterface iterator : ()Ljava/util/Iterator;
    //   108: astore_3
    //   109: aload_3
    //   110: invokeinterface hasNext : ()Z
    //   115: ifeq -> 430
    //   118: aload_3
    //   119: invokeinterface next : ()Ljava/lang/Object;
    //   124: checkcast java/lang/String
    //   127: astore #4
    //   129: sipush #-30513
    //   132: sipush #10465
    //   135: invokestatic a : (II)Ljava/lang/String;
    //   138: aload_0
    //   139: getfield format : Ljava/lang/String;
    //   142: invokevirtual equals : (Ljava/lang/Object;)Z
    //   145: ifeq -> 171
    //   148: aload_2
    //   149: aload #4
    //   151: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Integer;
    //   154: invokeinterface add : (Ljava/lang/Object;)Z
    //   159: pop
    //   160: aload_1
    //   161: ifnull -> 412
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   170: athrow
    //   171: sipush #-30516
    //   174: sipush #7445
    //   177: invokestatic a : (II)Ljava/lang/String;
    //   180: aload_0
    //   181: getfield format : Ljava/lang/String;
    //   184: invokevirtual equals : (Ljava/lang/Object;)Z
    //   187: ifeq -> 220
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   196: athrow
    //   197: aload_2
    //   198: aload #4
    //   200: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Long;
    //   203: invokeinterface add : (Ljava/lang/Object;)Z
    //   208: pop
    //   209: aload_1
    //   210: ifnull -> 412
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   219: athrow
    //   220: sipush #-30524
    //   223: sipush #4338
    //   226: invokestatic a : (II)Ljava/lang/String;
    //   229: aload_0
    //   230: getfield format : Ljava/lang/String;
    //   233: invokevirtual equals : (Ljava/lang/Object;)Z
    //   236: ifeq -> 269
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   245: athrow
    //   246: aload_2
    //   247: aload #4
    //   249: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Double;
    //   252: invokeinterface add : (Ljava/lang/Object;)Z
    //   257: pop
    //   258: aload_1
    //   259: ifnull -> 412
    //   262: goto -> 269
    //   265: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   268: athrow
    //   269: sipush #-30527
    //   272: sipush #-3854
    //   275: invokestatic a : (II)Ljava/lang/String;
    //   278: aload_0
    //   279: getfield format : Ljava/lang/String;
    //   282: invokevirtual equals : (Ljava/lang/Object;)Z
    //   285: ifeq -> 318
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   294: athrow
    //   295: aload_2
    //   296: aload #4
    //   298: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Float;
    //   301: invokeinterface add : (Ljava/lang/Object;)Z
    //   306: pop
    //   307: aload_1
    //   308: ifnull -> 412
    //   311: goto -> 318
    //   314: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   317: athrow
    //   318: sipush #-30514
    //   321: sipush #-3003
    //   324: invokestatic a : (II)Ljava/lang/String;
    //   327: aload_0
    //   328: getfield type : Ljava/lang/String;
    //   331: invokevirtual equals : (Ljava/lang/Object;)Z
    //   334: ifeq -> 367
    //   337: goto -> 344
    //   340: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   343: athrow
    //   344: aload_2
    //   345: aload #4
    //   347: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Integer;
    //   350: invokeinterface add : (Ljava/lang/Object;)Z
    //   355: pop
    //   356: aload_1
    //   357: ifnull -> 412
    //   360: goto -> 367
    //   363: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   366: athrow
    //   367: sipush #-30525
    //   370: sipush #-2079
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: aload_0
    //   377: getfield type : Ljava/lang/String;
    //   380: invokevirtual equals : (Ljava/lang/Object;)Z
    //   383: ifeq -> 412
    //   386: goto -> 393
    //   389: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   392: athrow
    //   393: aload_2
    //   394: aload #4
    //   396: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Double;
    //   399: invokeinterface add : (Ljava/lang/Object;)Z
    //   404: pop
    //   405: goto -> 412
    //   408: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   411: athrow
    //   412: goto -> 426
    //   415: astore #5
    //   417: aload_2
    //   418: aload #4
    //   420: invokeinterface add : (Ljava/lang/Object;)Z
    //   425: pop
    //   426: aload_1
    //   427: ifnull -> 109
    //   430: aload_1
    //   431: ifnull -> 869
    //   434: aload_0
    //   435: getfield type : Ljava/lang/String;
    //   438: ifnull -> 474
    //   441: goto -> 448
    //   444: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   447: athrow
    //   448: sipush #-30517
    //   451: sipush #-3892
    //   454: invokestatic a : (II)Ljava/lang/String;
    //   457: aload_0
    //   458: getfield type : Ljava/lang/String;
    //   461: invokevirtual equals : (Ljava/lang/Object;)Z
    //   464: ifeq -> 826
    //   467: goto -> 474
    //   470: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   473: athrow
    //   474: aload_0
    //   475: getfield items : Lnet/portswigger/swagger/v1/models/properties/Property;
    //   478: ifnull -> 826
    //   481: goto -> 488
    //   484: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   487: athrow
    //   488: aload_0
    //   489: getfield _enum : Ljava/util/List;
    //   492: invokeinterface iterator : ()Ljava/util/Iterator;
    //   497: astore_3
    //   498: aload_3
    //   499: invokeinterface hasNext : ()Z
    //   504: ifeq -> 822
    //   507: aload_3
    //   508: invokeinterface next : ()Ljava/lang/Object;
    //   513: checkcast java/lang/String
    //   516: astore #4
    //   518: aload_0
    //   519: getfield items : Lnet/portswigger/swagger/v1/models/properties/Property;
    //   522: instanceof net/portswigger/swagger/v1/models/properties/StringProperty
    //   525: ifeq -> 548
    //   528: aload_2
    //   529: aload #4
    //   531: invokeinterface add : (Ljava/lang/Object;)Z
    //   536: pop
    //   537: aload_1
    //   538: ifnull -> 804
    //   541: goto -> 548
    //   544: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   547: athrow
    //   548: aload_0
    //   549: getfield items : Lnet/portswigger/swagger/v1/models/properties/Property;
    //   552: instanceof net/portswigger/swagger/v1/models/properties/IntegerProperty
    //   555: ifeq -> 588
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   564: athrow
    //   565: aload_2
    //   566: aload #4
    //   568: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Integer;
    //   571: invokeinterface add : (Ljava/lang/Object;)Z
    //   576: pop
    //   577: aload_1
    //   578: ifnull -> 804
    //   581: goto -> 588
    //   584: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   587: athrow
    //   588: aload_0
    //   589: getfield items : Lnet/portswigger/swagger/v1/models/properties/Property;
    //   592: instanceof net/portswigger/swagger/v1/models/properties/LongProperty
    //   595: ifeq -> 628
    //   598: goto -> 605
    //   601: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   604: athrow
    //   605: aload_2
    //   606: aload #4
    //   608: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Long;
    //   611: invokeinterface add : (Ljava/lang/Object;)Z
    //   616: pop
    //   617: aload_1
    //   618: ifnull -> 804
    //   621: goto -> 628
    //   624: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   627: athrow
    //   628: aload_0
    //   629: getfield items : Lnet/portswigger/swagger/v1/models/properties/Property;
    //   632: instanceof net/portswigger/swagger/v1/models/properties/FloatProperty
    //   635: ifeq -> 668
    //   638: goto -> 645
    //   641: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   644: athrow
    //   645: aload_2
    //   646: aload #4
    //   648: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Float;
    //   651: invokeinterface add : (Ljava/lang/Object;)Z
    //   656: pop
    //   657: aload_1
    //   658: ifnull -> 804
    //   661: goto -> 668
    //   664: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   667: athrow
    //   668: aload_0
    //   669: getfield items : Lnet/portswigger/swagger/v1/models/properties/Property;
    //   672: instanceof net/portswigger/swagger/v1/models/properties/DoubleProperty
    //   675: ifeq -> 708
    //   678: goto -> 685
    //   681: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   684: athrow
    //   685: aload_2
    //   686: aload #4
    //   688: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Double;
    //   691: invokeinterface add : (Ljava/lang/Object;)Z
    //   696: pop
    //   697: aload_1
    //   698: ifnull -> 804
    //   701: goto -> 708
    //   704: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   707: athrow
    //   708: aload_0
    //   709: getfield items : Lnet/portswigger/swagger/v1/models/properties/Property;
    //   712: instanceof net/portswigger/swagger/v1/models/properties/BaseIntegerProperty
    //   715: ifeq -> 748
    //   718: goto -> 725
    //   721: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   724: athrow
    //   725: aload_2
    //   726: aload #4
    //   728: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Integer;
    //   731: invokeinterface add : (Ljava/lang/Object;)Z
    //   736: pop
    //   737: aload_1
    //   738: ifnull -> 804
    //   741: goto -> 748
    //   744: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   747: athrow
    //   748: aload_0
    //   749: getfield items : Lnet/portswigger/swagger/v1/models/properties/Property;
    //   752: instanceof net/portswigger/swagger/v1/models/properties/DecimalProperty
    //   755: ifeq -> 788
    //   758: goto -> 765
    //   761: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   764: athrow
    //   765: aload_2
    //   766: aload #4
    //   768: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Double;
    //   771: invokeinterface add : (Ljava/lang/Object;)Z
    //   776: pop
    //   777: aload_1
    //   778: ifnull -> 804
    //   781: goto -> 788
    //   784: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   787: athrow
    //   788: aload_2
    //   789: aload #4
    //   791: invokeinterface add : (Ljava/lang/Object;)Z
    //   796: pop
    //   797: goto -> 804
    //   800: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   803: athrow
    //   804: goto -> 818
    //   807: astore #5
    //   809: aload_2
    //   810: aload #4
    //   812: invokeinterface add : (Ljava/lang/Object;)Z
    //   817: pop
    //   818: aload_1
    //   819: ifnull -> 498
    //   822: aload_1
    //   823: ifnull -> 869
    //   826: aload_0
    //   827: getfield _enum : Ljava/util/List;
    //   830: invokeinterface iterator : ()Ljava/util/Iterator;
    //   835: astore_3
    //   836: aload_3
    //   837: invokeinterface hasNext : ()Z
    //   842: ifeq -> 869
    //   845: aload_3
    //   846: invokeinterface next : ()Ljava/lang/Object;
    //   851: checkcast java/lang/String
    //   854: astore #4
    //   856: aload_2
    //   857: aload #4
    //   859: invokeinterface add : (Ljava/lang/Object;)Z
    //   864: pop
    //   865: aload_1
    //   866: ifnull -> 836
    //   869: aload_2
    //   870: areturn
    // Exception table:
    //   from	to	target	type
    //   4	13	13	java/lang/NumberFormatException
    //   17	33	33	java/lang/NumberFormatException
    //   54	92	95	java/lang/NumberFormatException
    //   129	164	167	java/lang/NumberFormatException
    //   129	412	415	java/lang/NumberFormatException
    //   148	190	193	java/lang/NumberFormatException
    //   171	213	216	java/lang/NumberFormatException
    //   197	239	242	java/lang/NumberFormatException
    //   220	262	265	java/lang/NumberFormatException
    //   246	288	291	java/lang/NumberFormatException
    //   269	311	314	java/lang/NumberFormatException
    //   295	337	340	java/lang/NumberFormatException
    //   318	360	363	java/lang/NumberFormatException
    //   344	386	389	java/lang/NumberFormatException
    //   367	405	408	java/lang/NumberFormatException
    //   430	441	444	java/lang/NumberFormatException
    //   434	467	470	java/lang/NumberFormatException
    //   448	481	484	java/lang/NumberFormatException
    //   518	541	544	java/lang/NumberFormatException
    //   518	804	807	java/lang/NumberFormatException
    //   528	558	561	java/lang/NumberFormatException
    //   548	581	584	java/lang/NumberFormatException
    //   565	598	601	java/lang/NumberFormatException
    //   588	621	624	java/lang/NumberFormatException
    //   605	638	641	java/lang/NumberFormatException
    //   628	661	664	java/lang/NumberFormatException
    //   645	678	681	java/lang/NumberFormatException
    //   668	701	704	java/lang/NumberFormatException
    //   685	718	721	java/lang/NumberFormatException
    //   708	741	744	java/lang/NumberFormatException
    //   725	758	761	java/lang/NumberFormatException
    //   748	781	784	java/lang/NumberFormatException
    //   765	797	800	java/lang/NumberFormatException
  }
  
  public void setEnumValue(List<?> paramList) {
    Zbqc[] arrayOfZbqc = AbstractParameter.Zz();
    try {
      if (paramList == null) {
        this._enum = null;
        return;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (paramList.isEmpty()) {
        this._enum = Collections.emptyList();
        return;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    ArrayList<String> arrayList = new ArrayList(paramList.size());
    for (Object object : paramList) {
      arrayList.add(object.toString());
      if (arrayOfZbqc != null)
        break; 
    } 
    this._enum = arrayList;
  }
  
  public Property getItems() {
    return this.items;
  }
  
  public void setItems(Property paramProperty) {
    this.items = paramProperty;
  }
  
  public String getFormat() {
    return this.format;
  }
  
  public void setFormat(String paramString) {
    this.format = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
    Zbqc[] arrayOfZbqc = AbstractParameter.Zz();
    try {
      if (ArrayProperty.isType(paramString)) {
        try {
          if (getCollectionFormat() == null)
            try {
              setCollectionFormat(getDefaultCollectionFormat());
              if (arrayOfZbqc != null) {
                setCollectionFormat((String)null);
                return;
              } 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            }  
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    setCollectionFormat((String)null);
  }
  
  public String getCollectionFormat() {
    return this.collectionFormat;
  }
  
  public void setCollectionFormat(String paramString) {
    this.collectionFormat = paramString;
  }
  
  public void setProperty(Property paramProperty) {
    // Byte code:
    //   0: invokestatic Zz : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: aload_1
    //   5: invokeinterface getType : ()Ljava/lang/String;
    //   10: invokevirtual setType : (Ljava/lang/String;)V
    //   13: aload_0
    //   14: aload_1
    //   15: invokeinterface getFormat : ()Ljava/lang/String;
    //   20: putfield format : Ljava/lang/String;
    //   23: astore_2
    //   24: aload_1
    //   25: instanceof net/portswigger/swagger/v1/models/properties/StringProperty
    //   28: ifeq -> 48
    //   31: aload_1
    //   32: checkcast net/portswigger/swagger/v1/models/properties/StringProperty
    //   35: astore_3
    //   36: aload_0
    //   37: aload_3
    //   38: invokevirtual getEnum : ()Ljava/util/List;
    //   41: invokevirtual setEnum : (Ljava/util/List;)V
    //   44: aload_2
    //   45: ifnull -> 219
    //   48: aload_1
    //   49: instanceof net/portswigger/swagger/v1/models/properties/IntegerProperty
    //   52: ifeq -> 84
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_0
    //   63: aload_1
    //   64: checkcast net/portswigger/swagger/v1/models/properties/IntegerProperty
    //   67: invokevirtual getEnum : ()Ljava/util/List;
    //   70: invokevirtual setEnumValue : (Ljava/util/List;)V
    //   73: aload_2
    //   74: ifnull -> 219
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: aload_1
    //   85: instanceof net/portswigger/swagger/v1/models/properties/LongProperty
    //   88: ifeq -> 120
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   97: athrow
    //   98: aload_0
    //   99: aload_1
    //   100: checkcast net/portswigger/swagger/v1/models/properties/LongProperty
    //   103: invokevirtual getEnum : ()Ljava/util/List;
    //   106: invokevirtual setEnumValue : (Ljava/util/List;)V
    //   109: aload_2
    //   110: ifnull -> 219
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: aload_1
    //   121: instanceof net/portswigger/swagger/v1/models/properties/FloatProperty
    //   124: ifeq -> 156
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: aload_0
    //   135: aload_1
    //   136: checkcast net/portswigger/swagger/v1/models/properties/FloatProperty
    //   139: invokevirtual getEnum : ()Ljava/util/List;
    //   142: invokevirtual setEnumValue : (Ljava/util/List;)V
    //   145: aload_2
    //   146: ifnull -> 219
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   155: athrow
    //   156: aload_1
    //   157: instanceof net/portswigger/swagger/v1/models/properties/DoubleProperty
    //   160: ifeq -> 192
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   169: athrow
    //   170: aload_0
    //   171: aload_1
    //   172: checkcast net/portswigger/swagger/v1/models/properties/DoubleProperty
    //   175: invokevirtual getEnum : ()Ljava/util/List;
    //   178: invokevirtual setEnumValue : (Ljava/util/List;)V
    //   181: aload_2
    //   182: ifnull -> 219
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   191: athrow
    //   192: aload_1
    //   193: instanceof net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   196: ifeq -> 219
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   205: athrow
    //   206: aload_1
    //   207: checkcast net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   210: astore_3
    //   211: aload_0
    //   212: aload_3
    //   213: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   216: invokevirtual setItems : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   219: return
    // Exception table:
    //   from	to	target	type
    //   36	55	58	java/lang/NumberFormatException
    //   48	77	80	java/lang/NumberFormatException
    //   62	91	94	java/lang/NumberFormatException
    //   84	113	116	java/lang/NumberFormatException
    //   98	127	130	java/lang/NumberFormatException
    //   120	149	152	java/lang/NumberFormatException
    //   134	163	166	java/lang/NumberFormatException
    //   156	185	188	java/lang/NumberFormatException
    //   170	199	202	java/lang/NumberFormatException
  }
  
  public Object getDefaultValue() {
    try {
      if (this.defaultValue == null)
        return null; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (a(-30514, -3003).equals(this.type))
        return Integer.valueOf(Integer.parseInt(this.defaultValue)); 
      if (a(-30525, -2079).equals(this.type))
        return new BigDecimal(this.defaultValue); 
    } catch (Exception exception) {
      return null;
    } 
    return this.defaultValue;
  }
  
  public void setDefaultValue(String paramString) {
    this.defaultValue = paramString;
  }
  
  public Object getDefault() {
    try {
      if (this.defaultValue != null)
        try {
          if (!this.defaultValue.isEmpty()) {
            try {
              if (a(-30514, -3003).equals(this.type))
                return Long.valueOf(this.defaultValue); 
              if (a(-30525, -2079).equals(this.type))
                return Double.valueOf(this.defaultValue); 
              try {
                if (a(-30528, -27576).equals(this.type))
                  try {
                    if (a(-30522, 1970).equalsIgnoreCase(this.defaultValue) || a(-30523, -8004).equalsIgnoreCase(this.defaultValue))
                      return Boolean.valueOf(this.defaultValue); 
                  } catch (NumberFormatException numberFormatException) {
                    throw a(null);
                  }  
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              } 
            } catch (NumberFormatException numberFormatException) {}
            return this.defaultValue;
          } 
          return null;
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return null;
  }
  
  public void setDefault(Object paramObject) {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.defaultValue = (paramObject == null) ? null : paramObject.toString();
  }
  
  public void setExclusiveMaximum(Boolean paramBoolean) {
    this.exclusiveMaximum = paramBoolean;
  }
  
  public BigDecimal getMaximum() {
    return this.maximum;
  }
  
  public void setMaximum(BigDecimal paramBigDecimal) {
    this.maximum = paramBigDecimal;
  }
  
  public Boolean isExclusiveMinimum() {
    return this.exclusiveMinimum;
  }
  
  public void setExclusiveMinimum(Boolean paramBoolean) {
    this.exclusiveMinimum = paramBoolean;
  }
  
  public BigDecimal getMinimum() {
    return this.minimum;
  }
  
  public void setMinimum(BigDecimal paramBigDecimal) {
    this.minimum = paramBigDecimal;
  }
  
  public Integer getMaxItems() {
    return this.maxItems;
  }
  
  public void setMaxItems(Integer paramInteger) {
    this.maxItems = paramInteger;
  }
  
  public Integer getMinItems() {
    return this.minItems;
  }
  
  public void setMinItems(Integer paramInteger) {
    this.minItems = paramInteger;
  }
  
  public Boolean getAllowEmptyValue() {
    return this.allowEmptyValue;
  }
  
  public void setAllowEmptyValue(Boolean paramBoolean) {
    this.allowEmptyValue = paramBoolean;
  }
  
  @Zy1("x-example")
  public Object getExample() {
    try {
      if (this.example != null)
        try {
          if (!this.example.isEmpty()) {
            try {
              if (a(-30514, -3003).equals(this.type))
                return Long.valueOf(this.example); 
              if (a(-30525, -2079).equals(this.type))
                return Double.valueOf(this.example); 
              try {
                if (a(-30518, -22449).equals(this.type))
                  try {
                    if (a(-30526, -8976).equalsIgnoreCase(this.example) || a(-30521, -14458).equalsIgnoreCase(this.example))
                      return Boolean.valueOf(this.example); 
                  } catch (NumberFormatException numberFormatException) {
                    throw a(null);
                  }  
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              } 
            } catch (NumberFormatException numberFormatException) {}
            return this.example;
          } 
          return this.example;
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return this.example;
  }
  
  public Integer getMaxLength() {
    return this.maxLength;
  }
  
  public void setMaxLength(Integer paramInteger) {
    this.maxLength = paramInteger;
  }
  
  public Integer getMinLength() {
    return this.minLength;
  }
  
  public void setMinLength(Integer paramInteger) {
    this.minLength = paramInteger;
  }
  
  public String getPattern() {
    return this.pattern;
  }
  
  public void setPattern(String paramString) {
    this.pattern = paramString;
  }
  
  public Boolean isUniqueItems() {
    return this.uniqueItems;
  }
  
  public void setUniqueItems(Boolean paramBoolean) {
    this.uniqueItems = paramBoolean;
  }
  
  public Number getMultipleOf() {
    return this.multipleOf;
  }
  
  public void setMultipleOf(Number paramNumber) {
    this.multipleOf = paramNumber;
  }
  
  public Boolean isExclusiveMaximum() {
    return this.exclusiveMaximum;
  }
  
  public void setExample(String paramString) {
    this.example = paramString;
  }
  
  @Zyx
  private T castThis() {
    return (T)this;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (!super.equals(paramObject))
        return false; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (getClass() != paramObject.getClass())
        return false; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    AbstractSerializableParameter abstractSerializableParameter = (AbstractSerializableParameter)paramObject;
    try {
      if (this._enum == null) {
        try {
          if (abstractSerializableParameter._enum != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this._enum.equals(abstractSerializableParameter._enum))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.collectionFormat == null) {
        try {
          if (abstractSerializableParameter.collectionFormat != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.collectionFormat.equals(abstractSerializableParameter.collectionFormat))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.defaultValue == null) {
        try {
          if (abstractSerializableParameter.defaultValue != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.defaultValue.equals(abstractSerializableParameter.defaultValue))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.example == null) {
        try {
          if (abstractSerializableParameter.example != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.example.equals(abstractSerializableParameter.example))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.exclusiveMaximum == null) {
        try {
          if (abstractSerializableParameter.exclusiveMaximum != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.exclusiveMaximum.equals(abstractSerializableParameter.exclusiveMaximum))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.exclusiveMinimum == null) {
        try {
          if (abstractSerializableParameter.exclusiveMinimum != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.exclusiveMinimum.equals(abstractSerializableParameter.exclusiveMinimum))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.format == null) {
        try {
          if (abstractSerializableParameter.format != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.format.equals(abstractSerializableParameter.format))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.items == null) {
        try {
          if (abstractSerializableParameter.items != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.items.equals(abstractSerializableParameter.items))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.maxItems == null) {
        try {
          if (abstractSerializableParameter.maxItems != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.maxItems.equals(abstractSerializableParameter.maxItems))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.maxLength == null) {
        try {
          if (abstractSerializableParameter.maxLength != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.maxLength.equals(abstractSerializableParameter.maxLength))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.maximum == null) {
        try {
          if (abstractSerializableParameter.maximum != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.maximum.equals(abstractSerializableParameter.maximum))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.minItems == null) {
        try {
          if (abstractSerializableParameter.minItems != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.minItems.equals(abstractSerializableParameter.minItems))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.minLength == null) {
        try {
          if (abstractSerializableParameter.minLength != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.minLength.equals(abstractSerializableParameter.minLength))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.minimum == null) {
        try {
          if (abstractSerializableParameter.minimum != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.minimum.equals(abstractSerializableParameter.minimum))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.multipleOf == null) {
        try {
          if (abstractSerializableParameter.multipleOf != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.multipleOf.equals(abstractSerializableParameter.multipleOf))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.pattern == null) {
        try {
          if (abstractSerializableParameter.pattern != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.pattern.equals(abstractSerializableParameter.pattern))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.type == null) {
        try {
          if (abstractSerializableParameter.type != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.type.equals(abstractSerializableParameter.type))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.uniqueItems == null) {
        try {
          if (abstractSerializableParameter.uniqueItems != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (!this.uniqueItems.equals(abstractSerializableParameter.uniqueItems))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.allowEmptyValue != null) {
        try {
          if (!this.allowEmptyValue.equals(abstractSerializableParameter.allowEmptyValue))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (abstractSerializableParameter.allowEmptyValue != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return true;
  }
  
  public int hashCode() {
    byte b = 31;
    int i = super.hashCode();
    Zbqc[] arrayOfZbqc = AbstractParameter.Zz();
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this._enum == null) ? 0 : this._enum.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.collectionFormat == null) ? 0 : this.collectionFormat.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.defaultValue == null) ? 0 : this.defaultValue.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.example == null) ? 0 : this.example.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.exclusiveMaximum == null) ? 0 : this.exclusiveMaximum.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.exclusiveMinimum == null) ? 0 : this.exclusiveMinimum.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.format == null) ? 0 : this.format.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.items == null) ? 0 : this.items.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.maxItems == null) ? 0 : this.maxItems.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.maxLength == null) ? 0 : this.maxLength.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.maximum == null) ? 0 : this.maximum.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.minItems == null) ? 0 : this.minItems.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.minLength == null) ? 0 : this.minLength.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.minimum == null) ? 0 : this.minimum.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.multipleOf == null) ? 0 : this.multipleOf.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.pattern == null) ? 0 : this.pattern.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.type == null) ? 0 : this.type.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.uniqueItems == null) ? 0 : this.uniqueItems.hashCode());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    i = 31 * i + ((this.allowEmptyValue != null) ? this.allowEmptyValue.hashCode() : 0);
    try {
      if (arrayOfZbqc != null)
        Zbqc.Zr(new Zbqc[1]); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return i;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'r®ÞÉ-tì3÷¶]åEJ¶Sy|¦!":^èÝð{à-\ÇI*ÖÂì8Oµ¶6Õf«ôEÖë§}¬ {]î¤¤Ì£Ró|\\f'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_3
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #8
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
    //   67: ldc '¨Û;=là'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #14
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
    //   128: putstatic net/portswigger/swagger/v1/models/parameters/AbstractSerializableParameter.b : [Ljava/lang/String;
    //   131: bipush #16
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/swagger/v1/models/parameters/AbstractSerializableParameter.c : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
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
    //   212: bipush #20
    //   214: goto -> 243
    //   217: bipush #28
    //   219: goto -> 243
    //   222: bipush #77
    //   224: goto -> 243
    //   227: bipush #82
    //   229: goto -> 243
    //   232: bipush #39
    //   234: goto -> 243
    //   237: bipush #64
    //   239: goto -> 243
    //   242: iconst_2
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF88CD) & 0xFFFF;
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
      char c = 'Î';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\parameters\AbstractSerializableParameter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */