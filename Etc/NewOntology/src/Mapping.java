import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by admin on 5/1/14 AD.
 */
public class Mapping {

ArrayList getclass [][] = new ArrayList[100][100];
    ArrayList<ArrayList<String>> classList = new ArrayList<ArrayList<String>>();
ArrayList<String> read = new ArrayList<String>();


    public ArrayList<String> getRead() {
        return this.read;
    }

    public void setRead(ArrayList<String> read) {
        this.read = read;
    }

    public void readFile()  {
        try {
            File file = new File("PharmaceuticalDosageForm.ont");

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                this.read.add(line);

                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            fileReader.close();



        } catch (IOException e) {

            e.printStackTrace();

        }


    }


    public String  getNameStucture(String read){
        String name="";

        for(int i=2;i<read.length();i++){

            name = name + read.charAt(i);



        }

        return name;

    }



    public String getProprety(String read)
    {

        String getpart= "";
        for(int i=4;i<read.length();i++){
            getpart = getpart+ read.charAt(i);
        }
        String attri [] = getpart.split(" ");


        if(getpart.split(" ").length==6){
            return attri[0]+","+attri[1]+","+attri[2].split("\\[")[1].split("\\]")[0]+","+attri[4]+","+attri[5].split("\\<")[1].split("\\>")[0];


        }
        if(getpart.split(" ").length==5){
            if(getpart.split(" ")[3].equals(":")){
              //  System.out.println(read);
                return attri[0]+","+attri[1]+","+attri[2].split("\\[")[1].split("\\]")[0]+","+attri[4]+",null";

            }
            else{

                return attri[0]+","+attri[1]+",null"+","+attri[3]+","+attri[4].split("\\<")[1].split("\\>")[0];

            }


        }

        else {

            return attri[0]+","+attri[1]+",null"+","+attri[3]+",null";

        }


    }

}
