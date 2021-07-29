package Chapter10.Sequence290;

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size){items = new Object[size];}

    public void add(Object x){
        if(next < items.length){
            items[next++] = x;
        }
    }

    public class SequenceSelector implements Selector{
        private int i = 0;

        public Sequence method(){
            //упражнение 4 стр 293

            return Sequence.this;
        }
        @Override
        public boolean end(){return i == items.length;}

        @Override
        public Object current(){return items[i];}

        @Override
        public void next() {
            if(i < items.length)
                i++;
        }
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public class Stroka{
        //Упражнение 2 стр 292
        String stroka = "Ivan";

        @Override
        public String toString() {
            return stroka;
        }
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i <10;i++){
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();

        while (!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
        Stroka str = sequence.new Stroka();
        Stroka str1 = sequence.new Stroka();

        System.out.println(str);
        System.out.println(str1);

    }
}
