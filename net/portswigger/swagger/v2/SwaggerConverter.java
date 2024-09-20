package net.portswigger.swagger.v2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import net.portswigger.swagger.StringUtils;
import net.portswigger.swagger.v1.models.Contact;
import net.portswigger.swagger.v1.models.ExternalDocs;
import net.portswigger.swagger.v1.models.Info;
import net.portswigger.swagger.v1.models.License;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.Operation;
import net.portswigger.swagger.v1.models.Path;
import net.portswigger.swagger.v1.models.RefModel;
import net.portswigger.swagger.v1.models.Response;
import net.portswigger.swagger.v1.models.Scheme;
import net.portswigger.swagger.v1.models.SecurityRequirement;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.models.Tag;
import net.portswigger.swagger.v1.models.auth.ApiKeyAuthDefinition;
import net.portswigger.swagger.v1.models.auth.AuthorizationValue;
import net.portswigger.swagger.v1.models.auth.SecuritySchemeDefinition;
import net.portswigger.swagger.v1.models.parameters.BodyParameter;
import net.portswigger.swagger.v1.models.parameters.Parameter;
import net.portswigger.swagger.v1.models.parameters.RefParameter;
import net.portswigger.swagger.v1.models.parameters.SerializableParameter;
import net.portswigger.swagger.v1.models.properties.ComposedProperty;
import net.portswigger.swagger.v1.models.properties.Property;
import net.portswigger.swagger.v1.models.properties.RefProperty;
import net.portswigger.swagger.v1.parser.SwaggerParser;
import net.portswigger.swagger.v1.parser.SwaggerResolver;
import net.portswigger.swagger.v1.parser.util.SwaggerDeserializationResult;
import net.portswigger.swagger.v2.util.Json;
import net.portswigger.swagger.v2.util.ResolverFully;
import net.portswigger.swagger.v3.oas.models.Components;
import net.portswigger.swagger.v3.oas.models.ExternalDocumentation;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.Operation;
import net.portswigger.swagger.v3.oas.models.PathItem;
import net.portswigger.swagger.v3.oas.models.Paths;
import net.portswigger.swagger.v3.oas.models.headers.Header;
import net.portswigger.swagger.v3.oas.models.info.Contact;
import net.portswigger.swagger.v3.oas.models.info.Info;
import net.portswigger.swagger.v3.oas.models.info.License;
import net.portswigger.swagger.v3.oas.models.media.Content;
import net.portswigger.swagger.v3.oas.models.media.MediaType;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.oas.models.parameters.RequestBody;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponse;
import net.portswigger.swagger.v3.oas.models.security.SecurityRequirement;
import net.portswigger.swagger.v3.oas.models.security.SecurityScheme;
import net.portswigger.swagger.v3.oas.models.servers.Server;
import net.portswigger.swagger.v3.oas.models.tags.Tag;
import net.portswigger.swagger.v3.parser.OpenAPIV3Parser;
import net.portswigger.swagger.v3.parser.Yaml;
import net.portswigger.swagger.v3.parser.core.models.AuthorizationValue;

public class SwaggerConverter {
  private final List<String> globalConsumes = new ArrayList<>();
  
  private final List<String> globalProduces = new ArrayList<>();
  
  private final Components components = new Components();
  
  private final Map<String, Parameter> globalV2Parameters = new HashMap<>();
  
  private static final String[] a;
  
  private static final String[] b;
  
  public ConversionResult convertToV3(String paramString) {
    SwaggerParseResult swaggerParseResult = readContents(paramString, null, null);
    OpenAPI openAPI = swaggerParseResult.getOpenAPI();
    String str = (openAPI == null) ? null : Json.pretty(openAPI);
    return new ConversionResult(str, swaggerParseResult.getMessages(), swaggerParseResult.isValid());
  }
  
  private SwaggerParseResult readContents(String paramString, List<AuthorizationValue> paramList, ParseOptions paramParseOptions) {
    SwaggerDeserializationResult swaggerDeserializationResult = (new SwaggerParser()).readWithInfo(paramString, (paramParseOptions == null) ? true : paramParseOptions.isResolve());
    if (paramParseOptions != null && paramParseOptions.isResolve()) {
      Swagger swagger = (new SwaggerResolver(swaggerDeserializationResult.getSwagger(), convert(paramList))).resolve();
      swaggerDeserializationResult.setSwagger(swagger);
    } 
    return readResult(swaggerDeserializationResult, paramList, paramParseOptions);
  }
  
  private SwaggerParseResult readResult(SwaggerDeserializationResult paramSwaggerDeserializationResult, List<AuthorizationValue> paramList, ParseOptions paramParseOptions) {
    SwaggerParseResult swaggerParseResult = convert(paramSwaggerDeserializationResult);
    String[] arrayOfString = ParseOptions.ZG();
    try {
      if (swaggerParseResult != null)
        try {
          if (swaggerParseResult.getOpenAPI() != null)
            try {
              if (paramParseOptions != null) {
                try {
                  if (paramParseOptions.isResolveFully())
                    (new ResolverFully(paramParseOptions.isResolveCombinators())).resolveFully(swaggerParseResult.getOpenAPI()); 
                } catch (Exception exception) {
                  throw a(null);
                } 
                if (paramParseOptions.isFlatten())
                  try {
                    SwaggerParseResult swaggerParseResult1 = (new OpenAPIV3Parser()).readContents(Yaml.pretty(swaggerParseResult.getOpenAPI()), paramList, paramParseOptions);
                    try {
                      swaggerParseResult.setOpenAPI(swaggerParseResult1.getOpenAPI());
                      if (swaggerParseResult.getMessages() != null) {
                        try {
                          swaggerParseResult.getMessages().addAll(swaggerParseResult1.getMessages());
                          swaggerParseResult.messages((List<String>)swaggerParseResult.getMessages().stream().distinct().collect(Collectors.toList()));
                          if (arrayOfString != null)
                            swaggerParseResult.messages(swaggerParseResult1.getMessages()); 
                        } catch (Exception exception) {
                          throw a(null);
                        } 
                        return swaggerParseResult;
                      } 
                    } catch (Exception exception) {
                      throw a(null);
                    } 
                    swaggerParseResult.messages(swaggerParseResult1.getMessages());
                  } catch (Exception exception) {} 
              } 
            } catch (Exception exception) {
              throw a(null);
            }  
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    return swaggerParseResult;
  }
  
  private List<AuthorizationValue> convert(List<AuthorizationValue> paramList) {
    ArrayList<AuthorizationValue> arrayList = new ArrayList();
    String[] arrayOfString = ParseOptions.ZG();
    if (paramList != null)
      for (AuthorizationValue authorizationValue : paramList) {
        AuthorizationValue authorizationValue1 = new AuthorizationValue();
        authorizationValue1.setType(authorizationValue.getType());
        authorizationValue1.setValue(authorizationValue.getValue());
        authorizationValue1.setKeyName(authorizationValue.getKeyName());
        arrayList.add(authorizationValue1);
        if (arrayOfString != null)
          break; 
      }  
    return arrayList;
  }
  
  private SwaggerParseResult convert(SwaggerDeserializationResult paramSwaggerDeserializationResult) {
    String[] arrayOfString = ParseOptions.ZG();
    if (paramSwaggerDeserializationResult == null)
      return null; 
    SwaggerParseResult swaggerParseResult = (new SwaggerParseResult()).messages(paramSwaggerDeserializationResult.getMessages());
    swaggerParseResult.setValid(paramSwaggerDeserializationResult.isValid());
    if (paramSwaggerDeserializationResult.getSwagger() == null)
      return swaggerParseResult; 
    OpenAPI openAPI = new OpenAPI();
    SwaggerInventory swaggerInventory = (new SwaggerInventory()).process(paramSwaggerDeserializationResult.getSwagger());
    Swagger swagger = paramSwaggerDeserializationResult.getSwagger();
    if (swagger.getVendorExtensions() != null)
      openAPI.setExtensions(convert(swagger.getVendorExtensions())); 
    openAPI.addExtension(a(17618, -12224), swagger.getSwagger());
    if (swagger.getExternalDocs() != null)
      openAPI.setExternalDocs(convert(swagger.getExternalDocs())); 
    if (swagger.getInfo() != null)
      openAPI.setInfo(convert(swagger.getInfo())); 
    openAPI.setServers(convert(swagger.getSchemes(), swagger.getHost(), swagger.getBasePath()));
    if (swagger.getTags() != null)
      openAPI.setTags(convertTags(swagger.getTags())); 
    if (swagger.getConsumes() != null)
      this.globalConsumes.addAll(swagger.getConsumes()); 
    if (swagger.getProduces() != null)
      this.globalProduces.addAll(swagger.getProduces()); 
    if (swagger.getSecurity() != null && swagger.getSecurity().size() > 0)
      openAPI.setSecurity(convertSecurityRequirements(swagger.getSecurity())); 
    List<Model> list = swaggerInventory.getModels();
    for (Model model : list) {
      if (model instanceof RefModel) {
        RefModel refModel = (RefModel)model;
        if (refModel.get$ref().indexOf(a(17622, 25721)) == 0) {
          String str = a(17643, -13821) + a(17643, -13821);
          refModel.set$ref(str);
        } 
      } 
      if (arrayOfString != null)
        break; 
    } 
    for (Property property : swaggerInventory.getProperties()) {
      if (property instanceof RefProperty) {
        RefProperty refProperty = (RefProperty)property;
        if (refProperty.get$ref().indexOf(a(17625, -30735)) == 0) {
          String str = a(17615, -22862) + a(17615, -22862);
          refProperty.set$ref(str);
        } 
      } 
      if (property instanceof ComposedProperty) {
        ComposedProperty composedProperty = (ComposedProperty)property;
        if (composedProperty.getAllOf() != null)
          for (Property property1 : composedProperty.getAllOf()) {
            if (property1 instanceof RefProperty) {
              RefProperty refProperty = (RefProperty)property1;
              if (refProperty.get$ref().indexOf(a(17625, -30735)) == 0) {
                String str = a(17615, -22862) + a(17615, -22862);
                refProperty.set$ref(str);
              } 
            } 
            if (arrayOfString != null)
              break; 
          }  
      } 
      if (arrayOfString != null)
        break; 
    } 
    if (swagger.getParameters() != null) {
      this.globalV2Parameters.putAll(swagger.getParameters());
      swagger.getParameters().forEach(this::lambda$convert$0);
    } 
    Paths paths = new Paths();
    Map map = Optional.<Map>ofNullable(swagger.getPaths()).orElse(new HashMap<>());
    for (String str : map.keySet()) {
      Path path = swagger.getPath(str);
      PathItem pathItem = convert(path);
      paths.put(str, pathItem);
      if (arrayOfString != null)
        break; 
    } 
    openAPI.setPaths(paths);
    if (swagger.getResponses() != null)
      swagger.getResponses().forEach(this::lambda$convert$1); 
    if (swagger.getDefinitions() != null)
      for (String str : swagger.getDefinitions().keySet()) {
        Model model = (Model)swagger.getDefinitions().get(str);
        Schema schema = convert(model);
        this.components.addSchemas(str, schema);
        if (arrayOfString != null)
          break; 
      }  
    if (swagger.getSecurityDefinitions() != null)
      swagger.getSecurityDefinitions().forEach(this::lambda$convert$2); 
    openAPI.setComponents(this.components);
    swaggerParseResult.setOpenAPI(openAPI);
    return swaggerParseResult;
  }
  
  private List<SecurityRequirement> convertSecurityRequirements(List<SecurityRequirement> paramList) {
    ArrayList<SecurityRequirement> arrayList = new ArrayList();
    Iterator<SecurityRequirement> iterator = paramList.iterator();
    String[] arrayOfString = ParseOptions.ZG();
    while (iterator.hasNext()) {
      SecurityRequirement securityRequirement = iterator.next();
      SecurityRequirement securityRequirement1 = new SecurityRequirement();
      Objects.requireNonNull(securityRequirement1);
      securityRequirement.getRequirements().forEach(securityRequirement1::addList);
      arrayList.add(securityRequirement1);
      if (arrayOfString != null)
        break; 
    } 
    return arrayList;
  }
  
  private List<SecurityRequirement> convertSecurityRequirementsMap(List<Map<String, List<String>>> paramList) {
    ArrayList<SecurityRequirement> arrayList = new ArrayList();
    Iterator<Map<String, List<String>>> iterator = paramList.iterator();
    String[] arrayOfString = ParseOptions.ZG();
    while (iterator.hasNext()) {
      Map map = iterator.next();
      SecurityRequirement securityRequirement = new SecurityRequirement();
      Objects.requireNonNull(securityRequirement);
      map.forEach(securityRequirement::addList);
      arrayList.add(securityRequirement);
      if (arrayOfString != null)
        break; 
    } 
    return arrayList;
  }
  
  private SecurityScheme convert(SecuritySchemeDefinition paramSecuritySchemeDefinition) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface getType : ()Ljava/lang/String;
    //   6: astore #4
    //   8: invokestatic ZG : ()[Ljava/lang/String;
    //   11: iconst_m1
    //   12: istore #5
    //   14: astore_2
    //   15: aload #4
    //   17: invokevirtual hashCode : ()I
    //   20: lookupswitch default -> 124, -1411301915 -> 80, -1023949701 -> 104, 93508654 -> 56
    //   56: aload #4
    //   58: sipush #17621
    //   61: sipush #-16479
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: invokevirtual equals : (Ljava/lang/Object;)Z
    //   70: ifeq -> 124
    //   73: iconst_0
    //   74: istore #5
    //   76: aload_2
    //   77: ifnull -> 124
    //   80: aload #4
    //   82: sipush #17660
    //   85: sipush #8675
    //   88: invokestatic a : (II)Ljava/lang/String;
    //   91: invokevirtual equals : (Ljava/lang/Object;)Z
    //   94: ifeq -> 124
    //   97: iconst_1
    //   98: istore #5
    //   100: aload_2
    //   101: ifnull -> 124
    //   104: aload #4
    //   106: sipush #17633
    //   109: sipush #25864
    //   112: invokestatic a : (II)Ljava/lang/String;
    //   115: invokevirtual equals : (Ljava/lang/Object;)Z
    //   118: ifeq -> 124
    //   121: iconst_2
    //   122: istore #5
    //   124: iload #5
    //   126: tableswitch default -> 181, 0 -> 152, 1 -> 161, 2 -> 171
    //   152: aload_0
    //   153: invokevirtual createBasicSecurityScheme : ()Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme;
    //   156: astore_3
    //   157: aload_2
    //   158: ifnull -> 189
    //   161: aload_0
    //   162: aload_1
    //   163: invokevirtual convertApiKeySecurityScheme : (Lnet/portswigger/swagger/v1/models/auth/SecuritySchemeDefinition;)Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme;
    //   166: astore_3
    //   167: aload_2
    //   168: ifnull -> 189
    //   171: aload_0
    //   172: aload_1
    //   173: invokevirtual convertOauth2SecurityScheme : (Lnet/portswigger/swagger/v1/models/auth/SecuritySchemeDefinition;)Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme;
    //   176: astore_3
    //   177: aload_2
    //   178: ifnull -> 189
    //   181: new net/portswigger/swagger/v3/oas/models/security/SecurityScheme
    //   184: dup
    //   185: invokespecial <init> : ()V
    //   188: astore_3
    //   189: aload_3
    //   190: aload_1
    //   191: invokeinterface getDescription : ()Ljava/lang/String;
    //   196: invokevirtual setDescription : (Ljava/lang/String;)V
    //   199: aload_3
    //   200: aload_0
    //   201: aload_1
    //   202: invokeinterface getVendorExtensions : ()Ljava/util/Map;
    //   207: invokevirtual convert : (Ljava/util/Map;)Ljava/util/Map;
    //   210: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   213: aload_3
    //   214: areturn
  }
  
  private SecurityScheme convertOauth2SecurityScheme(SecuritySchemeDefinition paramSecuritySchemeDefinition) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: new net/portswigger/swagger/v3/oas/models/security/SecurityScheme
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_3
    //   11: aload_1
    //   12: checkcast net/portswigger/swagger/v1/models/auth/OAuth2Definition
    //   15: astore #4
    //   17: new net/portswigger/swagger/v3/oas/models/security/OAuthFlows
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: astore #5
    //   26: astore_2
    //   27: new net/portswigger/swagger/v3/oas/models/security/OAuthFlow
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: astore #6
    //   36: aload_3
    //   37: getstatic net/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type.OAUTH2 : Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;
    //   40: invokevirtual setType : (Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;)V
    //   43: aload #4
    //   45: invokevirtual getFlow : ()Ljava/lang/String;
    //   48: astore #7
    //   50: aload #7
    //   52: ifnull -> 322
    //   55: aload #7
    //   57: astore #8
    //   59: iconst_m1
    //   60: istore #9
    //   62: aload #8
    //   64: invokevirtual hashCode : ()I
    //   67: lookupswitch default -> 200, -1142520463 -> 180, -425423387 -> 108, 1216985755 -> 132, 1554253136 -> 156
    //   108: aload #8
    //   110: sipush #17635
    //   113: sipush #-30207
    //   116: invokestatic a : (II)Ljava/lang/String;
    //   119: invokevirtual equals : (Ljava/lang/Object;)Z
    //   122: ifeq -> 200
    //   125: iconst_0
    //   126: istore #9
    //   128: aload_2
    //   129: ifnull -> 200
    //   132: aload #8
    //   134: sipush #17653
    //   137: sipush #-17088
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: invokevirtual equals : (Ljava/lang/Object;)Z
    //   146: ifeq -> 200
    //   149: iconst_1
    //   150: istore #9
    //   152: aload_2
    //   153: ifnull -> 200
    //   156: aload #8
    //   158: sipush #17628
    //   161: sipush #21950
    //   164: invokestatic a : (II)Ljava/lang/String;
    //   167: invokevirtual equals : (Ljava/lang/Object;)Z
    //   170: ifeq -> 200
    //   173: iconst_2
    //   174: istore #9
    //   176: aload_2
    //   177: ifnull -> 200
    //   180: aload #8
    //   182: sipush #17609
    //   185: sipush #7860
    //   188: invokestatic a : (II)Ljava/lang/String;
    //   191: invokevirtual equals : (Ljava/lang/Object;)Z
    //   194: ifeq -> 200
    //   197: iconst_3
    //   198: istore #9
    //   200: iload #9
    //   202: tableswitch default -> 322, 0 -> 232, 1 -> 253, 2 -> 274, 3 -> 295
    //   232: aload #6
    //   234: aload #4
    //   236: invokevirtual getAuthorizationUrl : ()Ljava/lang/String;
    //   239: invokevirtual setAuthorizationUrl : (Ljava/lang/String;)V
    //   242: aload #5
    //   244: aload #6
    //   246: invokevirtual setImplicit : (Lnet/portswigger/swagger/v3/oas/models/security/OAuthFlow;)V
    //   249: aload_2
    //   250: ifnull -> 322
    //   253: aload #6
    //   255: aload #4
    //   257: invokevirtual getTokenUrl : ()Ljava/lang/String;
    //   260: invokevirtual setTokenUrl : (Ljava/lang/String;)V
    //   263: aload #5
    //   265: aload #6
    //   267: invokevirtual setPassword : (Lnet/portswigger/swagger/v3/oas/models/security/OAuthFlow;)V
    //   270: aload_2
    //   271: ifnull -> 322
    //   274: aload #6
    //   276: aload #4
    //   278: invokevirtual getTokenUrl : ()Ljava/lang/String;
    //   281: invokevirtual setTokenUrl : (Ljava/lang/String;)V
    //   284: aload #5
    //   286: aload #6
    //   288: invokevirtual setClientCredentials : (Lnet/portswigger/swagger/v3/oas/models/security/OAuthFlow;)V
    //   291: aload_2
    //   292: ifnull -> 322
    //   295: aload #6
    //   297: aload #4
    //   299: invokevirtual getAuthorizationUrl : ()Ljava/lang/String;
    //   302: invokevirtual setAuthorizationUrl : (Ljava/lang/String;)V
    //   305: aload #6
    //   307: aload #4
    //   309: invokevirtual getTokenUrl : ()Ljava/lang/String;
    //   312: invokevirtual setTokenUrl : (Ljava/lang/String;)V
    //   315: aload #5
    //   317: aload #6
    //   319: invokevirtual setAuthorizationCode : (Lnet/portswigger/swagger/v3/oas/models/security/OAuthFlow;)V
    //   322: new net/portswigger/swagger/v3/oas/models/security/Scopes
    //   325: dup
    //   326: invokespecial <init> : ()V
    //   329: astore #8
    //   331: aload #4
    //   333: invokevirtual getScopes : ()Ljava/util/Map;
    //   336: astore #9
    //   338: aload #9
    //   340: ifnull -> 362
    //   343: aload #9
    //   345: aload #8
    //   347: dup
    //   348: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   351: pop
    //   352: <illegal opcode> accept : (Lnet/portswigger/swagger/v3/oas/models/security/Scopes;)Ljava/util/function/BiConsumer;
    //   357: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   362: aload #6
    //   364: aload #8
    //   366: invokevirtual setScopes : (Lnet/portswigger/swagger/v3/oas/models/security/Scopes;)V
    //   369: aload_3
    //   370: aload #5
    //   372: invokevirtual setFlows : (Lnet/portswigger/swagger/v3/oas/models/security/OAuthFlows;)V
    //   375: aload_3
    //   376: areturn
  }
  
  private SecurityScheme convertApiKeySecurityScheme(SecuritySchemeDefinition paramSecuritySchemeDefinition) {
    SecurityScheme securityScheme = new SecurityScheme();
    ApiKeyAuthDefinition apiKeyAuthDefinition = (ApiKeyAuthDefinition)paramSecuritySchemeDefinition;
    securityScheme.setType(SecurityScheme.Type.APIKEY);
    securityScheme.setName(apiKeyAuthDefinition.getName());
    securityScheme.setIn(SecurityScheme.In.valueOf(apiKeyAuthDefinition.getIn().toString()));
    return securityScheme;
  }
  
  private SecurityScheme createBasicSecurityScheme() {
    SecurityScheme securityScheme = new SecurityScheme();
    securityScheme.setType(SecurityScheme.Type.HTTP);
    securityScheme.setScheme(a(17656, -19511));
    return securityScheme;
  }
  
  private List<Tag> convertTags(List<Tag> paramList) {
    ArrayList<Tag> arrayList = new ArrayList();
    Iterator<Tag> iterator = paramList.iterator();
    String[] arrayOfString = ParseOptions.ZG();
    while (iterator.hasNext()) {
      Tag tag = iterator.next();
      Tag tag1 = new Tag();
      tag1.setDescription(tag.getDescription());
      tag1.setName(tag.getName());
      if (tag.getExternalDocs() != null)
        tag1.setExternalDocs(convert(tag.getExternalDocs())); 
      Map<String, Object> map = convert(tag.getVendorExtensions());
      if (map != null)
        tag1.setExtensions(map); 
      arrayList.add(tag1);
      if (arrayOfString != null)
        break; 
    } 
    return arrayList;
  }
  
  private ExternalDocumentation convert(ExternalDocs paramExternalDocs) {
    ExternalDocumentation externalDocumentation = new ExternalDocumentation();
    externalDocumentation.setUrl(paramExternalDocs.getUrl());
    externalDocumentation.setDescription(paramExternalDocs.getDescription());
    Map<String, Object> map = convert(paramExternalDocs.getVendorExtensions());
    if (map != null && map.size() > 0)
      externalDocumentation.setExtensions(map); 
    return externalDocumentation;
  }
  
  private List<Server> convert(List<Scheme> paramList, String paramString1, String paramString2) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: new java/util/ArrayList
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore #5
    //   12: astore #4
    //   14: aload_3
    //   15: invokestatic isEmpty : (Ljava/lang/String;)Z
    //   18: ifne -> 29
    //   21: aload_3
    //   22: astore #6
    //   24: aload #4
    //   26: ifnull -> 33
    //   29: ldc '/'
    //   31: astore #6
    //   33: aload_2
    //   34: invokestatic isEmpty : (Ljava/lang/String;)Z
    //   37: ifne -> 50
    //   40: aload_2
    //   41: aload #6
    //   43: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   48: astore #6
    //   50: aload #6
    //   52: ldc '/'
    //   54: invokestatic startsWith : (Ljava/lang/String;Ljava/lang/String;)Z
    //   57: ifne -> 159
    //   60: aload_1
    //   61: ifnull -> 159
    //   64: aload_1
    //   65: invokeinterface isEmpty : ()Z
    //   70: ifne -> 159
    //   73: aload_1
    //   74: invokeinterface iterator : ()Ljava/util/Iterator;
    //   79: astore #7
    //   81: aload #7
    //   83: invokeinterface hasNext : ()Z
    //   88: ifeq -> 154
    //   91: aload #7
    //   93: invokeinterface next : ()Ljava/lang/Object;
    //   98: checkcast net/portswigger/swagger/v1/models/Scheme
    //   101: astore #8
    //   103: new net/portswigger/swagger/v3/oas/models/servers/Server
    //   106: dup
    //   107: invokespecial <init> : ()V
    //   110: astore #9
    //   112: aload #9
    //   114: aload #8
    //   116: invokevirtual toValue : ()Ljava/lang/String;
    //   119: aload #6
    //   121: sipush #17605
    //   124: sipush #4575
    //   127: invokestatic a : (II)Ljava/lang/String;
    //   130: swap
    //   131: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   136: invokevirtual setUrl : (Ljava/lang/String;)V
    //   139: aload #5
    //   141: aload #9
    //   143: invokeinterface add : (Ljava/lang/Object;)Z
    //   148: pop
    //   149: aload #4
    //   151: ifnull -> 81
    //   154: aload #4
    //   156: ifnull -> 224
    //   159: aload #6
    //   161: ldc '/'
    //   163: invokestatic startsWith : (Ljava/lang/String;Ljava/lang/String;)Z
    //   166: ifne -> 198
    //   169: ldc '/'
    //   171: aload #6
    //   173: invokevirtual equals : (Ljava/lang/Object;)Z
    //   176: ifne -> 198
    //   179: aload #6
    //   181: sipush #17654
    //   184: sipush #31666
    //   187: invokestatic a : (II)Ljava/lang/String;
    //   190: swap
    //   191: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   196: astore #6
    //   198: new net/portswigger/swagger/v3/oas/models/servers/Server
    //   201: dup
    //   202: invokespecial <init> : ()V
    //   205: astore #7
    //   207: aload #7
    //   209: aload #6
    //   211: invokevirtual setUrl : (Ljava/lang/String;)V
    //   214: aload #5
    //   216: aload #7
    //   218: invokeinterface add : (Ljava/lang/Object;)Z
    //   223: pop
    //   224: aload #5
    //   226: areturn
  }
  
  private Info convert(Info paramInfo) {
    Info info = new Info();
    info.setContact(convert(paramInfo.getContact()));
    info.setDescription(paramInfo.getDescription());
    info.setLicense(convert(paramInfo.getLicense()));
    info.setTermsOfService(paramInfo.getTermsOfService());
    info.setTitle(paramInfo.getTitle());
    info.setVersion(paramInfo.getVersion());
    info.setExtensions(convert(paramInfo.getVendorExtensions()));
    return info;
  }
  
  private License convert(License paramLicense) {
    if (paramLicense == null)
      return null; 
    License license = new License();
    license.setExtensions(convert(paramLicense.getVendorExtensions()));
    license.setName(paramLicense.getName());
    license.setUrl(paramLicense.getUrl());
    return license;
  }
  
  private Contact convert(Contact paramContact) {
    if (paramContact == null)
      return null; 
    Contact contact = new Contact();
    contact.setUrl(paramContact.getUrl());
    contact.setName(paramContact.getName());
    contact.setEmail(paramContact.getEmail());
    return contact;
  }
  
  private PathItem convert(Path paramPath) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: new net/portswigger/swagger/v3/oas/models/PathItem
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_3
    //   11: astore_2
    //   12: aload_1
    //   13: instanceof net/portswigger/swagger/v1/models/RefPath
    //   16: ifeq -> 34
    //   19: aload_3
    //   20: aload_1
    //   21: checkcast net/portswigger/swagger/v1/models/RefPath
    //   24: invokevirtual get$ref : ()Ljava/lang/String;
    //   27: invokevirtual set$ref : (Ljava/lang/String;)V
    //   30: aload_2
    //   31: ifnull -> 248
    //   34: aload_1
    //   35: invokevirtual getParameters : ()Ljava/util/List;
    //   38: ifnull -> 89
    //   41: aload_1
    //   42: invokevirtual getParameters : ()Ljava/util/List;
    //   45: invokeinterface iterator : ()Ljava/util/Iterator;
    //   50: astore #4
    //   52: aload #4
    //   54: invokeinterface hasNext : ()Z
    //   59: ifeq -> 89
    //   62: aload #4
    //   64: invokeinterface next : ()Ljava/lang/Object;
    //   69: checkcast net/portswigger/swagger/v1/models/parameters/Parameter
    //   72: astore #5
    //   74: aload_3
    //   75: aload_0
    //   76: aload #5
    //   78: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/parameters/Parameter;)Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter;
    //   81: invokevirtual addParametersItem : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter;)Lnet/portswigger/swagger/v3/oas/models/PathItem;
    //   84: pop
    //   85: aload_2
    //   86: ifnull -> 52
    //   89: aload_1
    //   90: invokevirtual getGet : ()Lnet/portswigger/swagger/v1/models/Operation;
    //   93: astore #4
    //   95: aload #4
    //   97: ifnull -> 110
    //   100: aload_3
    //   101: aload_0
    //   102: aload #4
    //   104: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/Operation;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   107: invokevirtual setGet : (Lnet/portswigger/swagger/v3/oas/models/Operation;)V
    //   110: aload_1
    //   111: invokevirtual getPut : ()Lnet/portswigger/swagger/v1/models/Operation;
    //   114: astore #4
    //   116: aload #4
    //   118: ifnull -> 131
    //   121: aload_3
    //   122: aload_0
    //   123: aload #4
    //   125: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/Operation;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   128: invokevirtual setPut : (Lnet/portswigger/swagger/v3/oas/models/Operation;)V
    //   131: aload_1
    //   132: invokevirtual getPost : ()Lnet/portswigger/swagger/v1/models/Operation;
    //   135: astore #4
    //   137: aload #4
    //   139: ifnull -> 152
    //   142: aload_3
    //   143: aload_0
    //   144: aload #4
    //   146: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/Operation;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   149: invokevirtual setPost : (Lnet/portswigger/swagger/v3/oas/models/Operation;)V
    //   152: aload_1
    //   153: invokevirtual getPatch : ()Lnet/portswigger/swagger/v1/models/Operation;
    //   156: astore #4
    //   158: aload #4
    //   160: ifnull -> 173
    //   163: aload_3
    //   164: aload_0
    //   165: aload #4
    //   167: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/Operation;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   170: invokevirtual setPatch : (Lnet/portswigger/swagger/v3/oas/models/Operation;)V
    //   173: aload_1
    //   174: invokevirtual getDelete : ()Lnet/portswigger/swagger/v1/models/Operation;
    //   177: astore #4
    //   179: aload #4
    //   181: ifnull -> 194
    //   184: aload_3
    //   185: aload_0
    //   186: aload #4
    //   188: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/Operation;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   191: invokevirtual setDelete : (Lnet/portswigger/swagger/v3/oas/models/Operation;)V
    //   194: aload_1
    //   195: invokevirtual getHead : ()Lnet/portswigger/swagger/v1/models/Operation;
    //   198: astore #4
    //   200: aload #4
    //   202: ifnull -> 215
    //   205: aload_3
    //   206: aload_0
    //   207: aload #4
    //   209: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/Operation;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   212: invokevirtual setHead : (Lnet/portswigger/swagger/v3/oas/models/Operation;)V
    //   215: aload_1
    //   216: invokevirtual getOptions : ()Lnet/portswigger/swagger/v1/models/Operation;
    //   219: astore #4
    //   221: aload #4
    //   223: ifnull -> 236
    //   226: aload_3
    //   227: aload_0
    //   228: aload #4
    //   230: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/Operation;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   233: invokevirtual setOptions : (Lnet/portswigger/swagger/v3/oas/models/Operation;)V
    //   236: aload_3
    //   237: aload_0
    //   238: aload_1
    //   239: invokevirtual getVendorExtensions : ()Ljava/util/Map;
    //   242: invokevirtual convert : (Ljava/util/Map;)Ljava/util/Map;
    //   245: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   248: aload_3
    //   249: areturn
  }
  
  private boolean isRefABodyParam(Parameter paramParameter) {
    if (paramParameter instanceof RefParameter) {
      RefParameter refParameter = (RefParameter)paramParameter;
      String str = refParameter.getSimpleRef();
      Parameter parameter = this.globalV2Parameters.get(str);
      return a(17617, -30107).equals(parameter.getIn());
    } 
    return false;
  }
  
  private boolean isRefAFormParam(Parameter paramParameter) {
    if (paramParameter instanceof RefParameter) {
      RefParameter refParameter = (RefParameter)paramParameter;
      String str = refParameter.getSimpleRef();
      Parameter parameter = this.globalV2Parameters.get(str);
      return a(17620, 11462).equals(parameter.getIn());
    } 
    return false;
  }
  
  private Operation convert(Operation paramOperation) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: new net/portswigger/swagger/v3/oas/models/Operation
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_3
    //   11: astore_2
    //   12: aload_1
    //   13: invokevirtual getDescription : ()Ljava/lang/String;
    //   16: invokestatic isBlank : (Ljava/lang/String;)Z
    //   19: ifne -> 30
    //   22: aload_3
    //   23: aload_1
    //   24: invokevirtual getDescription : ()Ljava/lang/String;
    //   27: invokevirtual setDescription : (Ljava/lang/String;)V
    //   30: aload_1
    //   31: invokevirtual getSummary : ()Ljava/lang/String;
    //   34: invokestatic isBlank : (Ljava/lang/String;)Z
    //   37: ifne -> 48
    //   40: aload_3
    //   41: aload_1
    //   42: invokevirtual getSummary : ()Ljava/lang/String;
    //   45: invokevirtual setSummary : (Ljava/lang/String;)V
    //   48: aload_3
    //   49: aload_1
    //   50: invokevirtual isDeprecated : ()Ljava/lang/Boolean;
    //   53: invokevirtual setDeprecated : (Ljava/lang/Boolean;)V
    //   56: aload_3
    //   57: aload_1
    //   58: invokevirtual getOperationId : ()Ljava/lang/String;
    //   61: invokevirtual setOperationId : (Ljava/lang/String;)V
    //   64: aload_3
    //   65: aload_0
    //   66: aload_1
    //   67: invokevirtual getVendorExtensions : ()Ljava/util/Map;
    //   70: invokevirtual convert : (Ljava/util/Map;)Ljava/util/Map;
    //   73: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   76: aload_3
    //   77: aload_1
    //   78: invokevirtual getTags : ()Ljava/util/List;
    //   81: invokevirtual setTags : (Ljava/util/List;)V
    //   84: aload_1
    //   85: invokevirtual getParameters : ()Ljava/util/List;
    //   88: ifnull -> 395
    //   91: new java/util/ArrayList
    //   94: dup
    //   95: invokespecial <init> : ()V
    //   98: astore #4
    //   100: aload_1
    //   101: invokevirtual getParameters : ()Ljava/util/List;
    //   104: invokeinterface iterator : ()Ljava/util/Iterator;
    //   109: astore #5
    //   111: aload #5
    //   113: invokeinterface hasNext : ()Z
    //   118: ifeq -> 351
    //   121: aload #5
    //   123: invokeinterface next : ()Ljava/lang/Object;
    //   128: checkcast net/portswigger/swagger/v1/models/parameters/Parameter
    //   131: astore #6
    //   133: sipush #17639
    //   136: sipush #-25224
    //   139: invokestatic a : (II)Ljava/lang/String;
    //   142: aload #6
    //   144: invokeinterface getIn : ()Ljava/lang/String;
    //   149: invokevirtual equals : (Ljava/lang/Object;)Z
    //   152: ifeq -> 169
    //   155: aload #4
    //   157: aload #6
    //   159: invokeinterface add : (Ljava/lang/Object;)Z
    //   164: pop
    //   165: aload_2
    //   166: ifnull -> 347
    //   169: sipush #17644
    //   172: sipush #27104
    //   175: invokestatic a : (II)Ljava/lang/String;
    //   178: aload #6
    //   180: invokeinterface getIn : ()Ljava/lang/String;
    //   185: invokevirtual equals : (Ljava/lang/Object;)Z
    //   188: ifeq -> 229
    //   191: aload_3
    //   192: aload_0
    //   193: aload #6
    //   195: aload_1
    //   196: invokevirtual getConsumes : ()Ljava/util/List;
    //   199: invokevirtual convertParameterToRequestBody : (Lnet/portswigger/swagger/v1/models/parameters/Parameter;Ljava/util/List;)Lnet/portswigger/swagger/v3/oas/models/parameters/RequestBody;
    //   202: invokevirtual setRequestBody : (Lnet/portswigger/swagger/v3/oas/models/parameters/RequestBody;)V
    //   205: aload_3
    //   206: sipush #17647
    //   209: sipush #19036
    //   212: invokestatic a : (II)Ljava/lang/String;
    //   215: aload #6
    //   217: invokeinterface getName : ()Ljava/lang/String;
    //   222: invokevirtual addExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   225: aload_2
    //   226: ifnull -> 347
    //   229: aload_0
    //   230: aload #6
    //   232: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/parameters/Parameter;)Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter;
    //   235: astore #7
    //   237: aload #7
    //   239: invokevirtual get$ref : ()Ljava/lang/String;
    //   242: astore #8
    //   244: aload #8
    //   246: ifnull -> 295
    //   249: aload #8
    //   251: sipush #17608
    //   254: sipush #-6023
    //   257: invokestatic a : (II)Ljava/lang/String;
    //   260: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   263: ifeq -> 295
    //   266: aload_0
    //   267: aload #6
    //   269: invokevirtual isRefABodyParam : (Lnet/portswigger/swagger/v1/models/parameters/Parameter;)Z
    //   272: ifeq -> 295
    //   275: aload_3
    //   276: new net/portswigger/swagger/v3/oas/models/parameters/RequestBody
    //   279: dup
    //   280: invokespecial <init> : ()V
    //   283: aload #8
    //   285: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/parameters/RequestBody;
    //   288: invokevirtual setRequestBody : (Lnet/portswigger/swagger/v3/oas/models/parameters/RequestBody;)V
    //   291: aload_2
    //   292: ifnull -> 347
    //   295: aload #8
    //   297: ifnull -> 340
    //   300: aload #8
    //   302: sipush #17624
    //   305: sipush #-32300
    //   308: invokestatic a : (II)Ljava/lang/String;
    //   311: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   314: ifeq -> 340
    //   317: aload_0
    //   318: aload #6
    //   320: invokevirtual isRefAFormParam : (Lnet/portswigger/swagger/v1/models/parameters/Parameter;)Z
    //   323: ifeq -> 340
    //   326: aload #4
    //   328: aload #6
    //   330: invokeinterface add : (Ljava/lang/Object;)Z
    //   335: pop
    //   336: aload_2
    //   337: ifnull -> 347
    //   340: aload_3
    //   341: aload #7
    //   343: invokevirtual addParametersItem : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   346: pop
    //   347: aload_2
    //   348: ifnull -> 111
    //   351: aload #4
    //   353: invokeinterface size : ()I
    //   358: ifle -> 395
    //   361: aload_0
    //   362: aload #4
    //   364: aload_1
    //   365: invokevirtual getConsumes : ()Ljava/util/List;
    //   368: invokevirtual convertFormDataToRequestBody : (Ljava/util/List;Ljava/util/List;)Lnet/portswigger/swagger/v3/oas/models/parameters/RequestBody;
    //   371: astore #5
    //   373: aload #5
    //   375: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   378: aload #5
    //   380: <illegal opcode> accept : (Lnet/portswigger/swagger/v3/oas/models/parameters/RequestBody;)Ljava/util/function/BiConsumer;
    //   385: invokevirtual forEach : (Ljava/util/function/BiConsumer;)V
    //   388: aload_3
    //   389: aload #5
    //   391: invokevirtual requestBody : (Lnet/portswigger/swagger/v3/oas/models/parameters/RequestBody;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   394: pop
    //   395: aload_1
    //   396: invokevirtual getResponses : ()Ljava/util/Map;
    //   399: ifnull -> 506
    //   402: aload_1
    //   403: invokevirtual getResponses : ()Ljava/util/Map;
    //   406: invokeinterface keySet : ()Ljava/util/Set;
    //   411: invokeinterface iterator : ()Ljava/util/Iterator;
    //   416: astore #4
    //   418: aload #4
    //   420: invokeinterface hasNext : ()Z
    //   425: ifeq -> 506
    //   428: aload #4
    //   430: invokeinterface next : ()Ljava/lang/Object;
    //   435: checkcast java/lang/String
    //   438: astore #5
    //   440: aload_1
    //   441: invokevirtual getResponses : ()Ljava/util/Map;
    //   444: aload #5
    //   446: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   451: checkcast net/portswigger/swagger/v1/models/Response
    //   454: astore #6
    //   456: aload_0
    //   457: aload #6
    //   459: aload_1
    //   460: invokevirtual getProduces : ()Ljava/util/List;
    //   463: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/Response;Ljava/util/List;)Lnet/portswigger/swagger/v3/oas/models/responses/ApiResponse;
    //   466: astore #7
    //   468: aload_3
    //   469: invokevirtual getResponses : ()Lnet/portswigger/swagger/v3/oas/models/responses/ApiResponses;
    //   472: astore #8
    //   474: aload #8
    //   476: ifnonnull -> 488
    //   479: new net/portswigger/swagger/v3/oas/models/responses/ApiResponses
    //   482: dup
    //   483: invokespecial <init> : ()V
    //   486: astore #8
    //   488: aload_3
    //   489: aload #8
    //   491: aload #5
    //   493: aload #7
    //   495: invokevirtual addApiResponse : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/responses/ApiResponse;)Lnet/portswigger/swagger/v3/oas/models/responses/ApiResponses;
    //   498: invokevirtual responses : (Lnet/portswigger/swagger/v3/oas/models/responses/ApiResponses;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   501: pop
    //   502: aload_2
    //   503: ifnull -> 418
    //   506: aload_1
    //   507: invokevirtual getExternalDocs : ()Lnet/portswigger/swagger/v1/models/ExternalDocs;
    //   510: ifnull -> 525
    //   513: aload_3
    //   514: aload_0
    //   515: aload_1
    //   516: invokevirtual getExternalDocs : ()Lnet/portswigger/swagger/v1/models/ExternalDocs;
    //   519: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/ExternalDocs;)Lnet/portswigger/swagger/v3/oas/models/ExternalDocumentation;
    //   522: invokevirtual setExternalDocs : (Lnet/portswigger/swagger/v3/oas/models/ExternalDocumentation;)V
    //   525: aload_1
    //   526: invokevirtual getSecurity : ()Ljava/util/List;
    //   529: ifnull -> 544
    //   532: aload_3
    //   533: aload_0
    //   534: aload_1
    //   535: invokevirtual getSecurity : ()Ljava/util/List;
    //   538: invokevirtual convertSecurityRequirementsMap : (Ljava/util/List;)Ljava/util/List;
    //   541: invokevirtual setSecurity : (Ljava/util/List;)V
    //   544: aload_3
    //   545: areturn
  }
  
  private Map<String, Object> convert(Map<String, Object> paramMap) {
    if (paramMap != null && paramMap.size() > 0)
      paramMap.entrySet().removeIf(SwaggerConverter::lambda$convert$4); 
    return paramMap;
  }
  
  private Schema convertFormDataToSchema(Parameter paramParameter) {
    SerializableParameter serializableParameter = (SerializableParameter)paramParameter;
    return convert(serializableParameter);
  }
  
  private RequestBody convertFormDataToRequestBody(List<Parameter> paramList, List<String> paramList1) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: new net/portswigger/swagger/v3/oas/models/parameters/RequestBody
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore #4
    //   12: new net/portswigger/swagger/v3/oas/models/media/ObjectSchema
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore #5
    //   21: astore_3
    //   22: aload_1
    //   23: invokeinterface iterator : ()Ljava/util/Iterator;
    //   28: astore #6
    //   30: aload #6
    //   32: invokeinterface hasNext : ()Z
    //   37: ifeq -> 219
    //   40: aload #6
    //   42: invokeinterface next : ()Ljava/lang/Object;
    //   47: checkcast net/portswigger/swagger/v1/models/parameters/Parameter
    //   50: astore #7
    //   52: aload #7
    //   54: instanceof net/portswigger/swagger/v1/models/parameters/RefParameter
    //   57: ifeq -> 160
    //   60: aload #7
    //   62: checkcast net/portswigger/swagger/v1/models/parameters/RefParameter
    //   65: astore #11
    //   67: aload #11
    //   69: invokevirtual getSimpleRef : ()Ljava/lang/String;
    //   72: astore #12
    //   74: aload_0
    //   75: getfield globalV2Parameters : Ljava/util/Map;
    //   78: aload #12
    //   80: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   85: checkcast net/portswigger/swagger/v1/models/parameters/SerializableParameter
    //   88: astore #8
    //   90: aload_0
    //   91: getfield components : Lnet/portswigger/swagger/v3/oas/models/Components;
    //   94: invokevirtual getSchemas : ()Ljava/util/Map;
    //   97: aload #12
    //   99: sipush #17631
    //   102: sipush #32453
    //   105: invokestatic a : (II)Ljava/lang/String;
    //   108: swap
    //   109: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   114: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   119: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   122: invokevirtual getName : ()Ljava/lang/String;
    //   125: astore #10
    //   127: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   130: dup
    //   131: invokespecial <init> : ()V
    //   134: aload #12
    //   136: sipush #17630
    //   139: sipush #25644
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: swap
    //   146: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   151: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   154: astore #9
    //   156: aload_3
    //   157: ifnull -> 182
    //   160: aload #7
    //   162: checkcast net/portswigger/swagger/v1/models/parameters/SerializableParameter
    //   165: astore #8
    //   167: aload_0
    //   168: aload #8
    //   170: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/parameters/SerializableParameter;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   173: astore #9
    //   175: aload #9
    //   177: invokevirtual getName : ()Ljava/lang/String;
    //   180: astore #10
    //   182: aload #8
    //   184: invokeinterface getRequired : ()Z
    //   189: ifeq -> 205
    //   192: aload #5
    //   194: aload #8
    //   196: invokeinterface getName : ()Ljava/lang/String;
    //   201: invokevirtual addRequiredItem : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   204: pop
    //   205: aload #5
    //   207: aload #10
    //   209: aload #9
    //   211: invokevirtual addProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   214: pop
    //   215: aload_3
    //   216: ifnull -> 30
    //   219: new java/util/ArrayList
    //   222: dup
    //   223: aload_0
    //   224: getfield globalConsumes : Ljava/util/List;
    //   227: invokespecial <init> : (Ljava/util/Collection;)V
    //   230: astore #6
    //   232: aload_2
    //   233: ifnull -> 261
    //   236: aload_2
    //   237: invokeinterface size : ()I
    //   242: ifle -> 261
    //   245: aload #6
    //   247: invokeinterface clear : ()V
    //   252: aload #6
    //   254: aload_2
    //   255: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   260: pop
    //   261: aload #6
    //   263: invokeinterface size : ()I
    //   268: ifne -> 288
    //   271: aload #6
    //   273: sipush #17662
    //   276: sipush #4063
    //   279: invokestatic a : (II)Ljava/lang/String;
    //   282: invokeinterface add : (Ljava/lang/Object;)Z
    //   287: pop
    //   288: new net/portswigger/swagger/v3/oas/models/media/Content
    //   291: dup
    //   292: invokespecial <init> : ()V
    //   295: astore #7
    //   297: aload #6
    //   299: invokeinterface iterator : ()Ljava/util/Iterator;
    //   304: astore #8
    //   306: aload #8
    //   308: invokeinterface hasNext : ()Z
    //   313: ifeq -> 352
    //   316: aload #8
    //   318: invokeinterface next : ()Ljava/lang/Object;
    //   323: checkcast java/lang/String
    //   326: astore #9
    //   328: aload #7
    //   330: aload #9
    //   332: new net/portswigger/swagger/v3/oas/models/media/MediaType
    //   335: dup
    //   336: invokespecial <init> : ()V
    //   339: aload #5
    //   341: invokevirtual schema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/MediaType;
    //   344: invokevirtual addMediaType : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/MediaType;)Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   347: pop
    //   348: aload_3
    //   349: ifnull -> 306
    //   352: aload #4
    //   354: aload #7
    //   356: invokevirtual content : (Lnet/portswigger/swagger/v3/oas/models/media/Content;)Lnet/portswigger/swagger/v3/oas/models/parameters/RequestBody;
    //   359: pop
    //   360: aload #4
    //   362: areturn
  }
  
  private Schema convert(SerializableParameter paramSerializableParameter) {
    // Byte code:
    //   0: sipush #17645
    //   3: invokestatic ZG : ()[Ljava/lang/String;
    //   6: astore_2
    //   7: sipush #-13644
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: aload_1
    //   14: invokeinterface getType : ()Ljava/lang/String;
    //   19: invokevirtual equals : (Ljava/lang/Object;)Z
    //   22: ifeq -> 37
    //   25: new net/portswigger/swagger/v3/oas/models/media/FileSchema
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: astore_3
    //   33: aload_2
    //   34: ifnull -> 195
    //   37: sipush #17640
    //   40: sipush #9579
    //   43: invokestatic a : (II)Ljava/lang/String;
    //   46: aload_1
    //   47: invokeinterface getType : ()Ljava/lang/String;
    //   52: invokevirtual equals : (Ljava/lang/Object;)Z
    //   55: ifeq -> 98
    //   58: new net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: astore #4
    //   67: aload_1
    //   68: invokeinterface getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   73: ifnull -> 91
    //   76: aload #4
    //   78: aload_0
    //   79: aload_1
    //   80: invokeinterface getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   85: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   88: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   91: aload #4
    //   93: astore_3
    //   94: aload_2
    //   95: ifnull -> 195
    //   98: aload_1
    //   99: invokeinterface getType : ()Ljava/lang/String;
    //   104: aload_1
    //   105: invokeinterface getFormat : ()Ljava/lang/String;
    //   110: invokestatic fromTypeAndFormat : (Ljava/lang/String;Ljava/lang/String;)Lnet/portswigger/swagger/v3/parser/PrimitiveType;
    //   113: astore #4
    //   115: aload #4
    //   117: ifnull -> 130
    //   120: aload #4
    //   122: invokevirtual createProperty : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   125: astore_3
    //   126: aload_2
    //   127: ifnull -> 195
    //   130: aload_1
    //   131: invokeinterface getType : ()Ljava/lang/String;
    //   136: aconst_null
    //   137: invokestatic fromTypeAndFormat : (Ljava/lang/String;Ljava/lang/String;)Lnet/portswigger/swagger/v3/parser/PrimitiveType;
    //   140: astore #4
    //   142: aload #4
    //   144: ifnull -> 167
    //   147: aload #4
    //   149: invokevirtual createProperty : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   152: astore_3
    //   153: aload_3
    //   154: aload_1
    //   155: invokeinterface getFormat : ()Ljava/lang/String;
    //   160: invokevirtual setFormat : (Ljava/lang/String;)V
    //   163: aload_2
    //   164: ifnull -> 195
    //   167: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   170: dup
    //   171: invokespecial <init> : ()V
    //   174: astore_3
    //   175: aload_3
    //   176: aload_1
    //   177: invokeinterface getType : ()Ljava/lang/String;
    //   182: invokevirtual setType : (Ljava/lang/String;)V
    //   185: aload_3
    //   186: aload_1
    //   187: invokeinterface getFormat : ()Ljava/lang/String;
    //   192: invokevirtual setFormat : (Ljava/lang/String;)V
    //   195: aload_3
    //   196: aload_1
    //   197: invokeinterface getDescription : ()Ljava/lang/String;
    //   202: invokevirtual setDescription : (Ljava/lang/String;)V
    //   205: aload_3
    //   206: aload_1
    //   207: invokeinterface isReadOnly : ()Ljava/lang/Boolean;
    //   212: invokevirtual setReadOnly : (Ljava/lang/Boolean;)V
    //   215: aload_3
    //   216: aload_1
    //   217: invokeinterface getEnum : ()Ljava/util/List;
    //   222: invokevirtual setEnum : (Ljava/util/List;)V
    //   225: aload_1
    //   226: invokeinterface getMaxItems : ()Ljava/lang/Integer;
    //   231: ifnull -> 244
    //   234: aload_3
    //   235: aload_1
    //   236: invokeinterface getMaxItems : ()Ljava/lang/Integer;
    //   241: invokevirtual setMaxItems : (Ljava/lang/Integer;)V
    //   244: aload_1
    //   245: invokeinterface getMinItems : ()Ljava/lang/Integer;
    //   250: ifnull -> 263
    //   253: aload_3
    //   254: aload_1
    //   255: invokeinterface getMinItems : ()Ljava/lang/Integer;
    //   260: invokevirtual setMinItems : (Ljava/lang/Integer;)V
    //   263: aload_1
    //   264: invokeinterface isUniqueItems : ()Ljava/lang/Boolean;
    //   269: ifnull -> 282
    //   272: aload_3
    //   273: aload_1
    //   274: invokeinterface isUniqueItems : ()Ljava/lang/Boolean;
    //   279: invokevirtual setUniqueItems : (Ljava/lang/Boolean;)V
    //   282: aload_3
    //   283: aload_1
    //   284: invokeinterface getMaximum : ()Ljava/math/BigDecimal;
    //   289: invokevirtual setMaximum : (Ljava/math/BigDecimal;)V
    //   292: aload_3
    //   293: aload_1
    //   294: invokeinterface isExclusiveMaximum : ()Ljava/lang/Boolean;
    //   299: invokevirtual setExclusiveMaximum : (Ljava/lang/Boolean;)V
    //   302: aload_3
    //   303: aload_1
    //   304: invokeinterface getMinimum : ()Ljava/math/BigDecimal;
    //   309: invokevirtual setMinimum : (Ljava/math/BigDecimal;)V
    //   312: aload_3
    //   313: aload_1
    //   314: invokeinterface isExclusiveMinimum : ()Ljava/lang/Boolean;
    //   319: invokevirtual setExclusiveMinimum : (Ljava/lang/Boolean;)V
    //   322: aload_3
    //   323: aload_1
    //   324: invokeinterface getMinLength : ()Ljava/lang/Integer;
    //   329: invokevirtual setMinLength : (Ljava/lang/Integer;)V
    //   332: aload_3
    //   333: aload_1
    //   334: invokeinterface getMaxLength : ()Ljava/lang/Integer;
    //   339: invokevirtual setMaxLength : (Ljava/lang/Integer;)V
    //   342: aload_3
    //   343: aload_1
    //   344: invokeinterface getName : ()Ljava/lang/String;
    //   349: invokevirtual setName : (Ljava/lang/String;)V
    //   352: aload_1
    //   353: invokeinterface getVendorExtensions : ()Ljava/util/Map;
    //   358: ifnull -> 444
    //   361: aload_1
    //   362: invokeinterface getVendorExtensions : ()Ljava/util/Map;
    //   367: sipush #17641
    //   370: sipush #20682
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   381: astore #4
    //   383: aload #4
    //   385: ifnull -> 394
    //   388: aload_3
    //   389: aload #4
    //   391: invokevirtual setExample : (Ljava/lang/Object;)V
    //   394: aload_1
    //   395: invokeinterface getVendorExtensions : ()Ljava/util/Map;
    //   400: sipush #17663
    //   403: sipush #15314
    //   406: invokestatic a : (II)Ljava/lang/String;
    //   409: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   414: astore #5
    //   416: aload #5
    //   418: ifnull -> 430
    //   421: aload_3
    //   422: aload #5
    //   424: checkcast java/lang/Boolean
    //   427: invokevirtual setNullable : (Ljava/lang/Boolean;)V
    //   430: aload_3
    //   431: aload_0
    //   432: aload_1
    //   433: invokeinterface getVendorExtensions : ()Ljava/util/Map;
    //   438: invokevirtual convert : (Ljava/util/Map;)Ljava/util/Map;
    //   441: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   444: aload_1
    //   445: invokeinterface getMultipleOf : ()Ljava/lang/Number;
    //   450: ifnull -> 473
    //   453: aload_3
    //   454: new java/math/BigDecimal
    //   457: dup
    //   458: aload_1
    //   459: invokeinterface getMultipleOf : ()Ljava/lang/Number;
    //   464: invokevirtual toString : ()Ljava/lang/String;
    //   467: invokespecial <init> : (Ljava/lang/String;)V
    //   470: invokevirtual setMultipleOf : (Ljava/math/BigDecimal;)V
    //   473: aload_3
    //   474: aload_1
    //   475: invokeinterface getPattern : ()Ljava/lang/String;
    //   480: invokevirtual setPattern : (Ljava/lang/String;)V
    //   483: aload_1
    //   484: instanceof net/portswigger/swagger/v1/models/parameters/AbstractSerializableParameter
    //   487: ifeq -> 505
    //   490: aload_1
    //   491: checkcast net/portswigger/swagger/v1/models/parameters/AbstractSerializableParameter
    //   494: astore #4
    //   496: aload_3
    //   497: aload #4
    //   499: invokevirtual getDefault : ()Ljava/lang/Object;
    //   502: invokevirtual setDefault : (Ljava/lang/Object;)V
    //   505: aload_3
    //   506: areturn
  }
  
  private RequestBody convertParameterToRequestBody(Parameter paramParameter) {
    return convertParameterToRequestBody(paramParameter, null);
  }
  
  private RequestBody convertParameterToRequestBody(Parameter paramParameter, List<String> paramList) {
    RequestBody requestBody = new RequestBody();
    String[] arrayOfString = ParseOptions.ZG();
    BodyParameter bodyParameter = (BodyParameter)paramParameter;
    ArrayList<String> arrayList = new ArrayList<>(this.globalConsumes);
    if (paramList != null && paramList.size() > 0) {
      arrayList.clear();
      arrayList.addAll(paramList);
    } 
    if (arrayList.size() == 0)
      arrayList.add(a(17604, -4001)); 
    if (!StringUtils.isBlank(paramParameter.getDescription()))
      requestBody.description(paramParameter.getDescription()); 
    requestBody.required(Boolean.valueOf(paramParameter.getRequired()));
    Content content = new Content();
    for (String str : arrayList) {
      content.addMediaType(str, (new MediaType()).schema(convert(bodyParameter.getSchema())));
      if (!StringUtils.isBlank(bodyParameter.getDescription()))
        requestBody.setDescription(bodyParameter.getDescription()); 
      if (arrayOfString != null)
        break; 
    } 
    convertExamples(((BodyParameter)paramParameter).getExamples(), content);
    requestBody.setExtensions(convert(paramParameter.getVendorExtensions()));
    requestBody.content(content);
    return requestBody;
  }
  
  private ApiResponse convert(Response paramResponse) {
    return convert(paramResponse, null);
  }
  
  private ApiResponse convert(Response paramResponse, List<String> paramList) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: new net/portswigger/swagger/v3/oas/models/responses/ApiResponse
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore #4
    //   12: astore_3
    //   13: new net/portswigger/swagger/v3/oas/models/media/Content
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: astore #5
    //   22: aload_1
    //   23: instanceof net/portswigger/swagger/v1/models/RefResponse
    //   26: ifeq -> 113
    //   29: aload_1
    //   30: checkcast net/portswigger/swagger/v1/models/RefResponse
    //   33: astore #6
    //   35: aload #6
    //   37: invokevirtual get$ref : ()Ljava/lang/String;
    //   40: sipush #17646
    //   43: sipush #-16285
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: invokevirtual indexOf : (Ljava/lang/String;)I
    //   52: ifne -> 99
    //   55: aload #6
    //   57: invokevirtual get$ref : ()Ljava/lang/String;
    //   60: sipush #17627
    //   63: sipush #-11027
    //   66: invokestatic a : (II)Ljava/lang/String;
    //   69: invokevirtual length : ()I
    //   72: invokevirtual substring : (I)Ljava/lang/String;
    //   75: sipush #17658
    //   78: sipush #-9987
    //   81: invokestatic a : (II)Ljava/lang/String;
    //   84: swap
    //   85: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   90: astore #7
    //   92: aload #6
    //   94: aload #7
    //   96: invokevirtual set$ref : (Ljava/lang/String;)V
    //   99: aload #4
    //   101: aload #6
    //   103: invokevirtual get$ref : ()Ljava/lang/String;
    //   106: invokevirtual set$ref : (Ljava/lang/String;)V
    //   109: aload_3
    //   110: ifnull -> 331
    //   113: new java/util/ArrayList
    //   116: dup
    //   117: aload_0
    //   118: getfield globalProduces : Ljava/util/List;
    //   121: invokespecial <init> : (Ljava/util/Collection;)V
    //   124: astore #6
    //   126: aload_2
    //   127: ifnull -> 146
    //   130: aload #6
    //   132: invokeinterface clear : ()V
    //   137: aload #6
    //   139: aload_2
    //   140: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   145: pop
    //   146: aload #6
    //   148: invokeinterface size : ()I
    //   153: ifne -> 173
    //   156: aload #6
    //   158: sipush #17648
    //   161: sipush #15454
    //   164: invokestatic a : (II)Ljava/lang/String;
    //   167: invokeinterface add : (Ljava/lang/Object;)Z
    //   172: pop
    //   173: aload #4
    //   175: aload_1
    //   176: invokevirtual getDescription : ()Ljava/lang/String;
    //   179: invokevirtual setDescription : (Ljava/lang/String;)V
    //   182: aload_1
    //   183: invokevirtual getResponseSchema : ()Lnet/portswigger/swagger/v1/models/Model;
    //   186: ifnull -> 270
    //   189: aload_0
    //   190: aload_0
    //   191: aload_1
    //   192: invokevirtual getResponseSchema : ()Lnet/portswigger/swagger/v1/models/Model;
    //   195: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/Model;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   198: invokevirtual convertFileSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   201: astore #7
    //   203: aload #6
    //   205: invokeinterface iterator : ()Ljava/util/Iterator;
    //   210: astore #8
    //   212: aload #8
    //   214: invokeinterface hasNext : ()Z
    //   219: ifeq -> 262
    //   222: aload #8
    //   224: invokeinterface next : ()Ljava/lang/Object;
    //   229: checkcast java/lang/String
    //   232: astore #9
    //   234: new net/portswigger/swagger/v3/oas/models/media/MediaType
    //   237: dup
    //   238: invokespecial <init> : ()V
    //   241: astore #10
    //   243: aload #5
    //   245: aload #9
    //   247: aload #10
    //   249: aload #7
    //   251: invokevirtual schema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/MediaType;
    //   254: invokevirtual addMediaType : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/MediaType;)Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   257: pop
    //   258: aload_3
    //   259: ifnull -> 212
    //   262: aload #4
    //   264: aload #5
    //   266: invokevirtual content : (Lnet/portswigger/swagger/v3/oas/models/media/Content;)Lnet/portswigger/swagger/v3/oas/models/responses/ApiResponse;
    //   269: pop
    //   270: aload #4
    //   272: aload_0
    //   273: aload_1
    //   274: invokevirtual getExamples : ()Ljava/util/Map;
    //   277: aload #5
    //   279: invokevirtual convertExamples : (Ljava/util/Map;Lnet/portswigger/swagger/v3/oas/models/media/Content;)Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   282: invokevirtual content : (Lnet/portswigger/swagger/v3/oas/models/media/Content;)Lnet/portswigger/swagger/v3/oas/models/responses/ApiResponse;
    //   285: pop
    //   286: aload #4
    //   288: aload_0
    //   289: aload_1
    //   290: invokevirtual getVendorExtensions : ()Ljava/util/Map;
    //   293: invokevirtual convert : (Ljava/util/Map;)Ljava/util/Map;
    //   296: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   299: aload_1
    //   300: invokevirtual getHeaders : ()Ljava/util/Map;
    //   303: ifnull -> 331
    //   306: aload_1
    //   307: invokevirtual getHeaders : ()Ljava/util/Map;
    //   310: invokeinterface size : ()I
    //   315: ifle -> 331
    //   318: aload #4
    //   320: aload_0
    //   321: aload_1
    //   322: invokevirtual getHeaders : ()Ljava/util/Map;
    //   325: invokevirtual convertHeaders : (Ljava/util/Map;)Ljava/util/Map;
    //   328: invokevirtual setHeaders : (Ljava/util/Map;)V
    //   331: aload #4
    //   333: areturn
  }
  
  private Content convertExamples(Map paramMap, Content paramContent) {
    if (paramMap != null)
      paramMap.forEach(paramContent::lambda$convertExamples$5); 
    return paramContent;
  }
  
  private Schema convertFileSchema(Schema paramSchema) {
    if (a(17607, -18940).equals(paramSchema.getType())) {
      paramSchema.setType(a(17613, -13717));
      paramSchema.setFormat(a(17650, -24209));
    } 
    return paramSchema;
  }
  
  private Map<String, Header> convertHeaders(Map<String, Property> paramMap) {
    // Byte code:
    //   0: new java/util/HashMap
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_1
    //   9: aload_0
    //   10: aload_2
    //   11: <illegal opcode> accept : (Lnet/portswigger/swagger/v2/SwaggerConverter;Ljava/util/Map;)Ljava/util/function/BiConsumer;
    //   16: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   21: aload_2
    //   22: areturn
  }
  
  private Header convertHeader(Property paramProperty) {
    Schema schema = convert(paramProperty);
    schema.setDescription(null);
    Header header = new Header();
    header.setDescription(paramProperty.getDescription());
    header.setSchema(schema);
    return header;
  }
  
  private Schema convert(Property paramProperty) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_1
    //   11: invokeinterface getBooleanValue : ()Ljava/lang/Boolean;
    //   16: ifnull -> 36
    //   19: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: aload_1
    //   27: invokeinterface getBooleanValue : ()Ljava/lang/Boolean;
    //   32: invokevirtual booleanSchemaValue : (Ljava/lang/Boolean;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   35: areturn
    //   36: aload_1
    //   37: instanceof net/portswigger/swagger/v1/models/properties/RefProperty
    //   40: ifeq -> 134
    //   43: aload_1
    //   44: checkcast net/portswigger/swagger/v1/models/properties/RefProperty
    //   47: astore #4
    //   49: aload #4
    //   51: invokevirtual get$ref : ()Ljava/lang/String;
    //   54: sipush #17625
    //   57: sipush #-30735
    //   60: invokestatic a : (II)Ljava/lang/String;
    //   63: invokevirtual indexOf : (Ljava/lang/String;)I
    //   66: ifne -> 113
    //   69: aload #4
    //   71: invokevirtual get$ref : ()Ljava/lang/String;
    //   74: sipush #17625
    //   77: sipush #-30735
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: invokevirtual length : ()I
    //   86: invokevirtual substring : (I)Ljava/lang/String;
    //   89: sipush #17615
    //   92: sipush #-22862
    //   95: invokestatic a : (II)Ljava/lang/String;
    //   98: swap
    //   99: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   104: astore #5
    //   106: aload #4
    //   108: aload #5
    //   110: invokevirtual set$ref : (Ljava/lang/String;)V
    //   113: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   116: dup
    //   117: invokespecial <init> : ()V
    //   120: astore_3
    //   121: aload_3
    //   122: aload #4
    //   124: invokevirtual get$ref : ()Ljava/lang/String;
    //   127: invokevirtual set$ref : (Ljava/lang/String;)V
    //   130: aload_2
    //   131: ifnull -> 542
    //   134: aload_1
    //   135: instanceof net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   138: ifeq -> 265
    //   141: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   144: aload_1
    //   145: ldc net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   147: invokevirtual Zb : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   150: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   153: astore #4
    //   155: aload_1
    //   156: checkcast net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   159: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   162: astore #5
    //   164: aload_0
    //   165: aload #5
    //   167: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   170: astore #6
    //   172: aload #4
    //   174: aload #6
    //   176: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   179: aload_1
    //   180: checkcast net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   183: invokevirtual getMaxItems : ()Ljava/lang/Integer;
    //   186: ifnull -> 201
    //   189: aload #4
    //   191: aload_1
    //   192: checkcast net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   195: invokevirtual getMaxItems : ()Ljava/lang/Integer;
    //   198: invokevirtual setMaxItems : (Ljava/lang/Integer;)V
    //   201: aload_1
    //   202: checkcast net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   205: invokevirtual getMinItems : ()Ljava/lang/Integer;
    //   208: ifnull -> 223
    //   211: aload #4
    //   213: aload_1
    //   214: checkcast net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   217: invokevirtual getMinItems : ()Ljava/lang/Integer;
    //   220: invokevirtual setMinItems : (Ljava/lang/Integer;)V
    //   223: aload_1
    //   224: checkcast net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   227: invokevirtual getUniqueItems : ()Ljava/lang/Boolean;
    //   230: ifnull -> 258
    //   233: aload_1
    //   234: checkcast net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   237: invokevirtual getUniqueItems : ()Ljava/lang/Boolean;
    //   240: invokevirtual booleanValue : ()Z
    //   243: ifeq -> 258
    //   246: aload #4
    //   248: aload_1
    //   249: checkcast net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   252: invokevirtual getUniqueItems : ()Ljava/lang/Boolean;
    //   255: invokevirtual setUniqueItems : (Ljava/lang/Boolean;)V
    //   258: aload #4
    //   260: astore_3
    //   261: aload_2
    //   262: ifnull -> 542
    //   265: aload_1
    //   266: instanceof net/portswigger/swagger/v1/models/properties/FileProperty
    //   269: ifeq -> 289
    //   272: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   275: aload_1
    //   276: ldc net/portswigger/swagger/v3/oas/models/media/FileSchema
    //   278: invokevirtual Zb : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   281: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   284: astore_3
    //   285: aload_2
    //   286: ifnull -> 542
    //   289: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   292: aload_1
    //   293: ldc net/portswigger/swagger/v3/oas/models/media/Schema
    //   295: invokevirtual Zb : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   298: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   301: astore_3
    //   302: aload_1
    //   303: invokeinterface getExample : ()Ljava/lang/Object;
    //   308: ifnull -> 321
    //   311: aload_3
    //   312: aload_1
    //   313: invokeinterface getExample : ()Ljava/lang/Object;
    //   318: invokevirtual setExample : (Ljava/lang/Object;)V
    //   321: sipush #17626
    //   324: sipush #20967
    //   327: invokestatic a : (II)Ljava/lang/String;
    //   330: aload_1
    //   331: invokeinterface getType : ()Ljava/lang/String;
    //   336: invokevirtual equals : (Ljava/lang/Object;)Z
    //   339: ifeq -> 396
    //   342: aload_3
    //   343: invokevirtual getProperties : ()Ljava/util/Map;
    //   346: ifnull -> 396
    //   349: aload_3
    //   350: invokevirtual getProperties : ()Ljava/util/Map;
    //   353: invokeinterface size : ()I
    //   358: ifle -> 396
    //   361: new java/util/LinkedHashMap
    //   364: dup
    //   365: invokespecial <init> : ()V
    //   368: astore #4
    //   370: aload_1
    //   371: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   374: invokevirtual getProperties : ()Ljava/util/Map;
    //   377: aload_0
    //   378: aload #4
    //   380: <illegal opcode> accept : (Lnet/portswigger/swagger/v2/SwaggerConverter;Ljava/util/Map;)Ljava/util/function/BiConsumer;
    //   385: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   390: aload_3
    //   391: aload #4
    //   393: invokevirtual setProperties : (Ljava/util/Map;)V
    //   396: aload_1
    //   397: instanceof net/portswigger/swagger/v1/models/properties/MapProperty
    //   400: ifeq -> 471
    //   403: aload_1
    //   404: checkcast net/portswigger/swagger/v1/models/properties/MapProperty
    //   407: astore #4
    //   409: aload #4
    //   411: invokevirtual getAdditionalProperties : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   414: invokeinterface getBooleanValue : ()Ljava/lang/Boolean;
    //   419: ifnull -> 440
    //   422: aload_3
    //   423: aload #4
    //   425: invokevirtual getAdditionalProperties : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   428: invokeinterface getBooleanValue : ()Ljava/lang/Boolean;
    //   433: invokevirtual setAdditionalProperties : (Ljava/lang/Object;)V
    //   436: aload_2
    //   437: ifnull -> 453
    //   440: aload_3
    //   441: aload_0
    //   442: aload #4
    //   444: invokevirtual getAdditionalProperties : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   447: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   450: invokevirtual setAdditionalProperties : (Ljava/lang/Object;)V
    //   453: aload_3
    //   454: aload #4
    //   456: invokevirtual getMinProperties : ()Ljava/lang/Integer;
    //   459: invokevirtual setMinProperties : (Ljava/lang/Integer;)V
    //   462: aload_3
    //   463: aload #4
    //   465: invokevirtual getMaxProperties : ()Ljava/lang/Integer;
    //   468: invokevirtual setMaxProperties : (Ljava/lang/Integer;)V
    //   471: aload_1
    //   472: instanceof net/portswigger/swagger/v1/models/properties/AbstractNumericProperty
    //   475: ifeq -> 502
    //   478: aload_1
    //   479: checkcast net/portswigger/swagger/v1/models/properties/AbstractNumericProperty
    //   482: astore #4
    //   484: aload_3
    //   485: aload #4
    //   487: invokevirtual getExclusiveMaximum : ()Ljava/lang/Boolean;
    //   490: invokevirtual setExclusiveMaximum : (Ljava/lang/Boolean;)V
    //   493: aload_3
    //   494: aload #4
    //   496: invokevirtual getExclusiveMinimum : ()Ljava/lang/Boolean;
    //   499: invokevirtual setExclusiveMinimum : (Ljava/lang/Boolean;)V
    //   502: aload_1
    //   503: instanceof net/portswigger/swagger/v1/models/properties/StringProperty
    //   506: ifeq -> 542
    //   509: aload_1
    //   510: checkcast net/portswigger/swagger/v1/models/properties/StringProperty
    //   513: astore #4
    //   515: aload_3
    //   516: aload #4
    //   518: invokevirtual getMinLength : ()Ljava/lang/Integer;
    //   521: invokevirtual setMinLength : (Ljava/lang/Integer;)V
    //   524: aload_3
    //   525: aload #4
    //   527: invokevirtual getMaxLength : ()Ljava/lang/Integer;
    //   530: invokevirtual setMaxLength : (Ljava/lang/Integer;)V
    //   533: aload_3
    //   534: aload #4
    //   536: invokevirtual getPattern : ()Ljava/lang/String;
    //   539: invokevirtual setPattern : (Ljava/lang/String;)V
    //   542: aload_1
    //   543: invokeinterface getVendorExtensions : ()Ljava/util/Map;
    //   548: ifnull -> 601
    //   551: aload_1
    //   552: invokeinterface getVendorExtensions : ()Ljava/util/Map;
    //   557: sipush #17663
    //   560: sipush #15314
    //   563: invokestatic a : (II)Ljava/lang/String;
    //   566: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   571: astore #4
    //   573: aload #4
    //   575: ifnull -> 587
    //   578: aload_3
    //   579: aload #4
    //   581: checkcast java/lang/Boolean
    //   584: invokevirtual setNullable : (Ljava/lang/Boolean;)V
    //   587: aload_3
    //   588: aload_0
    //   589: aload_1
    //   590: invokeinterface getVendorExtensions : ()Ljava/util/Map;
    //   595: invokevirtual convert : (Ljava/util/Map;)Ljava/util/Map;
    //   598: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   601: aload_3
    //   602: areturn
  }
  
  private Parameter convert(Parameter paramParameter) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: new net/portswigger/swagger/v3/oas/models/parameters/Parameter
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_3
    //   11: astore_2
    //   12: aload_1
    //   13: invokeinterface getDescription : ()Ljava/lang/String;
    //   18: invokestatic isBlank : (Ljava/lang/String;)Z
    //   21: ifne -> 34
    //   24: aload_3
    //   25: aload_1
    //   26: invokeinterface getDescription : ()Ljava/lang/String;
    //   31: invokevirtual setDescription : (Ljava/lang/String;)V
    //   34: aload_1
    //   35: instanceof net/portswigger/swagger/v1/models/parameters/SerializableParameter
    //   38: ifeq -> 54
    //   41: aload_3
    //   42: aload_1
    //   43: checkcast net/portswigger/swagger/v1/models/parameters/SerializableParameter
    //   46: invokeinterface getAllowEmptyValue : ()Ljava/lang/Boolean;
    //   51: invokevirtual setAllowEmptyValue : (Ljava/lang/Boolean;)V
    //   54: aload_3
    //   55: aload_1
    //   56: invokeinterface getIn : ()Ljava/lang/String;
    //   61: invokevirtual setIn : (Ljava/lang/String;)V
    //   64: aload_3
    //   65: aload_1
    //   66: invokeinterface getName : ()Ljava/lang/String;
    //   71: invokevirtual setName : (Ljava/lang/String;)V
    //   74: aload_1
    //   75: invokeinterface getVendorExtensions : ()Ljava/util/Map;
    //   80: sipush #17641
    //   83: sipush #20682
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   94: astore #4
    //   96: aload #4
    //   98: ifnull -> 107
    //   101: aload_3
    //   102: aload #4
    //   104: invokevirtual setExample : (Ljava/lang/Object;)V
    //   107: aconst_null
    //   108: astore #5
    //   110: aload_1
    //   111: instanceof net/portswigger/swagger/v1/models/parameters/RefParameter
    //   114: ifeq -> 340
    //   117: aload_1
    //   118: checkcast net/portswigger/swagger/v1/models/parameters/RefParameter
    //   121: astore #6
    //   123: aload #6
    //   125: invokevirtual get$ref : ()Ljava/lang/String;
    //   128: sipush #17616
    //   131: sipush #6259
    //   134: invokestatic a : (II)Ljava/lang/String;
    //   137: invokevirtual indexOf : (Ljava/lang/String;)I
    //   140: ifne -> 327
    //   143: sipush #17636
    //   146: sipush #-27663
    //   149: invokestatic a : (II)Ljava/lang/String;
    //   152: astore #7
    //   154: aload_0
    //   155: getfield components : Lnet/portswigger/swagger/v3/oas/models/Components;
    //   158: invokevirtual getRequestBodies : ()Ljava/util/Map;
    //   161: ifnull -> 206
    //   164: aload_0
    //   165: getfield components : Lnet/portswigger/swagger/v3/oas/models/Components;
    //   168: invokevirtual getRequestBodies : ()Ljava/util/Map;
    //   171: aload #6
    //   173: invokevirtual getSimpleRef : ()Ljava/lang/String;
    //   176: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   181: ifnull -> 206
    //   184: aload #7
    //   186: sipush #17649
    //   189: sipush #29925
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   200: astore #7
    //   202: aload_2
    //   203: ifnull -> 291
    //   206: aload_0
    //   207: getfield components : Lnet/portswigger/swagger/v3/oas/models/Components;
    //   210: invokevirtual getSchemas : ()Ljava/util/Map;
    //   213: ifnull -> 273
    //   216: aload_0
    //   217: getfield components : Lnet/portswigger/swagger/v3/oas/models/Components;
    //   220: invokevirtual getSchemas : ()Ljava/util/Map;
    //   223: aload #6
    //   225: invokevirtual getSimpleRef : ()Ljava/lang/String;
    //   228: sipush #17638
    //   231: sipush #-5390
    //   234: invokestatic a : (II)Ljava/lang/String;
    //   237: swap
    //   238: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   243: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   248: ifnull -> 273
    //   251: aload #7
    //   253: sipush #17634
    //   256: sipush #-11886
    //   259: invokestatic a : (II)Ljava/lang/String;
    //   262: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   267: astore #7
    //   269: aload_2
    //   270: ifnull -> 291
    //   273: aload #7
    //   275: sipush #17655
    //   278: sipush #16911
    //   281: invokestatic a : (II)Ljava/lang/String;
    //   284: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   289: astore #7
    //   291: aload #7
    //   293: aload #6
    //   295: invokevirtual get$ref : ()Ljava/lang/String;
    //   298: sipush #17657
    //   301: sipush #5248
    //   304: invokestatic a : (II)Ljava/lang/String;
    //   307: invokevirtual length : ()I
    //   310: invokevirtual substring : (I)Ljava/lang/String;
    //   313: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   318: astore #7
    //   320: aload #6
    //   322: aload #7
    //   324: invokevirtual set$ref : (Ljava/lang/String;)V
    //   327: aload_3
    //   328: aload #6
    //   330: invokevirtual get$ref : ()Ljava/lang/String;
    //   333: invokevirtual set$ref : (Ljava/lang/String;)V
    //   336: aload_2
    //   337: ifnull -> 1453
    //   340: aload_1
    //   341: instanceof net/portswigger/swagger/v1/models/parameters/SerializableParameter
    //   344: ifeq -> 1453
    //   347: aload_1
    //   348: checkcast net/portswigger/swagger/v1/models/parameters/SerializableParameter
    //   351: astore #6
    //   353: sipush #17614
    //   356: sipush #31907
    //   359: invokestatic a : (II)Ljava/lang/String;
    //   362: aload #6
    //   364: invokeinterface getType : ()Ljava/lang/String;
    //   369: invokevirtual equals : (Ljava/lang/Object;)Z
    //   372: ifeq -> 930
    //   375: new net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   378: dup
    //   379: invokespecial <init> : ()V
    //   382: astore #7
    //   384: aload #6
    //   386: invokeinterface getCollectionFormat : ()Ljava/lang/String;
    //   391: astore #8
    //   393: aload #8
    //   395: invokestatic isEmpty : (Ljava/lang/String;)Z
    //   398: ifeq -> 412
    //   401: sipush #17602
    //   404: sipush #-297
    //   407: invokestatic a : (II)Ljava/lang/String;
    //   410: astore #8
    //   412: aload #8
    //   414: astore #9
    //   416: iconst_m1
    //   417: istore #10
    //   419: aload #9
    //   421: invokevirtual hashCode : ()I
    //   424: lookupswitch default -> 592, 98822 -> 572, 114198 -> 476, 115159 -> 524, 104256825 -> 548, 106673285 -> 500
    //   476: aload #9
    //   478: sipush #17642
    //   481: sipush #18923
    //   484: invokestatic a : (II)Ljava/lang/String;
    //   487: invokevirtual equals : (Ljava/lang/Object;)Z
    //   490: ifeq -> 592
    //   493: iconst_0
    //   494: istore #10
    //   496: aload_2
    //   497: ifnull -> 592
    //   500: aload #9
    //   502: sipush #17632
    //   505: sipush #19353
    //   508: invokestatic a : (II)Ljava/lang/String;
    //   511: invokevirtual equals : (Ljava/lang/Object;)Z
    //   514: ifeq -> 592
    //   517: iconst_1
    //   518: istore #10
    //   520: aload_2
    //   521: ifnull -> 592
    //   524: aload #9
    //   526: sipush #17606
    //   529: sipush #21942
    //   532: invokestatic a : (II)Ljava/lang/String;
    //   535: invokevirtual equals : (Ljava/lang/Object;)Z
    //   538: ifeq -> 592
    //   541: iconst_2
    //   542: istore #10
    //   544: aload_2
    //   545: ifnull -> 592
    //   548: aload #9
    //   550: sipush #17610
    //   553: sipush #5978
    //   556: invokestatic a : (II)Ljava/lang/String;
    //   559: invokevirtual equals : (Ljava/lang/Object;)Z
    //   562: ifeq -> 592
    //   565: iconst_3
    //   566: istore #10
    //   568: aload_2
    //   569: ifnull -> 592
    //   572: aload #9
    //   574: sipush #17611
    //   577: sipush #1720
    //   580: invokestatic a : (II)Ljava/lang/String;
    //   583: invokevirtual equals : (Ljava/lang/Object;)Z
    //   586: ifeq -> 592
    //   589: iconst_4
    //   590: istore #10
    //   592: iload #10
    //   594: tableswitch default -> 736, 0 -> 628, 1 -> 660, 2 -> 692, 3 -> 696, 4 -> 736
    //   628: sipush #17652
    //   631: sipush #168
    //   634: invokestatic a : (II)Ljava/lang/String;
    //   637: aload_1
    //   638: invokeinterface getIn : ()Ljava/lang/String;
    //   643: invokevirtual equals : (Ljava/lang/Object;)Z
    //   646: ifeq -> 833
    //   649: aload_3
    //   650: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.SPACEDELIMITED : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   653: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;)V
    //   656: aload_2
    //   657: ifnull -> 833
    //   660: sipush #17659
    //   663: sipush #-9737
    //   666: invokestatic a : (II)Ljava/lang/String;
    //   669: aload_1
    //   670: invokeinterface getIn : ()Ljava/lang/String;
    //   675: invokevirtual equals : (Ljava/lang/Object;)Z
    //   678: ifeq -> 833
    //   681: aload_3
    //   682: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.PIPEDELIMITED : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   685: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;)V
    //   688: aload_2
    //   689: ifnull -> 833
    //   692: aload_2
    //   693: ifnull -> 833
    //   696: sipush #17659
    //   699: sipush #-9737
    //   702: invokestatic a : (II)Ljava/lang/String;
    //   705: aload_1
    //   706: invokeinterface getIn : ()Ljava/lang/String;
    //   711: invokevirtual equals : (Ljava/lang/Object;)Z
    //   714: ifeq -> 833
    //   717: aload_3
    //   718: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.FORM : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   721: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;)V
    //   724: aload_3
    //   725: iconst_1
    //   726: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   729: invokevirtual setExplode : (Ljava/lang/Boolean;)V
    //   732: aload_2
    //   733: ifnull -> 833
    //   736: sipush #17659
    //   739: sipush #-9737
    //   742: invokestatic a : (II)Ljava/lang/String;
    //   745: aload_1
    //   746: invokeinterface getIn : ()Ljava/lang/String;
    //   751: invokevirtual equals : (Ljava/lang/Object;)Z
    //   754: ifeq -> 776
    //   757: aload_3
    //   758: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.FORM : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   761: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;)V
    //   764: aload_3
    //   765: iconst_0
    //   766: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   769: invokevirtual setExplode : (Ljava/lang/Boolean;)V
    //   772: aload_2
    //   773: ifnull -> 833
    //   776: sipush #17637
    //   779: sipush #-18935
    //   782: invokestatic a : (II)Ljava/lang/String;
    //   785: aload_1
    //   786: invokeinterface getIn : ()Ljava/lang/String;
    //   791: invokevirtual equals : (Ljava/lang/Object;)Z
    //   794: ifne -> 818
    //   797: sipush #17600
    //   800: sipush #-647
    //   803: invokestatic a : (II)Ljava/lang/String;
    //   806: aload_1
    //   807: invokeinterface getIn : ()Ljava/lang/String;
    //   812: invokevirtual equals : (Ljava/lang/Object;)Z
    //   815: ifeq -> 833
    //   818: aload_3
    //   819: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.SIMPLE : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   822: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;)V
    //   825: aload_3
    //   826: iconst_0
    //   827: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   830: invokevirtual setExplode : (Ljava/lang/Boolean;)V
    //   833: aload #6
    //   835: invokeinterface getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   840: astore #9
    //   842: aload_0
    //   843: aload #9
    //   845: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   848: astore #10
    //   850: aload #7
    //   852: aload #10
    //   854: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   857: aload #6
    //   859: invokeinterface getMaxItems : ()Ljava/lang/Integer;
    //   864: ifnull -> 879
    //   867: aload #7
    //   869: aload #6
    //   871: invokeinterface getMaxItems : ()Ljava/lang/Integer;
    //   876: invokevirtual setMaxItems : (Ljava/lang/Integer;)V
    //   879: aload #6
    //   881: invokeinterface getMinItems : ()Ljava/lang/Integer;
    //   886: ifnull -> 901
    //   889: aload #7
    //   891: aload #6
    //   893: invokeinterface getMinItems : ()Ljava/lang/Integer;
    //   898: invokevirtual setMinItems : (Ljava/lang/Integer;)V
    //   901: aload #6
    //   903: invokeinterface isUniqueItems : ()Ljava/lang/Boolean;
    //   908: ifnull -> 923
    //   911: aload #7
    //   913: aload #6
    //   915: invokeinterface isUniqueItems : ()Ljava/lang/Boolean;
    //   920: invokevirtual setUniqueItems : (Ljava/lang/Boolean;)V
    //   923: aload #7
    //   925: astore #5
    //   927: goto -> 1089
    //   930: aload #6
    //   932: invokeinterface getType : ()Ljava/lang/String;
    //   937: aload #6
    //   939: invokeinterface getFormat : ()Ljava/lang/String;
    //   944: invokestatic createSchema : (Ljava/lang/String;Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   947: astore #5
    //   949: aload #5
    //   951: aload #6
    //   953: invokeinterface getType : ()Ljava/lang/String;
    //   958: invokevirtual setType : (Ljava/lang/String;)V
    //   961: aload #5
    //   963: aload #6
    //   965: invokeinterface getFormat : ()Ljava/lang/String;
    //   970: invokevirtual setFormat : (Ljava/lang/String;)V
    //   973: aload #5
    //   975: aload #6
    //   977: invokeinterface getMaximum : ()Ljava/math/BigDecimal;
    //   982: invokevirtual setMaximum : (Ljava/math/BigDecimal;)V
    //   985: aload #5
    //   987: aload #6
    //   989: invokeinterface isExclusiveMaximum : ()Ljava/lang/Boolean;
    //   994: invokevirtual setExclusiveMaximum : (Ljava/lang/Boolean;)V
    //   997: aload #5
    //   999: aload #6
    //   1001: invokeinterface getMinimum : ()Ljava/math/BigDecimal;
    //   1006: invokevirtual setMinimum : (Ljava/math/BigDecimal;)V
    //   1009: aload #5
    //   1011: aload #6
    //   1013: invokeinterface isExclusiveMinimum : ()Ljava/lang/Boolean;
    //   1018: invokevirtual setExclusiveMinimum : (Ljava/lang/Boolean;)V
    //   1021: aload #5
    //   1023: aload #6
    //   1025: invokeinterface getMinLength : ()Ljava/lang/Integer;
    //   1030: invokevirtual setMinLength : (Ljava/lang/Integer;)V
    //   1033: aload #5
    //   1035: aload #6
    //   1037: invokeinterface getMaxLength : ()Ljava/lang/Integer;
    //   1042: invokevirtual setMaxLength : (Ljava/lang/Integer;)V
    //   1045: aload #6
    //   1047: invokeinterface getMultipleOf : ()Ljava/lang/Number;
    //   1052: ifnull -> 1077
    //   1055: aload #5
    //   1057: new java/math/BigDecimal
    //   1060: dup
    //   1061: aload #6
    //   1063: invokeinterface getMultipleOf : ()Ljava/lang/Number;
    //   1068: invokevirtual toString : ()Ljava/lang/String;
    //   1071: invokespecial <init> : (Ljava/lang/String;)V
    //   1074: invokevirtual setMultipleOf : (Ljava/math/BigDecimal;)V
    //   1077: aload #5
    //   1079: aload #6
    //   1081: invokeinterface getPattern : ()Ljava/lang/String;
    //   1086: invokevirtual setPattern : (Ljava/lang/String;)V
    //   1089: aload #6
    //   1091: invokeinterface getEnum : ()Ljava/util/List;
    //   1096: ifnull -> 1364
    //   1099: aload #6
    //   1101: invokeinterface getEnum : ()Ljava/util/List;
    //   1106: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1111: astore #7
    //   1113: aload #7
    //   1115: invokeinterface hasNext : ()Z
    //   1120: ifeq -> 1364
    //   1123: aload #7
    //   1125: invokeinterface next : ()Ljava/lang/Object;
    //   1130: checkcast java/lang/String
    //   1133: astore #8
    //   1135: aload #6
    //   1137: invokeinterface getType : ()Ljava/lang/String;
    //   1142: ifnonnull -> 1157
    //   1145: sipush #17629
    //   1148: sipush #-30242
    //   1151: invokestatic a : (II)Ljava/lang/String;
    //   1154: goto -> 1164
    //   1157: aload #6
    //   1159: invokeinterface getType : ()Ljava/lang/String;
    //   1164: astore #9
    //   1166: iconst_m1
    //   1167: istore #10
    //   1169: aload #9
    //   1171: invokevirtual hashCode : ()I
    //   1174: lookupswitch default -> 1276, -1034364087 -> 1232, 64711720 -> 1256, 1958052158 -> 1208
    //   1208: aload #9
    //   1210: sipush #17601
    //   1213: sipush #-30397
    //   1216: invokestatic a : (II)Ljava/lang/String;
    //   1219: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1222: ifeq -> 1276
    //   1225: iconst_0
    //   1226: istore #10
    //   1228: aload_2
    //   1229: ifnull -> 1276
    //   1232: aload #9
    //   1234: sipush #17623
    //   1237: sipush #-1389
    //   1240: invokestatic a : (II)Ljava/lang/String;
    //   1243: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1246: ifeq -> 1276
    //   1249: iconst_1
    //   1250: istore #10
    //   1252: aload_2
    //   1253: ifnull -> 1276
    //   1256: aload #9
    //   1258: sipush #17651
    //   1261: sipush #-21971
    //   1264: invokestatic a : (II)Ljava/lang/String;
    //   1267: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1270: ifeq -> 1276
    //   1273: iconst_2
    //   1274: istore #10
    //   1276: iload #10
    //   1278: tableswitch default -> 1353, 0 -> 1304, 1 -> 1321, 2 -> 1339
    //   1304: aload #5
    //   1306: aload #8
    //   1308: invokestatic parseInt : (Ljava/lang/String;)I
    //   1311: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1314: invokevirtual addEnumItemObject : (Ljava/lang/Object;)V
    //   1317: aload_2
    //   1318: ifnull -> 1360
    //   1321: aload #5
    //   1323: new java/math/BigDecimal
    //   1326: dup
    //   1327: aload #8
    //   1329: invokespecial <init> : (Ljava/lang/String;)V
    //   1332: invokevirtual addEnumItemObject : (Ljava/lang/Object;)V
    //   1335: aload_2
    //   1336: ifnull -> 1360
    //   1339: aload #5
    //   1341: aload #8
    //   1343: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Boolean;
    //   1346: invokevirtual addEnumItemObject : (Ljava/lang/Object;)V
    //   1349: aload_2
    //   1350: ifnull -> 1360
    //   1353: aload #5
    //   1355: aload #8
    //   1357: invokevirtual addEnumItemObject : (Ljava/lang/Object;)V
    //   1360: aload_2
    //   1361: ifnull -> 1113
    //   1364: aload #6
    //   1366: invokeinterface getVendorExtensions : ()Ljava/util/Map;
    //   1371: ifnull -> 1412
    //   1374: aload #6
    //   1376: invokeinterface getVendorExtensions : ()Ljava/util/Map;
    //   1381: sipush #17663
    //   1384: sipush #15314
    //   1387: invokestatic a : (II)Ljava/lang/String;
    //   1390: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1395: astore #7
    //   1397: aload #7
    //   1399: ifnull -> 1412
    //   1402: aload #5
    //   1404: aload #7
    //   1406: checkcast java/lang/Boolean
    //   1409: invokevirtual setNullable : (Ljava/lang/Boolean;)V
    //   1412: aload #5
    //   1414: aload_0
    //   1415: aload #6
    //   1417: invokeinterface getVendorExtensions : ()Ljava/util/Map;
    //   1422: invokevirtual convert : (Ljava/util/Map;)Ljava/util/Map;
    //   1425: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   1428: aload #6
    //   1430: instanceof net/portswigger/swagger/v1/models/parameters/AbstractSerializableParameter
    //   1433: ifeq -> 1453
    //   1436: aload #6
    //   1438: checkcast net/portswigger/swagger/v1/models/parameters/AbstractSerializableParameter
    //   1441: astore #7
    //   1443: aload #5
    //   1445: aload #7
    //   1447: invokevirtual getDefault : ()Ljava/lang/Object;
    //   1450: invokevirtual setDefault : (Ljava/lang/Object;)V
    //   1453: aload_1
    //   1454: invokeinterface getRequired : ()Z
    //   1459: ifeq -> 1475
    //   1462: aload_3
    //   1463: aload_1
    //   1464: invokeinterface getRequired : ()Z
    //   1469: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1472: invokevirtual setRequired : (Ljava/lang/Boolean;)V
    //   1475: aload_3
    //   1476: aload #5
    //   1478: invokevirtual setSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   1481: aload_3
    //   1482: aload_0
    //   1483: aload_1
    //   1484: invokeinterface getVendorExtensions : ()Ljava/util/Map;
    //   1489: invokevirtual convert : (Ljava/util/Map;)Ljava/util/Map;
    //   1492: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   1495: aload_3
    //   1496: areturn
  }
  
  private Schema convert(Model paramModel) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_1
    //   11: invokeinterface getBooleanValue : ()Ljava/lang/Boolean;
    //   16: ifnull -> 36
    //   19: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: aload_1
    //   27: invokeinterface getBooleanValue : ()Ljava/lang/Boolean;
    //   32: invokevirtual booleanSchemaValue : (Ljava/lang/Boolean;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   35: areturn
    //   36: aload_1
    //   37: instanceof net/portswigger/swagger/v1/models/ArrayModel
    //   40: ifeq -> 80
    //   43: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   46: aload_1
    //   47: ldc net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   49: invokevirtual Zb : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   52: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   55: astore #4
    //   57: aload #4
    //   59: aload_0
    //   60: aload_1
    //   61: checkcast net/portswigger/swagger/v1/models/ArrayModel
    //   64: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   67: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   70: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   73: aload #4
    //   75: astore_3
    //   76: aload_2
    //   77: ifnull -> 503
    //   80: aload_1
    //   81: instanceof net/portswigger/swagger/v1/models/ComposedModel
    //   84: ifeq -> 237
    //   87: aload_1
    //   88: checkcast net/portswigger/swagger/v1/models/ComposedModel
    //   91: astore #4
    //   93: new net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   96: dup
    //   97: invokespecial <init> : ()V
    //   100: astore #5
    //   102: aload #5
    //   104: aload #4
    //   106: invokevirtual getDescription : ()Ljava/lang/String;
    //   109: invokevirtual setDescription : (Ljava/lang/String;)V
    //   112: aload #4
    //   114: invokevirtual getExample : ()Ljava/lang/Object;
    //   117: ifnull -> 130
    //   120: aload #5
    //   122: aload #4
    //   124: invokevirtual getExample : ()Ljava/lang/Object;
    //   127: invokevirtual setExample : (Ljava/lang/Object;)V
    //   130: aload #4
    //   132: invokevirtual getExternalDocs : ()Lnet/portswigger/swagger/v1/models/ExternalDocs;
    //   135: ifnull -> 152
    //   138: aload #5
    //   140: aload_0
    //   141: aload #4
    //   143: invokevirtual getExternalDocs : ()Lnet/portswigger/swagger/v1/models/ExternalDocs;
    //   146: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/ExternalDocs;)Lnet/portswigger/swagger/v3/oas/models/ExternalDocumentation;
    //   149: invokevirtual setExternalDocs : (Lnet/portswigger/swagger/v3/oas/models/ExternalDocumentation;)V
    //   152: aload #5
    //   154: aload #4
    //   156: invokevirtual getTitle : ()Ljava/lang/String;
    //   159: invokevirtual setTitle : (Ljava/lang/String;)V
    //   162: aload #5
    //   164: aload_0
    //   165: aload #4
    //   167: invokevirtual getVendorExtensions : ()Ljava/util/Map;
    //   170: invokevirtual convert : (Ljava/util/Map;)Ljava/util/Map;
    //   173: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   176: aload #5
    //   178: aload #4
    //   180: invokevirtual getAllOf : ()Ljava/util/List;
    //   183: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   188: aload_0
    //   189: <illegal opcode> apply : (Lnet/portswigger/swagger/v2/SwaggerConverter;)Ljava/util/function/Function;
    //   194: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   199: invokestatic toList : ()Ljava/util/stream/Collector;
    //   202: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   207: checkcast java/util/List
    //   210: invokevirtual setAllOf : (Ljava/util/List;)V
    //   213: aload #5
    //   215: aload #4
    //   217: invokevirtual getRequired : ()Ljava/util/List;
    //   220: invokevirtual setRequired : (Ljava/util/List;)V
    //   223: aload_0
    //   224: aload_1
    //   225: aload #5
    //   227: invokevirtual addProperties : (Lnet/portswigger/swagger/v1/models/Model;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   230: aload #5
    //   232: astore_3
    //   233: aload_2
    //   234: ifnull -> 503
    //   237: aconst_null
    //   238: astore #4
    //   240: aload_1
    //   241: instanceof net/portswigger/swagger/v1/models/ModelImpl
    //   244: ifeq -> 266
    //   247: aload_1
    //   248: checkcast net/portswigger/swagger/v1/models/ModelImpl
    //   251: astore #5
    //   253: aload #5
    //   255: invokevirtual getDiscriminator : ()Ljava/lang/String;
    //   258: astore #4
    //   260: aload #5
    //   262: aconst_null
    //   263: invokevirtual setDiscriminator : (Ljava/lang/String;)V
    //   266: aload_1
    //   267: instanceof net/portswigger/swagger/v1/models/ModelImpl
    //   270: ifeq -> 312
    //   273: sipush #17607
    //   276: sipush #-18940
    //   279: invokestatic a : (II)Ljava/lang/String;
    //   282: aload_1
    //   283: checkcast net/portswigger/swagger/v1/models/ModelImpl
    //   286: invokevirtual getType : ()Ljava/lang/String;
    //   289: invokevirtual equals : (Ljava/lang/Object;)Z
    //   292: ifeq -> 312
    //   295: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   298: aload_1
    //   299: ldc net/portswigger/swagger/v3/oas/models/media/FileSchema
    //   301: invokevirtual Zb : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   304: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   307: astore_3
    //   308: aload_2
    //   309: ifnull -> 325
    //   312: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   315: aload_1
    //   316: ldc net/portswigger/swagger/v3/oas/models/media/Schema
    //   318: invokevirtual Zb : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   321: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   324: astore_3
    //   325: aload_0
    //   326: aload_1
    //   327: aload_3
    //   328: invokevirtual addProperties : (Lnet/portswigger/swagger/v1/models/Model;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   331: aload_1
    //   332: instanceof net/portswigger/swagger/v1/models/ModelImpl
    //   335: ifeq -> 400
    //   338: aload_1
    //   339: checkcast net/portswigger/swagger/v1/models/ModelImpl
    //   342: astore #5
    //   344: aload #5
    //   346: invokevirtual getAdditionalProperties : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   349: ifnull -> 396
    //   352: aload #5
    //   354: invokevirtual getAdditionalProperties : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   357: invokeinterface getBooleanValue : ()Ljava/lang/Boolean;
    //   362: ifnull -> 383
    //   365: aload_3
    //   366: aload #5
    //   368: invokevirtual getAdditionalProperties : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   371: invokeinterface getBooleanValue : ()Ljava/lang/Boolean;
    //   376: invokevirtual setAdditionalProperties : (Ljava/lang/Object;)V
    //   379: aload_2
    //   380: ifnull -> 396
    //   383: aload_3
    //   384: aload_0
    //   385: aload #5
    //   387: invokevirtual getAdditionalProperties : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   390: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   393: invokevirtual setAdditionalProperties : (Ljava/lang/Object;)V
    //   396: aload_2
    //   397: ifnull -> 476
    //   400: aload_1
    //   401: instanceof net/portswigger/swagger/v1/models/RefModel
    //   404: ifeq -> 476
    //   407: aload_1
    //   408: checkcast net/portswigger/swagger/v1/models/RefModel
    //   411: astore #5
    //   413: aload #5
    //   415: invokevirtual get$ref : ()Ljava/lang/String;
    //   418: sipush #17625
    //   421: sipush #-30735
    //   424: invokestatic a : (II)Ljava/lang/String;
    //   427: invokevirtual indexOf : (Ljava/lang/String;)I
    //   430: ifne -> 476
    //   433: aload #5
    //   435: invokevirtual get$ref : ()Ljava/lang/String;
    //   438: sipush #17625
    //   441: sipush #-30735
    //   444: invokestatic a : (II)Ljava/lang/String;
    //   447: invokevirtual length : ()I
    //   450: invokevirtual substring : (I)Ljava/lang/String;
    //   453: sipush #17615
    //   456: sipush #-22862
    //   459: invokestatic a : (II)Ljava/lang/String;
    //   462: swap
    //   463: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   468: astore #6
    //   470: aload_3
    //   471: aload #6
    //   473: invokevirtual set$ref : (Ljava/lang/String;)V
    //   476: aload #4
    //   478: ifnull -> 503
    //   481: new net/portswigger/swagger/v3/oas/models/media/Discriminator
    //   484: dup
    //   485: invokespecial <init> : ()V
    //   488: astore #5
    //   490: aload #5
    //   492: aload #4
    //   494: invokevirtual setPropertyName : (Ljava/lang/String;)V
    //   497: aload_3
    //   498: aload #5
    //   500: invokevirtual setDiscriminator : (Lnet/portswigger/swagger/v3/oas/models/media/Discriminator;)V
    //   503: aload_1
    //   504: invokeinterface getVendorExtensions : ()Ljava/util/Map;
    //   509: ifnull -> 548
    //   512: aload_1
    //   513: invokeinterface getVendorExtensions : ()Ljava/util/Map;
    //   518: sipush #17663
    //   521: sipush #15314
    //   524: invokestatic a : (II)Ljava/lang/String;
    //   527: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   532: astore #4
    //   534: aload #4
    //   536: ifnull -> 548
    //   539: aload_3
    //   540: aload #4
    //   542: checkcast java/lang/Boolean
    //   545: invokevirtual setNullable : (Ljava/lang/Boolean;)V
    //   548: aload_3
    //   549: areturn
  }
  
  private void addProperties(Model paramModel, Schema paramSchema) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface getProperties : ()Ljava/util/Map;
    //   6: ifnull -> 43
    //   9: aload_1
    //   10: invokeinterface getProperties : ()Ljava/util/Map;
    //   15: invokeinterface size : ()I
    //   20: ifle -> 43
    //   23: aload_1
    //   24: invokeinterface getProperties : ()Ljava/util/Map;
    //   29: astore_3
    //   30: aload_3
    //   31: aload_0
    //   32: aload_2
    //   33: <illegal opcode> accept : (Lnet/portswigger/swagger/v2/SwaggerConverter;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Ljava/util/function/BiConsumer;
    //   38: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   43: return
  }
  
  private void lambda$addProperties$8(Schema paramSchema, String paramString, Property paramProperty) {
    paramSchema.addProperties(paramString, convert(paramProperty));
  }
  
  private void lambda$convert$7(Map<String, Schema> paramMap, String paramString, Property paramProperty) {
    paramMap.put(paramString, convert(paramProperty));
  }
  
  private void lambda$convertHeaders$6(Map<String, Header> paramMap, String paramString, Property paramProperty) {
    paramMap.put(paramString, convertHeader(paramProperty));
  }
  
  private static void lambda$convertExamples$5(Content paramContent, Object paramObject1, Object paramObject2) {
    MediaType mediaType = (MediaType)paramContent.get(paramObject1);
    if (mediaType == null) {
      mediaType = new MediaType();
      paramContent.addMediaType(paramObject1.toString(), mediaType);
    } 
    mediaType.setExample(paramObject2);
  }
  
  private static boolean lambda$convert$4(Map.Entry paramEntry) {
    return (((String)paramEntry.getKey()).equals(a(17612, 8488)) || ((String)paramEntry.getKey()).equals(a(17661, 31478)) || ((String)paramEntry.getKey()).equals(a(17603, -25828)));
  }
  
  private static void lambda$convert$3(RequestBody paramRequestBody, String paramString, MediaType paramMediaType) {
    Schema schema = paramMediaType.getSchema();
    if (schema != null && schema.getRequired() != null && schema.getRequired().size() > 0)
      paramRequestBody.setRequired(Boolean.TRUE); 
  }
  
  private void lambda$convert$2(String paramString, SecuritySchemeDefinition paramSecuritySchemeDefinition) {
    this.components.addSecuritySchemes(paramString, convert(paramSecuritySchemeDefinition));
  }
  
  private void lambda$convert$1(String paramString, Response paramResponse) {
    this.components.addResponses(paramString, convert(paramResponse));
  }
  
  private void lambda$convert$0(String paramString, Parameter paramParameter) {
    // Byte code:
    //   0: sipush #17617
    //   3: invokestatic ZG : ()[Ljava/lang/String;
    //   6: astore_3
    //   7: sipush #-30107
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: aload_2
    //   14: invokeinterface getIn : ()Ljava/lang/String;
    //   19: invokevirtual equals : (Ljava/lang/Object;)Z
    //   22: ifeq -> 43
    //   25: aload_0
    //   26: getfield components : Lnet/portswigger/swagger/v3/oas/models/Components;
    //   29: aload_1
    //   30: aload_0
    //   31: aload_2
    //   32: invokevirtual convertParameterToRequestBody : (Lnet/portswigger/swagger/v1/models/parameters/Parameter;)Lnet/portswigger/swagger/v3/oas/models/parameters/RequestBody;
    //   35: invokevirtual addRequestBodies : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/parameters/RequestBody;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   38: pop
    //   39: aload_3
    //   40: ifnull -> 111
    //   43: sipush #17620
    //   46: sipush #11462
    //   49: invokestatic a : (II)Ljava/lang/String;
    //   52: aload_2
    //   53: invokeinterface getIn : ()Ljava/lang/String;
    //   58: invokevirtual equals : (Ljava/lang/Object;)Z
    //   61: ifeq -> 97
    //   64: aload_0
    //   65: getfield components : Lnet/portswigger/swagger/v3/oas/models/Components;
    //   68: aload_1
    //   69: sipush #17638
    //   72: sipush #-5390
    //   75: invokestatic a : (II)Ljava/lang/String;
    //   78: swap
    //   79: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   84: aload_0
    //   85: aload_2
    //   86: invokevirtual convertFormDataToSchema : (Lnet/portswigger/swagger/v1/models/parameters/Parameter;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   89: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   92: pop
    //   93: aload_3
    //   94: ifnull -> 111
    //   97: aload_0
    //   98: getfield components : Lnet/portswigger/swagger/v3/oas/models/Components;
    //   101: aload_1
    //   102: aload_0
    //   103: aload_2
    //   104: invokevirtual convert : (Lnet/portswigger/swagger/v1/models/parameters/Parameter;)Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter;
    //   107: invokevirtual addParameters : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   110: pop
    //   111: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #63
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'wñò@kýöçR`¯µ§õ/.ô¯ÜãÓ]µâÝ'KfyÛÈ±ÍXÕÖ5üÏG¯\\t¸«bÎVÄ5©ß!Æ\\t^Sëì²PÍ2z-bÿ\\r±C0çE13¥&ì\\tuX aouÎ!\\bAoBéHB?è¿¹éáVv+dFcÓÄé\\b÷vç~ÿç_p[<0\\nÏ;z~Ôà`6L÷Öí¤ELgËbÆUç\\nMóæ w >Úþé~P\\fù}^ÔëøãåqÑHcxÝò¥HGæßqOBÅëUµÆ{\\boå¶¯>çÜ\\nÜÁjzeÛSÙR©Y\\rìp7ùN¢ÅëUÄ$¦2Ã-%\\t @D}3µ{I^wØøZ<½Þ«³b¾o \\t<âR°*.þvâ-â*x)ÌðÖâ½¶\\bm¼ÒQËÖ\\npÀv÷¡DJ©,Õ@¹Ã=WUß¹ü§»ú¯jeéñxb¯Ï }¬v4M\\nÞÍ£eÃ\\f¨\\b}Äô«Ü¶4»¹ÄHb)=×(¹È¬!VñÄÏ¤t/=§{\\b_\\t½lÝæD<«æüm½îzFw;/ºÚJè\\r!]aOR1£·HÍ^7\\f«ìÌÏÚ"Ë¯\\bÎAWBé¨B¿[V\\rªõÀc³UÖ*Byþs\\fSæò~r¾5I\$"'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #58
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'È6" ¹ÔÒø_èï$Z¦­¹e`¯l­.'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #7
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic net/portswigger/swagger/v2/SwaggerConverter.a : [Ljava/lang/String;
    //   130: bipush #63
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/swagger/v2/SwaggerConverter.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #72
    //   214: goto -> 244
    //   217: bipush #84
    //   219: goto -> 244
    //   222: bipush #34
    //   224: goto -> 244
    //   227: bipush #114
    //   229: goto -> 244
    //   232: bipush #42
    //   234: goto -> 244
    //   237: bipush #51
    //   239: goto -> 244
    //   242: bipush #24
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x44EC) & 0xFFFF;
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
      char c = '´';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v2\SwaggerConverter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */