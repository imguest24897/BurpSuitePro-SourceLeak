package net.portswigger.devtools.protocol.types.input;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.input.DragData")
public class DragData {
  @Zvd(Zp = "items")
  public final List<DragDataItem> items;
  
  @Zvd(Zp = "files")
  @Zj
  public final List<String> files;
  
  @Zvd(Zp = "dragOperationsMask")
  public final Integer dragOperationsMask;
  
  @Zox
  public DragData(@Zc5(Ze = "items") List<DragDataItem> paramList, @Zc5(Ze = "files", ZS = "null") List<String> paramList1, @Zc5(Ze = "dragOperationsMask") Integer paramInteger) {
    this.items = paramList;
    this.files = paramList1;
    this.dragOperationsMask = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\input\DragData.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */