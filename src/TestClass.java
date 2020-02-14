public class TestClass {
    int a;
    int b;

    public TestClass(int x, int y){
        x = 2;
        this.a = x;
        y = y*2;
        this.b = y;
    }

    public void Foo(){
        int x = 5;
        TestClass t = new TestClass(x, 10);
    }
}
