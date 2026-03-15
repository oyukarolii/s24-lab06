package edu.cmu.cs.cs214.rec04;

public class DelegationSortedIntList implements IntegerList {
    private SortedIntList list;
    private int totalAdded = 0;

    public DelegationSortedIntList(){
        this.list = new SortedIntList();

    }
    @Override
    public boolean add(int value){
        totalAdded++;
        return list.add(value);// Үйлдлийг дотоод объект руу дамжуулах
    }
    // IntegerList интерфэйсийн бусад шаардлагатай аргуудыг дамжуулах (Delegation)
    @Override
    public boolean addAll(IntegerList other){
        totalAdded += other.size();
        return list.addAll(other);
    }
    public int getTotalAdded(){
        return totalAdded;
    }
    @Override
    public int get(int index){
        return list.get(index);
    }
    @Override
    public int size(){
        return list.size();
    }

    @Override
    public boolean removeAll(IntegerList other) {
        return list.removeAll(other);
    }

}