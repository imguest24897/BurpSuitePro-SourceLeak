package burp;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class Zb5y extends Zbqc {
  private final Zttx ZQ;
  
  private final Map<String, Supplier<String>> ZT = new HashMap<>();
  
  private final Zb5t Zv;
  
  public Zb5y(Zttx paramZttx) {
    this.ZQ = paramZttx;
    GridBagLayout gridBagLayout = new GridBagLayout();
    setLayout(gridBagLayout);
    int i = ZG(this, paramZttx, this.ZT, true);
    int[] arrayOfInt = new int[i + 2];
    Zk(i, arrayOfInt);
    this.Zv = new Zb5t(paramZttx);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = i;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    arrayOfInt[i] = 0;
    arrayOfInt[i + 1] = 0;
    add(this.Zv, gridBagConstraints);
    gridBagLayout.rowHeights = arrayOfInt;
    gridBagLayout.columnWidths = new int[] { 0, 20, 0, 20, 0 };
  }
  
  public void ZY() {
    this.ZT.clear();
  }
  
  static void Zk(int paramInt, int[] paramArrayOfint) {
    int[] arrayOfInt = Zb5a.Zd();
    byte b = 0;
    while (b < paramInt) {
      paramArrayOfint[b] = 0;
      paramArrayOfint[b + 1] = 10;
      paramArrayOfint[b + 2] = 0;
      paramArrayOfint[b + 3] = 20;
      b += 4;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  static int ZG(Container paramContainer, Zttx paramZttx, Map<String, Supplier<String>> paramMap, boolean paramBoolean) {
    byte b1 = 0;
    byte b2 = 0;
    int[] arrayOfInt = Zb5a.Zd();
    for (Ze83 ze83 : Ze83.Ze) {
      if (b2 >= 6) {
        b1 += true;
        b2 = 0;
      } 
      ZW(paramContainer, ze83.Zkd(), ze83.Zx(paramZttx), paramBoolean ? ze83.ZkK() : "", b1, b2, paramMap);
      b2 += 2;
      if (arrayOfInt == null)
        break; 
    } 
    return b1 + 4;
  }
  
  static void ZW(Container paramContainer, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, Map<String, Supplier<String>> paramMap) {
    Zm99 zm99 = new Zm99(paramString1);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = paramInt2;
    gridBagConstraints.gridy = paramInt1;
    gridBagConstraints.anchor = 23;
    paramContainer.add(zm99, gridBagConstraints);
    Zg85 zg85 = new Zg85();
    zg85.setName(paramString3);
    zg85.setColumns(15);
    zg85.setText(paramString2);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = paramInt2;
    gridBagConstraints.gridy = paramInt1 + 2;
    gridBagConstraints.anchor = 23;
    paramContainer.add(zg85, gridBagConstraints);
    Objects.requireNonNull(zg85);
    paramMap.put(paramString1, zg85::getText);
  }
  
  public void Z_() {
    Ze83.Ze.forEach(this::lambda$save$1);
    this.Zv.ZO();
  }
  
  private void lambda$save$1(Ze83 paramZe83) {
    paramZe83.Zks().apply(this.ZQ, ((Supplier<String>)this.ZT.getOrDefault(paramZe83.Zkd(), Zb5y::lambda$save$0)).get());
  }
  
  private static String lambda$save$0() {
    return "";
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb5y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */