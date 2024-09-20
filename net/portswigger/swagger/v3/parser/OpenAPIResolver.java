package net.portswigger.swagger.v3.parser;

import burp.Zbqc;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.portswigger.swagger.v2.ParseOptions;
import net.portswigger.swagger.v2.SwaggerParseResult;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.Operation;
import net.portswigger.swagger.v3.oas.models.PathItem;
import net.portswigger.swagger.v3.parser.core.models.AuthorizationValue;
import net.portswigger.swagger.v3.parser.processors.ComponentsProcessor;
import net.portswigger.swagger.v3.parser.processors.OperationProcessor;
import net.portswigger.swagger.v3.parser.processors.PathsProcessor;

public class OpenAPIResolver {
  private final OpenAPI openApi;
  
  private final ResolverCache cache;
  
  private final ComponentsProcessor componentsProcessor;
  
  private final PathsProcessor pathProcessor;
  
  private final OperationProcessor operationsProcessor;
  
  private OpenAPIResolver$Settings settings = new OpenAPIResolver$Settings();
  
  private Set<String> resolveValidationMessages;
  
  public ResolverCache getCache() {
    return this.cache;
  }
  
  public OpenAPIResolver(OpenAPI paramOpenAPI) {
    this(paramOpenAPI, null, null, null);
  }
  
  public OpenAPIResolver(OpenAPI paramOpenAPI, List<AuthorizationValue> paramList) {
    this(paramOpenAPI, paramList, null, null);
  }
  
  public OpenAPIResolver(OpenAPI paramOpenAPI, List<AuthorizationValue> paramList, String paramString) {
    this(paramOpenAPI, paramList, paramString, null);
  }
  
  public OpenAPIResolver(OpenAPI paramOpenAPI, List<AuthorizationValue> paramList, String paramString, OpenAPIResolver$Settings paramOpenAPIResolver$Settings) {
    this(paramOpenAPI, paramList, paramString, paramOpenAPIResolver$Settings, new ParseOptions());
  }
  
  public OpenAPIResolver(OpenAPI paramOpenAPI, List<AuthorizationValue> paramList, String paramString, OpenAPIResolver$Settings paramOpenAPIResolver$Settings, ParseOptions paramParseOptions) {
    int i = ResolverCache.Zv();
    this.resolveValidationMessages = new HashSet<>();
    this.openApi = paramOpenAPI;
    this.settings = (paramOpenAPIResolver$Settings != null) ? paramOpenAPIResolver$Settings : new OpenAPIResolver$Settings();
    this.cache = new ResolverCache(paramOpenAPI, paramList, paramString, this.resolveValidationMessages, paramParseOptions);
    this.componentsProcessor = new ComponentsProcessor(paramOpenAPI, this.cache);
    this.pathProcessor = new PathsProcessor(this.cache, paramOpenAPI, this.settings);
    this.operationsProcessor = new OperationProcessor(this.cache, paramOpenAPI);
    if (Zbqc.Zwu() == null)
      ResolverCache.Zx(++i); 
  }
  
  public void resolve(SwaggerParseResult paramSwaggerParseResult) {
    OpenAPI openAPI = resolve();
    if (openAPI == null)
      return; 
    paramSwaggerParseResult.setOpenAPI(openAPI);
    paramSwaggerParseResult.getMessages().addAll(this.resolveValidationMessages);
  }
  
  public OpenAPI resolve() {
    int i = ResolverCache.Zv();
    if (this.openApi == null)
      return null; 
    this.pathProcessor.processPaths();
    this.componentsProcessor.processComponents();
    if (this.openApi.getPaths() != null)
      for (String str : this.openApi.getPaths().keySet()) {
        PathItem pathItem = (PathItem)this.openApi.getPaths().get(str);
        if (pathItem.readOperations() != null)
          for (Operation operation : pathItem.readOperations()) {
            this.operationsProcessor.processOperation(operation);
            if (i != 0)
              break; 
          }  
        if (i != 0)
          break; 
      }  
    return this.openApi;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\OpenAPIResolver.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */