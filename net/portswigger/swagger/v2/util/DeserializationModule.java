package net.portswigger.swagger.v2.util;

import com.fasterxml.Zu.Zq;
import net.portswigger.swagger.v3.oas.models.Paths;
import net.portswigger.swagger.v3.oas.models.callbacks.Callback;
import net.portswigger.swagger.v3.oas.models.headers.Header;
import net.portswigger.swagger.v3.oas.models.media.Encoding;
import net.portswigger.swagger.v3.oas.models.media.EncodingProperty;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponses;
import net.portswigger.swagger.v3.oas.models.security.SecurityScheme;

public class DeserializationModule extends Zq {
  public DeserializationModule() {
    ZZ(Schema.class, new ModelDeserializer());
    ZZ(Parameter.class, new ParameterDeserializer());
    ZZ(Header.StyleEnum.class, new HeaderStyleEnumDeserializer());
    ZZ(Encoding.StyleEnum.class, new EncodingStyleEnumDeserializer());
    ZZ(EncodingProperty.StyleEnum.class, new EncodingPropertyStyleEnumDeserializer());
    ZZ(SecurityScheme.class, new SecuritySchemeDeserializer());
    ZZ(ApiResponses.class, new ApiResponsesDeserializer());
    ZZ(Paths.class, new PathsDeserializer());
    ZZ(Callback.class, new CallbackDeserializer());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\DeserializationModule.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */