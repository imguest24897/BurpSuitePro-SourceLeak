package burp;

import java.awt.Component;
import java.util.List;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zrjn implements Zkuu<Zzh2> {
  private final Zx8n Zo;
  
  private final Zbp5 ZJ;
  
  public Zrjn(Zx8n paramZx8n, Zbp5 paramZbp5) {
    this.Zo = paramZx8n;
    this.ZJ = paramZbp5;
  }
  
  public boolean ZW(int paramInt, List<Zzh2> paramList, Component paramComponent) {
    try {
      if (paramList.isEmpty())
        return false; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      List<Zstu> list;
      switch (paramInt) {
        case 132608:
        case 132672:
        case 132736:
          list = (List)paramList.stream().map(Zzh2::ZGU).collect(Collectors.toList());
          try {
            if (!list.isEmpty())
              this.Zo.ZYa().ZH().Zk(list); 
          } catch (Exception exception) {
            throw a(null);
          } 
          return true;
        case 131328:
          if (paramList.size() == 1) {
            Zzh2 zzh2 = paramList.get(0);
            Zkod zkod = this.ZJ.ZJ(zzh2);
            try {
            
            } catch (Exception exception) {
              throw a(null);
            } 
            Zstu zstu = (zzh2.ZGy() == null) ? zzh2.ZGU() : zzh2.ZGy();
            try {
            
            } catch (Exception exception) {
              throw a(null);
            } 
            Ze3o ze3o = zzh2.ZGf() ? Ze3o.CLIENT_TO_SERVER : Ze3o.SERVER_TO_CLIENT;
            Zkmj zkmj = zkod.Zv(zzh2.ZGz(), zzh2.ZGP(), ze3o, zstu);
            this.Zo.ZYa().Zm().Zf(zkmj);
          } 
          return true;
      } 
      return false;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return false;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrjn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */