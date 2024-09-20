package net.portswigger.swagger.v1.parser.processors;

import burp.Zbqc;
import java.util.List;
import net.portswigger.swagger.v1.models.Operation;
import net.portswigger.swagger.v1.models.RefResponse;
import net.portswigger.swagger.v1.models.Response;
import net.portswigger.swagger.v1.models.Responses;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.models.parameters.Parameter;
import net.portswigger.swagger.v1.parser.ResolverCache;

public class OperationProcessor {
  private final ParameterProcessor parameterProcessor;
  
  private final ResponseProcessor responseProcessor;
  
  private final ResolverCache cache;
  
  public OperationProcessor(ResolverCache paramResolverCache, Swagger paramSwagger) {
    this.cache = paramResolverCache;
    this.parameterProcessor = new ParameterProcessor(paramResolverCache, paramSwagger);
    this.responseProcessor = new ResponseProcessor(paramResolverCache, paramSwagger);
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.ZI();
    if (Zbqc.Zwu() == null)
      ExternalRefProcessor.ZJ(new Zbqc[2]); 
  }
  
  public void processOperation(Operation paramOperation) {
    List<Parameter> list = this.parameterProcessor.processParameters(paramOperation.getParameters());
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.ZI();
    paramOperation.setParameters(list);
    Responses responses = paramOperation.getResponsesObject();
    if (responses != null)
      for (String str : responses.keySet()) {
        Response response = (Response)responses.get(str);
        if (response != null) {
          if (response instanceof RefResponse) {
            RefResponse refResponse = (RefResponse)response;
            this.responseProcessor.processResponse(response);
            Response response1 = (Response)this.cache.loadRef(refResponse.get$ref(), refResponse.getRefFormat(), Response.class);
            if (response1 != null) {
              response = response1;
              responses.put(str, response1);
            } 
          } 
          this.responseProcessor.processResponse(response);
        } 
        if (arrayOfZbqc == null)
          break; 
      }  
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parser\processors\OperationProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */