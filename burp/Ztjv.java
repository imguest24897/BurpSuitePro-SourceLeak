package burp;

class Ztjv {
  private final String ZZ;
  
  private final ClassLoader Zm;
  
  public Ztjv(String paramString, ClassLoader paramClassLoader) {
    this.ZZ = paramString;
    this.Zm = (paramClassLoader != null) ? paramClassLoader : getClass().getClassLoader();
  }
  
  public Zmhz Zq() throws Exception {
    return Class.forName(this.ZZ, true, this.Zm).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztjv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */