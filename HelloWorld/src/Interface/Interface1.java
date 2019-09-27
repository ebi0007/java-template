package Interface;

public interface Interface1 {

    public void function1();
    public void function2();

    // نکته: از جاوا 8 به بعد هم می توان بدنه متد را در اینترفیس ها پیاده سازی کرد
    // این پیاده سازی به کمک واژه default انجام می شود.
    public default void msg(){
        System.out.println("This method is implemented in INTERFACE 1 .");
    }

}
