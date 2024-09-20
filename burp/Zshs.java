package burp;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Collections;
import java.util.List;
import javax.swing.SwingWorker;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

class Zshs extends SwingWorker<List<Zstu>, Void> {
  final Zbys Zz;
  
  Zshs(Zbys paramZbys) {}
  
  protected List<Zstu> ZH() {
    String str = this.Zz.ZL.ZD().Zp();
    return (str == null) ? Collections.emptyList() : (new BufferedReader(new StringReader(str))).lines().<Zstu>map(this::lambda$doInBackground$0).toList();
  }
  
  protected void done() {
    try {
      synchronized (this.Zz.Zb) {
        this.Zz.Zd.addAll(get());
      } 
      this.Zz.Zz();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private Zstu lambda$doInBackground$0(String paramString) {
    return this.Zz.Zg.ZZ(Zkb.Zy(paramString));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zshs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */