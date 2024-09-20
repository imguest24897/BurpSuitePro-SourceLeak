package net.portswigger.swagger.v3.parser.processors;

import burp.Zbqc;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.swagger.v2.util.OpenAPIDeserializer;
import net.portswigger.swagger.v2.util.RefUtils;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.media.ArraySchema;
import net.portswigger.swagger.v3.oas.models.media.ComposedSchema;
import net.portswigger.swagger.v3.oas.models.media.Discriminator;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.parser.ResolverCache;
import net.portswigger.swagger.v3.parser.extensions.JsonSchemaParserExtension;
import net.portswigger.swagger.v3.parser.models.RefFormat;
import net.portswigger.swagger.v3.parser.models.RefType;

public class SchemaProcessor {
  private final ExternalRefProcessor externalRefProcessor;
  
  private boolean openapi31;
  
  private final ResolverCache cache;
  
  private OpenAPI openAPI;
  
  public SchemaProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI) {
    this(paramResolverCache, paramOpenAPI, false);
  }
  
  public SchemaProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI, boolean paramBoolean) {
    this.openapi31 = paramBoolean;
    this.cache = paramResolverCache;
    this.openAPI = paramOpenAPI;
    this.externalRefProcessor = new ExternalRefProcessor(paramResolverCache, paramOpenAPI);
  }
  
  public void processSchema(Schema paramSchema) {
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (paramSchema == null)
      return; 
    if (this.openapi31) {
      List list = OpenAPIDeserializer.getJsonSchemaParserExtensions();
      for (JsonSchemaParserExtension jsonSchemaParserExtension : list) {
        if (jsonSchemaParserExtension.resolveSchema(paramSchema, this.cache, this.openAPI, this.openapi31))
          return; 
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    if (paramSchema.get$ref() != null) {
      processReferenceSchema(paramSchema);
      if (arrayOfZbqc == null) {
        processSchemaType(paramSchema);
        return;
      } 
      return;
    } 
    processSchemaType(paramSchema);
  }
  
  public void processSchemaType(Schema paramSchema) {
    if (paramSchema == null)
      return; 
    if (paramSchema instanceof ArraySchema)
      processArraySchema((ArraySchema)paramSchema); 
    if (paramSchema instanceof ComposedSchema)
      processComposedSchema((ComposedSchema)paramSchema); 
    if (paramSchema.getProperties() != null && paramSchema.getProperties().size() > 0)
      processPropertySchema(paramSchema); 
    if (paramSchema.getNot() != null)
      processNotSchema(paramSchema); 
    if (paramSchema.getAdditionalProperties() != null)
      processAdditionalProperties(paramSchema); 
    if (paramSchema.getDiscriminator() != null)
      processDiscriminatorSchema(paramSchema); 
  }
  
  private void processDiscriminatorSchema(Schema paramSchema) {
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (paramSchema.getDiscriminator() != null && paramSchema.getDiscriminator().getMapping() != null) {
      Map map = paramSchema.getDiscriminator().getMapping();
      for (String str : map.values()) {
        processReferenceSchema((new Schema()).$ref(str));
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
  }
  
  private void processAdditionalProperties(Object paramObject) {
    Schema schema;
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (paramObject instanceof Schema) {
      Schema schema1 = (Schema)paramObject;
      if (schema1.getAdditionalProperties() != null && schema1.getAdditionalProperties() instanceof Schema) {
        schema = (Schema)schema1.getAdditionalProperties();
        if (schema.get$ref() != null) {
          processReferenceSchema(schema);
          if (arrayOfZbqc == null) {
            processSchemaType(schema);
            return;
          } 
          return;
        } 
      } else {
        return;
      } 
    } else {
      return;
    } 
    processSchemaType(schema);
  }
  
  private void processNotSchema(Schema paramSchema) {
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (paramSchema.getNot() != null) {
      if (paramSchema.getNot().get$ref() != null) {
        processReferenceSchema(paramSchema.getNot());
        if (arrayOfZbqc == null) {
          processSchemaType(paramSchema.getNot());
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    processSchemaType(paramSchema.getNot());
  }
  
  public void processPropertySchema(Schema paramSchema) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual get$ref : ()Ljava/lang/String;
    //   8: ifnull -> 16
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual processReferenceSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   16: aload_1
    //   17: invokevirtual getProperties : ()Ljava/util/Map;
    //   20: astore_3
    //   21: aload_3
    //   22: ifnull -> 100
    //   25: aload_3
    //   26: invokeinterface entrySet : ()Ljava/util/Set;
    //   31: invokeinterface iterator : ()Ljava/util/Iterator;
    //   36: astore #4
    //   38: aload #4
    //   40: invokeinterface hasNext : ()Z
    //   45: ifeq -> 100
    //   48: aload #4
    //   50: invokeinterface next : ()Ljava/lang/Object;
    //   55: checkcast java/util/Map$Entry
    //   58: astore #5
    //   60: aload #5
    //   62: invokeinterface getValue : ()Ljava/lang/Object;
    //   67: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   70: astore #6
    //   72: aload #6
    //   74: invokevirtual get$ref : ()Ljava/lang/String;
    //   77: ifnull -> 90
    //   80: aload_0
    //   81: aload #6
    //   83: invokevirtual processReferenceSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   86: aload_2
    //   87: ifnonnull -> 96
    //   90: aload_0
    //   91: aload #6
    //   93: invokevirtual processSchemaType : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   96: aload_2
    //   97: ifnonnull -> 38
    //   100: return
  }
  
  public void processComposedSchema(ComposedSchema paramComposedSchema) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual getAllOf : ()Ljava/util/List;
    //   8: ifnull -> 78
    //   11: aload_1
    //   12: invokevirtual getAllOf : ()Ljava/util/List;
    //   15: astore_3
    //   16: aload_3
    //   17: ifnull -> 78
    //   20: aload_3
    //   21: invokeinterface iterator : ()Ljava/util/Iterator;
    //   26: astore #4
    //   28: aload #4
    //   30: invokeinterface hasNext : ()Z
    //   35: ifeq -> 78
    //   38: aload #4
    //   40: invokeinterface next : ()Ljava/lang/Object;
    //   45: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   48: astore #5
    //   50: aload #5
    //   52: invokevirtual get$ref : ()Ljava/lang/String;
    //   55: ifnull -> 68
    //   58: aload_0
    //   59: aload #5
    //   61: invokevirtual processReferenceSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   64: aload_2
    //   65: ifnonnull -> 74
    //   68: aload_0
    //   69: aload #5
    //   71: invokevirtual processSchemaType : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   74: aload_2
    //   75: ifnonnull -> 28
    //   78: aload_1
    //   79: invokevirtual getOneOf : ()Ljava/util/List;
    //   82: ifnull -> 175
    //   85: aload_1
    //   86: invokevirtual getOneOf : ()Ljava/util/List;
    //   89: astore_3
    //   90: aload_3
    //   91: ifnull -> 175
    //   94: aload_3
    //   95: invokeinterface iterator : ()Ljava/util/Iterator;
    //   100: astore #4
    //   102: aload #4
    //   104: invokeinterface hasNext : ()Z
    //   109: ifeq -> 175
    //   112: aload #4
    //   114: invokeinterface next : ()Ljava/lang/Object;
    //   119: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   122: astore #5
    //   124: aload #5
    //   126: invokevirtual get$ref : ()Ljava/lang/String;
    //   129: ifnull -> 165
    //   132: aload #5
    //   134: invokevirtual get$ref : ()Ljava/lang/String;
    //   137: astore #6
    //   139: aload_0
    //   140: aload #5
    //   142: invokevirtual processReferenceSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   145: aload #5
    //   147: invokevirtual get$ref : ()Ljava/lang/String;
    //   150: astore #7
    //   152: aload_0
    //   153: aload_1
    //   154: aload #6
    //   156: aload #7
    //   158: invokevirtual changeDiscriminatorMapping : (Lnet/portswigger/swagger/v3/oas/models/media/ComposedSchema;Ljava/lang/String;Ljava/lang/String;)V
    //   161: aload_2
    //   162: ifnonnull -> 171
    //   165: aload_0
    //   166: aload #5
    //   168: invokevirtual processSchemaType : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   171: aload_2
    //   172: ifnonnull -> 102
    //   175: aload_1
    //   176: invokevirtual getAnyOf : ()Ljava/util/List;
    //   179: ifnull -> 249
    //   182: aload_1
    //   183: invokevirtual getAnyOf : ()Ljava/util/List;
    //   186: astore_3
    //   187: aload_3
    //   188: ifnull -> 249
    //   191: aload_3
    //   192: invokeinterface iterator : ()Ljava/util/Iterator;
    //   197: astore #4
    //   199: aload #4
    //   201: invokeinterface hasNext : ()Z
    //   206: ifeq -> 249
    //   209: aload #4
    //   211: invokeinterface next : ()Ljava/lang/Object;
    //   216: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   219: astore #5
    //   221: aload #5
    //   223: invokevirtual get$ref : ()Ljava/lang/String;
    //   226: ifnull -> 239
    //   229: aload_0
    //   230: aload #5
    //   232: invokevirtual processReferenceSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   235: aload_2
    //   236: ifnonnull -> 245
    //   239: aload_0
    //   240: aload #5
    //   242: invokevirtual processSchemaType : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   245: aload_2
    //   246: ifnonnull -> 199
    //   249: return
  }
  
  private void changeDiscriminatorMapping(ComposedSchema paramComposedSchema, String paramString1, String paramString2) {
    Discriminator discriminator = paramComposedSchema.getDiscriminator();
    if (!paramString1.equals(paramString2) && discriminator != null) {
      String str1 = RefUtils.computeDefinitionName(paramString1);
      String str2 = RefUtils.computeDefinitionName(paramString2);
      String str3 = null;
      if (discriminator.getMapping() != null) {
        for (String str : discriminator.getMapping().keySet()) {
          if (paramString1.equals(discriminator.getMapping().get(str))) {
            str3 = str;
            break;
          } 
        } 
        if (str3 != null)
          discriminator.getMapping().put(str3, paramString2); 
      } 
      if (str3 == null && !str1.equals(str2)) {
        if (discriminator.getMapping() == null)
          discriminator.setMapping(new HashMap<>()); 
        discriminator.getMapping().put(str1, paramString2);
      } 
    } 
  }
  
  public void processArraySchema(ArraySchema paramArraySchema) {
    Schema schema = paramArraySchema.getItems();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (schema != null && schema.get$ref() != null) {
      processReferenceSchema(schema);
      if (arrayOfZbqc == null) {
        processSchemaType(schema);
        return;
      } 
      return;
    } 
    processSchemaType(schema);
  }
  
  private void processReferenceSchema(Schema paramSchema) {
    RefFormat refFormat = RefUtils.computeRefFormat(paramSchema.get$ref());
    String str = paramSchema.get$ref();
    if (RefUtils.isAnExternalRefFormat(refFormat)) {
      String str1 = this.externalRefProcessor.processRefToExternalSchema(str, refFormat);
      if (str1 != null)
        paramSchema.set$ref(RefType.SCHEMAS.getInternalPrefix() + RefType.SCHEMAS.getInternalPrefix()); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\processors\SchemaProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */