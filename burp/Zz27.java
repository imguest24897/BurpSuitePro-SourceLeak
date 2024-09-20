package burp;

import burp.api.montoya.ui.menu.Menu;
import burp.api.montoya.ui.menu.MenuItem;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Zz27 implements Menu {
  private final String Zk;
  
  private final List<MenuItem> ZT;
  
  Zz27(String paramString, List<MenuItem> paramList) {
    this.Zk = paramString;
    this.ZT = paramList;
  }
  
  public String caption() {
    return this.Zk;
  }
  
  public List<MenuItem> menuItems() {
    return this.ZT;
  }
  
  public Menu withCaption(String paramString) {
    return new Zz27(paramString, this.ZT);
  }
  
  public Menu withMenuItems(MenuItem... paramVarArgs) {
    return new Zz27(this.Zk, Arrays.asList(paramVarArgs));
  }
  
  public Menu withMenuItems(List<MenuItem> paramList) {
    return new Zz27(this.Zk, paramList);
  }
  
  static Menu Zp(String paramString) {
    return new Zz27(paramString, Collections.emptyList());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz27.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */