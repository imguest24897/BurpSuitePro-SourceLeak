package burp;

import burp.api.montoya.ui.editor.EditorOptions;
import burp.api.montoya.ui.editor.WebSocketMessageEditor;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

public class Zgj2 {
  private final Ztyg Zb;
  
  private final Zskl Zy;
  
  private final ScheduledExecutorService ZU;
  
  public Zgj2(Ztyg paramZtyg, Zskl paramZskl, Ztwv paramZtwv) {
    this.Zb = paramZtyg;
    this.Zy = paramZskl;
    this.ZU = paramZtwv.Ze();
  }
  
  public WebSocketMessageEditor ZG(EditorOptions... paramVarArgs) {
    boolean bool = !List.<EditorOptions>of(paramVarArgs).contains(EditorOptions.READ_ONLY) ? true : false;
    Zbdf zbdf = this.Zb.Zz(new Zr96(), Zeew.EXTENDER, bool, EnumSet.of(Zgu3.WS_MESSAGE), Zb9b.Zx);
    Objects.requireNonNull(zbdf);
    zbdf.Zn(new Ztk3(this.ZU, zbdf::Zc));
    return new Zegi(zbdf, this.Zy);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgj2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */