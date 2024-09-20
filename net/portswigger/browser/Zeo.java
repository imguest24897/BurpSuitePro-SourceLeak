package net.portswigger.browser;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public interface Zeo {
  public static final List<Zeo> Zk = Arrays.asList(new Zeo[] { new Zt9(), new Zt6(), new Ztd(), new Ztl(), new Zt4(), new Zjm(), new Zt0() });
  
  public static final List<Zeo> Zh = Arrays.asList(new Zeo[] { new Zep(), new Zen(), new Zej(), new Zei() });
  
  public static final List<Zeo> ZJ = Stream.<List>of(new List[] { Zh, Zk }).flatMap(Collection::stream).toList();
  
  static Zeo Zw(Zjp paramZjp) {
    return ZJ.stream().filter(paramZjp::lambda$strategyFor$0).findFirst().orElseThrow();
  }
  
  boolean Zj(Zjp paramZjp);
  
  List<Zh> Zn(Zjp paramZjp, Zdr paramZdr, Zdm paramZdm, Zd0 paramZd0);
  
  String ZG(Zjp paramZjp);
  
  private static boolean lambda$strategyFor$0(Zjp paramZjp, Zeo paramZeo) {
    return paramZeo.Zj(paramZjp);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zeo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */