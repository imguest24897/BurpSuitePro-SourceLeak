package net.portswigger.devtools.protocol.types.database;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.database.ExecuteSQL")
public class ExecuteSQL {
  @Zvd(Zp = "columnNames")
  @Zj
  public final List<String> columnNames;
  
  @Zvd(Zp = "values")
  @Zj
  public final List<Zi7> values;
  
  @Zvd(Zp = "sqlError")
  @Zj
  public final Error sqlError;
  
  private static String[] ZL;
  
  @Zox
  public ExecuteSQL(@Zc5(Ze = "columnNames", ZS = "null") List<String> paramList, @Zc5(Ze = "values", ZS = "null") List<Zi7> paramList1, @Zc5(Ze = "sqlError", ZS = "null") Error paramError) {
    String[] arrayOfString = ZA();
    this.columnNames = paramList;
    this.values = paramList1;
    this.sqlError = paramError;
    if (Zbqc.Zwu() == null)
      Zv(new String[2]); 
  }
  
  public static void Zv(String[] paramArrayOfString) {
    ZL = paramArrayOfString;
  }
  
  public static String[] ZA() {
    return ZL;
  }
  
  static {
    if (ZA() != null)
      Zv(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\database\ExecuteSQL.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */