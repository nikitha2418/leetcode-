

class GfG
{
   /*inserts an element x to the set s */
   void insert(LinkedHashSet<Integer> s, int x)
   {
// Your code here
s.add(x);
   }

   /*prints the contents of the set s in ascending order */
   void print_Contents_Increasing_Order(LinkedHashSet<Integer> s)
   {
      ArrayList<Integer>list=new ArrayList<Integer>(s);
      Collections.sort(list);
      for(Integer i:list)
      System.out.print(i+" ");
// Your code here
   }

    /*prints the contents of the set s in ascending order */
   void print_Contents_Insertion_Order(LinkedHashSet<Integer> s)
   {
     Iterator it=s.iterator();
    while(it.hasNext())
       System.out.print(it.next()+" ");
// Your code here
   }

   /*erases an element x from the set s */ 
   void erase(LinkedHashSet<Integer> s, int x)
   {
// Your code here
s.remove(x);
   }

   /*returns the size of the set s */
   int size(LinkedHashSet<Integer> s)
   {
       // Your code here
       return s.size();
   }
 
   /*returns 1 if the element x is
   present in set s else returns -1 */
   int find(LinkedHashSet<Integer> s, int x)
   {
// Your code here 
if(s.contains(x))
return 1;
else
return -1;
   }
}