package org.openapi4j;

import burp.Zbqc;
import com.fasterxml.Zvm;
import com.fasterxml.Zy1;
import com.fasterxml.Zyx;
import java.util.List;
import java.util.Map;

public class Zpf extends Zc<Zpf> implements Zpq {
  private String openapi;
  
  private Zp1 info;
  
  private List<Zp9> servers;
  
  private List<Zpc> tags;
  
  @Zvm
  private Map<String, Zi> paths;
  
  private Z_ components;
  
  private Zb externalDocs;
  
  @Zy1("security")
  private List<Zpz> securityRequirements;
  
  @Zyx
  private Zx context;
  
  public String getOpenapi() {
    return this.openapi;
  }
  
  public Zpf setOpenapi(String paramString) {
    this.openapi = paramString;
    return this;
  }
  
  public Zp1 getInfo() {
    return this.info;
  }
  
  public Zpf setInfo(Zp1 paramZp1) {
    this.info = paramZp1;
    return this;
  }
  
  public List<Zp9> getServers() {
    return this.servers;
  }
  
  public Zpf setServers(List<Zp9> paramList) {
    this.servers = paramList;
    return this;
  }
  
  public boolean hasServers() {
    return (this.servers != null);
  }
  
  public Zpf addServer(Zp9 paramZp9) {
    this.servers = listAdd(this.servers, paramZp9);
    return this;
  }
  
  public Zpf insertServer(int paramInt, Zp9 paramZp9) {
    this.servers = listAdd(this.servers, paramInt, paramZp9);
    return this;
  }
  
  public Zpf removeServer(Zp9 paramZp9) {
    listRemove(this.servers, paramZp9);
    return this;
  }
  
  public Map<String, Zi> getPaths() {
    return this.paths;
  }
  
  public Zpf setPaths(Map<String, Zi> paramMap) {
    this.paths = paramMap;
    return this;
  }
  
  public boolean hasPath(String paramString) {
    return mapHas(this.paths, paramString);
  }
  
  public Zi getPath(String paramString) {
    return (Zi)mapGet(this.paths, paramString);
  }
  
  public Zpf setPath(String paramString, Zi paramZi) {
    this.paths = mapPut(this.paths, paramString, paramZi);
    return this;
  }
  
  public Zpf removePath(String paramString) {
    mapRemove(this.paths, paramString);
    return this;
  }
  
  public Z_ getComponents() {
    return this.components;
  }
  
  public Zpf setComponents(Z_ paramZ_) {
    this.components = paramZ_;
    return this;
  }
  
  public List<Zpz> getSecurityRequirements() {
    return this.securityRequirements;
  }
  
  public Zpf setSecurityRequirements(List<Zpz> paramList) {
    this.securityRequirements = paramList;
    return this;
  }
  
  public boolean hasSecurityRequirements() {
    return (this.securityRequirements != null);
  }
  
  public Zpf addSecurityRequirement(Zpz paramZpz) {
    this.securityRequirements = listAdd(this.securityRequirements, paramZpz);
    return this;
  }
  
  public Zpf insertSecurityRequirement(int paramInt, Zpz paramZpz) {
    this.securityRequirements = listAdd(this.securityRequirements, paramInt, paramZpz);
    return this;
  }
  
  public Zpf removeSecurityRequirement(Zpz paramZpz) {
    listRemove(this.securityRequirements, paramZpz);
    return this;
  }
  
  public List<Zpc> getTags() {
    return this.tags;
  }
  
  public Zpf setTags(List<Zpc> paramList) {
    this.tags = paramList;
    return this;
  }
  
  public boolean hasTags() {
    return (this.tags != null);
  }
  
  public Zpf addTag(Zpc paramZpc) {
    this.tags = listAdd(this.tags, paramZpc);
    return this;
  }
  
  public Zpf insertTag(int paramInt, Zpc paramZpc) {
    this.tags = listAdd(this.tags, paramInt, paramZpc);
    return this;
  }
  
  public Zpf removeTag(Zpc paramZpc) {
    listRemove(this.tags, paramZpc);
    return this;
  }
  
  public Zb getExternalDocs() {
    return this.externalDocs;
  }
  
  public Zpf setExternalDocs(Zb paramZb) {
    this.externalDocs = paramZb;
    return this;
  }
  
  public Zx getContext() {
    return this.context;
  }
  
  public void setContext(Zx paramZx) {
    this.context = paramZx;
  }
  
  public Zpe getOperationById(String paramString) {
    Zbqc[] arrayOfZbqc = Zc.ZL();
    if (this.paths == null)
      return null; 
    for (Zi zi : this.paths.values()) {
      if (zi.getOperations() != null || arrayOfZbqc != null) {
        for (Zpe zpe : zi.getOperations().values()) {
          if (paramString.equals(zpe.getOperationId()))
            return zpe; 
          if (arrayOfZbqc != null)
            break; 
        } 
        if (arrayOfZbqc != null)
          break; 
      } 
    } 
    return null;
  }
  
  public String getPathFrom(Zi paramZi) {
    Zbqc[] arrayOfZbqc = Zc.ZL();
    if (this.paths == null)
      return null; 
    for (Map.Entry<String, Zi> entry : this.paths.entrySet()) {
      if (((Zi)entry.getValue()).equals(paramZi))
        return (String)entry.getKey(); 
      if (arrayOfZbqc != null)
        break; 
    } 
    return null;
  }
  
  public Zi getPathItemByOperationId(String paramString) {
    Zbqc[] arrayOfZbqc = Zc.ZL();
    if (this.paths == null)
      return null; 
    for (Zi zi : this.paths.values()) {
      if (zi.getOperations() != null || arrayOfZbqc != null) {
        for (Zpe zpe : zi.getOperations().values()) {
          if (paramString.equals(zpe.getOperationId()))
            return zi; 
          if (arrayOfZbqc != null)
            break; 
        } 
        if (arrayOfZbqc != null)
          break; 
      } 
    } 
    return null;
  }
  
  public Zpf copy() {
    Zpf zpf = new Zpf();
    zpf.setOpenapi(getOpenapi());
    zpf.setInfo((Zp1)copyField(getInfo()));
    zpf.setServers(copyList(getServers()));
    zpf.setTags(copyList(getTags()));
    zpf.setPaths(copyMap(getPaths()));
    zpf.setComponents((Z_)copyField(getComponents()));
    zpf.setExternalDocs((Zb)copyField(getExternalDocs()));
    zpf.setSecurityRequirements(copyList(getSecurityRequirements()));
    zpf.setExtensions(copySimpleMap(getExtensions()));
    zpf.setContext(this.context);
    return zpf;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zpf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */