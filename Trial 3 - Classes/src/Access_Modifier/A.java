package Access_Modifier;

public class A {
    public A()
    {
        System.out.println("Constructor of Access_Modifier.A");
        M3();
    }
    public void M1()
    {
        System.out.println("Public Method M1");
    }
    protected void M2()
    {
        System.out.println("Protected Method M2");
    }
    private void M3(){
        System.out.println("Private method M3");
    }
}
