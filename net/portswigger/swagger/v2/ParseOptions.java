package net.portswigger.swagger.v2;

import burp.Zbqc;
import java.util.List;

public class ParseOptions {
  private boolean resolve;
  
  private boolean resolveCombinators = true;
  
  private boolean resolveFully;
  
  private boolean flatten;
  
  private boolean flattenComposedSchemas;
  
  private boolean camelCaseFlattenNaming;
  
  private boolean skipMatches;
  
  private boolean allowEmptyStrings;
  
  private boolean validateExternalRefs;
  
  private boolean validateInternalRefs;
  
  private boolean legacyYamlDeserialization;
  
  private boolean resolveRequestBody;
  
  private boolean oaiAuthor;
  
  private boolean inferSchemaType;
  
  private boolean safelyResolveURL;
  
  private List<String> remoteRefAllowList;
  
  private List<String> remoteRefBlockList;
  
  private static String[] ZT;
  
  public ParseOptions() {
    String[] arrayOfString = ZG();
    this.allowEmptyStrings = true;
    this.validateExternalRefs = false;
    this.validateInternalRefs = true;
    this.legacyYamlDeserialization = false;
    this.resolveRequestBody = false;
    this.inferSchemaType = true;
    if (Zbqc.Zwu() == null)
      Zj(new String[2]); 
  }
  
  public boolean isResolve() {
    return this.resolve;
  }
  
  public void setResolve(boolean paramBoolean) {
    this.resolve = paramBoolean;
  }
  
  public boolean isResolveCombinators() {
    return this.resolveCombinators;
  }
  
  public void setResolveCombinators(boolean paramBoolean) {
    this.resolveCombinators = paramBoolean;
  }
  
  public boolean isResolveFully() {
    return this.resolveFully;
  }
  
  public void setResolveFully(boolean paramBoolean) {
    this.resolveFully = paramBoolean;
  }
  
  public boolean isResolveRequestBody() {
    return this.resolveRequestBody;
  }
  
  public void setResolveRequestBody(boolean paramBoolean) {
    this.resolveRequestBody = paramBoolean;
  }
  
  public boolean isFlatten() {
    return this.flatten;
  }
  
  public void setFlatten(boolean paramBoolean) {
    this.flatten = paramBoolean;
  }
  
  public boolean isSkipMatches() {
    return this.skipMatches;
  }
  
  public void setSkipMatches(boolean paramBoolean) {
    this.skipMatches = paramBoolean;
  }
  
  public boolean isFlattenComposedSchemas() {
    return this.flattenComposedSchemas;
  }
  
  public void setFlattenComposedSchemas(boolean paramBoolean) {
    this.flattenComposedSchemas = paramBoolean;
  }
  
  public boolean isCamelCaseFlattenNaming() {
    return this.camelCaseFlattenNaming;
  }
  
  public void setCamelCaseFlattenNaming(boolean paramBoolean) {
    this.camelCaseFlattenNaming = paramBoolean;
  }
  
  public boolean isAllowEmptyString() {
    return this.allowEmptyStrings;
  }
  
  public void setAllowEmptyString(boolean paramBoolean) {
    this.allowEmptyStrings = paramBoolean;
  }
  
  public boolean isValidateExternalRefs() {
    return this.validateExternalRefs;
  }
  
  public void setValidateExternalRefs(boolean paramBoolean) {
    this.validateExternalRefs = paramBoolean;
  }
  
  public boolean isLegacyYamlDeserialization() {
    return this.legacyYamlDeserialization;
  }
  
  public void setLegacyYamlDeserialization(boolean paramBoolean) {
    this.legacyYamlDeserialization = paramBoolean;
  }
  
  public void setOaiAuthor(boolean paramBoolean) {
    this.oaiAuthor = paramBoolean;
  }
  
  public boolean isOaiAuthor() {
    return this.oaiAuthor;
  }
  
  public void setValidateInternalRefs(boolean paramBoolean) {
    this.validateInternalRefs = paramBoolean;
  }
  
  public boolean isValidateInternalRefs() {
    return this.validateInternalRefs;
  }
  
  public boolean isInferSchemaType() {
    return this.inferSchemaType;
  }
  
  public void setInferSchemaType(boolean paramBoolean) {
    this.inferSchemaType = paramBoolean;
  }
  
  public boolean isSafelyResolveURL() {
    return this.safelyResolveURL;
  }
  
  public void setSafelyResolveURL(boolean paramBoolean) {
    this.safelyResolveURL = paramBoolean;
  }
  
  public List<String> getRemoteRefAllowList() {
    return this.remoteRefAllowList;
  }
  
  public void setRemoteRefAllowList(List<String> paramList) {
    this.remoteRefAllowList = paramList;
  }
  
  public List<String> getRemoteRefBlockList() {
    return this.remoteRefBlockList;
  }
  
  public void setRemoteRefBlockList(List<String> paramList) {
    this.remoteRefBlockList = paramList;
  }
  
  public static void Zj(String[] paramArrayOfString) {
    ZT = paramArrayOfString;
  }
  
  public static String[] ZG() {
    return ZT;
  }
  
  static {
    if (ZG() != null)
      Zj(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v2\ParseOptions.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */