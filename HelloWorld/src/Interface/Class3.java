package Interface;
// این کلاس اینترفیس4 را پیاده سازی کرده است
// خود اینترفیس 4 از دو اینترفیس2و3 ارث بری کرده است
// بنابرین کلاس3 علاوه بر متدهای اینترفیس4 باید متدهای اینترفیس های 2و3 را هم پیاده سازی کند

public class Class3 implements Interface4 {
    public void function3(){ System.out.println("This is function3.");}
    public void function4(){ System.out.println("This is function4.");}
    public void function5(){ System.out.println("This is function5.");}

    public void printn(){ System.out.println("shakhs shekan");}
}
