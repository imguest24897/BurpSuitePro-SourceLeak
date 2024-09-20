package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.FontFamilies")
public class FontFamilies {
  @Zvd(Zp = "standard")
  @Zj
  public final String standard;
  
  @Zvd(Zp = "fixed")
  @Zj
  public final String fixed;
  
  @Zvd(Zp = "serif")
  @Zj
  public final String serif;
  
  @Zvd(Zp = "sansSerif")
  @Zj
  public final String sansSerif;
  
  @Zvd(Zp = "cursive")
  @Zj
  public final String cursive;
  
  @Zvd(Zp = "fantasy")
  @Zj
  public final String fantasy;
  
  @Zvd(Zp = "math")
  @Zj
  public final String math;
  
  @Zox
  public FontFamilies(@Zc5(Ze = "standard", ZS = "null") String paramString1, @Zc5(Ze = "fixed", ZS = "null") String paramString2, @Zc5(Ze = "serif", ZS = "null") String paramString3, @Zc5(Ze = "sansSerif", ZS = "null") String paramString4, @Zc5(Ze = "cursive", ZS = "null") String paramString5, @Zc5(Ze = "fantasy", ZS = "null") String paramString6, @Zc5(Ze = "math", ZS = "null") String paramString7) {
    this.standard = paramString1;
    this.fixed = paramString2;
    this.serif = paramString3;
    this.sansSerif = paramString4;
    this.cursive = paramString5;
    this.fantasy = paramString6;
    this.math = paramString7;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\FontFamilies.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */