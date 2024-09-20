package META-INF.versions.9.org.yaml;

import org.yaml.Z_t;

public class Ztx {
  private final System.Logger logger;
  
  private Ztx(String paramString) {
    this.logger = System.getLogger(paramString);
  }
  
  public static org.yaml.Ztx Zi(String paramString) {
    return new org.yaml.Ztx(paramString);
  }
  
  public boolean Zn(Z_t paramZ_t) {
    return this.logger.isLoggable(Z_t.access$000(paramZ_t));
  }
  
  public void Zg(String paramString) {
    this.logger.log(Z_t.access$000(Z_t.WARNING), paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\yaml\Ztx.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */