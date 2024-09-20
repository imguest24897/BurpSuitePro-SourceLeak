package net.portswigger.swagger.v3.parser.processors;

import burp.Zbqc;
import net.portswigger.swagger.v2.util.RefUtils;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.oas.models.media.Content;
import net.portswigger.swagger.v3.oas.models.media.MediaType;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.parameters.RequestBody;
import net.portswigger.swagger.v3.parser.ResolverCache;
import net.portswigger.swagger.v3.parser.models.RefFormat;

public class RequestBodyProcessor {
  private final SchemaProcessor schemaProcessor;
  
  private final ExternalRefProcessor externalRefProcessor;
  
  private final ExampleProcessor exampleProcessor;
  
  private final ResolverCache cache;
  
  private final OpenAPI openAPI;
  
  public RequestBodyProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI) {
    this(paramResolverCache, paramOpenAPI, false);
  }
  
  public RequestBodyProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI, boolean paramBoolean) {
    this.schemaProcessor = new SchemaProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.exampleProcessor = new ExampleProcessor(paramResolverCache, paramOpenAPI);
    this.externalRefProcessor = new ExternalRefProcessor(paramResolverCache, paramOpenAPI);
    this.cache = paramResolverCache;
    this.openAPI = paramOpenAPI;
  }
  
  public void processRequestBody(RequestBody paramRequestBody) {
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (paramRequestBody.get$ref() != null)
      processReferenceRequestBody(paramRequestBody); 
    Schema schema = null;
    if (paramRequestBody.getContent() != null) {
      Content content = paramRequestBody.getContent();
      for (String str : content.keySet()) {
        MediaType mediaType = (MediaType)content.get(str);
        if (mediaType.getSchema() != null) {
          schema = mediaType.getSchema();
          if (schema != null)
            this.schemaProcessor.processSchema(schema); 
        } 
        if (mediaType.getExamples() != null)
          for (Example example : mediaType.getExamples().values()) {
            this.exampleProcessor.processExample(example);
            if (arrayOfZbqc == null)
              break; 
          }  
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
  }
  
  public void processReferenceRequestBody(RequestBody paramRequestBody) {
    RefFormat refFormat = RefUtils.computeRefFormat(paramRequestBody.get$ref());
    String str = paramRequestBody.get$ref();
    if (RefUtils.isAnExternalRefFormat(refFormat)) {
      String str1 = this.externalRefProcessor.processRefToExternalRequestBody(str, refFormat);
      if (str1 != null)
        paramRequestBody.set$ref(str1); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\processors\RequestBodyProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */