/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import com.sun.javafx.binding.StringFormatter;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.property.ReadOnlyBooleanProperty;
/*     */ import javafx.beans.property.ReadOnlyIntegerProperty;
/*     */ import javafx.beans.value.ObservableObjectValue;
/*     */ import javafx.beans.value.ObservableSetValue;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ import javafx.collections.FXCollections;
/*     */ import javafx.collections.ObservableList;
/*     */ import javafx.collections.ObservableSet;
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
/*     */ 
/*     */ 
/*     */ public abstract class SetExpression<E>
/*     */   implements ObservableSetValue<E>
/*     */ {
/*     */   public ObservableSet<E> getValue() {
/*  64 */     return (ObservableSet<E>)get();
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
/*     */   public static <E> SetExpression<E> setExpression(final ObservableSetValue<E> value) {
/*  84 */     if (value == null) {
/*  85 */       throw new NullPointerException("Set must be specified.");
/*     */     }
/*  87 */     return (value instanceof SetExpression) ? (SetExpression<E>)value : 
/*  88 */       new SetBinding<E>()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/*  95 */           unbind(new Observable[] { (Observable)this.val$value });
/*     */         }
/*     */ 
/*     */         
/*     */         protected ObservableSet<E> computeValue() {
/* 100 */           return (ObservableSet<E>)value.get();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<?> getDependencies() {
/* 105 */           return FXCollections.singletonObservableList(value);
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSize() {
/* 115 */     return size();
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
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding isEqualTo(ObservableSet<?> paramObservableSet) {
/* 141 */     return Bindings.equal((ObservableObjectValue<?>)this, paramObservableSet);
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
/*     */   public BooleanBinding isNotEqualTo(ObservableSet<?> paramObservableSet) {
/* 155 */     return Bindings.notEqual((ObservableObjectValue<?>)this, paramObservableSet);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding isNull() {
/* 164 */     return Bindings.isNull((ObservableObjectValue<?>)this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding isNotNull() {
/* 173 */     return Bindings.isNotNull((ObservableObjectValue<?>)this);
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
/*     */   public StringBinding asString() {
/* 185 */     return (StringBinding)StringFormatter.convert((ObservableValue)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 190 */     return getNonNull().size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/* 195 */     return getNonNull().isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean contains(Object paramObject) {
/* 200 */     return getNonNull().contains(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterator<E> iterator() {
/* 205 */     return getNonNull().iterator();
/*     */   }
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/* 210 */     return getNonNull().toArray();
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> T[] toArray(T[] paramArrayOfT) {
/* 215 */     return (T[])getNonNull().toArray((Object[])paramArrayOfT);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean add(E paramE) {
/* 220 */     return getNonNull().add(paramE);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean remove(Object paramObject) {
/* 225 */     return getNonNull().remove(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsAll(Collection<?> paramCollection) {
/* 230 */     return getNonNull().containsAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(Collection<? extends E> paramCollection) {
/* 235 */     return getNonNull().addAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeAll(Collection<?> paramCollection) {
/* 240 */     return getNonNull().removeAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean retainAll(Collection<?> paramCollection) {
/* 245 */     return getNonNull().retainAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 250 */     getNonNull().clear();
/*     */   }
/*     */   
/*     */   private ObservableSet<E> getNonNull() {
/* 254 */     ObservableSet<E> observableSet = (ObservableSet)get();
/*     */     
/* 256 */     return (observableSet == null) ? FXCollections.emptyObservableSet() : observableSet;
/*     */   }
/*     */   
/*     */   public abstract ReadOnlyIntegerProperty sizeProperty();
/*     */   
/*     */   public abstract ReadOnlyBooleanProperty emptyProperty();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\SetExpression.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */