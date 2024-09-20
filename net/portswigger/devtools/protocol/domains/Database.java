package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.database.AddDatabase;
import net.portswigger.devtools.protocol.types.database.ExecuteSQL;

@Zy
public interface Database {
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<ExecuteSQL>> executeSQL(@Zu("databaseId") String paramString1, @Zu("query") String paramString2);
  
  @Zr("tableNames")
  CompletableFuture<Zf<List<String>>> getDatabaseTableNames(@Zu("databaseId") String paramString);
  
  @Zb("addDatabase")
  Zs onAddDatabase(Zp<AddDatabase> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Database.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */