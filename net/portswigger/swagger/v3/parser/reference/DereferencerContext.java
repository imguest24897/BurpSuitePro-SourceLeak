package net.portswigger.swagger.v3.parser.reference;

import burp.Zbqc;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.swagger.v2.ParseOptions;
import net.portswigger.swagger.v2.SwaggerParseResult;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.parser.core.models.AuthorizationValue;

public class DereferencerContext {
  protected final OpenAPI openApi;
  
  protected final List<AuthorizationValue> auths;
  
  protected String rootUri;
  
  protected final ParseOptions parseOptions;
  
  protected String providedBaseUri;
  
  protected SwaggerParseResult swaggerParseResult;
  
  protected boolean addParametersToEachOperation = true;
  
  protected String currentUri;
  
  private Map<String, Reference> referenceSet = new LinkedHashMap<>();
  
  public DereferencerContext(SwaggerParseResult paramSwaggerParseResult, List<AuthorizationValue> paramList, String paramString1, ParseOptions paramParseOptions, String paramString2, Map<String, Reference> paramMap, Boolean paramBoolean) {
    this.swaggerParseResult = paramSwaggerParseResult;
    this.openApi = paramSwaggerParseResult.getOpenAPI();
    this.auths = paramList;
    this.rootUri = paramString1;
    this.currentUri = paramString1;
    this.parseOptions = paramParseOptions;
    String[] arrayOfString = DereferencersFactory.Zz();
    this.providedBaseUri = paramString2;
    this.addParametersToEachOperation = (paramBoolean != null) ? paramBoolean.booleanValue() : true;
    this.referenceSet = (paramMap != null) ? paramMap : new LinkedHashMap<>();
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public OpenAPI getOpenApi() {
    return this.openApi;
  }
  
  public List<AuthorizationValue> getAuths() {
    return this.auths;
  }
  
  public String getRootUri() {
    return this.rootUri;
  }
  
  public ParseOptions getParseOptions() {
    return this.parseOptions;
  }
  
  public String getProvidedBaseUri() {
    return this.providedBaseUri;
  }
  
  public SwaggerParseResult getSwaggerParseResult() {
    return this.swaggerParseResult;
  }
  
  public boolean isAddParametersToEachOperation() {
    return this.addParametersToEachOperation;
  }
  
  public void setAddParametersToEachOperation(boolean paramBoolean) {
    this.addParametersToEachOperation = paramBoolean;
  }
  
  public String getCurrentUri() {
    return this.currentUri;
  }
  
  public void setCurrentUri(String paramString) {
    this.currentUri = paramString;
  }
  
  public DereferencerContext providedBaseUri(String paramString) {
    this.providedBaseUri = paramString;
    return this;
  }
  
  public DereferencerContext swaggerParseResult(SwaggerParseResult paramSwaggerParseResult) {
    this.swaggerParseResult = paramSwaggerParseResult;
    return this;
  }
  
  public DereferencerContext addParametersToEachOperation(boolean paramBoolean) {
    this.addParametersToEachOperation = paramBoolean;
    return this;
  }
  
  public DereferencerContext currentUri(String paramString) {
    this.currentUri = paramString;
    return this;
  }
  
  public Map<String, Reference> getReferenceSet() {
    return this.referenceSet;
  }
  
  public void setReferenceSet(Map<String, Reference> paramMap) {
    this.referenceSet = paramMap;
  }
  
  public DereferencerContext referenceSet(Map<String, Reference> paramMap) {
    this.referenceSet = paramMap;
    return this;
  }
  
  public DereferencerContext rootUri(String paramString) {
    this.rootUri = paramString;
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\reference\DereferencerContext.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */