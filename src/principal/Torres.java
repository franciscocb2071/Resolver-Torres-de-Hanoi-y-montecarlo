package principal;

/**
 *
 * @author Antonio
 */

import java.util.*;
public class Torres {
    private int torre1;
    private int torre2;
    private int torre3;//esta sera nuestra torre final
    
    //CONTRUCTOR
    public Torres(int t1, int t2, int t3)
    {
        this.torre1 = t1;
        this.torre2 = t2;
        this.torre3 = t3;
    }
    //**************************************************************************
    //METODOS
    //GET
    public int getTorre1()
    {
        return this.torre1;
    }
    public int getTorre2()
    {
        return this.torre2;
    }
    public int getTorre3()
    {
        return this.torre3;
    }
}
