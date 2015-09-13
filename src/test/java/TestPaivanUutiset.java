
import com.mycompany.paivanuutiset.PaivanUutiset;

public class TestPaivanUutiset implements PaivanUutiset {

    @Override
    public String haeSuosituinUutinen() {
        return "suosituin";
    }

    @Override
    public String haeViimeisinUutinen() {
        return "viimeisin";
    }

}
