package net.portswigger.swagger.v3.parser.processors;

import burp.Zbqc;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import net.portswigger.swagger.StringUtils;
import net.portswigger.swagger.v2.util.RefUtils;
import net.portswigger.swagger.v3.oas.models.Components;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.PathItem;
import net.portswigger.swagger.v3.oas.models.callbacks.Callback;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.oas.models.headers.Header;
import net.portswigger.swagger.v3.oas.models.links.Link;
import net.portswigger.swagger.v3.oas.models.media.ArraySchema;
import net.portswigger.swagger.v3.oas.models.media.ComposedSchema;
import net.portswigger.swagger.v3.oas.models.media.Discriminator;
import net.portswigger.swagger.v3.oas.models.media.MediaType;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.oas.models.security.SecurityScheme;
import net.portswigger.swagger.v3.parser.ResolverCache;
import net.portswigger.swagger.v3.parser.models.RefFormat;
import net.portswigger.swagger.v3.parser.models.RefType;

public final class ExternalRefProcessor {
  private final ResolverCache cache;
  
  private final OpenAPI openAPI;
  
  private static Zbqc[] ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public ExternalRefProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI) {
    this.cache = paramResolverCache;
    this.openAPI = paramOpenAPI;
  }
  
  private String finalNameRec(Map<String, Schema> paramMap, String paramString, Schema paramSchema, int paramInt) {
    Zbqc[] arrayOfZbqc = Zv();
    String str = (paramInt == 0) ? paramString : (paramString + "_" + paramString);
    Schema schema = paramMap.get(str);
    if (schema != null) {
      if (schema.get$ref() != null) {
        schema = null;
      } else if (!paramSchema.equals(schema)) {
        return (this.cache.getResolutionCache().get(paramSchema.get$ref()) != null) ? str : finalNameRec(paramMap, paramString, paramSchema, ++paramInt);
      } 
    } else if (schema == null) {
      for (String str1 : paramMap.keySet()) {
        if (str1.toLowerCase().equals(str.toLowerCase())) {
          schema = paramMap.get(str1);
          str = str1;
          if (arrayOfZbqc == null)
            continue; 
          break;
        } 
        continue;
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    return str;
  }
  
  public String processRefToExternalSchema(String paramString, RefFormat paramRefFormat) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   7: aload_1
    //   8: invokevirtual getRenamedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   11: astore #4
    //   13: astore_3
    //   14: aload #4
    //   16: ifnull -> 22
    //   19: aload #4
    //   21: areturn
    //   22: aload_0
    //   23: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   26: aload_1
    //   27: aload_2
    //   28: ldc net/portswigger/swagger/v3/oas/models/media/Schema
    //   30: invokevirtual loadRef : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;Ljava/lang/Class;)Ljava/lang/Object;
    //   33: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   36: astore #5
    //   38: aload #5
    //   40: ifnonnull -> 45
    //   43: aload_1
    //   44: areturn
    //   45: aload_0
    //   46: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   49: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   52: ifnonnull -> 69
    //   55: aload_0
    //   56: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   59: new net/portswigger/swagger/v3/oas/models/Components
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: invokevirtual setComponents : (Lnet/portswigger/swagger/v3/oas/models/Components;)V
    //   69: aload_0
    //   70: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   73: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   76: invokevirtual getSchemas : ()Ljava/util/Map;
    //   79: astore #7
    //   81: aload #7
    //   83: ifnonnull -> 95
    //   86: new java/util/LinkedHashMap
    //   89: dup
    //   90: invokespecial <init> : ()V
    //   93: astore #7
    //   95: aload_1
    //   96: invokestatic computeDefinitionName : (Ljava/lang/String;)Ljava/lang/String;
    //   99: astore #8
    //   101: aload_0
    //   102: aload #7
    //   104: aload #8
    //   106: aload #5
    //   108: iconst_0
    //   109: invokevirtual finalNameRec : (Ljava/util/Map;Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;I)Ljava/lang/String;
    //   112: astore #6
    //   114: aload_0
    //   115: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   118: aload_1
    //   119: aload #6
    //   121: invokevirtual putRenamedRef : (Ljava/lang/String;Ljava/lang/String;)V
    //   124: aload #7
    //   126: aload #6
    //   128: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   133: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   136: astore #9
    //   138: aload #9
    //   140: ifnull -> 154
    //   143: aload #9
    //   145: invokevirtual get$ref : ()Ljava/lang/String;
    //   148: ifnull -> 154
    //   151: aconst_null
    //   152: astore #9
    //   154: aload #9
    //   156: ifnonnull -> 827
    //   159: aload_0
    //   160: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   163: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   166: aload #6
    //   168: aload #5
    //   170: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   173: pop
    //   174: aload_0
    //   175: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   178: aload #6
    //   180: invokevirtual addReferencedKey : (Ljava/lang/String;)V
    //   183: aload_1
    //   184: sipush #-352
    //   187: sipush #-22198
    //   190: invokestatic a : (II)Ljava/lang/String;
    //   193: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   196: iconst_0
    //   197: aaload
    //   198: astore #10
    //   200: aload #5
    //   202: invokevirtual get$ref : ()Ljava/lang/String;
    //   205: ifnull -> 452
    //   208: aload #5
    //   210: invokevirtual get$ref : ()Ljava/lang/String;
    //   213: invokestatic computeRefFormat : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   216: astore #11
    //   218: aload #11
    //   220: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Z
    //   223: ifeq -> 432
    //   226: aload #11
    //   228: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.URL : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   231: invokevirtual equals : (Ljava/lang/Object;)Z
    //   234: ifne -> 452
    //   237: aload #5
    //   239: invokevirtual get$ref : ()Ljava/lang/String;
    //   242: astore #12
    //   244: aload #10
    //   246: ldc '/'
    //   248: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   251: ifeq -> 270
    //   254: aload #10
    //   256: iconst_0
    //   257: aload #10
    //   259: bipush #47
    //   261: invokevirtual lastIndexOf : (I)I
    //   264: invokevirtual substring : (II)Ljava/lang/String;
    //   267: goto -> 272
    //   270: ldc ''
    //   272: astore #13
    //   274: aload #13
    //   276: invokevirtual isEmpty : ()Z
    //   279: ifne -> 415
    //   282: aload #12
    //   284: ldc '/'
    //   286: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   289: ifne -> 415
    //   292: aload #12
    //   294: sipush #-352
    //   297: sipush #-22198
    //   300: invokestatic a : (II)Ljava/lang/String;
    //   303: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   306: ifeq -> 382
    //   309: aload #12
    //   311: sipush #-352
    //   314: sipush #-22198
    //   317: invokestatic a : (II)Ljava/lang/String;
    //   320: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   323: astore #14
    //   325: aload #14
    //   327: iconst_0
    //   328: aaload
    //   329: astore #15
    //   331: aload #14
    //   333: iconst_1
    //   334: aaload
    //   335: astore #16
    //   337: aload #13
    //   339: iconst_1
    //   340: anewarray java/lang/String
    //   343: dup
    //   344: iconst_0
    //   345: aload #15
    //   347: aastore
    //   348: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   351: invokeinterface normalize : ()Ljava/nio/file/Path;
    //   356: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   359: aload #16
    //   361: sipush #-352
    //   364: sipush #-22198
    //   367: invokestatic a : (II)Ljava/lang/String;
    //   370: swap
    //   371: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   376: astore #12
    //   378: aload_3
    //   379: ifnonnull -> 408
    //   382: aload #13
    //   384: iconst_1
    //   385: anewarray java/lang/String
    //   388: dup
    //   389: iconst_0
    //   390: aload #12
    //   392: aastore
    //   393: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   396: invokeinterface normalize : ()Ljava/nio/file/Path;
    //   401: invokeinterface toString : ()Ljava/lang/String;
    //   406: astore #12
    //   408: aload #12
    //   410: invokestatic separatorsToUnix : (Ljava/lang/String;)Ljava/lang/String;
    //   413: astore #12
    //   415: aload #5
    //   417: aload_0
    //   418: aload #12
    //   420: aload #11
    //   422: invokevirtual processRefToExternalSchema : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Ljava/lang/String;
    //   425: invokevirtual set$ref : (Ljava/lang/String;)V
    //   428: aload_3
    //   429: ifnonnull -> 452
    //   432: aload_0
    //   433: aload #10
    //   435: aload #5
    //   437: invokevirtual get$ref : ()Ljava/lang/String;
    //   440: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   445: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.RELATIVE : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   448: invokevirtual processRefToExternalSchema : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Ljava/lang/String;
    //   451: pop
    //   452: aload #5
    //   454: instanceof net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   457: ifeq -> 475
    //   460: aload #5
    //   462: checkcast net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   465: astore #11
    //   467: aload_0
    //   468: aload #11
    //   470: aload #10
    //   472: invokevirtual processComposedSchema : (Lnet/portswigger/swagger/v3/oas/models/media/ComposedSchema;Ljava/lang/String;)V
    //   475: aload #5
    //   477: invokevirtual getProperties : ()Ljava/util/Map;
    //   480: astore #11
    //   482: aload_0
    //   483: aload #11
    //   485: aload #10
    //   487: invokevirtual processProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   490: aload_0
    //   491: aload #5
    //   493: invokevirtual getDiscriminator : ()Lnet/portswigger/swagger/v3/oas/models/media/Discriminator;
    //   496: aload #10
    //   498: invokevirtual processDiscriminator : (Lnet/portswigger/swagger/v3/oas/models/media/Discriminator;Ljava/lang/String;)V
    //   501: aload #5
    //   503: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   506: ifnull -> 726
    //   509: aload #5
    //   511: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   514: instanceof net/portswigger/swagger/v3/oas/models/media/Schema
    //   517: ifeq -> 726
    //   520: aload #5
    //   522: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   525: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   528: astore #12
    //   530: aload #12
    //   532: invokevirtual get$ref : ()Ljava/lang/String;
    //   535: ifnull -> 550
    //   538: aload_0
    //   539: aload #12
    //   541: aload #10
    //   543: invokevirtual processRefSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   546: aload_3
    //   547: ifnonnull -> 726
    //   550: aload #12
    //   552: instanceof net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   555: ifeq -> 610
    //   558: aload #12
    //   560: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   563: astore #13
    //   565: aload #13
    //   567: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   570: ifnull -> 606
    //   573: aload #13
    //   575: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   578: invokevirtual get$ref : ()Ljava/lang/String;
    //   581: ifnull -> 606
    //   584: aload #13
    //   586: invokevirtual get$ref : ()Ljava/lang/String;
    //   589: invokestatic isBlank : (Ljava/lang/String;)Z
    //   592: ifne -> 606
    //   595: aload_0
    //   596: aload #13
    //   598: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   601: aload #10
    //   603: invokevirtual processRefSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   606: aload_3
    //   607: ifnonnull -> 726
    //   610: aload #12
    //   612: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   615: ifnull -> 726
    //   618: aload #12
    //   620: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   623: instanceof net/portswigger/swagger/v3/oas/models/media/Schema
    //   626: ifeq -> 726
    //   629: aload #12
    //   631: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   634: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   637: astore #13
    //   639: aload #13
    //   641: invokevirtual get$ref : ()Ljava/lang/String;
    //   644: ifnull -> 659
    //   647: aload_0
    //   648: aload #13
    //   650: aload #10
    //   652: invokevirtual processRefSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   655: aload_3
    //   656: ifnonnull -> 726
    //   659: aload #13
    //   661: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   664: instanceof net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   667: ifeq -> 726
    //   670: aload #13
    //   672: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   675: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   678: ifnull -> 726
    //   681: aload #13
    //   683: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   686: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   689: invokevirtual get$ref : ()Ljava/lang/String;
    //   692: ifnull -> 726
    //   695: aload #13
    //   697: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   700: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   703: invokevirtual get$ref : ()Ljava/lang/String;
    //   706: invokestatic isBlank : (Ljava/lang/String;)Z
    //   709: ifne -> 726
    //   712: aload_0
    //   713: aload #13
    //   715: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   718: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   721: aload #10
    //   723: invokevirtual processRefSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   726: aload #5
    //   728: instanceof net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   731: ifeq -> 827
    //   734: aload #5
    //   736: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   739: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   742: ifnull -> 827
    //   745: aload #5
    //   747: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   750: astore #12
    //   752: aload #12
    //   754: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   757: invokevirtual get$ref : ()Ljava/lang/String;
    //   760: invokestatic isBlank : (Ljava/lang/String;)Z
    //   763: ifne -> 784
    //   766: aload_0
    //   767: aload #5
    //   769: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   772: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   775: aload #10
    //   777: invokevirtual processRefSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   780: aload_3
    //   781: ifnonnull -> 827
    //   784: aload #12
    //   786: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   789: instanceof net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   792: ifeq -> 813
    //   795: aload #12
    //   797: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   800: checkcast net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   803: astore #13
    //   805: aload_0
    //   806: aload #13
    //   808: aload #10
    //   810: invokevirtual processComposedSchema : (Lnet/portswigger/swagger/v3/oas/models/media/ComposedSchema;Ljava/lang/String;)V
    //   813: aload_0
    //   814: aload #12
    //   816: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   819: invokevirtual getProperties : ()Ljava/util/Map;
    //   822: aload #10
    //   824: invokevirtual processProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   827: aload #6
    //   829: areturn
  }
  
  private void processComposedSchema(ComposedSchema paramComposedSchema, String paramString) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: invokevirtual getAllOf : ()Ljava/util/List;
    //   8: ifnull -> 74
    //   11: aload_1
    //   12: invokevirtual getAllOf : ()Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore #4
    //   22: aload #4
    //   24: invokeinterface hasNext : ()Z
    //   29: ifeq -> 74
    //   32: aload #4
    //   34: invokeinterface next : ()Ljava/lang/Object;
    //   39: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   42: astore #5
    //   44: aload #5
    //   46: invokevirtual get$ref : ()Ljava/lang/String;
    //   49: ifnull -> 63
    //   52: aload_0
    //   53: aload #5
    //   55: aload_2
    //   56: invokevirtual processRefSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   59: aload_3
    //   60: ifnonnull -> 70
    //   63: aload_0
    //   64: aload #5
    //   66: aload_2
    //   67: invokevirtual processSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   70: aload_3
    //   71: ifnonnull -> 22
    //   74: aload_1
    //   75: invokevirtual getOneOf : ()Ljava/util/List;
    //   78: ifnull -> 152
    //   81: aload_1
    //   82: invokevirtual getOneOf : ()Ljava/util/List;
    //   85: invokeinterface iterator : ()Ljava/util/Iterator;
    //   90: astore #4
    //   92: aload #4
    //   94: invokeinterface hasNext : ()Z
    //   99: ifeq -> 152
    //   102: aload #4
    //   104: invokeinterface next : ()Ljava/lang/Object;
    //   109: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   112: astore #5
    //   114: aload #5
    //   116: invokevirtual get$ref : ()Ljava/lang/String;
    //   119: ifnull -> 148
    //   122: aload #5
    //   124: invokevirtual get$ref : ()Ljava/lang/String;
    //   127: ifnull -> 141
    //   130: aload_0
    //   131: aload #5
    //   133: aload_2
    //   134: invokevirtual processRefSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   137: aload_3
    //   138: ifnonnull -> 148
    //   141: aload_0
    //   142: aload #5
    //   144: aload_2
    //   145: invokevirtual processSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   148: aload_3
    //   149: ifnonnull -> 92
    //   152: aload_1
    //   153: invokevirtual getAnyOf : ()Ljava/util/List;
    //   156: ifnull -> 230
    //   159: aload_1
    //   160: invokevirtual getAnyOf : ()Ljava/util/List;
    //   163: invokeinterface iterator : ()Ljava/util/Iterator;
    //   168: astore #4
    //   170: aload #4
    //   172: invokeinterface hasNext : ()Z
    //   177: ifeq -> 230
    //   180: aload #4
    //   182: invokeinterface next : ()Ljava/lang/Object;
    //   187: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   190: astore #5
    //   192: aload #5
    //   194: invokevirtual get$ref : ()Ljava/lang/String;
    //   197: ifnull -> 226
    //   200: aload #5
    //   202: invokevirtual get$ref : ()Ljava/lang/String;
    //   205: ifnull -> 219
    //   208: aload_0
    //   209: aload #5
    //   211: aload_2
    //   212: invokevirtual processRefSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   215: aload_3
    //   216: ifnonnull -> 226
    //   219: aload_0
    //   220: aload #5
    //   222: aload_2
    //   223: invokevirtual processSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   226: aload_3
    //   227: ifnonnull -> 170
    //   230: return
  }
  
  private void processSchema(Schema paramSchema, String paramString) {
    if (paramSchema != null) {
      if (!StringUtils.isBlank(paramSchema.get$ref()))
        processRefSchema(paramSchema, paramString); 
      if (paramSchema.getProperties() != null)
        processProperties(paramSchema.getProperties(), paramString); 
      if (paramSchema instanceof ArraySchema)
        processSchema(((ArraySchema)paramSchema).getItems(), paramString); 
      if (paramSchema.getAdditionalProperties() instanceof Schema)
        processSchema((Schema)paramSchema.getAdditionalProperties(), paramString); 
      if (paramSchema instanceof ComposedSchema) {
        ComposedSchema composedSchema = (ComposedSchema)paramSchema;
        processProperties(composedSchema.getAllOf(), paramString);
        processProperties(composedSchema.getAnyOf(), paramString);
        processProperties(composedSchema.getOneOf(), paramString);
      } 
    } 
  }
  
  private void processProperties(Collection<Schema> paramCollection, String paramString) {
    Zbqc[] arrayOfZbqc = Zv();
    if (paramCollection != null)
      for (Schema schema : paramCollection) {
        processSchema(schema, paramString);
        if (arrayOfZbqc == null)
          break; 
      }  
  }
  
  private void processProperties(Map<String, Schema> paramMap, String paramString) {
    if (paramMap != null)
      processProperties(paramMap.values(), paramString); 
  }
  
  public PathItem processRefToExternalPathItem(String paramString, RefFormat paramRefFormat) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   7: aload_1
    //   8: aload_2
    //   9: ldc net/portswigger/swagger/v3/oas/models/PathItem
    //   11: invokevirtual loadRef : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;Ljava/lang/Class;)Ljava/lang/Object;
    //   14: checkcast net/portswigger/swagger/v3/oas/models/PathItem
    //   17: astore #4
    //   19: aload_0
    //   20: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   23: invokevirtual getPaths : ()Lnet/portswigger/swagger/v3/oas/models/Paths;
    //   26: astore #6
    //   28: astore_3
    //   29: aload #6
    //   31: ifnonnull -> 43
    //   34: new java/util/LinkedHashMap
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: astore #6
    //   43: aload_1
    //   44: invokestatic computeDefinitionName : (Ljava/lang/String;)Ljava/lang/String;
    //   47: astore #7
    //   49: aload #6
    //   51: aload #7
    //   53: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   58: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   63: checkcast net/portswigger/swagger/v3/oas/models/PathItem
    //   66: astore #8
    //   68: aload #8
    //   70: ifnull -> 90
    //   73: aload #8
    //   75: invokevirtual get$ref : ()Ljava/lang/String;
    //   78: ifnull -> 87
    //   81: aconst_null
    //   82: astore #8
    //   84: goto -> 90
    //   87: aload #4
    //   89: areturn
    //   90: aload #7
    //   92: astore #5
    //   94: aload_0
    //   95: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   98: aload_1
    //   99: aload #5
    //   101: invokevirtual putRenamedRef : (Ljava/lang/String;Ljava/lang/String;)V
    //   104: aload #4
    //   106: ifnull -> 568
    //   109: aload #4
    //   111: invokevirtual readOperationsMap : ()Ljava/util/Map;
    //   114: ifnull -> 568
    //   117: aload #4
    //   119: invokevirtual readOperationsMap : ()Ljava/util/Map;
    //   122: astore #9
    //   124: aload #9
    //   126: invokeinterface keySet : ()Ljava/util/Set;
    //   131: invokeinterface iterator : ()Ljava/util/Iterator;
    //   136: astore #10
    //   138: aload #10
    //   140: invokeinterface hasNext : ()Z
    //   145: ifeq -> 568
    //   148: aload #10
    //   150: invokeinterface next : ()Ljava/lang/Object;
    //   155: checkcast net/portswigger/swagger/v3/oas/models/PathItem$HttpMethod
    //   158: astore #11
    //   160: aload #9
    //   162: aload #11
    //   164: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   169: checkcast net/portswigger/swagger/v3/oas/models/Operation
    //   172: astore #12
    //   174: aload #12
    //   176: invokevirtual getResponses : ()Lnet/portswigger/swagger/v3/oas/models/responses/ApiResponses;
    //   179: ifnull -> 409
    //   182: aload #12
    //   184: invokevirtual getResponses : ()Lnet/portswigger/swagger/v3/oas/models/responses/ApiResponses;
    //   187: astore #13
    //   189: aload #13
    //   191: ifnull -> 409
    //   194: aload #13
    //   196: invokeinterface keySet : ()Ljava/util/Set;
    //   201: invokeinterface iterator : ()Ljava/util/Iterator;
    //   206: astore #14
    //   208: aload #14
    //   210: invokeinterface hasNext : ()Z
    //   215: ifeq -> 409
    //   218: aload #14
    //   220: invokeinterface next : ()Ljava/lang/Object;
    //   225: checkcast java/lang/String
    //   228: astore #15
    //   230: aload #13
    //   232: aload #15
    //   234: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   239: checkcast net/portswigger/swagger/v3/oas/models/responses/ApiResponse
    //   242: astore #16
    //   244: aload #16
    //   246: ifnull -> 405
    //   249: aconst_null
    //   250: astore #17
    //   252: aload #16
    //   254: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   257: ifnull -> 369
    //   260: aload #16
    //   262: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   265: astore #18
    //   267: aload #18
    //   269: invokeinterface keySet : ()Ljava/util/Set;
    //   274: invokeinterface iterator : ()Ljava/util/Iterator;
    //   279: astore #19
    //   281: aload #19
    //   283: invokeinterface hasNext : ()Z
    //   288: ifeq -> 369
    //   291: aload #19
    //   293: invokeinterface next : ()Ljava/lang/Object;
    //   298: checkcast java/lang/String
    //   301: astore #20
    //   303: aload #18
    //   305: aload #20
    //   307: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   312: checkcast net/portswigger/swagger/v3/oas/models/media/MediaType
    //   315: astore #21
    //   317: aload #21
    //   319: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   322: ifnull -> 365
    //   325: aload #21
    //   327: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   330: astore #17
    //   332: aload #17
    //   334: ifnull -> 347
    //   337: aload_0
    //   338: aload #21
    //   340: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   343: aload_1
    //   344: invokevirtual processRefSchemaObject : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   347: aload #21
    //   349: invokevirtual getExamples : ()Ljava/util/Map;
    //   352: ifnull -> 365
    //   355: aload_0
    //   356: aload #21
    //   358: invokevirtual getExamples : ()Ljava/util/Map;
    //   361: aload_1
    //   362: invokevirtual processRefExamples : (Ljava/util/Map;Ljava/lang/String;)V
    //   365: aload_3
    //   366: ifnonnull -> 281
    //   369: aload #16
    //   371: invokevirtual getLinks : ()Ljava/util/Map;
    //   374: ifnull -> 387
    //   377: aload_0
    //   378: aload #16
    //   380: invokevirtual getLinks : ()Ljava/util/Map;
    //   383: aload_1
    //   384: invokevirtual processRefLinks : (Ljava/util/Map;Ljava/lang/String;)V
    //   387: aload #16
    //   389: invokevirtual getHeaders : ()Ljava/util/Map;
    //   392: ifnull -> 405
    //   395: aload_0
    //   396: aload #16
    //   398: invokevirtual getHeaders : ()Ljava/util/Map;
    //   401: aload_1
    //   402: invokevirtual processRefHeaders : (Ljava/util/Map;Ljava/lang/String;)V
    //   405: aload_3
    //   406: ifnonnull -> 208
    //   409: aload #12
    //   411: invokevirtual getRequestBody : ()Lnet/portswigger/swagger/v3/oas/models/parameters/RequestBody;
    //   414: ifnull -> 523
    //   417: aload #12
    //   419: invokevirtual getRequestBody : ()Lnet/portswigger/swagger/v3/oas/models/parameters/RequestBody;
    //   422: astore #13
    //   424: aload #13
    //   426: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   429: ifnull -> 523
    //   432: aload #13
    //   434: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   437: astore #15
    //   439: aload #15
    //   441: invokeinterface keySet : ()Ljava/util/Set;
    //   446: invokeinterface iterator : ()Ljava/util/Iterator;
    //   451: astore #16
    //   453: aload #16
    //   455: invokeinterface hasNext : ()Z
    //   460: ifeq -> 523
    //   463: aload #16
    //   465: invokeinterface next : ()Ljava/lang/Object;
    //   470: checkcast java/lang/String
    //   473: astore #17
    //   475: aload #15
    //   477: aload #17
    //   479: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   484: checkcast net/portswigger/swagger/v3/oas/models/media/MediaType
    //   487: astore #18
    //   489: aload #18
    //   491: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   494: ifnull -> 519
    //   497: aload #18
    //   499: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   502: astore #14
    //   504: aload #14
    //   506: ifnull -> 519
    //   509: aload_0
    //   510: aload #18
    //   512: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   515: aload_1
    //   516: invokevirtual processRefSchemaObject : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   519: aload_3
    //   520: ifnonnull -> 453
    //   523: aload #12
    //   525: invokevirtual getParameters : ()Ljava/util/List;
    //   528: astore #13
    //   530: aload #13
    //   532: ifnull -> 564
    //   535: aload #13
    //   537: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   542: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   547: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   552: aload_0
    //   553: aload_1
    //   554: <illegal opcode> accept : (Lnet/portswigger/swagger/v3/parser/processors/ExternalRefProcessor;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   559: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   564: aload_3
    //   565: ifnonnull -> 138
    //   568: aload #4
    //   570: areturn
  }
  
  private void processDiscriminator(Discriminator paramDiscriminator, String paramString) {
    if (paramDiscriminator != null && paramDiscriminator.getMapping() != null)
      processDiscriminatorMapping(paramDiscriminator.getMapping(), paramString); 
  }
  
  private void processDiscriminatorMapping(Map<String, String> paramMap, String paramString) {
    Iterator<String> iterator = paramMap.keySet().iterator();
    Zbqc[] arrayOfZbqc = Zv();
    while (iterator.hasNext()) {
      String str1 = iterator.next();
      String str2 = paramMap.get(str1);
      Schema schema = (new Schema()).$ref(str2);
      processSchema(schema, paramString);
      paramMap.put(str1, schema.get$ref());
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  public String processRefToExternalResponse(String paramString, RefFormat paramRefFormat) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   7: aload_1
    //   8: invokevirtual getRenamedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   11: astore #4
    //   13: astore_3
    //   14: aload #4
    //   16: ifnull -> 22
    //   19: aload #4
    //   21: areturn
    //   22: aload_0
    //   23: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   26: aload_1
    //   27: aload_2
    //   28: ldc net/portswigger/swagger/v3/oas/models/responses/ApiResponse
    //   30: invokevirtual loadRef : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;Ljava/lang/Class;)Ljava/lang/Object;
    //   33: checkcast net/portswigger/swagger/v3/oas/models/responses/ApiResponse
    //   36: astore #5
    //   38: aload_0
    //   39: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   42: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   45: ifnonnull -> 62
    //   48: aload_0
    //   49: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   52: new net/portswigger/swagger/v3/oas/models/Components
    //   55: dup
    //   56: invokespecial <init> : ()V
    //   59: invokevirtual setComponents : (Lnet/portswigger/swagger/v3/oas/models/Components;)V
    //   62: aload_0
    //   63: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   66: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   69: invokevirtual getResponses : ()Ljava/util/Map;
    //   72: astore #7
    //   74: aload #7
    //   76: ifnonnull -> 88
    //   79: new java/util/LinkedHashMap
    //   82: dup
    //   83: invokespecial <init> : ()V
    //   86: astore #7
    //   88: aload_1
    //   89: invokestatic computeDefinitionName : (Ljava/lang/String;)Ljava/lang/String;
    //   92: astore #8
    //   94: aload #7
    //   96: aload #8
    //   98: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   103: checkcast net/portswigger/swagger/v3/oas/models/responses/ApiResponse
    //   106: astore #9
    //   108: aload #9
    //   110: ifnull -> 124
    //   113: aload #9
    //   115: invokevirtual get$ref : ()Ljava/lang/String;
    //   118: ifnull -> 124
    //   121: aconst_null
    //   122: astore #9
    //   124: aload #8
    //   126: astore #6
    //   128: aload_0
    //   129: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   132: aload_1
    //   133: aload #6
    //   135: invokevirtual putRenamedRef : (Ljava/lang/String;Ljava/lang/String;)V
    //   138: aload #9
    //   140: ifnonnull -> 406
    //   143: aload_0
    //   144: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   147: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   150: aload #6
    //   152: aload #5
    //   154: invokevirtual addResponses : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/responses/ApiResponse;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   157: pop
    //   158: aload_0
    //   159: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   162: aload #6
    //   164: invokevirtual addReferencedKey : (Ljava/lang/String;)V
    //   167: aload_1
    //   168: sipush #-352
    //   171: sipush #-22198
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   180: iconst_0
    //   181: aaload
    //   182: astore #10
    //   184: aload #5
    //   186: invokevirtual get$ref : ()Ljava/lang/String;
    //   189: ifnull -> 406
    //   192: aload #5
    //   194: invokevirtual get$ref : ()Ljava/lang/String;
    //   197: invokestatic computeRefFormat : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   200: astore #11
    //   202: aload #11
    //   204: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Z
    //   207: ifeq -> 386
    //   210: aload #5
    //   212: invokevirtual get$ref : ()Ljava/lang/String;
    //   215: astore #12
    //   217: aload #11
    //   219: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.URL : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   222: invokevirtual equals : (Ljava/lang/Object;)Z
    //   225: ifne -> 369
    //   228: aload #10
    //   230: iconst_0
    //   231: aload #10
    //   233: bipush #47
    //   235: invokevirtual lastIndexOf : (I)I
    //   238: invokevirtual substring : (II)Ljava/lang/String;
    //   241: astore #13
    //   243: aload #13
    //   245: invokevirtual isEmpty : ()Z
    //   248: ifne -> 369
    //   251: aload #12
    //   253: sipush #-352
    //   256: sipush #-22198
    //   259: invokestatic a : (II)Ljava/lang/String;
    //   262: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   265: ifeq -> 343
    //   268: aload #12
    //   270: sipush #-352
    //   273: sipush #-22198
    //   276: invokestatic a : (II)Ljava/lang/String;
    //   279: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   282: astore #14
    //   284: aload #14
    //   286: iconst_0
    //   287: aaload
    //   288: astore #15
    //   290: aload #14
    //   292: iconst_1
    //   293: aaload
    //   294: astore #16
    //   296: aload #13
    //   298: iconst_1
    //   299: anewarray java/lang/String
    //   302: dup
    //   303: iconst_0
    //   304: aload #15
    //   306: aastore
    //   307: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   310: invokeinterface normalize : ()Ljava/nio/file/Path;
    //   315: invokeinterface toString : ()Ljava/lang/String;
    //   320: aload #16
    //   322: sipush #-352
    //   325: sipush #-22198
    //   328: invokestatic a : (II)Ljava/lang/String;
    //   331: swap
    //   332: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   337: astore #12
    //   339: aload_3
    //   340: ifnonnull -> 369
    //   343: aload #13
    //   345: iconst_1
    //   346: anewarray java/lang/String
    //   349: dup
    //   350: iconst_0
    //   351: aload #12
    //   353: aastore
    //   354: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   357: invokeinterface normalize : ()Ljava/nio/file/Path;
    //   362: invokeinterface toString : ()Ljava/lang/String;
    //   367: astore #12
    //   369: aload #5
    //   371: aload_0
    //   372: aload #12
    //   374: aload #11
    //   376: invokevirtual processRefToExternalResponse : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Ljava/lang/String;
    //   379: invokevirtual set$ref : (Ljava/lang/String;)V
    //   382: aload_3
    //   383: ifnonnull -> 406
    //   386: aload_0
    //   387: aload #10
    //   389: aload #5
    //   391: invokevirtual get$ref : ()Ljava/lang/String;
    //   394: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   399: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.RELATIVE : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   402: invokevirtual processRefToExternalResponse : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Ljava/lang/String;
    //   405: pop
    //   406: aload #5
    //   408: ifnull -> 465
    //   411: aload #5
    //   413: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   416: ifnull -> 429
    //   419: aload_0
    //   420: aload #5
    //   422: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   425: aload_1
    //   426: invokevirtual processRefContent : (Ljava/util/Map;Ljava/lang/String;)V
    //   429: aload #5
    //   431: invokevirtual getHeaders : ()Ljava/util/Map;
    //   434: ifnull -> 447
    //   437: aload_0
    //   438: aload #5
    //   440: invokevirtual getHeaders : ()Ljava/util/Map;
    //   443: aload_1
    //   444: invokevirtual processRefHeaders : (Ljava/util/Map;Ljava/lang/String;)V
    //   447: aload #5
    //   449: invokevirtual getLinks : ()Ljava/util/Map;
    //   452: ifnull -> 465
    //   455: aload_0
    //   456: aload #5
    //   458: invokevirtual getLinks : ()Ljava/util/Map;
    //   461: aload_1
    //   462: invokevirtual processRefLinks : (Ljava/util/Map;Ljava/lang/String;)V
    //   465: aload #6
    //   467: areturn
  }
  
  public String processRefToExternalRequestBody(String paramString, RefFormat paramRefFormat) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   7: aload_1
    //   8: invokevirtual getRenamedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   11: astore #4
    //   13: astore_3
    //   14: aload #4
    //   16: ifnull -> 22
    //   19: aload #4
    //   21: areturn
    //   22: aload_0
    //   23: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   26: aload_1
    //   27: aload_2
    //   28: ldc net/portswigger/swagger/v3/oas/models/parameters/RequestBody
    //   30: invokevirtual loadRef : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;Ljava/lang/Class;)Ljava/lang/Object;
    //   33: checkcast net/portswigger/swagger/v3/oas/models/parameters/RequestBody
    //   36: astore #5
    //   38: aload #5
    //   40: ifnonnull -> 45
    //   43: aload_1
    //   44: areturn
    //   45: aload_0
    //   46: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   49: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   52: ifnonnull -> 69
    //   55: aload_0
    //   56: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   59: new net/portswigger/swagger/v3/oas/models/Components
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: invokevirtual setComponents : (Lnet/portswigger/swagger/v3/oas/models/Components;)V
    //   69: aload_0
    //   70: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   73: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   76: invokevirtual getRequestBodies : ()Ljava/util/Map;
    //   79: astore #7
    //   81: aload #7
    //   83: ifnonnull -> 95
    //   86: new java/util/LinkedHashMap
    //   89: dup
    //   90: invokespecial <init> : ()V
    //   93: astore #7
    //   95: aload_1
    //   96: invokestatic computeDefinitionName : (Ljava/lang/String;)Ljava/lang/String;
    //   99: astore #8
    //   101: aload #7
    //   103: aload #8
    //   105: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   110: checkcast net/portswigger/swagger/v3/oas/models/parameters/RequestBody
    //   113: astore #9
    //   115: aload #9
    //   117: ifnull -> 131
    //   120: aload #9
    //   122: invokevirtual get$ref : ()Ljava/lang/String;
    //   125: ifnull -> 131
    //   128: aconst_null
    //   129: astore #9
    //   131: aload #8
    //   133: astore #6
    //   135: aload_0
    //   136: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   139: aload_1
    //   140: aload #6
    //   142: invokevirtual putRenamedRef : (Ljava/lang/String;Ljava/lang/String;)V
    //   145: aload #9
    //   147: ifnonnull -> 279
    //   150: aload_0
    //   151: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   154: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   157: aload #6
    //   159: aload #5
    //   161: invokevirtual addRequestBodies : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/parameters/RequestBody;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   164: pop
    //   165: aload_0
    //   166: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   169: aload #6
    //   171: invokevirtual addReferencedKey : (Ljava/lang/String;)V
    //   174: aload_1
    //   175: sipush #-352
    //   178: sipush #-22198
    //   181: invokestatic a : (II)Ljava/lang/String;
    //   184: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   187: iconst_0
    //   188: aaload
    //   189: astore #10
    //   191: aload #5
    //   193: invokevirtual get$ref : ()Ljava/lang/String;
    //   196: ifnull -> 261
    //   199: aload #5
    //   201: invokevirtual get$ref : ()Ljava/lang/String;
    //   204: invokestatic computeRefFormat : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   207: astore #11
    //   209: aload #11
    //   211: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Z
    //   214: ifeq -> 237
    //   217: aload #5
    //   219: aload_0
    //   220: aload #5
    //   222: invokevirtual get$ref : ()Ljava/lang/String;
    //   225: aload #11
    //   227: invokevirtual processRefToExternalRequestBody : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Ljava/lang/String;
    //   230: invokevirtual set$ref : (Ljava/lang/String;)V
    //   233: aload_3
    //   234: ifnonnull -> 257
    //   237: aload_0
    //   238: aload #10
    //   240: aload #5
    //   242: invokevirtual get$ref : ()Ljava/lang/String;
    //   245: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   250: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.RELATIVE : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   253: invokevirtual processRefToExternalRequestBody : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Ljava/lang/String;
    //   256: pop
    //   257: aload_3
    //   258: ifnonnull -> 279
    //   261: aload #5
    //   263: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   266: ifnull -> 279
    //   269: aload_0
    //   270: aload #5
    //   272: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   275: aload_1
    //   276: invokevirtual processRefContent : (Ljava/util/Map;Ljava/lang/String;)V
    //   279: aload #6
    //   281: areturn
  }
  
  public String processRefToExternalHeader(String paramString, RefFormat paramRefFormat) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   7: aload_1
    //   8: invokevirtual getRenamedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   11: astore #4
    //   13: astore_3
    //   14: aload #4
    //   16: ifnull -> 22
    //   19: aload #4
    //   21: areturn
    //   22: aload_0
    //   23: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   26: aload_1
    //   27: aload_2
    //   28: ldc net/portswigger/swagger/v3/oas/models/headers/Header
    //   30: invokevirtual loadRef : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;Ljava/lang/Class;)Ljava/lang/Object;
    //   33: checkcast net/portswigger/swagger/v3/oas/models/headers/Header
    //   36: astore #5
    //   38: aload #5
    //   40: ifnonnull -> 45
    //   43: aload_1
    //   44: areturn
    //   45: aload_0
    //   46: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   49: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   52: ifnonnull -> 69
    //   55: aload_0
    //   56: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   59: new net/portswigger/swagger/v3/oas/models/Components
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: invokevirtual setComponents : (Lnet/portswigger/swagger/v3/oas/models/Components;)V
    //   69: aload_0
    //   70: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   73: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   76: invokevirtual getHeaders : ()Ljava/util/Map;
    //   79: astore #7
    //   81: aload #7
    //   83: ifnonnull -> 95
    //   86: new java/util/LinkedHashMap
    //   89: dup
    //   90: invokespecial <init> : ()V
    //   93: astore #7
    //   95: aload_1
    //   96: invokestatic computeDefinitionName : (Ljava/lang/String;)Ljava/lang/String;
    //   99: astore #8
    //   101: aload #7
    //   103: aload #8
    //   105: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   110: checkcast net/portswigger/swagger/v3/oas/models/headers/Header
    //   113: astore #9
    //   115: aload #9
    //   117: ifnull -> 131
    //   120: aload #9
    //   122: invokevirtual get$ref : ()Ljava/lang/String;
    //   125: ifnull -> 131
    //   128: aconst_null
    //   129: astore #9
    //   131: aload #8
    //   133: astore #6
    //   135: aload_0
    //   136: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   139: aload_1
    //   140: aload #6
    //   142: invokevirtual putRenamedRef : (Ljava/lang/String;Ljava/lang/String;)V
    //   145: aload #9
    //   147: ifnonnull -> 257
    //   150: aload_0
    //   151: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   154: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   157: aload #6
    //   159: aload #5
    //   161: invokevirtual addHeaders : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/headers/Header;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   164: pop
    //   165: aload_0
    //   166: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   169: aload #6
    //   171: invokevirtual addReferencedKey : (Ljava/lang/String;)V
    //   174: aload_1
    //   175: sipush #-352
    //   178: sipush #-22198
    //   181: invokestatic a : (II)Ljava/lang/String;
    //   184: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   187: iconst_0
    //   188: aaload
    //   189: astore #10
    //   191: aload #5
    //   193: invokevirtual get$ref : ()Ljava/lang/String;
    //   196: ifnull -> 257
    //   199: aload #5
    //   201: invokevirtual get$ref : ()Ljava/lang/String;
    //   204: invokestatic computeRefFormat : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   207: astore #11
    //   209: aload #11
    //   211: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Z
    //   214: ifeq -> 237
    //   217: aload #5
    //   219: aload_0
    //   220: aload #5
    //   222: invokevirtual get$ref : ()Ljava/lang/String;
    //   225: aload #11
    //   227: invokevirtual processRefToExternalHeader : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Ljava/lang/String;
    //   230: invokevirtual set$ref : (Ljava/lang/String;)V
    //   233: aload_3
    //   234: ifnonnull -> 257
    //   237: aload_0
    //   238: aload #10
    //   240: aload #5
    //   242: invokevirtual get$ref : ()Ljava/lang/String;
    //   245: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   250: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.RELATIVE : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   253: invokevirtual processRefToExternalHeader : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Ljava/lang/String;
    //   256: pop
    //   257: aload #5
    //   259: ifnull -> 298
    //   262: aload #5
    //   264: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   267: ifnull -> 280
    //   270: aload_0
    //   271: aload #5
    //   273: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   276: aload_1
    //   277: invokevirtual processRefContent : (Ljava/util/Map;Ljava/lang/String;)V
    //   280: aload #5
    //   282: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   285: ifnull -> 298
    //   288: aload_0
    //   289: aload #5
    //   291: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   294: aload_1
    //   295: invokevirtual processRefSchemaObject : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   298: aload #6
    //   300: areturn
  }
  
  public String processRefToExternalSecurityScheme(String paramString, RefFormat paramRefFormat) {
    String str4;
    String str1 = this.cache.getRenamedRef(paramString);
    Zbqc[] arrayOfZbqc = Zv();
    if (str1 != null)
      return str1; 
    SecurityScheme securityScheme1 = (SecurityScheme)this.cache.loadRef(paramString, paramRefFormat, SecurityScheme.class);
    if (securityScheme1 == null)
      return paramString; 
    if (this.openAPI.getComponents() == null)
      this.openAPI.setComponents(new Components()); 
    Map<Object, Object> map = this.openAPI.getComponents().getSecuritySchemes();
    if (map == null)
      map = new LinkedHashMap<>(); 
    String str3 = RefUtils.computeDefinitionName(paramString);
    SecurityScheme securityScheme2 = (SecurityScheme)map.get(str3);
    if (securityScheme2 != null && securityScheme2.get$ref() != null)
      securityScheme2 = null; 
    String str2 = str3;
    this.cache.putRenamedRef(paramString, str2);
    if (securityScheme2 == null) {
      this.openAPI.getComponents().addSecuritySchemes(str2, securityScheme1);
      this.cache.addReferencedKey(str2);
      str4 = paramString.split(a(-350, 31236))[0];
      if (securityScheme1.get$ref() != null) {
        RefFormat refFormat = RefUtils.computeRefFormat(securityScheme1.get$ref());
        if (RefUtils.isAnExternalRefFormat(refFormat)) {
          securityScheme1.set$ref(processRefToExternalSecurityScheme(securityScheme1.get$ref(), refFormat));
          if (arrayOfZbqc == null) {
            processRefToExternalSecurityScheme(str4 + str4, RefFormat.RELATIVE);
            return str2;
          } 
          return str2;
        } 
      } else {
        return str2;
      } 
    } else {
      return str2;
    } 
    processRefToExternalSecurityScheme(str4 + str4, RefFormat.RELATIVE);
    return str2;
  }
  
  public String processRefToExternalLink(String paramString, RefFormat paramRefFormat) {
    String str4;
    String str1 = this.cache.getRenamedRef(paramString);
    Zbqc[] arrayOfZbqc = Zv();
    if (str1 != null)
      return str1; 
    Link link1 = (Link)this.cache.loadRef(paramString, paramRefFormat, Link.class);
    if (link1 == null)
      return paramString; 
    if (this.openAPI.getComponents() == null)
      this.openAPI.setComponents(new Components()); 
    Map<Object, Object> map = this.openAPI.getComponents().getLinks();
    if (map == null)
      map = new LinkedHashMap<>(); 
    String str3 = RefUtils.computeDefinitionName(paramString);
    Link link2 = (Link)map.get(str3);
    if (link2 != null && link2.get$ref() != null)
      link2 = null; 
    String str2 = str3;
    this.cache.putRenamedRef(paramString, str2);
    if (link2 == null) {
      this.openAPI.getComponents().addLinks(str2, link1);
      this.cache.addReferencedKey(str2);
      str4 = paramString.split(a(-352, -22198))[0];
      if (link1.get$ref() != null) {
        RefFormat refFormat = RefUtils.computeRefFormat(link1.get$ref());
        if (RefUtils.isAnExternalRefFormat(refFormat)) {
          link1.set$ref(processRefToExternalLink(link1.get$ref(), refFormat));
          if (arrayOfZbqc == null) {
            processRefToExternalLink(str4 + str4, RefFormat.RELATIVE);
            return str2;
          } 
          return str2;
        } 
      } else {
        return str2;
      } 
    } else {
      return str2;
    } 
    processRefToExternalLink(str4 + str4, RefFormat.RELATIVE);
    return str2;
  }
  
  public String processRefToExternalExample(String paramString, RefFormat paramRefFormat) {
    String str4;
    String str1 = this.cache.getRenamedRef(paramString);
    Zbqc[] arrayOfZbqc = Zv();
    if (str1 != null)
      return str1; 
    Example example1 = (Example)this.cache.loadRef(paramString, paramRefFormat, Example.class);
    if (example1 == null)
      return paramString; 
    if (this.openAPI.getComponents() == null)
      this.openAPI.setComponents(new Components()); 
    Map<Object, Object> map = this.openAPI.getComponents().getExamples();
    if (map == null)
      map = new LinkedHashMap<>(); 
    String str3 = RefUtils.computeDefinitionName(paramString);
    Example example2 = (Example)map.get(str3);
    if (example2 != null && example2.get$ref() != null)
      example2 = null; 
    String str2 = str3;
    this.cache.putRenamedRef(paramString, str2);
    if (example2 == null) {
      this.openAPI.getComponents().addExamples(str2, example1);
      this.cache.addReferencedKey(str2);
      str4 = paramString.split(a(-352, -22198))[0];
      if (example1.get$ref() != null) {
        RefFormat refFormat = RefUtils.computeRefFormat(example1.get$ref());
        if (RefUtils.isAnExternalRefFormat(refFormat)) {
          example1.set$ref(processRefToExternalExample(example1.get$ref(), refFormat));
          if (arrayOfZbqc == null) {
            processRefToExternalExample(str4 + str4, RefFormat.RELATIVE);
            return str2;
          } 
          return str2;
        } 
      } else {
        return str2;
      } 
    } else {
      return str2;
    } 
    processRefToExternalExample(str4 + str4, RefFormat.RELATIVE);
    return str2;
  }
  
  public String processRefToExternalParameter(String paramString, RefFormat paramRefFormat) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   7: aload_1
    //   8: invokevirtual getRenamedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   11: astore #4
    //   13: astore_3
    //   14: aload #4
    //   16: ifnull -> 22
    //   19: aload #4
    //   21: areturn
    //   22: aload_0
    //   23: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   26: aload_1
    //   27: aload_2
    //   28: ldc net/portswigger/swagger/v3/oas/models/parameters/Parameter
    //   30: invokevirtual loadRef : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;Ljava/lang/Class;)Ljava/lang/Object;
    //   33: checkcast net/portswigger/swagger/v3/oas/models/parameters/Parameter
    //   36: astore #5
    //   38: aload #5
    //   40: ifnonnull -> 45
    //   43: aload_1
    //   44: areturn
    //   45: aload_0
    //   46: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   49: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   52: ifnonnull -> 69
    //   55: aload_0
    //   56: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   59: new net/portswigger/swagger/v3/oas/models/Components
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: invokevirtual setComponents : (Lnet/portswigger/swagger/v3/oas/models/Components;)V
    //   69: aload_0
    //   70: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   73: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   76: invokevirtual getParameters : ()Ljava/util/Map;
    //   79: astore #7
    //   81: aload #7
    //   83: ifnonnull -> 95
    //   86: new java/util/LinkedHashMap
    //   89: dup
    //   90: invokespecial <init> : ()V
    //   93: astore #7
    //   95: aload_1
    //   96: invokestatic computeDefinitionName : (Ljava/lang/String;)Ljava/lang/String;
    //   99: astore #8
    //   101: aload #7
    //   103: aload #8
    //   105: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   110: checkcast net/portswigger/swagger/v3/oas/models/parameters/Parameter
    //   113: astore #9
    //   115: aload #9
    //   117: ifnull -> 131
    //   120: aload #9
    //   122: invokevirtual get$ref : ()Ljava/lang/String;
    //   125: ifnull -> 131
    //   128: aconst_null
    //   129: astore #9
    //   131: aload #8
    //   133: astore #6
    //   135: aload_0
    //   136: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   139: aload_1
    //   140: aload #6
    //   142: invokevirtual putRenamedRef : (Ljava/lang/String;Ljava/lang/String;)V
    //   145: aload #9
    //   147: ifnonnull -> 413
    //   150: aload_0
    //   151: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   154: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   157: aload #6
    //   159: aload #5
    //   161: invokevirtual addParameters : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   164: pop
    //   165: aload_0
    //   166: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   169: aload #6
    //   171: invokevirtual addReferencedKey : (Ljava/lang/String;)V
    //   174: aload_1
    //   175: sipush #-352
    //   178: sipush #-22198
    //   181: invokestatic a : (II)Ljava/lang/String;
    //   184: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   187: iconst_0
    //   188: aaload
    //   189: astore #10
    //   191: aload #5
    //   193: invokevirtual get$ref : ()Ljava/lang/String;
    //   196: ifnull -> 413
    //   199: aload #5
    //   201: invokevirtual get$ref : ()Ljava/lang/String;
    //   204: invokestatic computeRefFormat : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   207: astore #11
    //   209: aload #11
    //   211: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Z
    //   214: ifeq -> 393
    //   217: aload #5
    //   219: invokevirtual get$ref : ()Ljava/lang/String;
    //   222: astore #12
    //   224: aload #11
    //   226: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.URL : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   229: invokevirtual equals : (Ljava/lang/Object;)Z
    //   232: ifne -> 376
    //   235: aload #10
    //   237: iconst_0
    //   238: aload #10
    //   240: bipush #47
    //   242: invokevirtual lastIndexOf : (I)I
    //   245: invokevirtual substring : (II)Ljava/lang/String;
    //   248: astore #13
    //   250: aload #13
    //   252: invokevirtual isEmpty : ()Z
    //   255: ifne -> 376
    //   258: aload #12
    //   260: sipush #-352
    //   263: sipush #-22198
    //   266: invokestatic a : (II)Ljava/lang/String;
    //   269: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   272: ifeq -> 350
    //   275: aload #12
    //   277: sipush #-352
    //   280: sipush #-22198
    //   283: invokestatic a : (II)Ljava/lang/String;
    //   286: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   289: astore #14
    //   291: aload #14
    //   293: iconst_0
    //   294: aaload
    //   295: astore #15
    //   297: aload #14
    //   299: iconst_1
    //   300: aaload
    //   301: astore #16
    //   303: aload #13
    //   305: iconst_1
    //   306: anewarray java/lang/String
    //   309: dup
    //   310: iconst_0
    //   311: aload #15
    //   313: aastore
    //   314: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   317: invokeinterface normalize : ()Ljava/nio/file/Path;
    //   322: invokeinterface toString : ()Ljava/lang/String;
    //   327: aload #16
    //   329: sipush #-352
    //   332: sipush #-22198
    //   335: invokestatic a : (II)Ljava/lang/String;
    //   338: swap
    //   339: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   344: astore #12
    //   346: aload_3
    //   347: ifnonnull -> 376
    //   350: aload #13
    //   352: iconst_1
    //   353: anewarray java/lang/String
    //   356: dup
    //   357: iconst_0
    //   358: aload #12
    //   360: aastore
    //   361: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   364: invokeinterface normalize : ()Ljava/nio/file/Path;
    //   369: invokeinterface toString : ()Ljava/lang/String;
    //   374: astore #12
    //   376: aload #5
    //   378: aload_0
    //   379: aload #12
    //   381: aload #11
    //   383: invokevirtual processRefToExternalParameter : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Ljava/lang/String;
    //   386: invokevirtual set$ref : (Ljava/lang/String;)V
    //   389: aload_3
    //   390: ifnonnull -> 413
    //   393: aload_0
    //   394: aload #10
    //   396: aload #5
    //   398: invokevirtual get$ref : ()Ljava/lang/String;
    //   401: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   406: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.RELATIVE : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   409: invokevirtual processRefToExternalParameter : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Ljava/lang/String;
    //   412: pop
    //   413: aload #5
    //   415: ifnull -> 454
    //   418: aload #5
    //   420: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   423: ifnull -> 436
    //   426: aload_0
    //   427: aload #5
    //   429: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   432: aload_1
    //   433: invokevirtual processRefContent : (Ljava/util/Map;Ljava/lang/String;)V
    //   436: aload #5
    //   438: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   441: ifnull -> 454
    //   444: aload_0
    //   445: aload #5
    //   447: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   450: aload_1
    //   451: invokevirtual processRefSchemaObject : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   454: aload #6
    //   456: areturn
  }
  
  public String processRefToExternalCallback(String paramString, RefFormat paramRefFormat) {
    String str4;
    String str1 = this.cache.getRenamedRef(paramString);
    Zbqc[] arrayOfZbqc = Zv();
    if (str1 != null)
      return str1; 
    Callback callback1 = (Callback)this.cache.loadRef(paramString, paramRefFormat, Callback.class);
    if (callback1 == null)
      return paramString; 
    if (this.openAPI.getComponents() == null)
      this.openAPI.setComponents(new Components()); 
    Map<Object, Object> map = this.openAPI.getComponents().getCallbacks();
    if (map == null)
      map = new LinkedHashMap<>(); 
    String str3 = RefUtils.computeDefinitionName(paramString);
    Callback callback2 = (Callback)map.get(str3);
    if (callback2 != null && callback2.get$ref() != null)
      callback2 = null; 
    String str2 = str3;
    this.cache.putRenamedRef(paramString, str2);
    if (callback2 == null) {
      this.openAPI.getComponents().addCallbacks(str2, callback1);
      this.cache.addReferencedKey(str2);
      str4 = paramString.split(a(-352, -22198))[0];
      if (callback1.get$ref() != null && callback1.get$ref() != null) {
        RefFormat refFormat = RefUtils.computeRefFormat(callback1.get$ref());
        if (RefUtils.isAnExternalRefFormat(refFormat)) {
          callback1.set$ref(processRefToExternalCallback(callback1.get$ref(), refFormat));
          if (arrayOfZbqc == null) {
            processRefToExternalCallback(str4 + str4, RefFormat.RELATIVE);
            return str2;
          } 
          return str2;
        } 
      } else {
        return str2;
      } 
    } else {
      return str2;
    } 
    processRefToExternalCallback(str4 + str4, RefFormat.RELATIVE);
    return str2;
  }
  
  private void processRefContent(Map<String, MediaType> paramMap, String paramString) {
    Iterator<MediaType> iterator = paramMap.values().iterator();
    Zbqc[] arrayOfZbqc = Zv();
    while (iterator.hasNext()) {
      MediaType mediaType = iterator.next();
      if (mediaType.getSchema() != null)
        processRefSchemaObject(mediaType.getSchema(), paramString); 
      if (mediaType.getExamples() != null)
        processRefExamples(mediaType.getExamples(), paramString); 
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void processRefExamples(Map<String, Example> paramMap, String paramString) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: aload_2
    //   4: sipush #-352
    //   7: sipush #-22198
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   16: iconst_0
    //   17: aaload
    //   18: astore #4
    //   20: astore_3
    //   21: aload_1
    //   22: invokeinterface values : ()Ljava/util/Collection;
    //   27: invokeinterface iterator : ()Ljava/util/Iterator;
    //   32: astore #5
    //   34: aload #5
    //   36: invokeinterface hasNext : ()Z
    //   41: ifeq -> 117
    //   44: aload #5
    //   46: invokeinterface next : ()Ljava/lang/Object;
    //   51: checkcast net/portswigger/swagger/v3/oas/models/examples/Example
    //   54: astore #6
    //   56: aload #6
    //   58: invokevirtual get$ref : ()Ljava/lang/String;
    //   61: ifnull -> 113
    //   64: aload #6
    //   66: invokevirtual get$ref : ()Ljava/lang/String;
    //   69: invokestatic computeRefFormat : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   72: astore #7
    //   74: aload #7
    //   76: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Z
    //   79: ifeq -> 93
    //   82: aload_0
    //   83: aload #6
    //   85: aload_2
    //   86: invokevirtual processRefExample : (Lnet/portswigger/swagger/v3/oas/models/examples/Example;Ljava/lang/String;)V
    //   89: aload_3
    //   90: ifnonnull -> 113
    //   93: aload_0
    //   94: aload #4
    //   96: aload #6
    //   98: invokevirtual get$ref : ()Ljava/lang/String;
    //   101: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   106: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.RELATIVE : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   109: invokevirtual processRefToExternalExample : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Ljava/lang/String;
    //   112: pop
    //   113: aload_3
    //   114: ifnonnull -> 34
    //   117: return
  }
  
  private void processRefExample(Example paramExample, String paramString) {
    RefFormat refFormat = RefUtils.computeRefFormat(paramExample.get$ref());
    Zbqc[] arrayOfZbqc = Zv();
    if (!RefUtils.isAnExternalRefFormat(refFormat)) {
      paramExample.set$ref(RefType.SCHEMAS.getInternalPrefix() + RefType.SCHEMAS.getInternalPrefix());
      return;
    } 
    String str1 = paramExample.get$ref();
    String str2 = RefUtils.getExternalPath(paramExample.get$ref()).orElse(null);
    if (refFormat.equals(RefFormat.RELATIVE) && !Objects.equals(str2, paramString)) {
      str1 = join(paramString, paramExample.get$ref());
      paramExample.set$ref(str1);
      if (arrayOfZbqc == null) {
        processRefToExternalExample(str1, refFormat);
        return;
      } 
      return;
    } 
    processRefToExternalExample(str1, refFormat);
  }
  
  private void processRefSchemaObject(Schema paramSchema, String paramString) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: aload_2
    //   4: sipush #-352
    //   7: sipush #-22198
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   16: iconst_0
    //   17: aaload
    //   18: astore #4
    //   20: astore_3
    //   21: aload_1
    //   22: invokevirtual get$ref : ()Ljava/lang/String;
    //   25: ifnull -> 79
    //   28: aload_1
    //   29: invokevirtual get$ref : ()Ljava/lang/String;
    //   32: invokestatic computeRefFormat : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   35: astore #5
    //   37: aload #5
    //   39: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Z
    //   42: ifeq -> 56
    //   45: aload_0
    //   46: aload_1
    //   47: aload #4
    //   49: invokevirtual processRefSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   52: aload_3
    //   53: ifnonnull -> 75
    //   56: aload_0
    //   57: aload #4
    //   59: aload_1
    //   60: invokevirtual get$ref : ()Ljava/lang/String;
    //   63: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   68: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.RELATIVE : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   71: invokevirtual processRefToExternalSchema : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Ljava/lang/String;
    //   74: pop
    //   75: aload_3
    //   76: ifnonnull -> 86
    //   79: aload_0
    //   80: aload_1
    //   81: aload #4
    //   83: invokevirtual processSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   86: return
  }
  
  private void processRefHeaders(Map<String, Header> paramMap, String paramString) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: aload_2
    //   4: sipush #-352
    //   7: sipush #-22198
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   16: iconst_0
    //   17: aaload
    //   18: astore #4
    //   20: astore_3
    //   21: aload_1
    //   22: invokeinterface values : ()Ljava/util/Collection;
    //   27: invokeinterface iterator : ()Ljava/util/Iterator;
    //   32: astore #5
    //   34: aload #5
    //   36: invokeinterface hasNext : ()Z
    //   41: ifeq -> 117
    //   44: aload #5
    //   46: invokeinterface next : ()Ljava/lang/Object;
    //   51: checkcast net/portswigger/swagger/v3/oas/models/headers/Header
    //   54: astore #6
    //   56: aload #6
    //   58: invokevirtual get$ref : ()Ljava/lang/String;
    //   61: ifnull -> 113
    //   64: aload #6
    //   66: invokevirtual get$ref : ()Ljava/lang/String;
    //   69: invokestatic computeRefFormat : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   72: astore #7
    //   74: aload #7
    //   76: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Z
    //   79: ifeq -> 93
    //   82: aload_0
    //   83: aload #6
    //   85: aload_2
    //   86: invokevirtual processRefHeader : (Lnet/portswigger/swagger/v3/oas/models/headers/Header;Ljava/lang/String;)V
    //   89: aload_3
    //   90: ifnonnull -> 113
    //   93: aload_0
    //   94: aload #4
    //   96: aload #6
    //   98: invokevirtual get$ref : ()Ljava/lang/String;
    //   101: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   106: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.RELATIVE : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   109: invokevirtual processRefToExternalHeader : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Ljava/lang/String;
    //   112: pop
    //   113: aload_3
    //   114: ifnonnull -> 34
    //   117: return
  }
  
  private void processRefLinks(Map<String, Link> paramMap, String paramString) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: aload_2
    //   4: sipush #-352
    //   7: sipush #-22198
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   16: iconst_0
    //   17: aaload
    //   18: astore #4
    //   20: astore_3
    //   21: aload_1
    //   22: invokeinterface values : ()Ljava/util/Collection;
    //   27: invokeinterface iterator : ()Ljava/util/Iterator;
    //   32: astore #5
    //   34: aload #5
    //   36: invokeinterface hasNext : ()Z
    //   41: ifeq -> 117
    //   44: aload #5
    //   46: invokeinterface next : ()Ljava/lang/Object;
    //   51: checkcast net/portswigger/swagger/v3/oas/models/links/Link
    //   54: astore #6
    //   56: aload #6
    //   58: invokevirtual get$ref : ()Ljava/lang/String;
    //   61: ifnull -> 113
    //   64: aload #6
    //   66: invokevirtual get$ref : ()Ljava/lang/String;
    //   69: invokestatic computeRefFormat : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   72: astore #7
    //   74: aload #7
    //   76: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Z
    //   79: ifeq -> 93
    //   82: aload_0
    //   83: aload #6
    //   85: aload_2
    //   86: invokevirtual processRefLink : (Lnet/portswigger/swagger/v3/oas/models/links/Link;Ljava/lang/String;)V
    //   89: aload_3
    //   90: ifnonnull -> 113
    //   93: aload_0
    //   94: aload #4
    //   96: aload #6
    //   98: invokevirtual get$ref : ()Ljava/lang/String;
    //   101: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   106: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.RELATIVE : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   109: invokevirtual processRefToExternalLink : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Ljava/lang/String;
    //   112: pop
    //   113: aload_3
    //   114: ifnonnull -> 34
    //   117: return
  }
  
  private void processRefSchema(Schema paramSchema, String paramString) {
    RefFormat refFormat = RefUtils.computeRefFormat(paramSchema.get$ref());
    Zbqc[] arrayOfZbqc = Zv();
    if (!RefUtils.isAnExternalRefFormat(refFormat)) {
      paramSchema.set$ref(RefType.SCHEMAS.getInternalPrefix() + RefType.SCHEMAS.getInternalPrefix());
      return;
    } 
    String str1 = paramSchema.get$ref();
    String str2 = RefUtils.getExternalPath(paramSchema.get$ref()).orElse(null);
    if (refFormat.equals(RefFormat.RELATIVE) && !Objects.equals(str2, paramString)) {
      str1 = constructRef(paramSchema, paramString);
      paramSchema.set$ref(str1);
      if (arrayOfZbqc == null) {
        processRefToExternalSchema(str1, refFormat);
        return;
      } 
      return;
    } 
    processRefToExternalSchema(str1, refFormat);
  }
  
  protected String constructRef(Schema paramSchema, String paramString) {
    String str = paramSchema.get$ref();
    return join(paramString, str);
  }
  
  private void processRefHeader(Header paramHeader, String paramString) {
    RefFormat refFormat = RefUtils.computeRefFormat(paramHeader.get$ref());
    Zbqc[] arrayOfZbqc = Zv();
    if (!RefUtils.isAnExternalRefFormat(refFormat)) {
      paramHeader.set$ref(RefType.SCHEMAS.getInternalPrefix() + RefType.SCHEMAS.getInternalPrefix());
      return;
    } 
    String str1 = paramHeader.get$ref();
    String str2 = RefUtils.getExternalPath(paramHeader.get$ref()).orElse(null);
    if (refFormat.equals(RefFormat.RELATIVE) && !Objects.equals(str2, paramString)) {
      str1 = join(paramString, paramHeader.get$ref());
      paramHeader.set$ref(str1);
      if (arrayOfZbqc == null) {
        processRefToExternalHeader(str1, refFormat);
        return;
      } 
      return;
    } 
    processRefToExternalHeader(str1, refFormat);
  }
  
  private void processRefLink(Link paramLink, String paramString) {
    RefFormat refFormat = RefUtils.computeRefFormat(paramLink.get$ref());
    Zbqc[] arrayOfZbqc = Zv();
    if (!RefUtils.isAnExternalRefFormat(refFormat)) {
      paramLink.set$ref(RefType.SCHEMAS.getInternalPrefix() + RefType.SCHEMAS.getInternalPrefix());
      return;
    } 
    String str1 = paramLink.get$ref();
    String str2 = RefUtils.getExternalPath(paramLink.get$ref()).orElse(null);
    if (refFormat.equals(RefFormat.RELATIVE) && !Objects.equals(str2, paramString)) {
      str1 = join(paramString, paramLink.get$ref());
      paramLink.set$ref(str1);
      if (arrayOfZbqc == null) {
        processRefToExternalLink(str1, refFormat);
        return;
      } 
      return;
    } 
    processRefToExternalLink(str1, refFormat);
  }
  
  public static String join(String paramString1, String paramString2) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: aload_0
    //   7: ldc '/'
    //   9: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   12: ifne -> 31
    //   15: aload_0
    //   16: ldc '.'
    //   18: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   21: ifeq -> 33
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: iconst_1
    //   32: istore_3
    //   33: new java/net/URI
    //   36: dup
    //   37: aload_0
    //   38: invokespecial <init> : (Ljava/lang/String;)V
    //   41: astore #4
    //   43: aload_0
    //   44: ldc '/'
    //   46: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   49: ifne -> 114
    //   52: aload_1
    //   53: sipush #-351
    //   56: sipush #3548
    //   59: invokestatic a : (II)Ljava/lang/String;
    //   62: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   65: ifeq -> 114
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: ldc ''
    //   77: aload #4
    //   79: invokevirtual getPath : ()Ljava/lang/String;
    //   82: invokevirtual equals : (Ljava/lang/Object;)Z
    //   85: ifeq -> 114
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   94: athrow
    //   95: new java/net/URI
    //   98: dup
    //   99: aload_0
    //   100: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   105: invokespecial <init> : (Ljava/lang/String;)V
    //   108: astore #4
    //   110: aload_2
    //   111: ifnonnull -> 165
    //   114: ldc ''
    //   116: aload #4
    //   118: invokevirtual getPath : ()Ljava/lang/String;
    //   121: invokevirtual equals : (Ljava/lang/Object;)Z
    //   124: ifeq -> 165
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: aload_1
    //   135: ldc '/'
    //   137: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   140: ifne -> 165
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   149: athrow
    //   150: new java/net/URI
    //   153: dup
    //   154: aload_0
    //   155: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   160: invokespecial <init> : (Ljava/lang/String;)V
    //   163: astore #4
    //   165: new java/net/URI
    //   168: dup
    //   169: aload_1
    //   170: invokespecial <init> : (Ljava/lang/String;)V
    //   173: astore #5
    //   175: aload #4
    //   177: aload #5
    //   179: invokevirtual resolve : (Ljava/net/URI;)Ljava/net/URI;
    //   182: astore #6
    //   184: aload #6
    //   186: invokevirtual normalize : ()Ljava/net/URI;
    //   189: astore #7
    //   191: aload #7
    //   193: invokevirtual toString : ()Ljava/lang/String;
    //   196: iconst_0
    //   197: invokevirtual charAt : (I)C
    //   200: invokestatic isAlphabetic : (I)Z
    //   203: ifeq -> 238
    //   206: iload_3
    //   207: ifeq -> 238
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   216: athrow
    //   217: aload #7
    //   219: invokevirtual toString : ()Ljava/lang/String;
    //   222: sipush #-349
    //   225: sipush #-19936
    //   228: invokestatic a : (II)Ljava/lang/String;
    //   231: swap
    //   232: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   237: areturn
    //   238: aload #7
    //   240: invokevirtual toString : ()Ljava/lang/String;
    //   243: areturn
    //   244: astore_3
    //   245: aload_0
    //   246: areturn
    // Exception table:
    //   from	to	target	type
    //   4	237	244	java/lang/Exception
    //   6	24	27	java/lang/Exception
    //   43	68	71	java/lang/Exception
    //   52	88	91	java/lang/Exception
    //   110	127	130	java/lang/Exception
    //   114	143	146	java/lang/Exception
    //   191	210	213	java/lang/Exception
    //   238	243	244	java/lang/Exception
  }
  
  private void lambda$processRefToExternalPathItem$1(String paramString, Parameter paramParameter) {
    processRefSchemaObject(paramParameter.getSchema(), paramString);
  }
  
  private static boolean lambda$processRefToExternalPathItem$0(Parameter paramParameter) {
    return (paramParameter.getSchema() != null);
  }
  
  public static void Zp(Zbqc[] paramArrayOfZbqc) {
    ZX = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zv() {
    return ZX;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_2
    //   7: anewarray burp/Zbqc
    //   10: iconst_0
    //   11: istore_3
    //   12: invokestatic Zp : ([Lburp/Zbqc;)V
    //   15: ldc '³¥k'
    //   17: dup
    //   18: astore_2
    //   19: invokevirtual length : ()I
    //   22: istore #4
    //   24: iconst_2
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #118
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 146
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc 'M[\\n¿'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: iconst_2
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #94
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 146
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
    //   133: putstatic net/portswigger/swagger/v3/parser/processors/ExternalRefProcessor.a : [Ljava/lang/String;
    //   136: iconst_4
    //   137: anewarray java/lang/String
    //   140: putstatic net/portswigger/swagger/v3/parser/processors/ExternalRefProcessor.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #34
    //   218: goto -> 248
    //   221: bipush #122
    //   223: goto -> 248
    //   226: bipush #106
    //   228: goto -> 248
    //   231: bipush #46
    //   233: goto -> 248
    //   236: bipush #28
    //   238: goto -> 248
    //   241: bipush #125
    //   243: goto -> 248
    //   246: bipush #73
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 45, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFEA3) & 0xFFFF;
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
      char c = 'È';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\processors\ExternalRefProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */