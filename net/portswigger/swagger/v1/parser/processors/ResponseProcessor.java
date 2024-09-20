package net.portswigger.swagger.v1.parser.processors;

import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.RefResponse;
import net.portswigger.swagger.v1.models.Response;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.models.refs.RefFormat;
import net.portswigger.swagger.v1.parser.ResolverCache;
import net.portswigger.swagger.v1.parser.util.RefUtils;

public class ResponseProcessor {
  private final ModelProcessor modelProcessor;
  
  private final ExternalRefProcessor externalRefProcessor;
  
  public ResponseProcessor(ResolverCache paramResolverCache, Swagger paramSwagger) {
    this.modelProcessor = new ModelProcessor(paramResolverCache, paramSwagger);
    this.externalRefProcessor = new ExternalRefProcessor(paramResolverCache, paramSwagger);
  }
  
  public void processResponse(Response paramResponse) {
    Model model = paramResponse.getResponseSchema();
    if (paramResponse instanceof RefResponse) {
      RefResponse refResponse = (RefResponse)paramResponse;
      processReferenceResponse(refResponse);
    } 
    if (model != null)
      this.modelProcessor.processModel(model); 
  }
  
  public void processReferenceResponse(RefResponse paramRefResponse) {
    RefFormat refFormat = paramRefResponse.getRefFormat();
    String str = paramRefResponse.get$ref();
    if (RefUtils.isAnExternalRefFormat(refFormat))
      this.externalRefProcessor.processRefToExternalResponse(str, refFormat); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parser\processors\ResponseProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */