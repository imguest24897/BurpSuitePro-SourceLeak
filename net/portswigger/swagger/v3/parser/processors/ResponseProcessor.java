package net.portswigger.swagger.v3.parser.processors;

import burp.Zbqc;
import java.util.Map;
import net.portswigger.swagger.v2.util.RefUtils;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.oas.models.headers.Header;
import net.portswigger.swagger.v3.oas.models.links.Link;
import net.portswigger.swagger.v3.oas.models.media.Content;
import net.portswigger.swagger.v3.oas.models.media.MediaType;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponse;
import net.portswigger.swagger.v3.parser.ResolverCache;
import net.portswigger.swagger.v3.parser.models.RefFormat;

public class ResponseProcessor {
  private final SchemaProcessor schemaProcessor;
  
  private final HeaderProcessor headerProcessor;
  
  private final LinkProcessor linkProcessor;
  
  private final ExternalRefProcessor externalRefProcessor;
  
  private final ExampleProcessor exampleProcessor;
  
  private final ResolverCache cache;
  
  private final OpenAPI openAPI;
  
  public ResponseProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI) {
    this(paramResolverCache, paramOpenAPI, false);
  }
  
  public ResponseProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI, boolean paramBoolean) {
    this.schemaProcessor = new SchemaProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.headerProcessor = new HeaderProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    this.linkProcessor = new LinkProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.exampleProcessor = new ExampleProcessor(paramResolverCache, paramOpenAPI);
    this.externalRefProcessor = new ExternalRefProcessor(paramResolverCache, paramOpenAPI);
    this.cache = paramResolverCache;
    this.openAPI = paramOpenAPI;
    if (Zbqc.Zwu() == null)
      ExternalRefProcessor.Zp(new Zbqc[5]); 
  }
  
  public void processResponse(ApiResponse paramApiResponse) {
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (paramApiResponse.get$ref() != null)
      processReferenceResponse(paramApiResponse); 
    Schema schema = null;
    if (paramApiResponse.getContent() != null) {
      Content content = paramApiResponse.getContent();
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
    if (paramApiResponse.getHeaders() != null) {
      Map map = paramApiResponse.getHeaders();
      for (String str : map.keySet()) {
        Header header = (Header)map.get(str);
        this.headerProcessor.processHeader(header);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    if (paramApiResponse.getLinks() != null) {
      Map map = paramApiResponse.getLinks();
      for (String str : map.keySet()) {
        Link link = (Link)map.get(str);
        this.linkProcessor.processLink(link);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
  }
  
  public void processReferenceResponse(ApiResponse paramApiResponse) {
    RefFormat refFormat = RefUtils.computeRefFormat(paramApiResponse.get$ref());
    String str = paramApiResponse.get$ref();
    if (RefUtils.isAnExternalRefFormat(refFormat)) {
      String str1 = this.externalRefProcessor.processRefToExternalResponse(str, refFormat);
      if (str1 != null)
        paramApiResponse.set$ref(str1); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\processors\ResponseProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */