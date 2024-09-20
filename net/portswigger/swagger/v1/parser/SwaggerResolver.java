package net.portswigger.swagger.v1.parser;

import burp.Zbqc;
import java.util.Arrays;
import java.util.List;
import net.portswigger.swagger.v1.models.Operation;
import net.portswigger.swagger.v1.models.Path;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.models.auth.AuthorizationValue;
import net.portswigger.swagger.v1.models.parameters.Parameter;
import net.portswigger.swagger.v1.models.parameters.RefParameter;
import net.portswigger.swagger.v1.models.refs.RefFormat;
import net.portswigger.swagger.v1.parser.processors.DefinitionsProcessor;
import net.portswigger.swagger.v1.parser.processors.OperationProcessor;
import net.portswigger.swagger.v1.parser.processors.ParameterProcessor;
import net.portswigger.swagger.v1.parser.processors.PathsProcessor;
import net.portswigger.swagger.v1.parser.util.ParseOptions;

public class SwaggerResolver {
  private final Swagger swagger;
  
  private final ResolverCache cache;
  
  private final PathsProcessor pathProcessor;
  
  private final DefinitionsProcessor definitionsProcessor;
  
  private final OperationProcessor operationsProcessor;
  
  private final ParameterProcessor parametersProcessor;
  
  private SwaggerResolver$Settings settings;
  
  public SwaggerResolver(Swagger paramSwagger) {
    this(paramSwagger, null, null, null);
  }
  
  public SwaggerResolver(Swagger paramSwagger, List<AuthorizationValue> paramList) {
    this(paramSwagger, paramList, null, null);
  }
  
  public SwaggerResolver(Swagger paramSwagger, List<AuthorizationValue> paramList, String paramString) {
    this(paramSwagger, paramList, paramString, null);
  }
  
  public SwaggerResolver(Swagger paramSwagger, List<AuthorizationValue> paramList, String paramString, SwaggerResolver$Settings paramSwaggerResolver$Settings) {
    this(paramSwagger, paramList, paramString, paramSwaggerResolver$Settings, new ParseOptions());
  }
  
  public SwaggerResolver(Swagger paramSwagger, List<AuthorizationValue> paramList, String paramString, SwaggerResolver$Settings paramSwaggerResolver$Settings, ParseOptions paramParseOptions) {
    String[] arrayOfString = ResolverCache.ZL();
    this.settings = new SwaggerResolver$Settings();
    this.swagger = paramSwagger;
    this.settings = (paramSwaggerResolver$Settings != null) ? paramSwaggerResolver$Settings : new SwaggerResolver$Settings();
    this.cache = new ResolverCache(paramSwagger, paramList, paramString, paramParseOptions);
    this.definitionsProcessor = new DefinitionsProcessor(this.cache, paramSwagger);
    this.pathProcessor = new PathsProcessor(this.cache, paramSwagger, this.settings);
    this.operationsProcessor = new OperationProcessor(this.cache, paramSwagger);
    this.parametersProcessor = new ParameterProcessor(this.cache, paramSwagger);
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Swagger resolve() {
    String[] arrayOfString = ResolverCache.ZL();
    if (this.swagger == null)
      return null; 
    if (this.swagger.getParameters() != null)
      for (String str : this.swagger.getParameters().keySet()) {
        Parameter parameter = (Parameter)this.swagger.getParameters().get(str);
        if (parameter instanceof RefParameter && ((RefParameter)parameter).getRefFormat() == RefFormat.RELATIVE)
          this.swagger.getParameters().put(str, this.parametersProcessor.processParameters(Arrays.asList(new Parameter[] { parameter })).get(0)); 
        if (arrayOfString == null)
          break; 
      }  
    this.pathProcessor.processPaths();
    this.definitionsProcessor.processDefinitions();
    if (this.swagger.getPaths() != null)
      for (String str : this.swagger.getPaths().keySet()) {
        Path path = (Path)this.swagger.getPaths().get(str);
        if (path.getOperations() != null)
          for (Operation operation : path.getOperations()) {
            this.operationsProcessor.processOperation(operation);
            if (arrayOfString == null)
              break; 
          }  
        if (arrayOfString == null)
          break; 
      }  
    return this.swagger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parser\SwaggerResolver.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */