package net.portswigger.swagger.v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import net.portswigger.swagger.v3.oas.models.OpenAPI;

public class SwaggerParseResult {
  private List<String> messages = null;
  
  private OpenAPI openAPI;
  
  private boolean valid;
  
  public SwaggerParseResult messages(List<String> paramList) {
    this.messages = paramList;
    return this;
  }
  
  public List<String> getMessages() {
    return this.messages;
  }
  
  public void setMessages(List<String> paramList) {
    this.messages = paramList;
  }
  
  public SwaggerParseResult message(String paramString) {
    if (this.messages == null)
      this.messages = new ArrayList<>(); 
    this.messages.add(paramString);
    return this;
  }
  
  public SwaggerParseResult addMessages(List<String> paramList) {
    if (this.messages == null)
      this.messages = new ArrayList<>(); 
    this.messages.addAll(paramList);
    return this;
  }
  
  public OpenAPI getOpenAPI() {
    return this.openAPI;
  }
  
  public void setOpenAPI(OpenAPI paramOpenAPI) {
    this.openAPI = paramOpenAPI;
  }
  
  public boolean isValid() {
    return this.valid;
  }
  
  public void setValid(boolean paramBoolean) {
    this.valid = paramBoolean;
  }
  
  public static SwaggerParseResult ofError(String paramString) {
    SwaggerParseResult swaggerParseResult = new SwaggerParseResult();
    swaggerParseResult.setMessages(Collections.singletonList(paramString));
    return swaggerParseResult;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    SwaggerParseResult swaggerParseResult = (SwaggerParseResult)paramObject;
    return (Objects.equals(this.messages, swaggerParseResult.messages) && Objects.equals(this.openAPI, swaggerParseResult.openAPI) && this.valid == swaggerParseResult.valid);
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.messages, this.openAPI, Boolean.valueOf(this.valid) });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v2\SwaggerParseResult.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */