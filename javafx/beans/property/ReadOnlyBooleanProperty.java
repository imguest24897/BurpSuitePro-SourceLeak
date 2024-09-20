/*     */ package javafx.beans.property;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.WeakInvalidationListener;
/*     */ import javafx.beans.binding.BooleanExpression;
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
/*     */ public abstract class ReadOnlyBooleanProperty
/*     */   extends BooleanExpression
/*     */   implements ReadOnlyProperty<Boolean>
/*     */ {
/*     */   public String toString() {
/*  56 */     Object object = getBean();
/*  57 */     String str = getName();
/*  58 */     StringBuilder stringBuilder = new StringBuilder("ReadOnlyBooleanProperty [");
/*     */     
/*  60 */     if (object != null) {
/*  61 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/*  63 */     if (str != null && !str.equals("")) {
/*  64 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/*  66 */     stringBuilder.append("value: ").append(get()).append("]");
/*  67 */     return stringBuilder.toString();
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
/*     */   public static ReadOnlyBooleanProperty readOnlyBooleanProperty(final ReadOnlyProperty<Boolean> property) {
/*  89 */     if (property == null) {
/*  90 */       throw new NullPointerException("Property cannot be null");
/*     */     }
/*     */     
/*  93 */     return (property instanceof ReadOnlyBooleanProperty) ? (ReadOnlyBooleanProperty)property : 
/*  94 */       new ReadOnlyBooleanPropertyBase()
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
/*     */         public boolean get() {
/* 109 */           this.valid = true;
/* 110 */           Boolean bool = (Boolean)property.getValue();
/* 111 */           return (bool == null) ? false : bool.booleanValue();
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
/*     */   public ReadOnlyObjectProperty<Boolean> asObject() {
/* 137 */     return new ReadOnlyObjectPropertyBase<Boolean>()
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
/* 158 */           return ReadOnlyBooleanProperty.this.getName();
/*     */         }
/*     */ 
/*     */         
/*     */         public Boolean get() {
/* 163 */           this.valid = true;
/* 164 */           return ReadOnlyBooleanProperty.this.getValue();
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyBooleanProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */