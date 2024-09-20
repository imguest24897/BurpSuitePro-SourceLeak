package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbon implements Zshb {
  protected final Preferences ZP;
  
  public Zbon(Preferences paramPreferences) {
    this.ZP = paramPreferences;
  }
  
  public void ZV(String paramString1, String paramString2) {
    Zgbm.ZZ(this.ZP, paramString1, paramString2);
  }
  
  public String Zn(String paramString) {
    return Zgbm.ZB(this.ZP, paramString);
  }
  
  public boolean ZB(String paramString) {
    return Zgbm.ZO(this.ZP, paramString);
  }
  
  public Zshb ZD(String paramString) {
    Preferences preferences = this.ZP.node(paramString);
    try {
      preferences.flush();
    } catch (BackingStoreException backingStoreException) {
      Zah.Zl(backingStoreException, Zk_.UNEXPECTED);
    } 
    return new Zbon(preferences);
  }
  
  public List<String> Zg() {
    try {
      return Arrays.asList(this.ZP.keys());
    } catch (BackingStoreException backingStoreException) {
      Zah.Zl(backingStoreException, Zk_.UNEXPECTED);
      return Collections.emptyList();
    } 
  }
  
  public void ZB() {
    boolean bool = Zezx.ZY();
    try {
      String[] arrayOfString1 = this.ZP.childrenNames();
      String[] arrayOfString2 = arrayOfString1;
      int i = arrayOfString2.length;
      byte b = 0;
      while (b < i) {
        String str = arrayOfString2[b];
        Preferences preferences = this.ZP.node(str);
        preferences.removeNode();
        b++;
        if (!bool)
          break; 
      } 
    } catch (BackingStoreException backingStoreException) {
      Zah.Zl(backingStoreException, Zk_.UNEXPECTED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbon.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */