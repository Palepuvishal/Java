class Gen<T>{
    T obj;

    Gen<T> (T O){
        this.obj=O;
    }

    T getobj(){
        return obj;
    }

    T getType(){
        System.out.println("The class type "+obj.getClass);
    }
}

class GenericMain{
    public static void main(String args[]){
        Gen<Integer> Iob = new Gen<Integer>(12);
        int i = Iob.getobj();
        System.out.println("the variable is "+i);
        Iob.getType();
    }
}