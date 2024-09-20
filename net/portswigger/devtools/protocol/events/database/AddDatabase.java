package net.portswigger.devtools.protocol.events.database;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.database.Database;

@Zsi("net.portswigger.devtools.protocol.events.database.AddDatabase")
public class AddDatabase implements Zl {
  @Zvd(Zp = "database")
  public final Database database;
  
  private static int Zz;
  
  @Zox
  public AddDatabase(@Zc5(Ze = "database") Database paramDatabase) {
    this.database = paramDatabase;
    int i = Zg();
    if (i == 0)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public static void Zp(int paramInt) {
    Zz = paramInt;
  }
  
  public static int Zg() {
    return Zz;
  }
  
  public static int ZZ() {
    int i = Zg();
    return (i == 0) ? 64 : 0;
  }
  
  static {
    if (ZZ() != 0)
      Zp(96); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\database\AddDatabase.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */