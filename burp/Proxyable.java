package burp;

public interface Proxyable {
  default Object proxiedObject() {
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Proxyable.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */