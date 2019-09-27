package Interface;
//این کلاس دو اینترفیس رایاده سازی می کند... این یعنی **وراثت چندگانه.**

//  این کلاس تمام متد دو اینترفیس 2و 3 را پیاده سازی می کند.
// همچنین علاوه بر متدهایی که پیاده سازی کرده خودش هم یک متد با بدنه دارد.

public class Class2 implements Interface2, Interface3{

    public void function3(){
        System.out.println("This is function3.");
    }

    public void function4(){
        System.out.println("This is function4.");
    }
    // متد خودش.
    public void print(){System.out.println("ebi");}
}
