package net.portswigger.swagger.v1.parser;

import com.fasterxml.Zor.Zb;
import java.io.IOException;
import java.util.List;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.models.auth.AuthorizationValue;
import net.portswigger.swagger.v1.parser.util.SwaggerDeserializationResult;

public interface SwaggerParserExtension {
  SwaggerDeserializationResult readWithInfo(Zb paramZb);
  
  SwaggerDeserializationResult readWithInfo(String paramString, List<AuthorizationValue> paramList);
  
  Swagger read(String paramString, List<AuthorizationValue> paramList) throws IOException;
  
  Swagger read(Zb paramZb) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parser\SwaggerParserExtension.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */