package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public static List<String> Task2(List<String> InputList){
        String CurrElement;

        for (int i = 0;i<InputList.size();i++){
            CurrElement = InputList.get(i);
            CurrElement = CurrElement.substring(1);

            if (CurrElement == ""){
                InputList.remove(i);
            } else{
                InputList.set(i, CurrElement);
            }
        }
        return InputList;
    }
}

    