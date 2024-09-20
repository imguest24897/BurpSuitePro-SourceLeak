package net.portswigger.swagger.v1.parser.util;

import java.util.List;

public class ParseOptions {
  private boolean resolve;
  
  private boolean flatten;
  
  private boolean safelyResolveURL;
  
  private List<String> remoteRefAllowList;
  
  private List<String> remoteRefBlockList;
  
  public boolean isResolve() {
    return this.resolve;
  }
  
  public void setResolve(boolean paramBoolean) {
    this.resolve = paramBoolean;
  }
  
  public boolean isFlatten() {
    return this.flatten;
  }
  
  public void setFlatten(boolean paramBoolean) {
    this.flatten = paramBoolean;
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
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parse\\util\ParseOptions.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */