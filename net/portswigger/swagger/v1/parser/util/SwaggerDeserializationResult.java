package net.portswigger.swagger.v1.parser.util;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.swagger.v1.models.Swagger;

public class SwaggerDeserializationResult {
  private Swagger swagger;
  
  private List<String> messages;
  
  private boolean valid;
  
  public Swagger getSwagger() {
    return this.swagger;
  }
  
  public List<String> getMessages() {
    return this.messages;
  }
  
  public boolean isValid() {
    return this.valid;
  }
  
  public void setMessages(List<String> paramList) {
    this.messages = paramList;
  }
  
  public void setSwagger(Swagger paramSwagger) {
    this.swagger = paramSwagger;
  }
  
  public void setValid(boolean paramBoolean) {
    this.valid = paramBoolean;
  }
  
  public SwaggerDeserializationResult message(String paramString) {
    if (this.messages == null)
      this.messages = new ArrayList<>(); 
    this.messages.add(paramString);
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parse\\util\SwaggerDeserializationResult.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */