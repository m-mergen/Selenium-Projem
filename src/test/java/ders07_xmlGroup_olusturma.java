import org.testng.annotations.Test;

public class ders07_xmlGroup_olusturma {

    @Test(groups = {"Grup A"})
    public void  test1(){
        System.out.println("test1");
    }
    @Test(groups = {"Grup B"})
    public void  test2(){
        System.out.println("test2");
    }
    @Test(groups = {"Grup A , Grup B"})
    public void  test3(){
        System.out.println("test3");
    }
    @Test(groups = {"Grup C"})
    public void  test4(){
        System.out.println("test4");
    }
}
