package burp;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;

class Zkqy implements Zkfj {
  private static final Map<Zlp9, Byte> Zy = Map.of(Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_JAVA_EL, Byte.valueOf((byte)18), Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_SPRING_HASH, Byte.valueOf((byte)12), Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_SPRING_DOLLAR, Byte.valueOf((byte)12), Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_FREEMARKER, Byte.valueOf((byte)3), Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_THYMELEAF, Byte.valueOf((byte)13), Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_VELOCITY, Byte.valueOf((byte)7), Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_OGNL, Byte.valueOf((byte)17));
  
  public Zsqx<Zrdb> Zt(Ze3n paramZe3n, Zxs7 paramZxs7, Zer0 paramZer0, Zbll paramZbll, List<Zer0> paramList) {
    String[] arrayOfString = Ztqu.ZA();
    Zvow zvow = paramZe3n.ZI().Zp(paramZbll.Zk.Zu(paramZxs7).ZE()).ZK(paramZbll.ZR).ZK(paramZbll.Zk.Zn(paramZbll, paramZxs7));
    if (Zbqc.Zwu() == null)
      Ztqu.Zn(new String[1]); 
    return new Zx_5(Zzu2.SERVER_SIDE_TEMPLATE_ENGINE_INJECTION, ((Byte)Zy.get(paramZbll.Zk.ZG())).byteValue(), 1, Collections.emptyMap(), Collections.singletonList(new Zt69(new Zz25(paramZbll.Zk.Zh(), 0), zvow, paramZbll.ZP)), (byte)2, (byte)4, paramZe3n.Za(), Zkb.Zy(paramZe3n.ZN()), paramZxs7);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkqy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */