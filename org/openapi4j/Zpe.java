package org.openapi4j;

import burp.Zbqc;
import com.fasterxml.Zy1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zpe extends Zc<Zpe> {
  private List<String> tags;
  
  private String summary;
  
  private String description;
  
  private Zb externalDocs;
  
  private String operationId;
  
  private List<Zo> parameters;
  
  private Zw requestBody;
  
  private Map<String, Zv> responses;
  
  private Map<String, Zm> callbacks;
  
  private Boolean deprecated;
  
  @Zy1("security")
  private List<Zpz> securityRequirements;
  
  private List<Zp9> servers;
  
  public List<String> getTags() {
    return this.tags;
  }
  
  public Zpe setTags(List<String> paramList) {
    this.tags = paramList;
    return this;
  }
  
  public boolean hasTags() {
    return (this.tags != null);
  }
  
  public Zpe addTag(String paramString) {
    this.tags = listAdd(this.tags, paramString);
    return this;
  }
  
  public Zpe insertTag(int paramInt, String paramString) {
    this.tags = listAdd(this.tags, paramInt, paramString);
    return this;
  }
  
  public Zpe removeTag(String paramString) {
    listRemove(this.tags, paramString);
    return this;
  }
  
  public String getSummary() {
    return this.summary;
  }
  
  public Zpe setSummary(String paramString) {
    this.summary = paramString;
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public Zpe setDescription(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public Zb getExternalDocs() {
    return this.externalDocs;
  }
  
  public Zpe setExternalDocs(Zb paramZb) {
    this.externalDocs = paramZb;
    return this;
  }
  
  public String getOperationId() {
    return this.operationId;
  }
  
  public Zpe setOperationId(String paramString) {
    this.operationId = paramString;
    return this;
  }
  
  public List<Zo> getParameters() {
    return this.parameters;
  }
  
  public Zpe setParameters(List<Zo> paramList) {
    this.parameters = paramList;
    return this;
  }
  
  public boolean hasParameters() {
    return (this.parameters != null);
  }
  
  public Zpe addParameter(Zo paramZo) {
    this.parameters = listAdd(this.parameters, paramZo);
    return this;
  }
  
  public Zpe insertParameter(int paramInt, Zo paramZo) {
    this.parameters = listAdd(this.parameters, paramInt, paramZo);
    return this;
  }
  
  public Zpe removeParameter(Zo paramZo) {
    listRemove(this.parameters, paramZo);
    return this;
  }
  
  public List<Zo> getParametersIn(Zx paramZx, String paramString) {
    return Zpt.Zo(paramZx, this.parameters, paramString);
  }
  
  public Zw getRequestBody() {
    return this.requestBody;
  }
  
  public Zpe setRequestBody(Zw paramZw) {
    this.requestBody = paramZw;
    return this;
  }
  
  public Map<String, Zv> getResponses() {
    return this.responses;
  }
  
  public Zpe setResponses(Map<String, Zv> paramMap) {
    this.responses = paramMap;
    return this;
  }
  
  public boolean hasResponse(String paramString) {
    return mapHas(this.responses, paramString);
  }
  
  public Zv getResponse(String paramString) {
    return (Zv)mapGet(this.responses, paramString);
  }
  
  public Zpe setResponse(String paramString, Zv paramZv) {
    if (this.responses == null)
      this.responses = new HashMap<>(); 
    this.responses.put(paramString, paramZv);
    return this;
  }
  
  public Zpe removeResponse(String paramString) {
    mapRemove(this.responses, paramString);
    return this;
  }
  
  public Map<String, Zm> getCallbacks() {
    return this.callbacks;
  }
  
  public Zpe setCallbacks(Map<String, Zm> paramMap) {
    this.callbacks = paramMap;
    return this;
  }
  
  public boolean hasCallback(String paramString) {
    return mapHas(this.callbacks, paramString);
  }
  
  public Zm getCallback(String paramString) {
    return (Zm)mapGet(this.callbacks, paramString);
  }
  
  public Zpe setCallback(String paramString, Zm paramZm) {
    if (this.callbacks == null)
      this.callbacks = new HashMap<>(); 
    this.callbacks.put(paramString, paramZm);
    return this;
  }
  
  public Zpe removeCallback(String paramString) {
    mapRemove(this.callbacks, paramString);
    return this;
  }
  
  public Boolean getDeprecated() {
    return this.deprecated;
  }
  
  public boolean isDeprecated() {
    return Boolean.TRUE.equals(this.deprecated);
  }
  
  public Zpe setDeprecated(Boolean paramBoolean) {
    this.deprecated = paramBoolean;
    return this;
  }
  
  public List<Zpz> getSecurityRequirements() {
    return this.securityRequirements;
  }
  
  public Zpe setSecurityRequirements(List<Zpz> paramList) {
    this.securityRequirements = paramList;
    return this;
  }
  
  public boolean hasSecurityRequirements() {
    return (this.securityRequirements != null);
  }
  
  public Zpe addSecurityRequirement(Zpz paramZpz) {
    this.securityRequirements = listAdd(this.securityRequirements, paramZpz);
    return this;
  }
  
  public Zpe insertSecurityRequirement(int paramInt, Zpz paramZpz) {
    this.securityRequirements = listAdd(this.securityRequirements, paramInt, paramZpz);
    return this;
  }
  
  public Zpe removeSecurityRequirement(Zpz paramZpz) {
    listRemove(this.securityRequirements, paramZpz);
    return this;
  }
  
  public List<Zp9> getServers() {
    return this.servers;
  }
  
  public Zpe setServers(List<Zp9> paramList) {
    this.servers = paramList;
    return this;
  }
  
  public boolean hasServers() {
    return (this.servers != null);
  }
  
  public Zpe addServer(Zp9 paramZp9) {
    this.servers = listAdd(this.servers, paramZp9);
    return this;
  }
  
  public Zpe insertServer(int paramInt, Zp9 paramZp9) {
    this.servers = listAdd(this.servers, paramInt, paramZp9);
    return this;
  }
  
  public Zpe removeServer(Zp9 paramZp9) {
    listRemove(this.servers, paramZp9);
    return this;
  }
  
  public Zpe copy() {
    Zpe zpe = new Zpe();
    zpe.setSummary(getSummary());
    zpe.setTags(copySimpleList(getTags()));
    zpe.setDescription(getDescription());
    zpe.setExternalDocs((Zb)copyField(getExternalDocs()));
    zpe.setOperationId(getOperationId());
    zpe.setParameters(copyList(getParameters()));
    zpe.setRequestBody((Zw)copyField(getRequestBody()));
    zpe.setResponses(copyMap(getResponses()));
    zpe.setCallbacks(copyMap(getCallbacks()));
    zpe.setDeprecated(getDeprecated());
    Zbqc[] arrayOfZbqc = Zc.ZL();
    zpe.setSecurityRequirements(copyList(getSecurityRequirements()));
    zpe.setServers(copyList(getServers()));
    zpe.setExtensions(copySimpleMap(getExtensions()));
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[5]); 
    return zpe;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zpe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */