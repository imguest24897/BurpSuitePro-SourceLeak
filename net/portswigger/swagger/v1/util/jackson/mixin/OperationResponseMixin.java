package net.portswigger.swagger.v1.util.jackson.mixin;

import com.fasterxml.Zvi;
import com.fasterxml.Zyl;
import com.fasterxml.Zyx;
import java.util.Map;
import net.portswigger.swagger.v1.models.Response;
import net.portswigger.swagger.v1.models.Responses;

public abstract class OperationResponseMixin {
  @Zyx
  public abstract Map<String, Response> getResponses();
  
  @Zyx
  public abstract void setResponses(Map<String, Response> paramMap);
  
  @Zyl("responses")
  public abstract Responses getResponsesObject();
  
  @Zvi("responses")
  public abstract void getResponsesObject(Responses paramResponses);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\jackson\mixin\OperationResponseMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */