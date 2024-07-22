package JavaBasic1;

import java.util.ArrayList;

public class BT5_ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 51; i += 2) {
            arrayList.add(i);
        }

        for (int n = 0; n < arrayList.size(); n++) {
            System.out.println(arrayList.get(n));
        }

    }
}
