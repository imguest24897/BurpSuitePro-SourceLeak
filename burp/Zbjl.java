package burp;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import net.portswigger.Zen;
import net.portswigger.Zsy;

public interface Zbjl extends Ztu3, Zzod {
  static Zbjl Zr(Zz0n paramZz0n, Zmtq paramZmtq, Ze_7 paramZe_7, Zkl6 paramZkl6, Zskh paramZskh, Zgb6 paramZgb6, Ztwv paramZtwv, Zlli<Zt11> paramZlli) {
    Zxpt zxpt = new Zxpt(paramZgb6);
    Zrgd zrgd = paramZz0n.ZP();
    Ztz_ ztz_ = new Ztz_(paramZe_7, paramZkl6.ZB(), paramZmtq, paramZkl6.Zs(), zxpt, zrgd, paramZkl6.ZH());
    Zeao zeao = new Zeao(ztz_, zrgd, paramZskh, zxpt);
    Zbj1 zbj1 = new Zbj1(zeao, paramZlli);
    ScheduledExecutorService scheduledExecutorService = paramZtwv.Ze();
    Zzo_ zzo_ = new Zzo_(zrgd, zbj1, zeao, paramZgb6, scheduledExecutorService);
    zzo_.ZC();
    return new Zv3(zbj1, ztz_, zzo_, paramZmtq, paramZgb6);
  }
  
  void ZF(Zkq4 paramZkq4, Zb9a paramZb9a, Zkl6 paramZkl6, Zmz6 paramZmz6, Zr_4 paramZr_4, Zesv paramZesv, List<Zg_8> paramList, Zsy paramZsy, Zly1 paramZly1, Zr5h paramZr5h, boolean paramBoolean, Zz1m<Zt1o> paramZz1m);
  
  void Zs();
  
  void ZS();
  
  List<Zer0> ZV(int paramInt, Ze3n paramZe3n);
  
  List<Zer0> Zb(Zen paramZen);
  
  List<Zer0> Zn(Zen paramZen);
  
  List<Zer0> Ze(Zen paramZen);
  
  void Zz(Collection<Zen> paramCollection, int paramInt1, int paramInt2);
  
  boolean ZF(Zen paramZen);
  
  Zen ZK(int paramInt, String paramString);
  
  boolean ZG();
  
  Zzi5 ZB();
  
  void ZP();
  
  void ZY();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbjl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */