import java.util.ArrayList;

public class StaplesNeeds {

        public static void main(String[] args) {
            ArrayList<String> ElifveraList = new ArrayList<>();
            ElifveraList.add("Book");
            ElifveraList.add("Pencil");
            ElifveraList.add("Eraser");
            ArrayList<String> AmeliaList = new ArrayList<>();
            AmeliaList.add("Stapler");
            AmeliaList.add("Glue");
            AmeliaList.add("Seizure");
            AmeliaList.add("File");
            ArrayList<String> VehbiList = new ArrayList<>();
            VehbiList.add("Paper");
            VehbiList.add("Crayon");
            ArrayList<ArrayList<String>> StaplesNeedsList = new ArrayList<>();
            StaplesNeedsList.add(AmeliaList);
            StaplesNeedsList.add(ElifveraList);
            StaplesNeedsList.add(VehbiList);

            System.out.println(StaplesNeedsList.get(2));


        }
    }


