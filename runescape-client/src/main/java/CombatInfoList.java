import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dp")
@Implements("CombatInfoList")
public class CombatInfoList implements Iterable {
   @ObfuscatedName("o")
   @Export("node")
   Node node = new Node();
   @ObfuscatedName("m")
   Node field1892;

   @ObfuscatedName("c")
   public Node method2309() {
      Node var1 = this.field1892;
      if(var1 == this.node) {
         this.field1892 = null;
         return null;
      } else {
         this.field1892 = var1.next;
         return var1;
      }
   }

   @ObfuscatedName("b")
   public static void method2310(Node var0, Node var1) {
      if(var0.previous != null) {
         var0.unlink();
      }

      var0.previous = var1;
      var0.next = var1.next;
      var0.previous.next = var0;
      var0.next.previous = var0;
   }

   @ObfuscatedName("g")
   public Node method2311() {
      return this.method2332((Node)null);
   }

   @ObfuscatedName("m")
   public void method2313(Node var1) {
      if(var1.previous != null) {
         var1.unlink();
      }

      var1.previous = this.node;
      var1.next = this.node.next;
      var1.previous.next = var1;
      var1.next.previous = var1;
   }

   @ObfuscatedName("u")
   public boolean method2314() {
      return this.node.next == this.node;
   }

   public Iterator iterator() {
      return new class123(this);
   }

   public CombatInfoList() {
      this.node.next = this.node;
      this.node.previous = this.node;
   }

   @ObfuscatedName("o")
   public void method2329(Node var1) {
      if(var1.previous != null) {
         var1.unlink();
      }

      var1.previous = this.node.previous;
      var1.next = this.node;
      var1.previous.next = var1;
      var1.next.previous = var1;
   }

   @ObfuscatedName("l")
   Node method2332(Node var1) {
      Node var2;
      if(var1 == null) {
         var2 = this.node.next;
      } else {
         var2 = var1;
      }

      if(var2 == this.node) {
         this.field1892 = null;
         return null;
      } else {
         this.field1892 = var2.next;
         return var2;
      }
   }
}