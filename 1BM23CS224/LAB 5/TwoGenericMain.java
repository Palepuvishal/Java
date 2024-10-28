class Gen<T1,T2>{
    T1 obj1;
    T2 obj2;

    Gen<T1>(T1 O1){
        this.obj1=O1;
    }

    Gen<T2>(T2 O2){
        this.obj2=O1;
    }


    T1 getobj1(){
        return obj1;
    }

    T2 getobj2(){
        return obj2;
    }

    T1 getType(){
        System.out.println("The class type of obj1 : "+obj1.getClass);
        System.out.println("The class type of obj2 : "+obj2.getClass);

    }
}

class GenericMain{
    public static void main(String args[]){
        Gen<Integer,Double> Iob = new Gen<Integer,Double>(12,56.12);
        int i = Iob.getobj1();
        double d = Iob.gerobj2();
        System.out.println("the variable is "+i);
        System.out.println("the variable is "+d);
        Iob.getType();
    }
}