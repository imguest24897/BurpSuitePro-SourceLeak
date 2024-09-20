package net.portswigger.swagger.v3.parser.core.extensions;

import java.util.List;
import net.portswigger.swagger.v2.ParseOptions;
import net.portswigger.swagger.v2.SwaggerParseResult;
import net.portswigger.swagger.v3.parser.core.models.AuthorizationValue;

public interface SwaggerParserExtension {
  SwaggerParseResult readLocation(String paramString, List<AuthorizationValue> paramList, ParseOptions paramParseOptions);
  
  SwaggerParseResult readContents(String paramString, List<AuthorizationValue> paramList, ParseOptions paramParseOptions);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\core\extensions\SwaggerParserExtension.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */