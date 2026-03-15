package edu.cmu.cs.cs214.rec04;

public class InheritanceSortedIntList extends SortedIntList {
    private int totalAdded = 0;
    public InheritanceSortedIntList(){
        super();
    }
    @Override
    public boolean add(int value){
        totalAdded++; // Нэг элемент нэмэгдсэн тул тоолуурыг нэмэгдүүлнэ
        return super.add(value);
    }
    @Override
    public boolean addAll(IntegerList list){
        // Хэрэв эцэг классын addAll нь дотроо add() функцийг дууддаг
        totalAdded += list.size();
        return super.addAll(list);
    }
    public int getTotalAdded(){
        return totalAdded;
    }

}