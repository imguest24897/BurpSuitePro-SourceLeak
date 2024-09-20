package net.portswigger.swagger.v3.parser.reference;

import com.fasterxml.Zor.Zb;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.portswigger.swagger.v3.parser.core.models.AuthorizationValue;

public class Reference {
  private String uri;
  
  private int depth = 0;
  
  private Object value;
  
  private Set<String> messages = new HashSet<>();
  
  private Map<String, Reference> referenceSet;
  
  private Zb jsonNode;
  
  private List<AuthorizationValue> auths;
  
  public String getUri() {
    return this.uri;
  }
  
  public void setUri(String paramString) {
    this.uri = paramString;
  }
  
  public int getDepth() {
    return this.depth;
  }
  
  public void setDepth(int paramInt) {
    this.depth = paramInt;
  }
  
  public Object getValue() {
    return this.value;
  }
  
  public void setValue(Object paramObject) {
    this.value = paramObject;
  }
  
  public Set<String> getMessages() {
    return this.messages;
  }
  
  public void setMessages(Set<String> paramSet) {
    this.messages = paramSet;
  }
  
  public Map<String, Reference> getReferenceSet() {
    return this.referenceSet;
  }
  
  public void setReferenceSet(Map<String, Reference> paramMap) {
    this.referenceSet = paramMap;
  }
  
  public Reference uri(String paramString) {
    this.uri = paramString;
    return this;
  }
  
  public Reference depth(int paramInt) {
    this.depth = paramInt;
    return this;
  }
  
  public Reference value(Object paramObject) {
    this.value = paramObject;
    return this;
  }
  
  public Reference messages(Set<String> paramSet) {
    this.messages = paramSet;
    return this;
  }
  
  public Reference referenceSet(Map<String, Reference> paramMap) {
    this.referenceSet = paramMap;
    return this;
  }
  
  public List<AuthorizationValue> getAuths() {
    return this.auths;
  }
  
  public void setAuths(List<AuthorizationValue> paramList) {
    this.auths = paramList;
  }
  
  public Reference auths(List<AuthorizationValue> paramList) {
    this.auths = paramList;
    return this;
  }
  
  public Zb getJsonNode() {
    return this.jsonNode;
  }
  
  public void setJsonNode(Zb paramZb) {
    this.jsonNode = paramZb;
  }
  
  public Reference jsonNode(Zb paramZb) {
    this.jsonNode = paramZb;
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\reference\Reference.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */