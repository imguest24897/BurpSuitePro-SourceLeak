package net.portswigger.swagger.v3.parser.processors;

import burp.Zbqc;
import java.util.Map;
import net.portswigger.swagger.v2.util.RefUtils;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.oas.models.headers.Header;
import net.portswigger.swagger.v3.oas.models.media.Content;
import net.portswigger.swagger.v3.oas.models.media.MediaType;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.parser.ResolverCache;
import net.portswigger.swagger.v3.parser.models.RefFormat;

public class HeaderProcessor {
  private final ResolverCache cache;
  
  private final SchemaProcessor schemaProcessor;
  
  private final ExampleProcessor exampleProcessor;
  
  private final ExternalRefProcessor externalRefProcessor;
  
  private final OpenAPI openAPI;
  
  public HeaderProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI) {
    this(paramResolverCache, paramOpenAPI, false);
  }
  
  public HeaderProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI, boolean paramBoolean) {
    this.cache = paramResolverCache;
    this.openAPI = paramOpenAPI;
    this.schemaProcessor = new SchemaProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.exampleProcessor = new ExampleProcessor(paramResolverCache, paramOpenAPI);
    this.externalRefProcessor = new ExternalRefProcessor(paramResolverCache, paramOpenAPI);
  }
  
  public void processHeader(Header paramHeader) {
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (paramHeader.get$ref() != null) {
      RefFormat refFormat = RefUtils.computeRefFormat(paramHeader.get$ref());
      String str = paramHeader.get$ref();
      if (RefUtils.isAnExternalRefFormat(refFormat)) {
        String str1 = this.externalRefProcessor.processRefToExternalHeader(str, refFormat);
        if (str1 != null)
          paramHeader.set$ref(str1); 
      } 
    } 
    if (paramHeader.getSchema() != null)
      this.schemaProcessor.processSchema(paramHeader.getSchema()); 
    if (paramHeader.getExamples() != null && paramHeader.getExamples() != null) {
      Map map = paramHeader.getExamples();
      for (String str : map.keySet()) {
        this.exampleProcessor.processExample((Example)paramHeader.getExamples().get(str));
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    Schema schema = null;
    if (paramHeader.getContent() != null) {
      Content content = paramHeader.getContent();
      for (String str : content.keySet()) {
        MediaType mediaType = (MediaType)content.get(str);
        if (mediaType.getSchema() != null) {
          schema = mediaType.getSchema();
          if (schema != null)
            this.schemaProcessor.processSchema(schema); 
        } 
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\processors\HeaderProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */