package Interface;

//نکته: این کلاس از نوع انتزاعی است.
// حالا در اینجا از دو متد اینترفیس1 فقط یکی رو پیاده سازی کرده است.
// حالا اگر کلاسی از این کلاس ارث بری کند، باید سایر متدها که پیاده سازی نشده را پیاده سازی کند.

public abstract class AbsClass implements Interface1{
    public void function1(){System.out.println("this is function1.");}
}
