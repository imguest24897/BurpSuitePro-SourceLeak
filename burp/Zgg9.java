package burp;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Zgg9 {
  static Ztfk Za(Zlxo paramZlxo, Collection<Zs7s> paramCollection, Collection<Zko4> paramCollection1, Zr_4 paramZr_4) {
    Zbl6 zbl6 = new Zbl6();
    zbl6.ZA((paramZlxo.Zm4() && paramCollection1.isEmpty()));
    List<Ztvz> list = (List)paramCollection.stream().map(paramZr_4::lambda$buildCrawlerCredentialsContainerProvider$0).collect(Collectors.toList());
    zbl6.Zu(list);
    zbl6.ZT((paramZlxo.Zmv() && paramCollection1.isEmpty()));
    zbl6.Zv(paramCollection1);
    return zbl6.Zi(paramZr_4);
  }
  
  private static Ztvz lambda$buildCrawlerCredentialsContainerProvider$0(Zr_4 paramZr_4, Zs7s paramZs7s) {
    return paramZr_4.<Ztvz>ZH(new Zkvv(paramZs7s.ZHb(), paramZs7s.ZHy(), paramZs7s.ZP()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgg9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */