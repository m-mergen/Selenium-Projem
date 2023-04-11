import org.testng.annotations.Test;

public class ders09_EnableKullanarakTestKoşma {

    @Test(enabled = false) // enable bu testi kosmaz
    public void  test1(){
        System.out.println("test1");
    }
    @Test(priority = -5)
    public void  test2(){
        System.out.println("test2");
    }
    @Test
    public void  test3(){
        System.out.println("test3");
    }
    @Test(enabled = false)
    public void  test4(){
        System.out.println("test4");
    }
}
