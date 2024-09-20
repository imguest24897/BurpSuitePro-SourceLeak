package net.portswigger.swagger.v3.parser.processors;

import burp.Zbqc;
import java.util.List;
import java.util.Map;
import net.portswigger.swagger.v2.util.RefUtils;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.Operation;
import net.portswigger.swagger.v3.oas.models.PathItem;
import net.portswigger.swagger.v3.oas.models.callbacks.Callback;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.oas.models.parameters.RequestBody;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponse;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponses;
import net.portswigger.swagger.v3.parser.ResolverCache;
import net.portswigger.swagger.v3.parser.models.RefFormat;

public class OperationProcessor {
  private final ParameterProcessor parameterProcessor;
  
  private final RequestBodyProcessor requestBodyProcessor;
  
  private final ResponseProcessor responseProcessor;
  
  private final ExternalRefProcessor externalRefProcessor;
  
  private final ResolverCache cache;
  
  public OperationProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI) {
    this(paramResolverCache, paramOpenAPI, false);
  }
  
  public OperationProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI, boolean paramBoolean) {
    this.parameterProcessor = new ParameterProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.responseProcessor = new ResponseProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.requestBodyProcessor = new RequestBodyProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.externalRefProcessor = new ExternalRefProcessor(paramResolverCache, paramOpenAPI);
    this.cache = paramResolverCache;
  }
  
  public void processOperation(Operation paramOperation) {
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (paramOperation.getParameters() != null)
      for (Parameter parameter : paramOperation.getParameters()) {
        this.parameterProcessor.processParameter(parameter);
        if (arrayOfZbqc == null)
          break; 
      }  
    List<Parameter> list = this.parameterProcessor.processParameters(paramOperation.getParameters());
    if (list != null)
      paramOperation.setParameters(list); 
    RequestBody requestBody = paramOperation.getRequestBody();
    if (requestBody != null) {
      if (requestBody.get$ref() != null && this.cache != null && this.cache.getParseOptions() != null && this.cache.getParseOptions().isResolveRequestBody()) {
        this.requestBodyProcessor.processRequestBody(requestBody);
        RefFormat refFormat = RefUtils.computeRefFormat(requestBody.get$ref());
        RequestBody requestBody1 = (RequestBody)this.cache.loadRef(requestBody.get$ref(), refFormat, RequestBody.class);
        if (requestBody1 != null) {
          requestBody = requestBody1;
          paramOperation.setRequestBody(requestBody1);
        } 
      } 
      this.requestBodyProcessor.processRequestBody(requestBody);
    } 
    ApiResponses<String, ApiResponse> apiResponses = paramOperation.getResponses();
    if (apiResponses != null)
      for (String str : apiResponses.keySet()) {
        ApiResponse apiResponse = (ApiResponse)apiResponses.get(str);
        if (apiResponse != null) {
          if (apiResponse.get$ref() != null) {
            this.responseProcessor.processResponse(apiResponse);
            RefFormat refFormat = RefUtils.computeRefFormat(apiResponse.get$ref());
            ApiResponse apiResponse1 = (ApiResponse)this.cache.loadRef(apiResponse.get$ref(), refFormat, ApiResponse.class);
            if (apiResponse1 != null) {
              apiResponse = apiResponse1;
              apiResponses.put(str, apiResponse1);
            } 
          } 
          this.responseProcessor.processResponse(apiResponse);
        } 
        if (arrayOfZbqc == null)
          break; 
      }  
    Map map = paramOperation.getCallbacks();
    if (map != null)
      for (String str : map.keySet()) {
        Callback callback = (Callback)map.get(str);
        if (callback != null) {
          if (callback.get$ref() != null) {
            String str1 = callback.get$ref();
            RefFormat refFormat = RefUtils.computeRefFormat(str1);
            if (RefUtils.isAnExternalRefFormat(refFormat)) {
              String str2 = this.externalRefProcessor.processRefToExternalCallback(str1, refFormat);
              if (str2 != null)
                callback.set$ref(str2); 
            } 
          } 
          for (String str1 : callback.keySet()) {
            PathItem pathItem = (PathItem)callback.get(str1);
            Map map1 = pathItem.readOperationsMap();
            for (PathItem.HttpMethod httpMethod : map1.keySet()) {
              Operation operation = (Operation)map1.get(httpMethod);
              processOperation(operation);
              if (arrayOfZbqc == null)
                break; 
            } 
            List list1 = pathItem.getParameters();
            if (list1 != null)
              for (Parameter parameter : list1) {
                this.parameterProcessor.processParameter(parameter);
                if (arrayOfZbqc == null)
                  break; 
              }  
            if (arrayOfZbqc == null)
              break; 
          } 
        } 
        if (arrayOfZbqc == null)
          break; 
      }  
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\processors\OperationProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */