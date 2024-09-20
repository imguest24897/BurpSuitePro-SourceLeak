package net.portswigger.swagger.v3.parser.extensions;

import com.fasterxml.Zor.Zb;
import java.util.Map;
import net.portswigger.swagger.v2.util.OpenAPIDeserializer;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.parser.ResolverCache;

public interface JsonSchemaParserExtension {
  Schema getSchema(Zb paramZb, String paramString1, OpenAPIDeserializer.ParseResult paramParseResult, Map<String, Object> paramMap, String paramString2);
  
  boolean resolveSchema(Schema paramSchema, ResolverCache paramResolverCache, OpenAPI paramOpenAPI, boolean paramBoolean);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\extensions\JsonSchemaParserExtension.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */