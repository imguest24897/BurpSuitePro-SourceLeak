package net.portswigger.swagger.v2.util;

import burp.Zbqc;
import com.fasterxml.Zb.Zm;
import com.fasterxml.Zb.Zmi;
import com.fasterxml.Zor.Za;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zy6;
import com.fasterxml.Zor.Zyp;
import com.fasterxml.Zqg;
import com.fasterxml.Zv.Zf;
import com.fasterxml.Zv.Zu;
import com.fasterxml.Zyf;
import java.util.LinkedHashMap;
import net.portswigger.swagger.v3.core.jackson.mixin.ComponentsMixin;
import net.portswigger.swagger.v3.core.jackson.mixin.DateSchemaMixin;
import net.portswigger.swagger.v3.core.jackson.mixin.DiscriminatorMixin;
import net.portswigger.swagger.v3.core.jackson.mixin.ExampleMixin;
import net.portswigger.swagger.v3.core.jackson.mixin.ExtensionsMixin;
import net.portswigger.swagger.v3.core.jackson.mixin.InfoMixin;
import net.portswigger.swagger.v3.core.jackson.mixin.LicenseMixin;
import net.portswigger.swagger.v3.core.jackson.mixin.MediaTypeMixin;
import net.portswigger.swagger.v3.core.jackson.mixin.OpenAPIMixin;
import net.portswigger.swagger.v3.core.jackson.mixin.OperationMixin;
import net.portswigger.swagger.v3.core.jackson.mixin.SchemaConverterMixin;
import net.portswigger.swagger.v3.core.jackson.mixin.SchemaMixin;
import net.portswigger.swagger.v3.oas.models.Components;
import net.portswigger.swagger.v3.oas.models.ExternalDocumentation;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.Operation;
import net.portswigger.swagger.v3.oas.models.PathItem;
import net.portswigger.swagger.v3.oas.models.Paths;
import net.portswigger.swagger.v3.oas.models.callbacks.Callback;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.oas.models.headers.Header;
import net.portswigger.swagger.v3.oas.models.info.Contact;
import net.portswigger.swagger.v3.oas.models.info.Info;
import net.portswigger.swagger.v3.oas.models.info.License;
import net.portswigger.swagger.v3.oas.models.links.Link;
import net.portswigger.swagger.v3.oas.models.links.LinkParameter;
import net.portswigger.swagger.v3.oas.models.media.DateSchema;
import net.portswigger.swagger.v3.oas.models.media.Discriminator;
import net.portswigger.swagger.v3.oas.models.media.Encoding;
import net.portswigger.swagger.v3.oas.models.media.EncodingProperty;
import net.portswigger.swagger.v3.oas.models.media.MediaType;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.media.XML;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.oas.models.parameters.RequestBody;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponse;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponses;
import net.portswigger.swagger.v3.oas.models.security.OAuthFlow;
import net.portswigger.swagger.v3.oas.models.security.OAuthFlows;
import net.portswigger.swagger.v3.oas.models.security.Scopes;
import net.portswigger.swagger.v3.oas.models.security.SecurityScheme;
import net.portswigger.swagger.v3.oas.models.servers.Server;
import net.portswigger.swagger.v3.oas.models.servers.ServerVariable;
import net.portswigger.swagger.v3.oas.models.servers.ServerVariables;
import net.portswigger.swagger.v3.oas.models.tags.Tag;

public class ObjectMapperFactory {
  private static final String a;
  
  public static Zy6 createJson(Zmi paramZmi) {
    return create(paramZmi);
  }
  
  public static Zy6 createJson() {
    return create(null);
  }
  
  public static Zy6 createYaml(Zf paramZf) {
    return create((Zmi)paramZf);
  }
  
  public static Zy6 createYaml() {
    Zf zf = new Zf();
    zf.ZC(Zu.WRITE_DOC_START_MARKER);
    zf.Zz(Zu.MINIMIZE_QUOTES);
    zf.Zz(Zu.SPLIT_LINES);
    zf.Zz(Zu.ALWAYS_QUOTE_NUMBERS_AS_STRINGS);
    return create((Zmi)zf);
  }
  
  private static Zy6 create(Zmi paramZmi) {
    Zy6 zy6 = (paramZmi == null) ? new Zy6() : new Zy6(paramZmi);
    zy6.Z_(new Zm[] { Zm.ALLOW_TRAILING_COMMA });
    zy6.Z_(new Zm[] { Zm.ALLOW_COMMENTS });
    zy6.ZF((Za)new ObjectMapperFactory$1());
    DeserializationModule deserializationModule = new DeserializationModule();
    zy6.ZF((Za)deserializationModule);
    zy6.ZF((Za)new Zyf());
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put(ApiResponses.class, ExtensionsMixin.class);
    linkedHashMap.put(Contact.class, ExtensionsMixin.class);
    linkedHashMap.put(Encoding.class, ExtensionsMixin.class);
    linkedHashMap.put(EncodingProperty.class, ExtensionsMixin.class);
    linkedHashMap.put(Example.class, ExampleMixin.class);
    linkedHashMap.put(ExternalDocumentation.class, ExtensionsMixin.class);
    linkedHashMap.put(Link.class, ExtensionsMixin.class);
    linkedHashMap.put(LinkParameter.class, ExtensionsMixin.class);
    linkedHashMap.put(MediaType.class, MediaTypeMixin.class);
    linkedHashMap.put(OAuthFlow.class, ExtensionsMixin.class);
    linkedHashMap.put(OAuthFlows.class, ExtensionsMixin.class);
    linkedHashMap.put(Operation.class, OperationMixin.class);
    linkedHashMap.put(PathItem.class, ExtensionsMixin.class);
    linkedHashMap.put(Paths.class, ExtensionsMixin.class);
    linkedHashMap.put(Scopes.class, ExtensionsMixin.class);
    linkedHashMap.put(Server.class, ExtensionsMixin.class);
    linkedHashMap.put(ServerVariable.class, ExtensionsMixin.class);
    linkedHashMap.put(ServerVariables.class, ExtensionsMixin.class);
    linkedHashMap.put(Tag.class, ExtensionsMixin.class);
    linkedHashMap.put(XML.class, ExtensionsMixin.class);
    linkedHashMap.put(ApiResponse.class, ExtensionsMixin.class);
    linkedHashMap.put(Parameter.class, ExtensionsMixin.class);
    linkedHashMap.put(RequestBody.class, ExtensionsMixin.class);
    linkedHashMap.put(Header.class, ExtensionsMixin.class);
    linkedHashMap.put(SecurityScheme.class, ExtensionsMixin.class);
    linkedHashMap.put(Callback.class, ExtensionsMixin.class);
    linkedHashMap.put(Schema.class, SchemaMixin.class);
    linkedHashMap.put(DateSchema.class, DateSchemaMixin.class);
    linkedHashMap.put(Components.class, ComponentsMixin.class);
    linkedHashMap.put(Info.class, InfoMixin.class);
    linkedHashMap.put(License.class, LicenseMixin.class);
    linkedHashMap.put(OpenAPI.class, OpenAPIMixin.class);
    linkedHashMap.put(Discriminator.class, DiscriminatorMixin.class);
    zy6.Zd(linkedHashMap);
    zy6.ZO(Zy0.FAIL_ON_EMPTY_BEANS, false);
    zy6.ZO(Zy0.WRITE_DATES_AS_TIMESTAMPS, false);
    zy6.ZO(Zy0.WRITE_ENUMS_USING_TO_STRING, true);
    zy6.ZZ(Zyp.FAIL_ON_UNKNOWN_PROPERTIES, false);
    zy6.ZO(Zy0.WRITE_NULL_MAP_VALUES, false);
    zy6.ZO(Zy0.WRITE_BIGDECIMAL_AS_PLAIN, true);
    zy6.ZQ(Zqg.NON_NULL);
    return zy6;
  }
  
  public static Zy6 createJsonConverter() {
    Zy6 zy6 = new Zy6();
    DeserializationModule deserializationModule = new DeserializationModule();
    zy6.ZF((Za)deserializationModule);
    zy6.ZF((Za)new Zyf());
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put(ApiResponses.class, ExtensionsMixin.class);
    linkedHashMap.put(ApiResponse.class, ExtensionsMixin.class);
    linkedHashMap.put(Callback.class, ExtensionsMixin.class);
    linkedHashMap.put(Components.class, ComponentsMixin.class);
    linkedHashMap.put(Contact.class, ExtensionsMixin.class);
    linkedHashMap.put(Encoding.class, ExtensionsMixin.class);
    linkedHashMap.put(EncodingProperty.class, ExtensionsMixin.class);
    linkedHashMap.put(Example.class, ExampleMixin.class);
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    linkedHashMap.put(ExternalDocumentation.class, ExtensionsMixin.class);
    linkedHashMap.put(Header.class, ExtensionsMixin.class);
    linkedHashMap.put(Info.class, ExtensionsMixin.class);
    linkedHashMap.put(License.class, ExtensionsMixin.class);
    linkedHashMap.put(Link.class, ExtensionsMixin.class);
    linkedHashMap.put(LinkParameter.class, ExtensionsMixin.class);
    linkedHashMap.put(MediaType.class, MediaTypeMixin.class);
    linkedHashMap.put(OAuthFlow.class, ExtensionsMixin.class);
    linkedHashMap.put(OAuthFlows.class, ExtensionsMixin.class);
    linkedHashMap.put(OpenAPI.class, OpenAPIMixin.class);
    linkedHashMap.put(Operation.class, OperationMixin.class);
    linkedHashMap.put(Parameter.class, ExtensionsMixin.class);
    linkedHashMap.put(PathItem.class, ExtensionsMixin.class);
    linkedHashMap.put(Paths.class, ExtensionsMixin.class);
    linkedHashMap.put(RequestBody.class, ExtensionsMixin.class);
    linkedHashMap.put(Scopes.class, ExtensionsMixin.class);
    linkedHashMap.put(SecurityScheme.class, ExtensionsMixin.class);
    linkedHashMap.put(Server.class, ExtensionsMixin.class);
    linkedHashMap.put(ServerVariable.class, ExtensionsMixin.class);
    linkedHashMap.put(ServerVariables.class, ExtensionsMixin.class);
    linkedHashMap.put(Tag.class, ExtensionsMixin.class);
    linkedHashMap.put(XML.class, ExtensionsMixin.class);
    linkedHashMap.put(Schema.class, SchemaConverterMixin.class);
    zy6.Zd(linkedHashMap);
    zy6.ZO(Zy0.FAIL_ON_EMPTY_BEANS, false);
    zy6.ZO(Zy0.WRITE_DATES_AS_TIMESTAMPS, false);
    zy6.ZO(Zy0.WRITE_ENUMS_USING_TO_STRING, true);
    zy6.ZZ(Zyp.FAIL_ON_UNKNOWN_PROPERTIES, false);
    zy6.ZO(Zy0.WRITE_NULL_MAP_VALUES, false);
    zy6.ZO(Zy0.WRITE_BIGDECIMAL_AS_PLAIN, true);
    zy6.ZQ(Zqg.NON_NULL);
    if (Zbqc.Zwu() == null)
      RefUtils.Zc(new Zbqc[5]); 
    return zy6;
  }
  
  public static Zy6 buildStrictGenericObjectMapper() {
    Zy6 zy6 = new Zy6();
    zy6.ZO(Zy0.FAIL_ON_EMPTY_BEANS, false);
    zy6.ZO(Zy0.WRITE_DATES_AS_TIMESTAMPS, false);
    zy6.ZO(Zy0.WRITE_ENUMS_USING_TO_STRING, true);
    zy6.ZZ(Zyp.FAIL_ON_UNKNOWN_PROPERTIES, false);
    zy6.ZO(Zy0.WRITE_NULL_MAP_VALUES, false);
    try {
      zy6.ZZ(Zyp.valueOf(a), true);
    } catch (Throwable throwable) {}
    zy6.ZQ(Zqg.NON_NULL);
    return zy6;
  }
  
  static {
    // Byte code:
    //   0: bipush #71
    //   2: ldc '\\nU_Y0k@RO3lSGI4`G'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/swagger/v2/util/ObjectMapperFactory.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #11
    //   82: goto -> 112
    //   85: bipush #83
    //   87: goto -> 112
    //   90: bipush #15
    //   92: goto -> 112
    //   95: bipush #84
    //   97: goto -> 112
    //   100: bipush #65
    //   102: goto -> 112
    //   105: bipush #56
    //   107: goto -> 112
    //   110: bipush #98
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\ObjectMapperFactory.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */