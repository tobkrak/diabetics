package eu.krakowiecki;

/**
 * Created by tobkrak on 20.12.2016.
 */
public class Pomiar {


    private int pomiar;
    private String data;
//    private final String content;
//    private final long id;


    public Pomiar(int pomiar, String data) {
        this.pomiar = pomiar;
        this.data = data;
    }

    public Pomiar(){}


    public int getPomiar() {
        return pomiar;
    }


    public String getData() {
        return data;
    }


}
