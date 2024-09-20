/*    */ package javafx.beans.property;
/*    */ 
/*    */ import javafx.beans.binding.StringExpression;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ReadOnlyStringProperty
/*    */   extends StringExpression
/*    */   implements ReadOnlyProperty<String>
/*    */ {
/*    */   public String toString() {
/* 54 */     Object object = getBean();
/* 55 */     String str = getName();
/* 56 */     StringBuilder stringBuilder = new StringBuilder("ReadOnlyStringProperty [");
/*    */     
/* 58 */     if (object != null) {
/* 59 */       stringBuilder.append("bean: ").append(object).append(", ");
/*    */     }
/* 61 */     if (str != null && !str.equals("")) {
/* 62 */       stringBuilder.append("name: ").append(str).append(", ");
/*    */     }
/* 64 */     stringBuilder.append("value: ").append((String)get()).append("]");
/* 65 */     return stringBuilder.toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyStringProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */