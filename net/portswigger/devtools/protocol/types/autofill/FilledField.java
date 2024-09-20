package net.portswigger.devtools.protocol.types.autofill;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.autofill.FilledField")
public class FilledField {
  @Zvd(Zp = "htmlType")
  public final String htmlType;
  
  @Zvd(Zp = "id")
  public final String id;
  
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "value")
  public final String value;
  
  @Zvd(Zp = "autofillType")
  public final String autofillType;
  
  @Zvd(Zp = "fillingStrategy")
  public final FillingStrategy fillingStrategy;
  
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "fieldId")
  public final Integer fieldId;
  
  @Zox
  public FilledField(@Zc5(Ze = "htmlType") String paramString1, @Zc5(Ze = "id") String paramString2, @Zc5(Ze = "name") String paramString3, @Zc5(Ze = "value") String paramString4, @Zc5(Ze = "autofillType") String paramString5, @Zc5(Ze = "fillingStrategy") FillingStrategy paramFillingStrategy, @Zc5(Ze = "frameId") String paramString6, @Zc5(Ze = "fieldId") Integer paramInteger) {
    this.htmlType = paramString1;
    this.id = paramString2;
    this.name = paramString3;
    this.value = paramString4;
    this.autofillType = paramString5;
    this.fillingStrategy = paramFillingStrategy;
    this.frameId = paramString6;
    String str = FillingStrategy.Zj();
    this.fieldId = paramInteger;
    if (str == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\autofill\FilledField.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */