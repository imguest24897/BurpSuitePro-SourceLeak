package burp;

import java.util.List;

class Zmhg implements Zsh2 {
  public void Zd(Zzir paramZzir) {
    Ze_6 ze_6 = paramZzir.ZvB();
    Zm39 zm39 = ze_6.ZmM();
    ZD(zm39);
    Zu(zm39);
  }
  
  private void ZD(Zm39 paramZm39) {
    List<Zeew> list = Zeew.Zk();
    list.add(Zeew.SUITE);
    list.forEach(paramZm39::lambda$cleanLoggingConfiguration$0);
  }
  
  private void Zu(Zm39 paramZm39) {
    Zefg<Zzp3> zefg = paramZm39.ZOz();
    zefg.clear();
  }
  
  private static void lambda$cleanLoggingConfiguration$0(Zm39 paramZm39, Zeew paramZeew) {
    paramZm39.ZQ(paramZeew, null);
    paramZm39.ZK(paramZeew, null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmhg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */