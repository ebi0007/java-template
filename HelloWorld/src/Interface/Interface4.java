package Interface;
// این اینترفیس از دو اینترفیس 2 و3 ارث بری کرده است.
//**وراثت چندگانه**
// متدی که بخواهد این اینترفیس را پیاده سازی کند باید همه متدهای اینترفیس 2و3و4 را پیاده سازی کند.
public interface Interface4 extends Interface2,Interface3 {
    public void function5();
}
