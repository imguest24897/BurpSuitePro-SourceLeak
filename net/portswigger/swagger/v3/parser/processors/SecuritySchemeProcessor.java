package net.portswigger.swagger.v3.parser.processors;

import net.portswigger.swagger.v2.util.RefUtils;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.security.SecurityScheme;
import net.portswigger.swagger.v3.parser.ResolverCache;
import net.portswigger.swagger.v3.parser.models.RefFormat;

public class SecuritySchemeProcessor {
  private final ResolverCache cache;
  
  private final OpenAPI openAPI;
  
  private final ExternalRefProcessor externalRefProcessor;
  
  public SecuritySchemeProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI) {
    this.cache = paramResolverCache;
    this.openAPI = paramOpenAPI;
    this.externalRefProcessor = new ExternalRefProcessor(paramResolverCache, paramOpenAPI);
  }
  
  public SecurityScheme processSecurityScheme(SecurityScheme paramSecurityScheme) {
    if (paramSecurityScheme.get$ref() != null) {
      RefFormat refFormat = RefUtils.computeRefFormat(paramSecurityScheme.get$ref());
      String str = paramSecurityScheme.get$ref();
      SecurityScheme securityScheme = (SecurityScheme)this.cache.loadRef(str, refFormat, SecurityScheme.class);
      if (securityScheme != null)
        return securityScheme; 
    } 
    return paramSecurityScheme;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\processors\SecuritySchemeProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */