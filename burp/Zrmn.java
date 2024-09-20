package burp;

import java.util.List;
import java.util.function.Predicate;
import javax.swing.RowSorter;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public interface Zrmn extends TableColumnModel {
  void ZW(int paramInt);
  
  void Zt(TableColumn paramTableColumn);
  
  void ZK(int paramInt);
  
  void Z_(TableColumn paramTableColumn);
  
  boolean Zg(int paramInt);
  
  boolean Zm(TableColumn paramTableColumn);
  
  int Zm(int paramInt);
  
  void ZM();
  
  void Zo();
  
  TableColumn ZU(int paramInt);
  
  List<Zr8p> Zk(List<? extends RowSorter.SortKey> paramList);
  
  void ZB(List<Zr8p> paramList, RowSorter<? extends TableModel> paramRowSorter, Predicate<String> paramPredicate);
  
  boolean ZV(TableColumn paramTableColumn);
  
  void Zd(TableColumn paramTableColumn);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrmn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */