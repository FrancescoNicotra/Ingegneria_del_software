import org.;
public class TestTorcia{
    private Batteria b;
    private Torcia t;
    @before
    public TestTorcia(){
        b = new Batteria(1);
        t = new Torcia(b);
    }
    @test
    public void quandoCreo_TorciaSpenta(){
        assertTrue(t,)
    }
}