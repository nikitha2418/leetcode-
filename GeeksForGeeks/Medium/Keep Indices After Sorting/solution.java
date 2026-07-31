class Sorting {
    public ArrayList<ArrItem> sortedWithIndices(int arr[]) {
        ArrayList<ArrItem> list = new ArrayList<ArrItem>();
        for(int i=0;i<arr.length;i++){
            ArrItem o1 = new ArrItem(arr[i], i);
            list.add(o1);
        }
        
        Collections.sort(list, (a, b)->{
            if(a.item < b.item)
                return -1;
            if((a.item == b.item) && (a.index < b.index))    
                return -1;
            return 1;    
        });
        return list;
    }
}