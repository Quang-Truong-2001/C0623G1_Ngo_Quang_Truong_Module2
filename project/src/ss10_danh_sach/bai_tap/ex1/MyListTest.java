package ss10_danh_sach.bai_tap.ex1;

public class MyListTest {

    public static void main(String[] args) {
        MyList<Person> myList=new MyList<>(5);
        myList.ensureCapacity(4);
        myList.add(new Person("Nguyễn Văn A",45));
        myList.add(new Person("Nguyễn Văn B",41));
        myList.add(new Person("Nguyễn Văn C",43));
        myList.add(new Person("Nguyễn Văn D",43),1);
//        myList.add(new Person("Nguyễn Văn D",43),0);
//        myList.remove(2);
//        MyList<Person> list2=myList.clone();
//        int index=list2.indexOf(new Person("Nguyễn Văn C",43));
//        System.out.println("index = "+index);
//        System.out.println(myList.size());
        for(int i=0; i< myList.size();i++){
            System.out.println(myList.get(i).toString());
        }
//        for(int i=0; i< list2.size();i++){
//            System.out.println(list2.get(i).toString());
//        }

    }
}
