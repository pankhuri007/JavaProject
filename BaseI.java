public interface BaseI {
    void method();}
    class BaseC{
        public void method(){
            System.out.println("A");
        }
    }
    class ImlC extends BaseC implements BaseI{
    public static void main(String[] args){
        (new ImlC()).method();
    }
    }

