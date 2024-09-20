package org.bouncycastle.pkix.util.filter;

public class UntrustedInput {
  protected Object input;
  
  public UntrustedInput(Object paramObject) {
    this.input = paramObject;
  }
  
  public Object getInput() {
    return this.input;
  }
  
  public String getString() {
    return this.input.toString();
  }
  
  public String toString() {
    return this.input.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pki\\util\filter\UntrustedInput.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */