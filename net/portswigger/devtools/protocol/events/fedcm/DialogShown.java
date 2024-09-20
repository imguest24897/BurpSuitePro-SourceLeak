package net.portswigger.devtools.protocol.events.fedcm;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.fedcm.Account;
import net.portswigger.devtools.protocol.types.fedcm.DialogType;

@Zsi("net.portswigger.devtools.protocol.events.fedcm.DialogShown")
public class DialogShown implements Zl {
  @Zvd(Zp = "dialogId")
  public final String dialogId;
  
  @Zvd(Zp = "dialogType")
  public final DialogType dialogType;
  
  @Zvd(Zp = "accounts")
  public final List<Account> accounts;
  
  @Zvd(Zp = "title")
  public final String title;
  
  @Zvd(Zp = "subtitle")
  @Zj
  public final String subtitle;
  
  private static int[] Zr;
  
  @Zox
  public DialogShown(@Zc5(Ze = "dialogId") String paramString1, @Zc5(Ze = "dialogType") DialogType paramDialogType, @Zc5(Ze = "accounts") List<Account> paramList, @Zc5(Ze = "title") String paramString2, @Zc5(Ze = "subtitle", ZS = "null") String paramString3) {
    this.dialogId = paramString1;
    this.dialogType = paramDialogType;
    this.accounts = paramList;
    this.title = paramString2;
    this.subtitle = paramString3;
    int[] arrayOfInt = Zl();
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public static void Zs(int[] paramArrayOfint) {
    Zr = paramArrayOfint;
  }
  
  public static int[] Zl() {
    return Zr;
  }
  
  static {
    if (Zl() != null)
      Zs(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\fedcm\DialogShown.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */