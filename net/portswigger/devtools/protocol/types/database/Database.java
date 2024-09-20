package net.portswigger.devtools.protocol.types.database;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.database.Database")
public class Database {
  @Zvd(Zp = "id")
  public final String id;
  
  @Zvd(Zp = "domain")
  public final String domain;
  
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "version")
  public final String version;
  
  @Zox
  public Database(@Zc5(Ze = "id") String paramString1, @Zc5(Ze = "domain") String paramString2, @Zc5(Ze = "name") String paramString3, @Zc5(Ze = "version") String paramString4) {
    this.id = paramString1;
    String[] arrayOfString = ExecuteSQL.ZA();
    this.domain = paramString2;
    this.name = paramString3;
    this.version = paramString4;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\database\Database.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */