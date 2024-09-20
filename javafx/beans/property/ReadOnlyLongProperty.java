/*     */ package javafx.beans.property;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.WeakInvalidationListener;
/*     */ import javafx.beans.binding.LongExpression;
/*     */ import javafx.beans.binding.ObjectExpression;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ReadOnlyLongProperty
/*     */   extends LongExpression
/*     */   implements ReadOnlyProperty<Number>
/*     */ {
/*     */   public String toString() {
/*  56 */     Object object = getBean();
/*  57 */     String str = getName();
/*  58 */     StringBuilder stringBuilder = new StringBuilder("ReadOnlyLongProperty [");
/*  59 */     if (object != null) {
/*  60 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/*  62 */     if (str != null && !str.equals("")) {
/*  63 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/*  65 */     stringBuilder.append("value: ").append(get()).append("]");
/*  66 */     return stringBuilder.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T extends Number> ReadOnlyLongProperty readOnlyLongProperty(final ReadOnlyProperty<T> property) {
/*  89 */     if (property == null) {
/*  90 */       throw new NullPointerException("Property cannot be null");
/*     */     }
/*     */     
/*  93 */     return (property instanceof ReadOnlyLongProperty) ? (ReadOnlyLongProperty)property : 
/*  94 */       new ReadOnlyLongPropertyBase()
/*     */       {
/*     */         private boolean valid;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         private final InvalidationListener listener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         public long get() {
/* 109 */           this.valid = true;
/* 110 */           Number number = (Number)property.getValue();
/* 111 */           return (number == null) ? 0L : number.longValue();
/*     */         }
/*     */ 
/*     */         
/*     */         public Object getBean() {
/* 116 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 121 */           return property.getName();
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyObjectProperty<Long> asObject() {
/* 137 */     return new ReadOnlyObjectPropertyBase<Long>()
/*     */       {
/*     */         private boolean valid;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         private final InvalidationListener listener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         public Object getBean() {
/* 153 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 158 */           return ReadOnlyLongProperty.this.getName();
/*     */         }
/*     */ 
/*     */         
/*     */         public Long get() {
/* 163 */           this.valid = true;
/* 164 */           return ReadOnlyLongProperty.this.getValue();
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyLongProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */