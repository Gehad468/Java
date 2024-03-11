package task2;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class Class_1{
    public void Methd1() throws MyException
    {
        throw new MyException("method1");
    }
    public void Methd2() throws MyException
    {
        throw new MyException("method1");
    }
    public void Methd3() throws MyException
    {
        throw new MyException("method3");
    }

}

class Mainn {

    public static void main(String[] args) {
        Class_1 c1=new Class_1();
        try{
        c1.Methd1();
        c1.Methd2();
        c1.Methd3();
        }
        catch(MyException e){
            System.out.println("Catched Exception "+e.getMessage());
        }
        finally{
            System.out.println("Finally block executed.");

        }

    }
}
