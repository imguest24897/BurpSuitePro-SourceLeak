package burp;

import java.util.List;

public class Zzg4 implements Zgtz {
  private final Zgtz[] Zf;
  
  public Zzg4(Zgtz... paramVarArgs) {
    this.Zf = paramVarArgs;
  }
  
  public List<Zb3t> ZO(List<Zb3t> paramList) {
    List<Zb3t> list = paramList;
    Zgtz[] arrayOfZgtz = this.Zf;
    int j = arrayOfZgtz.length;
    byte b = 0;
    int i = Zggr.Zz();
    while (b < j) {
      Zgtz zgtz = arrayOfZgtz[b];
      list = zgtz.ZO(list);
      b++;
      if (i != 0)
        break; 
    } 
    return list;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzg4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */