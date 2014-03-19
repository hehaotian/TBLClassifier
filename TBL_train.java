import java.io.*;
import java.util.*;

public class TBL_train {
    
    public static void main(String[] args) throws IOException {

        String train_path = args[0];
        String model_path = args[1];
        int min_gain = args[2];

        PrintStream model_file = new PrintStream(model_path);
        
        TBL t = new TBL();
    }
}