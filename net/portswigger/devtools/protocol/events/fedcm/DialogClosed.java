package net.portswigger.devtools.protocol.events.fedcm;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.fedcm.DialogClosed")
public class DialogClosed implements Zl {
  @Zvd(Zp = "dialogId")
  public final String dialogId;
  
  @Zox
  public DialogClosed(@Zc5(Ze = "dialogId") String paramString) {
    int[] arrayOfInt = DialogShown.Zl();
    this.dialogId = paramString;
    if (Zbqc.Zwu() == null)
      DialogShown.Zs(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\fedcm\DialogClosed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */